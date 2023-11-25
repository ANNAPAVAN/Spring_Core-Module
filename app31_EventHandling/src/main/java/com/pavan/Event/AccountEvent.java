package com.pavan.Event;
import org.springframework.context.ApplicationEvent;
import java.io.*;
import java.util.*;

public class AccountEvent extends ApplicationEvent {
	public String message;
	public static FileOutputStream fos;
	static
	{
		try {
			fos = new FileOutputStream("C://Spring/logs/log.txt");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public AccountEvent(Object obj,String message)
	{
		super(obj);
		this.message = message;
	}
	
	public void generateLog()
	{
		try {
			message = new Date().toString()+" : "+message+"\n";
			byte[] b = message.getBytes();
			fos.write(b);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
