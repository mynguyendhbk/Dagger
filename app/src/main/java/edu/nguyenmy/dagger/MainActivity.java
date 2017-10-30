package edu.nguyenmy.dagger;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import javax.inject.Inject;

import dagger.Component;
import dagger.internal.DaggerCollections;
import edu.nguyenmy.dagger.component.DaggerImageDownloaderComponent;
import edu.nguyenmy.dagger.component.ImageDownloaderComponent;
import edu.nguyenmy.dagger.model.ImageDownloader;
import edu.nguyenmy.dagger.module.ImageDownloaderModule;

public class MainActivity extends AppCompatActivity {
    @Inject
    ImageDownloader downloader;
    private ImageDownloaderComponent mComponent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.mComponent = DaggerImageDownloaderComponent.builder().imageDownloaderModule(new ImageDownloaderModule(this)).build();
        mComponent.inject(this);
        setContentView(R.layout.activity_main);

        ImageView imageView = (ImageView)findViewById(R.id.image_download);
        downloader.toImageView(imageView, "https://dantricdn.com/thumb_w/640/2017/ca-chua-1489804254676.jpg");
    }
}
