<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Bootstrap 101 Template</title>
<link
	href="${pageContext.request.contextPath }/static/css/bootstrap.min.css"
	rel="stylesheet">
</head>

<body>
	<script
		src="${pageContext.request.contextPath }/static/js/jquery-1.12.4.min.js"></script>
	<script
		src="${pageContext.request.contextPath }/static/js/bootstrap.min.js"></script>

	<div class="container">
		<div class="jumbotron">
			<h2>添加课程-课程管理</h2>
		</div>

		<div class="form">
			<form class="form-horizontal"
				action="${pageContext.request.contextPath }/admin/course/courseAdd.action"
				method="post">
				<div class="form-group">
					<label for="inputEmail3" class="col-sm-2 control-label">标题</label>
					<div class="col-sm-10">
						<input type="text" class="form-control" id="inputEmail3"
							placeholder="课程标题" name="course_name">
					</div>
				</div>


				<div class="form-group">
					<label for="inputEmail3" class="col-sm-2 control-label">学科</label>
					<div class="col-sm-10">
						<select class="form-control" name="subject_id">
							<c:forEach items="${sub }" var="sub">
								<option value="${sub.id }">${sub.subject_name }</option>
							</c:forEach>
						</select>
					</div>
				</div>

				<div class="form-group">
					<label for="inputEmail3" class="col-sm-2 control-label">简介</label>
					<div class="col-sm-10">
						<textarea class="form-control" cols="10" rows="5" name="course_descr"></textarea>
					</div>
				</div>

				<div class="form-group">
					<div class="col-sm-offset-2 col-sm-10">
						<input type="submit" class="btn btn-primary" value="保存"></input> <a
							class="btn btn-default" href="javascript:history.go(-1)">返回列表</a>
					</div>

				</div>

			</form>
		</div>

	</div>

</body>

</html>