package camt.cbsd.services;

import camt.cbsd.dao.StudentDao;
import camt.cbsd.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Profile("secondDataSource")
@ConfigurationProperties(prefix = "server")
@Service
public class StudentSecondServiceImpl implements StudentService {

    @Autowired
    StudentDao studentDao;

    public List<Student> getStudents(){

        return studentDao.getStudents();
    }
}
