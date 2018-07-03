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
			<td colspan="2" align="center" style="font-size: 24px; color: #666">教练信息维护</td>
		</tr>
		<tr>
			<td align="left"><a href="${pageContext.request.contextPath}/teacher_findAll.action">查询所有教练信息</a></td>
			<td align="right" > <a href="${pageContext.request.contextPath }/teacher_saveUI.action">添加</a></td>
		</tr>
	</table>
	<s:form action="" method="post" namespace="/"
		theme="simple">
		<table align="center">
			<tr>
				<td>请输入教练ID：<s:textfield name="IDnumber" /></td>
				<td><input type="submit" value="查询" /></td>
			</tr>
		</table>
	</s:form>
	<br />
	<table cellspacing="0" border="1" class="table1">
		<thead>
			<tr>
				<td align="center">教练ID</td>
				<td align="center">手机号</td>
				<td align="center">姓名</td>
				<td align="center">出生日期</td>
				<td align="center">性别</td>
				<td align="center">编辑</td>
				<td align="center">删除</td>
			</tr>
		</thead>
		<tbody>
			<s:iterator value="list" var="teacher">
				<tr>
					<td align="center"><s:property value="#teacher.IDnumber" /></td>
					<td align="center"><s:property value="#teacher.phoneNum" /></td>
					<td align="center"><s:property value="#teacher.teacherName" /></td>
					<td align="center"><s:property value="#teacher.birthday" /></td>
					<td align="center"><s:property value="#teacher.gender" /></td>
					<td align="center"><a href="${pageContext.request.contextPath }/teacher_edit.action?IDnumber=<s:property value="#teacher.IDnumber" />"><img src="${pageContext.request.contextPath }/img/edit.png"/></a></td>
					<td align="center"><a href="${pageContext.request.contextPath }/teacher_delete.action?IDnumber=<s:property value="#teacher.IDnumber" />"><img src="${pageContext.request.contextPath }/img/delete.png"/></a></td>
				</tr>
			</s:iterator>
		</tbody>
	</table>
	<br />

	<table border="0" cellspacing="0" cellpadding="0" width="100%">
		<tr>
			<td align="left">
				<a href="">[导出所有教练数据]</a>
			</td>
			<td align="right">
				<span>第<s:property value="currPage"/>/<s:property value="totalPage"/>页</span>&nbsp;&nbsp; 
				<span>总记录数:<s:property value="totalCount"/>条&nbsp;&nbsp;每页显示:<s:property value="pageSize"/>条</span>&nbsp;&nbsp; 
				<span> 
					<s:if test="currPage != 1">
						<a href="${pageContext.request.contextPath }/teacher_findAll.action?currPage=1">[首页]</a>&nbsp;&nbsp;
						<a href="${pageContext.request.contextPath }/teacher_findAll.action?currPage=<s:property value="currPage-1"/>">[上一页]</a>&nbsp;&nbsp;
					</s:if> 
					<s:if test="currPage != totalPage">
						<a href="${pageContext.request.contextPath }/teacher_findAll.action?currPage=<s:property value="currPage+1"/>">[下一页]</a>&nbsp;&nbsp;
						<a href="${pageContext.request.contextPath }/teacher_findAll.action?currPage=<s:property value="totalPage"/>">[尾页]</a>&nbsp;&nbsp;
					</s:if> 
				</span>
			</td>
		</tr>
	</table>
</body>
</html>