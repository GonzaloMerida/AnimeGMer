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
public class Pending {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idPend;

    @Column
    private int priority;
    
    @Column
    private Blob animeImage;

    @ManyToOne
    private Anime anime;

    @ManyToOne
    private User user;

    public Pending() {
    }

    public Pending(int priority, Blob animeImage) {
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
