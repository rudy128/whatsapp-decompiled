package com.whatsapp;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerializablePoint implements Serializable {
    public static final long serialVersionUID = -3211751283609599L;
    public double x;
    public double y;

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.writeDouble(this.x);
        objectOutputStream.writeDouble(this.y);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        this.x = objectInputStream.readDouble();
        this.y = objectInputStream.readDouble();
    }
}
