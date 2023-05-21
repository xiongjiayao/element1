package com.qiqi.mybatis.pojo;

public class School {
    private Integer sid;
    private String schoolname;

    public School() {
    }

    public School(Integer id, String schoolname) {
        this.sid = id;
        this.schoolname = schoolname;
    }

    public Integer getId() {
        return sid;
    }

    public void setId(Integer sid) {
        this.sid = sid;
    }

    public String getSchoolname() {
        return schoolname;
    }

    public void setSchoolname(String schoolname) {
        this.schoolname = schoolname;
    }

    @Override
    public String toString() {
        return "school{" +
                "id=" + sid +
                ", schoolname='" + schoolname + '\'' +
                '}';
    }
}
