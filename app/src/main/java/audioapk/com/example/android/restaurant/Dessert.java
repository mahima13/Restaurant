package audioapk.com.example.android.restaurant;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

import java.util.ArrayList;

public class Dessert extends AppCompatActivity {
    ArrayList<String> selection = new ArrayList<>();
    TextView final_text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dessert);
        final_text = findViewById(R.id.final_result);
        final_text.setEnabled(false);
    }

    public void selectItem(View view) {
        boolean checked = ((CheckBox) view).isChecked();

        switch (view.getId())
        {
            case R.id.d1:
                if(checked) {
                    selection.add("Rasmalai (Rs.200)");
                }
                else {
                    selection.remove("Rasmalai");
                }
                break;
            case R.id.d2:
                if(checked) {
                    selection.add("Gulab Jamun (Rs.150)");
                }
                else {
                    selection.remove("Gulab Jamun");
                }
                break;
            case R.id.d3:
                if(checked) {
                    selection.add("Panacota (Rs.150)");
                }
                else {
                    selection.remove("Panacota");
                }
                break;
            case R.id.d4:
                if(checked) {
                    selection.add("Chocolate Cake (Rs.200)");
                }
                else {
                    selection.remove("Chocolate Cake");
                }
                break;
            case R.id.d5:
                if(checked) {
                    selection.add("Icecream Sundae (150)");
                }
                else {
                    selection.remove("Icecream Sundae");
                }
                break;
            case R.id.d6:
                if(checked) {
                    selection.add("Pherni (Rs.140)");
                }
                else {
                    selection.remove("Pherni");
                }
                break;
            case R.id.d7:
                if(checked) {
                    selection.add("Brownie Sizzler (Rs.250)");
                }
                else {
                    selection.remove("Brownie Sizzler");
                }
                break;
            case R.id.d8:
                if(checked) {
                    selection.add("Shahi Tukda (Rs.130)");
                }
                else {
                    selection.remove("Shahi Tukda");
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
