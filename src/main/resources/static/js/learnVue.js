$(function(){
	//第一章 绑定 值
	new Vue({ // 注意 V大写
		el: '#learn1_1',//容器div
		data: {
			message: 'Hello world',//数据  取值 就直接 用message取值    <p>{{message}}</p>  两个{{}}花括号取值
			message_code: '<h1>hello Vue</h1>'  //输出代码  <p v-html="message_code"></p> 
		}
	});
});

