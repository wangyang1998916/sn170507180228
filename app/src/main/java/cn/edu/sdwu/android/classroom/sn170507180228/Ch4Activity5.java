package cn.edu.sdwu.android.classroom.sn170507180228;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

import org.xmlpull.v1.XmlPullParser;

public class Ch4Activity5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_ch4_6);
        //获取的资源
        //在JANA中获取字符串资源
        String content=getString(R.string.hello);
        Log.i(Ch4Activity5.this.toString(),content);
        String sms=getString(R.string.sms);
        sms=String.format(sms,100,"张三");
        Log.i(Ch4Activity5.this.toString(),content);


//获取数组资源
        Resources resources=getResources();
        //整型数组
        int[] intArr=resources.getIntArray(R.array.intArr);
        for(int i=0;i<intArr.length;i++){
            Log.i(Ch4Activity5.this.toString(),intArr[i]+"");
        }
     //字符串数组
       String[] strArr=resources.getStringArray(R.array.strArr);
        for(int i=0;i<strArr.length;i++){
            Log.i(Ch4Activity5.this.toString(),strArr[i]);
        }
        //普通类型数组
        TypedArray typedArray=resources.obtainTypedArray(R.array.commanArr);
        ImageView imageView=(ImageView)findViewById(R.id.ch6_1_iv);
       int resId=typedArray.getResourceId(0,0);
        imageView.setImageResource(resId);
        String str=typedArray.getString(1);
        Log.i(Ch4Activity5.this.toString(),str);
        //注册上下文
        LinearLayout linearLayout=(LinearLayout)findViewById(R.id.ch6_1_11);
        registerForContextMenu(linearLayout);
        XmlPullParser xmlPullParser=resources.getXml(R.xml.word);
        try {
            while (xmlPullParser.getEventType() != XmlPullParser.END_DOCUMENT) {
                if(xmlPullParser.getEventType()==XmlPullParser.START_TAG){
                    //判断是否是word元素（words）直接跳过
                   if(xmlPullParser.getName().equals("word")){
                       String word=xmlPullParser.getAttributeValue(0);
                       Log.i(Ch4Activity5.class.toString(),word);
                   }

                }
                xmlPullParser.next();
            }
        }catch(Exception e){
            Log.e(Ch4Activity5.class.toString(),e.toString());

        }
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        //加载自定义的菜单资源
        MenuInflater menuInflater=getMenuInflater();
        menuInflater.inflate(R.menu.activity,menu);
    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.mymenu_item1:
                Toast.makeText(this,"item1",Toast.LENGTH_SHORT).show();
                break;
            case R.id.mymenu_item2:
                Toast.makeText(this,"item2",Toast.LENGTH_SHORT).show();
                break;
            case R.id.mymenu_item3:
                Toast.makeText(this,"item3",Toast.LENGTH_SHORT).show();
                break;
        }
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        //基于回调的事件处理
        //根据菜单项的ID进行区分
        switch (item.getItemId()){
            case R.id.mymenu_item1:
                Toast.makeText(this,"item1",Toast.LENGTH_SHORT).show();
                break;
            case R.id.mymenu_item2:
                Toast.makeText(this,"item2",Toast.LENGTH_SHORT).show();
                break;
            case R.id.mymenu_item3:
                Toast.makeText(this,"item3",Toast.LENGTH_SHORT).show();
                break;
        }
        return true;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater=getMenuInflater();
        menuInflater.inflate(R.menu.activity,menu);
        return true;
    }
}
