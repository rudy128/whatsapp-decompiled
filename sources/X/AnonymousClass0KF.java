package X;

/* renamed from: X.0KF  reason: invalid class name */
public final class AnonymousClass0KF {
    public int A00;
    public C06970a9 A01;
    public C06970a9 A02;
    public AnonymousClass0XW A03;
    public boolean A04;
    public final /* synthetic */ AnonymousClass0QR A05;

    public AnonymousClass0KF(C06970a9 r1, C06970a9 r2, AnonymousClass0XW r3, AnonymousClass0QR r4, int i, boolean z) {
        this.A05 = r4;
        this.A03 = r3;
        this.A00 = i;
        this.A02 = r1;
        this.A01 = r2;
        this.A04 = z;
    }

    public void A00() {
        AnonymousClass0XW r3 = this.A03.A02;
        C18070vi.A0b(r3);
        AnonymousClass0QR r2 = this.A05;
        if ((2 & r3.A01) != 0) {
            C01850Ad A0A = r3.A0A();
            C18070vi.A0b(A0A);
            C01850Ad A0x = A0A.A0x();
            C01850Ad A0w = A0A.A0w();
            C18070vi.A0b(A0w);
            if (A0x != null) {
                A0x.A1G(A0w);
            }
            A0w.A1H(A0x);
            AnonymousClass0QR.A06(this.A03, r2, A0w);
        }
        if (r3.A07) {
            C04970Ps.A04(r3, -1, 2);
            r3.A0G();
            r3.A0D();
        }
        this.A03 = AnonymousClass0QR.A03(r3);
    }

    public void A01(int i) {
        AnonymousClass0XW r1 = this.A03;
        AnonymousClass0QR r5 = this.A05;
        AnonymousClass0XW A022 = AnonymousClass0QR.A02((C17450ug) this.A01.A01[this.A00 + i], r1);
        this.A03 = A022;
        if (this.A04) {
            AnonymousClass0XW r0 = A022.A02;
            C18070vi.A0b(r0);
            C01850Ad A0A = r0.A0A();
            C18070vi.A0b(A0A);
            AnonymousClass0XW r3 = this.A03;
            C17670v2 A023 = AnonymousClass0QV.A02(r3);
            if (A023 != null) {
                AnonymousClass0BR r12 = new AnonymousClass0BR(A023, r5.A06);
                r3.A0H(r12);
                AnonymousClass0QR.A06(this.A03, r5, r12);
                r12.A1H(A0A.A0x());
                r12.A1G(A0A);
                A0A.A1H(r12);
            } else {
                r3.A0H(A0A);
            }
            this.A03.A0C();
            this.A03.A0F();
            C04970Ps.A02(this.A03);
            return;
        }
        A022.A06 = true;
    }

    public void A02(int i, int i2) {
        AnonymousClass0XW r0 = this.A03.A02;
        C18070vi.A0b(r0);
        this.A03 = r0;
        C06970a9 r02 = this.A02;
        int i3 = this.A00;
        C17450ug r2 = (C17450ug) r02.A01[i3 + i];
        C17450ug r1 = (C17450ug) this.A01.A01[i3 + i2];
        if (!C18070vi.A18(r2, r1)) {
            AnonymousClass0QR.A05(r2, r1, this.A03);
        }
    }
}
