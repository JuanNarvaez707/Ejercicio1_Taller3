/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import java.util.Vector;

/**
 *
 * @author juancans
 */
public class Logica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }

    public Vector<String> solucion(double cA1, double cA2 , double rA , double cB1, double cB2 , double rB , Vector<Vector<Integer>> puntos){
		
        Vector<String> resultado = new Vector<String>();
        int tam = resultado.size();
        double calculoFormula;
             
	for(int i = 0 ; i < tam ; i++){
                      
            calculoFormula = Math.pow((puntos.get(i).get(0) - cA1), 2) +
                             Math.pow((puntos.get(i).get(1) - cA2), 2);
            if(calculoFormula <= rA && calculoFormula <= rB){
                resultado.add("Dentro de ambas circunferencias");
            }else{
		if(calculoFormula <= rA){
			resultado.add("Dentro de la circunferencia 1");
		}else{
			if( calculoFormula <= rB){
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
