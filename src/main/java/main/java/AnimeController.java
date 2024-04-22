/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.java;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author gonza
 */
@RestController
@RequestMapping("/api/")
public class AnimeController {

    @Autowired
    private AnimeRepository animeRepository;

    @GetMapping("/anime/")
    public List<Anime> allAnimes() {
        return animeRepository.findAll();
    }

    @GetMapping("/anime/user/{userName}")
    public List<Anime> findAnimeByUserName(@PathVariable("userName") String userName) {
        return animeRepository.findByUsersList_UserName(userName);
    }

    @GetMapping("/anime/user/{idUser}")
    public List<Anime> findAnimeByIdUser(@PathVariable("idUser") String idUser) {
        return animeRepository.findByUsersList_IdUser(idUser);
    }

}
