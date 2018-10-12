package audioapk.com.example.android.restaurant.User;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;
import java.util.Arrays;

import audioapk.com.example.android.restaurant.MainActivity;
import audioapk.com.example.android.restaurant.R;

public class UserMenu extends AppCompatActivity{


    DatabaseReference myRef;

    TextView cartItemText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_menu);
        cartItemText = findViewById(R.id.cart_items);

//        TODO
//        myRef = FirebaseDatabase.getInstance().getReference("message");
//        myRef.setValue("Hello, World!");

//        myRef = FirebaseDatabase.getInstance().getReference();
//        DatabaseReference child = myRef.child("name");
//        child.setValue("Ketan");

        myRef = FirebaseDatabase.getInstance().getReference("orders");



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

    @Override
    protected void onResume() {
        super.onResume();


        StringBuilder cartString = new StringBuilder();
        for (int i = 0; i < MainActivity.cart.size()-1; i+=2) {
            cartString.append(MainActivity.cart.get(i)).append("\t").append(MainActivity.cart.get(i + 1)).append("\n");
        }
        cartString.append("\n").append("Total is ").append(MainActivity.total);

        cartItemText.setText(cartString);

    }


    private void checkout() {

        //Write to database
        myRef.push().setValue(cartItemText.getText().toString());

        Toast.makeText(this,"Checkout Successful Please wait For your order",Toast.LENGTH_LONG).show();


        MainActivity.cart.clear();
        MainActivity.total = 0;
        finish();
    }

    public void checkout(View view) {
        if (MainActivity.total <= 0){
            Toast.makeText(this,"No Item selected",Toast.LENGTH_LONG).show();
            return;
        }

        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Checkout").setMessage("Are you sure you want to checkout this items?")
                .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        checkout();
                    }
                }).setNegativeButton(android.R.string.no, new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        }).setIcon(R.drawable.ic_shopping_cart).show();

    }
}
