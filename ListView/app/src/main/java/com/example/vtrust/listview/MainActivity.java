package com.example.vtrust.listview;

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
    private String[] data = {"Apple","Banana","Orange","Apple","Banana","Orange","Apple","Banana","Orange",
            "Apple","Banana","Orange","Apple","Banana","Orange","Apple","Banana","Orange","Apple","Banana","Orange",
            "Apple","Banana","Orange","Apple","Banana","Orange","Apple","Banana","Orange","Apple","Banana","Orange"};

    private List<Fruit> fruitList = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        ArrayAdapter<String> adapter = new ArrayAdapter<String>(MainActivity.this,android.R.layout.simple_list_item_1,data);
//        ListView listView = (ListView)findViewById(R.id.list_view);
//        listView.setAdapter(adapter);
        initFruits();
        FruitAdapter adapter = new FruitAdapter(MainActivity.this,R.layout.fruit_item,fruitList);
        ListView listView = findViewById(R.id.list_view);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Fruit fruit = fruitList.get(i);
                Toast.makeText(MainActivity.this, fruit.getName(), Toast.LENGTH_SHORT).show();;
            }
        });
    }

    private  void initFruits(){
        for(int i=0;i<2;i++){
            Fruit dog1 = new Fruit("Dog", R.drawable.dog);
            fruitList.add(dog1);
            Fruit dog2 = new Fruit("Dog2", R.drawable.dog2);
            fruitList.add(dog2);
            Fruit dog11 = new Fruit("Dog", R.drawable.dog);
            fruitList.add(dog11);
            Fruit dog22 = new Fruit("Dog2", R.drawable.dog2);
            fruitList.add(dog22);
            Fruit dog111 = new Fruit("Dog", R.drawable.dog);
            fruitList.add(dog111);
            Fruit dog222 = new Fruit("Dog2", R.drawable.dog2);
            fruitList.add(dog222);
            Fruit dog1111 = new Fruit("Dog", R.drawable.dog);
            fruitList.add(dog1111);
            Fruit dog21 = new Fruit("Dog2", R.drawable.dog2);
            fruitList.add(dog21);
            Fruit dog13 = new Fruit("Dog", R.drawable.dog);
            fruitList.add(dog13);
            Fruit dog23 = new Fruit("Dog2", R.drawable.dog2);
            fruitList.add(dog23);
            Fruit dog14 = new Fruit("Dog", R.drawable.dog);
            fruitList.add(dog14);
            Fruit dog25 = new Fruit("Dog2", R.drawable.dog2);
            fruitList.add(dog25);
        }
    }


}
