package org.acme;
import java.util.List;

public interface BloggingService {
    List<Blog> getBlogs();
    Blog postBlog(String name, String author);
    Blog getBlogbyname(String name);
    Blog updateBlogbyname(String name, String author);
    Blog deleteBlogbyname(String name, String author);
}