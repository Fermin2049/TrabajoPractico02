/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Orlando
 */
public class Ciudad {
    private String lugar;
    private String ruta;
    private double kmruta;

    public Ciudad(String lugar,String ruta,double kmruta){
        this.kmruta=kmruta;
        this.lugar=lugar;
        this.ruta=ruta;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }

    public double getKmruta() {
        return kmruta;
    }

    public void setKmruta(double kmruta) {
        this.kmruta = kmruta;
    }
    

}
