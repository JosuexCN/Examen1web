/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen.examen.service;

import examen.examen.entity.Pelicula;
import examen.examen.repository.PeliculaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Josuex
 */
@Service
public class PeliculaService implements IPeliculaService {
    
     @Autowired
    private PeliculaRepository peliculaRepository;

    @Override
    public List<Pelicula> getAllPersona() {
        return (List<Pelicula>)peliculaRepository.findAll();
    }

    @Override
    public Pelicula getPersonaById(long id) {
        return peliculaRepository.findById(id).orElse(null);
    }

    @Override
    public long savePersona(Pelicula pelicula) {
        long res =0;
        Pelicula c = peliculaRepository.save(pelicula);
        if(!c.equals(null)){
            res =1;
        }
        return res;
    }

    @Override
    public void delete(long id) {
        peliculaRepository.deleteById(id);
    }
    
}
