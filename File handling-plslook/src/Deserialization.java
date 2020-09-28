package com.hsbc.controller;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

public class Deserialization {

	public static void main(String[] args) throws ClassNotFoundException {
		FileInputStream fin;
		try {
			fin = new FileInputStream("d:/mol.txt");
			ObjectInputStream obj=new ObjectInputStream(fin);
		    List<User> ar=(List<User>)obj.readObject();
			for(User temp:ar)
			{
				System.out.println(temp);
			}
			obj.close();
			fin.close();
		} 
		catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		

	}

}
