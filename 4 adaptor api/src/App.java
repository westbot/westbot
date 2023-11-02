public class App {
    public static void main(String[] args) {
        MessageWriter[] writers = new MessageWriter[] {
                new MessageWriter(new FacebookAPI()),
                new MessageWriter(new TwitterAPI()),
                new MessageWriter(new InstagramAPI())
        };

        for (MessageWriter w : writers)
            w.write("Hi there!");
    }
}
