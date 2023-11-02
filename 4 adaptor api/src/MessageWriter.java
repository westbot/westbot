public class MessageWriter {
    private PostWriter postWriter;

    public MessageWriter(PostWriter pw) {
        this.postWriter = pw;
    }

    public void write(String msg) {
        postWriter.makePost(msg);
    }
}
