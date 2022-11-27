package com.example.weatherapp.db;

import org.litepal.annotation.Column;
import org.litepal.crud.LitePalSupport;

import java.security.PrivateKey;

public class Province extends LitePalSupport {
    @Column(unique = true)
    private Integer id;
    @Column(index = true)
    private String provinceName;
    @Column(index = true)
    private int provinceCode;

    public Province() {
        super();
    }

    public Province(int provinceCode, String provinceName) {
        this.provinceName = provinceName;
        this.provinceCode = provinceCode;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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
