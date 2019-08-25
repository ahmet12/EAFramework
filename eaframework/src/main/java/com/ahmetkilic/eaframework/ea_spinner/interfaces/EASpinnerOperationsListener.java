package com.ahmetkilic.eaframework.ea_spinner.interfaces;


import com.ahmetkilic.eaframework.ea_networking.EARequestBuilder;
/**
 * Created by Ahmet Kılıç on 18.12.2018.
 * Copyright © 2018, Ahmet Kılıç. All rights reserved.
 *
 * For the full copyright and license information,
 * please view the LICENSE file that was distributed with this source code.
 */


public interface EASpinnerOperationsListener {

    /**
     * EARequestBuilder is required when online spinners is used
     *
     */
    EARequestBuilder getRequestBuilder();

    /**
     * Handle server errors on parent as you wish
     *
     * @param error Error object from EARequest
     */
    void handleServerError(Object error);
}
