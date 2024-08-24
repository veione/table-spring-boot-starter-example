package com.think.table.repository;

import com.think.table.annotation.TableRepository;
import com.think.table.entity.CfgTask;

@TableRepository
public interface CfgTaskRepository extends CfgRepository<CfgTask, Integer> {
}
