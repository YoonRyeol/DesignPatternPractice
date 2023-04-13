package proxy.protection;

public class TestCase {
    public static void main(String[] args) {
        PostService postService = new PostService();
        Writer writer = new Writer("eden");
        Post post = new Post("rubam", "happy");
        postService.update(writer, post, "sad");
        assert post.getContent().equals("sad");
        PostService proxyPostService = new ProxyPostService();
        Post post2 = new Post("charlotte", "happy");
        proxyPostService.update(writer, post2, "sad");
    }
}
