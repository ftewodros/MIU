package midtermProgect_CS203;

public class Video implements Comparable <Video>{
    private String title;
    private double durationInMinute;
    private int views;
    private int likes;
    private double watchTime;

    public Video() {
        this.title= "Game";
        this.durationInMinute = 45.55;
        this.views = 12000;
        this.likes = 1200;
        this.watchTime = 1;
    }

    public Video(String title, double durationInMinute, int views, int likes, double watchTime) {
        this.title = title;
        this.durationInMinute = durationInMinute;
        this.views = views;
        this.likes = likes;
        this.watchTime = watchTime;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getDurationInMinute() {
        return durationInMinute;
    }

    public void setDurationInMinute(double durationInMinute) {
        this.durationInMinute = durationInMinute;
    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public double getWatchTime() {
        return watchTime;
    }

    public void setWatchTime(double watchTime) {
        this.watchTime = watchTime;
    }

    @Override
    public boolean equals(Object obj) {
        if (this==null)return false;
        if (!(obj instanceof Video))return false;
        Video ve = (Video) obj;
        return this.title.equals(ve.title)&&
                this.durationInMinute==ve.durationInMinute&&
                this.views==ve.views&&this.likes==ve.likes
                &&this.watchTime==ve.watchTime;
    }

    @Override
    public int compareTo(Video other) {
        return (int) (this.watchTime-other.watchTime);
    }

    @Override
    public String toString() {
        return "Titel:"+title+". " +"Duration: "+durationInMinute+". "+"Views:"+
                views+". "+"Likes: " + likes +". "+ " Watch Time: " +watchTime+".";
    }
}
