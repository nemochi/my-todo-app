package com.example.todo.app.todo;

import java.io.Serializable;

import io.micrometer.common.lang.NonNull;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class TodoForm implements Serializable {

    public static interface TodoCreate {

    }

    public static interface TodoFinish {

    }

    public static interface TodoDelete {

    }

    private static final long serialVersionUID = 1L;

    @NotNull(groups = { TodoFinish.class, TodoDelete.class })
    private String todoId;

    @NotNull(groups = { TodoCreate.class })
    @Size(min = 1, max = 30, groups = { TodoCreate.class })
    private String todoTitle;
}
