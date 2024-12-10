package X;

import java.util.concurrent.TimeUnit;

/* renamed from: X.9kL  reason: invalid class name and case insensitive filesystem */
public final class C190079kL {
    public final AnonymousClass11P A00;
    public final AnonymousClass00H A01;

    public final boolean A00(C195409tI r8) {
        C18070vi.A0d(r8, 0);
        return AnonymousClass000.A1R((System.currentTimeMillis() > (r8.A00 + TimeUnit.DAYS.toMillis((long) ((C131996m0) this.A01.get()).A00("survey_expiry_days", 30))) ? 1 : (System.currentTimeMillis() == (r8.A00 + TimeUnit.DAYS.toMillis((long) ((C131996m0) this.A01.get()).A00("survey_expiry_days", 30))) ? 0 : -1)));
    }

    public C190079kL(AnonymousClass11P r1, AnonymousClass00H r2) {
        C18070vi.A0j(r1, r2);
        this.A00 = r1;
        this.A01 = r2;
    }
}
