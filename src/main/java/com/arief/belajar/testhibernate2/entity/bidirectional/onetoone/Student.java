/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arief.belajar.testhibernate2.entity.bidirectional.onetoone;

import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

/**
 *
 * @author arief
 */
@Entity
@javax.persistence.Table(name="student")
public class Student implements Serializable {
    
    @Id
    @Column(name="student_id")
    private String studentId;
 
    @Column(name="student_name")
    private String studentName;
    
    @OneToOne(fetch = FetchType.LAZY,cascade = {CascadeType.ALL})
    @JoinColumn(name="table_id")
    private Table table;

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public Table getTable() {
        return table;
    }

    public void setTable(Table table) {
        this.table = table;
    }

    @Override
    public String toString() {
        return "Student{" + "studentId=" + studentId + ", studentName=" + studentName + '}';
    }

        
    
    
    
    
}
