package com.ssm.demo.entity;

import java.util.Date;
import java.util.List;

/**
 * Created by cyl on 2016/12/23.
 */
public class DemoEntity {
    private int empNo;
    private String eName;
    private String job;
    private int mgr;
    private Date hireDate;
    private int sal;
    private int comm;
    private int deptNo;
    List<DemoEntity> list;

    public int getEmpNo() {
        return empNo;
    }

    public void setEmpNo(int empNo) {
        this.empNo = empNo;
    }

    public String geteName() {
        return eName;
    }

    public void seteName(String eName) {
        this.eName = eName;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public int getMgr() {
        return mgr;
    }

    public void setMgr(int mgr) {
        this.mgr = mgr;
    }

    public Date getHireDate() {
        return hireDate;
    }

    public void setHireDate(Date hireDate) {
        this.hireDate = hireDate;
    }

    public int getSal() {
        return sal;
    }

    public void setSal(int sal) {
        this.sal = sal;
    }

    public int getComm() {
        return comm;
    }

    public void setComm(int comm) {
        this.comm = comm;
    }

    public int getDeptNo() {
        return deptNo;
    }

    public void setDeptNo(int deptNo) {
        this.deptNo = deptNo;
    }

    public List<DemoEntity> getList() {
        return list;
    }

    public void setList(List<DemoEntity> list) {
        this.list = list;
    }

    @Override
    public String toString() {
        return "DemoEntity{" +
                "empNo=" + empNo +
                ", eName='" + eName + '\'' +
                ", job='" + job + '\'' +
                '}';
    }
}
