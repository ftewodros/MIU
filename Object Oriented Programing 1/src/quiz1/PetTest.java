package quiz1;

public class PetTest {

        public static void main(String[] args) {
            Pet cat = new Pet();
            System.out.println(cat.petInfo());
            System.out.println(PetState.calculateState(cat.getAge()));
            cat.setName("Sparkles");
            cat.setAge(cat.getAge()+3);
            System.out.println(cat.petInfo());
            System.out.println(PetState.calculateState(cat.getAge()));
            Pet dog = new Pet("Justin", 4, 6.56f);
            System.out.println(dog.petInfo());
            System.out.println(PetState.calculateState(dog.getAge()));
        }
    }

