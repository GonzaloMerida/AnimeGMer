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
public class Pending {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idPend;

    @Column
    private int priority;

    @Column
    private byte[] animeImage;

    @ManyToOne
    private Anime anime;

    @ManyToOne
    private Users user;

    public Pending() {
    }

    public Pending(int priority, byte[] animeImage) {
        this.priority = priority;
        this.animeImage = animeImage;
    }



    public int getIdPend() {
        return idPend;
    }

    public void setIdPend(int idPend) {
        this.idPend = idPend;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
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
