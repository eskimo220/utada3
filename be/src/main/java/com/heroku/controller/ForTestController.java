package com.heroku.controller;


import com.heroku.entity.Fortest;
import com.heroku.mapper.FortestMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.HashMap;

import java.util.Map;


@RestController
public class ForTestController {

    @Autowired
    private FortestMapper fortestMapper;

    @RequestMapping(value = "2312",method = RequestMethod.GET)
    public Map<String, Object> dosomething(HttpSession session)
    {
        session.setAttribute("gogogo", true);

        Fortest f = new Fortest();
        f.setFirst(new String[]{"2133","3212","5456","666","7777","888","99999"});
        f.setSecond("{\"sada\":213,\"eee\":123}");

        final int insert = fortestMapper.insert(f);
        if(insert == 0)
        {
            return new HashMap<String,Object>();
        }

        return new HashMap<String,Object>();
    }

    //@DeleteMapping

}
