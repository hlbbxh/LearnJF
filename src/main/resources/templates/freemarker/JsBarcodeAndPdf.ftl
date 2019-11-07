<!DOCTYPE html>
<html>
<head lang="en">
    <meta charset="UTF-8" />
    <title></title>
</head>
<script type="text/javascript" src="/static/js/jquery.min.js"></script><#-- 新 项目 jq 别忘记了 -->
<script type="text/javascript" src="/static/js/JsBarcode.all.min.js"></script><#-- 单号生成条形码的js -->
<script type="text/javascript" src="/static/js/jsPdf.debug.js"></script><#-- 生成pdf的js -->
<script type="text/javascript" src="/static/js/html2canvas.js"></script><#-- 生成pdf的js -->
<script type="text/javascript" src="/static/js/index.js"></script><#-- 自定义脚本 -->
<script type="text/javascript" src="/static/js/jquery.qrcode.min.js"></script><#-- 生成pdf的js -->
<body>
	<center>
		<p>使用js生成条形码进行页面pdf下载</p>
		<#-- 循环解析list数据 -->
		<#if listUserfile?? && (listUserfile?size gt 0)><#-- 判断list长度 -->
			<#list listUserfile as UserFile> <#-- 取出list集合 中的对象 -->
				<p>文件编号：${UserFile.id!''}</p> <#-- 对象的属性 -->
				<img id="barcode_${UserFile.id!''}" class="barcode" barCode="${UserFile.id!''}" />
			</#list>
		</#if>
		<br/>
		<input type="button" value="点击生成条形码" onclick="barCodeLine();" />
		<input type="button" value="点击生成PDF页面" onclick="downPDF();" />
		<hr>
		<input type="input" id="inputString" />
		<div id="imagesRerwei">
			
		</div>
		<input type="button" value="点击生成输入框的二维码" onclick="qrCodePro();" />
	</center>
	
</body>
</html>