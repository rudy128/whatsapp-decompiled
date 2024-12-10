package X;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.2iz  reason: invalid class name and case insensitive filesystem */
public final class C57382iz {
    public final Map A00;
    public final AnonymousClass1T6 A01;

    public C57382iz(AnonymousClass1T6 r5) {
        C18070vi.A0d(r5, 1);
        this.A01 = r5;
        AnonymousClass1D6[] r2 = new AnonymousClass1D6[2];
        r2[0] = AnonymousClass1D6.A01(C17880vN.A0j(), C17880vN.A13());
        AnonymousClass1D6.A03(0, C17880vN.A13(), r2, 1);
        this.A00 = AnonymousClass1D7.A0B(r2);
    }

    public final void A00() {
        Map map = this.A00;
        Map map2 = (Map) AnonymousClass000.A0w(map, 3);
        if (map2 == null) {
            map2 = C17880vN.A13();
        }
        Map map3 = (Map) AnonymousClass000.A0w(map, 0);
        if (map3 == null) {
            map3 = C17880vN.A13();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(map2);
        linkedHashMap.putAll(map3);
        Iterator A0l = C17890vO.A0l(linkedHashMap);
        while (A0l.hasNext()) {
            AnonymousClass85B r2 = (AnonymousClass85B) A0l.next();
            AnonymousClass1T6 r6 = this.A01;
            AnonymousClass34B r3 = (AnonymousClass34B) r2;
            if (!r3.A0A()) {
                C17900vP.A0Z(r2, "app/mediajobmanager/attempting to cancel non-optimistic job, skipped, job=", AnonymousClass000.A10());
            } else {
                r3.A08(false);
                r3.A0O.A08();
                r6.A09.A02(r3, r3.A02().A06);
                r6.A0B.A08(r3);
                r6.A0D.CGF(new C146807Qr(r6, r3, 11));
            }
        }
        map2.clear();
        map3.clear();
    }
}
