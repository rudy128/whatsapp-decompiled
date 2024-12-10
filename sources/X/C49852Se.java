package X;

import android.content.Context;

/* renamed from: X.2Se  reason: invalid class name and case insensitive filesystem */
public abstract class C49852Se {
    public static final String A00(Context context, C18000vb r8, long j, long j2) {
        String A0q;
        int A17 = C18070vi.A17(context, r8);
        if (j2 == 0 && j == 0) {
            return "";
        }
        if (j2 == 0) {
            Object[] objArr = new Object[A17];
            objArr[0] = Long.valueOf(j);
            A0q = r8.A0K(objArr, 2131755299, j);
        } else if (j == 0) {
            Object[] objArr2 = new Object[A17];
            objArr2[0] = Long.valueOf(j2);
            A0q = r8.A0K(objArr2, 2131755302, j2);
        } else {
            Object[] objArr3 = new Object[2];
            Object[] objArr4 = new Object[A17];
            objArr4[0] = Long.valueOf(j);
            objArr3[0] = r8.A0K(objArr4, 2131755299, j);
            Object[] objArr5 = new Object[A17];
            objArr5[0] = Long.valueOf(j2);
            A0q = C17880vN.A0q(context, r8.A0K(objArr5, 2131755302, j2), objArr3, A17, 2131893096);
        }
        C18070vi.A0X(A0q);
        return A0q;
    }
}
