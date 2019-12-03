package hello;
import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.swing.*;



@RestController
public class GreetingController {
 private static  final String template = "Hello, %s!";
 private final AtomicLong counter = new AtomicLong();

 @RequestMapping("/greeting")
 public Greeting greeting(@RequestParam(value ="name", defaultValue = "World") Spring name){
  return new Greeting(counter.incrementAndGet(),
          String.format(template, name));
 }
}
//This class handles get requests for greeting by returning a new instance of greeting