package com.alkhalildevelopers.multiplerecyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.os.Bundle;

import com.alkhalildevelopers.multiplerecyclerview.MainRecyclerViewFiles.MainRecyclerViewAdapter;
import com.alkhalildevelopers.multiplerecyclerview.MainRecyclerViewFiles.MainRecyclerViewModel;
import java.util.ArrayList;
import java.util.List;
import static com.alkhalildevelopers.multiplerecyclerview.MainRecyclerViewFiles.MainRecyclerViewModel.AdTextLayoutType;
import static com.alkhalildevelopers.multiplerecyclerview.MainRecyclerViewFiles.MainRecyclerViewModel.ImageLayoutType;
public class MainActivity extends AppCompatActivity {
    RecyclerView mainRecyclerView;
    List<MainRecyclerViewModel>mainRecyclerViewModelList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mainRecyclerView = findViewById(R.id.MainRecyclerView);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        mainRecyclerView.setLayoutManager(layoutManager);

        mainRecyclerViewModelList = new ArrayList<>();

        mainRecyclerViewModelList.add(new MainRecyclerViewModel(ImageLayoutType,R.drawable.image));
        mainRecyclerViewModelList.add(new MainRecyclerViewModel(AdTextLayoutType,"Ad Views"));
        mainRecyclerViewModelList.add(new MainRecyclerViewModel(ImageLayoutType,R.drawable.image));
        mainRecyclerViewModelList.add(new MainRecyclerViewModel(AdTextLayoutType,"Ad Views"));
        mainRecyclerViewModelList.add(new MainRecyclerViewModel(ImageLayoutType,R.drawable.image));
        mainRecyclerViewModelList.add(new MainRecyclerViewModel(AdTextLayoutType,"Ad Views"));


        MainRecyclerViewAdapter mainRecyclerViewAdapter = new MainRecyclerViewAdapter(mainRecyclerViewModelList);
        mainRecyclerView.setAdapter(mainRecyclerViewAdapter);
        mainRecyclerViewAdapter.notifyDataSetChanged();


    }
}
