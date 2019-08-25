package com.ahmetkilic.eaframework.ea_file_picker;

import android.os.Bundle;

import com.ahmetkilic.eaframework.R;
import com.ahmetkilic.eaframework.ea_file_picker.objects.medias.ImageFile;
import com.ahmetkilic.eaframework.ea_file_picker.holders.EADoubleMediaHolder;
import com.ahmetkilic.eaframework.ea_file_picker.objects.DoubleMedia;
import com.ahmetkilic.eaframework.ea_recycler.interfaces.EARecyclerClickListener;
import com.ahmetkilic.eaframework.ea_utilities.tools.ObjectUtils;

import java.util.ArrayList;
import java.util.List;

public class EAPickerImageActivity extends EAPickerBaseActivity implements EARecyclerClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_picker_common);
        initToolBar();
        initRecyclerView();
        updateCount();

        recyclerHelper.addNewHolder(EADoubleMediaHolder.class);

        if (directory == null || !ObjectUtils.arrayIsNotEmpty(directory.getFiles())) {
            finishCancelled();
        } else
            takePermissions();
    }

    @Override
    public void loadItems() {
        List<DoubleMedia> doubleList = new ArrayList<>();
        for (Object item : directory.getFiles()) {
            if (item instanceof ImageFile) {
                if (doubleList.size() == 0)
                    doubleList.add(new DoubleMedia());

                int lastItemPosition = doubleList.size() - 1;

                if (doubleList.get(lastItemPosition).getFirstItem() == null) {
                    doubleList.get(lastItemPosition).setFirstItem((ImageFile) item);
                } else if (doubleList.get(lastItemPosition).getSecondItem() == null) {
                    doubleList.get(lastItemPosition).setSecondItem((ImageFile) item);
                } else {
                    doubleList.add(new DoubleMedia((ImageFile) item));
                }
            }
        }

        recyclerHelper.insertAll(doubleList, false);
        hideProgress();
    }
}
