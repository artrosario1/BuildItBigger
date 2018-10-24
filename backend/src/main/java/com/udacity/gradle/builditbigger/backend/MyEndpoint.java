package com.udacity.gradle.builditbigger.backend;

import com.google.api.client.extensions.android.http.AndroidHttp;
import com.google.api.client.extensions.android.json.AndroidJsonFactory;
import com.google.api.server.spi.config.Api;
import com.google.api.server.spi.config.ApiMethod;
import com.google.api.server.spi.config.ApiNamespace;
import com.softcap.artrosario.lib.JokesLib;

import javax.inject.Named;

/** An endpoint class we are exposing */
@Api(
        name = "myApi",
        version = "v1",
        namespace = @ApiNamespace(
                ownerDomain = "backend.builditbigger.gradle.udacity.com",
                ownerName = "backend.builditbigger.gradle.udacity.com",
                packagePath = ""
        )
)
public class MyEndpoint {

    /** A simple endpoint method that takes a name and says Hi back */
    @ApiMethod(name = "sayHi")
    public MyBean sayHi(@Named("name") String name) {
        MyBean response = new MyBean();
        JokesLib jokesLib = new JokesLib();
        name = jokesLib.tellAHandCraftedJoke();
        response.setData(name);
        return response;
    }

    @ApiMethod(name = "tellJokeFromBackEnd")
    public MyBean tellJokeFromBackEnd() {
        MyBean response = new MyBean();
        String joke = response.getData();
        response.setData(joke);
        return response;

    }

}
