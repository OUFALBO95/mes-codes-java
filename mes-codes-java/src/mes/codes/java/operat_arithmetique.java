/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mes.codes.java;

/**
 *
 * @author nouhou
 */
public class operat_arithmetique {
    public static void main(String[]args)
      {
                int x=4, y=8, z=3, t=7, calcul;
                calcul=x*y-z+t;
                System.out.println("x*y-z+t="+calcul);
                calcul=x*y-(z+t);
                System.out.println("x*y-(z+t)="+calcul);
                calcul=x*y%(z+t);
                System.out.println("x*y%z+t="+calcul);
                calcul=((x*y)%z)+t;
                System.out.println("((x*y)%z)+t="+calcul);
                calcul=x*y%(z+t);
                System.out.println("x*y%(z+t)="+calcul);
                calcul=x*(y%(z+t));
                System.out.println("x*(y%(z+t))="+calcul);
    }
}
