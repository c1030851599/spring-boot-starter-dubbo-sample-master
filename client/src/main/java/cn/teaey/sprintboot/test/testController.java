package cn.teaey.sprintboot.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class testController {

  @Autowired
  AbcService AbcService;

  @RequestMapping("aaa")
  public String test(){

    String a = AbcService.echoService.echo("哈哈哈哈哈");
    return a;

  }


}
