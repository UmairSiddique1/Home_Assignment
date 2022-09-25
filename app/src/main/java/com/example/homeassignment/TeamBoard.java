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


public class TeamBoard extends Fragment {
    private RecyclerView recyclerView;
    private List<Model> modelListteam;
    private TeamBoardAdapter teamBoardAdapter;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_teamboard, container, false);
        recyclerView=view.findViewById(R.id.teamBoardRV);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        modelListteam=new ArrayList<>();
        teamBoardAdapter=new TeamBoardAdapter(modelListteam,getContext());
        Model data=new Model(R.drawable.docs_logo1_real,"My team board 1","orem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in","22-09-22","Class 1");
       modelListteam.add(data);
        Model data2=new Model(R.drawable.docs_logo2_real,"My team board 2","orem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in ","23-09-22","Class 2");
        modelListteam.add(data2);
        Model data3=new Model(R.drawable.docs_logo3_real,"My team board 3","orem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in","24-09-22","Class 3");
        modelListteam.add(data3);
       recyclerView.setAdapter(teamBoardAdapter);
        return view;

    }
}