package X;

import java.security.AccessController;

/* renamed from: X.1Br  reason: invalid class name */
public abstract class AnonymousClass1Br {
    public static Class A00(String str, Class cls) {
        try {
            ClassLoader classLoader = cls.getClassLoader();
            return classLoader != null ? classLoader.loadClass(str) : (Class) AccessController.doPrivileged(new C27095DTy(str, 0));
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }
}
