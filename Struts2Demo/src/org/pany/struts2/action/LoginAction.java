package org.pany.struts2.action;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport {
	private String userName;
	private String passWord;
	private List list ;
	public List getList() {
		return list;
	}
	public void setList(List list) {
		this.list = list;
	}
	@Override
	public String execute() throws Exception {
		// �ڴ˴������жϣ�������ݺϷ�������ת���ɹ�ҳ
		if (getUserName().equals("pany") && getPassWord().equals("pany")) {			
			ActionContext context =  ActionContext.getContext();
			context.put("userName", getUserName());
			list = new ArrayList();
			Map map = new HashMap();
			list.add("pany");
			list.add("pany2");
			list.add("pany3");
			map.put("1", "panyMap1");
			map.put("2", "panyMap2");
			map.put("3", "panyMap");
			
			context.put("p", list);
			context.put("m", map);
			System.out.println("success");
			return "success";
		} else {
			return "error";			
		}
		/*List list = new ArrayList();
		Map map = new HashMap();
		list.add("pany");
		list.add("pany2");
		list.add("pany3");
		map.put("1", "panyMap1");
		map.put("2", "panyMap2");
		map.put("3", "panyMap");
		ActionContext context =  ActionContext.getContext();
		context.put("p", list);
		context.put("m", map);
		return "success";*/
	}
	
	
	public String test(){
		return "Success";
	}
	
	public String delete(){
		System.out.println("���뷽����");
		ActionContext text = ActionContext.getContext();
		text.getSession().put("delete", "�Զ���Action");
		return ActionSupport.LOGIN;
	}
	public void validate(){
		System.out.println("enter Validate Method");
		if(userName == null || userName.equals("")){
			addFieldError("user", "�û�����Ϊ��");
		}
	}
	public String getPassWord() {
		return passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}


}
