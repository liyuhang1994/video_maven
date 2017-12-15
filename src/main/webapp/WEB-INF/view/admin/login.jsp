<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<style type="text/css">
.container-fluid {
	/* background-image: url(video-maven/src/main/webapp/static/img/bg.jpg); */
	height: 1080px;
}

.login {
	height: 300px;
	width: 300px;
	position: absolute;
	margin: auto;
	top: 0;
	left: 0;
	bottom: 0;
	right: 0;
}

.btn-success {
	width: 300px;
}

.text-danger {
	display: block;
	margin-left: auto;
	margin-right: auto;
}
</style>

<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>登录</title>
<link
	href="${pageContext.request.contextPath }/static/css/bootstrap.min.css"
	rel="stylesheet">

</head>

<body>
	<script
		src="${pageContext.request.contextPath }/static/js/jquery-1.12.4.min.js"></script>
	<script
		src="${pageContext.request.contextPath }/static/js/bootstrap.js"></script>
	<script
		src="${pageContext.request.contextPath }/static/js/jquery.validate.min.js"></script>
	<script
		src="${pageContext.request.contextPath }/static/js/messages_zh.min.js"></script>
	<script type="text/javascript">
	
	$.validator.addMethod("isExit",
			function(value,ele,param){
				var a = 0;
				$.ajax({
					type : "POST",
					url : "${pageContext.request.contextPath }/admin/adminUserLoginIsExit.action",
					data : "login_name="+value,
					dataType:"text",
					success : function(msg) {
						if(msg == "success"){
							a = 1;
						}else{
							a=0;
						}
					},
					async:false
				});
				if(a==0){
					return false;
				}else{
					return true;
				}
			},
			"用户不存在"
	);
	
		$(function() {
			$("#formId").validate({
				rules : {
					login_name : {
						required : true,
						minlength : 5,
						isExit: "xxx"
					},
					login_pwd : {
						required : true,
					},
					rlogin_pwd : {
						required : true,
						equalTo : "[name=login_pwd]"
					/*如果使用的是id */
					/* equalTo:"#pwd" */
					}
				},
				messages : {
					login_name : {
						required : "用户名不能为空",
						minlength : "长度不能少于5位"
					},
					login_pwd : {
						required : "密码不能为空",
					},
					rlogin_pwd : {
						required : "确认密码不能为空",
						equalTo : '两次密码不一致'
					}
				}
			});
		});
	</script>
	<div class="container-fluid">
		<div class="login">
			<img src="${pageContext.request.contextPath }/static/img/logo.png"
				width="280px"><br /> <br />
			<form id="formId"
				action="${pageContext.request.contextPath }/admin/adminUserLogin.action">
				<div class="form-group">
					<input type="text" class="form-control" id="exampleInputEmail1"
						placeholder="用户名" name="login_name">
				</div>
				<div class="form-group">
					<input type="password" class="form-control"
						id="exampleInputPassword1" placeholder="密码" name="login_pwd">
				</div>
				<div class="form-group">
					<input type="password" class="form-control"
						id="exampleInputPassword1" placeholder="确认密码" name="rlogin_pwd">
				</div>
				<p class="text-danger">${err }</p>
				<div class="form-group">
					<input class="btn btn-success" type="submit" />
				</div>

			</form>

		</div>

	</div>

</body>

</html>