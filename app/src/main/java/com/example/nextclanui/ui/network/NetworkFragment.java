package com.example.nextclanui.ui.network;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


import com.example.nextclanui.MyAdapter;
import com.example.nextclanui.R;
import com.example.nextclanui.UserData;
import com.example.nextclanui.databinding.FragmentNetworkBinding;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.Objects;

public class NetworkFragment extends Fragment {
    private FragmentNetworkBinding binding;

    RecyclerView recyclerView;
    ArrayList<UserData> arrayList;

    MyAdapter myAdapter;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        binding = FragmentNetworkBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        recyclerView = binding.view1;

        arrayList = new ArrayList<>();

        arrayList.add(new UserData(R.drawable.profile_image,"Dhruv","Bangalore | Software Engineer","Within 300-400 m","Hi Community! I am open to new connections!",getResources().getString(R.string.infoText)));
        arrayList.add(new UserData(R.drawable.profile_image,"Hritik","New Delhi | UI/UX Designer","Within 400-500 km","Hi Community! I am open to new connections!",getResources().getString(R.string.infoText)));
        arrayList.add(new UserData(R.drawable.profile_image,"Michael","Tamil Nadu | Charted Accountant","Within 200-400 km","Hi Community! I am open to new connections!",getResources().getString(R.string.infoText)));
        arrayList.add(new UserData(R.drawable.profile_image,"Harshit","Bareilly | Software Engineer","Within 300-400 km","Hi Community! I am open to new connections!",getResources().getString(R.string.infoText)));
        arrayList.add(new UserData(R.drawable.profile_image,"Shreya","Bareilly | Software Engineer","Within 300-400 km","Hi Community! I am open to new connections!",getResources().getString(R.string.infoText)));
        arrayList.add(new UserData(R.drawable.profile_image,"Jack","USA | Software Engineer","Within 2000-3000 km","Hi Community! I am open to new connections!",getResources().getString(R.string.infoText)));


        myAdapter= new MyAdapter(arrayList);

        LinearLayoutManager layoutManager = new LinearLayoutManager(requireActivity().getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);

        recyclerView.setAdapter(myAdapter);

        return root;
    }
}