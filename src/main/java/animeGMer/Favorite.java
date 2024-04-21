/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package animeGMer;

import java.sql.Blob;
import java.sql.Date;
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
    private Float userRating;

    @Column(nullable = true, length = 700)
    private String userComments;
    
    @Column
    private Blob animeImage;
    
    @ManyToOne
    private Anime anime;
    
    @ManyToOne
    private User user;

    public Favorite() {
    }

    public Favorite(Float userRating, String userComments, Blob animeImage) {
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

    public Float getUserRating() {
        return userRating;
    }

    public void setUserRating(Float userRating) {
        this.userRating = userRating;
    }

    public String getUserComments() {
        return userComments;
    }

    public void setUserComments(String userComments) {
        this.userComments = userComments;
    }

    public Blob getAnimeImage() {
        return animeImage;
    }

    public void setAnimeImage(Blob animeImage) {
        this.animeImage = animeImage;
    }

    public Anime getAnime() {
        return anime;
    }

    public void setAnime(Anime anime) {
        this.anime = anime;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
    
    
}
