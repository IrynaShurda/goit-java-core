package com.goit.module13.task2;

import com.goit.module13.task1.HttpMethods;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import java.io.FileWriter;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;

public class ReadPostComments {
    public static void main(String[] args) throws IOException, URISyntaxException, InterruptedException {
        String uriPosts = "https://jsonplaceholder.typicode.com/users/1/posts";
        String uriComments = "https://jsonplaceholder.typicode.com/posts/10/comments";

        HttpResponse<String> httpResponsePost = HttpMethods.getHttpRequest(uriPosts);
        HttpResponse<String> httpResponseComments = HttpMethods.getHttpRequest(uriComments);

        List<User> users = new Gson().fromJson(httpResponsePost.body(), new TypeToken<ArrayList<User>>() {
        }.getType());

        List<Comment> comments = new Gson().fromJson(httpResponseComments.body(), new TypeToken<ArrayList<Comment>>() {
        }.getType());

        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        String toJson = gson.toJson(comments);

        Integer max = getMaxId(users);
        int userId = users.get(0).getUserId();
        String fileName = "user-" + userId + "-post-" + max + "-comments.json";

        writeToFile(toJson, fileName);

        System.out.println("body() = " + toJson);
    }

    private static void writeToFile(String toJson, String fileName) throws IOException {
        FileWriter fileWriter = new FileWriter(fileName);
        fileWriter.write(toJson);
        fileWriter.close();
    }

    private static Integer getMaxId(List<User> users) {
        return users.stream()
                .map(User::getId)
                .max((a, b) -> a - b).orElse(null);
    }
}



