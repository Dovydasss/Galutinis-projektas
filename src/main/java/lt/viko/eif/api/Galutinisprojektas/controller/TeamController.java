package lt.viko.eif.api.Galutinisprojektas.controller;

import lt.viko.eif.api.Galutinisprojektas.model.Team;
import lt.viko.eif.api.Galutinisprojektas.repository.TeamRepository;
import lt.viko.eif.api.Galutinisprojektas.service.TeamService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/team")
public class TeamController {

    TeamService teamService;

    public TeamController(TeamService teamService){this.teamService = teamService;}

    @PostMapping
    public ResponseEntity<Team> saveTeam(@RequestBody Team team){
        return new ResponseEntity<Team>(teamService.saveTeam(team), HttpStatus.CREATED);
    }

    @GetMapping
    public List<Team> getAllTeam(){
        return teamService.getAllTeam();
    }

    @PutMapping("/{id}")
    public ResponseEntity<Team> updateTeam(@PathVariable("id") long id
            , @RequestBody Team team){
        return new ResponseEntity<Team>(teamService.updateTeam(team, id), HttpStatus.OK);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<String> deleteTeam(@PathVariable("id") long id){

        teamService.deleteTeam(id);

        return new ResponseEntity<String>("Team deleted successfully!", HttpStatus.OK);
    }



}
