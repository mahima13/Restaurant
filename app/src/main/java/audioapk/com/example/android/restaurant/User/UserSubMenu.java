package audioapk.com.example.android.restaurant.User;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.TextView;

import java.util.ArrayList;

import audioapk.com.example.android.restaurant.R;

public class UserSubMenu extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_sub_menu);

        Bundle bundle = getIntent().getExtras();
        assert bundle != null;
        RecyclerView recyclerView = findViewById(R.id.sub_menu_recycler);
        recyclerView.setAdapter(new MenuListAdaptor(this, bundle.getStringArrayList("items")));
        recyclerView.setLayoutManager(new LinearLayoutManager(this));





    }


    private class MenuListAdaptor extends RecyclerView.Adapter<MenuHolder> {


        private Context context;
        private ArrayList<String> items;

        public MenuListAdaptor(Context context, ArrayList<String> items) {
            this.context = context;
            this.items = items;
        }



        @NonNull
        @Override
        public MenuHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            return new MenuHolder(LayoutInflater.from(context).inflate(R.layout.menu_card,parent,false));

        }

        @Override
        public void onBindViewHolder(@NonNull MenuHolder holder, int position) {
            Log.i("Ketan",items.toString());

            holder.bind(items.get(position),items.get((items.size()/2) + position));
        }


        @Override
        public int getItemCount() {
            return items.size()/2;
        }
    }

    private class MenuHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        private TextView menuText;
        private TextView menuPrice;
        private CheckBox checkBox;


        MenuHolder(View itemView) {
            super(itemView);

            menuText = itemView.findViewById(R.id.card_menu_name);
            menuPrice = itemView.findViewById(R.id.card_menu_price);
            checkBox = itemView.findViewById(R.id.card_checkBox);

            itemView.setOnClickListener(this);



        }

        void bind(String menu, String price) {

            menuText.setText(menu);
            menuPrice.setText(price);
            System.out.println(price);

        }

        @Override
        public void onClick(View v) {
            if (checkBox.isChecked()){
                checkBox.setChecked(false);
            }else {
                checkBox.setChecked(true);
            }
        }
    }
}
