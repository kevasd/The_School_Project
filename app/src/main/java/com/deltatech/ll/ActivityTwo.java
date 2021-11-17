package com.deltatech.ll;

import android.media.MediaCas;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.deltatech.ll.databinding.ActivityMainBinding;
import com.deltatech.ll.databinding.FragmentFirstBinding;
import com.deltatech.ll.databinding.GameFragmentBinding;

import javax.annotation.Nullable;

public class ActivityTwo extends AppCompatActivity{

    GameFragmentBinding binding;
    private AppBarConfiguration appBarConfiguration;

    public void onCreate(@Nullable Bundle bundle){
        super.onCreate(bundle);
        binding = GameFragmentBinding.inflate(this.getLayoutInflater());
        setContentView(binding.getRoot());

        setSupportActionBar(binding.toolbar);
        VideoView videoView = binding.videoView;
        videoView.setMediaController(binding.mediaController);
        MediaController mediaController = binding.mediaController;
        mediaController.setEnabled(true);
        mediaController.setAnchorView(videoView);
        mediaController.setPrevNextListeners();

    }

    public void onDestroyView() {
        FirstFragment.Instance=0;
    }

}
