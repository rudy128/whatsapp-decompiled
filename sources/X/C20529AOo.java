package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.AOo  reason: case insensitive filesystem */
public final class C20529AOo implements C16770sz {
    public final AnonymousClass1DT A00 = AnonymousClass3MW.A0L();
    public final A07 A01;
    public final C41731wy A02 = AnonymousClass3MW.A0o();

    public void Bu6(AnonymousClass0Jv r8) {
        ArrayList A16 = C108955ca.A16(r8, 0);
        int i = 62;
        if (r8.A01.equals("popular_biz")) {
            i = 70;
        }
        for (AF0 af0 : r8.A02) {
            A16.add(new C174098wE(af0, new AWN(this, af0, 0), i));
        }
        String str = r8.A00;
        if (str != null) {
            A16.add(new C174358we(66));
        }
        this.A00.A0E(new C198289y6(new C193899qq(150, str), (List) A16));
    }

    public void Bu7(int i) {
        C193899qq r1;
        AnonymousClass1DT r2 = this.A00;
        C198289y6 r0 = (C198289y6) r2.A06();
        if (r0 != null) {
            r1 = r0.A03;
        } else {
            r1 = null;
        }
        r2.A0E(new C198289y6(r1, i));
    }

    public C20529AOo(A07 a07) {
        this.A01 = a07;
    }
}
