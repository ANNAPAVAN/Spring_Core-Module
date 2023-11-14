package com.pavan.scopes;
import java.util.*;
import org.springframework.beans.factory.ObjectFactory;
import org.springframework.beans.factory.config.Scope;

public class ThreadScope implements Scope {
	Map<String,Object> scope = null;
	CustomThreadLocal threadLocale = new CustomThreadLocal();
	
	@Override
	public Object get(String name, ObjectFactory<?> objectFactory) {
		scope = (Map<String,Object>)threadLocale.get();
		Object obj = scope.get(name);
		if(obj==null) {
			obj = objectFactory.getObject();
			scope.put(name, obj);
		}
		return obj;
	}

	@Override
	public Object remove(String name) {
		Object obj = scope.remove(name);
		
		return obj;
	}

	@Override
	public void registerDestructionCallback(String name, Runnable callback) {
		// TODO Auto-generated method stub

	}

	@Override
	public Object resolveContextualObject(String key) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getConversationId() {
		// TODO Auto-generated method stub
		return null;
	}

}
