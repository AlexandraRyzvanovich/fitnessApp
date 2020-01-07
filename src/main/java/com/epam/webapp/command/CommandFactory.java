package com.epam.webapp.command;

import com.epam.webapp.dao.DaoHelperFactory;
import com.epam.webapp.service.UserService;

public class CommandFactory {
    public static Command create(String command) {

        switch (command){
            case "login": return new LoginCommand(new UserService(new DaoHelperFactory()));
            case "mainPage" : return new ShowPageCommand("WEB-INF/main.jsp");
            default: throw new IllegalArgumentException("unknown command " + command);
        }
    }
}
