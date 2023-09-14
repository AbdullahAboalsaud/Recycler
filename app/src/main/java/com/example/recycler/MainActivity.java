package com.example.recycler;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.recycler.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<String> list = new ArrayList<>();

    AdapterRecyclerUser adapterRecyclerUser = new AdapterRecyclerUser();
    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        initData();

        adapterRecyclerUser.setList(list);
        binding.recyclerUser.setAdapter(adapterRecyclerUser);
    }

    private void initData(){
        list.add("ali");
        list.add("salma");
        list.add("noha");
        list.add("assem");
        list.add("omar");
        list.add("yousef");
        list.add("abeer");
        list.add("menna");
        list.add("dina");
        list.add("mona");
        list.add("khaled");
        list.add("anas");
        list.add("esam");
        list.add("ameer");
    }

}