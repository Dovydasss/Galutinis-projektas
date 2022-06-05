package lt.viko.eif.api.Galutinisprojektas.service;

import lt.viko.eif.api.Galutinisprojektas.model.Member;
import lt.viko.eif.api.Galutinisprojektas.model.Mission;

import java.util.List;

/**
 * This interface is used for creating methods, which
 * execute basic operations to the database.
 */

public interface MissionService {

    /**
     * This method adds Mission to the db.
     *
     * @param mission Mission object, which gonna be saved to db.
     */
    Mission saveMission(Mission mission);

    /**
     * This method gets all missions from the db.
     */

    List<Mission> getAllMission();

    /**
     * This method deletes Mission by ID
     * @param id Mission id
     */

    void deleteMission(long id);

    /**
     * This method gets Mission city by mission id
     * @param id Mission id
     */


    Mission getMissionCity(long id);
}
