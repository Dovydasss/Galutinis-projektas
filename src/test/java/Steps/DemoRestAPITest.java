package Steps;


import java.io.*;
import com.squareup.okhttp.*;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;
import com.sun.istack.*;
import okhttp3.*;
import okhttp3.MediaType;
import okhttp3.ResponseBody;
import okio.*;
import org.apache.http.entity.mime.*;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.junit.Assert;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.springframework.web.bind.annotation.RequestBody;
import lt.viko.eif.api.Galutinisprojektas.model.Member;

import static org.apache.el.lang.ELArithmetic.add;


public class DemoRestAPITest {

    private OkHttpClient client = new OkHttpClient();
    private Response response;


    @When("The user sends GET request to the member endpoint")
    public void theUserSendsGETRequestToTheMemberEndpoint()
    {
        try {
            Request request = new Request.Builder()
                    .url("http://localhost:8080/member")
                    .get()
                    .build();

            this.response = client.newCall(request).execute();
        } catch (IOException e) {
            System.out.println("Unnsecsessful endpoint call " + e.getMessage());
        }
    }
    @Then("A list of members is displayed")
    public void AListOfMembersIsDisplayed(){
        Assert.assertEquals(200, response.code());
    }

    @When("The user sends GET request to the mission endpoint")
    public void theUserSendsGETRequestToTheMissionEndpoint()
    {
        try {
            Request request = new Request.Builder()
                    .url("http://localhost:8080/mission")
                    .get()
                    .build();

            this.response = client.newCall(request).execute();
        } catch (IOException e) {
            System.out.println("Unnsecsessful endpoint call " + e.getMessage());
        }
    }
    @Then("A list of missions is displayed")
    public void AListOfMissionsIsDisplayed(){
        Assert.assertEquals(200, response.code());
    }

    @When("The user sends GET request to the team endpoint")
    public void theUserSendsGETRequestToTheTeamEndpoint()
    {
        try {
            Request request = new Request.Builder()
                    .url("http://localhost:8080/team")
                    .get()
                    .build();

            this.response = client.newCall(request).execute();
        } catch (IOException e) {
            System.out.println("Unnsecsessful endpoint call " + e.getMessage());
        }
    }
    @Then("A list of teams is displayed")
    public void AListOfTeamsIsDisplayed(){
        Assert.assertEquals(200, response.code());
    }

    @When("The user sends POST request to the member endpoint")
    public void theUserSendsPOSTRequestToTheMemberEndpoint()
    {
        try {
            Request request = new Request.Builder()
                    .url("http://localhost:8080/member")
                    .post()
                    .build();

            this.response = client.newCall(request).execute();
        } catch (IOException e) {
            System.out.println("Unnsecsessful endpoint call " + e.getMessage());
        }
    }
    @Then("A new POST of memeber is displayed")
    public void ANewPOSTOfMemeberIsDisplayed(){
        Assert.assertEquals(200, response.code());
    }

    @When("The user sends POST request to the team endpoint")
    public void theUserSendsPOSTRequestToTheTeamEndpoint()
    {
        try {
            Request request = new Request.Builder()
                    .url("http://localhost:8080/team")
                    .post()
                    .build();

            this.response = client.newCall(request).execute();
        } catch (IOException e) {
            System.out.println("Unnsecsessful endpoint call " + e.getMessage());
        }
    }
    @Then("A new POST of team is displayed")
    public void ANewPOSTOfTeamIsDisplayed(){
        Assert.assertEquals(200, response.code());
    }

    @When("The user sends POST request to the mission endpoint")
    public void theUserSendsPOSTRequestToTheMessionEndpoint()
    {
        ResponseBody formBody = new ResponseBody() {
                .add("id", "1")
                .add("name", "test")
                .add("lastname", "test")
                .add("birthdate", "2000-02-02")
                .build();
                }
        try {
            Request request = new Request.Builder()
                    .url("http://localhost:8080/member")
                    .post(formBody)
                    .build();

            this.response = client.newCall(request).execute();
        } catch (IOException e) {
            System.out.println("Unnsecsessful endpoint call " + e.getMessage());
        }
    }
    @Then("A new POST of mission is displayed")
    public void ANewPOSTOfMissionIsDisplayed(){
        Assert.assertEquals(200, response.code());
    }





    }




