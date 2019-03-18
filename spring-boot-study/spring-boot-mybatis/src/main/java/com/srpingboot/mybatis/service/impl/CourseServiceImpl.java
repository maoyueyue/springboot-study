package com.srpingboot.mybatis.service.impl;

import com.srpingboot.mybatis.entity.Course;
import com.srpingboot.mybatis.mapper.CourseMapper;
import com.srpingboot.mybatis.service.CourseService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class CourseServiceImpl implements CourseService {
    @Resource
    private CourseMapper courseMapper;


    @Override
    public List<Course> selectAll() {
        return courseMapper.selectAll();
    }

    @Override
    public Course getOne(long courseId) {
        return courseMapper.getOne(courseId);
    }

    @Override
    public void delete(long courseId) {
        courseMapper.delete(courseId);
    }
}
