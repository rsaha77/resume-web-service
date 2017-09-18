package com.ResumeWebService.service.spec;

import com.ResumeWebService.entity.ResumeDetailsEntity;
import com.ResumeWebService.exception.ServiceException;

public interface ResumeService {
	int addResume (ResumeDetailsEntity resumeDetailsEntity) throws ServiceException;
	ResumeDetailsEntity getResume (int id) throws ServiceException;
}
