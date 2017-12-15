package com.zhiyou100.video.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zhiyou100.video.mapper.SpeakerMapper;
import com.zhiyou100.video.model.Speaker;
import com.zhiyou100.video.service.AdminSpeakerService;
import com.zhiyou100.video.utils.Page;

@Service
public class AdminSpeakerServiceImpl implements AdminSpeakerService{

	@Autowired
	private SpeakerMapper sm;
	
	@Override
	public Page<Speaker> findAllSpeaker(String speakerName, String speakerJob, String currentPage) {
		
		int count = sm.countByExample(null);
		List<Speaker> list = sm.findAllSpeakerByLimit(speakerName,speakerJob,(Integer.parseInt(currentPage)-1)*5);
		Page<Speaker> page = new Page<>();
		page.setTotal(count);
		page.setPage(Integer.parseInt(currentPage));
		page.setSize(5);
		page.setRows(list);
		return page;
	}

	@Override
	public void AddSpeaker(Speaker s) {
		sm.insertSelective(s);
	}

	@Override
	public Speaker findSpeakerById(Integer id) {
		return sm.selectByPrimaryKey(id);
	}

	@Override
	public void updateSpeakerById(Speaker s) {
		sm.updateByPrimaryKeySelective(s);
	}

	@Override
	public void deleteSpeakerById(Integer id) {
		sm.deleteByPrimaryKey(id);
	}

}
