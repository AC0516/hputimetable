package com.zhuangfei.hputimetable.model;

import android.support.annotation.NonNull;

import com.zhuangfei.hputimetable.api.model.AdapterInfo;
import com.zhuangfei.hputimetable.api.model.School;
import com.zhuangfei.hputimetable.api.model.StationModel;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Liu ZhuangFei on 2019/2/8.
 */
public class SearchResultModel implements Comparable<SearchResultModel>{
    public static final int TYPE_STATION=1;
    public static final int TYPE_STATION_MORE=0;
    public static final int TYPE_COMMON=3;//通用解析算法
    public static final int TYPE_COMMON_UPLOAD=2;//通用解析算法
    public static final int TYPE_XIQUER=4;

    public static final int TYPE_SCHOOL=5;
    private int type=TYPE_SCHOOL;

    private Object object;

    public void setType(int type) {
        this.type = type;
    }

    public int getType() {
        return type;
    }

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }

    @Override
    public int compareTo(@NonNull SearchResultModel searchResultModel) {
        if(getType()<searchResultModel.getType()) return -1;
        else if(getType()>searchResultModel.getType()) return 1;
        else return 0;
    }
}
