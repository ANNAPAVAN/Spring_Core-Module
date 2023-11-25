package com.pavan.test;

import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import com.pavan.beans.*;
import org.springframework.expression.spel.support.StandardEvaluationContext;
import java.util.*;

import java.lang.reflect.*;

public class Test {

	public static void main(String[] args) throws Exception{
/*
		ExpressionParser parser = new SpelExpressionParser();
		Expression expr = parser.parseExpression("10+20");
		System.out.println(expr.getValue());  //30
*/
		
/*		CalculatorBean cal = new CalculatorBean();
		StandardEvaluationContext context = new StandardEvaluationContext(cal);
		ExpressionParser parser = new SpelExpressionParser();
		
		Expression expr1 = parser.parseExpression("num1");
		expr1.setValue(context,10);
		
		Expression expr2 = parser.parseExpression("num2");
		expr2.setValue(context,15);
		
		System.out.println("Num1 : "+cal.getNum1());
		System.out.println("Num2 : "+cal.getNum2());
		System.out.println("Add  : "+cal.add());
		System.out.println("Sub  : "+cal.sub());
		System.out.println("Mul  : "+cal.mul());
		
//    OUTPUT
//			Num1 : 10
//			Num2 : 15
//			Add  : 25
//			Sub  : -5
//			Mul  : 150 
 */
		
		
		//-----------------Spel Fearures---------------------
		
/*       // 1.Expressions
 
		ExpressionParser parser = new SpelExpressionParser();
		Expression expr1 = parser.parseExpression("10 + 10"); //literal expression
		System.out.println(expr1.getValue());

		
		Expression expr2 = parser.parseExpression("'abc' + 'def'"); 
		System.out.println(expr2.getValue());

		
		Expression expr3 = parser.parseExpression("'Spring' matches 'Sp.*'"); //Regular expression
		System.out.println(expr3.getValue());
		
		Expression expr4 = parser.parseExpression("'anna@pavan.com' matches '[a-z]*@pavan.com'"); //literal expression
		System.out.println(expr4.getValue());
 */ 
  
		
		//2.Operators
/*		
		ExpressionParser parser = new SpelExpressionParser();
		Expression expr1 = parser.parseExpression("10*10");   //100
		System.out.println(expr1.getValue());
		
		Expression expr2 = parser.parseExpression("true and true");   //true
		System.out.println(expr2.getValue());
		
		Expression expr3 = parser.parseExpression("true and false");   //false
		System.out.println(expr3.getValue());
		
		Expression expr4 = parser.parseExpression("10==10");  //true
		System.out.println(expr4.getValue());
		
//		Expression expr5 = parser.parseExpression("10 ne 10");
		Expression expr5 = parser.parseExpression("10!=10"); //false
		System.out.println(expr5.getValue());
		
//		Expression expr6 = parser.parseExpression("10 le 20");
		Expression expr6 = parser.parseExpression("10<=20"); //true
		System.out.println(expr6.getValue());
		
		Expression expr7 = parser.parseExpression("10 eq 10?'true condition':'false condition'"); //true condition
		System.out.println(expr7.getValue());
		
		//type operator
		Expression expr8 = parser.parseExpression("T(Thread).MIN_PRIORITY");   // 1
		System.out.println(expr8.getValue());
		
		Expression expr9 = parser.parseExpression("T(java.util.Date).toString()");   // class java.util.Date
		System.out.println(expr9.getValue());
		
		//safe navigation operator
		User user = new User();
		StandardEvaluationContext context = new StandardEvaluationContext(user);
		Expression expr10 = parser.parseExpression("uname?.toUpperCase()");		//in general we have to get Exception
		System.out.println(expr10.getValue(context));  //null
*/		

		
		// 3.Variables
/*		
		CalculatorBean cal = new CalculatorBean();
		ExpressionParser parser = new SpelExpressionParser();
		StandardEvaluationContext context = new StandardEvaluationContext(cal);
		context.setVariable("number1",10);
		context.setVariable("number2", 5);
		Expression expr1 = parser.parseExpression("num1=#number1");
		expr1.getValue(context);
		Expression expr2 = parser.parseExpression("num2=#number2");
		expr2.getValue(context);
		System.out.println(""+cal.add()); //15
		System.out.println(""+cal.sub());  //5
		System.out.println(""+cal.mul());  //150
*/
		
		//4.Method invocation
/*		
		Class c = Class.forName("com.pavan.beans.MyString");
		Method method = c.getDeclaredMethod("reverseString", new Class[] {java.lang.String.class});
		StandardEvaluationContext context = new StandardEvaluationContext();
		context.registerFunction("reverse", method); //reverse -->any logical name
		context.setVariable("str", "anna pavan hyd");
		
		ExpressionParser parser = new SpelExpressionParser();
		Expression expr = parser.parseExpression("#reverse(#str)");
		expr.getValue(context);  // dyh navap anna
		
		expr = parser.parseExpression("new java.util.Date().toString()");
		System.out.println(expr.getValue(context));  //Sat Nov 25 11:00:05 IST 2023
		
		expr = parser.parseExpression("'Anna pavan'.toUpperCase()");
		System.out.println(expr.getValue(context));   //ANNA PAVAN
*/
		
		//5. Collections
		
		City_State_Collection collection = new City_State_Collection();
		StandardEvaluationContext context = new StandardEvaluationContext(collection);
		ExpressionParser parser = new SpelExpressionParser();
		Expression expr = parser.parseExpression("cityState.?[state=='Telangana']");  //will get Telangana information
		ArrayList<City_State> al = (ArrayList<City_State>)expr.getValue(context);
		System.out.println(al);  //[hyd:Telangana, Wgl:Telangana, Karimnagar:Telangana]
				
		
	}

}
