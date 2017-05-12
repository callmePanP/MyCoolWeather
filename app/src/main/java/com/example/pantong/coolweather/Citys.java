package com.example.pantong.coolweather;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Citys extends AppCompatActivity implements AdapterView.OnItemClickListener{

    private ListView listView=null;
    private ArrayAdapter<String> adapter=null;
    int pid;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_citys);

        ListView listView=(ListView)findViewById(R.id.listView2);
        Bundle bundle = this.getIntent().getExtras();
        pid=bundle.getInt("pid");
        String citys[][]=new String[][]{
                {"东城区","西城区"},
                {"武汉市","宜昌市"},
                {"杭州","丽水"}
        };
        adapter=new ArrayAdapter<String>(this,android.R.layout.simple_expandable_list_item_1,citys[pid]);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Bundle bundle=new Bundle();
        Intent intent =new Intent(Citys.this,Countys.class);
        bundle.putInt("pid",pid);
        bundle.putInt("cid",position);
        intent.putExtras(bundle);
        startActivity(intent);
    }
}
