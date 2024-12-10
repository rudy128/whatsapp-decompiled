package X;

/* renamed from: X.8ob  reason: invalid class name */
public final class AnonymousClass8ob extends AnonymousClass9j7 {
    public final AnonymousClass00H A00;
    public final AnonymousClass00H A01;
    public final AnonymousClass00H A02;
    public final AnonymousClass18K A03;
    public final AnonymousClass00H A04;

    public static final void A00(AnonymousClass8ob r5, String str, int i, boolean z) {
        if (!C198929z9.A00(r5.A01)) {
            return;
        }
        if (str == null || str.length() == 0) {
            ((AnonymousClass190) r5.A04.get()).A0H("critical_event_od_signal_without_token_logged", "OD signal sharing tried to log signal without a token.", true, (String) null);
            return;
        }
        C170918qs r1 = new C170918qs();
        r1.A01 = Integer.valueOf(i);
        r1.A02 = str;
        r1.A00 = Boolean.valueOf(z);
        AnonymousClass18K r0 = r5.A03;
        r0.CC7(r1);
        r0.CHJ(true);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass8ob(C48162Lk r2, AnonymousClass18K r3, AnonymousClass00H r4, AnonymousClass00H r5, AnonymousClass00H r6, AnonymousClass00H r7) {
        super(r2);
        C18070vi.A0w(r3, r4, r5, r6, r2);
        C18070vi.A0d(r7, 6);
        this.A03 = r3;
        this.A01 = r4;
        this.A02 = r5;
        this.A00 = r6;
        this.A04 = r7;
    }
}
