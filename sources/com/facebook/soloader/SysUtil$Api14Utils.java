package com.facebook.soloader;

import X.AnonymousClass000;
import X.AnonymousClass1A8;
import X.C17890vO;
import dalvik.system.BaseDexClassLoader;

public class SysUtil$Api14Utils {
    public static String A00() {
        ClassLoader classLoader = AnonymousClass1A8.class.getClassLoader();
        if (classLoader == null || (classLoader instanceof BaseDexClassLoader)) {
            try {
                return (String) BaseDexClassLoader.class.getMethod("getLdLibraryPath", new Class[0]).invoke((BaseDexClassLoader) classLoader, new Object[0]);
            } catch (Exception e) {
                throw new RuntimeException("Cannot call getLdLibraryPath", e);
            }
        } else {
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("ClassLoader ");
            A10.append(C17890vO.A0U(classLoader));
            throw AnonymousClass000.A0n(AnonymousClass000.A0y(" should be of type BaseDexClassLoader", A10));
        }
    }
}
