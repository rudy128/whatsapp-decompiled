package X;

import java.util.ArrayList;

/* renamed from: X.32G  reason: invalid class name */
public final class AnonymousClass32G implements C72193Kz {
    public void C17(AnonymousClass206 r3, AnonymousClass206 r4) {
        ArrayList arrayList;
        C18070vi.A0d(r4, 1);
        synchronized (r3.A0w) {
            r4.A0X = r3.A0X;
            r4.A0s = r3.A0s;
        }
        r4.A02 = r3.A02;
        r4.A09 = r3.A09;
        r4.A0l(r3.A0h);
        r4.A0N = r3.A0N;
        r4.A0K = r3.A0H();
        r4.A13 = r3.A13;
        if (r3.A0T() != null) {
            arrayList = C17880vN.A10(r3.A0T());
        } else {
            arrayList = null;
        }
        r4.A0i = arrayList;
        r4.A0f = r3.A0f;
        r4.A0e = r3.A0e;
        r4.A0Y = r3.A0Y;
        r4.A0l = r3.A0l;
        r4.A0A = r3.A0A;
        r4.A0R = r3.A0R;
        r4.A0F = r3.A0F;
        r4.A0L = r3.A0L;
        r4.A0W = r3.A0W;
        r4.A0D = r3.A0D;
        r4.A0O = r3.A0O;
        r4.A01 = r3.A01;
        r4.A0E = r3.A0E;
        r4.A06 = r3.A06;
        r4.A0J = r3.A0J;
        if (r3.A0O() != null && r4.A0O() != null) {
            Class<C693336u> cls = C693336u.class;
            if (C18070vi.A09(r3, cls).A03 && r3.A0O().A01() != null) {
                if (!C18070vi.A09(r4, cls).A03 || r4.A0O().A01() == null) {
                    r4.A15(r3.A0O().A01(), false);
                }
            }
        }
    }
}
