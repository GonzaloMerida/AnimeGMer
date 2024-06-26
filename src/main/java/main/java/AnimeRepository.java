/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package main.java;

import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

/**
 *
 * @author gonza
 */
@Repository
public interface AnimeRepository extends JpaRepository<Anime, Integer>{

    public List<Anime> findByUsersList_UserName(String userName);

    public List<Anime> findByUsersList_IdUser(String idUser);
    
    public Optional<Anime> findByTitleIgnoreCase(String title);

    

}
