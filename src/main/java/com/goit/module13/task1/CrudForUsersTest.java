package com.goit.module13.task1;

import java.io.IOException;
import java.net.URISyntaxException;
import java.net.http.HttpResponse;

public class CrudForUsersTest {

    public static void main(String[] args) throws URISyntaxException, IOException, InterruptedException {

        String uri = "https://jsonplaceholder.typicode.com/users";
        HttpResponse<String> httpResponsePost = HttpMethods.postHttpRequest(uri, "{\n" +
                "    \"name\": \"Iryna Shurda\",\n" +
                "    \"username\": \"Virtual\",\n" +
                "    \"email\": \"Virtual@gmail.com\",\n" +
                "    \"address\": {\n" +
                "      \"street\": \"Honey\",\n" +
                "      \"suite\": \"Apt. 22\",\n" +
                "      \"city\": \"Kyiv\",\n" +
                "      \"zipcode\": \"08001\",\n" +
                "      \"geo\": {\n" +
                "        \"lat\": \"-37.3159\",\n" +
                "        \"lng\": \"81.1496\"\n" +
                "      }\n" +
                "    },\n" +
                "    \"phone\": \"098 123 45 67\",\n" +
                "    \"website\": \"virtual.org\",\n" +
                "    \"company\": {\n" +
                "      \"name\": \"Virtual-virtual\",\n" +
                "      \"catchPhrase\": \"Multi-layered client-server neural-net\",\n" +
                "      \"bs\": \"harness real-time e-markets\"\n" +
                "    }\n" +
                "  }");


        HttpResponse<String> httpResponsePut = HttpMethods.putHttpRequest(uri, 1, "{\n" +
                "    \"name\": \"Olha Testova\",\n" +
                "    \"username\": \"TEST\",\n" +
                "    \"email\": \"Test@april.biz\",\n" +
                "    \"address\": {\n" +
                "      \"street\": \"Kulas Light\",\n" +
                "      \"suite\": \"Apt. 556\",\n" +
                "      \"city\": \"Gwenborough\",\n" +
                "      \"zipcode\": \"92998-3874\",\n" +
                "      \"geo\": {\n" +
                "        \"lat\": \"-37.3159\",\n" +
                "        \"lng\": \"81.1496\"\n" +
                "      }\n" +
                "    },\n" +
                "    \"phone\": \"1-770-736-8031 x56442\",\n" +
                "    \"website\": \"hildegard.org\",\n" +
                "    \"company\": {\n" +
                "      \"name\": \"Romaguera-Crona\",\n" +
                "      \"catchPhrase\": \"Multi-layered client-server neural-net\",\n" +
                "      \"bs\": \"harness real-time e-markets\"\n" +
                "    }\n" +
                "  }");

        HttpResponse<String> httpResponseDelete = HttpMethods.deleteHttpRequest(uri, 2);
        HttpResponse<String> httpResponseGetAllUsers = HttpMethods.getHttpRequest(uri);
        HttpResponse<String> httpResponseGetById = HttpMethods.getHttpRequest(uri + "/3");
        HttpResponse<String> httpResponseGetUserName = HttpMethods.getHttpRequest(uri + "?username=Karianne");

        HttpMethods.printResult(httpResponsePost, "Post");
        HttpMethods.printResult(httpResponsePut, "Put");
        HttpMethods.printResult(httpResponseDelete, "Delete");
        HttpMethods.printResult(httpResponseGetAllUsers, "GetAllUsers");
        HttpMethods.printResult(httpResponseGetById, "GetById");
        HttpMethods.printResult(httpResponseGetUserName, "GetUserName");
    }
}
