package com.ud.TaskActivity;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableMethodSecurity
public class TaskController {

    @GetMapping(path="/task")
    @PreAuthorize("hasAuthority('SCOPE_readtask')")
    public String getTask() {
        return "Access Granted: Get a Task";
    }

    @PostMapping("/task")
    @PreAuthorize("hasAuthority('SCOPE_updatetask')")
    public String updateTask() {
        return "Access Granted: Update a Task";
    }
}
