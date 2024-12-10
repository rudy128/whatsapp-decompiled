package X;

import java.util.Collection;

/* renamed from: X.CeK  reason: case insensitive filesystem */
public abstract class C25360CeK {
    public static final void A01(Object[] objArr, int i, int i2) {
        C18070vi.A0d(objArr, 0);
        while (i < i2) {
            objArr[i] = null;
            i++;
        }
    }

    public static final String A00(Collection collection, Object[] objArr, int i, int i2) {
        StringBuilder A0t = BE6.A0t((i2 * 3) + 2);
        A0t.append("[");
        for (int i3 = 0; i3 < i2; i3++) {
            if (i3 > 0) {
                A0t.append(", ");
            }
            Object obj = objArr[i + i3];
            if (obj == collection) {
                A0t.append("(this Collection)");
            } else {
                A0t.append(obj);
            }
        }
        String A0z = AnonymousClass000.A0z(A0t);
        C18070vi.A0X(A0z);
        return A0z;
    }
}
