/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aeroport;

import java.util.Map;

/**
 *
 * @author js.dimpre
 */
public class Transport extends Avion{
    private int nbPassagers;

    public int getNbPassagers() {
        return nbPassagers;
    }

    private Transport setNbPassagers(int nbPassagers) {
        this.nbPassagers = nbPassagers;
        return this;
    }
    
    public static Vehicule getInstance(Map<String,Object> properties){
        Transport t = new Transport();
        t.setNbPassagers((Integer)properties.get("nbPassagers"));
        return t;
    }
}
