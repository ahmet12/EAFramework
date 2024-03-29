package com.ahmetkilic.eaframework.ea_recycler.objects;


import com.ahmetkilic.eaframework.ea_recycler.interfaces.EATitleInterface;
import com.ahmetkilic.eaframework.ea_recycler.interfaces.EATypeInterface;

/**
 * Created by Ahmet Kılıç on 18.12.2018.
 * Copyright © 2018, Ahmet Kılıç. All rights reserved.
 *
 * For the full copyright and license information,
 * please view the LICENSE file that was distributed with this source code.
 */
public class ProgressObject implements EATypeInterface ,EATitleInterface {
    private int progressViewLayoutId;
    private int type;

    public ProgressObject(int progressViewLayoutId,int type) {
        this.progressViewLayoutId = progressViewLayoutId;
        this.type = type;
    }

    public int getProgressViewLayoutId() {
        return progressViewLayoutId;
    }

    @Override
    public int getRecyclerType() {
        return type;
    }
}
