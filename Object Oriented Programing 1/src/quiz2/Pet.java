package quiz2;

public class Pet {
        private String name;
        private int age;
        private float weight;

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

        public Pet() {
            this.name = "Fank";
            this.age = 6;
            this.weight = 60;
        }
        public Pet(String name, int age, float weight) {
            this.name = name;
            this.age = age;
            this.weight = weight;
        }
        @Override
        public String toString() {
            return name + ", " + age + ", " + weight;
        }

    }


