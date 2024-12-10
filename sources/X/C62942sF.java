package X;

import android.app.Application;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.List;

/* renamed from: X.2sF  reason: invalid class name and case insensitive filesystem */
public abstract class C62942sF {
    public static final List A00;
    public static final List A01;

    static {
        Class[] clsArr = new Class[2];
        clsArr[0] = Application.class;
        Class<C37361pP> cls = C37361pP.class;
        A00 = C18070vi.A0O(cls, clsArr, 1);
        A01 = C18070vi.A0M(cls);
    }

    public static final AnonymousClass1J2 A00(Class cls, Constructor constructor, Object... objArr) {
        try {
            return (AnonymousClass1J2) constructor.newInstance(Arrays.copyOf(objArr, objArr.length));
        } catch (IllegalAccessException e) {
            throw new RuntimeException(AnonymousClass001.A1E(cls, "Failed to access ", AnonymousClass000.A10()), e);
        } catch (InstantiationException e2) {
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("A ");
            A10.append(cls);
            throw new RuntimeException(AnonymousClass000.A0y(" cannot be instantiated.", A10), e2);
        } catch (InvocationTargetException e3) {
            throw new RuntimeException(AnonymousClass001.A1E(cls, "An exception happened in constructor of ", AnonymousClass000.A10()), e3.getCause());
        }
    }

    public static final Constructor A01(Class cls, List list) {
        Constructor[] constructors = cls.getConstructors();
        C18070vi.A0X(constructors);
        int length = constructors.length;
        int i = 0;
        while (i < length) {
            Constructor constructor = constructors[i];
            Class[] parameterTypes = constructor.getParameterTypes();
            C18070vi.A0X(parameterTypes);
            List A0Q = C200410p.A0Q(parameterTypes);
            if (C18070vi.A18(list, A0Q)) {
                return constructor;
            }
            if (list.size() != A0Q.size() || !A0Q.containsAll(list)) {
                i++;
            } else {
                StringBuilder A10 = AnonymousClass000.A10();
                A10.append("Class ");
                A10.append(cls.getSimpleName());
                throw new UnsupportedOperationException(AnonymousClass001.A1E(list, " must have parameters in the proper order: ", A10));
            }
        }
        return null;
    }
}
