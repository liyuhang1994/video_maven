<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<style type="text/css">
		
		
		.right-side {
			flex-grow: 1;
			display: flex;
			flex-direction: column;
			margin-top: -20px;
		}
		
		iframe {
			flex-grow: 1px;
			height: 1000px;
			width: 100%;
			border: none;
		}
	</style>

	<head>
		<meta charset="utf-8">
		<meta http-equiv="X-UA-Compatible" content="IE=edge">
		<meta name="viewport" content="width=device-width, initial-scale=1">
		<title>admin</title>
		<link href="${pageContext.request.contextPath }/static/css/bootstrap.min.css" rel="stylesheet">
	</head>

	<body>
		<script src="${pageContext.request.contextPath }/static/js/jquery-1.12.4.min.js"></script>
		<script src="${pageContext.request.contextPath }/static/js/bootstrap.min.js"></script>

		<nav class="navbar navbar-inverse">
			<div class="container-fluid" style="margin:auto 200px">
				<div class="navbar-header">
					<a class="navbar-brand" href="#">视频管理系统</a>
				</div>

				<div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
					<ul class="nav navbar-nav">
						<li>
							<a target="pageBox" href="${pageContext.request.contextPath }/admin/video/videoList.action">视频管理</a>
						</li>
						<li>
							<a target="pageBox" href="${pageContext.request.contextPath }/admin/speaker/speakerList.action">主讲人管理</a>
						</li>
						<li>
							<a target="pageBox" href="${pageContext.request.contextPath }/admin/course/courseList.action">课程管理</a>
						</li>
						<li>
							<a target="pageBox" href="${pageContext.request.contextPath }/admin/statistics/statisticsList.action">统计分析</a>
						</li>

					</ul>

					<ul class="nav navbar-nav navbar-right">
						<li>
							<a href="#">${LOGIN.login_name }</a>
						</li>
						<li>
							<a class="glyphicon glyphicon-log-out" href="${pageContext.request.contextPath }/admin/adminLogOut.action"></a>
						</li>
					</ul>
				</div>

			</div>

		</nav>
		<div class="right-side">
			<iframe name="pageBox" src="${pageContext.request.contextPath }/admin/video/videoList.action"></iframe>
		</div>
	</body>

</html>