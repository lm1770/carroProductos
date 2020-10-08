package com.example.carroproductos;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.widget.ListView;

import com.example.carroproductos.adapters.ProductosArrayAdapter;
import com.example.carroproductos.dao.ProductosDAO;
import com.example.carroproductos.dao.ProductosDAOLista;
import com.example.carroproductos.dto.Producto;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ListView productosLv;
    private List<Producto> productos;
    private ProductosArrayAdapter adaptador;
    private ProductosDAO productosDAO = ProductosDAOLista.getInstance();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.setSupportActionBar((Toolbar) findViewById(R.id.toolbar)); //agregas el toolbar
        productos = productosDAO.getAll();
        adaptador = new ProductosArrayAdapter(this,R.layout.productos_list,productos);
        productosLv = findViewById(R.id.IdproductosLv);
        productosLv.setAdapter(adaptador);



    }
}