package com.client;

import com.api.Group;
import com.api.User;

class Main {

    public static void main(String[] args) {
        Group admins = new Group(1);
        Group developers = new Group(2);
        Group others = new Group(3);

        User teamLead = new User(1);
        admins.addToGroup(teamLead);
        teamLead.joinGroup(admins);
        developers.addToGroup(teamLead);
        teamLead.joinGroup(developers);

        User developer = new User(2);
        developers.addToGroup(developer);
        developer.joinGroup(developers);

        User testEngineer = new User(3);
        others.addToGroup(testEngineer);
        testEngineer.joinGroup(others);
    }
}
