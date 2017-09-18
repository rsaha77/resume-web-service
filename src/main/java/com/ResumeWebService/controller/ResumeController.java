package com.ResumeWebService.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ResumeWebService.entity.ResumeDetailsEntity;
import com.ResumeWebService.service.spec.ResumeService;

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





