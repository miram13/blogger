package org.acme;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/blogs")
public class GreetingResource {


    @Inject
    BloggingService bloggingService;

    @GET
    @Path("/blog")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Blog> Blogwithqwery(@QueryParam("name") String name) {
        return (List<Blog>) bloggingService.getBlogs();
    }

//    @GET
//    @Path("/readblog")
//    @Produces(MediaType.APPLICATION_JSON)
//    public String readblog (@PathParam("Blog") String Blog){
//        return "read a blog by blogger";
//    }

    @POST
    @Path("/blog")
    @Produces(MediaType.APPLICATION_JSON)
    public Blog PostBlog(@QueryParam("name") String name, @QueryParam("author") String author) {
        return bloggingService.postBlog(name , author);
    }

    @PUT
    @Path("/blog")
    @Produces(MediaType.APPLICATION_JSON)
    public Blog updateBlogbyname(@QueryParam("name") String name, @QueryParam("author") String author) {
        return bloggingService.updateBlogbyname(name, author);
    }

    @GET
    @Path("/blog/{name}")
    @Produces(MediaType.APPLICATION_JSON)
    public  Blog getBlogbyname(@PathParam("name") String name){
        return bloggingService.getBlogbyname(name);
    }

    @DELETE
    @Path("/blog")
    @Produces(MediaType.APPLICATION_JSON)
    public Blog deleteBlogbyname(@QueryParam("name") String name, @QueryParam("author") String author) {
        return bloggingService.deleteBlogbyname(name, author);
    }
}

