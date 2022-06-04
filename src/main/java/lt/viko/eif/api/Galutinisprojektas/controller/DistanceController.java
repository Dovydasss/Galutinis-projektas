package lt.viko.eif.api.Galutinisprojektas.controller;

import lt.viko.eif.api.Galutinisprojektas.service.DistanceMatrix;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("distance")
public class DistanceController {

    DistanceMatrix distanceMatrix;

/*
To do : Is mission ir team istraukt city value pagal id, juos naudojant su distancemartix apskaiciuoti km
 */

}
