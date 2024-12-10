package X;

import java.io.Serializable;

/* renamed from: X.3Bc  reason: invalid class name and case insensitive filesystem */
public final class C70453Bc implements Serializable {
    public static final long serialVersionUID = 0;
    public final Class c;

    public C70453Bc(Enum[] enumArr) {
        C18070vi.A0d(enumArr, 1);
        Class<?> componentType = enumArr.getClass().getComponentType();
        C18070vi.A0b(componentType);
        this.c = componentType;
    }

    private final Object readResolve() {
        Object[] enumConstants = this.c.getEnumConstants();
        C18070vi.A0X(enumConstants);
        return C19780yz.A00((Enum[]) enumConstants);
    }
}
