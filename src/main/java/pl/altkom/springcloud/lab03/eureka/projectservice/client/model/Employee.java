package pl.altkom.springcloud.lab03.eureka.projectservice.client.model;

import lombok.Data;

@Data
public class Employee {

    private Long id;

    private String firstName;
    private String lastName;
    private String city;
    private Long projectId;
}
