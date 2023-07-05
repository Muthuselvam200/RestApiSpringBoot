package com.example.restapispringboot.requests;

import com.example.restapispringboot.entities.Task;
import com.example.restapispringboot.entities.TaskStatusEnum;

import java.util.Date;

public record CreateTaskInput(String name, String description, TaskStatusEnum status, Date dueDate) {
    public Task toTask() {
        Task task = new Task();

        task.setName(name)
                .setDescription(description)
                .setStatus(status)
                .setDueDate(dueDate);

        return task;
    }
}
