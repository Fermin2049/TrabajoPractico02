/*
el consumo de combustible es de 7 Lts cada 100 Km para los autos
 */

/**
 *
 * @author Orlando
 */
public class Auto extends Vehiculo {

    public Auto(String marca, String patente, Combustible combustible) {
        super(marca, patente, combustible);
    }
    
    
    @Override
    public double calcularCostoDeCombustible(){
        return combustible.getPresio()*0.07;
    }
}
