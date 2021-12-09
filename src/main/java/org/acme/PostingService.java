package org.acme;

import java.util.ArrayList;
import java.util.List;

public class PostingService {

    public PostingService() {
        List<Blog> blogs = new ArrayList<>();
    }

    public static Blog postBlog(String name, String author) {
        Blog blog = new Blog();
        blog.author = author;
        blog.name = name;
//      blogs.add(blog);
        return blog;
    }


}