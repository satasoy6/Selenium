package com.syntax.class04;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {

	public static void main(String[] args) {
		
		ListDemo d=new ListDemo();
		List<String> list = d.findElement();
		for(int i=0; i<list.size();i++) {
			
			String text =list.get(i);
			if(text.equals("bye")) {
				System.out.println(text);
			}
		}
		
		
	}
	
	public List<String> findElement() {
		ArrayList<String> list = new ArrayList<>();
		list.add("Hello");
		list.add("Bye");
		list.add("Hello");
		return list;
	}
}
