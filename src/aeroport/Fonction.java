/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aeroport;

import java.util.Objects;

/**
 *
 * @author js.dimpre
 */
public class Fonction {
    private String nomFonction;

    public String getNomFonction() {
        return nomFonction;
    }

    public void setNomFonction(String nomFonction) {
        this.nomFonction = nomFonction;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 17 * hash + Objects.hashCode(this.nomFonction);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Fonction other = (Fonction) obj;
        return Objects.equals(this.nomFonction, other.nomFonction);
    }
    
}
