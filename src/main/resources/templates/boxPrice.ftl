<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml" xmlns:th="http://www.thymeleaf.org"
      xmlns:sec="http://www.thymeleaf.org/thymeleaf-extras-springsecurity3">
<head>
    <title>价格查询</title>
    <meta name="viewport" content="width=device-width,minimum-scale=1.0,maximum-scale=1.0"/>

    <link rel="stylesheet" href="/bootstrap/css/bootstrap.css">
    <link rel="stylesheet" href="/bootstrap/css/bootstrap-grid.css">
    <link rel="stylesheet" href="/bootstrap/css/bootstrap-reboot.css">
    <script language="JavaScript" src="/bootstrap/js/jquery-3.3.1.min.js"></script>
    <script language="JavaScript" src="/bootstrap/js/bootstrap.js"></script>
    <script language="JavaScript" src="/bootstrap/js/bootstrap.bundle.js"></script>
</head>
<body>
<div id="priceDiv" class="container">
    <h3>花格价格</h3>
    <div class="form-group form-row">
        <div class="col-md-4 mb-2">
            <label for="validationServer01">长度 单位:厘米</label>
            <input type="text" name="length" class="form-control area-part" id="lengthInput" placeholder="请输入长度" required>
        </div>
        <div class="col-md-4 mb-2">
            <label for="validationServer01">宽度 单位:厘米</label>
            <input type="text" name="width" class="form-control area-part" id="widthInput" placeholder="请输入宽度" required>
        </div>
    </div>

    <div class="form-group row">
        <label for="areaInput" class="col-sm-2 col-form-label">面积(平方米)</label>
        <div class="col-sm-10">
            <input type="text" readonly name="area" class="form-control-plaintext" id="areaInput" value="0">
        </div>
    </div>
    <#if inner_box ?? && (inner_box?size > 0)>
        <div class="form-group">
            <label for="innerBoxSelect">格子内空</label>
            <select id="innerBoxSelect" class="form-control" name="innerBox">
                <#list inner_box as innerItem>
                    <option value="${innerItem.dictValue}">${innerItem.dictName}</option>
                </#list>
            </select>
        </div>
    </#if>
    <#if outer_box ?? && (outer_box?size > 0)>
        <div class="form-group">
            <label for="outerBoxSelect">外框</label>
            <select id="outerBoxSelect" class="form-control" name="outerBox">
                    <#list outer_box as outerItem>
                        <option value="${outerItem.dictValue}">${outerItem.dictName}</option>
                    </#list>
            </select>
        </div>
    </#if>
    <#if prod_style ?? && (prod_style?size > 0)>
        <div class="form-group">
            <label for="prodStyleSelect">款式</label>
            <select id="prodStyleSelect" class="form-control" name="prodStyle">
                <#list prod_style as prodStyleItem>
                    <option value="${prodStyleItem.dictValue}">${prodStyleItem.dictName}</option>
                </#list>
            </select>
        </div>
    </#if>
    <#if material ?? && (material?size > 0)>
        <div class="form-group">
            <label for="materialSelect">材质</label>
            <select id="materialSelect" class="form-control" name="material">
                <#list material as materialItem>
                    <option value="${materialItem.dictValue}">${materialItem.dictName}</option>
                </#list>
            </select>
        </div>
    </#if>
    <div class="form-group row">
        <label for="numInput" class="col-sm-2 col-form-label">数量</label>
        <div class="col-sm-10">
            <input type="number" name="number" class="form-control" id="numInput" value="1">
        </div>
    </div>
    <div class="form-group row">
        <div class="col-sm-10">
            <button type="button" id="totalPriceBtn" class="btn btn-primary">计算总价</button>
        </div>
    </div>
    <div class="card">
        <div class="card-header">
            总价(元)
            <div id="alertDiv" >

            </div>
        </div>
        <div class="card-body">
            <i style="color: red;" id="totalPriceI" class="text-dark"></i>
        </div>
    </div>
</div>




<script>
    $(document).ready(function () {
        function computeArea(length, width){
            if (length == null || length == 0 || width == null || width == 0){
                return;
            } else {
                return length * width / 10000;
            }
        }

        $(".area-part").on('change', function (e) {
            var width = $("#widthInput").val();
            var length = $("#lengthInput").val();
            var areaResult = computeArea(length, width);
            $("#areaInput").val(areaResult);
        })

        $("#totalPriceBtn").on('click',function (e) {
            var area = $("#areaInput").val();
            var number = $("#numInput").val();
            var innerBox = $("#innerBoxSelect").val();
            var outerBox = $("#outerBoxSelect").val();
            var material = $("#materialSelect").val();
            var prodStyle = $("#prodStyleSelect").val();
            $.ajax({
                type:"POST",
                url:"/price/box",
                contentType:"application/json;charset=utf-8",
                data:JSON.stringify({
                    area:area,
                    number:number,
                    innerBox: innerBox,
                    outerBox: outerBox,
                    prodStyle: prodStyle,
                    material: material
                }),
                dataType:"json",
                success:function (response) {
                    var alertHtml = '';
                    if (response.code == 200){
                        alertHtml = '<div class="alert alert-primary" role="alert">'+response.data+'</div>';
                    } else {
                        alertHtml = '<div class="alert alert-danger" role="alert">'+response.message+'</div>';
                    }
                    $("#alertDiv").html(alertHtml);
                    $(".alert").alert();
                },
                error:function (response) {
                    $("#alertDiv").html(response.message);
                    $("#alertDiv").css("alert alert-danger");
                    $("#alertDiv").alert();
                }
            })
        });
    })
</script>
</body>
</html>