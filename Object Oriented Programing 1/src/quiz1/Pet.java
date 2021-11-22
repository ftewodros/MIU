package quiz1;

public class Pet {

        private String name;
        private int age;
        private float weight;

        public Pet() {
            this.name = "Zorminator";
            this.age = 5;
            this.weight = 16;
        }


        public Pet(String name, int age, float weight) {
            this.name = name;
            this.age = age;
            this.weight = weight;
        }




        public String getName() {
            return name;
        }
        public int getAge() {
            return age;
        }
        public float getWeight() {
            return weight;
        }
        public void setName(String name) {
            this.name = name;
        }
        public void setAge(int age) {
            this.age = age;
        }
        public void setWeight(float weight) {
            this.weight = weight;
        }

        public String petInfo() {
            return getName() + ", " + getAge() + ", " + getWeight();
        }

    }

