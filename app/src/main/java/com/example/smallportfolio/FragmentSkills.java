package com.example.smallportfolio;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.SimpleAdapter;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.navigation.NavHost;
import androidx.navigation.NavHostController;
import androidx.navigation.Navigation;

import com.example.smallportfolio.databinding.FragmentSkillsBinding;

import java.util.ArrayList;
import java.util.HashMap;

public class FragmentSkills extends Fragment {
    FragmentSkillsBinding binding;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = FragmentSkillsBinding.inflate(inflater);
        binding.backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Navigation.findNavController(view).navigate(R.id.action_fragmentSkills_to_fragmentDescription);
               // FragmentManager manager = getParentFragmentManager();
               // FragmentTransaction transaction = manager.beginTransaction();
              //  transaction.replace(R.id.fragment_description,new FragmentDescription(),".FragmentDescription").commit();
            }
        });
        ArrayList<HashMap<String,String>> skills = new ArrayList<>();
        HashMap<String,String> first = new HashMap<>();
        HashMap<String,String> second = new HashMap<>();
        HashMap<String,String> third = new HashMap<>();
        first.put("SkillName","Programming");
        first.put("SkillLevel","Starter");
        second.put("SkillName","3D Modeling");
        second.put("SkillLevel","Intermediate");
        third.put("SkillName","Time Spending");
        third.put("SkillLevel","Advanced");
        skills.add(first);
        skills.add(second);
        skills.add(third);
        skills.add(second);
        skills.add(first);
        skills.add(third);
        String[] fields = new String[]{"SkillName", "SkillLevel"};
        int[] ids = new int[]{android.R.id.text1, android.R.id.text2};
        binding.listview.setAdapter(new SimpleAdapter(getContext(),skills, android.R.layout.simple_list_item_2,fields,ids));
        return binding.getRoot();
    }
}
