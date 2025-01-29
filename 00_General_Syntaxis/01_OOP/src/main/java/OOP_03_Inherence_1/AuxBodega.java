/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OOP_03_Inherence_1;

public class AuxBodega extends RoleClass {
        
        public AuxBodega(String roleNombre, Float Salario) {
            super(roleNombre, Salario);
        }
                
        @Override
        public String realizarTarea(){
           return "Ayuda en todo al admin, segundo al mando pero peor pagado XD.";
        }
    }
