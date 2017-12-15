<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://zhiyou100.com/common/" prefix="page"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<style type="text/css">
.form-left {
	float: left
}

.form {
	float: right
}
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
			<h2>主讲人列表-主讲人管理</h2>
		</div>

		<div class="form-left">
			<a class="btn btn-primary" href="${pageContext.request.contextPath }/admin/speaker/speakerAddTZ.action">添加主讲人</a>

		</div>
		<div class="form">
			<form class="form-inline" action="${pageContext.request.contextPath }/admin/speaker/speakerList.action">
				<div class="form-group">
					<label for="exampleInputName2">名称</label> <input type="text"
						class="form-control" id="exampleInputName2" placeholder="主讲人名称" name="speakerName" value="${speakerName }">
				</div>
				<div class="form-group">
					<label for="exampleInputEmail2">职位</label> <input type="text"
						class="form-control" id="exampleInputEmail2" placeholder="主讲人职位" name="speakerJob" value="${speakerJob }">
				</div>
				<input type="submit" class="btn btn-primary" value="查询"></input>
			</form>
		</div>

		<div>
			<table class="table table-hover">
				<tr>
					<th>序号</th>
					<th>名称</th>
					<th>职位</th>
					<th>简介</th>
					<th>编辑</th>
					<th>删除</th>
				</tr>
				<c:forEach items="${page.rows }" var="speaker" varStatus="status">
				<tr>
					<td>${status.count }</td>
					<td>${speaker.speaker_name }</td>
					<td>${speaker.speaker_job }</td>
					<td>${speaker.speaker_descr }</td>
					<td><a class="glyphicon glyphicon-edit"
						href="${pageContext.request.contextPath }/admin/speaker/speakerEditTZ.action?id=${speaker.id }"></a></td>
					<td><a class="glyphicon glyphicon-trash" href="${pageContext.request.contextPath }/admin/speaker/speakerDelete.action?id=${speaker.id }"></a></td>
				</tr>
				</c:forEach>
			</table>
		</div>
		<page:page url="${pageContext.request.contextPath }/admin/speaker/speakerList.action" />
	</div>

</body>

</html>