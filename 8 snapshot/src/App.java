public class App {
    public static void main(String[] args) {
        IPod iPod = new IPod();

        System.out.println(iPod.toString());
        iPod.play();
        System.out.println(iPod.toString());
        iPod.restoreVolume();
        System.out.println(iPod.toString());
        iPod.adjustVolume(60);
        System.out.println(iPod.toString());
        iPod.restoreVolume();
        System.out.println(iPod.toString());
    }
}
