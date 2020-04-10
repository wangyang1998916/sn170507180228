package cn.edu.sdwu.android.classroom.sn170507180228;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;

public class Ch4Activity8 extends AppCompatActivity {
    private ArrayList list;
    private SimpleAdapter simpleAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_ch7_4);
        //准备数据
        list=new ArrayList();
        HashMap hashMap=new HashMap();
        hashMap.put("name","goods1");
        hashMap.put("price","50");
        hashMap.put("img",R.drawable.cm);
        list.add(hashMap);
        hashMap=new HashMap();
        hashMap.put("name","goods2");
        hashMap.put("price","500");
        hashMap.put("img",R.drawable.cm);
        list.add(hashMap);
         hashMap=new HashMap();
        hashMap.put("name","goods3");
        hashMap.put("price","550");
        hashMap.put("img",R.drawable.cm);
        list.add(hashMap);
        //实例化适配器
        simpleAdapter=new SimpleAdapter(this,list,R.layout.layout_ch7_5,new String[]{"name","price","img"},new int[]{R.id.goods_name,R.id.goods_price,R.id.goods_cm});
        ListView listView=(ListView)findViewById(R.id.ch7_1_22);
        listView.setAdapter(simpleAdapter);
    }
}
