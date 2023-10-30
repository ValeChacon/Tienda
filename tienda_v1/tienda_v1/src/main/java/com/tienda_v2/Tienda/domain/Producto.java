package com.tienda_v2.Tienda.domain;

import java.io.Serializable;
import lombok.Data;
import jakarta.persistence.*;


@Data
@Entity
@Table(name="producto")
public class Producto implements Serializable{

    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id_producto")
    private Long idProducto;
    private String descripcion;
    private String ruta_imagen;
    private boolean activo;

    public Producto() {
    }

    public Producto(String producto, boolean activo) {
        this.descripcion = producto;
        this.activo = activo;
    }

    public void setRutaImagen(String cargaImagen) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
}
