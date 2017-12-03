package com.example.tt.coolweather;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import org.litepal.crud.DataSupport;

public class MainActivity extends AppCompatActivity {

    public class Province extends DataSupport{
        private int id;
        private  String provinceName;
        private int provinceCode;
        public int getId(){
            return id;
        }
        public void setId(int id){
            this.id = id;
        }
        public String getProvinceName(){
            return provinceName;
        }
        public void setProvinceName(String provinceName){
            this.provinceName = provinceName;
        }
        public int getProvinceCode(){
            return provinceCode;
        }
        private void setProvinceCode
    }
}
