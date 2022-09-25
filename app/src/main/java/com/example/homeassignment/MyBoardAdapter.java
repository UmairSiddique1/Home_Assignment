package com.example.homeassignment;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MyBoardAdapter extends RecyclerView.Adapter<MyBoardAdapter.ViewHolder> {
    private List<Model> modelList;
    private Context context;

    public MyBoardAdapter(List<Model> modelList, Context context) {
        this.modelList = modelList;
        this.context = context;
    }

    public MyBoardAdapter(List<Model> modelList) {
        this.modelList = modelList;
    }

    @NonNull
    @Override
    public MyBoardAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.myboardlayout, parent, false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyBoardAdapter.ViewHolder holder, int position) {
    String title1=modelList.get(position).getTitle();
    int imgId=modelList.get(position).getImageId();
    String desc=modelList.get(position).getDescription();
    String dat=modelList.get(position).getDate();
    String grad=modelList.get(position).getGrade();

    holder.setData(title1,imgId,desc,dat,grad);
    holder.itemView.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent i=new Intent(context,MyBoard_2.class);
            i.putExtra("desc",desc);
            context.startActivity(i);
        }
    });

    }

    @Override
    public int getItemCount() {
        return modelList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private ImageView myBoardIV;
        private TextView myBoardTitle,myBoardDescription,myBoardDate,myBoardClass;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            myBoardIV=itemView.findViewById(R.id.myBoardIV);
            myBoardTitle=itemView.findViewById(R.id.titleMyBoardTV);
            myBoardDescription=itemView.findViewById(R.id.myBoardDescription);
            myBoardDate=itemView.findViewById(R.id.myBoardDate);
            myBoardClass=itemView.findViewById(R.id.myBoardClass);
        }

        public void setData(String title1, int imgId, String desc, String dat, String grad) {
            myBoardIV.setImageResource(imgId);
            myBoardTitle.setText(title1);
            myBoardDescription.setText(desc);
            myBoardDate.setText(dat);
            myBoardClass.setText(grad);
        }
    }
}
