<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="icon" href="${pageContext.request.contextPath }/img/favicon.ico" type="image/x-icon" />
<link rel="shortcut icon" href="${pageContext.request.contextPath }/img/favicon.ico"
	type="image/x-icon" />
<title>教练所用车辆的信息查询结果</title>
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
			<td align="center" style="font-size: 24px; color: #666">查询结果</td>
		</tr>
		<tr>
			<td align="right"><a href="javascript:history.go(-1)">回退</a></td>
		</tr>
	</table>
	<br />
	<table cellspacing="0" border="1" class="table1">
		<thead>
			<tr>
				<td align="center">适用驾照类型-车牌号</td>
				<td align="center">品牌型号</td>
				<td align="center">开始使用日期</td>
				<td align="center">跟随教练员</td>
			</tr>
		</thead>
		<tbody>
			<s:iterator value="list" var="vehicle">
				<tr>
					<td align="center"><s:property value="#vehicle.plateNumber" /></td>
					<td align="center"><s:property value="#vehicle.brand" /></td>
					<td align="center"><s:property value="#vehicle.startTime" /></td>
					<td align="center"><s:property value="#vehicle.teacherID" /></td>
				</tr>
			</s:iterator>
		</tbody>
	</table>
	<br />
	<table border="0" cellspacing="0" cellpadding="0" width="100%">
		<tr>
			<td align="left"><a href="">[导出所有数据]</a></td>
		</tr>
	</table>
</body>
</html>