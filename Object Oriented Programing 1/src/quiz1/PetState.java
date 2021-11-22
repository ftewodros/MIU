package quiz1;

public class PetState {

        public static String calculateState (int petAge) {
            if(petAge < 3) return "Young";
            if(petAge >= 3 && petAge < 7) return "Adult";

            return "Old";
        }
    }

