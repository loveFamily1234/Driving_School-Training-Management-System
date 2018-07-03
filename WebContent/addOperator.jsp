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
<title>添加操作员信息</title>
<style>
body{
	text-align: center;
}
.table2{
	border: 2px solid #0094ff;
	width: 300px;
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
			<td align="center" style="font-size: 24px; color: #666">添加操作员信息</td>
		</tr>
		<tr>
			<td align="right" > <a href="javascript:history.go(-1)">回退</a></td>
		</tr>
	</table>
	<br/>
	<s:form action="operator_save" method="post" namespace="/" theme="simple">
		<table align="center" class="table2">
			<tr>
				<td>手机号：</td><td><s:textfield name="phoneNum" /></td>
			</tr>
			<tr>
				<td>密码：</td><td><s:textfield name="password" /></td>
			</tr>
			<tr>
				<td>姓名：</td><td><s:textfield name="operName" /></td>
			</tr>
			<tr>
				<td>出生日期：</td><td><input name="birthday" type="date" /></td>
			</tr>
			<tr>
				<td>性别：</td>
				<td><s:select name="gender" list="{'男','女'}"/></td>
			</tr>
			<tr>
				<td>家庭住址：</td><td><s:textfield name="address" /></td>
			</tr>
			<tr>
				<td>权限：</td><td><s:select name="authority" list="{'A','B','C'}"/></td>
			</tr>
			<tr>
				<td align="center" ><input type="submit" value="提交" style="width:80px;"/></td>
				<td align="center" ><input type="reset" value="重置" style="width:80px;"/></td>
			</tr>
		</table>
	</s:form>
</body>
</html>