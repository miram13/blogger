package org.acme;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("/blog")
public class GreetingResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String all() {
        return "Read all Blogs";
    }


    @GET
    @Path("/getallblog")

    public String getallblog () {
        return "You are Viewing the list of all the blogs";
    }


    @POST
    @Path("/postblog")
    public String postblog() {
        return "A new Blog is created with content Hello";
    }

//    @GET
//    @Path("/getparblog")
//    public String getparblog () {
//        return "You are viewing a blog with the id 12";
//    }

    @GET
    @Path("/{name}/{id}")
    public String getparblog (@PathParam("name") String name, @PathParam("id")String id) {
        return "You are viewing a blog with the id " +name   +id;
    }

    @PUT
    @Path("/putblog/{id}/{name}")
    public String putblog (@PathParam("id") String name, @PathParam("name")String id) {
        return "The blog has been edited with the 67 "+id   +name ;
    }




    @DELETE
    @Path("/deleteblog")
    public String deleteblog (@PathParam("id") String id){
        return "You deleted the blg with the id" +89;
    }



}