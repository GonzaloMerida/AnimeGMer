/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.java;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.LinkedList;
import java.util.List;
import javax.persistence.*;

/**
 *
 * @author gonza
 */

@Entity
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idUser;

    @Column(length = 100)
    private String userName;

    @Column(length = 12)
    private String password;

    @Column
    private byte[] userImage;

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

    public Users() {
    }

    public Users(String userName, String password, byte[] userImage, int numFavs, int numPends) {
        this.userName = userName;
        this.password = password;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public byte[] getUserImage() {
        return userImage;
    }

    public void setUserImage(byte[] userImage) {
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

