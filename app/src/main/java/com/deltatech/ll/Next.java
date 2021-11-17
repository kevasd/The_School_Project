package com.deltatech.ll;

import android.net.Uri;
import android.view.View;
import android.widget.MediaController;
import android.widget.VideoView;

public class Next implements View.OnClickListener {

    public void onClick(MediaController context){
        ((VideoView)context.getParent()).pause();
        ((VideoView)context.getParent()).stopPlayback();
        ((VideoView)context.getParent()).setVideoURI(new Uri.fromFile());
    }

    @Override
    public void onClick(View v) {
        ((VideoView)v.getParent()).pause();
        ((VideoView)v.getParent()).stopPlayback();
        ((VideoView)v.getParent()).setVideoURI(new Uri.fromFile());
    }
}
