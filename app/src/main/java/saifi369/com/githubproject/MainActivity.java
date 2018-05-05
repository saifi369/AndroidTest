package saifi369.com.githubproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //This is brand new project

        Button btnClick=findViewById(R.id.btn_click);

        btnClick.setOnClickListener(this::show);


    }

    private void show(View view) {
        TextView textView=findViewById(R.id.textView);
        textView.setText("Button is clicked");
    }
    //file with branch merges

    //these are changes made in a branch not master
    //and that branch is added to master later on
}
