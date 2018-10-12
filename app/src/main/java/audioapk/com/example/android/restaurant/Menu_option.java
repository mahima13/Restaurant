package audioapk.com.example.android.restaurant;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;


public class Menu_option extends AppCompatActivity {
   Button btn2,btn3,btn4,btn5,btn6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_option);
        addListenerOnButton1();
        addListenerOnButton2();
        addListenerOnButton3();
        addListenerOnButton4();
        addListenerOnButton5();
        btn2 = (Button) findViewById(R.id.pizza);
        btn3 = (Button) findViewById(R.id.veg);
        btn4 = (Button) findViewById(R.id.nonveg);
        btn5 = (Button) findViewById(R.id.drink);
        btn6 = (Button) findViewById(R.id.dessert);

    }

    public void addListenerOnButton2() {

        final Context context = this;

        btn3 = (Button) findViewById(R.id.veg);

        btn3.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(context, Veg.class);
                startActivity(intent);

            }

        });


    }

    private void addListenerOnButton1() {
        final Context context = this;

        btn2 = (Button) findViewById(R.id.pizza);

        btn2.setOnClickListener(new OnClickListener(){

            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(context, Pizza.class);
                startActivity(intent);

            }

        });

    }



    public void addListenerOnButton3() {

        final Context context = this;

        btn4 = (Button) findViewById(R.id.nonveg);

        btn4.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(context, NonVeg.class);
                startActivity(intent);

            }

        });


    }
    public void addListenerOnButton4() {

        final Context context = this;

        btn5 = (Button) findViewById(R.id.drink);

        btn5.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(context, Drink.class);
                startActivity(intent);

            }

        });


    }
    public void addListenerOnButton5() {

        final Context context = this;

        btn6 = (Button) findViewById(R.id.dessert);

        btn6.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(context, Dessert.class);
                startActivity(intent);

            }

        });


    }
    }


