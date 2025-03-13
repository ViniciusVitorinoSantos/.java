/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javastartex01;

/**
 *
 * @author vxvit
 */
public class JavaStartEx01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Matematica m1 = new Matematica();
        int multiplica = m1.multiplica(5, 5);
        int soma = m1.soma(5, 10);
        System.out.println("O resultado da soma é " + soma);
        System.out.println("O resultado da multiplicação é " + multiplica);
    }
    
}
