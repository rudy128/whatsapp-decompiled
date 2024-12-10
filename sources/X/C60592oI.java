package X;

import java.util.List;

/* renamed from: X.2oI  reason: invalid class name and case insensitive filesystem */
public abstract class C60592oI {
    public static String A00(C18000vb r8, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return "";
        }
        if (size == 1) {
            return r8.A0F(C17880vN.A0w(list, 0));
        }
        if (size != 2) {
            Object[] objArr = new Object[2];
            A01(r8, list, objArr, 0);
            A01(r8, list, objArr, 1);
            String A0B = r8.A0B(236, objArr);
            for (int i = 2; i < list.size() - 1; i++) {
                A0B = r8.A0B(235, A0B, r8.A0F(C17880vN.A0w(list, i)));
            }
            if (z) {
                return r8.A0B(234, A0B, r8.A0F(C17880vN.A0w(list, size - 1)));
            }
            return r8.A0C(2131891713, A0B, r8.A0F(C17880vN.A0w(list, size - 1)));
        } else if (z) {
            Object[] objArr2 = new Object[2];
            A01(r8, list, objArr2, 0);
            A01(r8, list, objArr2, 1);
            return r8.A0B(237, objArr2);
        } else {
            Object[] objArr3 = new Object[2];
            A01(r8, list, objArr3, 0);
            A01(r8, list, objArr3, 1);
            return r8.A0C(2131891730, objArr3);
        }
    }

    public static void A01(C18000vb r1, List list, Object[] objArr, int i) {
        objArr[i] = r1.A0F((String) list.get(i));
    }
}
