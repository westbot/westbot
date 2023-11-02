public class TwitterAPI implements PostWriter {
    @Override
    public void makePost(String post) {
        System.out.println("Connecting to Twitter account...");
        System.out.println("Writing twit: \"" + post +"\"");
        System.out.println("Closing connection.");
    }
}
