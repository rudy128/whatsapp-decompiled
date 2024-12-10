package X;

import java.lang.reflect.Method;
import java.security.AccessController;
import java.security.PrivilegedActionException;

/* renamed from: X.Cg7  reason: case insensitive filesystem */
public class C25455Cg7 {
    public static final Class A00;
    public static final Method A01;
    public static final Method A02;

    static {
        Method method;
        Method method2;
        Class A002 = AnonymousClass1Br.A00("javax.crypto.spec.GCMParameterSpec", C25455Cg7.class);
        A00 = A002;
        if (A002 != null) {
            try {
                method2 = (Method) AccessController.doPrivileged(new DU5("getTLen"));
            } catch (PrivilegedActionException unused) {
                method2 = null;
            }
            A02 = method2;
            try {
                method = (Method) AccessController.doPrivileged(new DU5("getIV"));
            } catch (PrivilegedActionException unused2) {
                method = null;
            }
        } else {
            method = null;
        }
        A01 = method;
    }
}
