package com.srpingboot.mybatis.service;

import com.srpingboot.mybatis.entity.Course;

import java.util.List;

public interface CourseService {
    List<Course> selectAll();
    Course getOne(long courseId);
    void delete(long courseId);


}
