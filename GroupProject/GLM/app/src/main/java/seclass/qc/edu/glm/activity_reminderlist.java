package seclass.qc.edu.glm;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import java.util.*;

import android.view.View;
import android.view.View.*;
import android.widget.*;

public class activity_reminderlist extends AppCompatActivity {

    ArrayList<String> reminderListNames = new ArrayList<String>();

    ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reminderlist);

        Button addList = (Button) findViewById(R.id.addReminderListButton);

        ListView reminderList = (ListView) findViewById(R.id.reminderListListView);

        adapter = new ArrayAdapter<String> (this, android.R.layout.simple_list_item_1, reminderListNames);

        OnClickListener newList = new OnClickListener() {

            @Override
            public void onClick(View v) {
                EditText name = (EditText) findViewById(R.id.addReminderListName);
                reminderListNames.add(name.getText().toString());
                name.setText("");
                adapter.notifyDataSetChanged();
            }
        };

        addList.setOnClickListener(newList);

        reminderList.setAdapter(adapter);

    }
}
