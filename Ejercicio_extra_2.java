/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_ejercicios_extras_1al10;

/**
 *
 * @author Usuario
 */
public class Ejercicio_extra_2 {
    public static void main(String[] args) {
        
      int a = 0;
      int b = 1;
      int c = 2;
      int d = 3;
      
        System.out.println(a+" - "+b+" - "+c+" - "+d+" - ");
    
      int [] tot = m(a,b,c,d);

        for (int i = 0; i < tot.length; i++) {
            System.out.print(tot[i]+" - ");
            
        }
        
    }
    public static int [] m(int a,int b,int c,int d){
    
        int [] m = new int[4];
        
        int new_a=d; 
        int new_b=c;
        int new_c=a;
        int new_d=b; 
        
        
          m[0]=new_a;
          m[1]=new_b;
          m[2]=new_c;
          m[3]=new_d;
          
          return m;
        
        
    
    }
}
