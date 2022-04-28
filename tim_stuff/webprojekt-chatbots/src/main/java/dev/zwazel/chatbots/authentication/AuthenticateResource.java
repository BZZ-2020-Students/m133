package dev.zwazel.chatbots.authentication;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;

@Path("/auth")
public class AuthenticateResource {
    @GET
    @Path("/login")
    public String login() {
        return "You're now logged in!";
    }

    @GET
    @Path("/logout")
    public String logout() {
        return "You're now logged out!";
    }

    @GET
    @Path("auth-check")
    public String authCheck() {
        return "You're authenticated!";
    }
}
