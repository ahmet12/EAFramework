package com.ahmetkilic.eaframework.ea_file_picker;

import android.os.Bundle;

import com.ahmetkilic.eaframework.R;
import com.ahmetkilic.eaframework.ea_file_picker.holders.EASingleRowHolder;
import com.ahmetkilic.eaframework.ea_utilities.tools.ObjectUtils;

public class EAPickerFileActivity extends EAPickerBaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_picker_common);
        initToolBar();
        initRecyclerView();
        updateCount();

        recyclerHelper.addNewHolder(EASingleRowHolder.class);

        if (directory == null || !ObjectUtils.arrayIsNotEmpty(directory.getFiles())) {
            finishCancelled();
        } else
            takePermissions();
    }

    @Override
    public void loadItems() {
        recyclerHelper.insertAll(directory.getFiles(),false);
        hideProgress();
    }
}
