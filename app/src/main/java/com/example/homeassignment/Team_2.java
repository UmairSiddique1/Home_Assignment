package com.example.homeassignment;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DownloadManager;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Team_2 extends AppCompatActivity {
private TextView team2desc;
private ImageView teamIVarrow;
private Button button;
private DownloadManager downloadManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_team2);
        team2desc=findViewById(R.id.team2Desc);
        teamIVarrow=findViewById(R.id.team2IVarrow);
        button=findViewById(R.id.teamDownloadBtn);

        Intent intent=getIntent();
        String desc=intent.getStringExtra("description");
        team2desc.setText(desc);
        teamIVarrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(getApplicationContext(),MainActivity.class);
                startActivity(i);
            }
        });
button.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        downloadManager=(DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
        Uri uri=Uri.parse("https://www.computernetworkingnotes.com/linux-tutorials/network-configuration-files-in-linux-explained.html");
        DownloadManager.Request request=new DownloadManager.Request(uri);
        request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
        Long reference=downloadManager.enqueue(request);
    }
});

    }
}