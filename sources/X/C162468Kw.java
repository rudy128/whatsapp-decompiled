package X;

import java.util.ArrayList;

/* renamed from: X.8Kw  reason: invalid class name and case insensitive filesystem */
public final class C162468Kw extends C192519oX {
    public final ArrayList A00 = C17880vN.A0z(16);

    public static void A00(C162468Kw r1, Object obj) {
        if (r1.A02) {
            r1.A00.add(obj);
            return;
        }
        throw AnonymousClass000.A0n("Expected object to be mutable");
    }

    public void A06(C192519oX r2) {
        if (this.A02) {
            r2.A04();
            A00(this, r2);
            r2.A04();
            r2.A00 = this;
            return;
        }
        throw AnonymousClass000.A0n("Expected object to be mutable");
    }
}
