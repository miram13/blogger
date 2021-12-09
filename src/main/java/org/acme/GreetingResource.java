package org.acme;


import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.QueryParam;
import javax.ws.rs.Produces;
import java.util.List;

@Path("/Blog")
public class GreetingResource {

    BloggingService bloggingService = new BloggingService();
    PostingService postingService = new PostingService();

    @GET
    public String Blog() {
        return "Read All Blogs";
    }

    @GET
    @Path("/listablog")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Blog> Blogwithquery(@QueryParam("name") String name,@QueryParam("author") String author) {
        return bloggingService.getBlog();

    }

    @POST
    @Path("/Query")
    @Produces(MediaType.APPLICATION_JSON)
    public Blog PostBlog(@QueryParam("name") String name, @QueryParam("author") String author) {
        return postingService.postBlog(name , author);
    }
    @GET
    @Path("/readablog")
    @Produces(MediaType.APPLICATION_JSON)
    public String readablog (@PathParam("Blog") String Blog){
        return "read a blog by a bloggerNettle and Blackberry:\n" +
                "If you’re a fan of lifestyle blogs then here’s another! Imogen’s a graduate from Durham and her page is very chatty and friendly. Her ‘thought’ section is like having a chat with a friend as she discusses issues almost all of us can relate to. It’s a challenge to come away from her page without a smile on your face!";
    }
//    @GET
//    @Path("/readablog")
//    @Produces(MediaType.APPLICATION_JSON)
//    public List<Blog> Blogwithquery(@QueryParam("name") String name,@QueryParam("author") String author ,@QueryParam("read") String read) {
//        return ReadingService.readablog();
//    }

    @DELETE
    @Path("/delete")
    public String removequery(@QueryParam("name") String name,@QueryParam("author") String author){
        return "A blog with " +name+ "and" +author+ "has been deleted";
}

}