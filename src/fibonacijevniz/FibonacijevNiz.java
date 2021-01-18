/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibonacijevniz;


public class FibonacijevNiz {

    
    public static void main(String[] args) {
        int i = 1;
        int x = 10;
        int b1 = 0;
        int b2 = 1;
        
        while (i <= x) {
            
            System.out.print(b1 + " + ");
                    
            
            int sledeci = b1 + b2;
            b1 = b2;
            b2 = sledeci;
            
            i++;
        }
        
    }
    
}
