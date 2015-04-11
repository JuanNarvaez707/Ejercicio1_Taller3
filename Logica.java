/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Vector;

/**
 *
 * @author juancans
 */
public class Logica {
    public Vector<String> solucion(double cA1, double cA2 , double rA , double cB1, double cB2 , double rB , Vector<Vector<Double>> puntos){
		
        Vector<String> resultado = new Vector<String>();
        int tam = puntos.size();
        double calculoFormula;
             
	for(int i = 0 ; i < tam ; i++){
                      
            calculoFormula = Math.pow((puntos.get(i).get(0) - cA1), 2) +
                             Math.pow((puntos.get(i).get(1) - cA2), 2);
            if(calculoFormula <= rA && calculoFormula <= rB){
                resultado.add("Dentro de ambas circunferencias");
            }else{
		if(calculoFormula <= Math.pow(rA,2)){
			resultado.add("Dentro de la circunferencia 1");
		}else{
			if( calculoFormula <= Math.pow(rB,2)){
				resultado.add("Dentro de la circunferencia 2");			
			}else{
				resultado.add("Por fuera de ambas circunferencias");
			}
		}
            }
        }
        
        return resultado;
                
	}
}
