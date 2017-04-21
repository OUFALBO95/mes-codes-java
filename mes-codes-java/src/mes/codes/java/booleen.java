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
public class booleen {
      public static void main(String[]args)
      {
                int x=5, y=9, z=4, t=8, calcul=0;
                boolean booll;
                booll = x<y;
                System.out.println("x<y ="+booll);
                booll=(x<y)&(z==t);
                System.out.println("(x<y)&(z==t)="+booll);
                booll=(x<y)|(z==t);
                System.out.println("(x<y)|(z==t)="+booll);
                booll=(x<y)&&(z==t);
                System.out.println("(x<y)&&(z==t)="+booll);
                booll=(x<y)||(z==t);
                System.out.println("(x<y)||(z==t)="+booll);
                booll=(x<y)||((calcul=z)==t);
                System.out.println("(x<y)||((calcul=z)==t)="+booll+" ** calcul="+calcul);
                booll=(x<y)|((calcul=z)==t);
                System.out.println("(x<y)|((calcul=z)==t)="+booll+" ** calcul="+calcul);
		}
}
