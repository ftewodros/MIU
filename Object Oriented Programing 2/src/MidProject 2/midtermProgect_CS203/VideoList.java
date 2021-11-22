package midtermProgect_CS203;

import java.util.Arrays;

public class VideoList {
    private Video[]videos;
    private int size;

    public Video[] getVideos() {
//        Video[]temp = new Video[size()];
//        for (int i =0;i<size();i++){
//            temp[i]=videos[i];
//        }
        return videos;
    }

    public VideoList(){
     videos= new Video[10];
     this.size=0;
 }
public void add(Video input){
     videos[size]=input;
     size++;
     if (size==videos.length)reSize();

}
private void reSize(){
     Video[]newVidwos = new Video[videos.length*2];
     for (int i=0; i<videos.length;i++){
         newVidwos[i]= videos[i];
     }
     videos=newVidwos;
}
public  int size(){
     return size;


}

    @Override
    public String toString() {
        String name = "";
        for (Video v : videos) {
            if (v != null)
                name = v.toString();
        }
        return name;
    }

    }