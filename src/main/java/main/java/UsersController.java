/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.java;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author gonza
 */
@RestController
@RequestMapping("/api/")
public class UsersController {

    @Autowired
    private UsersRepository userRepository;

    @GetMapping("/user/")
    public List<Users> allUsers() {
        return userRepository.findAll();
    }

    @PutMapping("/user/{userName}/userName")
    public ResponseEntity<String> updateUserName(@PathVariable("userName") String pathUserName, @RequestBody String requestBodyUserName) {
        Optional<Users> optionalUser = userRepository.findByUserName(pathUserName);

        if (optionalUser.isPresent()) {
            Users user = optionalUser.get();
            user.setUserName(requestBodyUserName);
            userRepository.save(user);
            return ResponseEntity.ok("Nombre de usuario actualizado correctamente");
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Usuario no encontrado");
        }
    }

    @GetMapping("/user/{userName}/numFavs")
    public ResponseEntity<Integer> getNumFavs(@PathVariable("userName") String userName) {
        Optional<Users> optionalUser = userRepository.findByUserName(userName);

        if (optionalUser.isPresent()) {
            Users user = optionalUser.get();
            return ResponseEntity.ok(user.getNumFavs());
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
        }
    }

    @GetMapping("/user/{userName}/numPends")
    public ResponseEntity<Integer> getNumPends(@PathVariable("userName") String userName) {
        Optional<Users> optionalUser = userRepository.findByUserName(userName);

        if (optionalUser.isPresent()) {
            Users user = optionalUser.get();
            return ResponseEntity.ok(user.getNumPends());
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
        }
    }

    @GetMapping("/user/{userName}/favoriteNames")
    public ResponseEntity<List<String>> getFavoriteNames(@PathVariable("userName") String userName) {
        Optional<Users> optionalUser = userRepository.findByUserName(userName);

        if (optionalUser.isPresent()) {
            Users user = optionalUser.get();
            List<Favorite> favoriteList = user.getFavoriteList();
            List<String> favoriteNames = new ArrayList<>();
            for (Favorite favorite : favoriteList) {
                favoriteNames.add(favorite.getAnime().getTitle());
            }
            return ResponseEntity.ok(favoriteNames);
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
        }
    }

    @GetMapping("/user/{userName}/pendingNames")
    public ResponseEntity<List<String>> getPendingNames(@PathVariable("userName") String userName) {
        Optional<Users> optionalUser = userRepository.findByUserName(userName);

        if (optionalUser.isPresent()) {
            Users user = optionalUser.get();
            List<Pending> pendingList = user.getPendingList();
            List<String> pendingNames = new ArrayList<>();
            for (Pending pending : pendingList) {
                pendingNames.add(pending.getAnime().getTitle());
            }
            return ResponseEntity.ok(pendingNames);
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
        }
    }

}
