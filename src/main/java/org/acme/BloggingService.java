
package org.acme;

import java.util.ArrayList;
import java.util.List;

public class BloggingService<blog> {
    List<Blog> blogs = new ArrayList<>();

    public BloggingService() {
    }

    public List<Blog> getBlog() {
        Blog blog = new Blog();
        blog.author = "IRAM";
        blog.name = "Automation";

        Blog blog2 = new Blog();
        blog2.author = "MOHAMMADI";
        blog2.name ="Integration";

        Blog blog3 = new Blog();
        blog3.author = "MOHAMMADI IRAM";
        blog3.name = "Creation";

        blogs.add(blog);
        blogs.add(blog2);
        blogs.add(blog3);


        return blogs;
    }


}