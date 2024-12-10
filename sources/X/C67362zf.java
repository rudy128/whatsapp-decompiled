package X;

/* renamed from: X.2zf  reason: invalid class name and case insensitive filesystem */
public final class C67362zf implements AnonymousClass1L0 {
    public final C32221gq A00;
    public final AnonymousClass18K A01;

    public /* synthetic */ void Bqg() {
    }

    public /* synthetic */ void Bqi() {
    }

    public void Bqh() {
        C32221gq r3 = this.A00;
        long A002 = r3.A00("kic_notifications");
        long A003 = r3.A00("kic_group_notifications");
        if (A002 + A003 > 0) {
            C46712Fp r2 = new C46712Fp();
            r2.A03 = Long.valueOf(A002);
            r2.A02 = Long.valueOf(r3.A00("kic_notification_taps"));
            r2.A01 = Long.valueOf(A003);
            r2.A00 = Long.valueOf(r3.A00("kic_group_notification_taps"));
            this.A01.CC4(r2);
        }
        C17900vP.A0J(C18070vi.A03(r3.A01));
    }

    public C67362zf(C32221gq r1, AnonymousClass18K r2) {
        C18070vi.A0j(r2, r1);
        this.A01 = r2;
        this.A00 = r1;
    }
}
