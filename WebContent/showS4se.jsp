<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" import="java.util.List,entity.Choice"%>
<%@page import="com.opensymphony.xwork2.ActionContext"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="icon" href="${pageContext.request.contextPath }/img/favicon.ico" type="image/x-icon" />
<link rel="shortcut icon" href="${pageContext.request.contextPath }/img/favicon.ico"
	type="image/x-icon" />
<style type="text/css">
.table1 {
	border: 0px;
	width: 100%;
}
</style>
<script type="text/javascript" src="${pageContext.request.contextPath }/js/jquery.js"></script>
</head>
<body>
	<table border="0" width="100%">
		<tr>
			<td align="center" style="font-size: 24px; color: #666">科目四 ·单选题</td>
		</tr>
		<tr>
			<td align="right"><a
				href="${pageContext.request.contextPath}/题库练习之科目四.jsp">退出练习</a></td>
		</tr>
	</table>

	<br />
	<table cellspacing="0" border="1" class="table1">
		<%
			List<Choice> list = (List<Choice>) ActionContext.getContext().getApplication().get("s4se");
			int currPosition = (int)ActionContext.getContext().getApplication().get("currPosition");
			String imgSrc = "";
			String display = "";
			if(currPosition > 0 && currPosition <= list.size()) {
		%>
		<div>
			<div><%=currPosition%>.<%=list.get(currPosition-1).getTitle()%></div>
			<%
				if(!list.get(currPosition-1).getImg().trim().equals("no")){
					imgSrc = "img/"+list.get(currPosition-1).getImg();
					display = "<div><img style='width:400px;height:200px;' src='"+imgSrc+"'></div>";
			%>
			<%=display %>
			<%
				}
			%>
			
			<div>
				<input type="radio" name="answer" />A.<%=list.get(currPosition-1).getA()%></div>
			<div>
				<input type="radio" name="answer"/>B.<%=list.get(currPosition-1).getB()%></div>
			<div>
				<input type="radio" name="answer"/>C.<%=list.get(currPosition-1).getC()%></div>
			<div>
				<input type="radio" name="answer"/>D.<%=list.get(currPosition-1).getD()%></div>
			<div>
					<input style="margin:20px 20px;" type="button" value="查看答案" onclick="showInfo()"/>
					<a style="margin-right:20px;" href="${pageContext.request.contextPath}/testChoice_subject4SingleElection.action?currPosition=<%=currPosition+1 %>">下一题</a>
					<a href="${pageContext.request.contextPath}/testChoice_subject4SingleElection.action?currPosition=<%=currPosition-1 %>">上一题</a>
			</div>
			<div id="info" style="display:none;">
				<div>
					正确答案：<%=list.get(currPosition-1).getAnswer() %>
				</div>
				<div>
					<%=list.get(currPosition-1).getExplanation() %>
				</div>
			</div>
			<script type="text/javascript">
				function showInfo(){
					$("#info").show();
				}
			</script>
		</div>
		<%
			}
		%>
	</table>
	<br />
</body>
</html>