package com.sample.seventh;

import java.util.HashMap;

import java.util.Map;



public class MyHashMap {

	public static void main(String[] args) {
		
		HashMap<Integer, String> hashMap=new HashMap<Integer, String>();
		hashMap.put(1, "Ashna");
		hashMap.put(2, "Prathyusha");
		hashMap.put(3, "Birappa");
		hashMap.put(4, "Roshan");
		StringBuilder stringBuilder=new StringBuilder();
		for(Map.Entry<Integer, String> entry:hashMap.entrySet()){
			stringBuilder.append(entry.getKey());
			//stringBuilder.append(" : ");
			stringBuilder.append(entry.getValue());
			//stringBuilder.append("\n");
		}
		System.out.println(hashMap);
		System.out.println(hashMap.entrySet());
		System.out.println(stringBuilder);
	}

}
