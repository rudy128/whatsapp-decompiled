package X;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.CvM  reason: case insensitive filesystem */
public abstract class C26230CvM {
    public static void populateMap(Map map, ObjectInputStream objectInputStream, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            map.put(objectInputStream.readObject(), objectInputStream.readObject());
        }
    }

    public static void populateMultiset(C28677EDz eDz, ObjectInputStream objectInputStream, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            eDz.add(objectInputStream.readObject(), objectInputStream.readInt());
        }
    }

    public static C25713Ckj getFieldSetter(Class cls, String str) {
        try {
            return new C25713Ckj(cls.getDeclaredField(str));
        } catch (NoSuchFieldException e) {
            throw AnonymousClass8BR.A0v(e);
        }
    }

    public static int readCount(ObjectInputStream objectInputStream) {
        return objectInputStream.readInt();
    }

    public static void writeMap(Map map, ObjectOutputStream objectOutputStream) {
        objectOutputStream.writeInt(map.size());
        Iterator A15 = AnonymousClass000.A15(map);
        while (A15.hasNext()) {
            Map.Entry A16 = AnonymousClass000.A16(A15);
            objectOutputStream.writeObject(A16.getKey());
            objectOutputStream.writeObject(A16.getValue());
        }
    }

    public static void writeMultimap(C28579E8q e8q, ObjectOutputStream objectOutputStream) {
        objectOutputStream.writeInt(e8q.asMap().size());
        Iterator A15 = AnonymousClass000.A15(e8q.asMap());
        while (A15.hasNext()) {
            Map.Entry A16 = AnonymousClass000.A16(A15);
            objectOutputStream.writeObject(A16.getKey());
            objectOutputStream.writeInt(((Collection) A16.getValue()).size());
            for (Object writeObject : (Collection) A16.getValue()) {
                objectOutputStream.writeObject(writeObject);
            }
        }
    }

    public static void writeMultiset(C28677EDz eDz, ObjectOutputStream objectOutputStream) {
        objectOutputStream.writeInt(eDz.entrySet().size());
        for (C25259Cby cby : eDz.entrySet()) {
            objectOutputStream.writeObject(cby.getElement());
            objectOutputStream.writeInt(cby.getCount());
        }
    }
}
