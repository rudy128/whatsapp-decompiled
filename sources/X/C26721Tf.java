package X;

import com.whatsapp.util.Log;

/* renamed from: X.1Tf  reason: invalid class name and case insensitive filesystem */
public class C26721Tf {
    public final AnonymousClass00H A00;

    public static C203711w A00(C26721Tf r1) {
        return (C203711w) ((C219117w) r1.A00.get()).A01(C203711w.class);
    }

    public C26721Tf(AnonymousClass00H r1) {
        this.A00 = r1;
    }

    public void A01() {
        C203711w A002 = A00(this);
        synchronized (A002) {
            Log.i("companion/registration/start");
            A002.A0h.A01("cmp_reg_start");
            A002.A0P.A01(2);
            C203711w.A00(A002);
        }
    }

    public void A02(String str, boolean z, boolean z2) {
        A00(this).A0A(str, z, z2);
    }
}
