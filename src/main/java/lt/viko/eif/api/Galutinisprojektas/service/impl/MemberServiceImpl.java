package lt.viko.eif.api.Galutinisprojektas.service.impl;

import lt.viko.eif.api.Galutinisprojektas.exception.ResourceNotFoundException;
import lt.viko.eif.api.Galutinisprojektas.model.Member;
import lt.viko.eif.api.Galutinisprojektas.repository.MemberRepository;
import lt.viko.eif.api.Galutinisprojektas.service.MemberService;
import org.springframework.http.server.DelegatingServerHttpResponse;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MemberServiceImpl implements MemberService {

    MemberRepository memberRepository;

    public MemberServiceImpl(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

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
                new ResourceNotFoundException("Member", "id", id));
        memberRepository.deleteById(id);
    }

    @Override
    public Member getMemberbyId(long id) {
        return memberRepository.findById(id).orElseThrow(() ->
                new ResourceNotFoundException("Member", "id", id));
    }

    @Override
    public Member updateMember(Member member, long id){
        //Check if it exists
        Member existingMember = memberRepository.findById(id).orElseThrow(() ->
                new ResourceNotFoundException("Member", "id", id));
        //Overwrite the existing one
        existingMember.setName(member.getName());
        existingMember.setLastName(member.getLastName());
        existingMember.setBirthDate(member.getBirthDate());
        //Saving
        memberRepository.save(existingMember);
        return existingMember;
    }
}
