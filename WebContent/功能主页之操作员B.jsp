<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set var="path" value="${pageContext.request.contextPath }"></c:set>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="icon" href="${pageContext.request.contextPath }/img/favicon.ico" type="image/x-icon" />
<link rel="shortcut icon" href="${pageContext.request.contextPath }/img/favicon.ico"
	type="image/x-icon" />
<title>志东驾校</title>
<style type="text/css">
* {
	margin: 0;
	padding: 0;
}

body {
	background: #E4E6CE;
}

.left {
	width: 20%; /*这里是百分比或者像素值，对应下面的center就是百分比或者像素值*/
	height: 95%;
	background: rgba(55, 181, 248, .5);
	float: left;
	border-radius: 20px;
	margin: 14px 16px;
}

.right {
	width: 75%; /*这里是百分比或者像素值，对应下面的center就是百分比或者像素值*/
	height: 95%;
	background: white;
	float: right;
	border-radius: 20px;
	margin: 14px 16px;
}

a {
	text-decoration: none;
}
table{
	margin:auto;
}
.functionItem{
	color:purple;
	font-size: 16px;
}
.functionItem:hover{
	color:yellow;
}
.logout{
	color:blue;
	font-size: 16px;
}
.logout:hover{
	color:red;
}
</style>
<script type="text/javascript" src="${path }/js/jquery.js"></script>
<script type="text/javascript">
	function displayNoneAll(){
		$("#车辆信息维护").hide();
		$("#出车记录").hide();
		$("#modifyPassword").hide();
		$("#vehicleFee").hide();
		$("#studentFee").hide();
	}
	function showVehicleInfo(){
		displayNoneAll();
		$("#车辆信息维护").show();
	}
	function showVehicleOutRecord(){
		displayNoneAll();
		$("#出车记录").show();
	}
	function showModifyPassword(){
		displayNoneAll();
		$("#modifyPassword").show();
	}
	function showVehicleFee(){
		displayNoneAll();
		$("#vehicleFee").show();
	}
	function showStudentFee(){
		displayNoneAll();
		$("#studentFee").show();
	}
</script>
</head>
<body>
	<div id="function">
		<div class="left">
			<table>
				<tr><td style="color:#E4E6CE;"><span style="color:black;">欢迎您：</span><s:property value="#application.existPerson.phoneNum"/>&nbsp;&nbsp;<a href="${path }/网站首页.jsp" class="logout">退出</a> </td></tr>
			</table><hr>
			<h2 style="margin: 5px auto;text-align:center;">操作员</h2>
			<hr>
			<table>
				<tr>
					<td><a href="javascript:void(0);">车辆管理</a></td>
				</tr>
				<tr>
					<td><a class="functionItem" href="javascript:void(0);" onclick="showVehicleOutRecord()">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;出车记录</a></td>
				</tr>
				<tr>
					<td><a class="functionItem" href="javascript:void(0);" onclick="showVehicleInfo()">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;车辆信息维护</a></td>
				</tr>
				<tr>
					<td><a href="javascript:void(0);">财务管理</a></td>
				</tr>
				<tr>
					<td><a class="functionItem" href="javascript:void(0);" onclick="showVehicleFee()">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;车辆开销</a></td>
				</tr>
				<tr>
					<td><a class="functionItem" href="javascript:void(0);" onclick="showStudentFee()">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;学员缴费退费</a></td>
				</tr>
				<tr>
					<td><a href="javascript:void(0);">个人管理</a></td>
				</tr>
				<tr>
					<td><a class="functionItem" href="javascript:void(0);" onclick="showModifyPassword()">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;修改密码</a></td>
				</tr>
			</table>
		</div>
		<div class="right">
			<div id="车辆信息维护" style="width:100%;height:100%;display:none;">
				<iframe src="${path }/车辆信息维护.jsp" width="100%" height="100%" scrolling="no" frameborder="0"> </iframe>
			</div>
			<div id="出车记录" style="width:100%;height:100%;display:none;">
				<iframe src="${path }/出车记录.jsp" width="100%" height="100%" scrolling="no" frameborder="0"> </iframe>
			</div>
			<div id="modifyPassword" style="width:100%;height:100%;display:none;">
				<iframe src="${path }/modifyPasswordOperatorB.jsp" width="100%" height="100%" scrolling="no" frameborder="0"> </iframe>
			</div>
			<div id="vehicleFee" style="width:100%;height:100%;display:none;">
				<iframe src="${path }/车辆开销.jsp" width="100%" height="100%" scrolling="no" frameborder="0"> </iframe>
			</div>
			<div id="studentFee" style="width:100%;height:100%;display:none;">
				<iframe src="${path }/学员缴费退费.jsp" width="100%" height="100%" scrolling="no" frameborder="0"> </iframe>
			</div>
		</div>
	</div>
	<script type="text/javascript">
		var screenHeight = document.documentElement.clientHeight;
		var functionObj = document.getElementById("function");
		functionObj.style.height = screenHeight + "px";
	</script>
</body>

</html>