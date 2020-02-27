package com.liao.controller.basicinfo.factory;

import com.liao.controller.BaseController;
import com.liao.model.Factory;
import com.liao.service.FactoryService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class FactoryController extends BaseController {
    //列表
    @Resource
    FactoryService factoryService;

    //列表
    @RequestMapping("/basicinfo/factory/list.action")
    public String list(Model model){
        List<Factory> dataList=factoryService.find(null);
        model.addAttribute("dataList",dataList);
        return "basicinfo/factory/jFactoryList.jsp";
    }
    //转向新增页面
    @RequestMapping("/basicinfo/factory/tocreate.action")
    public String tocreate(){
        return "basicinfo/factory/jFactoryCreate.jsp";
    }

    @RequestMapping("/basicinfo/factory/insert.action")
    public String insert(Factory factory){
        factoryService.insert(factory);

        return "redirect:/basicinfo/factory/list.action";
    }

    //转向修改页面
    @RequestMapping("/basicinfo/factory/toupdate.action")
    public String toupdate(String id,Model model){
        factoryService.get(id);
        Factory obj = factoryService.get(id);
        model.addAttribute("obj",obj);
        return "basicinfo/factory/jFactoryUpdate.jsp";

    }

    //修改保存
    @RequestMapping("/basicinfo/factory/update.action")
    public String update(Factory factory){
        factoryService.update(factory);

        return "redirect:/basicinfo/factory/list.action";
    }


    @RequestMapping("/basicinfo/factory/deleteById.action")
    public String deleteById(String id){
        factoryService.deleteById(id);

        return "redirect:/basicinfo/factory/list.action";
    }

    @RequestMapping("/basicinfo/factory/delete.action")
    public String insert(@RequestParam("id")String[] ids){
        factoryService.delete(ids);

        return "redirect:/basicinfo/factory/list.action";
    }

    //查看
    @RequestMapping("/basicinfo/factory/toview.action")
    public String toview(String id,Model model){
        Factory obj =factoryService.get(id);
        model.addAttribute("obj",obj);
        return "/basicinfo/factory/jFactoryView.jsp";
    }

    //批量启用
    @RequestMapping("/basicinfo/factory/start.action")
    public String Start(@RequestParam("id")String[] ids){
        factoryService.start(ids);
        return "redirect:/basicinfo/factory/list.action";
    }

    //批量停用
    @RequestMapping("/basicinfo/factory/stop.action")
    public String Stop(@RequestParam("id")String[] ids){
        factoryService.stop(ids);
        return "redirect:/basicinfo/factory/list.action";
    }
}
