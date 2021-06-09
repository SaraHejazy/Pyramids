/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sara Hegazy
 */
public class PyramidInfo {
    public String Pharaoh;
    public String Modern_name;
    public String Site;
    public double Height;
    
    
    public PyramidInfo(String Pharaoh, String Modern_name, String Site , Double Height ) {
        this.Pharaoh = Pharaoh;
        this.Modern_name = Modern_name;
        this.Site = Site;
        this.Height = Height;
        
    }

    public void setPharaoh(String Pharaoh) {
        this.Pharaoh = Pharaoh;
    }


    public void setModern_name(String Modern_name) {
        this.Modern_name = Modern_name;
    }


    public void setSite(String Site) {
        this.Site = Site;
    }


    public void setHeight(double Height) {
        this.Height = Height;
    }

    public String getPharaoh() {
        return Pharaoh;
    }

    public String getModern_name() {
        return Modern_name;
    }


    public String getSite() {
        return Site;
    }


    public double getHeight() {
        return Height;
    }
    
    
    
}
