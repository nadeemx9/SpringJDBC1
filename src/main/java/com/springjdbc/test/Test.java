package com.springjdbc.test;

import com.springjdbc.dao.StudentDAO;
import com.springjdbc.pojo.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test
{

    public static void main(String[] args)
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("file:src/main/java/beans.xml");

        Student student = context.getBean("student", Student.class);
        StudentDAO studendao = context.getBean("studentdao", StudentDAO.class);

        student.setRollno(1);
        student.setName("Nadeem");
        student.setCity("Porbandar");

        int r = studendao.insert(student);

        System.out.println(r + " rows affected !");

    }
}
