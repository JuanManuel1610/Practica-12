/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package procesos;

import com.google.gson.Gson;

import informacion.datos;

/**
 *
 * @author user
 */
public class conversiones {
    public String cjson(datos datos){
        Gson gson = new Gson();
        return gson.toJson(datos);
    }
    public datos cDTA(String cadena){
        Gson gson = new Gson();
        return gson.fromJson(cadena, datos.class);
        
    }
}
