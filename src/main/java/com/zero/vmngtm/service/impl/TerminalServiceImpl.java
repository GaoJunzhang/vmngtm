package com.zero.vmngtm.service.impl;

import com.zero.vmngtm.mapper.TerminalMapper;
import com.zero.vmngtm.model.Terminal;
import com.zero.vmngtm.service.TerminalService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by user on 2018/10/19.
 */
@Service("terminalService")
public class TerminalServiceImpl extends BaseService<Terminal> implements TerminalService {

    @Resource
    private TerminalMapper terminalMapper;

    public Terminal terminalByName(String name) {
        return terminalMapper.terminalByName(name);
    }

    public int insertTerminal(Terminal terminal) {
        return terminalMapper.insertTerminal(terminal);
    }
}
