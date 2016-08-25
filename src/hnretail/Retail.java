/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hnretail;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.Logger;

/**
 *
 * @author abendezur
 */
public class Retail {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            String path = System.getProperty("user.dir");            
            Handler handler = new FileHandler(path+"\\src\\log\\hnretaillog.xml");
            Logger.getLogger("").addHandler(handler);
            Logger.getLogger("").info("Initiated ");
        }catch (IOException e){
            System.out.println("IOException "+e);
        }        
        new hnretail.view.Main_frame().setVisible(true);
    }
    
}
