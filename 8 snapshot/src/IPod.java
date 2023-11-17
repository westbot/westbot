public class IPod {
    private static enum State {
        STOP("Stopped"),
        PLAY("Playing"),
        PAUSE("Paused");

        private String description;

        State(String description) {
            this.description = description;
        }

        @Override
        public String toString() {
            return description;
        }
    }

    private static final int MIN_VOLUME = 0;
    private static final int MAX_VOLUME = 100;

    private State state;
    private int volume;
    private Keeper keeper;

    public IPod() {
        this.state = State.STOP;
        this.volume = 50;
        this.keeper = new Keeper();
    }

    public void play() {
        state = State.PLAY;
    }

    public void pause() {
        state = State.PAUSE;
    }

    public void stop() {
        state = State.STOP;
    }

    public void adjustVolume(int byVal) {
        keeper.keep(volume);

        volume += byVal;
        if ( volume < MIN_VOLUME )
            volume = MIN_VOLUME;
        else if ( volume > MAX_VOLUME )
            volume = MAX_VOLUME;
    }

    public void restoreVolume() {
        if (keeper.canRestore() )
            volume = keeper.restore();
    }

    @Override
    public String toString() {
        return "State: " + state.toString() + ", Volume: " + volume;
    }
}
