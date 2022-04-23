package springpractice.unittest.service;

import org.springframework.stereotype.Service;

/**
 * @date 4/23/2022 3:58 PM
 */
@Service
public class UTService {


    private UTAutowired utAutowired;

    public UTService(UTAutowired utAutowired) {
        this.utAutowired = utAutowired;
    }

    public int add(int a, int b) {
        return utAutowired.add(a, b);
    }

    public int minus(int a, int b) {


        boolean compare = compare(a, b);
        if (compare) {
            UTNonAutoWired utNonAutoWired = new UTNonAutoWired(a, b);
            return utNonAutoWired.minus();
        } else {
            UTNonAutoWired utNonAutoWired = new UTNonAutoWired(b, a);
            return utNonAutoWired.minus();
        }

    }

    private boolean compare(int a, int b) {
        boolean result;
        if (a >= b) {
            result = true;
        } else {
            result = false;
        }
        return result;
    }

}
