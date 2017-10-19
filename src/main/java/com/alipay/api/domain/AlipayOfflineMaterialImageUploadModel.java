package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.FileItem;

/**
 * Created by jason.guan on 2017/10/18
 */
public class AlipayOfflineMaterialImageUploadModel extends AlipayObject {
    private static final long serialVersionUID = 54244377654765269L;
    private FileItem fileItem;

    public FileItem getFileItem() {
        return fileItem;
    }

    public void setFileItem(FileItem fileItem) {
        this.fileItem = fileItem;
    }
}
