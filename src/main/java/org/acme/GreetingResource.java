
package org.acme;

import javax.inject.Inject;
import javax.transaction.Transactional;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;
import java.util.Set;

@Path("/Blog")
public class GreetingResource {


    @Inject
    BloggingService bloggingService;

    @GET
    @Path("/blog")
    @Produces(MediaType.APPLICATION_JSON)
    @Transactional
    public List<Blog> Blogwithqwery(@QueryParam("name") String name) {
        return (List<Blog>) bloggingService.GetBlogs();
    }


    @POST
    @Path("/blog")
    @Produces(MediaType.APPLICATION_JSON)
    @Transactional
    public Blog PostBlog(@QueryParam("name") String name, @QueryParam("author") String author) {
        return bloggingService.PostBlog(name, author);
    }

    @PUT
    @Path("/blog")
    @Produces(MediaType.APPLICATION_JSON)
    @Transactional
    public Blog UpdateBlog(@QueryParam("name") String name) {
        return bloggingService.UpdateBlog(name);
    }


    @GET
    @Path("/blogByAuthorName")
    @Produces(MediaType.APPLICATION_JSON)
    @Transactional
    public List<Blog> blogByAuthorName(@QueryParam("name") String name) {
        return bloggingService.blogByAuthorName(name);
    }


    @GET
    @Path("/blog/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    @Transactional
    public Blog GetBlog(@PathParam("id") int id) {
        return bloggingService.GetBlog(id);
    }
//

//    @DELETE
//    @Path("/blog")
//    @Produces(MediaType.APPLICATION_JSON)
//    @Transactional
//    public Blog DeleteBlog(@QueryParam("name") String name,@QueryParam("author") String author) {
//        return bloggingService.DeleteBlog(name,author);
//    }

    @DELETE
    @Path("/blog")
    @Produces(MediaType.APPLICATION_JSON)
    public Blog DeleteBlog(@QueryParam("name") String name,@QueryParam("id") Long id) {
        return bloggingService.DeleteBlog(name,id);
    }
}

