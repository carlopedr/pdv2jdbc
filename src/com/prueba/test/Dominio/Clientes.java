package com.prueba.test.Dominio;

public class Clientes {
	    private final int id;
	    private String nombre;
	    private String email;

	    public Clientes() {
	        id =0;
	    }

	    public Clientes(int id, String nombre, String email) {
	        this.id = id;
	        this.nombre = nombre;
	        this.email = email;
	    }
	    
	    public int getId() {
	        return id;
	    }

	    public String getNombre() {
	        return nombre;
	    }

	    public String getEmail() {
	        return email;
	    }

	    public void setNombre(String nombre) {
	        this.nombre = nombre;
	    }

	    public void setEmail(String email) {
	        this.email = email;
	    }
	
}
