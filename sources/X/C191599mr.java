package X;

import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.9mr  reason: invalid class name and case insensitive filesystem */
public final class C191599mr {
    public final AnonymousClass11S A00;
    public final AnonymousClass11P A01;
    public final AnonymousClass1TD A02;
    public final AnonymousClass1TA A03;
    public final ConcurrentHashMap A04 = AnonymousClass8BR.A17();
    public final C21501AlA A05;
    public final C18030ve A06;

    public final synchronized String A00(String str) {
        C178119Bw r3;
        String str2;
        C18070vi.A0d(str, 0);
        AnonymousClass2Q4 A042 = this.A03.A04(C40811vJ.A0A(str));
        if (A042 != null) {
            r3 = this.A02.A05(A042.A01());
        } else {
            r3 = null;
        }
        if ((r3 == null || (str2 = r3.A0G) == null) && (str2 = C108945cZ.A1G(str, this.A04)) == null) {
            str2 = AnonymousClass1PP.A00(this.A00, this.A01, true);
        }
        C18070vi.A0b(str2);
        this.A04.put(str, str2);
        if (r3 != null && !C18070vi.A18(r3.A0G, str2)) {
            synchronized (r3) {
                if (r3.A0G != null) {
                    C17960vV.A0F(false, "CallRandomId cannot be set twice!");
                } else {
                    r3.A0G = str2;
                    r3.A02();
                }
            }
            if (C18020vd.A05(C18040vf.A02, this.A06, 12680)) {
                this.A05.execute(new C21431Ajy(this, r3, 25));
            } else {
                this.A02.A0A(r3);
            }
        }
        return str2;
    }

    public C191599mr(AnonymousClass11S r2, C21501AlA alA, AnonymousClass11P r4, AnonymousClass1TD r5, AnonymousClass1TA r6, C18030ve r7) {
        C18070vi.A0w(r4, r2, r5, r6, r7);
        C18070vi.A0d(alA, 6);
        this.A01 = r4;
        this.A00 = r2;
        this.A02 = r5;
        this.A03 = r6;
        this.A06 = r7;
        this.A05 = alA;
    }
}
