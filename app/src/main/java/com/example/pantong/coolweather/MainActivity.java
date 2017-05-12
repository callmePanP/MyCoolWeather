package com.example.pantong.coolweather;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    //    private List<String> datasource=new ArrayList<String>();
    private String[] province = {
             "北京市",
// "重庆市", "上海市", "天津市",
//            "安徽省", "福建省", "甘肃省", "广东省",
//            "贵州省", "海南省", "河北省", "河南省",
             "湖北省",
// "湖南省", "吉林省","黑龙江省",
//            "江苏省", "江西省", "辽宁省", "青海省",
//            "山东省 ", "山西省", "陕西省", "四川省",
             "浙江省"
//            "云南省",, "台湾省",
//            "广西壮族自治区", "内蒙古自治区", "宁夏回族自治区", "西藏自治区", "新疆维吾尔自治区",
//            "香港特别行政区", "澳门特别行政区"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_expandable_list_item_1, province);
        ListView listView = (ListView) findViewById(R.id.list_view1);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Bundle bundle=new Bundle();
                Intent intent =new Intent(MainActivity.this,Citys.class);
                bundle.putInt("pid",position);
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });
    }
}