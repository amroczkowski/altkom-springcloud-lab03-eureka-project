package pl.altkom.springcloud.lab03.eureka.projectservice.controller.model;

import javax.validation.constraints.NotNull;

import lombok.Getter;

@Getter
public class UpdateProjectRequest {

    @NotNull
    private String name;
}
