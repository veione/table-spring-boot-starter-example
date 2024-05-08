package com.think.table.controller;

import com.think.table.entity.CfgItem;
import com.think.table.entity.CfgSkill;
import com.think.table.entity.CfgTask;
import com.think.table.repository.CfgItemRepository;
import com.think.table.repository.CfgSkillRepository;
import com.think.table.repository.CfgTaskRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/table")
public class TableController {
    private final CfgItemRepository cfgItemRepository;
    private final CfgSkillRepository cfgSkillRepository;
    private final CfgTaskRepository cfgTaskRepository;

    public TableController(CfgItemRepository cfgItemRepository, CfgSkillRepository cfgSkillRepository, CfgTaskRepository cfgTaskRepository) {
        this.cfgItemRepository = cfgItemRepository;
        this.cfgSkillRepository = cfgSkillRepository;
        this.cfgTaskRepository = cfgTaskRepository;
    }

    @GetMapping("/item")
    public List<CfgItem> items() {
        return cfgItemRepository.findAll();
    }

    @GetMapping("/item/{itemId}")
    public CfgItem item(@PathVariable int itemId) {
        return cfgItemRepository.findById(itemId);
    }

    @GetMapping("/skill")
    public List<CfgSkill> skills() {
        return cfgSkillRepository.findAll();
    }

    @GetMapping("/skill/{skillId}")
    public CfgSkill skill(@PathVariable int skillId) {
        return cfgSkillRepository.findById(skillId);
    }

    @GetMapping("/task")
    public List<CfgTask> tasks() {
        return cfgTaskRepository.findAll();
    }

    @GetMapping("/task/{taskId}")
    public CfgTask task(@PathVariable int taskId) {
        return cfgTaskRepository.findById(taskId);
    }
}
