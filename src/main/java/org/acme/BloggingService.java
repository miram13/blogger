package org.acme;

import java.util.List;


public interface BloggingService {
    List<Blog> GetBlogs();
    Blog GetBlog(int id);
    Blog PostBlog(Blog blog);
    Blog UpdateBlog(String id ,Blog blog);
    String DeleteBlog(long id);
    List<Blog> blogByAuthorName(String name);

}
