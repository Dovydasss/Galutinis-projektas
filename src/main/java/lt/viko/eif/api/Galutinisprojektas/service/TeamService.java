package lt.viko.eif.api.Galutinisprojektas.service;

import lt.viko.eif.api.Galutinisprojektas.model.Team;

import java.util.List;

/**
 * This interface is used for creating methods, which
 * execute basic operations to the database.
 */

public interface TeamService {

    /**
     * This method adds team to the db.
     *
     * @param team Team object, which gonna be saved to db.
     */
    Team saveTeam(Team team);

    /**
     * This method gets all teams from the db.
     */

    List<Team> getAllTeam();

    /**
     * This method updates existing team data to db.
     * @param team Team object thats gonna be updated
     * @param id Team id thats gonna be updated
     */

    Team updateTeam(Team team, long id);

    /**
     * This method deletes Team by ID
     * @param id Island id
     */

    void deleteTeam(long id);

    /**
     * This method gets Team city by team id
     * @param id Team id
     */

    Team getTeamCity(long id);

}
