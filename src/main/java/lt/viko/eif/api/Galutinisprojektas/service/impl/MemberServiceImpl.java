package lt.viko.eif.api.Galutinisprojektas.service.impl;

import lt.viko.eif.api.Galutinisprojektas.exception.ResourceNotFoundException;
import lt.viko.eif.api.Galutinisprojektas.model.Member;
import lt.viko.eif.api.Galutinisprojektas.repository.MemberRepository;
import lt.viko.eif.api.Galutinisprojektas.service.MemberService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MemberServiceImpl implements MemberService {

    MemberRepository memberRepository;

    public MemberServiceImpl(MemberRepository memberRepository){this.memberRepository = memberRepository;}

    @Override
    public Member saveMember(Member member) {
        return memberRepository.save(member);
    }

    @Override
    public List<Member> getAllMember() {
        return memberRepository.findAll();
    }

    @Override
    public void deleteMember(long id) {
        memberRepository.findById(id).orElseThrow(() ->
                new ResourceNotFoundException("Member","id", id));
        memberRepository.deleteById(id);
    }
}
