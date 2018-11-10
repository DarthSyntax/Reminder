package seclass.qc.edu.glm;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class activity_username extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_username);
    }

    public void storeName(View v){
        Intent userIntent = new Intent (this, activity_reminderlist.class);
        startActivity(userIntent);
    }
}
