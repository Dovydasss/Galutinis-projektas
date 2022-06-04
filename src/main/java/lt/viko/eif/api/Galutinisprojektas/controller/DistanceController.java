package lt.viko.eif.api.Galutinisprojektas.controller;

import lt.viko.eif.api.Galutinisprojektas.service.DistanceMatrix;
import lt.viko.eif.api.Galutinisprojektas.service.MissionService;
import lt.viko.eif.api.Galutinisprojektas.service.TeamService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/distance")
public class DistanceController {

    private DistanceMatrix distanceMatrix;
    private MissionService missionService;
    private TeamService teamService;

/*
    public DistanceController(DistanceMatrix distanceMatrix){this.distanceMatrix = distanceMatrix;}
    public DistanceController(MissionService missionService){this.missionService = missionService;}
    public DistanceController(TeamService teamService){this.teamService = teamService;}



/*
To do : Is mission ir team istraukt city value pagal id, juos naudojant su distancemartix apskaiciuoti km
 */

}
