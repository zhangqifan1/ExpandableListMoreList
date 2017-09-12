package cn.thinkmore.test;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import java.io.Serializable;
import java.util.List;

public class FirstActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode == 100){
            if(data != null) {
                List<Node> list = (List<Node>) data.getSerializableExtra("listobj");

                 //data.getSerializableExtra("node");

                Toast.makeText(this, list.size() + "", Toast.LENGTH_SHORT).show();

            }
        }
    }

    public void jumpToNext(View view) {

        Intent intent = new Intent(this, TtDemoActivity.class);

        startActivityForResult(intent, 100);

    }
}
