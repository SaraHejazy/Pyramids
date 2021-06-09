
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.util.logging.Level;
import java.util.logging.Logger;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sara Hegazy
 */
public class PyramidCSVDAO {
    List <PyramidInfo> PyramidInfo = new ArrayList<PyramidInfo>();;

    public PyramidCSVDAO() {
        this.PyramidInfo = PyramidInfo;
    }

    public List<PyramidInfo> PyramidCSVDAORead(String fileName) {
        
        this.PyramidInfo = new ArrayList<PyramidInfo>();
        
        File file = new File (fileName);
        List<String> lines = new ArrayList<String>();
        
        try {
            lines = Files.readAllLines(file.toPath());
        } catch (Exception e) {
            System.out.println("Error reading firle : "+ e);
        }
        for (int i =1; i<lines.size();i++ ){
        String [] ObjectLine = lines.get(i).split(",");
            
            if(!ObjectLine[0].isEmpty()&& !ObjectLine[2].isEmpty() && !ObjectLine[4].isEmpty() && !ObjectLine[7].isEmpty()){
        PyramidInfo PyramidInfol = new PyramidInfo(ObjectLine[0], ObjectLine[2], ObjectLine[4],Double.parseDouble(ObjectLine[7]));
                
        PyramidInfo.add(PyramidInfol);
                
        }}
        //System.out.println(PyramidInfo.size());
        return PyramidInfo;      }   

    
}
