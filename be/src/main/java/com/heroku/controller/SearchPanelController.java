package com.heroku.controller;

import com.heroku.entity.*;
import com.heroku.mapper.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;


@RestController
@RequestMapping(value = "api/SearchPanel")
public class SearchPanelController {

    @Autowired
    private SdaMzBumonMapper bumonMapper;

    @Autowired
    private SdaMzHanMapper hanMapper;

    @Autowired
    private SdaMaSetsubishubetsuMapper setsubishubetsuMapper;

    @Autowired
    private SdaMaSetsubishosaiMapper setsubishosaiMapper;

    @Autowired
    private SdaMbKensashubetsuMapper kensashubetsuMapper;

    @Autowired
    private SdaMaSenmeiMapper senmeiMapper;

    @Autowired
    private SdaMaShisetsumeiMapper shisetsumeiMapper;

    @GetMapping(value = "")
    public ResponseEntity getSearchPanels()
    {
        Map result = new HashMap<String, Object>();

        SdaMzBumonExample bumonExample = new SdaMzBumonExample();
        bumonExample.setOrderByClause("1");

        result.put("bumon", bumonMapper.selectByExample2(bumonExample));

        SdaMzHanExample hanExample = new SdaMzHanExample();
        hanExample.createCriteria().andSdaBumoncdEqualTo("10").andSdaMishiyofEqualTo("0");

        hanExample.setOrderByClause("1, 2");

        result.put("han", hanMapper.selectByExample2(hanExample));

        SdaMbKensashubetsuExample kensashubetsuExample = new SdaMbKensashubetsuExample();
        kensashubetsuExample.createCriteria().andSdaBumoncdEqualTo("10").andSdaMishiyofEqualTo("0");
        kensashubetsuExample.setOrderByClause("1, 2");

        result.put("kensashubetsu", kensashubetsuMapper.selectByExample2(kensashubetsuExample));

        SdaMaSetsubishubetsuExample sdaMaSetsubishubetsuExample = new SdaMaSetsubishubetsuExample();
        sdaMaSetsubishubetsuExample.createCriteria().andSdaBumoncdEqualTo("10").andSdaMishiyofEqualTo("0");
        sdaMaSetsubishubetsuExample.setOrderByClause("1, 2");

        result.put("setsubishubetsu", setsubishubetsuMapper.selectByExample2(sdaMaSetsubishubetsuExample));

        SdaMaSenmeiExample sdaMaSenmeiExample = new SdaMaSenmeiExample();
        sdaMaSenmeiExample.createCriteria().andSdaBumoncdEqualTo("10").andSdaMishiyofEqualTo("0");
        sdaMaSenmeiExample.setOrderByClause("1, 2");

        result.put("senmei", senmeiMapper.selectByExample2(sdaMaSenmeiExample));

        SdaMaSetsubishosaiExample sdaMaSetsubishosaiExample = new SdaMaSetsubishosaiExample();
        sdaMaSetsubishosaiExample.createCriteria().andSdaBumoncdEqualTo("10").andSdaMishiyofEqualTo("0");
        sdaMaSetsubishosaiExample.setOrderByClause("1, 2");

        result.put("setsubishosai", setsubishosaiMapper.selectByExample2(sdaMaSetsubishosaiExample));

        SdaMaShisetsumeiExample shisetsumeiExample = new SdaMaShisetsumeiExample();
        shisetsumeiExample.createCriteria().andSdaBumoncdEqualTo("10").andSdaMishiyofEqualTo("0");
        shisetsumeiExample.setOrderByClause("1, 2");

        result.put("shisetsumei", shisetsumeiMapper.selectByExample2(shisetsumeiExample));

        return new ResponseEntity(result , HttpStatus.OK);
    }

    @GetMapping(value = "{id}")
    public ResponseEntity getSearchPanel(@PathVariable final String id)
    {
        Map result = new HashMap<String, Object>();

        SdaMzBumonExample bumonExample = new SdaMzBumonExample();
        bumonExample.setOrderByClause("1");

        result.put("bumon", bumonMapper.selectByExample2(bumonExample));

        SdaMzHanExample hanExample = new SdaMzHanExample();
        hanExample.createCriteria().andSdaBumoncdEqualTo(id).andSdaMishiyofEqualTo("0");
        hanExample.setOrderByClause("1, 2");

        result.put("han", hanMapper.selectByExample2(hanExample));

        SdaMbKensashubetsuExample kensashubetsuExample = new SdaMbKensashubetsuExample();
        kensashubetsuExample.createCriteria().andSdaBumoncdEqualTo(id).andSdaMishiyofEqualTo("0");
        kensashubetsuExample.setOrderByClause("1, 2");

        result.put("kensashubetsu", kensashubetsuMapper.selectByExample2(kensashubetsuExample));

        SdaMaSetsubishubetsuExample sdaMaSetsubishubetsuExample = new SdaMaSetsubishubetsuExample();
        sdaMaSetsubishubetsuExample.createCriteria().andSdaBumoncdEqualTo(id).andSdaMishiyofEqualTo("0");
        sdaMaSetsubishubetsuExample.setOrderByClause("1, 2");

        result.put("setsubishubetsu", setsubishubetsuMapper.selectByExample2(sdaMaSetsubishubetsuExample));

        SdaMaSenmeiExample sdaMaSenmeiExample = new SdaMaSenmeiExample();
        sdaMaSenmeiExample.createCriteria().andSdaBumoncdEqualTo(id).andSdaMishiyofEqualTo("0");
        sdaMaSenmeiExample.setOrderByClause("1, 2");

        result.put("senmei", senmeiMapper.selectByExample2(sdaMaSenmeiExample));

        SdaMaSetsubishosaiExample sdaMaSetsubishosaiExample = new SdaMaSetsubishosaiExample();
        sdaMaSetsubishosaiExample.createCriteria().andSdaBumoncdEqualTo(id).andSdaMishiyofEqualTo("0");
        sdaMaSetsubishosaiExample.setOrderByClause("1, 2");

        result.put("setsubishosai", setsubishosaiMapper.selectByExample2(sdaMaSetsubishosaiExample));

        SdaMaShisetsumeiExample shisetsumeiExample = new SdaMaShisetsumeiExample();
        shisetsumeiExample.createCriteria().andSdaBumoncdEqualTo(id).andSdaMishiyofEqualTo("0");
        shisetsumeiExample.setOrderByClause("1, 2");

        result.put("shisetsumei", shisetsumeiMapper.selectByExample2(shisetsumeiExample));

        return new ResponseEntity(result , HttpStatus.OK);
    }
}
