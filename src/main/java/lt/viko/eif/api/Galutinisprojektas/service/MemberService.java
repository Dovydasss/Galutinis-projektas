package lt.viko.eif.api.Galutinisprojektas.service;

import lt.viko.eif.api.Galutinisprojektas.model.Member;

import java.util.List;

/**
 * This interface is used for creating methods, which
 * execute basic operations to the database.
 */

public interface MemberService {

    /**
     * This method adds member to the db.
     *
     * @param member Member object, which gonna be saved to db.
     */
    Member saveMember(Member member);

    /**
     * This method gets all members from the db.
     */

    List<Member> getAllMember();
    void deleteMember(long id);

    /**
     * This method gets member by id from db.
     * @param id Id of searching member
     */

    Member getMemberbyId(long id);

    /**
     * This method updates existing member data to db.
     * @param member Member object thats gonna be updated
     * @param id Member id thats gonna be updated
     */

    Member updateMember(Member member, long id);


}
