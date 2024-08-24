package com.think.table.entity;

import com.think.table.annotation.CfgTable;
import lombok.AllArgsConstructor;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

@AllArgsConstructor
@CfgTable(value = "物品表", id = "id")
public class CfgItem {
    public final int id;
    public final String name;
    public final int type;
    public final List<Integer> prob;
    public final String[] params;
    public final float sellPrice;
    public final Map<Integer, Integer> condition;
    public final boolean enable;

    @Override
    public String toString() {
        return "CfgItem3{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", type=" + type +
                ", prob=" + prob +
                ", params=" + Arrays.toString(params) +
                ", sellPrice=" + sellPrice +
                ", condition=" + condition +
                ", enable=" + enable +
                '}';
    }
}
