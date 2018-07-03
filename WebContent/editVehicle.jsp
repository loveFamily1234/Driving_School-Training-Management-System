<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="icon" href="${pageContext.request.contextPath }/img/favicon.ico" type="image/x-icon" />
<link rel="shortcut icon" href="${pageContext.request.contextPath }/img/favicon.ico"
	type="image/x-icon" />
<title>修改车辆信息</title>
<style>
body{
	text-align: center;
}
.table2{
	border: 2px solid #0094ff;
	width: 550px;
	text-align: left;
}
.table2 tr td {
	border: 1px solid #ccc;
}
</style>
</head>
<body>
	<table border="0" width="100%">
		<tr>
			<td align="center" style="font-size: 24px; color: #666">修改车辆信息</td>
		</tr>
		<tr>
			<td align="right" > <a href="javascript:history.go(-1)">回退</a></td>
		</tr>
	</table>
	<br/>
	<s:form action="vehicle_update" method="post" namespace="/" theme="simple">
		<table align="center" class="table2">
			<tr>
				<td>适用驾照类型-车牌号：</td><td><s:textfield style="background:#ccc;" name="plateNumber" value="%{model.plateNumber}" readonly="true"/></td>
			</tr>
			<tr>
				<td>品牌型号：</td><td><s:textfield name="brand" value="%{model.brand}"/></td>
			</tr>
			<tr>
				<td>开始使用日期：</td><td><s:textfield name="startTime" value="%{model.startTime}"/></td>
			</tr>
			<tr>
				<td>跟随教练员：</td>
				<td><s:select name="teacherID" value="%{model.teacherID}" list="list" listKey="IDnumber" listValue="teacherName" headerKey="" headerValue="--请选择--"></s:select></td>
			</tr>
			<tr>
				<td align="center" ><input type="submit" value="提交" style="width:80px;"/></td>
				<td align="center" ><input type="reset" value="重置" style="width:80px;"/></td>
			</tr>
		</table>
	</s:form>
</body>
</html>