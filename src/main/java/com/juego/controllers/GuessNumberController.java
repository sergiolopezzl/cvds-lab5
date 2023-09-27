package com.juego.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Random;

@Controller
public class GuessNumberController {
    private int premio = 100000;
    //private int numeroAdivinar = 4;
    private int numeroAdivinar = new Random().nextInt(10) + 1;

    @GetMapping("/guess")
    public String showGuessForm(Model model) {
        model.addAttribute("premio", premio);
        return "guess";
    }

    @PostMapping("/guess")
    public String checkGuess(int numero, Model model) {
        if (numero == numeroAdivinar) {
            model.addAttribute("resultado", "¡Ganaste! Has adivinado el número. Premio: $" + premio);
        } else {
            premio -= 10000;
            if (premio > 0) {
                model.addAttribute("resultado", "Intenta de nuevo. Premio restante: $" + premio);
            } else {
                model.addAttribute("resultado", "Lo siento, te quedaste sin dinero. Pulsa el botón de reset para jugar de nuevo.");
                premio = 100000;
            }
        }
        model.addAttribute("premio", premio);
        return "guess";
    }
    @PostMapping("/reset")
    public String resetGame(Model model) {
        premio = 100000;
        //numeroAdivinar = 4;
        numeroAdivinar = new Random().nextInt(10) + 1;
        return "redirect:/guess"; // Redirige de nuevo a la página de adivinanza
    }
}
