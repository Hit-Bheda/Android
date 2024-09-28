package com.example.practical16;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private MyAdapter myAdapter;
    private List<String> titles;
    private List<String> descriptions;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        // Sample data
        titles = new ArrayList<>();
        descriptions = new ArrayList<>();

        titles.add("Javascript");
        titles.add("Typescript");
        titles.add("Go");
        titles.add("Rust");
        titles.add("C");

        descriptions.add("Javascript Is Used To Create Client Side And Server Side Apps");
        descriptions.add("Typescript Is Javascript But Better ");
        descriptions.add("GO Is Like C But It Has More High Level Features Like Garbage Collection ");
        descriptions.add("Rust Is A Low Level language To Replace C. But It Sucessfully Failed ");
        descriptions.add("The God father Of Modern Programming Languages And Oprating Systems Like Unix And Windows ");

        myAdapter = new MyAdapter(titles, descriptions);
        recyclerView.setAdapter(myAdapter);
    }
}



