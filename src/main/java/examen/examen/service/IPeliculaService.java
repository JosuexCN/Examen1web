/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package examen.examen.service;

import examen.examen.entity.Pelicula;
import java.util.List;

/**
 *
 * @author Josuex
 */
public interface IPeliculaService {
    public List<Pelicula> getAllPersona();
    public Pelicula getPersonaById(long id);
    public long savePersona(Pelicula pelicula);
    public void delete (long id);
}
