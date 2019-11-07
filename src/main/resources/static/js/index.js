
/*
 * 组装list数据发送json的ajax请求
 * */
function sendAjax() {
	var UserFileList = new Array(); // 声明集合
	$('.fileUpload').each(function() { // 循环判断
		var fileName = $(this).find("input[name='fileName']").val();
		var fileUrl = $(this).find("input[name='fileUrl']").val();

		var UserFile = new Object();// 组装数据 相当于是实体
		UserFile.fileName = fileName; // 属性
		UserFile.fileUrl = fileUrl;// 属性
		UserFileList.push(UserFile);// 放入数据

	});

	$.ajax({
		type : 'POST',
		url : '/test/saveUserFile',
		data : JSON.stringify(UserFileList),// 转换数据 json
		dataType : 'json',
		contentType : "application/json; charset=utf-8",
		async : false,
		cache : false,
		success : function(data) {// 成功
			if (data.success) {
				alert(data.success, 'success');
			} else if (data.fail) {
				alert(data.fail);
			}
		},
		error : function() { // 失败
			alert('系统内部异常！');
		}
	});
}

/*
 * 使用js生成条形码   使用 JsBarcode.all.min.js
 * */
function barCodeLine(){
	
	//这是条形码样式
    var barCodeConfig = {
        height: 72,
        width: 1.5,
        fontSize: 16,
        lineColor: "#000000"
		// displayValue:true, // 是否在条形码上下方显示文字
		// fontOptions:"bold italic", // 使文字加粗体或变斜体
		// font:"fantasy", // 设置文本的字体
		// textAlign:"left", // 设置文本的水平对齐方式
		// textPosition:"top", // 设置文本的垂直位置
		// textMargin:5, // 设置条形码和文本之间的间距
		// fontSize:15, // 设置文本的大小
		// background:"#eee", // 设置条形码的背景
		// lineColor:"#2196f3", // 设置条和文本的颜色。
		// margin:15 // 设置条形码周围的空白边距
    };
   
    $(".barcode").each(function () {//获取所有的图片
        var barCode = $(this).attr('barCode');//获取文件编号
        var barCodeId = $(this).attr('id');//获取id 因为要按照id进行定位元素
        if (barCode && barCode != 'underfined' && barCode != null && barCode != undefined && barCode != '') {
        	JsBarcode("#" + barCodeId, barCode, barCodeConfig);
        	// 图片转换          转换图片的id   转换的源码   转换的配置
        };
    });

}



/*
 * 格式化时间，但是并不知道怎么用，pdf文件名称名称加时间戳用到了 在下面
 * fmt:20191011170726
 * 前：Fri Oct 11 2019 17:07:06 GMT+0800 (中国标准时间)
 * */
Date.prototype.Format = function (fmt) {
    var o = {
        "M+": this.getMonth() + 1, //月份 
        "d+": this.getDate(), //日 
        "H+": this.getHours(), //小时 
        "m+": this.getMinutes(), //分 
        "s+": this.getSeconds(), //秒 
        "q+": Math.floor((this.getMonth() + 3) / 3), //季度 
        "S": this.getMilliseconds() //毫秒 
    };
    if (/(y+)/.test(fmt)) fmt = fmt.replace(RegExp.$1, (this.getFullYear() + "").substr(4 - RegExp.$1.length));
    for (var k in o)
        if (new RegExp("(" + k + ")").test(fmt)) fmt = fmt.replace(RegExp.$1, (RegExp.$1.length == 1) ? (o[k]) : (("00" + o[k]).substr(("" + o[k]).length)));
    return fmt;
}

/*
 * 点击按钮下载当前页面的pdf文件
 * 注意事项 两个 js 
 * background:'#FFF'背景色 
 * */
function downPDF(){
	// var pdfname = new Date(); // Fri Oct 11 2019 17:07:06 GMT+0800 (中国标准时间)
	var pdfname = new Date().Format("yyyyMMddHHmmss"); // 20191011170726  时间
    html2canvas(document.body,{//pdf函数
    	background:'#FFF',//背景颜色 默认是黑色的
        onrendered: function (canvas) {
            //返回图片URL，参数：图片格式和清晰度(0-1)
            var pageData = canvas.toDataURL('image/jpeg', 1.0);
            //方向默认竖直，尺寸ponits，格式a4【595.28,841.89]
            var pdf = new jsPDF('', 'pt', 'a4');
            //需要dataUrl格式
            pdf.addImage(pageData, 'JPEG', 0, 0, 595.28, 592.28 / canvas.width * canvas.height);
            pdf.save("test-" + pdfname + '.pdf');
        }
    });
}

//生成二维码
function qrCodePro(){
	var str = $("#inputString").val();
	$("#imagesRerwei").find('canvas').remove();
	jQuery("#imagesRerwei").qrcode(str);
}
