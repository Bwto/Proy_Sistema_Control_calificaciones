/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

/**Profesor
 *Clase que contiene las caracteristica especificas de un profesor, herda de la
 * clase Usuario
 * @author Roberto Garcia
 */
public class Profesor extends Usuario{
    
    /*Atributos
    *Caracteriticas propias de la clase Profesor.
    */
    
    @SuppressWarnings("FieldMayBeFinal")
    private int idProfesor;
    private String areaProfundisacion;
    
    /*Profesor
    *Constructor parametrico de la clase profesor e inicializa su clase padre 
    *Usuario.
    */
    public Profesor(String nombre, String apellido, String tipoDocumento, 
            String numeroDocumento, String genero, String email, String rol, String areaProfundisacion) {
        super(nombre, apellido, tipoDocumento, numeroDocumento, genero, email, rol);
        this.idProfesor = Integer.parseInt(numeroDocumento);
        this.areaProfundisacion = areaProfundisacion;
    }
    
    /*getters/setters
    *gets y sets de los atributos propios de la clase Profesor, el idProfesor no
    *tiene setter, debido a que el numero de documento es utilizado como su ID.
    */

    public int getIdProfesor() {
        return idProfesor;
    }

    public String getAreaProfundisacion() {
        return areaProfundisacion;
    }

    public void setAreaProfundisacion(String areaProfundisacion) {
        this.areaProfundisacion = areaProfundisacion;
    }
    
 
}
