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

public class SchoolBoardAdapter extends RecyclerView.Adapter<SchoolBoardAdapter.ViewHolder> {
    private List<Model> modelList;
    private Context context;

    public SchoolBoardAdapter(List<Model> modelList, Context context) {
        this.modelList = modelList;
        this.context = context;
    }

    public SchoolBoardAdapter(List<Model> modelList) {
        this.modelList = modelList;
    }

    @NonNull
    @Override
    public SchoolBoardAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.schoolboardlayout, parent, false);

        return new SchoolBoardAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull SchoolBoardAdapter.ViewHolder holder, int position) {
  holder.schoolBoardIV.setImageResource(modelList.get(position).getImageId());
  holder.schoolBoardTitle.setText(modelList.get(position).getTitle());
  holder.schoolBoardDesc.setText(modelList.get(position).getDescription());
  holder.schoolBoardClass.setText(modelList.get(position).getGrade());
  holder.schoolBoardDate.setText(modelList.get(position).getDate());
  String desc=modelList.get(position).getDescription();
  holder.itemView.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View view) {
          Intent schoolIntent=new Intent(context, School_2.class);
          schoolIntent.putExtra("description",desc);
          context.startActivity(schoolIntent);

      }
  });
    }

    @Override
    public int getItemCount() {
        return modelList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private ImageView schoolBoardIV;
        private TextView schoolBoardTitle,schoolBoardDesc,schoolBoardClass,schoolBoardDate;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            schoolBoardIV=itemView.findViewById(R.id.schoolBoardIV);
            schoolBoardTitle=itemView.findViewById(R.id.schoolBoardTitleTV);
            schoolBoardDesc=itemView.findViewById(R.id.schoolBoardDescription);
            schoolBoardDate=itemView.findViewById(R.id.schoolBoardDate);
            schoolBoardClass=itemView.findViewById(R.id.schoolBoardClass);
        }
    }
}
