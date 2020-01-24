package service;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import model.StudentEntity;

/**
 * Session Bean implementation class StudentEJB
 */
@Stateless
@LocalBean
public class StudentEJB {

   @PersistenceContext
	private EntityManager st;
   
   
	
    public StudentEJB() {
       
    }

    public void addNew(StudentEntity studentEntity) {
    	System.out.println("==adding employee==");
    	st.persist(studentEntity);
    }
}
