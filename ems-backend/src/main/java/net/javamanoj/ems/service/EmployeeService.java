package net.javamanoj.ems.service;

import net.javamanoj.ems.dto.EmployeeDto;
import net.javamanoj.ems.mapper.EmployeeMapper;

import java.util.List;

public interface EmployeeService {
    EmployeeDto createEmployee(EmployeeDto employeeDto);

    EmployeeDto getEmployeeById(Long employeeId);

    List<EmployeeDto> getAllEmployees();

    EmployeeDto updateEmployee(Long employeeId, EmployeeDto updatedEmployee);

    void deleteEmployee(Long employeeId);

}
