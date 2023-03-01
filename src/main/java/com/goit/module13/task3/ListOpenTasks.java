package com.goit.module13.task3;

import com.goit.module13.task1.HttpMethods;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import java.io.IOException;
import java.net.URISyntaxException;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ListOpenTasks {

    public static void main(String[] args) throws URISyntaxException, IOException, InterruptedException {
        findOpenTasksByUserId(1);
    }

    private static void findOpenTasksByUserId(Integer userId) throws URISyntaxException, IOException, InterruptedException {
        String uri = "https://jsonplaceholder.typicode.com/users";

        HttpResponse<String> httpResponse = HttpMethods.getHttpRequest(uri + "/" + userId + "/todos");

        List<UserTask> userTasks = new Gson().fromJson(httpResponse.body(), new TypeToken<ArrayList<UserTask>>() {
        }.getType());

        List<UserTask> openTasks = findNotCompletedTask(userTasks);

        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String toJson = gson.toJson(openTasks);

        System.out.println("open tasks for userId = " + userId + " " + toJson);
    }

    private static List<UserTask> findNotCompletedTask(List<UserTask> userTasks) {
        return userTasks.stream()
                .filter(i -> i.isCompleted() == false)
                .collect(Collectors.toList());
    }
}
