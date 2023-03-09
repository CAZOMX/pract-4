/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica04CarlosZuniga;

/**
 *
 * @author ivanc
 */
public class Equipo
{

    private int estatura;
    private String nombre;
    private String apellido;
    private int registro;

    public Equipo(int estatura,
            String nombre,
            String apellido,
            int registro)
    {
        this.estatura = estatura;
        this.nombre = nombre;
        this.registro = registro;
        this.apellido = apellido;
    }

    Equipo()
    {

    }

    public String getNombre()
    {
        return nombre;
    }

    public String getApellido()
    {
        return apellido;
    }

    public int getRegistro()
    {
        return registro;
    }

    public int getEstatura()
    {
        return estatura;
    }

    public void setEstatura(int estatura)
    {
        this.estatura = estatura;
    }

    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    public void setApellido(String apellido)
    {
        this.apellido = apellido;
    }

    public void setRegistro(int registro)
    {
        this.registro = registro;
    }

}
