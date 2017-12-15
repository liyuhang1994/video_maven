package com.zhiyou100.video.service;

import com.zhiyou100.video.model.Speaker;
import com.zhiyou100.video.utils.Page;

public interface AdminSpeakerService {

	Page<Speaker> findAllSpeaker(String speakerName, String speakerJob, String currentPage);

	void AddSpeaker(Speaker s);

	Speaker findSpeakerById(Integer id);

	void updateSpeakerById(Speaker s);

	void deleteSpeakerById(Integer id);

}
