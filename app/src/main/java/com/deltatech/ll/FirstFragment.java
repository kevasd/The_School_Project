package com.deltatech.ll;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import com.deltatech.ll.databinding.FragmentFirstBinding;
import com.google.android.material.textfield.TextInputEditText;

public class FirstFragment extends Fragment {

    private FragmentFirstBinding binding;

    static int Instance;

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {
        FirstFragment.Instance = 1;
        binding = FragmentFirstBinding.inflate(inflater, container, false);
        return binding.getRoot();

    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        binding.buttonFirst.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(FirstFragment.this)
                        .navigate(R.id.action_FirstFragment_to_SecondFragment);
            }
        });
    }

    @Override
    public void onDestroyView() {
        FirstFragment.Instance=0;
        super.onDestroyView();
        binding = null;
    }

    public void openActivity(){

    }

    public void Button1_click(){
        TextInputEditText username,password;
        username = this.binding.UsernameField;
        password= this.binding.PasswordField;
        Button login_Button = this.getView().findViewById(R.id.button_first);
        Bundle bundle = new Bundle(4);
        bundle.putString("Username",username.getText().toString());
        bundle.putString("Password",password.getText().toString());
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.putExtras(bundle);
        ActivityTwo activityTwo = new ActivityTwo();
        activityTwo.startActivity(intent,bundle);
        this.onDestroy();
    }

}