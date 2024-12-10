package X;

import android.content.Context;

/* renamed from: X.2Sz  reason: invalid class name and case insensitive filesystem */
public abstract class C50062Sz {
    public static final String A00(Context context, C18000vb r9, C18030ve r10, AnonymousClass22U r11) {
        C18070vi.A0d(r11, 1);
        C18070vi.A0d(context, 2);
        C18070vi.A0d(r9, 3);
        if (C18020vd.A05(C18040vf.A02, r10, 4893)) {
            return C18070vi.A0F(context, 2131893297);
        }
        int i = r11.A00;
        Object[] objArr = new Object[1];
        C17880vN.A1T(objArr, i, 0);
        String A0K = r9.A0K(objArr, 2131755459, (long) i);
        C18070vi.A0X(A0K);
        String str = r11.A07;
        if (str == null || str.length() == 0) {
            return A0K;
        }
        Object[] objArr2 = new Object[2];
        objArr2[0] = A0K;
        String A0q = C17880vN.A0q(context, str, objArr2, 1, 2131892072);
        C18070vi.A0b(A0q);
        return A0q;
    }
}
