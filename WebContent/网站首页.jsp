<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set var="path" value="${pageContext.request.contextPath }"></c:set>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>志东驾校</title>
<link rel="icon" href="${pageContext.request.contextPath }/img/favicon.ico" type="image/x-icon" />
<link rel="shortcut icon" href="${pageContext.request.contextPath }/img/favicon.ico"
	type="image/x-icon" />
<link rel="icon" href="${path }/img/favicon.ico" type="image/x-icon" />
<link rel="shortcut icon" href="${path }/img/favicon.ico"
	type="image/x-icon" />
<link type="text/css" rel="stylesheet"
	href="${path }/css/fullscreenScroll.css">
<link type="text/css" rel="stylesheet"
	href="${path }/css/infoRolling.css">
<link type="text/css" rel="stylesheet"
	href="${path }/css/page1_thirdSection.css">
<link type="text/css" rel="stylesheet" href="${path }/css/carousel.css">
<link type="text/css" rel="stylesheet" href="${path }/css/page3.css">
<link type="text/css" rel="stylesheet" href="${path }/css/page4.css">
<script type="text/javascript" src="${path }/js/jquery.js"></script>
<script type="text/javascript" src="${path }/js/fullscreenScroll.js"></script>
<script type="text/javascript" src="${path }/js/carousel.js"></script>
<script type="text/javascript" src="${path }/js/login.js"></script>
<script type="text/javascript">
	
</script>
<style type="text/css">
* {
	margin: 0 auto;
	padding: 0 auto;
}

#login {
	position: fixed;
	top: 20%;
	z-index: 10;
	background-color: yellow;
	color: black;
	font-size: 20px;
	line-height: 60px;
	text-margin: center;
	width: 60px;
	height: 60px;
	border-radius: 50%;
	font-family: 宋体;
	font-weight: bold;
	cursor: pointer;
}

#firstSection {
	width: 100%;
	height: 60px;
	background-color: yellow;
}

.school_name {
	margin: 0 auto;
	height: 100%;
	width: 200px;
	font: italic bold 30px arial, sans-serif;
	text-align: center;
	line-height: 60px;
}

#firstSection a {
	color: black;
	font-size: 16px;
	text-decoration: none;
	padding: 0 20px;
	width: 100px;
}

#firstSection a:hover {
	background-color: pink;
	border-radius: 10px;
	color: brown;
	border-radius: 10px;
}

#bottom {
	position: absolute;
	bottom: 0px;
	height: 35px;
	width: 100%;
	text-align: center;
	background-color: rgb(200, 200, 150);
}

#bottom p {
	line-height: 35px;
}
#loginDiv form .uname,.upassword{
	color:gray;
}
#rightCircle .circle{
	width:20px;
	height:20px;
	border-radius:50%;
	background:#ccc;
	opacity:.8;
	
}
</style>
</head>
<body>
	<div id="wrap">
		<div id="login">登录</div>
		<div id="main">
			<div id="page1" class="page">
				<div id="firstSection">
					<table style="width: 100%">
						<tr>
							<td><div class="school_name">志东驾校</div></td>
							<td><a href="${path }/网站首页.jsp" class="daohang">首页</a></td>
							<td><a href="" class="daohang">公司介绍</a></td>
							<td><a href="" class="daohang">资讯</a></td>
							<td><a href="" class="daohang">综合平台</a></td>
							<td><a href="" class="daohang">服务</a></td>
							<td><a href="" class="daohang">联系我们</a></td>
							<td>服务热线：<span id=""
								style="color: Red; font-size: 14pt; font-weight: bold;">400-666-6666</span>
							</td>
						</tr>
					</table>
				</div>
				<div id="secondSection"
					style="text-align: center; margin: 0 auto; padding: 0 auto;">
					<div
						style="margin: 0 auto; padding: 0 auto; display: inline-block; font-size: 30px;">通知：</div>
					<div id="mooc" style="margin: 5px auto; padding: 0 auto;">
						<!--  中间 -->
						<div id="moocBox">
							<%
								java.text.SimpleDateFormat simpleDateFormat = new java.text.SimpleDateFormat("yyyy-MM-dd");
								java.util.Date currentTime = new java.util.Date();
								String time = simpleDateFormat.format(currentTime).toString();
							%>
							<ul id="con1">
								<li><a href="#">志东驾校新一轮培训开始啦</a><span><%=time%></span></li>
								<li><a href="#">学生考驾照有优惠了</a><span><%=time%></span></li>
								<li><a href="#">学费又有优惠啦</a><span><%=time%></span></li>
								<li><a href="#">驾照考试政策新变化</a><span><%=time%></span></li>
								<li><a href="#">驾校新车投入使用</a><span><%=time%></span></li>
							</ul>
							<ul id="con2">
							</ul>
						</div>
						<!--  中间结束 -->
						<script type="text/javascript" src="${path }/js/infoRolling.js"></script>
					</div>
				</div>
				<div id="thirdSection">
					<div id="introduce">
						<p>&nbsp;&nbsp;&nbsp;&nbsp;衡水志东机动车驾驶员培训学校（简称志东驾校），由市交通部门批准成立的高标准，高要求，高素质的机动车驾驶员培训机构。坐落于桃城区和平东路605号（联通大楼对面），交通十分便利。学校现有按照国家标准建设的一万平米大型训练场供学员训练，学车环境舒适设有现代化模拟电教室，学员休息室，宿舍食堂以及功能健全的配套服务设施，实现了规模教学直观化、训练科目规范化、教学设备现代化、教学方法科学化、管理手段多样化的目标。</p>
						<div id="introduce2">
							<p>&nbsp;&nbsp;&nbsp;&nbsp;我们倡导轻松学车、快乐学车，让您以最愉快的心情来完成技术培训。
								学校开设有早班、晚班、标准班、VIP班，先学车后付费节假日不休息，也可以根据学员的具体情况来设计培训计划
								以适应各层次人群需求，让您无忧学车。学校坚持诚信第一、言行一致、以人为本的教学宗旨，努力提高教练队伍的服务意识和水平，创造更好的社会效益。“一切为了学员满意”是志东人永远追求的目标。我校全体员工热忱的欢迎社会各界人士和朋友来我校光临指导报名学车，共创驾培行业的辉煌。</p>
						</div>
					</div>
				</div>
			</div>
			<div id="page2" class="page">
				<div id="name">驾校风采</div>
				<div class="J_Poster poster-main"
					data-setting='{
				"width":1000,
				"height":400,
				"posterWidth":280,
				"posterHeight":180,
				"scale":0.8,
				"autoPlay":true,
				"delay":2000,
				"speed":300
				}'>
					<div class="poster-btn poster-prev-btn"></div>
					<ul class="poster-list">
						<li class="poster-item"><a href="#"><img
								src="${path }/img/1.jpg" width="100%" height="100%"></a></li>
						<li class="poster-item"><a href="#"><img
								src="${path }/img/2.jpg" width="100%" height="100%"></a></li>
						<li class="poster-item"><a href="#"><img
								src="${path }/img/3.jpg" width="100%" height="100%"></a></li>
						<li class="poster-item"><a href="#"><img
								src="${path }/img/4.jpg" width="100%" height="100%"></a></li>
						<li class="poster-item"><a href="#"><img
								src="${path }/img/5.jpg" width="100%" height="100%"></a></li>

					</ul>
					<div class="poster-btn poster-next-btn"></div>
				</div>
				<script>
					$(function() {
						Carousel.init($(".J_Poster"));
					});
				</script>
			</div>
			<div id="page3" class="page">
				<div class="page3_main">
					<div class="page3_top">
						<p class="p1" style="">志东驾校常见问题</p>
						<p class="p2" style="">-为您专业解答学车问题-</p>
					</div>
					<ul>
						<li>
							<p class="p1">
								<b class="ask">问</b>为什么要选择志东驾校？
							</p>
							<p class="p2">
								<b class="answer">答</b>志东驾校拥有专业教练团队，模拟考试练车场，全程辅导练车，让你安心学车，快速拿本。
							</p>
						</li>
						<li class="next_li">
							<p class="p1">
								<b class="ask">问</b>志东驾校学车流程是什么？
							</p>
							<p class="p2">
								<b class="answer">答</b>根据驾考新规，目前的驾考流程大体有报名体检、科目一、科目二、科目三、科目四、拿本等六个步骤。
							</p>
						</li>
						<li class="next_li">
							<p class="p1">
								<b class="ask">问</b>志东驾校学车价格是否可以优惠？
							</p>
							<p class="p2">
								<b class="answer">答</b>志东驾校的学车价格因为班型和驾照类型的不同会有一定的差异，各班型优惠活动不同，通过网上报名立即享受优惠。
							</p>
						</li>
					</ul>
				</div>
			</div>
			<div id="page4" class="page">
				<div class="compare">
					<div class="col col_1">
						<div class="title">志东驾校</div>
						<p>班型不同，价格不同，低至3000元，一费到底</p>
						<p>练车不排队，拿证更快速</p>
						<p>举报电话6666888,接到立即核实并处理，保障学员权益</p>
						<p>学员真实评价，绝不弄虚作假</p>
						<p>自有场地宽阔，练车有保障</p>
					</div>
					<div class="col col_2">
						<div class="bg-line"></div>
						<div class="title">VS</div>
						<p>
							<span>价格费用</span>
						</p>
						<p>
							<span>拿证速度</span>
						</p>
						<p>
							<span>监督处理</span>
						</p>
						<p>
							<span>学员口碑</span>
						</p>
						<p>
							<span>教学环境</span>
						</p>
					</div>
					<div class="col col_3">
						<div class="title">其他驾校</div>
						<p>价格不真实，中间乱收费</p>
						<p>练车时间不保障，拿证遥遥无期</p>
						<p>驾校包庇违规教练，无法保障学员权益</p>
						<p>口碑差，或者没有真实口碑</p>
						<p>租用场地</p>
					</div>
				</div>
				<div id="bottom">
					<hr size="1" width="100%">
					<p>Copyrights 2018.04 刘耀东&copy;All rights reserved.中国</p>
				</div>
			</div>
		</div>
		<div id="loginDiv" style="display: none; position: fixed; top: 0; left: 0; z-index: 10; width: 100%; height: 100%;">
			<div style="position: absolute; top: 0; left: 0; background-color: #ccc; opacity: 0.5; width: 100%; height: 100%;"></div>
			<div style="margin: 100px auto; position: absolute; left: 39%; text-algin: left; width: 300px; height: 300px; background-color: #fff;border-radius:10px;">
				<form action="loginAction" method="post">
<!-- 				<h3><s:actionerror/></h3> -->
					<table style="font-size:18px;">
						<tr style="height:60px;"><td colspan="3"><div style="background-color:#E4E6CE;border-radius:10px;font-size:18px;height:35px;line-height:35px;font-weight:bold;">登录</div></td></tr>
						<tr height="30px;"></tr>
						<tr height="20px;">
							<td>用户名：</td>
							<td colspan="2">
								<input name="phoneNum" type="text" class="uname" value="请输入11位手机号" style="border-radius:5px;" onfocus="myfocus_uname(this)" onblur="myblur_uname(this)" reg="^1\d{10}$" tip="请输入11位手机号"/>
							</td>
						</tr>
						<tr height="10px;">
							<td></td>
							<td colspan="2" class="check" align="left" style="color:red;font-size:12px;"></td>
						</tr>
						<tr height="20px;">
							<td>密码：</td>
							<td colspan="2">
								<input name="password" type="text" class="upassword" value="8-16位英文或数字或下划线" style="border-radius:5px;" onfocus="myfocus_upassword(this)" onblur="myblur_upassword(this)" reg="^\w{8,16}$" tip="请输入8-16位的英文或数字或_"/>
							</td>
						</tr>
						<tr height="10px;">
							<td></td>
							<td colspan="2" class="check" align="left" style="color:red;font-size:12px;"></td>
						</tr>
						<tr height="20px;" style="font-size:16px;">
							<td><input type="radio" name="identity" value="操作员" checked="checked"/>操作员</td>
							<td><input type="radio" name="identity" value="管理员" />管理员</td>
							<td><input type="radio" name="identity" value="学员" />学员</td>
						</tr>
						<tr height="60px;">
							<td colspan="3"><input type="submit" name="login" value="登录" style="width:60px;margin-right:20px;border-radius:2px;"/>
							<input type="button" name="cancel" value="取消" style="width:60px;border-radius:2px;" onclick="toggleLoginDiv()"/></td>
						</tr>
					</table>
				</form>
			</div>
		</div>
		<div id="rightCircle">
			<div class="circle" style="background:orange;position:fixed;z-index:11;right:20px;top:40%;"></div>
			<div class="circle" style="position:fixed;z-index:11;right:20px;top:45%;"></div>
			<div class="circle" style="position:fixed;z-index:11;right:20px;top:50%;"></div>
			<div class="circle" style="position:fixed;z-index:11;right:20px;top:55%;"></div>
		</div>
	</div>
</body>
</html>