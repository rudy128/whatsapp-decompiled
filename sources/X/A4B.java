package X;

import java.util.Iterator;
import java.util.LinkedHashMap;

public final class A4B {
    public C193309ps A00;
    public final AnonymousClass00H A01;
    public final LinkedHashMap A02 = C17880vN.A13();
    public final C18100vl A03;
    public final AnonymousClass00H A04;

    public static final synchronized void A00(A4B a4b) {
        synchronized (a4b) {
            Iterator A15 = AnonymousClass000.A15(a4b.A02);
            if (A15.hasNext()) {
                C193309ps r2 = (C193309ps) C17890vO.A0P(A15);
                a4b.A00 = r2;
                if (r2 != null) {
                    AnonymousClass3MX.A0x(a4b.A04).CGN(r2.A00);
                }
            } else {
                a4b.A00 = null;
            }
        }
    }

    public static final synchronized void A01(A4B a4b, int i) {
        synchronized (a4b) {
            LinkedHashMap linkedHashMap = a4b.A02;
            Integer valueOf = Integer.valueOf(i);
            C193309ps r1 = (C193309ps) linkedHashMap.get(valueOf);
            if (r1 != null) {
                linkedHashMap.remove(valueOf);
                if (r1.equals(a4b.A00)) {
                    A00(a4b);
                }
            }
        }
    }

    public A4B(C18030ve r3, AnonymousClass00H r4, AnonymousClass00H r5) {
        C18070vi.A0o(r3, r4, r5);
        this.A04 = r4;
        this.A01 = r5;
        this.A03 = AnonymousClass1DF.A00(C87484Vt.A00(r3), new C21835AtN(this));
    }
}
