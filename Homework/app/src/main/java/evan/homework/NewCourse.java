package evan.homework;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class NewCourse extends AppCompatActivity {
private String newCourseName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_assignment);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        EditText input = (EditText) findViewById(R.id.setClassName);
        // Store EditText in Variable
        newCourseName = input.getText().toString();

//        Button b = new Button(AllAssignments);


//       FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
//        fab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Snackbar.make(view, "Remove me", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
//            }
//        });
//
    }

}
