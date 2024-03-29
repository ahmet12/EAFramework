package com.ahmetkilic.eaframework.ea_recycler.interfaces;

/**
 * Created by Ahmet Kılıç on 18.12.2018.
 * Copyright © 2018, Ahmet Kılıç. All rights reserved.
 *
 * For the full copyright and license information,
 * please view the LICENSE file that was distributed with this source code.
 */
public interface EATypeInterface {
    /**
     * @return Return the view type value same with the object class's view type value to match the holder and obj
     */
    int getRecyclerType();
}
