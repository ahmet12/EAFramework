package com.ahmetkilic.eaframework.ea_utilities.interfaces;

import java.util.Date;
/**
 * Created by Ahmet Kılıç on 18.12.2018.
 * Copyright © 2018, Ahmet Kılıç. All rights reserved.
 *
 * For the full copyright and license information,
 * please view the LICENSE file that was distributed with this source code.
 */
public interface FileClickListener {
    void onFileClicked(String filePath, Date dateModified);
}
