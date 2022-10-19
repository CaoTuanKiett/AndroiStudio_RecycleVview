package com.example.androistudio_recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import Category.Category;
import Category.CategoryAdapter;
import Ronaldo.Ronaldo;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rcvCategory;
    private CategoryAdapter categoryAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rcvCategory = findViewById(R.id.rcv_category);
        categoryAdapter = new CategoryAdapter(this);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, RecyclerView.VERTICAL, false);
        rcvCategory.setLayoutManager(linearLayoutManager);

        categoryAdapter.setData(getListCategory());
        rcvCategory.setAdapter(categoryAdapter);
    }

    private List<Category> getListCategory() {
        List<Category> listCategory = new ArrayList<>();

        List<Ronaldo> ronaldoList = new ArrayList<>() ;

        ronaldoList.add(new Ronaldo(R.drawable.cr710, "Cristiano Ronaldo 1"));
        ronaldoList.add(new Ronaldo(R.drawable.cr712, "Cristiano Ronaldo 2"));
        ronaldoList.add(new Ronaldo(R.drawable.cr713, "Cristiano Ronaldo 3"));
        ronaldoList.add(new Ronaldo(R.drawable.cr715, "Cristiano Ronaldo 4"));

        ronaldoList.add(new Ronaldo(R.drawable.cr710, "Cristiano Ronaldo 1"));
        ronaldoList.add(new Ronaldo(R.drawable.cr712, "Cristiano Ronaldo 2"));
        ronaldoList.add(new Ronaldo(R.drawable.cr713, "Cristiano Ronaldo 3"));
        ronaldoList.add(new Ronaldo(R.drawable.cr715, "Cristiano Ronaldo 4"));

        listCategory.add(new Category("Category 1", ronaldoList));
        listCategory.add(new Category("Category 2", ronaldoList));
        listCategory.add(new Category("Category 3", ronaldoList));

        return listCategory;
    }
}