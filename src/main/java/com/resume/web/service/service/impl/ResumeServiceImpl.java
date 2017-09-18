package com.resume.web.service.service.impl;

import java.util.HashMap;
import org.springframework.stereotype.Service;
import com.resume.web.service.entity.ResumeDetailsEntity;
import com.resume.web.service.exception.ServiceException;
import com.resume.web.service.service.spec.ResumeService;

@Service
public class ResumeServiceImpl implements ResumeService {
	
	private HashMap <Integer, ResumeDetailsEntity> resumeHashedList = new HashMap <Integer, ResumeDetailsEntity>();
	private int ID = 0;
	
	public int addResume (ResumeDetailsEntity resumeDetailsEntity) throws ServiceException {
		resumeHashedList.put(++ID, resumeDetailsEntity);
		return ID;
	}
	
	public ResumeDetailsEntity getResume (int id) throws ServiceException {
		return resumeHashedList.get(id);
	}
	
	public int getSize () {
		return resumeHashedList.size();
	}
	
	public void emptyHashMap () {
		resumeHashedList.clear();
	}
}
