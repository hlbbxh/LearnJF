<!DOCTYPE html>
<html>
<head lang="en">
    <meta charset="UTF-8" />
    <title></title>
</head>
<script type="text/javascript" src="/static/js/jquery.min.js"></script><#-- 新 项目 jq 别忘记了 -->
<script type="text/javascript" src="/static/js/vue.min.js"></script><#-- vue js -->
<script type="text/javascript" src="/static/js/learnVue.js"></script><#-- vue js -->
<body>
	<center>
		<h3>学习Vue前端框架</h3>
		<p>1.把json数据放入元素中</p>
		<div id="learn1_1">
			  {{gareen.name}}
		</div>
	</center>
	<script>
		//准备数据
		var gareen = {"name":"盖伦","hp":616};
		//通过vue.js 把数据和对应的视图关联起来
		new Vue({
			  el: '#learn1_1',
			  data: {
			    message: gareen
			  }
		})
	</script>
	
	<hr/>
	<center id="learn1_2">
	  <p>2.点击事件计算点击次数-监听事件</p>
	  <div>一共点击了{{clickNumber}}次</div>  
	  <button v-on:click="count">点击</button>
	  <p>也可以使用-@click方式，点击这两个都会添加</p>
  	  <button @click="count">点击</button>
	<center>

</body>
</html>