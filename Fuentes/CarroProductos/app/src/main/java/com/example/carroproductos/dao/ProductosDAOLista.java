package com.example.carroproductos.dao;

import com.example.carroproductos.dto.Producto;

import java.util.ArrayList;
import java.util.List;

public class ProductosDAOLista implements ProductosDAO {

    private  List<Producto> productos = new ArrayList<>();

    //implementar patron singleton
    //2, como atributo debe existir una instancia estatica de si misma
    private static  ProductosDAOLista instancia;
    //1. constructor de la clase sea privado
    private  ProductosDAOLista(){
        Producto p = new Producto();
        p.setNombre("Coca-Cola Zero");
        p.setDescripcion("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Morbi efficitur diam erat, at dignissim purus imperdiet eu. Sed urna urna, dapibus ut tincidunt sit amet, ullamcorper vel justo");
        p.setPrecio(1000);
        p.setFoto("https://jumbo.vteximg.com.br/arquivos/ids/222233/711666.jpg?v=636541991139430000");
        productos.add(p);
        p = new Producto();
        p.setNombre("Centella");
        p.setDescripcion("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Morbi efficitur diam erat, at dignissim purus imperdiet eu. Sed urna urna, dapibus ut tincidunt sit amet, ullamcorper vel justo");
        p.setPrecio(400);
        p.setFoto("https://www.savory.cl/sites/default/files/solo-para-mi_infantiles--centella.png");
        productos.add(p);
        p = new Producto();
        p.setNombre("SAHNE-NUSS");
        p.setDescripcion("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Morbi efficitur diam erat, at dignissim purus imperdiet eu. Sed urna urna, dapibus ut tincidunt sit amet, ullamcorper vel justo");
        p.setPrecio(1200);
        p.setFoto("https://7483c243aa9da28f329c-903e05bc00667eb97d832a11f670edad.ssl.cf1.rackcdn.com/01004045-tJQi0dZ4.png");
        productos.add(p);

    }

    public static ProductosDAOLista getInstance(){
        if (instancia==null){
            instancia = new ProductosDAOLista();
        }
        return instancia;
    }

    //3, metodo estatico que permita el  acceso a la unica instancia
    @Override
    public List<Producto> getAll() {
        return productos;
    }

    @Override
    public Producto save(Producto p) {
        productos.add(p);
        return p;
    }
}
