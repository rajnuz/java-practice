package springpractice.unittest.service;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.mockito.ArgumentMatchers;
import org.mockito.Mockito;

/**
 * @date 4/23/2022 4:54 PM
 */
public class UTServiceTest {

    @Test
    public void addTest() {
        UTAutowired utAutowired = Mockito.mock(UTAutowired.class);

        UTService utService1 = new UTService(utAutowired);

        int result = 100;
        Mockito.when(utAutowired.add(ArgumentMatchers.anyInt(), ArgumentMatchers.anyInt())).thenReturn(result);

        int actual = utService1.add(1, 2);

        Assertions.assertEquals(100, actual);
    }

}