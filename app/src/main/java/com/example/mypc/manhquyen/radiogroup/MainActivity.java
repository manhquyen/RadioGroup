package com.example.mypc.manhquyen.radiogroup;

import android.graphics.drawable.GradientDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RadioGroup radioGroup1 = (RadioGroup)findViewById(R.id.group1);
        Radio1Process radio1Process= new Radio1Process();
        radioGroup1.setOnCheckedChangeListener(radio1Process);
        RadioGroup radioGroup2 = (RadioGroup)findViewById(R.id.group2);
        Radio2Process radio2Process= new Radio2Process();
        radioGroup2.setOnCheckedChangeListener(radio2Process);

        //Button save = (Button)findViewById(R.id.save);
        //save.setOnClickListener(onSave);
        //RadioGroup radio1=(RadioGroup)findViewById(R.id.group1);
        //radio1.setOnClickListener(gro1);

        //group1.setGravity(Gravity.RIGHT);
        //System.out.print(group1.getCheckedRadioButtonId());

       /* switch (group1.getCheckedRadioButtonId())
        {
            case R.id.horizontal:
                group1.setOrientation(LinearLayout.HORIZONTAL);
                break;
            case R.id.vertical:
                group1.setOrientation(LinearLayout.VERTICAL);
                break;
        } */
    }
    class Radio1Process implements RadioGroup.OnCheckedChangeListener{
        public void onCheckedChanged(RadioGroup group, int checkId)
        {   RadioGroup radioGroup=(RadioGroup)findViewById(R.id.group1);
            switch (checkId)
            {
                case R.id.horizontal: radioGroup.setOrientation(LinearLayout.HORIZONTAL);
                    break;
                case R.id.vertical: radioGroup.setOrientation(LinearLayout.VERTICAL);
                    break;
            }
        }
    }
    class Radio2Process implements RadioGroup.OnCheckedChangeListener{
        public void onCheckedChanged(RadioGroup group, int checkId)
        {   RadioGroup radioGroup=(RadioGroup)findViewById(R.id.group2);
            switch (checkId)
            {
                case R.id.left: radioGroup.setGravity(Gravity.LEFT);
                    break;
                case R.id.right: radioGroup.setGravity(Gravity.RIGHT);
                    break;
                case R.id.center: radioGroup.setGravity(Gravity.CENTER_HORIZONTAL);
                    break;
            }
        }
    }

    /*public void onRadioButtonClicked(View view)
   {   RadioGroup group1=(RadioGroup)findViewById(R.id.group1);
       RadioGroup group2=(RadioGroup)findViewById(R.id.group2);
       boolean checked =((RadioButton) view).isChecked();
       switch (((RadioButton) view).getId())
       {
           case R.id.horizontal:
               if(checked)
                   group2.setOrientation(LinearLayout.HORIZONTAL);
               break;
       }
       case R.id.vertical:
               if (checked)
                   group2.setOrientation(LinearLayout.VERTICAL);
               break;
   } */
    /* private View.OnClickListener onSave = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            RadioGroup group1 = (RadioGroup) findViewById(R.id.group1);
            RadioGroup group2 = (RadioGroup) findViewById(R.id.group2);
            switch (group1.getCheckedRadioButtonId()) {
                case R.id.horizontal:
                    group2.setOrientation(LinearLayout.HORIZONTAL);
                    break;
                case R.id.vertical:
                    group2.setOrientation(LinearLayout.VERTICAL);
                    break;
            }
            switch (group2.getCheckedRadioButtonId())
            {
                case R.id.left:
                    group2.setGravity(Gravity.LEFT);
                    break;
                case R.id.right:
                    group2.setGravity(Gravity.RIGHT);
                    break;
                case R.id.center:
                    group2.setGravity(Gravity.CENTER_HORIZONTAL);
            }
        }
    }; */
    /* private View.OnClickListener gro1= new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            RadioGroup g1=(RadioGroup)findViewById(R.id.group1);
            switch (g1.getCheckedRadioButtonId())
            {
                case R.id.horizontal:
                    g1.setOrientation(LinearLayout.HORIZONTAL);
                    break;
                case R.id.vertical:
                    g1.setOrientation(LinearLayout.VERTICAL);
                    break;
            }
        }
    }; */
}