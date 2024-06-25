package com.example.petpair.ui.dashboard;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.petpair.MyAdapter;
import com.example.petpair.Pet;
import com.example.petpair.databinding.FragmentDashboardBinding;

import java.util.ArrayList;

public class DashboardFragment extends Fragment {

    private RecyclerView recyclerView;
    private MyAdapter myAdapter;
    private ArrayList<Pet> petList;

    private FragmentDashboardBinding binding;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        binding = FragmentDashboardBinding.inflate(inflater, container, false);

        recyclerView = binding.petList;

        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        petList = new ArrayList<>();
        petList.add(new Pet("Duke", "Cachorro"));
        petList.add(new Pet("Gatuno", "Gato"));
        petList.add(new Pet("Destruidor de Mundos", "Peixe"));

        myAdapter = new MyAdapter(getContext(), petList);
        recyclerView.setAdapter(myAdapter);

        return binding.getRoot();
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}