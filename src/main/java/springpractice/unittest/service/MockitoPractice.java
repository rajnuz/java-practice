package springpractice.unittest.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Yu Yifan
 * @date 4/26/2022 11:20 PM
 */
@Service
public class MockitoPractice {

    @Autowired
    PersonJobInfoHandler personJobInfoHandler;

    public PersonJobInfo handleInfo(Person person){
        PersonJobInfo personJobInfo = personJobInfoHandler.getPersonJobInfo(person.getAge(),person.getName());
        return personJobInfo;
    }

}
