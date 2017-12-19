package ru.relex.practice.test.server;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;
import ru.relex.practice.test.client.TestService;

/**
 * Created by 1 on 19.12.2017.
 */
public class TestServiceImpl extends RemoteServiceServlet implements TestService {
    public String getMessage(String msg) {
        return "Client said: \"" + msg + "\"<br>Server answered: \"Hi!\"";
    }
}
