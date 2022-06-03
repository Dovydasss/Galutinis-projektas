package lt.viko.eif.api.Galutinisprojektas.service;

import lt.viko.eif.api.Galutinisprojektas.model.Member;

import java.util.List;

public interface MemberService {

    Member saveMember(Member member);
    List<Member> getAllMember();
    void deleteMember(long id);
}
