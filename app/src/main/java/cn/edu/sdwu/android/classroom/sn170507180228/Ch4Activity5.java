package cn.edu.sdwu.android.classroom.sn170507180228;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

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




    }
}
