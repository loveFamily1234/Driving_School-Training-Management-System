<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set var="path" value="${pageContext.request.contextPath }"></c:set>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="icon" href="${pageContext.request.contextPath }/img/favicon.ico" type="image/x-icon" />
<link rel="shortcut icon" href="${pageContext.request.contextPath }/img/favicon.ico"
	type="image/x-icon" />
<title>操作成功</title>
<style type="text/css">
	body{
		text-align: center;
		margin-top:50px;
	}
	#confirm{
		width:50px;
		height:30px;
		background:#E4E6CE;
		border-radius:5px;
		line-height:30px;
		text-align: center;
		display: inline-block;
	}
	#confirm a{
		text-decoration: none;
	}
	#confirm a:hover{
		color:red;
	}
</style>
</head>
<body>
<span>操作成功！！！</span>
<div id="confirm">
<a href="${path }/功能主页之操作员.jsp" target="_top">确定</a>
</div>
</body>
</html>