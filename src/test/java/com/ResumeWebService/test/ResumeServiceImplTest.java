package com.ResumeWebService.test;

import org.junit.Test;

import com.ResumeWebService.entity.ResumeDetailsEntity;
import com.ResumeWebService.service.impl.ResumeServiceImpl;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;


public class ResumeServiceImplTest {
	ResumeServiceImpl resumeServiceImpl = new ResumeServiceImpl();

	@BeforeClass
	public static void setUpClass() {
	}

	@AfterClass
	public static void tearDownClass() {
	}

	@Before
	public void SetUp() {
		assertEquals (0, resumeServiceImpl.getSize());
	}

	@After
	public void TearDown() {
		resumeServiceImpl.emptyHashMap ();
	}
	
	// Initially there are no resume
	@Test(expected = NullPointerException.class)
	public void NullPointerExceptionIfNoResumeIsAdded () {
		boolean a = resumeServiceImpl.getResume(1).equals(null);
		assertEquals(true, a);
	}
	
	// Add a resume and retrieve it. check if it matches.
	@Test
	public void AddedResumeShouldBeSameAsExpectedResume () {
		ResumeDetailsEntity expectedResume  = new ResumeDetailsEntity ("Rana","Software Developer","E Commerce","Works Applications");
		resumeServiceImpl.addResume(expectedResume);
		ResumeDetailsEntity actualResume = resumeServiceImpl.getResume(1);
		assertEquals (expectedResume, actualResume);
	}
}
