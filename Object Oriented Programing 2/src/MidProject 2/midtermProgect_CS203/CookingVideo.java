package midtermProgect_CS203;

import java.util.Arrays;

public class CookingVideo extends Video implements CookingVideos {
    private Recipe recipe;

    public CookingVideo() {
        super("Lion",35.45,12000,2000,1);
        this.recipe = recipe;
    }

    public CookingVideo(String title, double durationInMinute, int views, int likes, double watchTime, Recipe recipe) {
        super(title, durationInMinute, views, likes, watchTime);
        this.recipe = recipe;
    }

    public Recipe getRecipe() {
        return recipe;
    }

    @Override
    public String[] getIngredientsList() {
        return recipe.getIngredients().split(", ");
    }

    @Override
    public Recipe getCookingRecipte() {
        return recipe;
    }

    @Override
    public String printRecipie() {
        return "Dish: "+recipe.getRecipeName() + "\nIngredients:"+ recipe.getIngredients() +
                "\nDirections:"+recipe.getInstructions()  +"\n Prep Time : " +recipe.getPrepTime() +" minutes."+
                "\n Cooking time :" + recipe.getCookTime()+" minutes." + "\nServing size: " +recipe.getServings() ;



    }
}
