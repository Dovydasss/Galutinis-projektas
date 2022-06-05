package lt.viko.eif.api.Galutinisprojektas.controller;

import lt.viko.eif.api.Galutinisprojektas.model.Member;
import lt.viko.eif.api.Galutinisprojektas.service.MemberService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * This class is an endpoint for accessing members data.
 * It contains methods, which post, retrieve, retrieve by id, update, or delete data.
 */

@RestController
@RequestMapping("/member")
public class MemberController {

    private MemberService memberService;

    /**
     * Injects memberService instance.
     *
     * @param memberService interface for the service.
     */

    public MemberController(MemberService memberService){this.memberService = memberService;}

    /**
     * This method is an endpoint for adding members to the database.
     *
     * @return Response message, with status.
     */

    @PostMapping("/new")
    public ResponseEntity<Member> saveMember(@RequestBody Member member){
        return new ResponseEntity<Member>(memberService.saveMember(member), HttpStatus.CREATED);
    }

    /**
     * This method is an endpoint for getting all members from the database.
     *
     * @return returns all members data.
     */

    @GetMapping("/all")
    public List<Member> getAllMember(){
        return memberService.getAllMember();
    }

    /**
     * This method is an endpoint for retrieving member by id from database..
     *
     * @param memberId Member ID which are looking for
     * @return Response message, with status.
     */

    @GetMapping
    public ResponseEntity<Member> getMemberbyId(@RequestParam("id") long memberId){
        return new ResponseEntity<Member>(memberService.getMemberbyId(memberId), HttpStatus.OK);
    }

    /**
     * This method is an endpoint for deleting member data from database..
     *
     * @param id Member id, thats gonna be deleted.
     * @return Response message, with status.
     */

    @DeleteMapping
    public ResponseEntity<String> deleteMember(@RequestParam("id") long id){
        memberService.deleteMember(id);
        return new ResponseEntity<String>("Member deleted successfully!", HttpStatus.OK);
    }

    /**
     * This method is an endpoint for updating member data.
     *
     * @param id member id, which gonna be updated.
     * @return Response message, with status.
     */

    @PutMapping
    public ResponseEntity<Member> updateMember(@RequestParam("id") long id,
        @RequestBody Member member){
        return new ResponseEntity<Member>(memberService.updateMember(member, id), HttpStatus.OK);
    }
}
