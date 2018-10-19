package com.zero.vmngtm.mapper;

import com.zero.vmngtm.model.Terminal;
import com.zero.vmngtm.util.MyMapper;
import org.apache.ibatis.annotations.Param;

public interface TerminalMapper extends MyMapper<Terminal> {
    public Terminal terminalByName(@Param("name") String name);

    public int insertTerminal(Terminal terminal);
}