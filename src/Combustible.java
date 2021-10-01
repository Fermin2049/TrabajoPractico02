/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Orlando
 */
public class Combustible {
    private String tipoDeCombustible;
    private double presio;
    
    public Combustible(String tipoDeCombustible,double presio){
        this.presio=presio;
        this.tipoDeCombustible=tipoDeCombustible;
    }

    public String getTipoDeCombustible() {
        return tipoDeCombustible;
    }

    public void setTipoDeCombustible(String tipoDeCombustible) {
        this.tipoDeCombustible = tipoDeCombustible;
    }

    public double getPresio() {
        return presio;
    }

    public void setPresio(double presio) {
        this.presio = presio;
    }
    
}
