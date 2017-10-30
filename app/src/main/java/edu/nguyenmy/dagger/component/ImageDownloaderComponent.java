package edu.nguyenmy.dagger.component;

import javax.inject.Singleton;

import dagger.Component;
import edu.nguyenmy.dagger.MainActivity;
import edu.nguyenmy.dagger.module.ImageDownloaderModule;

/**
 * Created by DELL on 10/31/2017.
 */
@Singleton
@Component (modules = ImageDownloaderModule.class)
public interface ImageDownloaderComponent {
    void inject(MainActivity mainActivity);
}
