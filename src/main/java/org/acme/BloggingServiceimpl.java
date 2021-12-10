package org.acme;

import javax.enterprise.context.ApplicationScoped;
import java.util.ArrayList;
import java.util.List;

@ApplicationScoped
public class BloggingServiceimpl implements BloggingService {
    List<Blog> blogs = new ArrayList<>();

    public BloggingServiceimpl() {

        Blog blog = new Blog();
        blog.author = "Mohammadi Iram";
        blog.name = "automation";
        Blog blog2 = new Blog();
        blog2.author = "Iram";
        blog2.name = "automation";
        Blog blog3 = new Blog();
        blog3.author = "Mohammadi";
        blog3.name = "Engineering";


        blogs.add(blog);
        blogs.add(blog2);
        blogs.add(blog3);

    }

    public List<Blog> getBlogs() {

        return blogs;
    }

    public Blog postBlog(String name, String author) {
        Blog blog = new Blog();
        blog.author = author;
        blog.name = name;
        blogs.add(blog);
        return blog;


    }

    public Blog getBlogbyname(String name) {
        for (Blog blog1 : blogs) {
            if (blog1.name.equals(name)) {
                blog1.name = name;
                blogs.add(blog1);

            }
        }
        return null;
    }

    public Blog updateBlogbyname(String name, String author) {
        for (Blog blog1 : blogs) {
            if (blog1.name.equals(name)) {
                blog1.name = name;
                blog1.author = author;


            }
        }
        return null;
    }

    public Blog deleteBlogbyname(String name, String author) {
        for (Blog blog1 : blogs) {
            if (blog1.name.equals(name)) {
                blog1.name = name;
                blog1.author = author;
                blogs.remove(blog1);
            }
        }
        return null;
    }
}

