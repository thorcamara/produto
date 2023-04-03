/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Principal;

/**
 *
 * @author User
 */

import Model.Produto;

public class Principal {
    
    public static void main(String[] args) {
        
        Produto cama = new Produto("Cama de casal", "Feita de algodao, com molas.", 133, 188, 30, 230, 2);
        
        System.out.println(("----- Produto 1 ----- \n\n"+"Nome: "+cama.getNome()+"\nDescricao: "+cama.getDescricao()+"\nDimensoes: "+cama.getLargura()+"x"+cama.getAltura()+"x"+cama.getProfundidade()
                +"\nPeso: "+cama.getPeso()+"Kg"+"\nGarantia: "+cama.getGarantia()+" anos "));
    }
    
}
