package audioapk.com.example.android.restaurant;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;



import java.util.ArrayList;

public class Veg extends AppCompatActivity {
    ArrayList<String> selection = new ArrayList<String>();

    TextView final_text;
    //int i,i1=0,i2=0,i3=0,i4=0,i5=0,i6=0,i7=0,i8=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_veg);
        final_text = findViewById(R.id.final_result);
        final_text.setEnabled(false);
    }

    public void selectItem(View view) {
        boolean checked = ((CheckBox) view).isChecked();

        switch (view.getId())
        {
            case R.id.v1:
                if(checked) {
                    selection.add("Dal Tadka (Rs.60)");

                }
                else {
                    selection.remove("Dal Tadka");
                }
                break;
            case R.id.v2:
                if(checked) {
                    selection.add("Jeera Rice (Rs.120)");

                }
                else {
                    selection.remove("Jeera Rice");
                }
                break;
            case R.id.v3:
                if(checked) {
                    selection.add("Butter naan (Rs.25)");

                }
                else {
                    selection.remove("Butter naan");
                }
                break;
            case R.id.v4:
                if(checked) {
                    selection.add("Shahi Paneer (Rs.60)");

                }
                else {
                    selection.remove("Shahi Paneer");
                }
                break;
            case R.id.v5:
                if(checked) {
                    selection.add("VEG. KolhaPuri (Rs.170)");

                }
                else {
                    selection.remove("VEG. Kolhapuri");
                }
                break;
            case R.id.v6:
                if(checked) {
                    selection.add("Roti (Rs.20)");

                }
                else {
                    selection.remove("Roti");
                }
                break;
            case R.id.p7:
                if(checked) {
                    selection.add("Pulav (Rs.100)");

                }
                else {
                    selection.remove("Pulav");
                }
                break;
            case R.id.p8:
                if(checked) {
                    selection.add("Paneer Platter (Rs.300)");

                }
                else {
                    selection.remove("Paneer Platter");
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
