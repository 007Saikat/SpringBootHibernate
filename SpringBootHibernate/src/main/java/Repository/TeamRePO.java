package Repository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import entity.Team;
@Repository
public interface TeamRePO extends CrudRepository<Team, Long> {
    Team findByPlayers(long playerId);
}