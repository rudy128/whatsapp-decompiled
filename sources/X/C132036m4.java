package X;

import java.util.List;

/* renamed from: X.6m4  reason: invalid class name and case insensitive filesystem */
public final class C132036m4 {
    public final C1410073x A00;
    public final AnonymousClass70N A01;

    public final void A00() {
        AnonymousClass70N r3 = this.A01;
        C139446yr r1 = r3.A03;
        if (AnonymousClass000.A1a(r1.A00)) {
            List list = r3.A04;
            C1409773u A002 = r1.A00(list);
            C1409773u r0 = r3.A01;
            if (r0 != null && !list.contains(r0)) {
                r3.A01 = null;
            }
            if (A002 instanceof AnonymousClass69V) {
                this.A00.A07();
            }
            this.A00.A06();
        }
    }

    public C132036m4(C1410073x r1, AnonymousClass70N r2) {
        this.A01 = r2;
        this.A00 = r1;
    }
}
