package springpractice.unittest.service;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

/**
 * @date 4/25/2022 11:43 PM
 */
@RunWith(PowerMockRunner.class)
@PrepareForTest(UTService.class)
public class UTServiceTestForNew {

    @Test
    public void minusTest() throws Exception {
        UTNonAutoWired utNonAutoWired = Mockito.mock(UTNonAutoWired.class);
        UTAutowired utAutowired = Mockito.mock(UTAutowired.class);
        UTService utService1 = new UTService(utAutowired);

        PowerMockito.whenNew(UTNonAutoWired.class).withAnyArguments().thenReturn(utNonAutoWired);

        int result = 100;
        Mockito.when(utNonAutoWired.minus()).thenReturn(result);

        int actual = utService1.minus(1,2);
        Assertions.assertEquals(100,actual);


    }
}
