package com.ResumeWebService.service.impl;

import java.util.HashMap;
import org.springframework.stereotype.Service;

import com.ResumeWebService.entity.ResumeDetailsEntity;
import com.ResumeWebService.exception.ServiceException;
import com.ResumeWebService.service.spec.ResumeService;

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
