package lt.viko.eif.api.Galutinisprojektas.controller;

import lt.viko.eif.api.Galutinisprojektas.model.Member;
import lt.viko.eif.api.Galutinisprojektas.model.Mission;
import lt.viko.eif.api.Galutinisprojektas.model.Team;
import lt.viko.eif.api.Galutinisprojektas.service.MissionService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * This class is an endpoint for accessing missions data.
 * It contains methods, which post, retrieve or delete data.
 */

@RestController
@RequestMapping("/mission")
public class MissionController {

    MissionService missionService;

    /**
     * Injects missionService instance.
     *
     * @param missionService interface for the service.
     */

    public MissionController(MissionService missionService){this.missionService = missionService;}

    /**
     * This method is an endpoint for adding missions to the database.
     *
     * @return Response message, with status.
     */

    @PostMapping("/new")
    public ResponseEntity<Mission> saveMission(@RequestBody Mission mission){
        return new ResponseEntity<Mission>(missionService.saveMission(mission), HttpStatus.CREATED);
    }

    /**
     * This method is an endpoint for getting all missions from the database.
     *
     * @return returns all missions data.
     */

    @GetMapping("/all")
    public List<Mission> getAllMission(){
        return missionService.getAllMission();
    }

    /**
     * This method is an endpoint for deleting mission data from database..
     *
     * @param id Mission id, thats gonna be deleted.
     * @return Response message, with status.
     */
    @PutMapping
    public ResponseEntity<Mission> updateMission(@RequestParam("id") long id,
                                               @RequestBody Mission mission){
        return new ResponseEntity<Mission>(missionService.updateMission(mission, id), HttpStatus.OK);
    }

    @DeleteMapping
    public ResponseEntity<String> deleteMission(@RequestParam("id") long id){

        missionService.deleteMission(id);

        return new ResponseEntity<String>("Mission deleted successfully!", HttpStatus.OK);
    }
}
