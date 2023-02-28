package com.goit.module13.task2;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;

public class ReadPostComments {
    public static void main(String[] args) throws IOException, URISyntaxException, InterruptedException {
        String uri = "https://jsonplaceholder.typicode.com/users/1/posts";
        String uriUsers = "https://jsonplaceholder.typicode.com/posts/10/comments";

        HttpClient httpClient = HttpClient.newBuilder()
                .version(HttpClient.Version.HTTP_1_1)
                .build();

        HttpRequest httpRequestPost = HttpRequest.newBuilder(new URI(uri))
                .GET()
                .build();
        HttpResponse<String> httpResponsePost = httpClient.send(httpRequestPost, HttpResponse.BodyHandlers.ofString());

        List<User> users = new Gson().fromJson(httpResponsePost.body(), new TypeToken<ArrayList<User>>() {
        }.getType());

        int userId = users.get(0).getUserId();

        List<Integer> idList = new ArrayList<>();
        Integer max = users.stream()
                .map(User::getId)
                .max((a, b) -> a - b).orElse(null);

        System.out.println("userID = " + userId);
        System.out.println("max = " + max);

        HttpRequest httpRequestComments = HttpRequest.newBuilder(new URI(uriUsers))
                .GET()
                .build();
        HttpResponse<String> httpResponseComments = httpClient.send(httpRequestComments, HttpResponse.BodyHandlers.ofString());

        List<Comment> comments = new Gson().fromJson(httpResponseComments.body(), new TypeToken<ArrayList<Comment>>() {
        }.getType());

        Gson gson = new GsonBuilder().setPrettyPrinting().create();


        String toJson = gson.toJson(comments);


        FileWriter fileWriter = new FileWriter(new File("user-" + userId + "-post-" + max + "-comments.json"));
        fileWriter.write(toJson);
        fileWriter.close();

        System.out.println("statusCode() = " + httpResponseComments.statusCode());
        System.out.println("body() = " + toJson);
    }
}



