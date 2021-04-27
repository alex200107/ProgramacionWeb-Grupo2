package pe.edu.upc.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="JaleConductor")
public class JaleConductor {
	@Id
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="dniUser",nullable=false)
	private JaleCenterC CUsuario;
	
	@Column(name="Tdescripcion",length = 45,nullable = false)
	private String Tdescripcion;
	
	@Column(name="numCuenta",nullable = false)
	private int numCuenta;
	
	@Column(name="Msaldo",nullable = false)
	private int Msaldo;
	

	
	public JaleConductor(JaleCenterC CUsuario, String tdescripcion, int numCuenta, int msaldo) {
		super();
		this.CUsuario = CUsuario;
		Tdescripcion = tdescripcion;
		this.numCuenta = numCuenta;
		Msaldo = msaldo;
	}
	public JaleConductor() {
		super();
	}
	public JaleCenterC getId() {
		return CUsuario;
	}
	public void setId(JaleCenterC id) {
		this.CUsuario = id;
	}
	public String getTdescripcion() {
		return Tdescripcion;
	}
	public void setTdescripcion(String tdescripcion) {
		Tdescripcion = tdescripcion;
	}
	public int getNumCuenta() {
		return numCuenta;
	}
	public void setNumCuenta(int numCuenta) {
		this.numCuenta = numCuenta;
	}
	public int getMsaldo() {
		return Msaldo;
	}
	public void setMsaldo(int msaldo) {
		Msaldo = msaldo;
	}
	
	
	
}
