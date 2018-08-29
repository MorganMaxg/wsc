<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml" xmlns:th="http://www.thymeleaf.org"
      xmlns:sec="http://www.thymeleaf.org/thymeleaf-extras-springsecurity3">
<head>
    <title>价格查询</title>
</head>
<body>
<div id="priceDiv">
    规&nbsp;&nbsp;格&nbsp;&nbsp;<input type="text" name="length" style="width: 40%" placeholder="长度">cm
    &nbsp;&nbsp;&nbsp;&nbsp;
    <input type="text" name="width" style="widows:40%;" placeholder="宽度">cm
    &nbsp;&nbsp;&nbsp;&nbsp;
    <br>
    面&nbsp;&nbsp;积&nbsp;&nbsp;<i name="area" style="color: red"></i>&nbsp;&nbsp;&nbsp;&nbsp;平方厘米

    格子内空&nbsp;&nbsp;<select name="innerBox">
                <option value="1">3公分到6公分</option>
                <option value="2">6公分到9公分</option>
                <option value="3">9公分到12公分</option>
            </select>
    <br>
    外框&nbsp;&nbsp;
    <select name="outerBox">
        <option value="1">无</option>
        <option value="2">4*3</option>
        <option value="3">5*4</option>
        <option value="4">6*4</option>
        <option value="5">8*5</option>
    </select>
    <br>
    款式&nbsp;&nbsp;
    <select name="prodStyle">
        <option value="1">常规区</option>
        <option value="2">异形区</option>
    </select>
    <br>
    材质&nbsp;&nbsp;
    <select name="material">
        <option value="1">松木</option>
        <option value="2">水曲柳</option>
        <option value="3">菠萝格</option>
    </select>
    <br>
    数&nbsp;&nbsp;量<input type="text" name="number" placeholder="数量">
    <br>
</div>
<div id="priceDiv">
    总价:<i></i>&nbsp;&nbsp;&nbsp;&nbsp;元
</div>
<div>
    <button type="button">计算总价</button>
</div>
</body>
</html>