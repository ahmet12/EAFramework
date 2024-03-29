package com.ahmetkilic.eaframework.ea_file_picker.objects;

import com.ahmetkilic.eaframework.ea_file_picker.enums.EAPickerCodes;
import com.ahmetkilic.eaframework.ea_recycler.interfaces.EATypeInterface;

import java.io.Serializable;

/**
 * Created by Vincent Woo
 * Date: 2016/10/10
 * Time: 17:32
 */

public class BaseFile implements Serializable, EATypeInterface {
    private long id;
    private String name;
    private String path;
    private long size;   //byte
    private String bucketId;  //Directory ID
    private String bucketName;  //Directory Name
    private long date;  //Added Date
    private boolean isSelected;

    @Override
    public boolean equals(Object o) {
        if (o instanceof BaseFile){
            return getPath().equals(((BaseFile) o).getPath());
        }else
            return false;
    }

    @Override
    public int hashCode() {
        return path.hashCode();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public long getSize() {
        return size;
    }

    public void setSize(long size) {
        this.size = size;
    }

    public String getBucketId() {
        return bucketId;
    }

    public void setBucketId(String bucketId) {
        this.bucketId = bucketId;
    }

    public String getBucketName() {
        return bucketName;
    }

    public void setBucketName(String bucketName) {
        this.bucketName = bucketName;
    }

    public long getDate() {
        return date;
    }

    public void setDate(long date) {
        this.date = date;
    }

    public boolean isSelected() {
        return isSelected;
    }

    public void setSelected(boolean selected) {
        isSelected = selected;
    }

    @Override
    public int getRecyclerType() {
        return EAPickerCodes.RECYCLER_TYPE_FILE;
    }
}
