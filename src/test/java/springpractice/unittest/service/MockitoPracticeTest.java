package springpractice.unittest.service;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.runner.RunWith;
import org.mockito.ArgumentMatchers;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

/**
 * @author Yu Yifan
 * @date 4/26/2022 11:31 PM
 */
@SpringBootTest(classes = {MockitoPractice.class})
@RunWith(SpringRunner.class)
public class MockitoPracticeTest {

    @Autowired
    MockitoPractice mockitoPractice;

    @MockBean
    PersonJobInfoHandler personJobInfoHandler;

    @Test
    public void handleInfo(){
        Person person = new Person();
        person.setAge(20);
        person.setName("tom");
        PersonJobInfo personJobInfo = new PersonJobInfo();
        personJobInfo.setSalary(15000);
        personJobInfo.setPersonName("Jack");
        Mockito.when(personJobInfoHandler.getPersonJobInfo(ArgumentMatchers.anyInt(),ArgumentMatchers.anyString())).thenReturn(personJobInfo);
        Assertions.assertEquals(15000,mockitoPractice.handleInfo(person).getSalary());
    }

}