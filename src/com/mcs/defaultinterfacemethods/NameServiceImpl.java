package com.mcs.defaultinterfacemethods;

import com.mcs.java.methodreferences.Name;

public class NameServiceImpl implements NameService {

	@Override
	public void addName(Name name) {
		System.out.println("Added name " + name.getName());
	}

	@Override
	public void updateName(Name name) {
		System.out.println("Updated name " + name.getName());
	}

	@Override
	public Name getName(String name) {
		System.out.println("Getting name " + name);
		return new Name(name);
	}
}
