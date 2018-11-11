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
    public static int count;
    String childName;
    String childDate;
    String childTime;
    String label;  // childName + childDate + childTime to show on the content_rlist.xml screen
    int currentGroupPosition;
    String titleStr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_rlist);
        Intent intent = getIntent();
        if(intent.hasExtra("username")) {
            TextView txt = (TextView) findViewById(R.id.usersLists);
            String temp = txt.getText().toString();
            if(!temp.isEmpty()) {
                String temp2 = intent.getStringExtra("username");
                txt.setText(temp2 + "'s " + temp);
            }
        }
        listView = (ExpandableListView)findViewById(R.id.lvExp);
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
        //menu.setHeaderTitle("Context Menu");

       // menu.add(0, v.getId(), 0, "Add");
        //menu.add(1, v.getId(), 0, "Edit");
        //menu.add(2, v.getId(), 0, "Delete");
        ExpandableListView.ExpandableListContextMenuInfo info = (ExpandableListView.ExpandableListContextMenuInfo) menuInfo;
        int type = ExpandableListView.getPackedPositionType(info.packedPosition);
        int groupPosition = ExpandableListView.getPackedPositionGroup(info.packedPosition);
        int childPosition = ExpandableListView.getPackedPositionChild(info.packedPosition);

        // Shows context menu for Reminder Lists
        if (type == ExpandableListView.PACKED_POSITION_TYPE_GROUP) {
            menu.setHeaderTitle("List chosen");
            menu.add(0, v.getId(), 0, "Add Reminder");
            menu.add(1, v.getId(), 0, "Edit List");
            menu.add(2, v.getId(), 0, "Delete List");


            // Displays the context menu for Reminders
        } else if (type == ExpandableListView.PACKED_POSITION_TYPE_CHILD) {
            menu.setHeaderTitle("Reminder chosen");
            menu.add(0, v.getId(), 0, "Edit");
            menu.add(1, v.getId(), 0, "Delete");

        }



    }

    @Override
    //The action performed when a context menu item is clicked
    public boolean onContextItemSelected(MenuItem item) {
        ExpandableListView.ExpandableListContextMenuInfo info = (ExpandableListView.ExpandableListContextMenuInfo) item
                .getMenuInfo();

        //These next few attributes are the position details of the list item selected
        int type = ExpandableListView.getPackedPositionType(info.packedPosition);
        int groupPosition = ExpandableListView.getPackedPositionGroup(info.packedPosition);
        int childPosition = ExpandableListView.getPackedPositionChild(info.packedPosition);
        currentGroupPosition = groupPosition;
        ExpandableReminderList.currentGroupPosition = groupPosition;
        titleStr = (String) listAdapter.getGroup(groupPosition);

        //This means a list was selected
        if (type == ExpandableListView.PACKED_POSITION_TYPE_GROUP) {

            //Add was clicked from menu
            if(item.getGroupId()==0) {

                Intent attrIntent = new Intent(this, ReminderActivity.class);
                startActivityForResult(attrIntent, 1);

                //Delete was clicked from menu
            } else if(item.getGroupId() == 2) {
                listAdapter.removeGroup(titleStr, groupPosition);
                listAdapter.notifyDataSetChanged();

                //Edit was selected from menu
            } else {
                Toast.makeText(this, "No edit functionality yet for list"  , Toast.LENGTH_SHORT).show();

            }
                // this means a reminder was selected
        } else if (type == ExpandableListView.PACKED_POSITION_TYPE_CHILD) {

            //Edit was selected
            if(item.getGroupId() == 0) {
                Toast.makeText(this, "No edit functionality yet for child"  , Toast.LENGTH_SHORT).show();

                //Delete was selected
            } else {
                String cName = (String) listAdapter.getChild(groupPosition, childPosition);
                listAdapter.removeChild(cName, groupPosition,childPosition);
                listAdapter.notifyDataSetChanged();
            }
        }


        return super.onContextItemSelected(item);

    }


    @Override
    //This method is called automatically when the activity that was launched by startActivityForResult() ends
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {

        if (resultCode == 1) {

            if (data.hasExtra("name") && data.hasExtra("date") && data.hasExtra("time")) {

                childName = data.getExtras().getString("name");
                childDate = data.getExtras().getString("date");
                childTime = data.getExtras().getString("time");
                label = childName + ":  " + childDate.substring(0, 2) + "/" + childDate.substring(2, 4) + "/" + childDate.substring(4) + ", " + childTime.substring(0,2) + ":" + childTime.substring(2);
                listAdapter.setChild(label, titleStr);
                listAdapter.notifyDataSetChanged();

            }
        }
    }

    public void initData(View v) {
        rListName = (EditText) findViewById(R.id.enterListName);
        String title = rListName.getText().toString();
        listAdapter.setGroup(title, new ArrayList<String>());
        listAdapter.notifyDataSetChanged();
        rListName.setText("");
        count++;

    }
}