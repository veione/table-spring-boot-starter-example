package com.think.table.repository;

import com.think.table.annotation.TableRepository;
import com.think.table.entity.CfgItem;

@TableRepository
public interface CfgItemRepository extends CfgRepository<CfgItem, Integer> {
}
