package cn.javastack.springboot.starter.jpa.controller;

import cn.javastack.springboot.starter.jpa.TestModel;
import cn.javastack.springboot.starter.jpa.common.Result;
import cn.javastack.springboot.starter.jpa.service.TestService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


/**
 * @Author: Zhao MengXia
 * @Date: 2019/3/6 11:50
 */
@RestController
@RequestMapping("/test")
@Api(value = "用来测试swagger注解的控制器")
public class TestController {
    @Autowired
    private TestService testService;

    @RequestMapping(value = "/findAll" ,method = RequestMethod.GET)
    @ApiOperation(value = "获取所有信息",notes = "仅1和2怎么怎么样")

    public Result findAll(){
        return Result.newSuccess(testService.findAll());
    }
    @RequestMapping(value ="/saveTestModel" ,method = RequestMethod.POST)
    @ApiOperation(value = "添加测试信息")
    public Result saveTestModel(@RequestBody TestModel testModel){
        return Result.newSuccess(testService.save(testModel));
    }

    @GetMapping(value = "/getUsers")
    @ApiOperation(value = "测试SpringSecurity")
    public String getUsers(){
        return "Hello World!";
    }
}
