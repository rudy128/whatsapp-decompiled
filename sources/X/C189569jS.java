package X;

import java.util.HashMap;

/* renamed from: X.9jS  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C189569jS {
    public final /* synthetic */ C194839sN A00;

    public final void A00(AnonymousClass8pO r7, A7B a7b) {
        String str;
        String str2;
        C194839sN r5 = this.A00;
        HashMap A11 = C17880vN.A11();
        if (a7b == null) {
            AnonymousClass8pX r0 = (AnonymousClass8pX) r7.A08;
            if (r0 != null) {
                int i = r0.A01;
                boolean z = true;
                if ((i & 1) <= 0) {
                    z = false;
                }
                if (!z) {
                    str2 = "sell_pending";
                } else if ((i & 2) <= 0) {
                    str2 = "payout_pending";
                }
                A11.put(str2, "1");
            }
            str = "on_success";
        } else {
            AnonymousClass8BU.A1N(A11, a7b.A00);
            str = "on_failure";
        }
        r5.A01(str, A11);
    }

    public /* synthetic */ C189569jS(C194839sN r1) {
        this.A00 = r1;
    }
}
