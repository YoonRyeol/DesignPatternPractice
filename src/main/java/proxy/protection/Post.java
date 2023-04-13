package proxy.protection;

public class Post {
    private String writer;
    private String content;

    public Post(String writer, String content){
        this.writer = writer;
        this.content = content;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content){
        this.content = content;
    }

}
