/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aaf;

/**
 *
 * @author Nick
 */
public class NPC extends Character{
    String occupation;
    String age;
    String gender;
    String residence;
    String birthplace;
    
    int hp;
    
    

    

    @Override
    public int compare(Character t, Character t1) {    
        return t.fighting.compareTo(t1.dodge);
         
    }   
  
    
}
