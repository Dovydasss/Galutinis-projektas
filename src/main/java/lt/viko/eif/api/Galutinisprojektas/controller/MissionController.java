package lt.viko.eif.api.Galutinisprojektas.controller;

import lt.viko.eif.api.Galutinisprojektas.model.Member;
import lt.viko.eif.api.Galutinisprojektas.model.Mission;
import lt.viko.eif.api.Galutinisprojektas.model.Team;
import lt.viko.eif.api.Galutinisprojektas.service.MissionService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/mission")
public class MissionController {

    MissionService missionService;

    public MissionController(MissionService missionService){this.missionService = missionService;}

    @PostMapping
    public ResponseEntity<Mission> saveMission(@RequestBody Mission mission){
        return new ResponseEntity<Mission>(missionService.saveMission(mission), HttpStatus.CREATED);
    }

    @GetMapping
    public List<Mission> getAllMission(){
        return missionService.getAllMission();
    }

    @DeleteMapping("{id}")
    public ResponseEntity<String> deleteMission(@PathVariable("id") long id){

        missionService.deleteMission(id);

        return new ResponseEntity<String>("Mission deleted successfully!", HttpStatus.OK);
    }
}
