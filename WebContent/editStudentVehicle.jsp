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
<title>修改学员分车记录</title>
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
			<td align="center" style="font-size: 24px; color: #666">修改出车记录</td>
		</tr>
		<tr>
			<td align="right" > <a href="javascript:history.go(-1)">回退</a></td>
		</tr>
	</table>
	<br/>
	<s:form action="studentVehicle_update" method="post" namespace="/" theme="simple">
		<table align="center" class="table2">
			<tr>
				<td>学员身份证号：</td><td><s:textfield style="background:#ccc;" name="IDnumber" value="%{model.IDnumber}" readonly="true"/></td>
			</tr>
			<tr>
				<td>适用驾照类型-车牌号：</td>
				<td><s:select name="plateNumber" list="listVeh" listKey="plateNumber" listValue="plateNumber" headerKey="" headerValue="--请选择--" value="%{model.plateNumber}" ></s:select></td>
			</tr>
			<tr>
				<td>分配时间：</td><td><s:textfield name="timeSV" value="%{model.timeSV}"/></td>
			</tr>
			<tr>
				<td align="center" ><input type="submit" value="提交" style="width:80px;"/></td>
				<td align="center" ><input type="reset" value="重置" style="width:80px;"/></td>
			</tr>
		</table>
	</s:form>
</body>
</html>