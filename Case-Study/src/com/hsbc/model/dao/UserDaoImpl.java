package com.hsbc.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.hsbc.controller.beans.Contacts;
import com.hsbc.controller.beans.User;
import com.hsbc.model.utility.JDBC;

public class UserDaoImpl implements UserDao {

	
	@Override // login part
	public User authentication(int userid,String password) {
		
		User u=null;
		Connection con=JDBC.getConnection();
		String query="Select * from people where user_id=? and password=?";
		try
		{
			PreparedStatement ps=con.prepareStatement(query);
			ps.setInt(1, userid);
			ps.setString(2, password);
			ResultSet rs=ps.executeQuery();
			if(rs.next())
			{
				u=new User();
				u.setUserid(rs.getInt(1));
				u.setName(rs.getString(2));
				u.setPassword(rs.getString(3));
				u.setPhone(rs.getLong(4));
				u.setDob(rs.getString(5));
			}
			rs.close();
			ps.close();
			con.close();
		}
		catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		return u;
	}

	@Override // storing part
	public User store(User user) {
		int id = 0;
		Connection con=JDBC.getConnection();
		PreparedStatement ps;
		try
		{
			ps = con.prepareStatement("values(next value for people_seq)");
			ResultSet rs=ps.executeQuery();
			if(rs.next())
			{
				id=rs.getInt(1);
			}
			ps=con.prepareStatement("insert into people values(?,?,?,?,?)");
			user.setUserid(id);
			ps.setInt(1, id);
			ps.setString(2,user.getName());
			ps.setString(3,user.getPassword());
			ps.setLong(4, user.getPhone());
			ps.setString(5, user.getDob());
			ps.executeUpdate();
			ps.close();
			con.close();
		}
		catch (SQLException e)
		{
			System.out.println(e.getMessage());
		}
		return user;
	}

	@Override // Edit Profile part
	public int editProfile(User user,String password,long contact)
	{
		Connection con=JDBC.getConnection();
		int status=0;
		PreparedStatement ps;
		try
		{
			ps=con.prepareStatement("update people set password=? and phone=? where user_id=?");
			ps.setString(1,password);
			ps.setLong(2,contact);
			ps.setInt(3,user.getUserid());
			status=ps.executeUpdate();			
			ps.close();
			con.close();
		}
		catch (SQLException e)
		{
			System.out.println(e.getMessage());
		}
		return status;
	}

	@Override // ADD contact part
	public int addContacts(User u,String name,long phone) {
		Connection con=JDBC.getConnection();
		int id = 0;
		PreparedStatement ps;
		try
		{
			ps = con.prepareStatement("values(next value for contact_seq)");
			ResultSet rs=ps.executeQuery();
			if(rs.next())
			{
				id=rs.getInt(1);
			}
			ps=con.prepareStatement("insert into people_contacts values(?,?,?,?)");
			ps.setInt(1, id);
			ps.setString(2,name);
			ps.setLong(3,phone);
			ps.setLong(4, u.getUserid());
			ps.executeUpdate();
			ps.close();
			con.close();
		}
		catch (SQLException e)
		{
			System.out.println(e.getMessage());
		}
		return id;
	}

	@Override // Edit Contact part
	public int editContacts(User user,String name,long phone)
	{
		Connection con=JDBC.getConnection();
		int status=0;
		String query="Update people_contacts set name=? and contact=? where user_id=? ";
		try
		{
			PreparedStatement ps=con.prepareStatement(query);
			ps.setString(1,name);
			ps.setLong(2,phone);
			ps.setInt(3,user.getUserid());
			status=ps.executeUpdate();
			ps.close();
			con.close();
		}
		catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		return status;
	}

	@Override // ALL contacts details
	public List<Contacts> viewContacts(User user) {
		Connection con=JDBC.getConnection();
		String query="Select * from people_contacts where user_id=?";
		List<Contacts> l=new ArrayList<>();	
		try
		{
			PreparedStatement ps=con.prepareStatement(query);
			ps.setInt(1,user.getUserid());
			ResultSet rs=ps.executeQuery();
			if(rs.next())
			{
				l.add(new Contacts(rs.getString(2),rs.getLong(3)));
			}
			rs.close();
			ps.close();
			con.close();
		}
		catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		return l;
	}

	@Override // Delete Contacts
	public int deleteContacts(User user,int contactid)
	{
		int status=0;
		Connection con=JDBC.getConnection();
		String query="delete from people_contacts where contact_id=? ";
		try
		{
			PreparedStatement ps=con.prepareStatement(query);
			ps.setInt(1,contactid);
			status=ps.executeUpdate();
			System.out.println(status);
			ps.close();
			con.close();
		}
		catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		return status;
	}

	@Override // Delete Profile
	public User deleteProfile(User user) {
		Connection con=JDBC.getConnection();
		String query="delete from people_contacts where user_id=? "; // contact book deletion
		try
		{
			PreparedStatement ps=con.prepareStatement(query);
			ps.setInt(1, user.getUserid());
			ps.execute();
			query="delete from people where user_id=? "; // profile deletion
			ps=con.prepareStatement(query);
			ps.setInt(1, user.getUserid());
			ps.execute();
			ps.close();
			con.close();
		}
		catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		return user;
	}

	@Override // Check contact id--->part of some logic.
	public int checkContactId(int id) {
		Connection con=JDBC.getConnection();
		String query="Select * from people_contacts where contact_id=?";
		try
		{
			PreparedStatement ps=con.prepareStatement(query);
			ps.setInt(1,id);
			ResultSet rs=ps.executeQuery();
			if(rs.next())
			{
				return(1);
			}
			rs.close();
			ps.close();
			con.close();
		}
		catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		return 0;
	}

}
