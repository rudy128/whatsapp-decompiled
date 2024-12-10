package X;

import com.whatsapp.util.Log;

/* renamed from: X.64o  reason: invalid class name and case insensitive filesystem */
public final class C1186964o extends C136716uH {
    public final AnonymousClass73F A00;
    public final C86364Ri A01;
    public final C133556oy A02;
    public final AnonymousClass206 A03;

    public static final void A00(C1186964o r2) {
        AnonymousClass205 r0;
        AnonymousClass1BI r1;
        if (!r2.A02.A01()) {
            AnonymousClass206 r02 = r2.A03;
            if (r02 == null || (r0 = r02.A0v) == null || (r1 = r0.A00) == null) {
                Log.e("FlowsMarketingDisclosureUserAction/acceptIfNotAccepted: message is null");
            } else {
                r2.A00.A03(r1);
            }
        }
    }

    public C1186964o(AnonymousClass73F r1, C86364Ri r2, C133556oy r3, AnonymousClass206 r4) {
        C18070vi.A0p(r3, r1, r2);
        this.A03 = r4;
        this.A02 = r3;
        this.A00 = r1;
        this.A01 = r2;
    }
}
