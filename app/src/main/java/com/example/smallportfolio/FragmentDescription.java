package com.example.smallportfolio;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.navigation.Navigation;

import com.example.smallportfolio.databinding.FragmentDescriptionBinding;

public class FragmentDescription extends Fragment {
    FragmentDescriptionBinding binding;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = FragmentDescriptionBinding.inflate(inflater);
        // View view = inflater.inflate(R.layout.fragment_description,container,false);
        binding.userName.setText(getString(R.string.user_name));
        binding.userDescription.setText(R.string.user_descr);
        binding.button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Navigation.findNavController(view).navigate(R.id.action_fragmentDescription_to_fragmentSkills);
               // FragmentManager manager = getParentFragmentManager();
               // FragmentTransaction transaction = manager.beginTransaction();
               // transaction.replace(R.id.fragment_description,new FragmentSkills(),".FragmentDescription").commit();
            }
        });
        return binding.getRoot();
    }
}
