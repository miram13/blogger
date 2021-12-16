package org.acme;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.transaction.Transactional;
import java.util.List;

@ApplicationScoped
public class BloggingServiceimpl implements BloggingService {

    @Inject
    BloggingRepository bloggingRepository;


    public BloggingServiceimpl() {

    }

    @Transactional
    public List<Blog> GetBlogs() {
        return Blog.listAll();
    }


@Transactional
public Blog GetBlog(int id) {
    Blog blog = new Blog();
    List<Blog> blogs = Blog.listAll();
    for (Blog blog1 : blogs) {
        if (blog1.id.equals(id)) {
            return blog;
        }
    }
    return null;
}


    public List<Blog> blogByAuthorName(String name) {

        return bloggingRepository.getBlogsByAuthorName(name);
    }
@Transactional
    public Blog UpdateBlog(String id , Blog blog) {
        return bloggingRepository.updateBlog(id);
    }


    public Blog PostBlog(Blog blog) {
        return bloggingRepository.postBlog(blog);
    }

  @Transactional
  public String DeleteBlog(long id ) {
      return bloggingRepository.findanddelete(id);
  }
    }





