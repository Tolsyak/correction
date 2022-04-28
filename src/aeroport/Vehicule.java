/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package aeroport;

import java.util.Map;

/**
 *
 * @author js.dimpre
 */
public interface Vehicule {
    public Float getVolume();
    public boolean isOperational();
    public static Vehicule getInstance(Map<String,Object> properties) throws Exception{
        return (Vehicule) Class.forName((String) properties.get("type")).getDeclaredMethod("getInstance", Map.class).invoke(null,properties);
    }
}
