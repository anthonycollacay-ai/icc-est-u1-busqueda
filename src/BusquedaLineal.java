import java.util.List;

import models.Persona;

public class BusquedaLineal 
{
    private List<Persona> personas;

    public BusquedaLineal(List<Persona> personas) 
    {
        this.personas = personas;
    }

    //metodo que busque una persona y retorne la persona si lo encontro
    //si no lo ecuentra que retorne null
    public Persona findByName(String name)
    {
        for (int i = 0; i < personas.size(); i++) 
        {
            if (personas.get(i).getName().equals(name)) 
            {
                return personas.get(i);
            }            
        }
        return null;
    }

    //metodo que busque una posicion y retorne la posicion si lo encontro
    //si no lo ecuentra que retorne -1
    public int findPosByName(String name)
    {
        //para trabajar con posiciones el for es la mejor opcion
        for (int i = 0; i < personas.size(); i++) 
        {
            //el peersonas.get(i) es un objeto de tipo Persona, entonces para acceder a su nombre usamos el metodo getName()
            //el equals es para comparar cadenas de texto
            if (personas.get(i).getName().equals(name)) 
            {
                return i;
            }
        }
        return -1;
    }
}