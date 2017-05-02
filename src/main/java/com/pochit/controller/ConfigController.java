package com.pochit.controller;
import com.pochit.dao.Config;
import com.pochit.dao.ConfigDAO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * Created by emilianoalbiani on 4/26/17.
 */
@Controller
public class ConfigController {
    private ConfigDAO configDAO;

    public void setConfigDAO(ConfigDAO configDAO) {
        this.configDAO = configDAO;
    }

    @RequestMapping(value="/action/config/{name}", method = RequestMethod.GET)
    public @ResponseBody  Config getConfig(@PathVariable("name") String name) {
        return configDAO.getConfig(name);
    }

    @RequestMapping(value="/hello/{name}", method = RequestMethod.GET)
    public @ResponseBody
    String sayHello(@PathVariable("name") String name) {
        return "Hello " + name;
    }
    // ii
}
