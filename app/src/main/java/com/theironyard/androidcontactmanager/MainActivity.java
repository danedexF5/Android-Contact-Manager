package com.theironyard.androidcontactmanager;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener, AdapterView.OnItemLongClickListener {
    EditText name;
    EditText phone;
    Button add;
    ListView list;

    ArrayAdapter<String>items;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name = (EditText) findViewById(R.id.name);
        phone = (EditText) findViewById(R.id.phone);
        add = (Button) findViewById(R.id.button);
        list = (ListView) findViewById(R.id.listView);

        items = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1);
        list.setAdapter(items);
    }

    @Override
    public void onClick(View v) {
            String item = name.getText().toString();phone.getText().toString();
            items.add(item);
            name.setText("");
            phone.setText("");


    }

    @Override
    public boolean onItemLongClick(AdapterView<?> parent, View v, int position, long id) {
        String item = items.getItem(position);
        items.remove(item);
        return true;
    }

}
