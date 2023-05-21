package com.qiqi.mybatis.test;

import com.qiqi.mybatis.mapper.Coursemapper;
import com.qiqi.mybatis.pojo.Course;
import com.qiqi.mybatis.pojo.School;
import com.qiqi.mybatis.utils.SqlSessionUtils;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class ResultMapper {
    @Test //查询id=2的课程信息
    public void testCourseAndSchool(){
        SqlSession sqlSession= SqlSessionUtils.getSqlSession();
        Coursemapper mapper=sqlSession.getMapper(Coursemapper.class);
        Course course =mapper.getCourseAndSchool(2);
        System.out.println("查询id=2的课程信息结果如下：");
        System.out.println(course);
    }

//查询所有课程信息
    @Test
    public void testgetAllCourse(){
        SqlSession sqlSession= SqlSessionUtils.getSqlSession();
        Coursemapper mapper=sqlSession.getMapper(Coursemapper.class);
        List<Course> result = mapper.getAllCourse();
        for(Course course:result){
            System.out.println(course);
        }
    }
            //查询计算机学院开设的课程
    @Test
    public void testgetAllCourseFrom1(){
        SqlSession sqlSession= SqlSessionUtils.getSqlSession();
        Coursemapper mapper=sqlSession.getMapper(Coursemapper.class);
      List<Course> result = mapper.getAllCourseFrom1(1);

      System.out.println("计算机学院开设的课程信息为：");
      for(Course course:result){
            System.out.println(course);
        }
    }

}
