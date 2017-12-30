/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arief.belajar.testhibernate2;

import com.arief.belajar.testhibernate2.entity.bidirectional.onetoone.Student;
import com.arief.belajar.testhibernate2.entity.bidirectional.onetoone.Table;
import com.arief.belajar.utils.HibernateSetup;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 *
 * @author arief
 */
public class HibernateApp {
    public static void main(String[] args) {
        SessionFactory sessionFactory = HibernateSetup.sessionFactoryInstance();
        
        
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        
        
        
       
        
//        USING CASCADE 
//        Table nine = new Table();
//        nine.setTableName("Table nine");
//        Student zack = new Student();
//        zack.setStudentId("S007");
//        zack.setStudentName("Zack");
//        zack.setTable(nine);
//        
//        
//        session.save(zack);
//        USING CASCADE 


//USING CASCADE
//          Student zack = (Student)session.get(Student.class, "S007");
//          session.remove(zack);
//USING CASCADE
        


        
// session.save(owningRelationship);        
// NOT USING CASCADE (Will error !!! )
// so we must save related association too
// if we dont't use cascadeType on owner relationship
//session.save(relatedAssociation);
        
        session.getTransaction().commit();
        session.close();
        
        
        
    }
}
