package com.sylaDiaguily.springBatch.config;

import com.sylaDiaguily.springBatch.model.Employee;
import org.slf4j.*;
import org.springframework.batch.item.ItemProcessor;

public class DBLogProcessor implements ItemProcessor<Employee, Employee>
{
    public Employee process(Employee employee) throws Exception
    {

        Logger logger = LoggerFactory.getLogger(this.getClass());
        System.out.println("Inserting Employee : " + employee.getId());
        System.out.println("Inserting Employee : " + employee.getFirstName());
        System.out.println("Inserting Employee : " + employee.getLastName());
        System.out.println("************************************");
        logger.info("[employee =  "+"Id ="+ employee.getId()+", name = "+ employee.getFirstName()+", lastName = "+employee.getLastName()+ "]" );
        System.out.println("************************************");
        return employee;
    }
}