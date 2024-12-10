package X;

/* renamed from: X.CsQ  reason: case insensitive filesystem */
public final class C26106CsQ {
    public final C33431io A00;
    public final AnonymousClass18K A01;

    public static final void A01(C26106CsQ csQ, C63592tN r3, Integer num) {
        if (r3 != null) {
            C23834Bqr bqr = new C23834Bqr();
            bqr.A04 = C17880vN.A0n(r3.A01);
            bqr.A03 = C17880vN.A0n(r3.A03);
            bqr.A02 = num;
            bqr.A01 = Integer.valueOf(r3.A02);
            csQ.A01.CC7(bqr);
        }
    }

    public static final void A02(C26106CsQ csQ, Integer num) {
        C63592tN A002 = csQ.A00.A00();
        if (A002 != null) {
            C23830Bqn bqn = new C23830Bqn();
            bqn.A03 = C17880vN.A0n(A002.A01);
            bqn.A02 = C17880vN.A0n(A002.A03);
            bqn.A01 = num;
            csQ.A01.CC7(bqn);
        }
    }

    public C26106CsQ(AnonymousClass18K r1, C33431io r2) {
        C18070vi.A0j(r1, r2);
        this.A01 = r1;
        this.A00 = r2;
    }

    public static final void A00(C26106CsQ csQ, int i) {
        A01(csQ, csQ.A00.A00(), Integer.valueOf(i));
    }
}
