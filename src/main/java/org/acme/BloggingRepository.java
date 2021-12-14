package org.acme;

import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.ApplicationScoped;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import net.bytebuddy.build.AccessControllerPlugin;

@ApplicationScoped
public class BloggingRepository implements PanacheRepository<Blog> {

    List<Blog> getBlogsByAuthorName(String name) {
        List<Blog> blogs = listAll();
        List<Blog> response = new ArrayList<>();
        for (Blog blog : blogs) {
            if (blog.author.equals(name)) {
                response.add(blog);
            }
        }
        return  response;
    }
    public Blog updateBlog(String name) {
        Blog blog = new Blog();
        List<Blog> blogs = Blog.listAll();
        for (Blog blog1 : blogs) {
            if (blog1.name.equals(name)) {
                blog1.name = name;
                blog.persist();
                return blog;


            }
        }
        return null;
    }



    public Blog postBlog(String name, String author) {
        Blog blog = new Blog();
        blog.author = author;
        blog.name = name;
        blog.persist();
        return blog;


    }


    public Blog DeleteBlog(String name, Long id) {
        Blog blog = new Blog();
        if (blog.isPersistent()) {
            blog.name=name;
            blog.id = id;
            boolean deleted = blog.deleteById(id);
            blog.delete();
        }
        return blog;
    }



}