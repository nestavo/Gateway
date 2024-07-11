package com.api.cone.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import jakarta.persistence.Id;

	@Data
	@Entity
	@Table (name ="Productos")
	@Getter
	@Setter
	
	public class Modelo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String NombreProd;
	private String Descripcion;
	private double precio;
	private int stock;
	private String categoria;
	private double descuento;
	private byte[] foto; 

  

    
  
	public Modelo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Modelo(Long id, String nombreProd, String descripcion, double precio, int stock, String categoria,
			double descuento, byte[] foto) {
		super();
		this.id = id;
		this.NombreProd = nombreProd;
		this.Descripcion = descripcion;
		this.precio = precio;
		this.stock = stock;
		this.categoria = categoria;
		this.descuento = descuento;
		this.foto= foto;
	}
		
}
	