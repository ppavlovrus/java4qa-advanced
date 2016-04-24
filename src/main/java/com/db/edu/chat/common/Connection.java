package com.db.edu.chat.common;

import ch.qos.logback.core.net.SocketConnector;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.SocketOption;

/**
 * Created by Pavlov on 24.04.2016.
 */
public class Connection extends Socket{
    private String message;
    private Socket inSocket;

    public Connection() throws IOException {
        BufferedReader socketReader = new BufferedReader(new InputStreamReader(inSocket.getInputStream()));
    }

    public void writeToStream(String mess) {

    }

    public String readFromStream()
    {
        return message;
    }


}
