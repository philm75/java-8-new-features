package com.mcs.java.methodreferences;

import java.util.Comparator;

public class NameComparator implements Comparator<Name> {
	 
    @Override
    public int compare(Name a, Name b) {
        return a.getName().compareTo(b.getName());
    }
 
}