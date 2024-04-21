/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package animeGMer;

import java.sql.Blob;
import java.sql.Date;
import java.util.LinkedList;
import java.util.List;
import javax.persistence.*;

/**
 *
 * @author gonza
 */
@Entity
public class Anime {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idAnime;

    @Column(length = 100)
    private String title;

    @Column(length = 100)
    private String genre;

    @Column
    private Date launchDate;

    @Column(length = 100)
    private String studios;

    @Column(length = 800)
    private String summary;

    @Column(nullable = true)
    private Float rating;

    @Column
    private Blob animeImage;

    @Column(nullable = true)
    private Boolean fav;

    @Column(nullable = true)
    private Boolean pend;

    @ManyToMany(cascade = {CascadeType.ALL}, fetch = FetchType.EAGER)
    @JoinTable(name = "anime_user",
            joinColumns = @JoinColumn(name = "idAnime"),
            inverseJoinColumns = @JoinColumn(name = "idUser"))
    private List<User> usersList = new LinkedList<>();
    
    @OneToMany(cascade = CascadeType.ALL)
    private List<Favorite> favoriteList = new LinkedList<>();
    
    @OneToMany(cascade = CascadeType.ALL)
    private List<Pending> pendingList = new LinkedList<>();
    

    public Anime() {

    }

    public Anime(String title, String genre, Date launchDate, String studios, String summary, Float rating, Blob animeImage, Boolean fav, Boolean pend) {
        this.title = title;
        this.genre = genre;
        this.launchDate = launchDate;
        this.studios = studios;
        this.summary = summary;
        this.rating = rating;
        this.animeImage = animeImage;
        this.fav = fav;
        this.pend = pend;
    }

    public int getIdAnime() {
        return idAnime;
    }

    public void setIdAnime(int idAnime) {
        this.idAnime = idAnime;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public Date getLaunchDate() {
        return launchDate;
    }

    public void setLaunchDate(Date launchDate) {
        this.launchDate = launchDate;
    }

    public String getStudios() {
        return studios;
    }

    public void setStudios(String studios) {
        this.studios = studios;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public Float getRating() {
        return rating;
    }

    public void setRating(Float rating) {
        this.rating = rating;
    }

    public Blob getAnimeImage() {
        return animeImage;
    }

    public void setAnimeImage(Blob animeImage) {
        this.animeImage = animeImage;
    }

    public Boolean getFav() {
        return fav;
    }

    public void setFav(Boolean fav) {
        this.fav = fav;
    }

    public Boolean getPend() {
        return pend;
    }

    public void setPend(Boolean pend) {
        this.pend = pend;
    }

    public List<User> getUsersList() {
        return usersList;
    }

    public void setUsersList(List<User> usersList) {
        this.usersList = usersList;
    }

    public List<Favorite> getFavoriteList() {
        return favoriteList;
    }

    public void setFavoriteList(List<Favorite> favoriteList) {
        this.favoriteList = favoriteList;
    }

    public List<Pending> getPendingList() {
        return pendingList;
    }

    public void setPendingList(List<Pending> pendingList) {
        this.pendingList = pendingList;
    }


    
    

}
