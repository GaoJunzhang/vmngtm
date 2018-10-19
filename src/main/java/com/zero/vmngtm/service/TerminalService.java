package com.zero.vmngtm.service;

import com.zero.vmngtm.model.Terminal;

/**
 * Created by user on 2018/10/19.
 */
public interface TerminalService extends IService<Terminal> {
    public Terminal terminalByName(String name);

    public int insertTerminal(Terminal terminal);
}
