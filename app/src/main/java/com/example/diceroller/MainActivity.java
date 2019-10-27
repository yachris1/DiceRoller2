package com.example.diceroller;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

public void on_button_click(View view){

        roll_dice();

        TextView tv = (TextView) this.findViewById(R.id.textView);
        EditText tv2 = (EditText) this.findViewById(R.id.editText2);
        TextView tv3 = (TextView) this.findViewById(R.id.textView3);


       // Random r = new Random();
       // int max=6, min=1;
       // int number = r.nextInt((max - min) + 1) + min;

       // tv.setText(Integer.toString(number));

        int first = Integer.valueOf(tv.getText().toString());
        int second = Integer.valueOf(tv2.getText().toString());

        if ( first == second) {
            int third = Integer.valueOf(tv3.getText().toString());
            int scoreUp = third + 1;
            tv3.setText(Integer.toString(scoreUp));

            Toast.makeText(getApplicationContext(),"Congratulations", Toast.LENGTH_SHORT).show();

        }


   }
   public void roll_dice ()
   {
       TextView tv = (TextView) this.findViewById(R.id.textView);

       Random r = new Random();
       int max=6, min=1;
       int number = r.nextInt((max - min) + 1) + min;

       tv.setText(Integer.toString(number));



   }
public void iceBreakers (View view)
{
    roll_dice();

    TextView tv = (TextView) this.findViewById(R.id.textView);
    int number = Integer.valueOf(tv.getText().toString());

    ArrayList <String> arrayQuestions = new ArrayList();
    arrayQuestions.add("If you could go anywhere in the world, where would you go?");
    arrayQuestions.add("If you were stranded on a desert island, what three things would you want to take with you?");
    arrayQuestions.add("If you could eat only one food for the rest of your life, what would that be?");
    arrayQuestions.add("If you won a million dollars, what is the first thing you would buy?");
    arrayQuestions.add("If you could spaned the day with one fictional character, who would it be?");
    arrayQuestions.add("If you found a magic lantern and a genie gave you three wishes, what would you wish?");

    TextView questionBox = (TextView) this.findViewById(R.id.questionBox);
    questionBox.setText(arrayQuestions.get(number));

}

}



