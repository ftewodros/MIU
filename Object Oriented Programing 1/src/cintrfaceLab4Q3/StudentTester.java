package cintrfaceLab4Q3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class StudentTester {
    public static void main(String[] args) {

      Student st1= new Student("Tesfaye",1227);
      Student st2= new Student("Neo",1127);
      Student st3= new Student("Morphious",11267);

        List<Student> students= new ArrayList<>();
        students.add(st1);
        students.add(st2);
        students.add(st3);

        Collections.sort(students, new SortByGrade());
        for(Student value: students){
            System.out.println(value.idNumber);
        }


    }


}
