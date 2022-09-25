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

public class TeamBoardAdapter extends RecyclerView.Adapter<TeamBoardAdapter.ViewHolder> {
    private List<Model> modelListteam;
    private Context context;

    public TeamBoardAdapter(List<Model> modelListteam, Context context) {
        this.modelListteam = modelListteam;
        this.context = context;
    }

    public TeamBoardAdapter(List<Model> modelListteam) {
        this.modelListteam = modelListteam;
    }

    @NonNull
    @Override
    public TeamBoardAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.teamboardlayout, parent, false);

        return new TeamBoardAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull TeamBoardAdapter.ViewHolder holder, int position) {
    holder.teamBoardTitle.setText(modelListteam.get(position).getTitle());
    holder.teamBoardDescription.setText(modelListteam.get(position).getDescription());
    holder.teamBoardIV.setImageResource(modelListteam.get(position).getImageId());
    holder.teamBoardDate.setText(modelListteam.get(position).getDate());
    holder.teamBoardClass.setText(modelListteam.get(position).getGrade());
    String desc=modelListteam.get(position).getDescription();

    holder.itemView.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent i=new Intent(context, Team_2.class);
            i.putExtra("description",desc);
            context.startActivity(i);

        }
    });
    }

    @Override
    public int getItemCount() {
        return modelListteam.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private ImageView teamBoardIV;
        private TextView teamBoardTitle,teamBoardDescription,teamBoardClass,teamBoardDate;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            teamBoardIV=itemView.findViewById(R.id.teamBoardIV);
           teamBoardDescription=itemView.findViewById(R.id.teamBoardDescription);
            teamBoardTitle=itemView.findViewById(R.id.teamBoardTitleTV);
            teamBoardClass=itemView.findViewById(R.id.teamBoardClass);
            teamBoardDate=itemView.findViewById(R.id.teamBoardDate);
        }
    }
}
