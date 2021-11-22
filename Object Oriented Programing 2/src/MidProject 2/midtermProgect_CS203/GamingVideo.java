package midtermProgect_CS203;

public class GamingVideo extends Video implements GamingVideos {


    private String game;

    public GamingVideo() {
        super("Hours",40.24,1300,10000,1);
        this.game = game;
    }

    public GamingVideo(String title, double durationInMinute, int views, int likes, double watchTime, String game) {
        super(title, durationInMinute, views, likes, watchTime);
        this.game = game;
    }
    public String getGame() {
        return game;
    }
    @Override
    public String getGameName() {
        return super.toString()+" "+getGame();
    }
}
