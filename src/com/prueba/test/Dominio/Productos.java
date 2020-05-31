package com.prueba.test.Dominio;
import java.util.Date;
public class Productos {
	private int idprod;
    private String nombreprod;
    private Date fecha;
	
    public int getIdprod() {
		return idprod;
	}

	public String getNombreprod() {
		return nombreprod;
	}

	public void setNombreprod(String nombreprod) {
		this.nombreprod = nombreprod;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public void setIdprod(int idprod) {
		this.idprod = idprod;
	}

	@Override
	public String toString() {
		return "Productos [idprod=" + idprod + ", nombreprod=" + nombreprod + ", fecha=" + fecha + "]";
	}
    
}
