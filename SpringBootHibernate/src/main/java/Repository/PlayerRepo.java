package Repository;
import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import entity.Player;
@Repository
public interface PlayerRepo extends CrudRepository<Player, Long> {
    List<Player> findByTeamId(long teamId);
}