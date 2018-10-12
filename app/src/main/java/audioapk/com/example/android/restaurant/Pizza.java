package audioapk.com.example.android.restaurant;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

import java.util.ArrayList;

public class Pizza extends AppCompatActivity {
    ArrayList<String> selection = new ArrayList<String>();
    TextView final_text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pizza);
        final_text = (TextView) findViewById(R.id.final_result);
        final_text.setEnabled(false);
    }

    public void selectItem(View view) {
        boolean checked = ((CheckBox) view).isChecked();

        switch (view.getId())
        {
            case R.id.p1:
                if(checked) {
                    selection.add("Fresh Veggie (Rs.40)");
                }
                else {
                    selection.remove("Fresh Veggie");
                }
                break;
            case R.id.p2:
                if(checked) {
                    selection.add("Chicken (Rs.120)");
                }
                else {
                    selection.remove("Chicken");
                }
                break;
            case R.id.p3:
                if(checked) {
                    selection.add("Cheese Burst (Rs.150)");
                }
                else {
                    selection.remove("Cheese Burst");
                }
                break;
            case R.id.p4:
                if(checked) {
                    selection.add("Margerita (Rs.100)");
                }
                else {
                    selection.remove("Margerita");
                }
                break;
            case R.id.p5:
                if(checked) {
                    selection.add("Sweet Corn (Rs.130)");
                }
                else {
                    selection.remove("Sweet Corn");
                }
                break;
            case R.id.p6:
                if(checked) {
                    selection.add("Onion (Rs.79)");
                }
                else {
                    selection.remove("Onion");
                }
                break;
            case R.id.p7:
                if(checked) {
                    selection.add("Deluxe (Rs.250)");
                }
                else {
                    selection.remove("Deluxe");
                }
                break;
            case R.id.p8:
                if(checked) {
                    selection.add("Peppy Paneer (Rs.180)");
                }
                else {
                    selection.remove("Peppy Paneer");
                }
                break;
        }
    }


    public void finalSelection(View view) {
        String final_selection = "";

        for (String Selections : selection)
        {
            final_selection = final_selection + Selections + "\n";
        }
        final_text.setText(final_selection);
        final_text.setEnabled(true);


    }
}
