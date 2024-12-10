package X;

import android.content.Intent;
import android.os.Bundle;

/* renamed from: X.6No  reason: invalid class name */
public class AnonymousClass6No extends C115075tM {
    public void A04(AnonymousClass86W r4) {
        try {
            if (r4.BM2().A0I(35, false)) {
                A02().A0E();
                return;
            }
            String A0D = r4.BM2().A0D(48);
            if (A0D == null) {
                A0D = C108985cd.A0k(r4);
            }
            this.A01 = A0D;
            C115075tM.A00(this);
        } catch (ClassCastException e) {
            C17900vP.A0X(e, "Bloks: Invalid navigation bar type", AnonymousClass000.A10());
        }
    }

    public void A03(Intent intent, Bundle bundle) {
        C115075tM.A00(this);
    }
}
