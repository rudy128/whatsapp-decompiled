package X;

import android.graphics.Typeface;
import android.util.Log;
import android.util.SparseArray;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: X.9ws  reason: invalid class name and case insensitive filesystem */
public abstract class C197549ws {
    public static final Constructor A00;
    public static final Field A01;
    public static final Method A02;
    public static final Method A03;
    public static final C001100p A04 = new C001100p(3);
    public static final Object A05 = C17880vN.A0p();

    static {
        Field field;
        Method method;
        Method method2;
        Constructor<Typeface> constructor;
        Class<Typeface> cls = Typeface.class;
        try {
            field = cls.getDeclaredField("native_instance");
            method = cls.getDeclaredMethod("nativeCreateFromTypeface", new Class[]{Long.TYPE, Integer.TYPE});
            method.setAccessible(true);
            method2 = cls.getDeclaredMethod("nativeCreateWeightAlias", new Class[]{Long.TYPE, Integer.TYPE});
            method2.setAccessible(true);
            constructor = cls.getDeclaredConstructor(new Class[]{Long.TYPE});
            constructor.setAccessible(true);
        } catch (NoSuchFieldException | NoSuchMethodException e) {
            Log.e("WeightTypeface", C17890vO.A0U(e), e);
            field = null;
            method = null;
            method2 = null;
            constructor = null;
        }
        A01 = field;
        A02 = method;
        A03 = method2;
        A00 = constructor;
    }

    public static Typeface A00(Typeface typeface, int i, boolean z) {
        RuntimeException runtimeException;
        Typeface typeface2;
        Method method;
        Object[] A1b;
        Field field = A01;
        if (!AnonymousClass000.A1W(field)) {
            return null;
        }
        boolean z2 = (i << 1) | z;
        synchronized (A05) {
            try {
                long j = field.getLong(typeface);
                C001100p r3 = A04;
                SparseArray sparseArray = (SparseArray) r3.A05(j);
                if (sparseArray == null) {
                    sparseArray = new SparseArray(4);
                    r3.A0A(j, sparseArray);
                } else {
                    typeface2 = (Typeface) sparseArray.get(z2 ? 1 : 0);
                    if (typeface2 != null) {
                    }
                }
                if (z == typeface.isItalic()) {
                    try {
                        method = A03;
                        A1b = AnonymousClass3MW.A1b();
                        C17890vO.A1L(A1b, j);
                        AnonymousClass000.A1M(A1b, i);
                    } catch (IllegalAccessException e) {
                        runtimeException = AnonymousClass8BR.A0x(e);
                        throw runtimeException;
                    } catch (InvocationTargetException e2) {
                        runtimeException = AnonymousClass8BR.A0x(e2);
                        throw runtimeException;
                    }
                    try {
                        typeface2 = (Typeface) A00.newInstance(AnonymousClass8BV.A1b((Long) method.invoke((Object) null, A1b)));
                    } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
                        typeface2 = null;
                    }
                } else {
                    int A002 = AnonymousClass8BU.A00(z ? 1 : 0);
                    try {
                        Method method2 = A02;
                        Object[] objArr = new Object[2];
                        AnonymousClass3MX.A1S(objArr, 0, j);
                        int A1b2 = AnonymousClass8BU.A1b(objArr, A002);
                        Object invoke = method2.invoke((Object) null, objArr);
                        Method method3 = A03;
                        Object[] objArr2 = new Object[2];
                        objArr2[0] = invoke;
                        C17880vN.A1T(objArr2, i, A1b2);
                        Long l = (Long) method3.invoke((Object) null, objArr2);
                        Constructor constructor = A00;
                        Object[] objArr3 = new Object[A1b2];
                        objArr3[0] = l;
                        typeface2 = (Typeface) constructor.newInstance(objArr3);
                    } catch (IllegalAccessException e3) {
                        runtimeException = AnonymousClass8BR.A0x(e3);
                        throw runtimeException;
                    } catch (InvocationTargetException e4) {
                        runtimeException = AnonymousClass8BR.A0x(e4);
                        throw runtimeException;
                    }
                }
                sparseArray.put(z2, typeface2);
            } catch (IllegalAccessException e5) {
                runtimeException = AnonymousClass8BR.A0x(e5);
                throw runtimeException;
            }
        }
        return typeface2;
    }
}
