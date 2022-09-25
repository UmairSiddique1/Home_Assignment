package com.example.homeassignment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;

import java.util.ArrayList;
import java.util.List;


public class SchoolBoard extends Fragment {
    private RecyclerView recyclerView;
    private List<Model> modelList;
    private SchoolBoardAdapter schoolBoardAdapter;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_schoolboard, container, false);
        recyclerView=view.findViewById(R.id.schoolBoardRV);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext())
        );
        modelList=new ArrayList<>();
        schoolBoardAdapter=new SchoolBoardAdapter(modelList,getContext());
        recyclerView.setAdapter(schoolBoardAdapter);
        Model data =new Model(R.drawable.docs_logo1_real,"School board title","orem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in","22-09-22","Class 1");
        modelList.add(data);

        Model data2 =new Model(R.drawable.docs_logo2_real,"School board title2","orem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in","22-09-22","Class 2");
        modelList.add(data2);

        Model data3 =new Model(R.drawable.docs_logo3_real,"School board title3","umai ruamir orem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in","22-08-22","Class 3");
        modelList.add(data3);
        schoolBoardAdapter.notifyDataSetChanged();


        return view;
    }
}