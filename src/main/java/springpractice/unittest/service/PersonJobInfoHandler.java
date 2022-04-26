package springpractice.unittest.service;

import org.springframework.stereotype.Service;

/**
 * @author Yu Yifan
 * @date 4/26/2022 11:25 PM
 */
@Service
public class PersonJobInfoHandler {

    public PersonJobInfo getPersonJobInfo(int age, String name){
        PersonJobInfo personJobInfo = new PersonJobInfo();
        int salary = 0;
        if(age > 30){
            salary = 20000;
        }else{
            salary = 10000;
        }
        personJobInfo.setPersonName(name);
        personJobInfo.setSalary(salary);
        return  personJobInfo;
    }
}
