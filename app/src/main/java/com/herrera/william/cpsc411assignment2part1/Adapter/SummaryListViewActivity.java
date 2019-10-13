package com.herrera.william.cpsc411assignment2part1.Adapter;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

import com.herrera.william.cpsc411assignment2part1.Model.Course;
import com.herrera.william.cpsc411assignment2part1.Model.Student;
import com.herrera.william.cpsc411assignment2part1.Model.StudentDB;
import com.herrera.william.cpsc411assignment2part1.R;

import java.util.ArrayList;

import androidx.annotation.Nullable;

public class SummaryListViewActivity extends Activity {

    protected ListView mStudentList;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        createStudents();

        setContentView(R.layout.student_listview);
        mStudentList = findViewById(R.id.student_listview_id);
        SummaryListViewAdapter adapter =new SummaryListViewAdapter();
        mStudentList.setAdapter(adapter);
    }

    protected void createStudents()
    {
        ArrayList<Student> studentArrayList = new ArrayList<>();

        Student s1 = new Student("Will", "Herrera", "8675309");
        ArrayList<Course> courses = new ArrayList<>();
        courses.add(new Course("CPSC 411", "A+"));
        s1.setCourses(courses);
        studentArrayList.add(s1);

        Student s2 = new Student("John", "Smith", "55547398");
        courses = new ArrayList<Course>();
        courses.add(new Course("CPSC 464", "B"));
        s2.setCourses(courses);
        studentArrayList.add(s2);

        StudentDB.getOurInstance().setStudents(studentArrayList);
    }
}
