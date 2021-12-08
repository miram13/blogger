package org.acme;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("/Blog")
public class GreetingResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String all() {
        return "Read all Blogs";
    }


    @GET
    @Path("/allblogs")

    public String allblogs () {
        return "You are Viewing the list of all the blogs";
    }


    @POST
    @Path("/postablog")
    public String postablog() {
        return "A new Blog is created with content Hello";
    }


    @GET
    @Path("/{name}/{id}")
    public String particularblog (@PathParam("name") String name, @PathParam("id")String id) {
        return "You are viewing a blog with the id " +name   +id;
    }

    @PUT
    @Path("/putblog/{id}/{name}")
    public String putablog (@PathParam("id") String name, @PathParam("name")String id) {
        return "A blog with id 90 has been updated with content " +name ;
    }




    @DELETE
    @Path("/deleteablog")
    public String deleteablog (@PathParam("id") String id){
        return "You deleted the blg with the id" +89;
    }



}