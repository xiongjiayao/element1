package com.qiqi.mybatis.mapper;

import com.qiqi.mybatis.pojo.Course;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface Coursemapper {
    int insertcourse();

    Course getcourseById();

    void updatecourse();

    Course getCourseAndSchool(@Param("id") Integer id);   //查询id=4课程以及它对应的学院信息

    List<Course> getAllCourse();


    List<Course> getAllCourseFrom1(@Param("id") Integer id);

}
