<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
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
			<td align="center" style="font-size: 24px; color: #666">学员退学</td>
		</tr>
		<tr>
			<td align="right"><a href="${pageContext.request.contextPath}/student_findAll2.action">查询所有学员</a></td>
		</tr>
	</table>
	<s:form action="" method="post" namespace="/"
		theme="simple">
		<table align="center">
			<tr>
				<td>请输入学员身份证号：<s:textfield name="IDnumber" /></td>
				<td><input type="submit" value="查询" /></td>
			</tr>
		</table>
	</s:form>
	<br />
	<table cellspacing="0" border="1" class="table1">
		<thead>
			<tr>
				<td align="center">身份证号</td>
				<td align="center">手机号</td>
<!-- 				<td align="center">密码</td> -->
				<td align="center">姓名</td>
				<td align="center">出生日期</td>
				<td align="center">性别</td>
				<td align="center">家庭住址</td>
				<td align="center">申请驾照类别</td>
				<td align="center">是否初次申领</td>
				<td align="center">学费</td>
				<td align="center">报名日期</td>
				<td align="center">跟随教练员</td>
				<td align="center">当前所学科目</td>
				<td align="center">当前状态</td>
				<td align="center">结束日期</td>
				<td align="center">选择退学</td>
			</tr>
		</thead>
		<tbody>
			<s:iterator value="list" var="stu">
				<tr>
					<td align="center"><s:property value="#stu.IDnumber" /></td>
					<td align="center"><s:property value="#stu.phoneNum" /></td>
<%-- 					<td align="center"><s:property value="#stu.password" /></td> --%>
					<td align="center"><s:property value="#stu.stuName" /></td>
					<td align="center"><s:property value="#stu.birthday" /></td>
					<td align="center"><s:property value="#stu.gender" /></td>
					<td align="center"><s:property value="#stu.address" /></td>
					<td align="center"><s:property value="#stu.licenseType" /></td>
					<td align="center"><s:property value="#stu.firstGet" /></td>
					<td align="center"><s:property value="#stu.fee" /></td>
					<td align="center"><s:property value="#stu.registerDate" /></td>
					<td align="center"><s:property value="#stu.teacherID" /></td>
					<td align="center"><s:property value="#stu.subjectNow" /></td>
					<td align="center"><s:property value="#stu.statusNow" /></td>
					<td align="center"><s:property value="#stu.endTime" /></td>
					<td align="center"><a href="${pageContext.request.contextPath }/student_modifyStatusToLeave.action?IDnumber=<s:property value="#stu.IDnumber" />">退学</a></td>
				</tr>
			</s:iterator>
		</tbody>
	</table>
	<br />

	<table border="0" cellspacing="0" cellpadding="0" width="100%">
		<tr>
			<td align="right">
				<span>第<s:property value="currPage"/>/<s:property value="totalPage"/>页</span>&nbsp;&nbsp; 
				<span>总记录数:<s:property value="totalCount"/>条&nbsp;&nbsp;每页显示:<s:property value="pageSize"/>条</span>&nbsp;&nbsp; 
				<span> 
					<s:if test="currPage != 1">
						<a href="${pageContext.request.contextPath }/student_findAll.action?currPage=1">[首页]</a>&nbsp;&nbsp;
						<a href="${pageContext.request.contextPath }/student_findAll.action?currPage=<s:property value="currPage-1"/>">[上一页]</a>&nbsp;&nbsp;
					</s:if> 
					<s:if test="currPage != totalPage">
						<a href="${pageContext.request.contextPath }/student_findAll.action?currPage=<s:property value="currPage+1"/>">[下一页]</a>&nbsp;&nbsp;
						<a href="${pageContext.request.contextPath }/student_findAll.action?currPage=<s:property value="totalPage"/>">[尾页]</a>&nbsp;&nbsp;
					</s:if> 
				</span>
			</td>
		</tr>
	</table>
</body>
</html>