package X;

import android.os.Bundle;

/* renamed from: X.3V5  reason: invalid class name */
public final class AnonymousClass3V5 extends AnonymousClass1J2 {
    public AnonymousClass1EC A00;
    public final AnonymousClass1DT A01 = AnonymousClass3MW.A0L();
    public final AnonymousClass00H A02;

    public AnonymousClass3V5(AnonymousClass00H r2) {
        C18070vi.A0d(r2, 1);
        this.A02 = r2;
    }

    public static final void A03(AnonymousClass3V5 r3) {
        AnonymousClass1EC r2 = r3.A00;
        if (r2 != null) {
            AnonymousClass3MW.A0Z(r3.A02).A0O(r2, true);
        }
    }

    public static final void A00(C82894Co r3, AnonymousClass3V5 r4) {
        Bundle A0D = C17880vN.A0D();
        A0D.putInt("dialogAction", r3.ordinal());
        A0D.putParcelable("parentGroupJid", r4.A00);
        r4.A01.A0E(A0D);
    }
}
