package X;

import android.os.Build;

/* renamed from: X.17n  reason: invalid class name and case insensitive filesystem */
public class C218217n implements C201511a {
    public final AnonymousClass118 A00;
    public final AnonymousClass1MZ A01;
    public final AnonymousClass1Cd A02;
    public final AnonymousClass1CM A03;
    public final AnonymousClass1Nb A04;

    public String A00(AnonymousClass1BI r4, boolean z) {
        if (Build.VERSION.SDK_INT < 26) {
            return null;
        }
        C43551zz r2 = (C43551zz) this.A04.A0a(r4);
        boolean equalsIgnoreCase = "Silent".equalsIgnoreCase(r2.A07());
        if (z || equalsIgnoreCase) {
            return r2.A0F();
        }
        return r2.A0E();
    }

    public C218217n(AnonymousClass118 r1, AnonymousClass1MZ r2, AnonymousClass1Cd r3, AnonymousClass1CM r4, AnonymousClass1Nb r5) {
        this.A00 = r1;
        this.A04 = r5;
        this.A02 = r3;
        this.A01 = r2;
        this.A03 = r4;
    }
}
