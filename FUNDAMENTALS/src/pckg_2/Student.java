package pckg_2;

public class Student {

    private String name;
    private String university;
    private static int cntID = 100;
    private int id;
    private int yOfStudy;


    public Student(String name, String university){
        this.name = name;
        this.university = university;
        this.id = cntID++;

    }

    public Student (String name, String university, int y0fStudy){
        this(name, university);
        this.yOfStudy = y0fStudy;
    }

    public Student nextYearOfStudy(){
        System.out.println("Success - enrolled in the next year of study.");
        this.yOfStudy ++;
        return this;
    }
}
