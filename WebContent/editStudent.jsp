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
<title>修改学员信息</title>
<style>
body{
	text-align: center;
}
.table2{
	border: 2px solid #0094ff;
	width: 450px;
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
			<td align="center" style="font-size: 24px; color: #666">修改学员信息</td>
		</tr>
		<tr>
			<td align="right" > <a href="javascript:history.go(-1)">回退</a></td>
		</tr>
	</table>
	<br/>
	<s:form action="student_update" method="post" namespace="/" theme="simple">
		<table align="center" class="table2">
			<tr>
				<td>身份证号：</td><td><s:textfield style="background:#ccc;" name="IDnumber" value="%{model.IDnumber}" readonly="true"/></td>
			</tr>
			<tr>
				<td>手机号：</td><td><s:textfield name="phoneNum" value="%{model.phoneNum}"/></td>
			</tr>
			<tr>
				<td>密码：</td><td><s:password name="password" value="%{model.password}" showPassword="true" /></td>
			</tr>
			<tr>
				<td>姓名：</td><td><s:textfield name="stuName" value="%{model.stuName}"/></td>
			</tr>
			<tr>
				<td>出生日期：</td><td><s:textfield name="birthday" value="%{model.birthday}"/></td>
			</tr>
			<tr>
				<td>性别：</td>
				<td><s:radio name="gender" list="{'男','女'}" value="%{model.gender}"/></td>
			</tr>
			<tr>
				<td>家庭住址：</td><td><s:textfield name="address" value="%{model.address}"/></td>
			</tr>
			<tr>
				<td>申请驾照类别：</td><td><s:radio name="licenseType" list="{'C1','B1'}" value="%{model.licenseType}"/></td>
			</tr>
			<tr>
				<td>是否初次申领：</td><td><s:radio name="firstGet" list="{'初次申领','增驾'}" value="%{model.firstGet}"/></td>
			</tr>
			<tr>
				<td>学费：</td><td><s:textfield name="fee" value="%{model.fee}"/></td>
			</tr>
			<tr>
				<td>报名日期：</td><td><s:textfield name="registerDate" value="%{model.registerDate}"/></td>
			</tr>
			<tr>
				<td>跟随教练员：</td>
				<td><s:select name="teacherID" list="list" listKey="IDnumber" listValue="teacherName" value="%{model.teacherID}" headerKey="" headerValue="--请选择--"></s:select></td>
			</tr>
			<tr>
				<td>当前所学科目：</td><td><s:radio name="subjectNow" list="{'科目一','科目二','科目三','科目四'}" value="%{model.subjectNow}"/></td>
			</tr>
			<tr>
				<td>当前状态：</td><td><s:radio name="statusNow" list="{'未结业','已结业','已退学'}" value="%{model.statusNow}"/></td>
			</tr>
			<tr>
				<td>结束日期：</td><td><s:textfield name="endTime" value="%{model.endTime}"/></td>
			</tr>
			<tr>
				<td align="center" ><input type="submit" value="提交" style="width:80px;"/></td>
				<td align="center" ><input type="reset" value="重置" style="width:80px;"/></td>
			</tr>
		</table>
	</s:form>
</body>
</html>