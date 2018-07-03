<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="icon" href="${pageContext.request.contextPath }/img/favicon.ico" type="image/x-icon" />
<link rel="shortcut icon" href="${pageContext.request.contextPath }/img/favicon.ico"
	type="image/x-icon" />
<style type="text/css">
.table1 {
	border: 1px solid #ddd;
	width: 100%;
}

thead {
	background-color: lightblue;
}
</style>
</head>
<body>
	<table border="0" width="100%">
		<tr>
			<td colspan="2" align="center" style="font-size: 24px; color: #666">学车进展</td>
		</tr>
		<tr>
			<td align="left"><a href="${pageContext.request.contextPath}/student_findAll4.action">查询个人学车进展信息</a></td>
		</tr>
	</table>

	<br />
	<table cellspacing="0" border="1" class="table1">
		<thead>
			<tr>
				<td align="center">身份证号</td>
				<td align="center">手机号</td>
				<td align="center">姓名</td>
				<td align="center">申请驾照类别</td>
				<td align="center">报名日期</td>
				<td align="center">当前所学科目</td>
				<td align="center">当前状态</td>
				<td align="center">结束日期</td>
			</tr>
		</thead>
		<tbody>
			<s:iterator value="list" var="stu">
				<tr>
					<td align="center"><s:property value="#stu.IDnumber" /></td>
					<td align="center"><s:property value="#stu.phoneNum" /></td>
					<td align="center"><s:property value="#stu.stuName" /></td>
					<td align="center"><s:property value="#stu.licenseType" /></td>
					<td align="center"><s:property value="#stu.registerDate" /></td>
					<td align="center"><s:property value="#stu.subjectNow" /></td>
					<td align="center"><s:property value="#stu.statusNow" /></td>
					<td align="center"><s:property value="#stu.endTime" /></td>
				</tr>
			</s:iterator>
		</tbody>
	</table>
	<br />
</body>
</html>