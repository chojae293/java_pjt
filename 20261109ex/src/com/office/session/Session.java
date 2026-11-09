package com.office.session;

import java.util.HashMap;

public class Session {
	
	private static Session session;
	
	final private HashMap<String, Object> attribute;
	
	private Session() {
		attribute = new HashMap<String, Object>();
	}
	
	public static Session getInstance() {
		if(session == null)
			session = new Session();
		
		return session;
		
	}


	public HashMap<String, Object> getAttributies() {
		return attribute;
	}
	
	public void setAttribute(String name, Object object) {             //여기 set은 값을 바꾸는게 아니다.
		attribute.put(name, object);
	}
	
	public void removeAttribute(String name) {
		attribute.remove(name);
	}

}
