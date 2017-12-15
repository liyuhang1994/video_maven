<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://zhiyou100.com/common/" prefix="page"%>
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
<script type="text/javascript">
	function che(th) {
		var num = 0;
		for (var i = 0; i < document.getElementsByName("td").length; i++) {
			num++;
			document.getElementsByName("td")[i].checked = th.checked;
		}
		if (document.getElementsByName("th")[0].checked == true) {
			document.getElementById("deleteVideo").innerText = num;
		} else {
			document.getElementById("deleteVideo").innerText = 0;
		}
	}

	function chetd() {

		var num = 0;
		var arr = new Array();
		for (var i = 0; i < document.getElementsByName("td").length; i++) {
			if (document.getElementsByName("td")[i].checked) {
				arr[num] = document.getElementsByName("td")[i].value;
				num++;
			}
		}
		document.getElementById("deleteVideo").innerText = num;
		if (num == document.getElementsByName("td").length) {
			document.getElementsByName("th")[0].checked = true;
		} else {
			document.getElementsByName("th")[0].checked = false;
		}

	}

	function deleteAll() {
		var num = 0;
		var arr = new Array();
		var str = "id=";
		for (var i = 0; i < document.getElementsByName("td").length; i++) {
			if (document.getElementsByName("td")[i].checked) {
				arr[num] = document.getElementsByName("td")[i].value + "";
				str = str + arr[num] + "&id=";

				num++;
			}
		}
		if (num == 0) {
			str = str.substr(0, str.length - 3);
		} else {
			str = str.substr(0, str.length - 4);
		}
		location = "${pageContext.request.contextPath}/admin/video/videoDeleteAll.action?"
				+ str;
	}
</script>

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
			<h2>视频列表-视频管理</h2>
		</div>

		<div class="form-left">
			<a class="btn btn-primary"
				href="${pageContext.request.contextPath }/admin/video/videoAddTZ.action">添加视频</a>

			<a class="btn btn-primary" onclick="deleteAll()"
				href="javascript:void(0)"> 删除视频<span class="badge"
				id="deleteVideo"></span>
			</a>
		</div>
		<div class="form">
			<form class="form-inline" action="${pageContext.request.contextPath }/admin/video/videoList.action">
				<div class="form-group">
					<input type="text" class="form-control" id="exampleInputEmail3"
						placeholder="视频标题" name="videoName" value="${videoName }">
				</div>
				<select class="form-control" name="speakerName">
					<option>请选择主讲人</option>
					<c:forEach items="${sp }" var="sp">
						<option ${speakerName == sp.speaker_name  ? "selected" :"" }>${sp.speaker_name }</option>
					</c:forEach>
				</select> <select class="form-control" name="courseName">
					<option>请选择课程</option>
					<c:forEach items="${co }" var="co">
						<option ${courseName == co.course_name  ? "selected" :"" }>${co.course_name }</option>
					</c:forEach>
				</select> <input type="submit" class="btn btn-primary" value="查询"></input>
			</form>
		</div>

		<div>
			<table class="table table-hover">
				<tr>
					<th><input type="checkbox" onclick="che(this)" name="th" /></th>
					<th>序号</th>
					<th>名称</th>
					<th>介绍</th>
					<th>讲师</th>
					<th>课程</th>
					<th>时长(s)</th>
					<th>播放次数</th>
					<th>编辑</th>
					<th>删除</th>
				</tr>
				<c:forEach items="${page.rows }" var="video" varStatus="status">
					<tr>
						<td><input type="checkbox" onclick="chetd()" name="td"
							value="${video.id }" /></td>
						<td>${status.count }</td>
						<td>${video.video_title }</td>
						<td>${video.video_descr }</td>
						<td>${video.speaker_name }</td>
						<td>${video.course_name }</td>
						<td>${video.video_length }</td>
						<td>${video.video_play_times }</td>
						<td><a class="glyphicon glyphicon-edit"
							href="${pageContext.request.contextPath }/admin/video/videoEditTZ.action?id=${video.id }"></a>
						</td>
						<td><a class="glyphicon glyphicon-trash"
							href="${pageContext.request.contextPath }/admin/video/videoDelete.action?id=${video.id }"></a></td>
					</tr>
				</c:forEach>
			</table>
		</div>
		<page:page
			url="${pageContext.request.contextPath }/admin/video/videoList.action" />
	</div>

</body>

</html>