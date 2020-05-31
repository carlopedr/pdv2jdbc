package com.prueba.test.Vista;
import com.prueba.test.Persistencia.ClientesDAO;
public class TestConsola {

	public static void main(String[] args) {
		 ClientesDAO objTest=new ClientesDAO();
	        //insert data
		objTest.create_data(805, "Luis", "luis@gmail.com");
		objTest.create_data(905, "Fabio", "fabio@gmail.com");
	        //read data
		objTest.read_data(900);
	        //update data
		objTest.update_data(200, 220, "María", "maria@gmail");
	        //delete data
		objTest.delete_data(10);

	}

}
