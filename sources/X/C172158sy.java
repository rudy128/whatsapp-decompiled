package X;

/* renamed from: X.8sy  reason: invalid class name and case insensitive filesystem */
public final class C172158sy extends C436020e {
    public int A00 = -1;
    public C436220g A01 = C436220g.A01;
    public C437820x A02;
    public C437520u A03;
    public C436520j A04;
    public C172138sw A05;
    public Integer A06;
    public AnonymousClass20E A07;
    public final AnonymousClass00H A08;

    public C172158sy(AnonymousClass00H r2) {
        C18070vi.A0d(r2, 1);
        this.A08 = r2;
    }

    public void A00() {
        String str;
        if (this.A00 != -1) {
            C172138sw A042 = A04();
            A042.A01();
            A042.A03(this.A00);
            AnonymousClass8BT.A1D(A042);
        }
        C172138sw r0 = this.A05;
        if (r0 == null || r0.A00.isEmpty()) {
            A02("At least one system action must be specified using systemActions{}");
        } else {
            if (this.A07 == null) {
                str = "messageClass was not specified.";
            } else if (this.A06 != null) {
                if (this.A04 == null) {
                    C436520j r1 = (C436520j) AnonymousClass8BS.A0a(((C188339hG) this.A08.get()).A04);
                    C18070vi.A0d(r1, 0);
                    this.A04 = r1;
                    r1.A01();
                    AnonymousClass8BT.A1D(r1);
                }
                if (this.A03 == null) {
                    C437520u r12 = (C437520u) AnonymousClass8BS.A0a(((C188339hG) this.A08.get()).A03);
                    C18070vi.A0d(r12, 0);
                    this.A03 = r12;
                    C22319B2w b2w = C22319B2w.A00;
                    r12.A01();
                    b2w.invoke(r12);
                    AnonymousClass8BT.A1D(r12);
                }
                if (this.A02 == null) {
                    C437820x r13 = (C437820x) AnonymousClass8BS.A0a(((C188339hG) this.A08.get()).A05);
                    C18070vi.A0d(r13, 0);
                    this.A02 = r13;
                    C22320B2x b2x = C22320B2x.A00;
                    r13.A01();
                    b2x.invoke(r13);
                    AnonymousClass8BT.A1D(r13);
                    return;
                }
                return;
            } else {
                str = "integrationState was not specified.";
            }
            A02(str);
        }
        throw null;
    }

    public final C436520j A03() {
        if (this.A04 == null) {
            C436520j r1 = (C436520j) AnonymousClass8BS.A0a(((C188339hG) this.A08.get()).A04);
            C18070vi.A0d(r1, 0);
            this.A04 = r1;
            return r1;
        }
        A02("Only one integrations{} is allowed. Multiple detected.");
        throw null;
    }

    public final C172138sw A04() {
        if (this.A05 == null) {
            C172138sw r1 = (C172138sw) AnonymousClass8BS.A0a(((C188339hG) this.A08.get()).A07);
            C18070vi.A0d(r1, 0);
            this.A05 = r1;
            return r1;
        }
        A02("Only one systemActionsBuilder{} is allowed. Multiple detected.");
        throw null;
    }
}
