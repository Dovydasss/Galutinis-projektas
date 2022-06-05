package lt.viko.eif.api.Galutinisprojektas.controller;

import lt.viko.eif.api.Galutinisprojektas.model.Team;
import lt.viko.eif.api.Galutinisprojektas.service.DistanceMatrix;
import lt.viko.eif.api.Galutinisprojektas.service.MissionService;
import lt.viko.eif.api.Galutinisprojektas.service.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/distance")
public class DistanceController {

    private DistanceMatrix distanceMatrix;
    @Autowired
    private MissionService missionService;
    @Autowired
    private TeamService teamService;

    public DistanceController(DistanceMatrix distanceMatrix) {
        this.distanceMatrix = distanceMatrix;
    }

    private static final String distance = "MISSION DISTANCE: %s";
    private static final String objective = "OBJECTIVE: ";
    private static final String start = "STARTING POINT: ";
    private static final String assigned = "ASSIGNED TEAM: ";

    @GetMapping("{teamid}/{missionid}")
    public ResponseEntity <String> calculate(@PathVariable long teamid, @PathVariable long missionid){
        String City = teamService.getTeamCity(teamid).getCity().toString();
        String TeamName = teamService.getTeamCity(teamid).getTeamName().toString();
        String MissionCity = missionService.getMissionCity(missionid).getCity().toString();
        String Distance = distanceMatrix.getDistance(City, MissionCity);

        return new ResponseEntity<String>(String.format(
                distance, Distance + "\n"
                + objective + MissionCity + "\n"
                + start + City + "\n"
                        + assigned + TeamName), HttpStatus.OK);
    }
}
