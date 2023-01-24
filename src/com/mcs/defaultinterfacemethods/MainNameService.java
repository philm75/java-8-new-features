package com.mcs.defaultinterfacemethods;

import com.mcs.java.methodreferences.Name;

public class MainNameService {

	public static void main(String[] args) {
		String myName = "Phil";
		Name name = new Name(myName);
		NameService nameService = new NameServiceImpl();
		nameService.addName(name);
		nameService.getName(myName);
		nameService.updateName(name);
		
		// Default interface method
		nameService.printName(name);
		
		// Static interface method
		NameService.toUpperCase(myName);
	}
}
