package proxy.protection;

public class PostService {

    public void update(Writer writer, Post post, String newContent){
        post.setWriter(writer.getName());
        post.setContent(newContent);
    }

}
