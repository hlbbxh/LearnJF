//绑定事件
$(function(){
	new Vue({
	      el: '#learn1_2',
	      data: {
	    	  clickNumber:0
	      },
	      methods:{
	    	  count: function(){
	    		  this.clickNumber++;
	    	  }
	      }
	    })
});