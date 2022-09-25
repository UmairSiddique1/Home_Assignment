package com.example.homeassignment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;


public class MyBoard extends Fragment {
    private RecyclerView recyclerView;
    private MyBoardAdapter myBoardAdapter;
    private List<Model> modelList;
    LinearLayoutManager linearLayoutManager;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_myboard, container, false);
        recyclerView=view.findViewById(R.id.myBoardRV);
        linearLayoutManager=new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(linearLayoutManager);
        modelList=new ArrayList<>();
        myBoardAdapter=new MyBoardAdapter(modelList,getContext());

        Model data=new Model(R.drawable.docs_logo1_real,"My Board 1","orem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in","20-08-20","class 1");
        modelList.add(data);
        Model data2=new Model(R.drawable.docs_logo2_real,"My Board 2","orem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in","20-08-20","class 2");
        modelList.add(data2);
        Model data3=new Model(R.drawable.docs_logo3_real,"My Board 3","orem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in","20-09-20","class 3");
        modelList.add(data3);
       recyclerView.setAdapter(myBoardAdapter);
//       myBoardAdapter.notifyDataSetChanged();
        return view;
    }
}