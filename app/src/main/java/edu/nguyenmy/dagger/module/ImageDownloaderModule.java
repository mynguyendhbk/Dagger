package edu.nguyenmy.dagger.module;

import android.content.Context;

import dagger.Module;
import dagger.Provides;
import edu.nguyenmy.dagger.model.ImageDownloader;

/**
 * Created by DELL on 10/31/2017.
 */
@Module
public class ImageDownloaderModule {
    private Context context;

    public ImageDownloaderModule(Context context) {
        this.context = context;
    }
    @Provides
    Context provideContext(){
        return this.context;
    }
    @Provides
    ImageDownloader providerImageDownloader(Context context){
        return new ImageDownloader(context);
    }
}
