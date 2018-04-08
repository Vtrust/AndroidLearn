package com.example.vtrust.maillist;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private List<Person> personList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initPesons();
        PersonAdapter adapter = new PersonAdapter(MainActivity.this,R.layout.person_item,personList);
        ListView listView = findViewById(R.id.list_view);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Person person = personList.get(i);
                //Toast.makeText(MainActivity.this, person.getName(), Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity.this, DetailActivity.class);
//                intent.putExtra("name",person.getName());
//                intent.putExtra("avatar",person.getAvatar());

                //intent.putExtra("name",person.getName());
                //intent.putExtra("name",person.getName());
                Bundle bundle = new Bundle();
                bundle.putString("name",person.getName());
                bundle.putInt("avatar",person.getAvatar());
                bundle.putString("phone",person.getPhone());
                bundle.putString("mail",person.getMail());
                bundle.putString("address",person.getAddress());

                intent.putExtras(bundle);

                startActivity(intent);
            }
        });
    }

    private void initPesons(){
        for(int i=0;i<10;i++){
            Person dog1 = new Person("Per1", R.drawable.dog1,"12345","12345@mail.com","大连---");
            personList.add(dog1);
            Person dog2 = new Person("Per2", R.drawable.dog2,"54321","54321@mail.com","---大连");
            personList.add(dog2);
        }
    }
}
