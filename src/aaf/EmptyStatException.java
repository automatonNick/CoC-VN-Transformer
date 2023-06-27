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
public class EmptyStatException extends Exception {
    public EmptyStatException(){
        super("Stat has been left empty");
    }
}
