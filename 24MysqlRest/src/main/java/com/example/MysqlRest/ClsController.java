package com.example.MysqlRest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.PostConstruct;
import java.util.List;

@RestController
@RequestMapping("/cls")
public class ClsController {

    @Autowired
    public ClsDao cd;

    @PostConstruct
    public void add(){
        Cls cls1=new Cls(1,"java","25");
        cd.save(cls1);
        Cls cls2=new Cls(2,"php","25");
        cd.save(cls2);
        Cls cls3=new Cls(3,"dot","25");
        cd.save(cls3);
    }

    @RequestMapping(value = "", method = RequestMethod.GET)
    public List<Cls> getAll(){
        return cd.findAll();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Cls getId(@PathVariable int id){
        return cd.findById(id).get();
    }

    @RequestMapping(value = "", method = RequestMethod.POST)
    public void getId(@RequestBody Cls cls){
        cd.save(cls);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public void update(@PathVariable int id,@RequestBody Cls cls){
        cd.save(cls);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable int id){
        cd.deleteById(id);
    }

}
