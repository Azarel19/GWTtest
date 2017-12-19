package ru.relex.practice.test.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

/**
 * Created by 1 on 19.12.2017.
 */
@RemoteServiceRelativePath("TestService")
public interface TestService extends RemoteService {
    String getMessage(String msg);
    public static class App {
        private static TestServiceAsync ourInstance = GWT.create(TestService.class);

        public static synchronized TestServiceAsync getInstance() {
            return ourInstance;
        }
    }
}
