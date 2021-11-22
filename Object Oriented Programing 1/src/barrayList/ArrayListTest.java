package barrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {

        public static void main(String[] args) {
            List<String> myList = new ArrayList<String>();

            myList.add("something");
            System.out.println(myList.size());
            myList.add("something else");
            System.out.println(myList.size());

        }
    }


