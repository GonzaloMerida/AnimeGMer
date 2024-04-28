/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.java;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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

    @PutMapping("/anime/fav/{fav}/{title}")
    public ResponseEntity<String> updateFav(@PathVariable("fav") Boolean nFav, @PathVariable("title") String title) {
        Optional<Anime> optionalAnime = animeRepository.findByTitleIgnoreCase(title);

        if (optionalAnime.isPresent()) {
            Anime anime = optionalAnime.get();
            anime.setFav(nFav);
            animeRepository.save(anime);
            return ResponseEntity.ok("Anime guardado como favorito");
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Anime no encontrado");
        }
    }

    @PutMapping("/anime/pend/{pend}/{title}")
    public ResponseEntity<String> updatePend(@PathVariable("pend") Boolean nPend, @PathVariable("title") String title) {
        Optional<Anime> optionalAnime = animeRepository.findByTitleIgnoreCase(title);

        if (optionalAnime.isPresent()) {
            Anime anime = optionalAnime.get();
            anime.setFav(nPend);
            animeRepository.save(anime);
            return ResponseEntity.ok("Anime guardado como pendiente");
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Anime no encontrado");
        }
    }
}
