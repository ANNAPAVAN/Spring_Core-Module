package com.pavan.beans;
import java.util.*;

public class City_State_Collection {
	public ArrayList<City_State> cityState = new ArrayList<>();
	public ArrayList<City_State> getCityState()
	{
		City_State c1 = new City_State();
		c1.setCity("hyd");
		c1.setState("Telangana");
		
		City_State c2 = new City_State();
		c2.setCity("Ananthapur");
		c2.setState("Andhra");
		
		City_State c3 = new City_State();
		c3.setCity("Wgl");
		c3.setState("Telangana");
		
		City_State c4 = new City_State();
		c4.setCity("Vizag");
		c4.setState("Andhra");
		
		City_State c5 = new City_State();
		c5.setCity("Karimnagar");
		c5.setState("Telangana");
		
		City_State c6 = new City_State();
		c6.setCity("Thirupathi");
		c6.setState("Andhra");
		
		cityState.add(c1);
		cityState.add(c2);
		cityState.add(c3);
		cityState.add(c4);
		cityState.add(c5);
		cityState.add(c6);
		return cityState;
	}
}
