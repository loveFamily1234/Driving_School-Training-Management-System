<%@page import="com.opensymphony.xwork2.ActionContext"%>
<%@page import="entity.*"%>
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
<title>修改密码</title>
<style>
body{
	text-align: center;
}
.table2{
	border: 2px solid #0094ff;
	width: 400px;
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
			<td align="center" style="font-size: 24px; color: #666">修改密码</td>
		</tr>
	</table>
	<br/>
	<s:form action="modifyPasswordOperator_updateStu" method="post" namespace="/" theme="simple">
		<table align="center" class="table2">
		<%
			Student stu = (Student)ActionContext.getContext().getApplication().get("existPerson");
			String phoneNum = stu.getPhoneNum();
		%>
			<tr>
				<td>手机号：</td><td><input style="background:#ccc;" name="phoneNum" value=<%=phoneNum %> readonly="true"/></td>
			</tr>
			<tr>
				<td>请输入新密码：</td><td><input name="firstPassword" type="password"/></td>
			</tr>
			<tr>
				<td>再次输入新密码：</td><td><input name="secondPassword" type="password"/></td>
			</tr>
			<tr>
				<td align="center" ><input type="submit" value="提交" style="width:80px;"/></td>
				<td align="center" ><input type="reset" value="重置" style="width:80px;"/></td>
			</tr>
		</table>
	</s:form>
</body>
</html>