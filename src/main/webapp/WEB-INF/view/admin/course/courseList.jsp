<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://zhiyou100.com/common/" prefix="page"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<style type="text/css">
</style>

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
			<h2>课程列表-课程管理</h2>
		</div>

		<div class="form-left">
			<a class="btn btn-primary" href="${pageContext.request.contextPath }/admin/course/courseAddTZ.action">添加课程</a>

		</div>


		<div>
			<table class="table table-hover">
				<tr>
					<th>序号</th>
					<th>标题</th>
					<th>学科</th>
					<th>简介</th>
					<th>编辑</th>
					<th>删除</th>
				</tr>
				<c:forEach items="${page.rows }" var="page" varStatus="status">
					<tr>
						<td>${status.count }</td>
						<td>${page.course_name }</td>
						<td>${page.subject_name }</td>
						<td>${page.course_descr }</td>
						<td><a class="glyphicon glyphicon-edit"
							href="${pageContext.request.contextPath }/admin/course/courseEditTZ.action?id=${page.id }"></a></td>
						<td><a class="glyphicon glyphicon-trash" href="${pageContext.request.contextPath }/admin/course/courseDelete.action?id=${page.id }"></a></td>
					</tr>
				</c:forEach>
			</table>
		</div>

		<page:page url="${pageContext.request.contextPath }/admin/course/courseList.action" />
	</div>

</body>

</html>