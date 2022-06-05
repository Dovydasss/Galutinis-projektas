package lt.viko.eif.api.Galutinisprojektas.service;

import lt.viko.eif.api.Galutinisprojektas.model.Team;

import java.util.List;

public interface TeamService {

    Team saveTeam(Team team);
    List<Team> getAllTeam();
    Team updateTeam(Team team, long id);
    void deleteTeam(long id);
    Team getTeamCity(long id);

}
