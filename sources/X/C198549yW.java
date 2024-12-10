package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.9yW  reason: invalid class name and case insensitive filesystem */
public final class C198549yW {
    public final AnonymousClass11P A00;
    public final C18030ve A01;
    public final Object A02 = C17880vN.A0p();
    public final Map A03 = C17880vN.A13();
    public final C18100vl A04 = AnonymousClass1DF.A01(new C21951AvF(this));
    public final C18100vl A05 = AnonymousClass1DF.A01(new C21952AvG(this));

    public static final void A00(C198549yW r11) {
        synchronized (r11.A02) {
            ArrayList A13 = AnonymousClass000.A13();
            long A012 = AnonymousClass11P.A01(r11.A00);
            Map map = r11.A03;
            Iterator A15 = AnonymousClass000.A15(map);
            while (A15.hasNext()) {
                Map.Entry A16 = AnonymousClass000.A16(A15);
                String A0x = C17880vN.A0x(A16);
                C194999sd r7 = (C194999sd) A16.getValue();
                if (r7.A00 < A012) {
                    r7.A02 = C17880vN.A13();
                }
                if (r7.A01 < A012) {
                    r7.A03 = C17880vN.A13();
                }
                if (r7.A02.isEmpty() && r7.A03.isEmpty()) {
                    A13.add(A0x);
                }
            }
            AnonymousClass4Z0.A02(map, A13.toArray(new String[0]));
        }
    }

    public C198549yW(AnonymousClass11P r2, C18030ve r3) {
        C18070vi.A0j(r3, r2);
        this.A01 = r3;
        this.A00 = r2;
    }
}
