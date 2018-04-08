package com.example.vtrust.intentactivitydemo;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Process;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class firstActivity extends AppCompatActivity {
    //private ProgressDialog progressDialog;
    private String[] data = {"1","2","3","4"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        ListView listView = findViewById(R.id.listView);
        ArrayAdapter<String>adapter = new ArrayAdapter<String>(firstActivity.this, android.R.layout.simple_dropdown_item_1line,data);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

            }
        });


        /*Button button1 = findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(firstActivity.this,"button1",Toast.LENGTH_SHORT).show();
                //显示
//                Intent intent = new Intent(firstActivity.this,secondActivity.class);
//                startActivity(intent);
                //隐式
//                Intent intent = new Intent("android.intent.action.SECOND");
//                intent.addCategory("android.intent.category.MY_CATE");
//                startActivity(intent);
                //打开浏览器
//                Intent intent = new Intent(Intent.ACTION_VIEW);
//                intent.setData(Uri.parse("http://www.baidu.com"));
//                startActivity(intent);

                //1-2传数据
//                String data = "Hello";
//                Intent intent = new Intent(firstActivity.this,secondActivity.class);
//                intent.putExtra("data",data);
//                startActivity(intent);

                //2-1传数据
                //Intent intent = new Intent(firstActivity.this,secondActivity.class);
                //startActivityForResult(intent,1);

                //ProgressDialog progressDialog =new ProgressDialog(Main)
                AlertDialog.Builder aler = new AlertDialog.Builder(firstActivity.this);
                aler.setTitle("This is Dialog");
                aler.setCancelable(false);
                aler.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                    }
                });
                aler.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                    }
                });
                aler.show();

            }
        });*/
    }

    @Override
    protected void onActivityResult(int requestCode,int resultCode,Intent data){
        switch (requestCode){
            case 1:
                if(resultCode == RESULT_OK){
                    String returnData = data.getStringExtra("data");
                    Log.d("data1", returnData);
                }
        }
    }
}

