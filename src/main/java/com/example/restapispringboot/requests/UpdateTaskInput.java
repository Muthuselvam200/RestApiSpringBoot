package com.example.restapispringboot.requests;

import com.example.restapispringboot.entities.TaskStatusEnum;

import java.util.Date;

public record UpdateTaskInput(TaskStatusEnum status, Date dueDate) {
}
