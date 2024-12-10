package X;

import java.lang.reflect.Method;

/* renamed from: X.Bxl  reason: case insensitive filesystem */
public class C24231Bxl extends ClassLoader {
    public static final String A00 = C26213Cus.class.getName();
    public static final Class[] A01;

    public Class A00(String str, byte[] bArr) {
        try {
            Method declaredMethod = ClassLoader.class.getDeclaredMethod("defineClass", A01);
            declaredMethod.setAccessible(true);
            ClassLoader parent = getParent();
            Object[] A1a = C108945cZ.A1a(str, bArr, 4, 1);
            AnonymousClass3Ma.A1S(A1a, 0);
            C17890vO.A1G(A1a, bArr.length);
            return (Class) declaredMethod.invoke(parent, A1a);
        } catch (Exception unused) {
            return defineClass(str, bArr, 0, bArr.length);
        }
    }

    public synchronized Class loadClass(String str, boolean z) {
        Class cls;
        if (str.equals(A00)) {
            cls = C26213Cus.class;
        } else {
            cls = super.loadClass(str, z);
        }
        return cls;
    }

    static {
        Class cls = Integer.TYPE;
        A01 = new Class[]{String.class, byte[].class, cls, cls};
    }

    public C24231Bxl(ClassLoader classLoader) {
        super(classLoader);
    }
}
