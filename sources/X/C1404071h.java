package X;

/* renamed from: X.71h  reason: invalid class name and case insensitive filesystem */
public final class C1404071h {
    public final AnonymousClass11S A00;
    public final C19830z4 A01;
    public final AnonymousClass719 A02;
    public final C40011u0 A03;
    public final AnonymousClass18K A04;

    public static final void A00(AnonymousClass6U1 r3, C1404071h r4) {
        if (r3 instanceof AnonymousClass6KV) {
            C19830z4 r0 = r4.A01;
            r0.A16();
            C17880vN.A1F(C19830z4.A00(r0), "nux_status_banner_ackd_in_updates", true);
        } else if (r3 instanceof AnonymousClass6KU) {
            r4.A03.A00.get();
            throw AnonymousClass000.A0n("Archive status banner is not active - it is not allowed to be changed");
        }
    }

    public static final void A01(C1404071h r2, int i) {
        AnonymousClass18K r22 = r2.A04;
        C170888qp r1 = new C170888qp();
        r1.A01 = 46;
        r1.A00 = Integer.valueOf(i);
        r22.CC7(r1);
    }

    public final void A02(AnonymousClass6U1 r4) {
        if (r4 instanceof AnonymousClass6KU) {
            A01(this, 1);
            AnonymousClass719 r1 = this.A02;
            String A012 = AnonymousClass719.A01(C122536Qt.ARCHIVE);
            C19830z4 r12 = r1.A00;
            C17900vP.A0M(r12, A012, C17890vO.A00(C17890vO.A0B(r12), A012) + 1);
        }
    }

    public C1404071h(AnonymousClass11S r1, C19830z4 r2, AnonymousClass18K r3, AnonymousClass719 r4, C40011u0 r5) {
        C18070vi.A0w(r1, r2, r5, r3, r4);
        this.A00 = r1;
        this.A01 = r2;
        this.A03 = r5;
        this.A04 = r3;
        this.A02 = r4;
    }
}
