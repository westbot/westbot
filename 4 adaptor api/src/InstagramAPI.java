public class InstagramAPI implements PostWriter {
    @Override
    public void makePost(String post) {
        System.out.println("Connecting to Instagram account...");
        System.out.println("Writing story: \"" + post +"\"");
        System.out.println("Closing connection.");
    }
}
