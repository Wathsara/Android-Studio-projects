package com.industrialmaster.wdbinaryconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void finddetails(View v){
        EditText number = findViewById(R.id.nicnumber);
        TextView gender = findViewById(R.id.gender);
        TextView date = findViewById(R.id.date);
        Button b = findViewById(R.id.button);
        String a = number.getText().toString();

      if(a.length()==9){

          String year= a.substring(0,2).toString();
          String month = a.substring(2,5).toString();
          String mn=null;
          gender.setText(a);
          if((Integer.parseInt(month)>366 && Integer.parseInt(month)<=500) || (Integer.parseInt(month)>866)){
              gender.setText("Invalid Nic Number");
              return;
          }
            if(Integer.parseInt(Character.toString(a.charAt(2)))>=5){
                gender.setText("Gender\nFemale");
                int datecount = Integer.parseInt(month)-500;
                if(datecount>335){
                    datecount = datecount-335; //366-31 =335
                    mn = "December";
                }else if(datecount>305){
                    datecount = datecount-305;
                    mn = "November";
                }else if(datecount>274){
                    datecount = datecount-274;
                    mn = "October";
                }else if(datecount>244){
                    datecount = datecount-244;
                    mn = "September";
                }else if(datecount>213){
                    datecount = datecount-213;
                    mn = "August";
                }else if(datecount>182){
                    datecount = datecount-182;
                    mn = "July";
                } else if(datecount>152){
                    datecount = datecount-152;
                    mn = "June";
                }else if(datecount>121){
                    datecount = datecount-121;
                    mn = "May";
                }else if(datecount>91){
                    datecount = datecount-91;
                    mn = "April";
                }else if(datecount>60){
                    datecount = datecount-60;
                    mn = "March";
                }else if(datecount<32){
                    mn = "January";
                }else if(datecount>31){
                    datecount = datecount-31; //366-31 =335
                    mn = "February";
                }
                date.setText("Birthday\n"+Integer.toString(datecount)+"/"+mn+"/"+"19"+year);
            }else{
                gender.setText("Gender\nMale");
                int datecount = Integer.parseInt(month);
                if(datecount>335){
                    datecount = datecount-335; //366-31 =335
                    mn = "December";
                }else if(datecount>305){
                    datecount = datecount-305;
                    mn = "November";
                }else if(datecount>274){
                    datecount = datecount-274;
                    mn = "October";
                }else if(datecount>244){
                    datecount = datecount-244;
                    mn = "September";
                }else if(datecount>213){
                    datecount = datecount-213;
                    mn = "August";
                }else if(datecount>182){
                    datecount = datecount-182;
                    mn = "July";
                } else if(datecount>152){
                    datecount = datecount-152;
                    mn = "June";
                }else if(datecount>121){
                    datecount = datecount-121;
                    mn = "May";
                }else if(datecount>91){
                    datecount = datecount-91;
                    mn = "April";
                }else if(datecount>60){
                    datecount = datecount-60;
                    mn = "March";
                }else if(datecount<32){
                    mn = "January";
                }else if(datecount>31){
                    datecount = datecount-31; //366-31 =335
                    mn = "February";
                }
                date.setText("Birthday\n"+Integer.toString(datecount)+"/"+mn+"/"+"19"+year);

            }
      }else{
          gender.setText("Invalid Nic Number");

      }

    }
}
