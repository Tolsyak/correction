/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aeroport;

/**
 *
 * @author js.dimpre
 */
public class Utilitaire implements Vehicule{

    private Boolean entretien;

    private Float volume;
    
    @Override
    public Float getVolume() {
        return volume;
    }

    @Override
    public boolean isOperational() {
        return entretien;
    }
    
    public Boolean getEntretien() {
        return entretien;
    }

    public void setEntretien(Boolean entretien) {
        this.entretien = entretien;
    }
    
}
