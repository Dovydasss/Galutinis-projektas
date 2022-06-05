package lt.viko.eif.api.Galutinisprojektas.controller;

import lt.viko.eif.api.Galutinisprojektas.model.Member;
import lt.viko.eif.api.Galutinisprojektas.service.MemberService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/API/Galutinis")
public class MemberController {

    private MemberService memberService;

    public MemberController(MemberService memberService){this.memberService = memberService;}

    @PostMapping("/new")
    public ResponseEntity<Member> saveMember(@RequestBody Member member){
        return new ResponseEntity<Member>(memberService.saveMember(member), HttpStatus.CREATED);
    }

    //SHOW ALL MEMBERS
    @GetMapping("/all")
    public List<Member> getAllMember(){
        return memberService.getAllMember();
    }

    //SHOW MEMBERS BY ID
    @GetMapping("/member")
    public ResponseEntity<Member> getMemberbyId(@RequestParam("id") long memberId){
        return new ResponseEntity<Member>(memberService.getMemberbyId(memberId), HttpStatus.OK);
    }
    //DELETE A MEMBER
    @DeleteMapping("/member/{id}")
    public ResponseEntity<String> deleteMember(@PathVariable long id){
        memberService.deleteMember(id);
        return new ResponseEntity<String>("Member deleted successfully!", HttpStatus.OK);
    }

    //UPDATE A MEMBER
    @PutMapping("/{id}")
    public ResponseEntity<Member> updateMember(@RequestParam("id") long id,
        @RequestBody Member member){
        return new ResponseEntity<Member>(memberService.updateMember(member, id), HttpStatus.OK);
    }
}
