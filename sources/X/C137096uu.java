package X;

import android.app.Activity;

/* renamed from: X.6uu  reason: invalid class name and case insensitive filesystem */
public abstract class C137096uu {
    public static C74753cQ A00(Activity activity, AnonymousClass1L9 r4, AnonymousClass194 r5, C40751vD r6, C36531o3 r7, AnonymousClass11C r8, AnonymousClass11P r9, C18000vb r10, C18030ve r11, AnonymousClass18K r12) {
        C74753cQ r2 = new C74753cQ(activity, r4, r5, r6, r7, r8, r9, r10, r11, r12);
        r2.setOnCancelListener(new C1411674o(activity, 1));
        return r2;
    }

    public static void A01(C18030ve r2, AnonymousClass18K r3, Integer num, int i, long j) {
        if (C18020vd.A05(C18040vf.A02, r2, 3299)) {
            AnonymousClass63G r1 = new AnonymousClass63G();
            r1.A02 = C17880vN.A0h();
            if (i != 0) {
                r1.A01 = num;
            }
            r1.A00 = Integer.valueOf(i);
            r1.A03 = Long.valueOf(j);
            r3.CC4(r1);
        }
    }
}
