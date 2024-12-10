package X;

/* renamed from: X.9oZ  reason: invalid class name and case insensitive filesystem */
public final class C192539oZ {
    public C194279rT A00;
    public final AnonymousClass18K A01;
    public final AnonymousClass00H A02;
    public final C200710s A03;

    public final void A00() {
        AnonymousClass00H r2;
        String str;
        C194279rT r0 = this.A00;
        String A0Q = C17890vO.A0Q();
        if (r0 == null) {
            r2 = this.A02;
            str = C108985cd.A0f();
        } else {
            r2 = r0.A00;
            str = r0.A02;
        }
        this.A00 = new C194279rT(r2, str, A0Q);
    }

    public final void A01(Integer num, Integer num2, int i) {
        C194279rT r1 = this.A00;
        if (r1 != null) {
            C171298rU r2 = new C171298rU();
            r2.A05 = r1.A02;
            r2.A06 = r1.A01;
            r2.A04 = AnonymousClass3MW.A0y(((C189339iv) r1.A00.get()).A00);
            r2.A02 = num;
            r2.A01 = Integer.valueOf(i);
            r2.A00 = num2;
            r2.A03 = AnonymousClass8BT.A0m();
            C21431Ajy.A00(this.A03, this, r2, 26);
        }
    }

    public C192539oZ(AnonymousClass18K r2, AnonymousClass10I r3, AnonymousClass00H r4) {
        C18070vi.A0o(r3, r2, r4);
        this.A01 = r2;
        this.A02 = r4;
        this.A03 = C200710s.A00(r3);
    }
}
