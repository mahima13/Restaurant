package audioapk.com.example.android.restaurant;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import java.util.ArrayList;

import audioapk.com.example.android.restaurant.User.UserMenu;

public class MainActivity extends AppCompatActivity {

    public static ArrayList<String> cart = new ArrayList<>();
    public static int total = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void userClicked(View view) {

        Intent intent = new Intent(this,UserMenu.class);
        startActivity(intent);
    }

    public void chefClicked(View view) {
    }

    public void CounterClicked(View view) {
    }
}
