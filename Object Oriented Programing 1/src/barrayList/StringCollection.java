package barrayList;

import java.util.Arrays;

public class StringCollection {

        private String[] arr;
        private int size;

        public StringCollection() {
            arr = new String[10];
            size = 0;
        }

        public int size() {
            return size;
        }

        public void add(String input) {
            arr[size] = input;
            size++;
            if(size == arr.length) resize();
        }

        public String get(int index) {
            return arr[index];
        }

        private void resize() {
            arr = Arrays.copyOf(arr, arr.length*2);
        }

        //contains - input = String, returns boolean
        //indexOf - input = String, returns int
        //set - input = String | int, no return

        public void printArray() {
            for(int i = 0; i < arr.length; i++) {
                System.out.println("Size: " + arr.length + " Index: " + i + " Value: " + arr[i] + " Size: " + size);
            }
        }

    }


