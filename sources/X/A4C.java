package X;

import android.content.Context;

public class A4C {
    public final AnonymousClass11S A00;
    public final AnonymousClass118 A01;
    public final C18000vb A02;
    public final AnonymousClass1QS A03;
    public final AnonymousClass1R2 A04;

    public static String A00(AnonymousClass11P r7, A4C a4c, long j) {
        if (j <= 0) {
            return null;
        }
        Context context = a4c.A01.A00;
        Object[] A1a = AnonymousClass3MW.A1a();
        C18000vb r3 = a4c.A02;
        return C108975cc.A0b(context, A87.A03(r3, AnonymousClass11X.A00.A07(r3, r7.A09(j)), A8I.A00(r3, r7.A09(j))), A1a, 2131896920);
    }

    public static boolean A01(AW0 aw0) {
        int i = aw0.A03;
        if (i == 100 || i == 200) {
            return true;
        }
        return false;
    }

    public A4C(AnonymousClass11S r1, AnonymousClass118 r2, C18000vb r3, AnonymousClass1QS r4, AnonymousClass1R2 r5) {
        this.A01 = r2;
        this.A00 = r1;
        this.A04 = r5;
        this.A02 = r3;
        this.A03 = r4;
    }
}
