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
<title>添加考试预约记录</title>
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
			<td align="center" style="font-size: 24px; color: #666">添加考试预约信息</td>
		</tr>
		<tr>
			<td align="right" > <a href="javascript:history.go(-1)">回退</a></td>
		</tr>
	</table>
	<br/>
	<s:form action="testAppointment_save" method="post" namespace="/" theme="simple">
		<table align="center" class="table2">
			<tr>
				<td>学员身份证号：</td>
				<td><s:select name="IDnumber" list="listStu" listKey="IDnumber" listValue="IDnumber" headerKey="" headerValue="--请选择--"></s:select></td>
			</tr>
			<tr>
				<td>申请驾照类型：</td>
				<td><s:select name="licenseType" list="{'C1','B1'}" /></td>
			</tr>
			<tr>
				<td>考试科目：</td>
				<td><s:select name="subjectNow" list="{'科目一','科目二','科目三','科目四'}" /></td>
			</tr>
			<tr>
				<td>考试时间：</td><td><input name="timeTest" type="date" /></td>
			</tr>
			<tr>
				<td>考试地点：</td>
				<td><s:select name="testAddress" list="{'衡湖考场','苏正考场','武邑考场'}" /></td>
			</tr>
			<tr>
				<td align="center" ><input type="submit" value="提交" style="width:80px;"/></td>
				<td align="center" ><input type="reset" value="重置" style="width:80px;"/></td>
			</tr>
		</table>
	</s:form>
</body>
</html>