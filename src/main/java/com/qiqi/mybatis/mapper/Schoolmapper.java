package com.qiqi.mybatis.mapper;

import com.qiqi.mybatis.pojo.Course;
import com.qiqi.mybatis.pojo.School;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface Schoolmapper {
//    public List<School> getSchool();
List<Course> getAllCourseFrom1(@Param("schoo_lname") String schoo_lname);
}
