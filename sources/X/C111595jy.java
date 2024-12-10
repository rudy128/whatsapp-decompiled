package X;

import android.graphics.drawable.Drawable;

/* renamed from: X.5jy  reason: invalid class name and case insensitive filesystem */
public final class C111595jy extends C40411uf {
    public static final C111595jy A00 = new Object();

    public /* bridge */ /* synthetic */ boolean A01(Object obj, Object obj2) {
        boolean A18;
        C135996t6 r5 = (C135996t6) obj;
        C135996t6 r6 = (C135996t6) obj2;
        C18070vi.A0h(r5, r6);
        if (!C18070vi.A18(r5.A04, r6.A04) || !C18070vi.A18(r5.A02, r6.A02) || r5.A00 != r6.A00 || !C18070vi.A18(r5.A03, r6.A03)) {
            return false;
        }
        Drawable drawable = r5.A01;
        Drawable drawable2 = r6.A01;
        if (drawable == null) {
            if (drawable2 == null) {
                return true;
            }
            return false;
        } else if (drawable2 == null) {
            return false;
        } else {
            Drawable.ConstantState constantState = drawable.getConstantState();
            Drawable.ConstantState constantState2 = drawable2.getConstantState();
            if (constantState == null && constantState2 == null) {
                A18 = drawable.equals(drawable2);
            } else {
                A18 = C18070vi.A18(constantState, constantState2);
            }
            if (A18) {
                return true;
            }
            return false;
        }
    }

    public /* bridge */ /* synthetic */ boolean A02(Object obj, Object obj2) {
        C135996t6 r3 = (C135996t6) obj;
        C135996t6 r4 = (C135996t6) obj2;
        C18070vi.A0h(r3, r4);
        return C18070vi.A18(r3.A02, r4.A02);
    }
}
