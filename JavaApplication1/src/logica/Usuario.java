/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

/**Clase Usuario
 *Esta clase contiene toda la información en comun que pueden tener coordinadores,
 * Profesores y estudiantes.
 * @author Robeto Garcia
 */
public class Usuario {
    
    /*Atributos
    *Componentes de la calse
    */
    private String nombre ;
    private String apellido;
    private String tipoDocumento;
    private String numeroDocumento;
    private String genero;
    private String email;
    @SuppressWarnings("FieldMayBeFinal")
    private String rol;
    
    /*Usuario
    *Contructor parametrico de la clase Usuario
    */
    public Usuario(String nombre, String apellido, String tipoDocumento, 
           String numeroDocumento, String genero, String email, String rol ){
        
        this.nombre = nombre;
        this.apellido = apellido;
        this.tipoDocumento = tipoDocumento;
        this.numeroDocumento = numeroDocumento;
        this.genero = genero;
        this.email = email;
        this.rol = rol;
    }
    
    /*getters/setters
    *gets y sets de cada uno de los atributos de la clase.
    */

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }
    
    
}
