package X;

import java.util.List;

/* renamed from: X.2sR  reason: invalid class name and case insensitive filesystem */
public final class C63062sR {
    public final AnonymousClass10I A00;
    public final AnonymousClass190 A01;
    public final AnonymousClass2U1 A02;

    public static final void A01(C63062sR r3, String str) {
        C17960vV.A0F(false, str);
        r3.A01.A0G("E2eMessageValidator/invalid message sent", str, false);
    }

    public static final void A00(C63062sR r4, C29621ca r5, String str, List list) {
        C29621ca[] r3 = r5.A02;
        if (r3 != null) {
            List A0R = r5.A0R(str);
            C18070vi.A0X(A0R);
            list.addAll(A0R);
            for (C29621ca r0 : r3) {
                C18070vi.A0b(r0);
                A00(r4, r0, str, list);
            }
        }
    }

    public C63062sR(AnonymousClass190 r1, AnonymousClass2U1 r2, AnonymousClass10I r3) {
        C18070vi.A0j(r1, r3);
        this.A01 = r1;
        this.A00 = r3;
        this.A02 = r2;
    }
}
