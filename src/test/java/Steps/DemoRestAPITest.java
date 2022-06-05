package Steps;


import java.io.*;

import com.squareup.okhttp.MediaType;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.RequestBody;
import com.squareup.okhttp.Response;
import okhttp3.*;
import okio.*;
import org.junit.Assert;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



public class DemoRestAPITest {

    private OkHttpClient client = new OkHttpClient();
    private Response response;


    @When("The user sends GET request to the member endpoint")
    public void theUserSendsGETRequestToTheMemberEndpoint()
    {

        try {
            Request request = new Request.Builder()
                    .url("http://localhost:8080/API/Galutinis/all")
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




    }




