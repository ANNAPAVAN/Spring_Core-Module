package com.pavan.scopes;
import java.util.*;
public class CustomThreadLocal extends ThreadLocal<Object> {
	
	protected Object initialValue()
	{
		return new HashMap<String,Object>();
	}
}
