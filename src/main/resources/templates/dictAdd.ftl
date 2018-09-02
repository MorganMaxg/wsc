<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml" xmlns:th="http://www.thymeleaf.org"
      xmlns:sec="http://www.thymeleaf.org/thymeleaf-extras-springsecurity3">
<head>
    <title>新增字典</title>
    <link rel="stylesheet" href="/static/bootstrap/css/bootstrap.css">
    <link rel="stylesheet" href="/static/bootstrap/css/bootstrap-grid.css">
    <link rel="stylesheet" href="/static/bootstrap/css/bootstrap-reboot.css">
    <script language="JavaScript" src="/static/bootstrap/js/jquery-3.3.1.min.js"></script>
    <script language="JavaScript" src="/static/bootstrap/js/bootstrap.js"></script>
    <script language="JavaScript" src="/static/bootstrap/js/bootstrap.bundle.js"></script>
</head>
<body>
<div>
    <div id="dictAddAlert" class="alert alert-primary" role="alert">

    </div>
</div>
<div id="dictInfo">
        <div class="form-group">
            <input type="text" class="form-control" id="dictKeyInput" name="dictKey" placeholder="DICT_KEY" required="true">
        </div>
        <div class="form-group">
            <input type="text" class="form-control" id="dictNameInput" name="dictName" placeholder="DICT_NAME" required="true">
        </div>
        <button type="button" id="saveDictBtn" class="btn btn-primary">保存</button>
</div>
<script language="JavaScript">
    $(document).ready(function () {
        $("#saveDictBtn").onclick(function (e) {
            var dictKey = $("#dictKeyInput").val();
            var dictName = $("#dictNameInput").val();
            if (dictKey == null || dictName == null) {
                alert("入参不正确");
            }
            $.post("/dict/save", {
                dictKey:dictKey,
                dictName:dictName
            }, function (response){
                alert(response);
                $("#dictAddAlert").html(response);
            })
        })
    })
</script>
</body>
</html>