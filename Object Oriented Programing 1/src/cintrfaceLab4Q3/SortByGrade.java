package cintrfaceLab4Q3;

import java.util.Comparator;

public class SortByGrade implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return o1.getLastName().compareTo(o2.getLastName());
    }
}
