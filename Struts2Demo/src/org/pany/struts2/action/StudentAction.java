package org.pany.struts2.action;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;
import com.pany.dao.Dao;
import com.pany.po.Student;

public class StudentAction {
	private Integer id;
	private String dece;
	private String love;
	private String username;
	private List resultList;//
	private StudentAction sa;//
	public StudentAction getSa() {
		return sa;
	}
	public void setSa(StudentAction sa) {
		this.sa = sa;
	}
	public List getResultList() {
		return resultList;
	}
	public void setResultList(List resultList) {
		this.resultList = resultList;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getDece() {
		return dece;
	}
	public void setDece(String dece) {
		this.dece = dece;
	}
	public String getLove() {
		return love;
	}
	public void setLove(String love) {
		this.love = love;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	
	public String execute(){
		Dao dao = new Dao();
		Student st = new Student();		
		st.setDece(sa.getDece());
		st.setLove(sa.getLove());
		st.setUsername(sa.getUsername());		
		dao.insert(st);
		return "suc";
	}
	
	public String find(){		
		ActionContext ctx = ActionContext.getContext();		
		Dao dao = new Dao();
		try {
			resultList = dao.find();			
			return "suc";
		} catch (Exception e) {
			// TODO: handle exception
			return "error";
		}		
	}
	
	public String delete(){
		Dao dao = new Dao();
		HttpServletRequest request = ServletActionContext.getRequest(); 
		ActionContext ctx = ActionContext.getContext();		
		Map m = ctx.getParameters();		
		String id = request.getParameter("id");
		int ID = 0;
		ID = Integer.valueOf(id);
		dao.delete(ID);
		return "suc";
	}
	
	public String edit(){
		Dao dao = new Dao();
		HttpServletRequest request = ServletActionContext.getRequest(); 
		ActionContext ctx = ActionContext.getContext();		
		Map m = ctx.getParameters();		
		String id = request.getParameter("id");
		int ID = 0;
		ID = Integer.valueOf(id);
		sa = dao.edit(ID);		
		return "suc";
	}
	
	public String update(){
		Dao dao = new Dao();
		Student st = new Student();
		HttpServletRequest request = ServletActionContext.getRequest(); 
		ActionContext ctx = ActionContext.getContext();		
		Map m = ctx.getParameters();		
		String ms = (String)m.get("saveStudent_sa_id");
		int ID = 0;			
		st.setDece(sa.getDece());
		st.setId(sa.getId());
		st.setLove(sa.getLove());
		st.setUsername(sa.getUsername());		
		dao.saveOrUpdate(st);
		return "suc";
	}
}
