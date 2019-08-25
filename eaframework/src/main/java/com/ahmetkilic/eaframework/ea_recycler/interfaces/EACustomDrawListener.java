package com.ahmetkilic.eaframework.ea_recycler.interfaces;

import android.graphics.Canvas;
import android.support.annotation.NonNull;

import com.ahmetkilic.eaframework.ea_recycler.EARecyclerView;
import com.ahmetkilic.eaframework.ea_recycler.holders.BaseHolder;

/**
 * Created by Ahmet Kılıç on 31.01.2019.
 * Copyright © 2019, Ahmet Kılıç. All rights reserved.
 * <p>
 * For the full copyright and license information,
 * please view the LICENSE file that was distributed with this source code.
 */
public interface EACustomDrawListener {

    void onRecyclerItemDraw(EACustomDrawSuperListener superCallback, @NonNull Canvas c, @NonNull EARecyclerView recyclerView, @NonNull BaseHolder viewHolder, float dX, float dY, int actionState, boolean isCurrentlyActive);
}
