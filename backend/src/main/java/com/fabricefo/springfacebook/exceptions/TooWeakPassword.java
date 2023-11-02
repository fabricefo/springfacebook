package com.fabricefo.springfacebook.exceptions;

public class TooWeakPassword extends Exception{

    public TooWeakPassword() {
        super("Too weak password");
    }
}
