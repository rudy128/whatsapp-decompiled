package org.apache.xml.security.keys.storage.implementations;

import X.AnonymousClass000;
import X.AnonymousClass04E;
import X.BE8;
import java.util.Iterator;
import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.xml.security.keys.storage.StorageResolverSpi;

public abstract class CertsInFilesystemDirectoryResolver extends StorageResolverSpi {
    public static Log a;
    public static Class b;
    public List c;

    public class FilesystemIterator implements Iterator {
        public List a;
        public int b = 0;

        public FilesystemIterator(List list) {
            this.a = list;
        }

        public Object next() {
            List list = this.a;
            int i = this.b;
            this.b = i + 1;
            return list.get(i);
        }

        public void remove() {
            throw new UnsupportedOperationException("Can't remove keys from KeyStore");
        }

        public boolean hasNext() {
            return AnonymousClass000.A1U(this.b, this.a.size());
        }
    }

    static {
        Class a2 = a("org.apache.xml.security.keys.storage.implementations.CertsInFilesystemDirectoryResolver");
        b = a2;
        a = LogFactory.getLog(a2.getName());
    }

    public Iterator a() {
        throw AnonymousClass04E.createAndThrow();
    }

    public static Class a(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e) {
            throw BE8.A0l(e);
        }
    }
}
