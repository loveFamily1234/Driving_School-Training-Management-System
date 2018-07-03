<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="icon" href="${pageContext.request.contextPath }/img/favicon.ico" type="image/x-icon" />
<link rel="shortcut icon" href="${pageContext.request.contextPath }/img/favicon.ico"
	type="image/x-icon" />
</head>
<body>
	<table border="0" width="100%">
		<tr>
			<td align="center" style="font-size: 24px; color: #666">题库练习之科目四</td>
		</tr>
		<tr>
			<td align="left"><a
				href="${pageContext.request.contextPath}/testChoice_subject4SingleElection.action">单选题练习</a></td>
		</tr>
		<tr>
			<td align="left"><a
				href="${pageContext.request.contextPath }/testJudgment_subject4Judgment.action">判断题练习</a></td>
		</tr>
		<tr>
			<td align="left"><a
				href="${pageContext.request.contextPath }/testChoice_subject4MultipleChoice.action">多选题练习</a></td>
		</tr>
	</table>

	<br />
	
</body>
</html>