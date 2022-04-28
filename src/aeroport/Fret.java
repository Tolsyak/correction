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
public class Fret extends Avion{
       private Float capaciteEmport;

    public Float getCapaciteEmport() {
        return capaciteEmport;
    }

    private Fret setCapaciteEmport(Float capaciteEmport) {
        this.capaciteEmport = capaciteEmport;
        return this;
    }
    
    public static Vehicule getInstance(Map<String,Object> properties){
        Fret f = new Fret();
        f.setCapaciteEmport( (Float) properties.get("capaciteEmport"));
        return f;
    }
}
