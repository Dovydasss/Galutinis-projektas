package lt.viko.eif.api.Galutinisprojektas.service.impl;

import lt.viko.eif.api.Galutinisprojektas.repository.MissionRepository;
import lt.viko.eif.api.Galutinisprojektas.repository.TeamRepository;
import lt.viko.eif.api.Galutinisprojektas.service.DistanceMatrix;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;


@Service
public class DistanceMatrixImpl implements DistanceMatrix {

    private static final String API_KEY = "AIzaSyCoSJSokY0_9zbSlTENypxPgXYn9PtecYs";

    String distance= null;

    @Override
    public String getDistance(String teamCity, String missionCity) {
        try {
            var url = "https://maps.googleapis.com/maps/api/distancematrix/json?origins=" + teamCity + "&destinations=" + missionCity + "&key=" + API_KEY;
            var request = HttpRequest.newBuilder().GET().uri(URI.create(url)).build();
            var client = HttpClient.newBuilder().build();
            var response = client.send(request, HttpResponse.BodyHandlers.ofString()).body();
            // System.out.println(response);
            JSONParser jp = new JSONParser();
            JSONObject jo = (JSONObject) jp.parse(response);
            JSONArray ja = (JSONArray) jo.get("rows");
            jo = (JSONObject) ja.get(0);
            ja = (JSONArray) jo.get("elements");
            jo = (JSONObject) ja.get(0);
            JSONObject je = (JSONObject) jo.get("distance");
            String distance = null;
            distance = (String) je.get("text");

            System.out.println(distance);



        } catch (Exception e) {
            System.out.println(e);
        }
        return distance;
    }
}
