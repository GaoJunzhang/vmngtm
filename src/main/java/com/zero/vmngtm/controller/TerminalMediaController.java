package com.zero.vmngtm.controller;

import com.github.pagehelper.PageInfo;
import com.zero.vmngtm.model.Company;
import com.zero.vmngtm.model.Media;
import com.zero.vmngtm.model.TerminaMedia;
import com.zero.vmngtm.model.Terminal;
import com.zero.vmngtm.result.JsonResult;
import com.zero.vmngtm.result.ResultCode;
import com.zero.vmngtm.service.CompanyService;
import com.zero.vmngtm.service.MediaService;
import com.zero.vmngtm.service.TerminalMediaService;
import com.zero.vmngtm.service.TerminalService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.sql.Timestamp;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by user on 2018/10/19.
 */
@RestController
@RequestMapping("/terminalMedia")
public class TerminalMediaController {

    @Resource
    private CompanyService companyService;

    @Resource
    private TerminalService terminalService;

    @Resource
    private TerminalMediaService terminalMediaService;

    @Resource
    private MediaService mediaService;

    @RequestMapping(value = "/postTerminalMedia", method = RequestMethod.POST)
    public Object postTerminalMedia(@RequestParam(name = "companyId", required = true) int companyId, @RequestParam(name = "terminalNo", required = true) String terminalNo,@RequestParam(name = "mediaName",required = true) String mediaName) {
        JsonResult jsonResult = null;
        try {
            Terminal terminal = terminalService.terminalByName(terminalNo);
            if (terminal==null){
                terminal = new Terminal();
                terminal.setCreateTime(new Timestamp(System.currentTimeMillis()));
                terminal.setName(terminalNo);
                terminal.setIsDelete((short)1);
                terminalService.insertTerminal(terminal);
            }
            Media media = mediaService.findByName(mediaName.trim());
            if (media == null) {
                media = new Media();
                media.setName(mediaName.trim());
                media.setCreatetime(new Timestamp(System.currentTimeMillis()));
                mediaService.insertMedia(media);
            }
            TerminaMedia terminaMedia = new TerminaMedia();
            terminaMedia.setCid(companyId);
            terminaMedia.setMid(media.getId());
            terminaMedia.setTid(terminal.getId());
            terminaMedia.setPlayTime(new Timestamp(System.currentTimeMillis()));
            terminalMediaService.save(terminaMedia);
        } catch (Exception e) {
            e.printStackTrace();
             jsonResult = new JsonResult(ResultCode.EXCEPTION, "系统异常", e);
              return jsonResult;
        }
        jsonResult = new JsonResult(ResultCode.SUCCESS, "成功", null);
         return jsonResult;
    }

    @GetMapping(value = "companys")
    public Object companys(Company company, @RequestParam(required = false, defaultValue = "1") int page,
                           @RequestParam(required = false, defaultValue = "50") int size){
        Map<String, Object> map = new HashMap<>();
        PageInfo<Company> pageInfo = companyService.selectByPage(company, page, size);
        map.put("total", pageInfo.getTotal());
        map.put("pages", pageInfo.getPages());
        map.put("data", pageInfo.getList());
        return map;
    }
}
