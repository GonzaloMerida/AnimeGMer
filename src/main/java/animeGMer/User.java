/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package animeGMer;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.sql.Blob;
import java.util.LinkedList;
import java.util.List;
import javax.persistence.*;

/**
 *
 * @author gonza
 */

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idUser;
    
    @Column(length = 100)
    private String userName;
    
    @Column
    private Blob userImage;
    
    @Column
    private int numFavs;
    
    @Column
    private int numPends;

    @ManyToMany(mappedBy = "usersList", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JsonIgnore
    private List<Anime> animeList = new LinkedList<>();
    
    @OneToMany(cascade = CascadeType.ALL)
    private List<Favorite> favoriteList = new LinkedList<>();
    
    @OneToMany(cascade = CascadeType.ALL)
    private List<Pending> pendingList = new LinkedList<>();
    
    public User() {
    }

    public User(String userName, Blob userImage, int numFavs, int numPends) {
        this.userName = userName;
        this.userImage = userImage;
        this.numFavs = numFavs;
        this.numPends = numPends;
    }

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Blob getUserImage() {
        return userImage;
    }

    public void setUserImage(Blob userImage) {
        this.userImage = userImage;
    }

    public int getNumFavs() {
        return numFavs;
    }

    public void setNumFavs(int numFavs) {
        this.numFavs = numFavs;
    }

    public int getNumPends() {
        return numPends;
    }

    public void setNumPends(int numPends) {
        this.numPends = numPends;
    }

    public List<Anime> getAnimeList() {
        return animeList;
    }

    public void setAnimeList(List<Anime> animeList) {
        this.animeList = animeList;
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
