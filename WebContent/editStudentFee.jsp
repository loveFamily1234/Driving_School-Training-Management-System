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
<title>修改出车记录</title>
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
			<td align="center" style="font-size: 24px; color: #666">修改缴费退费记录</td>
		</tr>
		<tr>
			<td align="right" > <a href="javascript:history.go(-1)">回退</a></td>
		</tr>
	</table>
	<br/>
	<s:form action="studentFee_update" method="post" namespace="/" theme="simple">
		<table align="center" class="table2">
			<s:hidden name="id" value="%{model.id}"></s:hidden>
			<tr>
				<td>学员身份证号：</td><td><s:select name="IDnumber" list="list" listKey="IDnumber" listValue="IDnumber" headerKey="" headerValue="--请选择--" value="%{model.IDnumber}"></s:select></td>
			</tr>
			<tr>
				<td>应缴费用：</td><td><s:textfield name="fee" value="%{model.fee}"/></td>
			</tr>
			<tr>
				<td>缴费原因：</td><td><s:textfield name="reason" value="%{model.reason}"/></td>
			</tr>
			<tr>
				<td>修改日期：</td><td><s:textfield name="timeFee" value="%{model.timeFee}"/></td>
			</tr>
			<tr>
				<td>当前状态：</td><td><s:select name="state" value="%{model.state}" list="{'未缴费','已缴费','已退费'}"/></td>
			</tr>
			<tr>
				<td align="center" ><input type="submit" value="提交" style="width:80px;"/></td>
				<td align="center" ><input type="reset" value="重置" style="width:80px;"/></td>
			</tr>
		</table>
	</s:form>
</body>
</html>