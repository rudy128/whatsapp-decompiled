package X;

public class A51 {
    public final AnonymousClass1BI A00;
    public final AnonymousClass205 A01;

    public static A51 A00(AnonymousClass206 r3) {
        return new A51(r3.A0I(), r3.A0v);
    }

    public static void A01(AnonymousClass1BI r4, AnonymousClass206 r5, AnonymousClass205 r6) {
        C60472o5.A01(new C48312Lz(new A51(r4, r6), -1), r5);
    }

    public boolean equals(Object obj) {
        if (obj instanceof A51) {
            A51 a51 = (A51) obj;
            if (this.A01.equals(a51.A01)) {
                AnonymousClass1BI r1 = this.A00;
                AnonymousClass1BI r0 = a51.A00;
                if (r1 == null) {
                    if (r0 != null) {
                        return false;
                    }
                    return true;
                } else if (r1.equals(r0)) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        return AnonymousClass000.A0N(this.A01, 31) + AnonymousClass001.A0k(this.A00);
    }

    public A51(AnonymousClass1BI r1, AnonymousClass205 r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        AnonymousClass8BS.A1D(this.A01, A10);
        A10.append(". [sender_jid=");
        A10.append(this.A00);
        return AnonymousClass000.A0z(A10);
    }
}
