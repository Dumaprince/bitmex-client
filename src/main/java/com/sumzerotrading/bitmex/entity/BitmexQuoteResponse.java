/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sumzerotrading.bitmex.entity;

import com.sumzerotrading.bitmex.entity.BitmexQuoteData;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.Arrays;
import java.util.Objects;

/**
 *
 * @author RobTerpilowski
 *
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class BitmexQuoteResponse {

    protected BitmexQuoteData[] data;
    protected String table;

    public BitmexQuoteData[] getData() {
        return data;
    }

    public void setData(BitmexQuoteData[] data) {
        this.data = data;
    }

    public String getTable() {
        return table;
    }

    public void setTable(String table) {
        this.table = table;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 17 * hash + Arrays.deepHashCode(this.data);
        hash = 17 * hash + Objects.hashCode(this.table);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final BitmexQuoteResponse other = (BitmexQuoteResponse) obj;
        if (!Objects.equals(this.table, other.table)) {
            return false;
        }
        if (!Arrays.deepEquals(this.data, other.data)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        String quoteDataString = data.toString();
        if (data.length > 0) {
            quoteDataString = data[0].toString();
        }
        return "BitmexQuoteResponse{" + "quoteData=" + quoteDataString + ", table=" + table + '}';
    }

}
