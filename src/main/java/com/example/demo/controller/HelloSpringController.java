//package com.example.demo.controller;
//
//import com.example.demo.Beans.BuildingBean;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.ArrayList;
//import java.util.List;
//
//
//@RestController
//public class HelloSpringController {
//    @GetMapping(value = "/building/")
//
//    public BuildingBean  getBuilding(@RequestParam(value="name", required = false) String name,
//                                         @RequestParam(value = "numberOfBasement",required = false) Integer numberOfBasement){
//
//        BuildingBean result = new BuildingBean();
//        result.setName("ABC Building");
//        result.setWard("");
//        return  result;
//    }
//
//    @RequestMapping(value = "/building/",method = RequestMethod.POST)
//    public  void getBuilding2(@RequestBody BuildingBean buildingDTO){
//        System.out.println("ok");
//    }
//
//}
package com.example.demo.controller;

import com.example.demo.Model.BuildingDTO;
import com.example.demo.customException.FieldRequiredException;
import com.example.demo.service.BuildingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;


@RestController
public class HelloSpringController {

    @Autowired
    private BuildingService buildingService;
    @GetMapping("/building/")
    public List<BuildingDTO> getBuilding(@RequestParam Map<String,Object> params,@RequestParam List<String> typeCode) {
    List<BuildingDTO> result = buildingService.findAll(params,typeCode);
        return result;

}
    public void valiDate (BuildingDTO bd)  {
        if(bd.getName() == null || bd.getName().equals("")){
            throw new FieldRequiredException("name or numberOfBasement is null");
        }
    }

//    @RequestMapping(value = "/building/",method = RequestMethod.POST)
//    public  void getBuilding2(@RequestBody BuildingBean buildingDTO){
//        System.out.println("ok");
//    }

}


