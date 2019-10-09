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
