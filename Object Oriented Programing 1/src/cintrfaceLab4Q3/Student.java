package cintrfaceLab4Q3;

public class Student implements Comparable<Student>{

    String lastName;
    int idNumber;
    public Student(){
        lastName= "Tewodros";
        idNumber= 1126;
    }

    public Student(String lastName, int idNumber) {
        this.lastName = lastName;
        this.idNumber = idNumber;
    }

    public String getLastName() {
        return lastName;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }

    @Override
    public int compareTo(Student st) {
        return idNumber-st.idNumber;
        //or use this
//        if(idNumber==st.idNumber)
//        return 0;
//        else
//            return 1;
    }
}
