package springpractice.unittest.api;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import springpractice.unittest.service.UTService;

/**
 * @date 4/23/2022 3:42 PM
 */
@Api(tags = "unit test controller")
@Controller
public class UnitTestController {

    @Autowired
    UTService utService;

    @ResponseBody
    @ApiOperation("add 2 int")
    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public int add(@RequestParam(value = "param1") Integer a,
                   @RequestParam(value = "param2") Integer b) {
        return utService.add(a, b);
    }

    @ResponseBody
    @ApiOperation("minus 2 int")
    @RequestMapping(value = "/minus", method = RequestMethod.GET)
    public int minus(@RequestParam(value = "param1") Integer a,
                     @RequestParam(value = "param2") Integer b) {
        return utService.minus(a, b);
    }

}
