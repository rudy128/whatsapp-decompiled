package X;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/* renamed from: X.2oP  reason: invalid class name and case insensitive filesystem */
public abstract class C60662oP {
    public static final String A00(Class cls) {
        String str;
        String A0y;
        if (cls.isAnonymousClass() || cls.isLocalClass()) {
            return null;
        }
        if (cls.isArray()) {
            Class<?> componentType = cls.getComponentType();
            if (!componentType.isPrimitive() || (str = (String) AnonymousClass20F.A01.get(componentType.getName())) == null || (A0y = AnonymousClass000.A0y("Array", AnonymousClass000.A11(str))) == null) {
                return "kotlin.Array";
            }
            return A0y;
        }
        String str2 = (String) AnonymousClass20F.A01.get(cls.getName());
        if (str2 == null) {
            return cls.getCanonicalName();
        }
        return str2;
    }

    public static final String A01(Class cls) {
        String A0s;
        String str = null;
        if (!cls.isAnonymousClass()) {
            if (cls.isLocalClass()) {
                str = cls.getSimpleName();
                Method enclosingMethod = cls.getEnclosingMethod();
                if (enclosingMethod != null) {
                    C18070vi.A0b(str);
                    StringBuilder A10 = AnonymousClass000.A10();
                    A10.append(enclosingMethod.getName());
                    return AnonymousClass1YF.A0N(str, C17890vO.A0c(A10, '$'), str);
                }
                Constructor<?> enclosingConstructor = cls.getEnclosingConstructor();
                if (enclosingConstructor != null) {
                    C18070vi.A0b(str);
                    StringBuilder A102 = AnonymousClass000.A10();
                    A102.append(enclosingConstructor.getName());
                    return AnonymousClass1YF.A0N(str, C17890vO.A0c(A102, '$'), str);
                }
                C18070vi.A0b(str);
                C18070vi.A0d(str, 0);
                int A0C = AnonymousClass1YF.A0C(str, '$', 0, false);
                if (A0C != -1) {
                    String substring = str.substring(A0C + 1, str.length());
                    C18070vi.A0X(substring);
                    return substring;
                }
            } else if (cls.isArray()) {
                Class<?> componentType = cls.getComponentType();
                if (!componentType.isPrimitive() || (A0s = C17880vN.A0s(componentType.getName(), AnonymousClass20F.A03)) == null || (str = C17900vP.A0A(A0s, "Array")) == null) {
                    return "Array";
                }
            } else {
                str = C17880vN.A0s(cls.getName(), AnonymousClass20F.A03);
                if (str == null) {
                    return cls.getSimpleName();
                }
            }
        }
        return str;
    }
}
