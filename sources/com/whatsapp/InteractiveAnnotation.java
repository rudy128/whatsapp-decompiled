package com.whatsapp;

import X.AnonymousClass77U;
import X.C49482Qq;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class InteractiveAnnotation implements Serializable {
    public static final long serialVersionUID = -3211751283609597L;
    public Object data;
    public long interactiveAnnotationId = -1;
    public long messageRowId;
    public SerializablePoint[] polygonVertices = new SerializablePoint[0];
    public boolean skipConfirmation;
    public int sortOrder;
    public C49482Qq type;

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.writeObject(this.polygonVertices);
        Object obj = this.data;
        if (obj instanceof SerializableLocation) {
            objectOutputStream.writeObject(obj);
        }
    }

    public InteractiveAnnotation(AnonymousClass77U r3) {
        this.data = r3;
        this.type = C49482Qq.MUSIC;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        this.polygonVertices = (SerializablePoint[]) objectInputStream.readObject();
        try {
            this.data = objectInputStream.readObject();
        } catch (Exception unused) {
        }
    }
}
