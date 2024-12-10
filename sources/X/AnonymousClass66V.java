package X;

import com.whatsapp.util.Log;

/* renamed from: X.66V  reason: invalid class name */
public class AnonymousClass66V extends C133816pX {
    public final int A00 = 0;
    public final Object A01;

    public AnonymousClass66V(AnonymousClass66S r2) {
        this.A01 = r2;
        A02((String) null);
    }

    public final void A02(String str) {
        C140126zz r3 = (C140126zz) this.A01;
        if (!C18020vd.A05(C18040vf.A02, r3.A05, 12694)) {
            Log.e("loadTrendingPage/giphy gif api disabled");
        } else {
            AnonymousClass3MW.A1T(new C121816Lp(this, r3, str, 0), r3.A0A, 0);
        }
    }

    public final void A03(String str) {
        C140126zz r3 = (C140126zz) this.A01;
        if (!C18020vd.A05(C18040vf.A02, r3.A05, 12696)) {
            Log.e("loadTrendingPage/tenor gif api disabled");
        } else {
            C17890vO.A0u(new C121816Lp(this, r3, str, 1), r3.A0A);
        }
    }

    public AnonymousClass66V(AnonymousClass66T r2) {
        this.A01 = r2;
        A03((String) null);
    }
}
