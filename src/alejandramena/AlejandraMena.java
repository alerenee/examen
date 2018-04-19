
package alejandramena;

import javax.swing.JOptionPane;

/**
 * Nombre de la clase: Alejandra Mena
 * Fecha: 19/04/18
 * Version: 2.0
 * CopyRight: ITCA
 * @author PracticaEvaluada2
 */
public class AlejandraMena {

    
    public static void main(String[] args) {
        
        int n = 0;
        
        
        do {
            
            
            
            for(int i=0; i<3; i++)
            {
                 n = Integer.parseInt(JOptionPane.showInputDialog("1. Agregar empleado \n2. Calcular Planilla \n3. Salir"));
                   
                 String nombre[] = new String[3];
                 double salario[] = new double[3];
                 int cantHoras[] = new int[3];
                 double renta = 0.10;
                 double bono[] = new double[3];
                 double salarioT[] = new double[3];
            
                 String nombres = "";
                 double salarios = 0;
                
                
                if(n==1)
                {
                    nombre[i] = JOptionPane.showInputDialog("Ingrese su nombre:");
                    nombres = nombres + nombre[i];
                    salario[i] = Double.parseDouble(JOptionPane.showInputDialog("Ingrese su salario por hora:"));
                    cantHoras[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de horas trabajadas:"));
                    
                } else if(n==2)
                {
                    
                    if(salario[i]>0 && salario[i]<=350)
                    {
                        bono[i] = salario[i] + 100;
                    }
                    else if(salario[i]>350 && salario[i]<700)
                    {
                        bono[i] = salario[i] + 200;
                    }
                    else if(salario[i]>=700)
                    {
                        bono[i] = salario[i] + 250;
                    }
                    
                    salarioT[i] = bono[i]-(bono[i]*renta);
                    salarios = salarios + salarioT[i];
                    
                    JOptionPane.showMessageDialog(null, "Empleados Registrados: ---------- Salario total:\n"+nombres+" ---------- "+salarios+"\n");
                    
                } else if(n==3)
                {
                    i=3;
                    
                } else if(n!=1 && n!=2 && n!=3)
                {
                    JOptionPane.showMessageDialog(null, "Opcion de menu incorrecta.");
                }
            }
            
            n++;
            
        } while(n==1);
    }
    
}
