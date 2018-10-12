package audioapk.com.example.android.restaurant;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

import java.util.ArrayList;

public class Drink extends AppCompatActivity {
    ArrayList<String> selection = new ArrayList<String>();
    TextView final_text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drink);
        final_text = (TextView) findViewById(R.id.final_result);
        final_text.setEnabled(false);
    }

    public void selectItem(View view) {
        boolean checked = ((CheckBox) view).isChecked();

        switch (view.getId())
        {
            case R.id.e1:
                if(checked) {
                    selection.add("Pina Colada (Rs.70)");
                }
                else {
                    selection.remove("Pina Colada");
                }
                break;
            case R.id.e2:
                if(checked) {
                    selection.add("Lassi (Rs.60)");
                }
                else {
                    selection.remove("Lassi");
                }
                break;
            case R.id.e3:
                if(checked) {
                    selection.add("Irish Coffee (Rs.70)");
                }
                else {
                    selection.remove("Irish Coffee");
                }
                break;
            case R.id.e4:
                if(checked) {
                    selection.add("Ginger Tea (Rs. 35)");
                }
                else {
                    selection.remove("Ginger Tea");
                }
                break;
            case R.id.e5:
                if(checked) {
                    selection.add("Masala Tea (Rs.70)");
                }
                else {
                    selection.remove("Masala Tea");
                }
                break;
            case R.id.e6:
                if(checked) {
                    selection.add("Aam Panna (Rs.20)");
                }
                else {
                    selection.remove("Aam Panna");
                }
                break;
            case R.id.e7:
                if(checked) {
                    selection.add("Mojito (Rs.140)");
                }
                else {
                    selection.remove("Mojito");
                }
                break;
            case R.id.e8:
                if(checked) {
                    selection.add("Lemonade (Rs.20)");
                }
                else {
                    selection.remove("Lemonade");
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
