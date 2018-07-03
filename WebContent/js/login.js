;$(function(){
	$("#login").click(function(){
		toggleLoginDiv()
	});
	$("form input:lt(2)").blur(function(){
		var obj = $(this);
		var val = obj.val();
		var reg = obj.attr("reg");
		var tip = obj.attr("tip");
		var regObj = new RegExp(reg);
		if(!regObj.test(val)){
			obj.parent().parent().next().children(".check").html(tip);         
		}else{
			obj.parent().parent().next().children(".check").html("");       
		}
	});
});
function toggleLoginDiv(){
	$("#loginDiv").toggle();
}
function myfocus_uname(obj){
	var val = $(obj).val();
	if(val == "请输入11位手机号"){
		$(obj).val("");
		$(obj).removeClass();
	}
	
}
function myblur_uname(obj){
	if($(obj).val() == ""){
		$(obj).val("请输入11位手机号");
		$(obj).addClass("uname");
	}
}
function myfocus_upassword(obj){
	var val = $(obj).val();
	if(val == "8-16位英文或数字或下划线"){
		$(obj).val("");
		$(obj).removeClass();
		$(obj).attr("type","password");
	}
	
}
function myblur_upassword(obj){
	if($(obj).val() == ""){
		$(obj).attr("type","text");
		$(obj).val("8-16位英文或数字或下划线");
		$(obj).addClass("upassword");
	}
}