package X;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.6wa  reason: invalid class name and case insensitive filesystem */
public final class C138136wa {
    public final AnonymousClass00H A00;
    public final C18100vl A01 = AnonymousClass1DF.A01(new C148307hE(this));
    public final AnonymousClass11P A02;

    public static final void A00(C138136wa r6) {
        C126986dc r5 = (C126986dc) r6.A00.get();
        Map A12 = AnonymousClass3MW.A12(r6.A01);
        LinkedHashMap A13 = C17880vN.A13();
        Iterator A15 = AnonymousClass000.A15(A12);
        while (A15.hasNext()) {
            Map.Entry A16 = AnonymousClass000.A16(A15);
            if (!((Collection) A16.getValue()).isEmpty()) {
                C108985cd.A1R(A13, A16);
            }
        }
        ArrayList A11 = C72453Mb.A11(A13);
        Iterator A152 = AnonymousClass000.A15(A13);
        while (A152.hasNext()) {
            Map.Entry A162 = AnonymousClass000.A16(A152);
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append(C17880vN.A0x(A162));
            A10.append(',');
            A11.add(AnonymousClass000.A0y(C108995ce.A0X(",", (Iterable) A162.getValue()), A10));
        }
        C17890vO.A0A(r5.A01).putStringSet("battery:wake_ups_time", C29431cG.A12(A11)).apply();
    }

    public C138136wa(AnonymousClass11P r2, AnonymousClass00H r3) {
        C18070vi.A0j(r2, r3);
        this.A02 = r2;
        this.A00 = r3;
    }
}
