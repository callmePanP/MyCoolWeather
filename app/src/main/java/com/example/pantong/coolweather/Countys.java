package com.example.pantong.coolweather;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Countys extends AppCompatActivity {

    private ListView listView=null;
    private ArrayAdapter<String> adapter=null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_countys);
        ListView listView=(ListView)findViewById(R.id.listView3);
        Bundle bundle = this.getIntent().getExtras();
        int pid=bundle.getInt("pid");
        int cid=bundle.getInt("cid");
        String Counties[][][]=new String[][][]{
                {{"1","2","3","4"},{"1","2","3","4"}},
                {{"江汉区","武昌区","汉阳区","洪山区"},{"宜昌县","枝江县","远安县","兴山县"}},
                {{"上城区","下城区","拱墅区","西湖区"},{"莲都区","松阳县","青田县","龙泉市"}}
        };
        adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, Counties[pid][cid]);
        listView.setAdapter(adapter);
    }
}
