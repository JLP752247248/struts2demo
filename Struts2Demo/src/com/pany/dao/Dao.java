package com.pany.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.pany.struts2.action.StudentAction;

import com.pany.po.Student;
import com.pany.util.HibernateSessionFactory;

public final class Dao {//把类设置为final有助于提高效率
	public void insert(Object obj){
		Session session = HibernateSessionFactory.getSession();
		Transaction tx = session.beginTransaction();
		try {
			tx.begin();
			session.save(obj);
			tx.commit();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			tx.rollback();
		}finally{
			session.close();
		}
	}
	
	public List<StudentAction> find(){
		Session session = HibernateSessionFactory.getSession();
		Transaction tx = session.beginTransaction();
		List list = new ArrayList();
		try {
			tx.begin();
			list = session.createQuery("from Student").list();
			tx.commit();
			return list;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			
		}finally{
			session.close();
		}
		return null;
	}
	
	public void delete(int id){
		Session session = HibernateSessionFactory.getSession();
		Transaction tx = session.beginTransaction();
		List list = new ArrayList();
		try {
			tx.begin();
			Student student = (Student)session.load(Student.class, id);
			System.out.println(student.getUsername());
			session.delete(student);
			
			tx.commit();
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			
		}finally{
			session.close();
		}
		
	}
	
	public StudentAction edit(int id){
		Session session = HibernateSessionFactory.getSession();
		Transaction tx = session.beginTransaction();
		StudentAction sa = new StudentAction();
		try {
			tx.begin();
			
			Student st = (Student)session.createQuery("from Student s where s.id='"+id+"'").uniqueResult();//查询出单个对象
			sa.setDece(st.getDece());
			sa.setLove(st.getLove());
			sa.setUsername(st.getUsername());
			sa.setId(st.getId());
			tx.commit();
			return sa;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return null;
		}finally{
			session.close();
		}
		
	}
	public void saveOrUpdate(Object obj){
		Session session = HibernateSessionFactory.getSession();
		Transaction tx = session.beginTransaction();		
		try {
			tx.begin();		
			session.saveOrUpdate(obj);
			tx.commit();
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			
		}finally{
			session.close();
		}
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
