package lt.viko.eif.api.Galutinisprojektas.controller;

import lt.viko.eif.api.Galutinisprojektas.model.Team;
import lt.viko.eif.api.Galutinisprojektas.repository.TeamRepository;
import lt.viko.eif.api.Galutinisprojektas.service.TeamService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * This class is an endpoint for accessing teams data.
 * It contains methods, which post, retrieve, update, or delete data.
 */

@RestController
@RequestMapping("/team")
public class TeamController {

    TeamService teamService;

    /**
     * Injects teamService instance.
     *
     * @param teamService interface for the service.
     */

    public TeamController(TeamService teamService){this.teamService = teamService;}

    /**
     * This method is an endpoint for adding new team to the database.
     *
     * @return Response message, with status.
     */

    @PostMapping
    public ResponseEntity<Team> saveTeam(@RequestBody Team team){
        return new ResponseEntity<Team>(teamService.saveTeam(team), HttpStatus.CREATED);
    }

    /**
     * This method is an endpoint for getting all team from the database.
     *
     * @return returns all teams data.
     */

    @GetMapping
    public List<Team> getAllTeam(){
        return teamService.getAllTeam();
    }

    /**
     * This method is an endpoint for updating team data.
     *
     * @param id Team id, which gonna be updated.
     * @return Response message, with status.
     */

    @PutMapping("/{id}")
    public ResponseEntity<Team> updateTeam(@PathVariable("id") long id
            , @RequestBody Team team){
        return new ResponseEntity<Team>(teamService.updateTeam(team, id), HttpStatus.OK);
    }

    /**
     * This method is an endpoint for deleting team data from database..
     *
     * @param id Team id, thats gonna be deleted.
     * @return Response message, with status.
     */

    @DeleteMapping("{id}")
    public ResponseEntity<String> deleteTeam(@PathVariable("id") long id){

        teamService.deleteTeam(id);

        return new ResponseEntity<String>("Team deleted successfully!", HttpStatus.OK);
    }





}
