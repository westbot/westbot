public class FacebookAPI implements PostWriter {
    @Override
    public void makePost(String post) {
        System.out.println("Connecting to Facebook account...");
        System.out.println("Writing post: \"" + post +"\"");
        System.out.println("Closing connection.");
    }
}
