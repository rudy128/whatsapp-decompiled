package X;

import android.graphics.Rect;

/* renamed from: X.6yx  reason: invalid class name and case insensitive filesystem */
public final class C139506yx {
    public final AnonymousClass11C A00;
    public final C18030ve A01;
    public final C18010vc A02;

    public final boolean A01(Rect rect, AnonymousClass1D6 r7) {
        int max;
        int A04;
        int A09;
        C18070vi.A0d(r7, 0);
        if (rect != null) {
            max = Math.max(rect.height(), rect.width());
            A04 = rect.height();
            A09 = rect.width();
        } else {
            max = Math.max(AnonymousClass3MZ.A04(r7), C108955ca.A09(r7));
            A04 = AnonymousClass3MZ.A04(r7);
            A09 = C108955ca.A09(r7);
        }
        int min = Math.min(A04, A09);
        C18030ve r2 = this.A01;
        C18040vf r1 = C18040vf.A02;
        if (min >= C18020vd.A00(r1, r2, 4171)) {
            return true;
        }
        if (max <= C18020vd.A00(r1, r2, 4172) || min < C18020vd.A00(r1, r2, 4175)) {
            return false;
        }
        return true;
    }

    public final boolean A02(C62572rc r6) {
        C18070vi.A0d(r6, 0);
        int i = r6.A06;
        int i2 = r6.A08;
        int max = Math.max(i, i2);
        int min = Math.min(i, i2);
        C18030ve r2 = this.A01;
        C18040vf r1 = C18040vf.A02;
        if (min >= C18020vd.A00(r1, r2, 4171)) {
            return true;
        }
        if (max <= C18020vd.A00(r1, r2, 4172) || min < C18020vd.A00(r1, r2, 4175)) {
            return false;
        }
        return true;
    }

    public C139506yx(AnonymousClass11C r1, C18030ve r2, C18010vc r3) {
        C18070vi.A0o(r2, r1, r3);
        this.A01 = r2;
        this.A00 = r1;
        this.A02 = r3;
    }

    public static boolean A00(AnonymousClass00H r3) {
        C139506yx r2 = (C139506yx) r3.get();
        int A022 = C24191Jf.A02(r2.A00, r2.A02);
        C18030ve r22 = r2.A01;
        C18040vf r1 = C18040vf.A02;
        if (A022 < C18020vd.A00(r1, r22, 4154) || !C18020vd.A05(r1, r22, 3935)) {
            return false;
        }
        return true;
    }
}
