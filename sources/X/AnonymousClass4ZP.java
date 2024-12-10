package X;

import com.whatsapp.jid.Jid;
import com.whatsapp.util.Log;

/* renamed from: X.4ZP  reason: invalid class name */
public final class AnonymousClass4ZP {
    public static final AnonymousClass4ZP A00 = new Object();

    public static final void A00(C18030ve r3, AnonymousClass18K r4, AnonymousClass1BI r5, int i, int i2) {
        C18070vi.A0e(r4, 1, r5);
        if (r3 != null && C18020vd.A05(C18040vf.A02, r3, 12224)) {
            C81783zn r1 = new C81783zn();
            r1.A00 = Integer.valueOf(i2);
            r1.A01 = Integer.valueOf(i);
            r1.A02 = r5.getRawString();
            r4.CC7(r1);
        }
    }

    public final void A01(AnonymousClass1E7 r4, C18030ve r5, AnonymousClass18K r6, int i) {
        C18070vi.A0d(r6, 1);
        if (r5 != null && C18020vd.A05(C18040vf.A02, r5, 12224)) {
            if (r4 == null) {
                Log.e("SuspiciousChatUiLoggingUtils/Unexpected null contact when logging");
                return;
            }
            Jid A0g = AnonymousClass3MW.A0g(r4);
            C17960vV.A07(A0g);
            C18070vi.A0X(A0g);
            A00(r5, r6, (AnonymousClass1BI) A0g, 1, i);
        }
    }
}
