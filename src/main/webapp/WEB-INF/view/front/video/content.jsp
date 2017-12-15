<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: zhouyc
  Date: 2017/6/30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html; charset=UTF-8" language="java" %>


<div class="intro">
	<div class="container">
		<div class="v-intro">
			<div class="left">
				<video id="videoPlayer" src="${video.video_url}" class="video-js vjs-default-skin" controls width="627" height="280"
					   poster="${video.video_image_url}" data-setup="{}">
				</video>
			</div>

			<div class="right">
				<p class="right-title">${video.video_title}</p>
				<div class="avatar">
					<span style="background-image: url(${speaker.speaker_head_url})"></span>
					<p><b>讲师：${speaker.speaker_name}</b><br><i>${speaker.speaker_descr}</i></p>
				</div>
				<p class="video-intro">
					<span>本节内容：</span> ${video.video_descr}
				</p>
			</div>
		</div>

		<div class="kcjs">
			<p class="title">课程介绍</p>
			<p class="content">${course.course_descr}</p>
		</div>

	</div>
</div>
<!--目录-->
<div class="catalog">
	<div class="container">
		<p class="title">目录</p>

		<c:forEach items="${videoList}" var="video" >
			<div class="chapter">
				<p class="biaoti"><a href="front/video/videoIndex.action?videoId=${video.id}&subjectId=${subject_id}">${video.video_title}</a></p>
				<p class="lecturer">${video.video_descr}</p>
				<p class="lecturer">讲师：${video.speaker_name}</p>
				<div class="v-info">
					<span class="count"><img src="static/img/count.png" alt="">${video.video_play_times}</span>
					<span class="duration"><img src="static/img/player.png" alt="">${video.videoLength}</span>
				</div>
			</div>
		</c:forEach>


	</div>
</div>