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
		$("#学员报名").hide();
		$("#学员结业").hide();
		$("#学员退学").hide();
		$("#学员信息维护").hide();
		$("#教练信息维护").hide();
		$("#teacherQueryStu").hide();
		$("#teacherQueryVehicle").hide();
		$("#modifyPassword").hide();
	}
	function showStuSignUp(){
		displayNoneAll();
		$("#学员报名").show();
	}
	function showStuGraduation(){
		displayNoneAll();
		$("#学员结业").show();
	}
	function showStuLeaveSchool(){
		displayNoneAll();
		$("#学员退学").show();
	}
	function showStuInfo(){
		displayNoneAll();
		$("#学员信息维护").show();
	}
	function showTeacherInfo(){
		displayNoneAll();
		$("#教练信息维护").show();
	}
	function showTeacherQueryStu(){
		displayNoneAll();
		$("#teacherQueryStu").show();
	}
	function showTeacherQueryVehicle(){
		displayNoneAll();
		$("#teacherQueryVehicle").show();
	}
	function showModifyPassword(){
		displayNoneAll();
		$("#modifyPassword").show();
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
					<td><a href="javascript:void(0);">学员管理</a></td>
				</tr>
				<tr>
					<td><a class="functionItem" href="javascript:void(0);" onclick="showStuSignUp()">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;学员报名</a></td>
				</tr>
				<tr>
					<td><a class="functionItem" href="javascript:void(0);" onclick="showStuGraduation()">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;学员结业</a></td>
				</tr>
				<tr>
					<td><a class="functionItem" href="javascript:void(0);" onclick="showStuLeaveSchool()">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;学员退学</a></td>
				</tr>
				<tr>
					<td><a class="functionItem" href="javascript:void(0);" onclick="showStuInfo()">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;学员信息维护</a></td>
				</tr>
				<tr>
					<td><a href="javascript:void(0);">教练管理</a></td>
				</tr>
				<tr>
					<td><a class="functionItem" href="javascript:void(0);" onclick="showTeacherInfo()">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;教练信息维护</a></td>
				</tr>
				<tr>
					<td><a class="functionItem" href="javascript:void(0);" onclick="showTeacherQueryStu()">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;教练所带学员的信息查询</a></td>
				</tr>
				<tr>
					<td><a class="functionItem" href="javascript:void(0);" onclick="showTeacherQueryVehicle()">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;教练所用车辆的信息查询</a></td>
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
			<div id="学员报名" style="width:100%;height:100%;display:none;">
				<iframe src="${path }/学员报名.jsp" width="100%" height="100%" scrolling="no" frameborder="0"> </iframe>
			</div>
			<div id="学员结业" style="width:100%;height:100%;display:none;">
				<iframe src="${path }/学员结业.jsp" width="100%" height="100%" scrolling="no" frameborder="0"> </iframe>
			</div>
			<div id="学员退学" style="width:100%;height:100%;display:none;">
				<iframe src="${path }/学员退学.jsp" width="100%" height="100%" scrolling="no" frameborder="0"> </iframe>
			</div>
			<div id="学员信息维护" style="width:100%;height:100%;display:none;">
				<iframe src="${path }/学员信息维护.jsp" width="100%" height="100%" scrolling="no" frameborder="0"> </iframe>
			</div>
			<div id="教练信息维护" style="width:100%;height:100%;display:none;">
				<iframe src="${path }/教练信息维护.jsp" width="100%" height="100%" scrolling="no" frameborder="0"> </iframe>
			</div>
			<div id="teacherQueryStu" style="width:100%;height:100%;display:none;">
				<iframe src="${path }/teacherQueryStu.jsp" width="100%" height="100%" scrolling="no" frameborder="0"> </iframe>
			</div>
			<div id="teacherQueryVehicle" style="width:100%;height:100%;display:none;">
				<iframe src="${path }/teacherQueryVehicle.jsp" width="100%" height="100%" scrolling="no" frameborder="0"> </iframe>
			</div>
			<div id="modifyPassword" style="width:100%;height:100%;display:none;">
				<iframe src="${path }/modifyPasswordOperatorA.jsp" width="100%" height="100%" scrolling="no" frameborder="0"> </iframe>
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