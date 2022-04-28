/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aeroport;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 *
 * @author js.dimpre
 */
public class Avion implements Vehicule{
    
    private String matricule;
    private Float carburantRestant;
    private Modele modele;
    private List<Personnel> equipage;
    private Float volume;

    public String getMatricule() {
        return matricule;
    }

    protected Avion setMatricule(String matricule) {
        this.matricule = matricule;
        return this;
    }

    public Float getCarburantRestant() {
        return carburantRestant;
    }

    public Avion setCarburantRestant(Float carburantRestant) {
        this.carburantRestant = carburantRestant;
        return this;
    }

    public Modele getModele() {
        return modele;
    }

    protected Avion setModele(Modele modele) {
        this.modele = modele;
        return this;
    }

    public List<Personnel> getEquipage() {
        return new ArrayList(equipage);
    }

    public boolean addMembreEquipage(Personnel p){
        return this.equipage.add(p);
    }
    
    public boolean removeMembreEquipage(Personnel p){
        return this.equipage.remove(p);
    }
    
    protected Avion setEquipage(List<Personnel> equipage) {
        this.equipage = equipage;
        return this;
    }

    @Override
    public Float getVolume() {
        return this.volume;
    }
    
    protected Avion setVolume(Float volume){
        this.volume = volume;
        return this;
    }

    @Override
    public boolean isOperational() {
        Map<Fonction,Integer> requiredPersonnel = this.getModele().getFonctionsNecessaires();
        for(Personnel p : this.getEquipage()){
            if(requiredPersonnel.containsKey(p.getFonction())){
                requiredPersonnel.put(p.getFonction(), requiredPersonnel.get(p.getFonction()) - 1);
            }
        }
        for(Integer i : requiredPersonnel.values()){
            if (i != 0){
                return false;
            }
        }
        return true;
    }

    public static Vehicule getInstance(Map<String, Object> properties){
        Avion a = null;
        if(properties.containsKey("nbPassagers")){
           a = (Avion) Transport.getInstance(properties);
        }
        if(properties.containsKey("capaciteEmport")){
           a = (Avion) Fret.getInstance(properties);
        }
        if(a != null){
            a.setCarburantRestant((Float) properties.get("carburantRestant"))
             .setEquipage(new ArrayList<>())
             .setMatricule((String) properties.get("matricule"))
             .setModele(new Modele().setNomModele((String) properties.get("nomModele"))
                                    .setFonctionsNecessaires((Map<Fonction,Integer>) properties.get("fonctionsModele")))
             .setVolume((Float) properties.get("volume"));
        }
        return a;
    }

}
