package com.example.carroproductos.dao;

import com.example.carroproductos.dto.Producto;

import java.util.List;

public interface ProductosDAO {
    List<Producto> getAll();
    Producto save (Producto p);

}
