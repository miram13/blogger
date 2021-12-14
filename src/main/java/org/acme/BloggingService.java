package org.acme;

import java.util.List;


public interface BloggingService {
    List<Blog> GetBlogs();
    Blog GetBlog(int id);
    Blog PostBlog(String name, String author);
    Blog UpdateBlog(String name);
    Blog DeleteBlog(String name ,Long id);
    List<Blog> blogByAuthorName(String name);

}
