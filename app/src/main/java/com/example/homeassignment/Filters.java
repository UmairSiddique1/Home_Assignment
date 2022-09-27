package com.example.homeassignment;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.RadioButton;
import android.widget.SearchView;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.Calendar;

public class Filters extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
private ListView listView;
private Button datePickerbutton,buttonClose,buttonApply;
private DatePickerDialog datePickerDialog;
private ImageView filterIV;
private AutoCompleteTextView autoCompleteTextView;
private Spinner spinner;
private static final String[] classes=new String[]{"Class 1","Class 2","Class 3"};
private ArrayAdapter<String> arrayAdapter;
private RadioButton allpost,assignmentRadio,homeworkRadio,weeklyPlan,dlp,lesson,getWeeklyPlan,external;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_filters);
        dlp=findViewById(R.id.dlpRadio);
        lesson=findViewById(R.id.lessonRadio);
        getWeeklyPlan=findViewById(R.id.exWeeklyRadio);
        external=findViewById(R.id.externalRadio);
        allpost=findViewById(R.id.radioAllPost);
        assignmentRadio=findViewById(R.id.attachmentRadio);
        homeworkRadio=findViewById(R.id.homeWorkRadio);
        weeklyPlan=findViewById(R.id.weeklyRadio);
        buttonApply=findViewById(R.id.buttonApply);
        filterIV=findViewById(R.id.filterIV);
        buttonClose=findViewById(R.id.buttonClose);
       autoCompleteTextView=findViewById(R.id.searchFilter);
        datePickerbutton=findViewById(R.id.dataPickerFilter);
        spinner=findViewById(R.id.spinnerFilter);
       arrayAdapter=new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,classes);
       autoCompleteTextView.setAdapter(arrayAdapter);
       buttonClose.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               Intent i=new Intent(getApplicationContext(),MainActivity.class);
               startActivity(i);

           }
       });
       buttonApply.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               if(allpost.isChecked()){
                   Intent a=new Intent(getApplicationContext(),MainActivity.class);
                   a.putExtra("allPost",allpost.getText().toString());
                   startActivity(a);
               }
               if (assignmentRadio.isChecked()){
                   Intent b=new Intent(getApplicationContext(),MainActivity.class);
                   b.putExtra("assignmentRadio",assignmentRadio.getText().toString());
                   startActivity(b);
               }
               if(homeworkRadio.isChecked()){
                   Intent c=new Intent(getApplicationContext(),MainActivity.class);
                   c.putExtra("homeworktRadio",homeworkRadio.getText().toString());
                   startActivity(c);
               }
               if(weeklyPlan.isChecked()){
                   Intent d=new Intent(getApplicationContext(),MainActivity.class);
                   d.putExtra("weeklyRadio",weeklyPlan.getText().toString());
                   startActivity(d);
               }
               if(dlp.isChecked()){
                   Intent e=new Intent(getApplicationContext(),MainActivity.class);
                   e.putExtra("dlp",dlp.getText().toString());
                   startActivity(e);
               }
               if(lesson.isChecked()){
                   Intent f=new Intent(getApplicationContext(),MainActivity.class);
                   f.putExtra("lesson",lesson.getText().toString());
                   startActivity(f);
               }
               if(getWeeklyPlan.isChecked()){
                   Intent g=new Intent(getApplicationContext(),MainActivity.class);
                   g.putExtra("getweek",getWeeklyPlan.getText().toString());
                   startActivity(g);
               }
               if(external.isChecked()){
                   Intent h=new Intent(getApplicationContext(),MainActivity.class);
                   h.putExtra("external",external.getText().toString());
                   startActivity(h);
               }
           }
       });





        filterIV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(getApplicationContext(),MainActivity.class);
                startActivity(i);
            }
        });
        datePickerbutton.setBackgroundColor(Color.WHITE);
        initDatePicker();
        datePickerbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openDatePicker(view);
            }


        });
//       items=new ArrayList<String>();
//       items.add("Monday");
//        items.add("tuesday");
//        items.add("Wednesday");
//        arrayAdapter=new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,items);
//        listView.setAdapter(arrayAdapter);
//        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
//            @Override
//            public boolean onQueryTextSubmit(String s) {
//                return false;
//            }
//
//            @Override
//            public boolean onQueryTextChange(String s) {
//                arrayAdapter.getFilter().filter(s);
//                return false;
//            }
//        });
        ArrayAdapter<CharSequence> arrayAdapter1=ArrayAdapter.createFromResource(this,R.array.subjacts, android.R.layout.simple_spinner_item);
        arrayAdapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(arrayAdapter1);

        spinner.setOnItemSelectedListener(this);

    }

    private void initDatePicker() {
        DatePickerDialog.OnDateSetListener dataSetListener=new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker datePicker, int year, int month, int day) {
                month=month+1;
                String data=makeDataString(day,month,year);
                datePickerbutton.setText(data);
            }
        };
        Calendar cal=Calendar.getInstance();
        int year=cal.get(Calendar.YEAR);
        int month=cal.get(Calendar.MONTH);
        int day=cal.get(Calendar.DAY_OF_MONTH);
        datePickerDialog=new DatePickerDialog(this,dataSetListener,year,month,day);
    }
    private String makeDataString(int day,int month,int year){
        return getMonthFormat(month) +"  "+day+"  "+year;
    }
    private String getMonthFormat(int month){
        if(month==1){
            return"JAN";
        }
        if(month==2){
            return"FEB";
        }
        if(month==3){
            return"MAR";
        }
        if(month==4){
            return"APR";
        }
        if(month==5){
            return"MAY";
        }
        if(month==6){
            return"JUN";
        }
        if(month==7){
            return"JUL";
        }
        if(month==8){
            return"AUG";
        }
        if(month==9){
            return"SEP";
        }
        if(month==10){
            return"OCT";
        }
        if(month==11){
            return"NOV";
        }
        if(month==12){
            return"DEC";
        }
        return "JAN";
    }

    private void openDatePicker(View view) {
        datePickerDialog.show();
    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
        String c=adapterView.getItemAtPosition(i).toString();
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}