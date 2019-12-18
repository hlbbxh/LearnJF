<!DOCTYPE html>
<html>
<head lang="en">
    <meta charset="UTF-8" />
    <title></title>
</head>
<script type="text/javascript" src="/static/js/jquery.min.js"></script><#-- 新 项目 jq 别忘记了 -->
<script type="text/javascript" src="/static/js/vue.min.js"></script><#-- vue js -->
<script type="text/javascript" src="/static/js/learnVue.js"></script><#-- vue js -->
<link rel="stylesheet" href="/static/css/vue.css">
<body>
	<h3>学习Vue前端框架</h3>
	<div>
		<p>1.Vue.js 模板语法</p>
		<div id="learn1_1">
			<p>{{message}}</p><#-- 文本 -->
			<p v-html="message_code"></p><#-- html -->
		</div>
	</div>
</body>
</html>