
package ultimaprueba;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Ultimaprueba {


       public static void main (String [] args)
   {
      InputStreamReader isr = new InputStreamReader(System.in);
      BufferedReader br = new BufferedReader (isr);
      try
      {
         System.out.print("Sumando 1 : ");
         System.out.printf("hola bety");
         System.out.printf("hola gio");
         int s1 = Integer.parseInt(br.readLine());
         System.out.print("Sumando 2 : ");
         int s2 = Integer.parseInt(br.readLine());
         int sumacion=s1+s2;
         System.out.println ("La suma es " + s1 + "+" + s2 +"="+ sumacion);
      }
      catch (IOException | NumberFormatException e)
          
      {
      }
    
   }
    
    }
    

