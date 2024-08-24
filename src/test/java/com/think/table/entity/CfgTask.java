package com.think.table.entity;

import com.think.table.annotation.CfgTable;

@CfgTable("任务表")
public record CfgTask(
        int id,
        String name,
        int kind,
        int type
) {
}
