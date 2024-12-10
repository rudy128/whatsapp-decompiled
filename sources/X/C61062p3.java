package X;

import java.util.HashMap;

/* renamed from: X.2p3  reason: invalid class name and case insensitive filesystem */
public abstract class C61062p3 {
    public static final HashMap A00 = C17880vN.A11();
    public static final HashMap A01 = C17880vN.A11();

    public static int A00(Class cls) {
        if (cls.getCanonicalName() != null && cls.getCanonicalName().equals("com.facebook.auth.usersession.FbUserSession")) {
            try {
                ClassLoader classLoader = cls.getClassLoader();
                if (classLoader != null) {
                    classLoader.loadClass("com.facebook.auth.usersession.FbUserSession");
                    classLoader.loadClass("com.facebook.auth.usersession.manager.FbUserSessionForTest");
                }
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            }
        }
        C60712oU.A00();
        return -1;
    }
}
