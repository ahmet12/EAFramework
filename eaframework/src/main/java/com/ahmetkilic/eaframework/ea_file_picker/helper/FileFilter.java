package com.ahmetkilic.eaframework.ea_file_picker.helper;

import android.support.v4.app.FragmentActivity;

import com.ahmetkilic.eaframework.ea_file_picker.callback.FileLoaderCallbacks;
import com.ahmetkilic.eaframework.ea_file_picker.interfaces.FilterResultCallback;
import com.ahmetkilic.eaframework.ea_file_picker.objects.medias.AudioFile;
import com.ahmetkilic.eaframework.ea_file_picker.objects.medias.ImageFile;
import com.ahmetkilic.eaframework.ea_file_picker.objects.medias.NormalFile;
import com.ahmetkilic.eaframework.ea_file_picker.objects.medias.VideoFile;

import static com.ahmetkilic.eaframework.ea_file_picker.callback.FileLoaderCallbacks.TYPE_AUDIO;
import static com.ahmetkilic.eaframework.ea_file_picker.callback.FileLoaderCallbacks.TYPE_FILE;
import static com.ahmetkilic.eaframework.ea_file_picker.callback.FileLoaderCallbacks.TYPE_IMAGE;
import static com.ahmetkilic.eaframework.ea_file_picker.callback.FileLoaderCallbacks.TYPE_VIDEO;

/**
 * Created by Vincent Woo
 * Date: 2016/10/11
 * Time: 10:19
 */

public class FileFilter {
    public static void getImages(FragmentActivity activity, FilterResultCallback<ImageFile> callback){
        activity.getSupportLoaderManager().initLoader(0, null,
                new FileLoaderCallbacks(activity, callback, TYPE_IMAGE));
    }

    public static void getVideos(FragmentActivity activity, FilterResultCallback<VideoFile> callback){
        activity.getSupportLoaderManager().initLoader(1, null,
                new FileLoaderCallbacks(activity, callback, TYPE_VIDEO));
    }

    public static void getAudios(FragmentActivity activity, FilterResultCallback<AudioFile> callback){
        activity.getSupportLoaderManager().initLoader(2, null,
                new FileLoaderCallbacks(activity, callback, TYPE_AUDIO));
    }

    public static void getFiles(FragmentActivity activity,
                                FilterResultCallback<NormalFile> callback, String[] suffix){
        activity.getSupportLoaderManager().initLoader(3, null,
                new FileLoaderCallbacks(activity, callback, TYPE_FILE, suffix));
    }
}
