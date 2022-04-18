package com.example.dz_3_daniyar_3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
     private ArrayList<String> addresses = new ArrayList();
     private RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        loadData();
        recyclerView=findViewById(R.id.recycler);
        AddressAdapter adapter = new AddressAdapter(addresses);
        recyclerView.setAdapter(adapter);


    }

    private void loadData() {
        addresses= new ArrayList<>();
        addresses.add("Sovetskaya st");
        addresses.add("Sovetskaya st");
        addresses.add("Sovetskaya st");
        addresses.add("Sovetskaya st");
        addresses.add("Sovetskaya st");
        addresses.add("Sovetskaya st");
        addresses.add("Sovetskaya st");
        addresses.add("Sovetskaya st");
        addresses.add("Sovetskaya st");
        addresses.add("Sovetskaya st");
        addresses.add("Sovetskaya st");
        addresses.add("Sovetskaya st");
        addresses.add("Sovetskaya st");
        addresses.add("Sovetskaya st");
        addresses.add("Sovetskaya st");
    }


}