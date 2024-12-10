package X;

import android.app.Activity;

/* renamed from: X.1Vi  reason: invalid class name and case insensitive filesystem */
public final class C27251Vi {
    public final C219217x A00;
    public final AnonymousClass18K A01;
    public final AnonymousClass1NM A02;
    public final C18030ve A03;
    public final AnonymousClass00H A04;
    public final AnonymousClass00H A05;

    public C27251Vi(AnonymousClass1NM r2, C219217x r3, C18030ve r4, AnonymousClass18K r5, AnonymousClass00H r6, AnonymousClass00H r7) {
        C18070vi.A0d(r4, 1);
        C18070vi.A0d(r5, 2);
        C18070vi.A0d(r6, 3);
        C18070vi.A0d(r7, 4);
        C18070vi.A0d(r2, 5);
        C18070vi.A0d(r3, 6);
        this.A03 = r4;
        this.A01 = r5;
        this.A04 = r6;
        this.A05 = r7;
        this.A02 = r2;
        this.A00 = r3;
    }

    public static final boolean A00(Activity activity, AnonymousClass1FR r8, C27251Vi r9, C23501Gn r10, int i) {
        if (r9.A02.A04(r10)) {
            if (((AnonymousClass11Z) r9.A05.get()).A01() >= ((long) C18020vd.A00(C18040vf.A02, r9.A03, i)) * 1048576) {
                return true;
            }
            ((AnonymousClass1KB) r9.A04.get()).CGP(new C21434Ak1(r9, activity, r8, 32));
        }
        return false;
    }
}
