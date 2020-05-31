package com.prueba.test.Persistencia;
import java.sql.Connection;
import com.prueba.test.Dominio.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
public class ClientesDAO {
	
	public void create_data(int id,String name,String email){
		DB_Connection obj_DB_Connection=new DB_Connection();
		Connection connection=obj_DB_Connection.get_connection();
		PreparedStatement ps=null;
		try {
			String query="insert into clientes(idclientes,nomclientes,emailclientes) values (?,?,?)";
			ps=connection.prepareStatement(query);
			ps.setInt(1,id);
			ps.setString(2, name);
			ps.setString(3, email);
			System.out.println(ps);
			ps.executeUpdate();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public void create_dataObj(Clientes clinew){
		DB_Connection obj_DB_Connection=new DB_Connection();
		Connection connection=obj_DB_Connection.get_connection();
		PreparedStatement ps=null;
		try {
			String query="insert into clientes(idclientes,nomclientes,emailclientes) values (?,?,?)";
			ps=connection.prepareStatement(query);
			ps.setInt(1,clinew.getId());
			ps.setString(2, clinew.getNombre());
			ps.setString(3, clinew.getEmail());
			System.out.println(ps);
			ps.executeUpdate();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	public void read_data(int id){
		DB_Connection obj_DB_Connection=new DB_Connection();
		Connection connection=obj_DB_Connection.get_connection();
		PreparedStatement ps=null;
		ResultSet rs=null;
		try {
			String query="select * from clientes where idclientes="+id;
			ps=connection.prepareStatement(query);
			//ps.setString(1, sl_no);
			System.out.println(ps);
			rs=ps.executeQuery();
			while(rs.next()){
	                    System.out.print("ID     -"+rs.getInt("idclientes"));
	                    System.out.print("Nombre -"+rs.getString("nomclientes"));
	                    System.out.println("email  -"+rs.getString("emailclientes"));
	                    System.out.println("---------------");
			}
		} catch (SQLException e) {
			System.out.println(e);
		}
	}

	public void update_data(int id,int new_id,String nombre,String email){
		DB_Connection obj_DB_Connection=new DB_Connection();
		Connection connection=obj_DB_Connection.get_connection();
		PreparedStatement ps=null;
		try {
			String query="update clientes set idclientes=?,nomclientes=?,emailclientes=? where idclientes=?";
			ps=connection.prepareStatement(query);
			ps.setInt(1, new_id);
			ps.setString(2, nombre);
			ps.setString(3, email);
			ps.setInt(4, id);
			System.out.println(ps);
			ps.executeUpdate();
		} catch (SQLException e) {
			System.out.println(e);
		}
	}

	public void delete_data(int id){
		DB_Connection obj_DB_Connection=new DB_Connection();
		Connection connection=obj_DB_Connection.get_connection();
		PreparedStatement ps=null;
		try {
			String query="delete from clientes where idclientes=?";
			ps=connection.prepareStatement(query);
			ps.setInt(1, id);
			System.out.println(ps);
			ps.executeUpdate();
		} catch (SQLException e) {
			System.out.println(e);
		}

	}
}
