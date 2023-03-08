/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen.examen.controller;

import examen.examen.entity.Pelicula;
import examen.examen.service.IPeliculaService;
import jakarta.validation.Valid;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Josuex
 */
@Controller
public class PeliculaController {
    @Autowired
    private IPeliculaService peliculaService;
    
    @GetMapping("/peliculas")
    public String index(Model model){
        List<Pelicula> listaPelicula = peliculaService.getAllPersona();
        model.addAttribute("titulo","Cinelitas Cartelera");
        model.addAttribute("peliculas",listaPelicula);
        return "peliculas";
    }
    
    @GetMapping("/delete/{id}")
    public String delete(Model model, @PathVariable long id){
        peliculaService.delete(id);
        return "redirect:/peliculas";
    }
    
    @GetMapping("/agregar") //Añadir método para agregar
    public String add(Model model) {
        model.addAttribute("titulo", "Agregar Nuevo Concierto");
        model.addAttribute("pelicula", new Pelicula());
        return "agregar";
    }
    
    @PostMapping("/save")
    public String savePersona(@Valid Pelicula c, Model model){
        peliculaService.savePersona(c);
        return "redirect:/peliculas";
    }
    
    @RequestMapping("/home")
    public String defectDetails() {
        return "home"; //defect-details.html page name to open it
    }
}
