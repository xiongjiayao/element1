package com.qiqi.mybatis.test;

import com.qiqi.mybatis.mapper.Coursemapper;
import com.qiqi.mybatis.pojo.Course;
import com.qiqi.mybatis.pojo.School;
import com.qiqi.mybatis.utils.SqlSessionUtils;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class MyBatisTest {
    @Test //插入一条新的课程记录： names=”大数据存储“，hours=32，schools =1；
    public void testInsert() throws IOException {

        SqlSession sqlSession= SqlSessionUtils.getSqlSession();
        Coursemapper mapper=sqlSession.getMapper(Coursemapper.class);
        int result =mapper.insertcourse();
        System.out.println(result);
    }

    @Test //将 id=4 这⻔课程的课时数修改为 32+8=40
    public void testUpdate() throws IOException{
        SqlSession sqlSession= SqlSessionUtils.getSqlSession();
        Coursemapper mapper=sqlSession.getMapper(Coursemapper.class);
        mapper.updatecourse();
    }

    @Test //查询id=2的课程信息
    public void testCourseAndSchool(){
        SqlSession sqlSession= SqlSessionUtils.getSqlSession();
        Coursemapper mapper=sqlSession.getMapper(Coursemapper.class);
        Course course =mapper.getCourseAndSchool(2);
        System.out.println("查询id=2的课程信息结果如下：");
        System.out.println(course);
    }
    @Test //查询所有课程信息
    public void testgetAllCourse(){
        SqlSession sqlSession= SqlSessionUtils.getSqlSession();
        Coursemapper mapper=sqlSession.getMapper(Coursemapper.class);
        List<Course> result = mapper.getAllCourse();
        System.out.println("查询所有课程信息结果如下：");
        for(Course course:result){
            System.out.println(course);
        }}
    @Test //查询出所有计算机学院开设的课程信息
    public void testgetAllCourseFrom1(){
        SqlSession sqlSession= SqlSessionUtils.getSqlSession();
        Coursemapper mapper=sqlSession.getMapper(Coursemapper.class);
        List<Course> result = mapper.getAllCourseFrom1(1);
        System.out.println("计算机学院开设的课程信息为：");
        for(Course course:result){
            System.out.println(course);}}
}






