package audioapk.com.example.android.restaurant.User;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import java.util.ArrayList;
import java.util.Arrays;

import audioapk.com.example.android.restaurant.R;

public class UserMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_menu);
    }

    public void clicked(View view) {


        int idToArray;
        Intent intent = new Intent(this,UserSubMenu.class);
        switch (view.getId()){
            case R.id.dessert_button:
                idToArray = R.array.dessert;
                break;
            case R.id.drink_button:
                idToArray = R.array.Drink;
                break;
            case R.id.veg_button:
                idToArray = R.array.Veg;
                break;
            case R.id.non_veg_button:
                idToArray = R.array.NonVeg;
                break;
            case R.id.pizza_button:
                idToArray = R.array.Pizza;
                break;
            default:
                idToArray = 0;

        }

        intent.putExtra("items", new ArrayList<>(Arrays.asList(getResources().getStringArray(idToArray))));
        startActivity(intent);


    }
}
