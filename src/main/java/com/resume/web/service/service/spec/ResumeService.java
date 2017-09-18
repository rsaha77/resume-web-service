package com.resume.web.service.service.spec;

import com.resume.web.service.entity.ResumeDetailsEntity;
import com.resume.web.service.exception.ServiceException;

public interface ResumeService {
	int addResume (ResumeDetailsEntity resumeDetailsEntity) throws ServiceException;
	ResumeDetailsEntity getResume (int id) throws ServiceException;
}
