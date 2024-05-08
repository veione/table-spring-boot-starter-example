package com.think.table.repository;

import com.think.table.entity.CfgItem;
import com.think.table.annotation.TableRepository;

@TableRepository
public interface CfgItemRepository extends CfgRepository<CfgItem, Integer> {
}
