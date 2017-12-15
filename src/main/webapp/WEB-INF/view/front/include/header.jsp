<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page contentType="text/html; charset=UTF-8" language="java" %>

<header>
	<div class="container">
		<span>欢迎来到IT培训的黄埔军校——智游教育！</span>


		<c:if test="${not empty _front_user}">
			<div id="userBlock" style="float:right">
				<a href="front/user/userLogout.action">退出</a>
				<a href="front/user/userIndex.action" id="account">${sessionScope._front_user.email }</a>
			</div>
		</c:if>
		<c:if test="${empty _front_user}">
			<div id="regBlock" style="float:right">
				<a href="javascript:;" id="reg_open"><img src="static/img/we.png">注册</a>
				<a href="javascript:;" id="login_open"><img src="static/img/we.png">登录</a>
			</div>
		</c:if>

		<a onclick="JavaScript:addFavorite2()"><img src="static/img/sc.png" draggable="false">加入收藏</a>
		<a target="_blank" href="${pageContext.request.contextPath }/front/user/toAdmin.action"><img src="static/img/we.png" draggable="false">后台管理</a>
		<a class="color_e4"><img src="static/img/phone.png" draggable="false"> 0371-88888598&#x3000;&#x3000;4006-371-555</a>

	</div>
</header>
