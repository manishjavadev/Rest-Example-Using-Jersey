package com.manish.javadev.messenger.database;

import java.util.Arrays;
import java.util.HashMap;

public class HashMapTest {
	public static void main(String[] args) {
		HashMap mp = new HashMap<>();
		mp.put(1, "Manish");
		mp.put(1, "Swaroop");
		System.out.println("Size"+mp.size());
		System.out.println(mp.values());
	}

}
