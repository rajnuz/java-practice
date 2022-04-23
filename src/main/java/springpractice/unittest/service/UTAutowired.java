package springpractice.unittest.service;

import org.springframework.stereotype.Component;

/**
 * @date 4/23/2022 3:59 PM
 */
@Component
public class UTAutowired {

    public int add(int a, int b) {
        return a + b;
    }

}
