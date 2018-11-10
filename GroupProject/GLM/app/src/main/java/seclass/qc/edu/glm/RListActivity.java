package seclass.qc.edu.glm;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ExpandableListAdapter;
import android.widget.ExpandableListView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

//Class for Expandable Reminder List
public class RListActivity extends AppCompatActivity {

    private ExpandableListView listView;
    private ExpandableReminderList listAdapter;
    private List<String> listDataHeader;
    private HashMap<String,List<String>> listHash;
    EditText rListName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_rlist);

        listView = (ExpandableListView)findViewById(R.id.lvExp);
        //initData();
        listDataHeader = new ArrayList<>();
        listHash = new HashMap<>();
        listAdapter = new ExpandableReminderList(this,listDataHeader,listHash);
        listView.setAdapter(listAdapter);

        registerForContextMenu(listView);


    }

    @Override
    //This dictates the menu shown when a long click is performed
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        menu.setHeaderTitle("Context Menu");

        menu.add(0, v.getId(), 0, "Add");
        menu.add(1, v.getId(), 0, "Edit");
        menu.add(2, v.getId(), 0, "Delete");



    }

    @Override
    //The action performed when a context menu item is clicked
    public boolean onContextItemSelected(MenuItem item) {
        ExpandableListView.ExpandableListContextMenuInfo info = (ExpandableListView.ExpandableListContextMenuInfo) item
                .getMenuInfo();

        int type = ExpandableListView.getPackedPositionType(info.packedPosition);
        int groupPosition = ExpandableListView.getPackedPositionGroup(info.packedPosition);
        int childPosition = ExpandableListView.getPackedPositionChild(info.packedPosition);

        Toast.makeText(this, groupPosition , Toast.LENGTH_SHORT).show();


        return super.onContextItemSelected(item);


        //return true;
    }

    public void initData(View v) {
        rListName = (EditText) findViewById(R.id.enterListName);
        String title = rListName.getText().toString();
        listDataHeader.add(title);
        listHash.put(title, new ArrayList<String>());
        listAdapter.notifyDataSetChanged();
        rListName.setText("");
/*
         Example how to add to Expandable List

        listDataHeader.add("Grocery List");
        listDataHeader.add("School List");
        listDataHeader.add("Travel List");

        List<String> grocery = new ArrayList<>();
        grocery.add("Milk");
        grocery.add("Bread");
        grocery.add("Eggs");

        List<String> school = new ArrayList<>();
        school.add("pencils");
        school.add("paper");

        List<String> travel = new ArrayList<>();
        travel.add("Tokyo");
        travel.add("Dubai");
        travel.add("Iceland");
        travel.add("Mongolia");

        listHash.put(listDataHeader.get(0), grocery);
        listHash.put(listDataHeader.get(1), school);
        listHash.put(listDataHeader.get(2), travel);
*/

    }
}