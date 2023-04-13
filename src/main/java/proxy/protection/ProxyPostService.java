package proxy.protection;

public class ProxyPostService extends PostService{
    @Override
    public void update(Writer writer, Post post, String newContent){
        if(!writer.getName().equals(post.getWriter()))
            throw new RuntimeException("글쓴이만이 포스트를 업데이트 할 수 있어용!");

        super.update(writer, post, newContent);
    }
}
