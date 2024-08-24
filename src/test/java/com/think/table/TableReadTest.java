package com.think.table;

import com.think.table.entity.CfgItem;
import com.think.table.entity.CfgSkill;
import com.think.table.entity.CfgTask;
import com.think.table.repository.CfgItemRepository;
import com.think.table.repository.CfgSkillRepository;
import com.think.table.repository.CfgTaskRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TableReadTest {
    @Autowired
    private  CfgSkillRepository cfgSkillRepository;
    @Autowired
    private  CfgItemRepository cfgItemRepository;
    @Autowired
    private  CfgTaskRepository cfgTaskRepository;

    @Test
    public void testRead() throws Exception {
        List<CfgItem> items = cfgItemRepository.findAll();
        assertEquals(4, items.size());

        CfgItem item = cfgItemRepository.findById(10001);
        assertEquals(10001, item.id);

        List<CfgSkill> skills = cfgSkillRepository.findAll();
        assertEquals(3, skills.size());

        CfgSkill skill = cfgSkillRepository.findById(10001);
        assertEquals(10001, skill.id());

        List<CfgTask> tasks = cfgTaskRepository.findAll();
        assertEquals(3, tasks.size());

        CfgTask task = cfgTaskRepository.findById(1001);
        assertEquals(1001, task.id());
    }
}
