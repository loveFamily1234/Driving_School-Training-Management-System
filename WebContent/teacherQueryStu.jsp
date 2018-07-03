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
<title>教练所带学员的信息查询</title>
</head>
<body>
<table border="0" width="100%">
		<tr>
			<td align="center" style="font-size: 24px; color: #666">教练所带学员的信息查询</td>
		</tr>
	</table>
	<br/>
<s:form action="teacher_queryStu" method="post" namespace="/" theme="simple">
	<table align="center">
		<tr>
			<td>请输入教练员ID：<s:textfield name="IDnumber"/></td>
			<td><input type="submit" value="查询"/></td>
		</tr>
	</table>
</s:form>
</body>
</html>