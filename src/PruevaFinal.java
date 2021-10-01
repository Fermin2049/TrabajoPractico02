/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Orlando
 */
public class PruevaFinal {

    public static void main(String[] args) {
      Ciudad ciudad=new Ciudad("San Luis","Ruta 7",5);
      Ciudad ciudad2= new Ciudad("Villa Mercedes","Ruta 7",95);
      
      Combustible nafta=new Combustible("super",97);
      
      Auto auto1= new Auto("ford","xxxaaa",nafta);
      
      Viaje alvm = new Viaje(ciudad,ciudad2,auto1,1);
      
        System.out.println("costo total: "+alvm.calcularCostoTotal());
    }
    
}
