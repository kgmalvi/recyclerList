package example.com.listviewapplication.Activity;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import example.com.listviewapplication.Adapter.RecyclerViewCustomAdapter;
import example.com.listviewapplication.Model.RecylerListModel;
import example.com.listviewapplication.R;

public class MainActivity extends AppCompatActivity {

    private static Context context;
    private static RecyclerView recyclerView;
    private static RecyclerViewCustomAdapter recyclerViewCustomAdapter;
    private static List<RecylerListModel> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        context = this;

        recyclerView = findViewById(R.id.listRecyclerList);
        list = new ArrayList<>();

        recyclerViewCustomAdapter = new RecyclerViewCustomAdapter(context, list);

        setDataToRecycler();
        /*RecyclerView.LayoutManager mLayoutManager = new GridLayoutManager(this, 2);
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());*/
        recyclerView.setAdapter(recyclerViewCustomAdapter);


    }

    private void setDataToRecycler() {

        RecylerListModel recylerListModel = new RecylerListModel();
        recylerListModel.setName("Amit");
        recylerListModel.setAge("25");
        recylerListModel.setDate("18-05-2018");
        recylerListModel.setImage(R.drawable.a);

        list.add(recylerListModel);

        recylerListModel = new RecylerListModel();
        recylerListModel.setName("Kiran");
        recylerListModel.setAge("26");
        recylerListModel.setDate("20-05-2018");
        recylerListModel.setImage(R.drawable.c);

        list.add(recylerListModel);

        recylerListModel = new RecylerListModel();
        recylerListModel.setName("Nilesh");
        recylerListModel.setAge("25");
        recylerListModel.setDate("28-05-2018");
        recylerListModel.setImage(R.drawable.b);

        list.add(recylerListModel);


        recylerListModel = new RecylerListModel();
        recylerListModel.setName("Anjali");
        recylerListModel.setAge("25");
        recylerListModel.setDate("18-03-2018");
        recylerListModel.setImage(R.drawable.e);

        list.add(recylerListModel);

        recyclerViewCustomAdapter.notifyDataSetChanged();
    }
}
