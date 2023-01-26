package StructurallDP.CompositeDP;

import java.util.List;
import java.util.stream.Collectors;

public class RegionalDepartment extends Department{

    List<Department> childDepartments;

    public RegionalDepartment(List<Department> childDepartments) {
        this.childDepartments = childDepartments;
    }

    @Override
    String getName() {
        return childDepartments.stream().
                map(Department::getName).
                collect(Collectors.joining(", "));
    }
    @Override
    List<String> getEmployees() {
        return childDepartments.stream().
                flatMap(d-> d.getEmployees().stream()).
                collect(Collectors.toList());

    }
}
