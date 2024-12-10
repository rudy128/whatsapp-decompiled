package X;

/* renamed from: X.4r2  reason: invalid class name and case insensitive filesystem */
public class C98374r2 implements AnonymousClass8AX {
    public final /* synthetic */ AnonymousClass4aY A00;

    public C98374r2(AnonymousClass4aY r1) {
        this.A00 = r1;
    }

    public void BsH(C46212Dp r8) {
        AnonymousClass205 r1;
        AnonymousClass4aY r12 = this.A00;
        C117015z4 r0 = r12.A3K;
        if (r0 != null && r0.isShowing()) {
            r12.A3K.dismiss();
        } else if (AnonymousClass4aY.A26(r12)) {
            r12.A2O();
        }
        AnonymousClass3VQ r6 = r12.A2b;
        C42431yA r4 = r6.A0v;
        if (r4.BeW()) {
            AnonymousClass1BI r5 = r6.A0u;
            AnonymousClass25L BQq = r4.BQq(r5);
            if (BQq != null && BQq.A03() == C49472Qp.AUDIO && r8.A02 == ((C46212Dp) BQq).A02) {
                AnonymousClass206 r02 = BQq.A01;
                AnonymousClass205 r2 = null;
                if (r02 != null) {
                    r1 = r02.A0v;
                } else {
                    r1 = null;
                }
                AnonymousClass206 r03 = r6.A0G;
                if (r03 != null) {
                    r2 = r03.A0v;
                }
                if (C42171xk.A00(r1, r2)) {
                    r4.CQo(BQq, AnonymousClass11P.A01(r6.A0i));
                    return;
                }
            }
            r4.CGi(r8, r5);
        }
    }

    public void C5D() {
        AnonymousClass4aY r2 = this.A00;
        r2.A2o(r2.A29, false, false);
    }

    public void C6Q() {
        if (this.A00.A26.A00 == null) {
            C18070vi.A11("listener");
            throw null;
        }
    }

    public void C77() {
        if (this.A00.A26.A00 == null) {
            C18070vi.A11("listener");
            throw null;
        }
    }

    public void CAK() {
        AnonymousClass4aY r2 = this.A00;
        AnonymousClass3TA r1 = r2.A2d;
        if (r1.A00 instanceof C75373hL) {
            r1.A0a((String) null);
            r2.A2Q();
        }
        r2.A2u.A07(r2.A3R, 0, C18020vd.A05(C18040vf.A02, r2.A3F, 4549));
    }
}
