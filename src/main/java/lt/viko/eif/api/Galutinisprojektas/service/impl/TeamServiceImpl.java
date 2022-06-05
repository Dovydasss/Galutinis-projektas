package lt.viko.eif.api.Galutinisprojektas.service.impl;

import lt.viko.eif.api.Galutinisprojektas.exception.ResourceNotFoundException;
import lt.viko.eif.api.Galutinisprojektas.model.Member;
import lt.viko.eif.api.Galutinisprojektas.model.Team;
import lt.viko.eif.api.Galutinisprojektas.repository.MemberRepository;
import lt.viko.eif.api.Galutinisprojektas.repository.TeamRepository;
import lt.viko.eif.api.Galutinisprojektas.service.TeamService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeamServiceImpl implements TeamService {

    TeamRepository teamRepository;

    public TeamServiceImpl(TeamRepository teamRepository){this.teamRepository = teamRepository;}


    @Override
    public Team saveTeam(Team team) {
        return teamRepository.save(team);
    }

    @Override
    public List<Team> getAllTeam() {
        return teamRepository.findAll();
    }

    @Override
    public Team updateTeam(Team team, long id) {
        Team existingTeam = teamRepository.findById(id).orElseThrow(
                () -> new ResourceNotFoundException("Team", "Id", id));
        existingTeam.setTeamName(team.getTeamName());
        existingTeam.setMemberId1(team.getMemberId1());
        existingTeam.setMemberId2(team.getMemberId2());
        existingTeam.setMemberId3(team.getMemberId3());
        existingTeam.setMemberId4(team.getMemberId4());
        existingTeam.setMemberId5(team.getMemberId5());

        teamRepository.save(existingTeam);

        return existingTeam;
    }

    @Override
    public void deleteTeam(long id) {
    }


    @Override
    public Team getTeamCity(long id){
        Team existingTeam = teamRepository.findById(id).orElseThrow(() ->
                new ResourceNotFoundException("Team", "id", id));
        return existingTeam;
    }


}
