 package com.hsbc.controller;

import java.io.*;
import java.util.ArrayList;

public class Serialization {

	public static void main(String[] args) {
		
		User u1=new User(10,"ronak",741,123);
		User u2=new User(20,"amisha",741,113);
		User u3=new User(30,"paal",741,123);
		User u4=new User(40,"kullu",741,124);
		User u5=new User(50,"john",741,123);
		ArrayList<User> arr=new ArrayList();
		arr.add(u1);
		arr.add(u2);
		arr.add(u3);
		arr.add(u4);
		arr.add(u5);
		FileOutputStream fos;
		try
		{
			fos = new FileOutputStream("d:/mol.txt",true);
			ObjectOutputStream objj=new ObjectOutputStream(fos);
			objj.writeObject(arr);
			objj.close();
			fos.close();
			System.out.println("Process done");
		} 
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
