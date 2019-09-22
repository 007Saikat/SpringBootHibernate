package Service;

import java.util.List;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import entity.Player;
import entity.Team;
import Repository.PlayerRepo;
import Repository.TeamRePO;

import Repository.PlayerRepo;
import Repository.TeamRePO;
@Service
public class SoccerServiceImpl implements SoccerService {
    @Autowired
    private PlayerRepo playerRepository;
    @Autowired
    private TeamRePO teamRepository;
    public List<String> getAllTeamPlayers(long teamId) {
        List<String> result = new ArrayList<String>();
        List<Player> players = playerRepository.findByTeamId(teamId);
        for (Player player : players) {
            result.add(player.getName());
        }
        return result;
    }
    public void addBarcelonaPlayer(String name, String position, int number) {
        Team barcelona = teamRepository.findOne(1l);
        Player newPlayer = new Player();
        newPlayer.setName(name);
        newPlayer.setPosition(position);
        newPlayer.setNum(number);
        newPlayer.setTeam(barcelona);
        playerRepository.save(newPlayer);
    }
}