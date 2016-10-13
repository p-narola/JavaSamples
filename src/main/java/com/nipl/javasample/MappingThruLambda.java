package com.nipl.javasample;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MappingThruLambda {
    // List<User> users to List<Manager>

    public static void main(String[] args) {
        List<User> userList = new ArrayList<User>(){{
                add(new User("John"));
                add(new User("Peter"));
            }
        };

        List<Manager> managerList = userList.stream().map(user -> {
            return new Manager(user.getName());
        }).collect(Collectors.toList());

        managerList.stream().forEach(mgr -> System.out.println(mgr.getMgrName()));
    }

}
