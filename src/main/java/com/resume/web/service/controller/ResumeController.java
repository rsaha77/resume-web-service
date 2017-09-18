package com.resume.web.service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.resume.web.service.entity.ResumeDetailsEntity;
import com.resume.web.service.service.spec.ResumeService;

@Controller
public class ResumeController {
	
	@Autowired
	private ResumeService resumeService;
	
	@RequestMapping (value = "/api/uploadResumeDetails", method = RequestMethod.POST)
	@ResponseBody
	public int uploadResumeDetails (@RequestBody ResumeDetailsEntity resumeDetailsEntity) {
		return resumeService.addResume (resumeDetailsEntity);
	}
	
	@RequestMapping (value = "/api/getResume", method = RequestMethod.GET)
	@ResponseBody
	public ResumeDetailsEntity getResumeDetails (@RequestParam int id) {
		ResumeDetailsEntity resumeDetailsEntity = resumeService.getResume (id);
		return resumeDetailsEntity;
	}
}





