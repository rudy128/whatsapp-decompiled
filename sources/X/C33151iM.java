package X;

import android.content.SharedPreferences;

/* renamed from: X.1iM  reason: invalid class name and case insensitive filesystem */
public final class C33151iM implements C33141iL {
    public final AnonymousClass1M9 A00;
    public final C33131iK A01;
    public final AnonymousClass11S A02;
    public final AnonymousClass10I A03;

    public C33151iM(AnonymousClass11S r2, AnonymousClass1M9 r3, C33131iK r4, AnonymousClass10I r5) {
        C18070vi.A0d(r2, 1);
        C18070vi.A0d(r5, 2);
        C18070vi.A0d(r3, 3);
        this.A02 = r2;
        this.A03 = r5;
        this.A00 = r3;
        this.A01 = r4;
    }

    public void CDb(SharedPreferences sharedPreferences, AnonymousClass1BI r5, AnonymousClass206 r6, C59642me r7) {
        this.A03.CGS(new AnonymousClass7RD(this, r5, 10), "BizIntentFlagRecorder");
    }
}
