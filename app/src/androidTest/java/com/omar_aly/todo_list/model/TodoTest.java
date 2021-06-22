package com.omar_aly.todo_list.model;

import org.junit.Assert;
import org.junit.Test;

public class TodoTest {
    //Field state of type TodoState - was not mocked since Mockito doesn't mock enums
    //Field tag of type Tag - was not mocked since Mockito doesn't mock enums
    Todo todo = new Todo(0, "name", "description", "1000", Boolean.TRUE, TodoState.DOING, Tag.GRAY);

    @Test
    public void testGetId()  {
        int result = todo.getId();
        Assert.assertEquals(0, result);
    }

    @Test
    public void testGetName()  {
        String result = todo.getName();
        Assert.assertEquals("name", result);
    }

    @Test
    public void testGetDescription()  {
        String result = todo.getDescription();
        Assert.assertEquals("description", result);
    }

    @Test
    public void testGetTime()  {
        String result = todo.getTime();
        Assert.assertEquals("1000", result);
    }

    @Test
    public void testGetRemind10()  {
        Boolean result = todo.getRemind10();
        Assert.assertEquals(Boolean.TRUE, result);
    }

    @Test
    public void testGetState()  {
        TodoState result = todo.getState();
        Assert.assertEquals(TodoState.DOING, result);
    }

    @Test
    public void testGetTag()  {
        Tag result = todo.getTag();
        Assert.assertEquals(Tag.GRAY, result);
    }

    
}

//Generated with love by TestMe :) Please report issues and submit feature requests at: http://weirddev.com/forum#!/testme