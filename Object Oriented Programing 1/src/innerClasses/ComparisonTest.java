package innerClasses;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparisonTest {

        class GradeAscending implements Comparator<Grade> {

            @Override
            public int compare(Grade o1, Grade o2) {
                return o1.points - o2.points;
            }

        }
        static class GradeDescending implements Comparator<Grade>{

            @Override
            public int compare(Grade o1, Grade o2) {
                return (o1.points - o2.points) *-1;
            }

        }


        public static void main(String[] args) {

            class NameAscending implements Comparator<Grade>{

                @Override
                public int compare(Grade o1, Grade o2) {
                    return o1.name.compareTo(o2.name);
                }

            }

            Grade g1 = new Grade(58, "Ben");
            Grade g2 = new Grade(75, "Taye");
            Grade g3 = new Grade(28, "Jen");
            Grade g4 = new Grade(75, "Joel");
            Grade g5 = new Grade(97, "Ronnie");
            Grade g6 = new Grade(25, "Liam");
            Grade g7 = new Grade(65, "Xavier");

            List<Grade> gradesList = new ArrayList<Grade>();
            gradesList.add(g1);
            gradesList.add(g2);
            gradesList.add(g3);
            gradesList.add(g4);
            gradesList.add(g5);
            gradesList.add(g6);
            gradesList.add(g7);

            //Local inner class
            NameAscending ascendingNmae = new NameAscending();

            System.out.println("Before: " + gradesList);
            Collections.sort(gradesList, ascendingNmae);
            System.out.println("Name Ascending:  " + gradesList);



            //Member inner class
            ComparisonTest comp = new ComparisonTest();
            ComparisonTest.GradeAscending ga = comp.new GradeAscending();

            Collections.sort(gradesList, ga);
            System.out.println("Grade Ascending:  " + gradesList);



            //Static inner class
            ComparisonTest.GradeDescending descendingGrade = new ComparisonTest.GradeDescending();

            System.out.println("Name Descending:  " + gradesList);
            Collections.sort(gradesList, descendingGrade);
            System.out.println("Grade Descending:  " + gradesList);



            //Anonymous inner class
            Collections.sort(gradesList, new Comparator<Grade>() {
                @Override
                public int compare(Grade o1, Grade o2) {
                    return o1.name.compareTo(o2.name)*-1;
                }
            });

            Collections.sort(gradesList,   new Comparator<Grade>(){

                @Override
                public int compare(Grade o1, Grade o2) {
                    return o1.points - o2.points;
                }

            });

            //Lambda expression
            Collections.sort(gradesList, (o1,  o2) -> o1.name.compareTo(o2.name));




        }
    }


