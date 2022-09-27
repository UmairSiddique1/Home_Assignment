package com.example.homeassignment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

public class MainActivity extends AppCompatActivity {
ViewPager2 viewPager2;
TabLayout tabLayout;
VPAdapter vpAdapter;
private TextView fAct1,fAct2,fAct3,fAct4,fAct5,fAct6,fAct7,fAct8;
private FloatingActionButton floatingActionButton;
    String[] title=new String[]{"My Board","Team Board","School Board"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewPager2=findViewById(R.id.viewerpager);
        tabLayout=findViewById(R.id.tabLayout);
        fAct1=findViewById(R.id.fAct1);
        fAct2=findViewById(R.id.fAct2);
        fAct3=findViewById(R.id.fAct3);
        fAct4=findViewById(R.id.fAct4);
        fAct5=findViewById(R.id.fAct5);
        fAct6=findViewById(R.id.fAct6);
        fAct7=findViewById(R.id.fAct7);
        fAct8=findViewById(R.id.fAct8);

        floatingActionButton=findViewById(R.id.floatingActionButton2);
        vpAdapter=new VPAdapter(this);
        viewPager2.setAdapter(vpAdapter);
      new TabLayoutMediator(tabLayout,viewPager2,((tab, position) ->tab.setText(title[position]) )).attach();

      floatingActionButton.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View view) {
              Intent intent=new Intent(MainActivity.this,Filters.class);
              startActivity(intent);
          }
      });

    Intent intent=getIntent();
    String allpost=intent.getStringExtra("allPost");
    String attachments=intent.getStringExtra("assignmentRadio");
    String homework=intent.getStringExtra("homeworktRadio");
    String weeklyplan=intent.getStringExtra("weeklyRadio");
    String dlp=intent.getStringExtra("dlp");
    String lesson=intent.getStringExtra("lesson");
    String getweek=intent.getStringExtra("getweek");
    String external=intent.getStringExtra("external");
   fAct1.setText(allpost);
   fAct2.setText(attachments);
   fAct3.setText(homework);
   fAct4.setText(weeklyplan);
        fAct5.setText(dlp);
        fAct6.setText(lesson);
        fAct7.setText(getweek);
        fAct8.setText(external);





    }
}