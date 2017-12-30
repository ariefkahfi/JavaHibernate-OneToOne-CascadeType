/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arief.belajar.testhibernate2.entity.bidirectional.onetoone;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

/**
 *
 * @author arief
 */
@Entity
@javax.persistence.Table(name="table_student")
public class Table implements Serializable {
    
    @Id
    @Column(name="table_id")
    @GeneratedValue
    private int tableId;
    
    @Column(name="table_name")
    private String tableName;
    
    
    @OneToOne(mappedBy = "table",fetch = FetchType.LAZY)
    private Student student;

    public int getTableId() {
        return tableId;
    }

    public void setTableId(int tableId) {
        this.tableId = tableId;
    }

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    @Override
    public String toString() {
        return "Table{" + "tableId=" + tableId + ", tableName=" + tableName + '}';
    }

    
    
    
}
