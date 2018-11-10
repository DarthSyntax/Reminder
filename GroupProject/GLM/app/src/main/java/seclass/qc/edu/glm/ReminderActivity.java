package seclass.qc.edu.glm;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class ReminderActivity extends AppCompatActivity {

    public static int hour;
    public static int minute;
    EditText getName;
    EditText getType;
    String name;
    String type;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reminders);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    public void submitAttributes(View v) {
        getName = (EditText) findViewById(R.id.enterName);
        name = getName.getText().toString();
        getType = (EditText) findViewById(R.id.enterType);
        type = getType.getText().toString();
        //Intent reminderListActivity = new Intent(this, activity_reminderlist.class);
        //reminderActivity.putExtra("myReminder", new Gson().toJson(new Reminder(name, type)));

        finish();
    }

}
