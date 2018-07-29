/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

/**Coordinador
 *Clase con la cual se pueden crear coordinadores, hereda de la clase Usuario 
 * sus caracteristicas elementales.
 * @author Roberto Garcia
 */
public class Coordinador extends Usuario{
    
    /*Atributos
    *Caracteristicas propias de la clase Coordinador
    */
    
    private int idCoordinador;
    private String programa;
    
    /*Coordinador
    *Constructor de la clase Coordinador, Esta inicia a su vez a la calse padre
    *Usuario por la herencia.
    */
    public Coordinador(String nombre, String apellido, String tipoDocumento, 
           String numeroDocumento, String genero, String email, String rol,
           int idCoordinador, String programa) {
        super(nombre, apellido, tipoDocumento, numeroDocumento, genero, email, rol);
        this.idCoordinador = idCoordinador;
        this.programa = programa;
    }
    
    /*Getters/setters
    *Gets y sets de los atributos propios de la clase Coordinador
    */

    public int getIdCoordinador() {
        return idCoordinador;
    }

    public void setIdCoordinador(int idCoordinador) {
        this.idCoordinador = idCoordinador;
    }

    public String getPrograma() {
        return programa;
    }

    public void setPrograma(String programa) {
        this.programa = programa;
    }
    
    
}
