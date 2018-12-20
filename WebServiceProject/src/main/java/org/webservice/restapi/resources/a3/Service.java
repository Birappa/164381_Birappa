package org.webservice.restapi.resources.a3;

import java.util.HashMap;

import java.util.Map;

public class Service {
	Map<Integer,Info> info;
	
	public Service() {
		info=new HashMap<Integer, Info>();  
		info.put(560048, new Info("Bangalore","Karnataka","India"));
		info.put(413304, new Info("Mumbai","Maharashtra","India"));
		info.put(413006, new Info("Solapur","Maharashtra","India"));
	}

	public Info getInfo(Integer zipcode){
		return info.get(zipcode);
	}
}
