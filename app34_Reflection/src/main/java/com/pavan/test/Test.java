package com.pavan.test;

import com.pavan.entity.*;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.beans.Introspector;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import java.beans.Introspector;
import java.beans.BeanInfo;
import java.beans.PropertyDescriptor;
import java.beans.MethodDescriptor;

public class Test {

	public static void main(String[] args) throws Exception{
		
		//REFLECTION

//		Class c = Class.forName("com.pavan.entity.Employee");
//		System.out.println(c.getName());   //com.pavan.entity.Employee
//		
//		Employee emp = new Employee();
//		Class c2 = emp.getClass();
//		System.out.println(c2.getName());  //com.pavan.entity.Employee
//		
//		Class c3 = Employee.class;
//		System.out.println(c3.getName());  //com.pavan.entity.Employee
//--------------------------------------------------------------------------------------------------------------------------------------
//		Class c = Class.forName("com.pavan.entity.Employee");
//		System.out.println("Class Name:"+c.getName());          //Class Name:com.pavan.entity.Employee
//		System.out.println("Super Class:"+c.getSuperclass());  //Super Class:class java.lang.Object
//		System.out.print("Interfaces:");
//		Class cls[] = c.getInterfaces();
//		for(Class cc:cls)
//		{
//			System.out.print(cc.getName()+" ");  //Interfaces:java.io.Serializable java.lang.Cloneable
//		}
//		System.out.println();
//		System.out.print("Variables : ");
//		Field flds[] = c.getDeclaredFields();
//		for(Field f:flds)
//		{
//			System.out.print(f.getName()+" ");   //Variables : eno ename esal eaddr 
//		}
//		System.out.println();
//		System.out.print("Constructors : ");
//		Constructor[] cons = c.getDeclaredConstructors();
//		for(Constructor ctr:cons)
//		{
//			System.out.print(ctr.getName()+' '); //Constructors : com.pavan.entity.Employee com.pavan.entity.Employee 
//		}
//		System.out.println();
//		System.out.print("Methods : ");
//		Method[] mtd = c.getDeclaredMethods();
//		for(Method m:mtd)
//		{
//			System.out.print(m.getName()+" ");  //Methods : add update delete search 
//		}
//--------------------------------------------------------------------------------------------------------------------------------------------
		
		     // INTROSPECTOR
		
			BeanInfo beaninfo = Introspector.getBeanInfo(EmployeeBean.class);
			PropertyDescriptor[] propertyDescriptor = beaninfo.getPropertyDescriptors();
			for(PropertyDescriptor pd:propertyDescriptor)
			{
				System.out.println(pd);
			}

/*			//OUTPUT
 
		java.beans.PropertyDescriptor[name=class; values={expert=false; visualUpdate=false; hidden=false; enumerationValues=[Ljava.lang.Object;@340f438e; required=false}; propertyType=class java.lang.Class; readMethod=public final native java.lang.Class java.lang.Object.getClass()]
		java.beans.PropertyDescriptor[name=eaddr; values={expert=false; visualUpdate=false; hidden=false; enumerationValues=[Ljava.lang.Object;@7e0ea639; required=false}; propertyType=class java.lang.String; readMethod=public java.lang.String com.pavan.entity.EmployeeBean.getEaddr(); writeMethod=public void com.pavan.entity.EmployeeBean.setEaddr(java.lang.String)]
		java.beans.PropertyDescriptor[name=ename; values={expert=false; visualUpdate=false; hidden=false; enumerationValues=[Ljava.lang.Object;@3d24753a; required=false}; propertyType=class java.lang.String; readMethod=public java.lang.String com.pavan.entity.EmployeeBean.getEname(); writeMethod=public void com.pavan.entity.EmployeeBean.setEname(java.lang.String)]
		java.beans.PropertyDescriptor[name=eno; values={expert=false; visualUpdate=false; hidden=false; enumerationValues=[Ljava.lang.Object;@59a6e353; required=false}; propertyType=int; readMethod=public int com.pavan.entity.EmployeeBean.getEno(); writeMethod=public void com.pavan.entity.EmployeeBean.setEno(int)]
		java.beans.PropertyDescriptor[name=esal; values={expert=false; visualUpdate=false; hidden=false; enumerationValues=[Ljava.lang.Object;@7a0ac6e3; required=false}; propertyType=float; readMethod=public float com.pavan.entity.EmployeeBean.getEsal(); writeMethod=public void com.pavan.entity.EmployeeBean.setEsal(float)]
*/
			
			for(PropertyDescriptor pd:propertyDescriptor)
			{
				System.out.println("Property Name        : "+pd.getName());
				System.out.println("Property Type        : "+pd.getPropertyType());
				System.out.println("Property Read Method : "+pd.getReadMethod());
				System.out.println("Property Write Method: "+pd.getWriteMethod());
				System.out.println("-----------------------------------");
				
			}
/*					
				Property Name        : class
				Property Type        : class java.lang.Class
				Property Read Method : public final native java.lang.Class java.lang.Object.getClass()
				Property Write Method: null
				-----------------------------------
				Property Name        : eaddr
				Property Type        : class java.lang.String
				Property Read Method : public java.lang.String com.pavan.entity.EmployeeBean.getEaddr()
				Property Write Method: public void com.pavan.entity.EmployeeBean.setEaddr(java.lang.String)
				-----------------------------------
				Property Name        : ename
				Property Type        : class java.lang.String
				Property Read Method : public java.lang.String com.pavan.entity.EmployeeBean.getEname()
				Property Write Method: public void com.pavan.entity.EmployeeBean.setEname(java.lang.String)
				-----------------------------------
				Property Name        : eno
				Property Type        : int
				Property Read Method : public int com.pavan.entity.EmployeeBean.getEno()
				Property Write Method: public void com.pavan.entity.EmployeeBean.setEno(int)
				-----------------------------------
				Property Name        : esal
				Property Type        : float
				Property Read Method : public float com.pavan.entity.EmployeeBean.getEsal()
				Property Write Method: public void com.pavan.entity.EmployeeBean.setEsal(float)
				-----------------------------------
	*/
					
		  MethodDescriptor[] md = beaninfo.getMethodDescriptors();
		  for(MethodDescriptor mm:md)
		  {
			  System.out.println(mm);
		  }
			 		
/*		OUTPUT
 	
		          java.beans.MethodDescriptor[name=getClass; method=public final native java.lang.Class java.lang.Object.getClass()]
				  java.beans.MethodDescriptor[name=setEsal; method=public void com.pavan.entity.EmployeeBean.setEsal(float)]
				  java.beans.MethodDescriptor[name=setEno; method=public void com.pavan.entity.EmployeeBean.setEno(int)]
				  java.beans.MethodDescriptor[name=getEsal; method=public float com.pavan.entity.EmployeeBean.getEsal()]
				  java.beans.MethodDescriptor[name=getEno; method=public int com.pavan.entity.EmployeeBean.getEno()]
				  java.beans.MethodDescriptor[name=setEname; method=public void com.pavan.entity.EmployeeBean.setEname(java.lang.String)]
				  java.beans.MethodDescriptor[name=wait; method=public final void java.lang.Object.wait() throws java.lang.InterruptedException]
				  java.beans.MethodDescriptor[name=notifyAll; method=public final native void java.lang.Object.notifyAll()]
				  java.beans.MethodDescriptor[name=notify; method=public final native void java.lang.Object.notify()]
				  java.beans.MethodDescriptor[name=wait; method=public final void java.lang.Object.wait(long,int) throws java.lang.InterruptedException]
				  java.beans.MethodDescriptor[name=hashCode; method=public native int java.lang.Object.hashCode()]
				  java.beans.MethodDescriptor[name=getEname; method=public java.lang.String com.pavan.entity.EmployeeBean.getEname()]
				  java.beans.MethodDescriptor[name=wait; method=public final native void java.lang.Object.wait(long) throws java.lang.InterruptedException]
				  java.beans.MethodDescriptor[name=equals; method=public boolean java.lang.Object.equals(java.lang.Object)]
				  java.beans.MethodDescriptor[name=toString; method=public java.lang.String java.lang.Object.toString()]
				  java.beans.MethodDescriptor[name=getEaddr; method=public java.lang.String com.pavan.entity.EmployeeBean.getEaddr()]
				  java.beans.MethodDescriptor[name=setEaddr; method=public void com.pavan.entity.EmployeeBean.setEaddr(java.lang.String)]			
*/					
					

	}

}
