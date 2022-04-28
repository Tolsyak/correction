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
public class Modele {
    private String nomModele;
    private Map<Fonction, Integer> fonctionsNecessaires;

    public String getNomModele() {
        return nomModele;
    }

    public Modele setNomModele(String nomModele) {
        this.nomModele = nomModele;
        return this;
    }

    public Map<Fonction, Integer> getFonctionsNecessaires() {
        return fonctionsNecessaires;
    }

    public Modele setFonctionsNecessaires(Map<Fonction, Integer> fonctionsNecessaires) {
        this.fonctionsNecessaires = fonctionsNecessaires;
        return this;
    }
}
