package com.ahmetkilic.eaframework.ea_networking.download;

/**
 * Created by Ahmet Kılıç on 26.12.2018.
 * Copyright © 2018, Ahmet Kılıç. All rights reserved.
 * <p>
 * For the full copyright and license information,
 * please view the LICENSE file that was distributed with this source code.
 */
public interface EADownloadListener {
    void onDownloadProgress(float progress);
    void onDownloadComplete(String filePath);
    void onDownloadError(String error);
}
