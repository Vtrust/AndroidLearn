package com.example.vtrust.maillist;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        Intent intent = getIntent();
//        String name = intent.getStringExtra("name");
//        int avatar = intent.getIntExtra("avatar",-1);
//        Toast.makeText(DetailActivity.this, name, Toast.LENGTH_SHORT).show();
//        Toast.makeText(DetailActivity.this, avatar, Toast.LENGTH_SHORT).show();
        Bundle bundle = this.getIntent().getExtras();
        ImageView pAvatar = findViewById(R.id.person_avatar);
        TextView pName = findViewById(R.id.person_name);
        Button pPhone = findViewById(R.id.person_phone);
        Button pMail = findViewById(R.id.person_mail);
        Button pAddress = findViewById(R.id.person_address);
        pAvatar.setImageResource(bundle.getInt("avatar"));
        pName.setText(bundle.getString("name"));
        pPhone.setText(bundle.getString("phone"));
        pMail.setText(bundle.getString("mail"));
        pAddress.setText(bundle.getString("address"));
    }
}
