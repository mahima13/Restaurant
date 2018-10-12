package audioapk.com.example.android.restaurant;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;



import java.util.ArrayList;

public class NonVeg extends AppCompatActivity {
    ArrayList<String> selection = new ArrayList<String>();
    ArrayList<Integer> total = new ArrayList<>();
    TextView final_text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_non_veg);
        final_text = (TextView) findViewById(R.id.final_result);
        final_text.setEnabled(false);
    }

    public void selectItem(View view) {
        boolean checked = ((CheckBox) view).isChecked();

        switch (view.getId())
        {
            case R.id.n1:
                if(checked) {
                    selection.add("Butter chicken (Rs.160)");
                    total.add(160);

                }
                else {
                    selection.remove("Butter Chicken");
                }
                break;
            case R.id.n2:
                if(checked) {
                    selection.add("Steamed Rice (Rs.60)");
                    total.add(60);
                }
                else {
                    selection.remove("Steamed Rice");
                }
                break;
            case R.id.n3:
                if(checked) {
                    selection.add("Butter naan (Rs.25)");
                    total.add(25);
                }
                else {
                    selection.remove("Butter naan");
                }
                break;
            case R.id.n4:
                if(checked) {
                    selection.add("Chicken chettinad (Rs.180)");
                    total.add(180);
                }
                else {
                    selection.remove("Chicken chettinad");
                }
                break;
            case R.id.n5:
                if(checked) {
                    selection.add("Prawns Koliwada (Rs.170)");
                    total.add(170);
                }
                else {
                    selection.remove("Prawns Koliwada");
                }
                break;
            case R.id.n6:
                if(checked) {
                    selection.add("Roti (Rs.20)");
                    total.add(20);
                }
                else {
                    selection.remove("Roti");
                }
                break;
            case R.id.n7:
                if(checked) {
                    selection.add("Chicken Biriyani (Rs.200)");
                    total.add(200);
                }
                else {
                    selection.remove("Chicken Biriyani");
                }
                break;
            case R.id.n8:
                if(checked) {
                    selection.add("Mutton Biriyani (Rs.300)");
                    total.add(300);
                }
                else {
                    selection.remove("Mutton Biriyani");
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
        int totalValue = 0;
        for (int item:total) {
            totalValue+=item;
        }
        final_selection= "\n total is : - " +String.valueOf(totalValue);
        final_text.setText(final_selection);
        final_text.setEnabled(true);


    }
}
