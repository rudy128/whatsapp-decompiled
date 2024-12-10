package X;

import java.util.Map;

/* renamed from: X.4XK  reason: invalid class name */
public class AnonymousClass4XK {
    public final AnonymousClass18K A00;
    public final Map A01 = C17880vN.A11();
    public final AnonymousClass11P A02;

    public static void A00(AnonymousClass4XK r2, String str, int i, boolean z) {
        C81523zN r1 = new C81523zN();
        r1.A02 = Integer.valueOf(i);
        r1.A04 = (Long) r2.A01.get(str);
        r1.A00 = Boolean.valueOf(z);
        r2.A00.CC7(r1);
    }

    public void A01(String str, boolean z) {
        C81523zN r1 = new C81523zN();
        r1.A02 = C17880vN.A0l();
        r1.A04 = (Long) this.A01.get(str);
        r1.A00 = AnonymousClass000.A0i();
        r1.A01 = Boolean.valueOf(z);
        this.A00.CC7(r1);
    }

    public AnonymousClass4XK(AnonymousClass11P r2, AnonymousClass18K r3) {
        this.A02 = r2;
        this.A00 = r3;
    }
}
