package org.apache.xml.security.keys.storage;

import X.AnonymousClass04E;
import X.BE8;
import java.util.Iterator;
import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class StorageResolver {
    public static Log a;
    public static Class d;
    public List b = null;
    public Iterator c = null;

    public abstract class StorageResolverIterator implements Iterator {
        public Iterator a;
        public Iterator b;

        private Iterator a() {
            throw AnonymousClass04E.createAndThrow();
        }

        public abstract boolean hasNext();

        public abstract Object next();

        public abstract void remove();
    }

    static {
        Class a2 = a("org.apache.xml.security.keys.storage.StorageResolver");
        d = a2;
        a = LogFactory.getLog(a2.getName());
    }

    public static Class a(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e) {
            throw BE8.A0l(e);
        }
    }
}
