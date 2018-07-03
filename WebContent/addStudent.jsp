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
<title>学员报名</title>
<style>
body{
	text-align: center;
}
.table2{
	border: 2px solid #0094ff;
	width: 600px;
	text-align: left;
}
.table2 tr td {
	border: 1px solid #ccc;
}
.table2 tr td .address{
	width:99%;
}
</style>
</head>
<body>
	<table border="0" width="100%">
		<tr>
			<td align="center" style="font-size: 24px; color: #666">学员报名</td>
		</tr>
		<tr>
			<td align="right" > <a href="javascript:history.go(-1)">回退</a></td>
		</tr>
	</table>
	<br/>
	<s:form action="student_save" method="post" namespace="/" theme="simple">
		<table align="center" class="table2">
			<tr>
				<td>手机号码：</td><td><input name="phoneNum" type="text" /></td>
				<td>密码：</td><td><input name="password" type="text" /></td>
			</tr>
			<tr>
				<td>身份证号：</td><td><input name="IDnumber" type="text" /></td>
				<td>姓名：</td><td><input name="stuName" type="text" /></td>
			</tr>
			<tr>
				<td>出生日期：</td><td><input name="birthday" style="width:97%;" type="date" /></td>
				<td>性别：</td><td align="center"><select name="gender" ><option selected="selected" value="男">男</option>
						<option value="女">女</option></select></td>
			</tr>
			<tr>
				<td>家庭住址：</td>
				<td colspan="3"><input name="address" class="address" type="text"/></td>
			</tr>
			<tr>
				<td>申请驾照类型：</td>
				<td align="center">
					<select name="licenseType" >
						<option selected="selected" value="C1">C1</option>
						<option value="B1">B1</option>
					</select>
				</td>
				<td>是否初次申领：</td>
				<td align="center">
					<select name="firstGet" >
						<option selected="selected" value="初次申领">初次申领</option>
						<option value="增驾">增驾</option>
					</select>
				</td>
			</tr>
			<%
				java.text.SimpleDateFormat simpleDateFormat = new java.text.SimpleDateFormat("yyyy-MM-dd");
				java.util.Date currentTime = new java.util.Date();
				String time = simpleDateFormat.format(currentTime).toString();
			%>
			<tr>
				<td>学费：</td><td><input name="fee" type="text" /></td>
				<td>报名日期：</td><td><input name="registerDate" readonly="readonly" type="text" value=<%=time %>></td>
			</tr>
			<tr>
				<td>教练员：</td>
				<td><s:select name="teacherID" list="list" listKey="IDnumber" listValue="teacherName" headerKey="" headerValue="--请选择--"></s:select></td>
				<td>目前所学科目：</td>
				<td>
					<select name="subjectNow" >
						<option selected="selected" value="科目一">科目一</option>
						<option value="科目二">科目二</option>
						<option value="科目三">科目三</option>
						<option value="科目四">科目四</option>
					</select>
				</td>
			</tr>
			<tr>
				<td>目前状态：</td>
				<td>
					<select name="statusNow" >
						<option selected="selected" value="未结业">未结业</option>
						<option value="已结业">已结业</option>
						<option value="已退学">已退学</option>
					</select>
				</td>
				<td>结束日期：</td><td><input name="endTime" type="date" /></td>
			</tr>
			<tr>
				<td align="center" colspan="2"><input type="submit" value="提交" style="width:80px;"/></td>
				<td align="center" colspan="2"><input type="reset" value="重置" style="width:80px;"/></td>
			</tr>
		</table>
	</s:form>
</body>
</html>