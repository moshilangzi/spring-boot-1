package springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import springboot.entity.Comefrom;

import java.util.List;

/**
 * ◢◤●████▄▄▄▄▄▄ ●●●●●   Created with Intellij IDEA.
 * ▄▅██████▅▄▃▂          User: Mario.Hu
 * ██████████████        Date: 08/04/2017 21:38
 * ◥⊙▲⊙▲⊙▲⊙▲⊙▲⊙▲◤
 */
@Repository
public interface ComefromResp extends JpaRepository<Comefrom,String> {

    List<Comefrom> findAllByOrderByTimeDesc();
}
