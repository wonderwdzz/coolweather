package com.coolweather.android.db;

import org.litepal.crud.DataSupport;

/**
 * Created by 45861 on 2020/2/19.
 */
//LitePal的每个实体类必须继承自DataSupport类
public class Province extends DataSupport {
    private int id;
    private String provinceName;        //省名字
    private int provinceCode;           //省代号

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public int getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(int provinceCode) {
        this.provinceCode = provinceCode;
    }
}
