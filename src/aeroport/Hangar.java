/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aeroport;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author js.dimpre
 */
public class Hangar {
    private List<Vehicule> listeVehicule;
    private Float volumeMax;

    public Hangar(){
        listeVehicule = new ArrayList<>();
    }
    
    public List<Vehicule> getListeVehicule() {
        return new ArrayList(listeVehicule);
    }

    public Float getVolumeOccupe(){
        Float f = 0f;
        for(Vehicule v : listeVehicule){
            f += v.getVolume();
        }
        return f;
    }
    
    public boolean addVehicule(Vehicule v){
        if(this.getVolumeOccupe() + v.getVolume() <= this.volumeMax){
            return this.listeVehicule.add(v);
        }
        return false;
    }
    
    public void setListeVehicule(List<Vehicule> listeVehicule) {
        this.listeVehicule = listeVehicule;
    }

    public Float getVolumeMax() {
        return volumeMax;
    }

    public void setVolumeMax(Float volumeMax) {
        this.volumeMax = volumeMax;
    }
    
    
}
