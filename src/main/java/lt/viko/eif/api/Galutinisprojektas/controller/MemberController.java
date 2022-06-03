package lt.viko.eif.api.Galutinisprojektas.controller;

import lt.viko.eif.api.Galutinisprojektas.model.Member;
import lt.viko.eif.api.Galutinisprojektas.service.MemberService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/member")
public class MemberController {

    private MemberService memberService;

    public MemberController(MemberService memberService){this.memberService = memberService;}

    @PostMapping
    public ResponseEntity<Member> saveMember(@RequestBody Member member){
        return new ResponseEntity<Member>(memberService.saveMember(member), HttpStatus.CREATED);
    }

    @GetMapping
    public List<Member> getAllMember(){
        return memberService.getAllMember();
    }

    @DeleteMapping("{id}")
    public ResponseEntity<String> deleteMember(@PathVariable("id") long id){

        memberService.deleteMember(id);

        return new ResponseEntity<String>("Member deleted successfully!", HttpStatus.OK);
    }

}
