package midtermProgect_CS203;

import java.util.*;

public class JavaTube {
    class SortVideosByTitles implements Comparator<Video> {

        @Override
        public int compare(Video o1, Video o2) {
            return o1.getTitle().compareTo(o2.getTitle());
        }
    }

    static class SortVideosByViews implements Comparator<Video> {

        @Override
        public int compare(Video o1, Video o2) {
            return o1.getViews() - o2.getViews();
        }
    }

    public static void main(String[] args) {
        class sortByIngredients implements Comparator<CookingVideo>{

            @Override
            public int compare(CookingVideo o1, CookingVideo o2) {
                return o1.getRecipe().getIngredients().compareTo(o2.getRecipe().getIngredients());
            }
        }

        Recipe recipe1 = new Recipe("Enjera", "Water,Tef, Powder ", "Look back side", 2, 3, 5);
        Recipe recipe2 = new Recipe("Dash", "Flour, Onin, Suger", "See back and front side ", 3, 4, 2);
        Recipe recipe3 = new Recipe("Gebeta", "Alcohol, Bikil,Gasho", "If you want know details come back", 1, 3, 4);
        CookingVideo video1 = new CookingVideo("Test", 1.20, 12000, 1000, 45.34, recipe1);
        CookingVideo video2 = new CookingVideo("Soon", 2.25, 15000, 1000, 45.34, recipe2);
        CookingVideo video3 = new CookingVideo("Back", 2, 17000, 1000, 1.34, recipe3);
        GamingVideo gam1 = new GamingVideo("Accor", 0.45, 5000, 2000, 2.45, "Can Fli");
        GamingVideo gam2 = new GamingVideo("Etho", 0.25, 21000, 12000, 1.45, "Awesome");
        GamingVideo gam3 = new GamingVideo("Fast", 0.25, 25000, 12000, 3.45, "ComeOver");
        Video[] allVideos = {video1, video2, video3, gam1, gam2, gam3};
        CookingVideo[] cookingVideos = {video1, video2, video3}; // what is with...
        GamingVideo[] gamingVideos = {gam1, gam2, gam3}; // How with cooking object accept ?
        System.out.println("This is before sort>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>!");
        videoPrinter(allVideos);// print to all videos
        Arrays.sort(allVideos);
        System.out.println("This is after naturally sort that means by using what time>>>>>>>>>>>>>>>!");
        videoPrinter(allVideos);
        JavaTube ja = new JavaTube();// member class obj
        JavaTube.SortVideosByTitles tit = ja.new SortVideosByTitles(); // call inner class to sort by title
        Arrays.sort(allVideos, tit);// sort by title
        System.out.println("This is after sorting by inner class depending on title  >>>>>>>>>>>>>>>>>>>>>>>>>>>>!");
        videoPrinter(allVideos);

        SortVideosByViews staIn = new JavaTube.SortVideosByViews(); //Static inner class call
        Arrays.sort(allVideos, staIn); // sort by views
        System.out.println("This is after  sorting by using inner static class by views >>>>>>>>>>>>>>>>>>>!");
        videoPrinter(allVideos);
        System.out.println("This is all cooking videos list  print out >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>!");
        List<CookingVideo>cookingVideoList = new ArrayList<>();
        cookingVideoList.add(video1);
        cookingVideoList.add(video2);
        cookingVideoList.add(video3);
        for (CookingVideo lis: cookingVideoList) {

          printAllCookingVideos(Arrays.asList(lis));// try to print all cooking video list
        }

        sortByIngredients sortLoca = new sortByIngredients();//local class used to sort by ingredient
        Arrays.sort(cookingVideos,sortLoca);
        System.out.println("This print is print out the  sorting by ingredients>>>>>>>>>>>>>>>>>>>>>>>>>>!");
        SortCookingVideoByIngredientList(cookingVideos); // sort cooking video by ingredients

        Arrays.sort(cookingVideos, new Comparator<CookingVideo>() { //  inner class by using anonymous
            @Override
            public int compare(CookingVideo o1, CookingVideo o2) {
                return( o1.getRecipe().getServings()-o2.getRecipe().getServings())*-1;
            }
        });
        System.out.println("This print out  is anonymous sorting descending order by using serving>>>>>>>>>>>!");
        SortCookingVideoByServingSizeDescending(cookingVideos); // this is  anonymous sort print to descending order

        System.out.println("This is all cooking recipes>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>!");
        printAllCookingRecipies(cookingVideos);// This is all cooking videos
        System.out.println("This is the lambda expression assessing order by using game name>>>>>>>>>>>>>>>>>>>>>> ");
        Arrays.sort(gamingVideos,(o1,o2)->o1.getGame().compareTo(o2.getGame()));
        printAllGamingVideos(gamingVideos);

     // adding the cooking video
        VideoList list = new VideoList();
        System.out.println("This is all cooking  video list print out by using adding on my array creations ==========");
       for (CookingVideo ve : cookingVideos){
           list.add(ve);
           System.out.println(list.toString());
        }
        //adding all gaming videos
        System.out.println("The is all game video list print out by using  ==================");
     for (int i=0;i<gamingVideos.length;i++){
         list.add(gamingVideos[i]);
         System.out.println(list.toString());
     }

    }



  static   void SortCookingVideoByIngredientList(CookingVideo[] cookList) {

        for (CookingVideo c: cookList) {
            System.out.println(Arrays.toString(c.getIngredientsList()));


        }
    }

   static void SortCookingVideoByServingSizeDescending(CookingVideo[]cookDes) {

        for (CookingVideo c2: cookDes){
            System.out.println(c2.getRecipe().getServings());

        }


    }

   static void printAllCookingRecipies(CookingVideo[] recip) {

        for (CookingVideo lis : recip){
            System.out.println( lis.getCookingRecipte());
        }
    }

  static   void videoPrinter(Video[]vid) {
        for (Video v: vid){
            System.out.println(v.toString());
        }

    }
static  void printAllCookingVideos(List<CookingVideo>cookingVideos){
        for (CookingVideo lit : cookingVideos){
            System.out.println(lit+" "+"\n" +lit.getRecipe());
        }

}
static void printAllGamingVideos(GamingVideos[]gams ){
        for (GamingVideos lis: gams){
            System.out.println(lis.getGameName());
        }

}
}
