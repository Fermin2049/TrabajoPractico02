/*
+calcularDistancia():double
+calcularCostoDePeaje():double
+calcularCostoDeCombustible():double
+calcularCostoTotal():double
 */

/**
 *
 * @author Orlando
 */
public class Viaje {
    private Ciudad lugarDeOrigen;
    private Ciudad LugarDeDestino;
    private double diferenciaEntreCiudades;
    private Vehiculo vehiculo;
    private double cantidadDePeaje;

    public Viaje(Ciudad lugarDeOrigen, Ciudad LugarDeDestino, double diferenciaEntreCiudades, Vehiculo vehiculo, double cantidadDePeaje) {
        this.lugarDeOrigen = lugarDeOrigen;
        this.LugarDeDestino = LugarDeDestino;
        this.diferenciaEntreCiudades = diferenciaEntreCiudades;
        this.vehiculo = vehiculo;
        this.cantidadDePeaje = cantidadDePeaje;
    }
    
    public Viaje(Ciudad lugarDeOrigen, Ciudad LugarDeDestino, Vehiculo vehiculo, double cantidadDePeaje) {
        this.lugarDeOrigen = lugarDeOrigen;
        this.LugarDeDestino = LugarDeDestino;
        this.vehiculo = vehiculo;
        this.cantidadDePeaje = cantidadDePeaje;
        calcularDistancia();
    }
    
    public double calcularDistancia(){
        if(lugarDeOrigen.getRuta().equals(LugarDeDestino.getRuta())){
            diferenciaEntreCiudades= Math.abs(lugarDeOrigen.getKmruta() - LugarDeDestino.getKmruta());
            return diferenciaEntreCiudades;
        }else{
            return diferenciaEntreCiudades;        
        }
    }
    public double calcularCostoDePeaje(){
        if(vehiculo instanceof Camion){
            return this.cantidadDePeaje * 100;
        }else{
            return this.cantidadDePeaje * 80;
        }
    }
    public double calcularCostoDeCombustible(){
    return vehiculo.calcularCostoDeCombustible() * diferenciaEntreCiudades;
    }

    
    
    public double calcularCostoTotal(){
        return calcularCostoDePeaje() + calcularCostoDeCombustible();
    }
}
