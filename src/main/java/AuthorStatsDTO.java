import java.util.List;

class Blog {
    private long id;
    private String name;
    private User author;
    private String content;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User getAuthor() {
        return author;
    }

    public void setAuthor(User author) {
        this.author = author;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}

class User {
    private long id;
    private String name;
    private String password;
    private List<Blog> blogs;

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<Blog> getBlogs() {
        return blogs;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setBlogs(List<Blog> blogs) {
        this.blogs = blogs;
    }
}

public class AuthorStatsDTO {
    private long id;
    private String name;
    private int blogsNumber;

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getBlogsNumber() {
        return blogsNumber;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBlogsNumber(int blogsNumber) {
        this.blogsNumber = blogsNumber;
    }

    public AuthorStatsDTO(User user) {
        this.id = user.getId();
        this.name = user.getName();
        this.blogsNumber = user.getBlogs().size();
    }
}

