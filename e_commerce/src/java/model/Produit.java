/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author tenshi16
 */
public class Produit {
    
    private String id_producto;
    private String nombre_producto;
    private int precioProduit;
    private String descripcionProduit;
    private int existenciaProduit;
    private String imagenProduit;

    public Produit(String id_producto, String nombre_producto, int precioProduit, String descripcionProduit, int existenciaProduit, String imagenProduit) {
        this.id_producto = id_producto;
        this.nombre_producto = nombre_producto;
        this.precioProduit = precioProduit;
        this.descripcionProduit = descripcionProduit;
        this.existenciaProduit = existenciaProduit;
        this.imagenProduit = imagenProduit;
    }

    public String getId_producto() {
        return id_producto;
    }

    public void setId_producto(String id_producto) {
        this.id_producto = id_producto;
    }

    public String getNombre_producto() {
        return nombre_producto;
    }

    public void setNombre_producto(String nombre_producto) {
        this.nombre_producto = nombre_producto;
    }

    public int getPrecioProduit() {
        return precioProduit;
    }

    public void setPrecioProduit(int precioProduit) {
        this.precioProduit = precioProduit;
    }

    public String getDescripcionProduit() {
        return descripcionProduit;
    }

    public void setDescripcionProduit(String descripcionProduit) {
        this.descripcionProduit = descripcionProduit;
    }

    public int getExistenciaProduit() {
        return existenciaProduit;
    }

    public void setExistenciaProduit(int existenciaProduit) {
        this.existenciaProduit = existenciaProduit;
    }

    public String getImagenProduit() {
        return imagenProduit;
    }

    public void setImagenProduit(String imagenProduit) {
        this.imagenProduit = imagenProduit;
    }
}
  
