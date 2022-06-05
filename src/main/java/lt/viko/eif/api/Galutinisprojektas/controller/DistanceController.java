package lt.viko.eif.api.Galutinisprojektas.controller;

import lt.viko.eif.api.Galutinisprojektas.model.Team;
import lt.viko.eif.api.Galutinisprojektas.service.DistanceMatrix;
import lt.viko.eif.api.Galutinisprojektas.service.MissionService;
import lt.viko.eif.api.Galutinisprojektas.service.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * This class is an endpoint for accessing distance.
 * It contains retrive method.
 */

@RestController
@RequestMapping("/distance")
public class DistanceController {

    private DistanceMatrix distanceMatrix;
    @Autowired
    private MissionService missionService;
    @Autowired
    private TeamService teamService;

    /**
     * Injects distanceMatrix instance.
     *
     * @param distanceMatrix interface for the service.
     */

    public DistanceController(DistanceMatrix distanceMatrix) {
        this.distanceMatrix = distanceMatrix;
    }

    private static final String distance = "MISSION DISTANCE: %s";
    private static final String objective = "OBJECTIVE: ";
    private static final String start = "STARTING POINT: ";
    private static final String assigned = "ASSIGNED TEAM: ";


    /**
     * This method is an endpoint for retrieving distance between team city and mission city.
     *
     * @param teamid Team id
     * @param missionid Mission id
     * @return Response message, with status.
     */

    @GetMapping("{teamid}/{missionid}")
    public ResponseEntity <String> calculate(@PathVariable long teamid, @PathVariable long missionid){
        String City = teamService.getTeamCity(teamid).getCity();
        String TeamName = teamService.getTeamCity(teamid).getTeamName();
        String MissionCity = missionService.getMissionCity(missionid).getCity();
        String Distance = distanceMatrix.getDistance(City, MissionCity);

        return new ResponseEntity<String>(String.format(
                distance, Distance + "\n"
                + objective + MissionCity + "\n"
                + start + City + "\n"
                        + assigned + TeamName), HttpStatus.OK);
    }
}
