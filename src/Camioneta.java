/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Orlando
 */
public class Camioneta extends Vehiculo {

    public Camioneta(String marca, String patente, Combustible combustible) {
        super(marca, patente, combustible);
    }
    
    public double calcularCostoDeCombustible(){
        return combustible.getPresio()*0.01;
    }
}
