/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Sara Hegazy
 */
public class Pyramids {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       // try {
            
            PyramidCSVDAO Pyramids = new PyramidCSVDAO();
            List <PyramidInfo> Output = new ArrayList<PyramidInfo>(Pyramids.PyramidCSVDAORead("W:\\ITI\\Java\\pyramids.csv"));
            for (int i=0; i<Output.size(); i++){
                System.out.println((Output.get(i).getPharaoh())+"  "+ Output.get(i).getHeight());}
            
            // TODO code application logic here
       // } //catch (FileNotFoundException ex) {
          // Logger.getLogger(Pyramids.class.getName()).log(Level.SEVERE, null, ex);
        //}
    }
    
}
