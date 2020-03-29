/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package typeone;

import entity.Student;
import java.util.Date;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author DELL
 */
public class TypeOne {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          SessionFactory sessionFactory = new Configuration() .configure("hibernate.cfg.xml").buildSessionFactory();
        Session session = sessionFactory.openSession();//"shimaa", "elnady", new Date()
        Student user=new Student();
        user.setFirstName("shimaa");
        user.setLastName("elnady");
        user.setDepartment("cs");
        session.beginTransaction();
        session.persist(user);
        session.getTransaction().commit();
        System.out.println("user Done");
    }
    
}
