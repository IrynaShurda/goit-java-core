package com.goit.module13.task1;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class HttpMethods {
    private static final HttpClient httpClient = HttpClient.newBuilder()
            .version(HttpClient.Version.HTTP_1_1)
            .build();

    public static HttpResponse<String> postHttpRequest(String uri, String body) throws URISyntaxException, IOException, InterruptedException {
        HttpRequest httpRequestPost = HttpRequest.newBuilder(new URI(uri))
                .POST(HttpRequest.BodyPublishers.ofString(body))
                .build();
        return httpClient.send(httpRequestPost, HttpResponse.BodyHandlers.ofString());
    }

    public static HttpResponse<String> putHttpRequest(String uri, int id, String body) throws URISyntaxException, IOException, InterruptedException {
        HttpRequest httpRequest = HttpRequest.newBuilder(new URI(uri + "/" + id))
                .PUT(HttpRequest.BodyPublishers.ofString(body))
                .build();
        return httpClient.send(httpRequest, HttpResponse.BodyHandlers.ofString());
    }

    public static HttpResponse<String> deleteHttpRequest(String uri, int id) throws URISyntaxException, IOException, InterruptedException {
        HttpRequest httpRequest = HttpRequest.newBuilder(new URI(uri + "/" + id))
                .DELETE()
                .build();
        return httpClient.send(httpRequest, HttpResponse.BodyHandlers.ofString());
    }

    public static HttpResponse<String> getHttpRequest(String uri) throws URISyntaxException, IOException, InterruptedException {
        HttpRequest httpRequest = HttpRequest.newBuilder(new URI(uri))
                .GET()
                .build();
        return httpClient.send(httpRequest, HttpResponse.BodyHandlers.ofString());
    }

    public static void printResult(HttpResponse<String> httpResponse, String service) {
        System.out.println(service + " statusCode() = " + httpResponse.statusCode());
        System.out.println(service + " body() = " + httpResponse.body());
        System.out.println("_________________________");
    }
}
