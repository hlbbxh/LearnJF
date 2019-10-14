<!DOCTYPE html>
<html>
<head lang="en">
    <meta charset="UTF-8" />
    <title></title>
</head>

<script type="text/javascript" src="/static/js/index.js"></script><#-- 自定义脚本 -->
<script type="text/javascript" src="/static/js/jquery.min.js"></script><#-- 新 项目 jq 别忘记了 -->

<body>
	<center>
		<h2>FreeMarker模板引擎</h2>
		
		<br/>
		<br/>
		
		<p>使用ajax请求组装list数据为json转换实体类</p>
		<div class="fileUpload">
			<input type="text" name="fileName" />
			<input type="text" name="fileUrl" />
		</div>
		<div class="fileUpload">
			<input type="text" name="fileName" />
			<input type="text" name="fileUrl" />
		</div>
		
		<input type="button" value="发送请求" onclick="sendAjax();" />
		<br/>
		
		<p>使用指令的方式进行循环下拉框</p>
		<#assign pageSizeList = [20,40,60,80,100]>
		
        <select id="pageLimit" style="width:100px;">     
	        <#list pageSizeList as pageSize>
	             <#if pageSize == 100>
	                  <option selected="selected" value="100">100</option><#-- 默认选中100的  或者选择已经保存的 读取原来的数据 -->
	             <#else>
	                  <option value="${pageSize}">${pageSize}</option>
	             </#if>
	        </#list>
	    </select>
	    
	    <p>使用指令直接获取properties的属性值</p>
	    ${springMacroRequestContext.getMessage("staff")}
	    
	</center>
</body>
</html>