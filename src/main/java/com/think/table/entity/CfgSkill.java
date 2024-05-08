package com.think.table.entity;

import com.think.table.annotation.CfgTable;

@CfgTable("skill")
public record CfgSkill(int id, String name, int level, int star) {
}
