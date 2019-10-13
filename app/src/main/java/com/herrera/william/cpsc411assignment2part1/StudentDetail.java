package com.herrera.william.cpsc411assignment2part1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;

import com.herrera.william.cpsc411assignment2part1.Model.Student;
import com.herrera.william.cpsc411assignment2part1.Model.StudentDB;

public class StudentDetail extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_detail);

        int studentIndex = getIntent().getIntExtra("StudentIndex", 0);

        Student studentObj = StudentDB.getOurInstance().getStudents().get(studentIndex);
        EditText firstName = findViewById(R.id.first_name);
        EditText lastName = findViewById(R.id.last_name);
        EditText CWID = findViewById(R.id.CWID);
        firstName.setText(studentObj.getFirstName());
        lastName.setText(studentObj.getLastName());
        CWID.setText(studentObj.getCWID());
    }
}
