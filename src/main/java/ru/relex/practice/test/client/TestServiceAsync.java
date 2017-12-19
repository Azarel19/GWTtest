package ru.relex.practice.test.client;

import com.google.gwt.user.client.rpc.AsyncCallback;

/**
 * Created by 1 on 19.12.2017.
 */
public interface TestServiceAsync {
    void getMessage(String msg, AsyncCallback<String> async);
}
