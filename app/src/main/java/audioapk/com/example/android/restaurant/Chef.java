package audioapk.com.example.android.restaurant;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class Chef extends AppCompatActivity {

    DatabaseReference myRef;
    private TextView allOrdersText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chef);
        allOrdersText = findViewById(R.id.all_orders);

        myRef = FirebaseDatabase.getInstance().getReference("orders");
        final StringBuilder value = new StringBuilder();


        myRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {

                value.append("\n\n\n");
                for (DataSnapshot df:dataSnapshot.getChildren()) {

                    value.append(df.getValue(String.class)).append("\n\n\n");

                }

                allOrdersText.setText(value);
                value.setLength(0);



            }
            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });


    }


    public void deleteList(View view) {

        myRef.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                for (DataSnapshot appleSnapshot: dataSnapshot.getChildren()) {
                    appleSnapshot.getRef().removeValue();
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {
            }
        });

    }
}
