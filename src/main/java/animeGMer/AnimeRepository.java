/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package animeGMer;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author gonza
 */
public interface AnimeRepository extends JpaRepository<Anime, Integer>{

    public List<Anime> findByUsersList_UserName(String userName);

    public List<Anime> findByUsersList_IdUser(String idUser);


}
