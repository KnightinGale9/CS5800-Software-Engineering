package Aggregation;

import java.util.ArrayList;

public class Course {
    private String courseName;
    private ArrayList<Instructor> instructor;
    private ArrayList<Textbook> textbook;

    public Course()
    {
        instructor=new ArrayList<>();
        textbook=new ArrayList<>();
    }
    public void setCourseName(String courseName)
    {
        this.courseName = courseName;
    }
    public void setInstructor(Instructor instructor)
    {
        this.instructor.add(instructor);
    }
    public void setTextbook(Textbook textbook)
    {
        this.textbook.add(textbook);
    }


    public String getCourseName()
    {
        return courseName;
    }
    public ArrayList<Instructor> getInstructor()
    {
        return instructor;
    }

    public ArrayList<Textbook> getTextbook()
    {
        return textbook;
    }

    @Override
    public String toString()
    {

        return String.format("Course: %s\nInstructor:%s\nTextbook:%s",courseName,instructor.toString(), textbook.toString());
    }
}
