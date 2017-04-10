package swe.sofolab.mycheckbox;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private CheckBox check1,check2,check3;

    private Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        check_box();

        new_checkbox();

    }


    public void new_checkbox(){

        check1=(CheckBox)findViewById(R.id.checkBox);

        check2=(CheckBox) findViewById(R.id.checkBox2);

        check3=(CheckBox)findViewById(R.id.checkBox3);

        check1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                if( ((CheckBox)v).isChecked()){

                    Toast.makeText(MainActivity.this,"You select Blue:",Toast.LENGTH_SHORT).show();

                }



            }
        });


        check2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                if( ((CheckBox)v).isChecked() ){


                    Toast.makeText(MainActivity.this,"You select Red Color:",Toast.LENGTH_LONG).show();

                }



            }
        });

        check3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if( ((CheckBox)v).isChecked()){

                    Toast.makeText(MainActivity.this,"you select Yellow color:",Toast.LENGTH_LONG).show();

                }

            }
        });

    }


    public void check_box(){

        check1=(CheckBox)findViewById(R.id.checkBox);

        check2=(CheckBox)findViewById(R.id.checkBox2);

        check3=(CheckBox)findViewById(R.id.checkBox3);


        btn=(Button)findViewById(R.id.button);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                StringBuffer resul=new StringBuffer();

                resul.append("Blue: " ).append(check1.isChecked());

                resul.append("\n\n\nRed: " ).append(check2.isChecked());

                resul.append("\n\n\nYellow: " ).append(check3.isChecked());

                Toast.makeText(MainActivity.this,resul.toString(),Toast.LENGTH_LONG).show();

            }
        });

    }





}
