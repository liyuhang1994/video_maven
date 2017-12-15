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
			<h2>添加视频信息-视频管理</h2>
		</div>

		<div class="form">
			<form class="form-horizontal" action="${pageContext.request.contextPath }/admin/video/videoAdd.action">
				<div class="form-group">
					<label for="inputEmail3" class="col-sm-2 control-label">视频标题</label>
					<div class="col-sm-10">
						<input type="text" class="form-control" id="inputEmail3"
							placeholder="视频标题" name="video_title">
					</div>
				</div>
				<div class="form-group">
					<label for="inputPassword3" class="col-sm-2 control-label">主讲人</label>
					<div class="col-sm-10">
					<select class="form-control" name="speaker_id">
						<c:forEach items="${sp }" var="sp">
							<option value="${sp.id }">${sp.speaker_name }</option>
						</c:forEach>
					</select>
					</div>
				</div>
				<div class="form-group">
					<label for="inputEmail3" class="col-sm-2 control-label">所属课程</label>
					<div class="col-sm-10">
						<select class="form-control" name="course_id">
						<c:forEach items="${co }" var="co">
							<option value="${co.id }">${co.course_name }</option>
						</c:forEach>
					</select>
					</div>
				</div>
				<div class="form-group">
					<label for="inputEmail3" class="col-sm-2 control-label">视频时长</label>
					<div class="col-sm-10">
						<input type="text" class="form-control" id="inputEmail3"
							placeholder="视频时长(秒)" name="video_length">
					</div>
				</div>
				<div class="form-group">
					<label for="inputEmail3" class="col-sm-2 control-label">封面图片</label>
					<div class="col-sm-10">
						<input type="text" class="form-control" id="inputEmail3"
							placeholder="视频封面图片地址,网络地址" name="video_image_url">
					</div>
				</div>
				<div class="form-group">
					<label for="inputEmail3" class="col-sm-2 control-label">视频播放地址</label>
					<div class="col-sm-10">
						<input type="text" class="form-control" id="inputEmail3"
							placeholder="视频播放地址,网络地址" name="video_url">
					</div>
				</div>
				<div class="form-group">
					<label for="inputEmail3" class="col-sm-2 control-label">视频简介</label>
					<div class="col-sm-10">
						<textarea class="form-control" cols="10" rows="5" name="video_descr"></textarea>
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