package com.tienda_v2.Tienda.dao;

import com.tienda_v2.Tienda.domain.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoDao extends JpaRepository<Producto, Long> {
    
}
