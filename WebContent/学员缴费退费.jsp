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
			<td colspan="3" align="center" style="font-size: 24px; color: #666">学员缴费退费</td>
		</tr>
		<tr>
			<td align="left"><a href="${pageContext.request.contextPath}/studentFee_findAll.action">查询所有缴费退费信息</a></td>
			<td align="right"><a href="${pageContext.request.contextPath}/studentFee_deleteAll.action">清空记录</a></td>
			<td align="right" ><a href="${pageContext.request.contextPath }/studentFee_saveUI.action">添加</a></td>
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
				<td align="center">学员身份证号</td>
				<td align="center">应缴费用</td>
				<td align="center">缴费原因</td>
				<td align="center">修改日期</td>
				<td align="center">当前状态</td>
				<td align="center">编辑</td>
				<td align="center">删除</td>
			</tr>
		</thead>
		<tbody>
			<s:iterator value="list" var="stuFee">
				<tr>
					<s:hidden name="id" value="#stuFee.id"></s:hidden>
					<td align="center"><s:property value="#stuFee.IDnumber" /></td>
					<td align="center"><s:property value="#stuFee.fee" /></td>
					<td align="center"><s:property value="#stuFee.reason" /></td>
					<td align="center"><s:property value="#stuFee.timeFee" /></td>
					<td align="center"><s:property value="#stuFee.state" /></td>
					<td align="center"><a href="${pageContext.request.contextPath }/studentFee_edit.action?id=<s:property value="#stuFee.id" />"><img src="${pageContext.request.contextPath }/img/edit.png"/></a></td>
					<td align="center"><a href="${pageContext.request.contextPath }/studentFee_delete.action?id=<s:property value="#stuFee.id" />"><img src="${pageContext.request.contextPath }/img/delete.png"/></a></td>
				</tr>
			</s:iterator>
		</tbody>
	</table>
	<br />

	<table border="0" cellspacing="0" cellpadding="0" width="100%">
		<tr>
			<td align="left">
				<a href="">[导出所有数据]</a>
			</td>
			<td align="right">
				<span>第<s:property value="currPage"/>/<s:property value="totalPage"/>页</span>&nbsp;&nbsp; 
				<span>总记录数:<s:property value="totalCount"/>条&nbsp;&nbsp;每页显示:<s:property value="pageSize"/>条</span>&nbsp;&nbsp; 
				<span> 
					<s:if test="currPage != 1">
						<a href="${pageContext.request.contextPath }/studentFee_findAll.action?currPage=1">[首页]</a>&nbsp;&nbsp;
						<a href="${pageContext.request.contextPath }/studentFee_findAll.action?currPage=<s:property value="currPage-1"/>">[上一页]</a>&nbsp;&nbsp;
					</s:if> 
					<s:if test="currPage != totalPage">
						<a href="${pageContext.request.contextPath }/studentFee_findAll.action?currPage=<s:property value="currPage+1"/>">[下一页]</a>&nbsp;&nbsp;
						<a href="${pageContext.request.contextPath }/studentFee_findAll.action?currPage=<s:property value="totalPage"/>">[尾页]</a>&nbsp;&nbsp;
					</s:if> 
				</span>
			</td>
		</tr>
	</table>
</body>
</html>