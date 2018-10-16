/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package twodogsmeet;

import javax.swing.JOptionPane;

/**
 *
 * @author anarc6700
 */
public class TwoDogsMeet {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Dog sp2 = new Dog();
        Dog sp1 = new Dog();
        sp1.setAggression();
        sp1.setHunger();
        sp2.setAggression2();
        sp2.setHunger2();
       
        String name = JOptionPane.showInputDialog("Enter the name of the first dog ");
       
       String breed = JOptionPane.showInputDialog("Enter the breed of the first dog ");
       sp1.setName(name, breed);
       
       String name2 = JOptionPane.showInputDialog("Enter the name of the second dog ");
      
       String breed2 = JOptionPane.showInputDialog("Enter the breed of the second dog ");
       sp2.setName2(name2, breed2);
       
       System.out.println(sp1);
      System.out.println(sp2);
      
      String aggression12 = JOptionPane.showInputDialog("Enter a new aggression rating for dog 1 ");
      sp1.setAggression();
      String hunger12 = JOptionPane.showInputDialog("Enter a new hunger rating for dog 1 ");
      sp1.setAggressionpost(aggression12, hunger12);
      
      String aggression22 = JOptionPane.showInputDialog("Enter a new aggression rating for dog 2 ");
      String hunger22 = JOptionPane.showInputDialog("Enter a new hunger rating for dog 2 ");
      sp2.sethungerpost(aggression22, hunger22);
      
      System.out.println(sp1);
      System.out.println(sp2);
      
      if(aggression12.equals(aggression22)){
          System.out.println("The meeting was a success");
      }else{
          System.out.println("The meeting was uunsuccessful");
      }
    }
    
}
