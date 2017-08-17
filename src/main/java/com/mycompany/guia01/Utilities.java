
package com.mycompany.guia01;

import javax.swing.JOptionPane;

/**
 *
 * @author john
 */
public class Utilities {
  /**
   * 
   * @param texto = "Cadena de texto que contiene la introducción de un determinado post"
   * @return "Las primeras 30 letras del texto recibido"
   */  
    public String getResume(String texto){
      String salida="";
      if (texto.length() > 30) {
          for (int i=0; i<=30; i++){
              salida+= String.valueOf(texto.charAt(i));
          }
      }else{
          salida=texto;
      } return salida;
    }
/**
 * 
 * @param texto "Cadena de texto que contiene el título de un determinado post";

 * @return "El texto que se ha recibido con cada palabra capitalizada y sin dobles"
 */
    public String capitalizar(String texto){
String salida;
texto = texto.replaceAll("", "");
salida= String.valueOf(texto.charAt(0)).toUpperCase();

for (int i=1 ; i < texto.length() ; i++){
    if (texto.charAt( i - 1 )==)
}
}
    
    
//public int contarCoincidencias(String frase, String texto){
//frase​= "Cadena de texto que contiene la frase a buscar";
//texto​ = "Cadena de texto en donde se buscarán las coincidencias";
//return​ "La cantidad de coincidencias(case-ignore) de la frase en el texto recibido";//
//}
}