/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package pe.edu.upeu.patron;

import pe.edu.upeu.patron.strategy.Context;
import pe.edu.upeu.patron.strategy.OperationAdd;
import pe.edu.upeu.patron.strategy.OperationMultiply;
import pe.edu.upeu.patron.strategy.OperationSubstract;

/**
 *
 * @author EMMANUEL
 */
public class Patron {

    public static void main(String[] args) {
      Context context = new Context(new OperationAdd());
      System.out.println("10 + 5 = " + context.executeStrategy(10, 5));

      context = new Context(new OperationSubstract());
      System.out.println("10 - 5 = " + context.executeStrategy(10, 5));

      context = new Context(new OperationMultiply());
      System.out.println("10 * 5 = " + context.executeStrategy(10, 5));
   }
}
