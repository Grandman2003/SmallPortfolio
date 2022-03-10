package com.example.smallportfolio;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.smallportfolio.databinding.FragmentTitleBinding;

public class FragmentTitle extends Fragment {
    FragmentTitleBinding binding;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
       binding = FragmentTitleBinding.inflate(inflater);
        //View view = inflater.inflate(R.layout.fragment_title,container,false);
        return binding.getRoot();
    }
}
