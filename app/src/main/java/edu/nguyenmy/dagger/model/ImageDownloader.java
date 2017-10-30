package edu.nguyenmy.dagger.model;

import android.content.Context;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

/**
 * Created by DELL on 10/31/2017.
 */

public class ImageDownloader {
    private Context context;

    public ImageDownloader(Context context) {
        this.context = context;
    }
    public void toImageView(ImageView imageView, String url){
        Glide.with(context).load(url).into(imageView);
    }
}
