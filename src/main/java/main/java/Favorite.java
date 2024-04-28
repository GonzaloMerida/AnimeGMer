/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.java;

import javax.persistence.*;

/**
 *
 * @author gonza
 */
@Entity
public class Favorite {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idFav;

    @Column(nullable = true)
    private Double userRating;

    @Column(nullable = true, length = 700)
    private String userComments;

    @Column
    private byte[] animeImage;

    @ManyToOne
    private Anime anime;

    @ManyToOne
    private Users user;

    public Favorite() {
    }

    public Favorite(Double userRating, String userComments, byte[] animeImage) {
        this.userRating = userRating;
        this.userComments = userComments;
        this.animeImage = animeImage;
    }

    public int getIdFav() {
        return idFav;
    }

    public void setIdFav(int idFav) {
        this.idFav = idFav;
    }

    public Double getUserRating() {
        return userRating;
    }

    public void setUserRating(Double userRating) {
        this.userRating = userRating;
    }

    public String getUserComments() {
        return userComments;
    }

    public void setUserComments(String userComments) {
        this.userComments = userComments;
    }

    public byte[] getAnimeImage() {
        return animeImage;
    }

    public void setAnimeImage(byte[] animeImage) {
        this.animeImage = animeImage;
    }

    public Anime getAnime() {
        return anime;
    }

    public void setAnime(Anime anime) {
        this.anime = anime;
    }

    public Users getUser() {
        return user;
    }

    public void setUser(Users user) {
        this.user = user;
    }


}