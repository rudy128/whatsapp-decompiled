package X;

import java.util.Map;

/* renamed from: X.2ng  reason: invalid class name and case insensitive filesystem */
public abstract class C60272ng {
    public static final void A01(C23381Fv r2, AnonymousClass1GB r3) {
        C23401Fx r1 = ((C23391Fw) r2).A02;
        if (r1 == C23401Fx.INITIALIZED || r1.A00(C23401Fx.STARTED)) {
            r3.A02();
        } else {
            r2.A05(new C91434fg(r2, r3, 1));
        }
    }

    public static final void A00(C23381Fv r3, AnonymousClass1J2 r4, AnonymousClass1GB r5) {
        Object obj;
        C18070vi.A0n(r4, r5, r3);
        Map map = r4.A00;
        synchronized (map) {
            obj = map.get("androidx.lifecycle.savedstate.vm.tag");
        }
        C64992vf r1 = (C64992vf) obj;
        if (r1 != null && !r1.A00) {
            r1.A00(r3, r5);
            A01(r3, r5);
        }
    }
}
