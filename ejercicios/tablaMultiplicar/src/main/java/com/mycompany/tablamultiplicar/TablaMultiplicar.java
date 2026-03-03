
package com.mycompany.tablamultiplicar;

import java.util.Scanner;
public class TablaMultiplicar {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in );
        int n;
        System.out.println("ingrese el numero entero positivo: ");
        n=teclado.nextInt();
        boolean tester = true;
        System.out.println("================");
        while (tester == true){           
            if (n>0){
                for(int i=1; i <=10;i++){
                System.out.println(n + " x " + i + " = " + n*i);
                }
            }else{
                System.out.println("intentar nuevamente....");
            }
        }
        
    }
}
