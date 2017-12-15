<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
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
			<h2>编辑主讲人信息-主讲人管理</h2>
		</div>

		<div class="form">
			<form class="form-horizontal"
				action="${pageContext.request.contextPath }/admin/speaker/speakerEdit.action">
				<div class="form-group">
					<label for="inputEmail3" class="col-sm-2 control-label">名字</label>
					<div class="col-sm-10">
						<input type="text" class="form-control" id="inputEmail3"
							placeholder="${speaker.speaker_name }" name="speaker_name">
					</div>
				</div>
				<input type="hidden" name="id" value="${speaker.id }">

				<div class="form-group">
					<label for="inputEmail3" class="col-sm-2 control-label">职位</label>
					<div class="col-sm-10">
						<input type="text" class="form-control" id="inputEmail3"
							placeholder="${speaker.speaker_job }" name="speaker_job">
					</div>
				</div>
				<div class="form-group">
					<label for="inputEmail3" class="col-sm-2 control-label">头像图片</label>
					<div class="col-sm-10">
						<input type="text" class="form-control" id="inputEmail3"
							placeholder="${speaker.speaker_head_url }"
							name="speaker_head_url">
					</div>
				</div>

				<div class="form-group">
					<label for="inputEmail3" class="col-sm-2 control-label">简介</label>
					<div class="col-sm-10">
						<textarea class="form-control" cols="10" rows="5"
							placeholder="${speaker.speaker_descr }" name="speaker_descr"></textarea>
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