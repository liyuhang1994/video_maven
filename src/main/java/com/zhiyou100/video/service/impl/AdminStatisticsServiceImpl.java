package com.zhiyou100.video.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zhiyou100.video.mapper.CourseMapper;
import com.zhiyou100.video.model.Course;
import com.zhiyou100.video.model.Video;
import com.zhiyou100.video.service.AdminStatisticsService;

@Service
public class AdminStatisticsServiceImpl implements AdminStatisticsService{

	@Autowired
	private CourseMapper cm;
	
	@Override
	public List<Course> findAllCourse() {
		List<Course> list = cm.selectByExample(null);
		
		for (Course course : list) {
			course.setAverage_times(getAverageTimes(cm.findVideoByCid(course.getId())));
		}
		return list;
	}

	
	/*List<Video> findVideoByCid(int id){
		return cm.findVideoByCid(id);
	};*/
	
	
	int getAverageTimes(List<Video> list){
		int total = 0;
		for (Video video : list) {
			total += video.getVideo_play_times();
		}
		if(list.size()!=0){
			int AverageTimes = total/list.size();
			return AverageTimes;
		}else{
			return 0;
		}
	}
}
