<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
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
			<h2>统计-统计分析</h2>
		</div>
		<div id="main" style="height: 500px; width: 100%"></div>
		<script
			src="${pageContext.request.contextPath }/static/js/echarts-2.2.7/build/dist/echarts.js"></script>
		<script type="text/javascript">
			require
					.config({
						paths : {
							echarts : '${pageContext.request.contextPath }/static/js/echarts-2.2.7/build/dist'
						}
					});
			require([ 'echarts', 'echarts/chart/line', // 按需加载所需图表，如需动态类型切换功能，别忘了同时加载相应图表
			'echarts/chart/bar' ], function(ec) {
				var myChart = ec.init(document.getElementById('main'));
				var option = {
					title : {
						text : '课程平均播放数',
						subtext : '数据来源:zhiyou100.com'
					},
					tooltip : {
						trigger : 'axis'
					},
					
					toolbox : {
						show : true,
						feature : {
							mark : {
								show : true
							},
							dataView : {
								show : true,
								readOnly : false
							},
							magicType : {
								show : true,
								type : [ 'line', 'bar' ]
							},
							restore : {
								show : true
							},
							saveAsImage : {
								show : true
							}
						}
					},
					calculable : true,
					xAxis : [ {
						type : 'category',
						data : [ <c:forEach items="${list}" var="course">
					     " ${course.course_name} ",
					      </c:forEach> ],
						axisLine:{
                        	lineStyle:{
                            color:'#fff',
                              width:10,   //这里是坐标轴的宽度,可以去掉
                        	}
                    	}
					} ], 
						
					yAxis : [ {
						type : 'value'
					} ],
					
					series : [
						
							{
								name : '平均播放次数',
								
								type : 'bar',
								barWidth : 80,
								itemStyle:{
                                    normal:{
                                        color:'#89c7ff'
                                    }
                                },
                               
								data : [ <c:forEach items="${list}" var="course">
							      '${course.average_times}',
							      </c:forEach> ],
								markPoint : {
									data : [ {
										type : 'max',
										name : '最大值',
										itemStyle:{
		                                    normal:{
		                                        color:'#89c7ff'
		                                    }
		                                },
									}, {
										type : 'min',
										name : '最小值',
										itemStyle:{
		                                    normal:{
		                                        color:'#89c7ff'
		                                    }
		                                },
									} ]
								},
								
							},
							]
				}
				myChart.setOption(option);
			});
		</script>
	</div>
</body>
</html>