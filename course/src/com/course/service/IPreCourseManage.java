package com.course.service;

import java.util.List;

import com.course.entity.Course;
import com.course.entity.PreCourse;

public interface IPreCourseManage {
	public boolean addPreCourse(PreCourse pcos);

	// public void modifyPreCourse(PreCourse pcos);
	public void deletePreCourse(Course cos);

	public List<PreCourse> queryPreCourse(Course cos);

	public List<PreCourse> queryAllPreCourseRelations();

	public void approvePreCourse(Course cos, int isApprove);
}
