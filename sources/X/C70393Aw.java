package X;

/* renamed from: X.3Aw  reason: invalid class name and case insensitive filesystem */
public final class C70393Aw implements AnonymousClass3LP {
    public final AnonymousClass00H A00;
    public final AnonymousClass00H A01;
    public final AnonymousClass00H A02;

    public void CCx() {
        C31081ez.A02("AccountLinkingDataDeleter/purgeData: Purging waffle cache and user data");
        C34951lN r1 = (C34951lN) this.A02.get();
        synchronized (r1) {
            C17900vP.A0J(r1.A04());
        }
        ((C33631j8) ((C34991lS) this.A01.get()).A00.get()).A07(C35011lV.A00);
        C35051lZ r2 = (C35051lZ) this.A00.get();
        C17880vN.A1B(C18070vi.A02(r2), "is_wfal_link_active");
        C17880vN.A1B(C18070vi.A02(r2), "pref_ping_validity_time");
        C17880vN.A1B(C18070vi.A02(r2), "waffle_machine_id");
        C17880vN.A1B(C18070vi.A02(r2), "pref_auto_crossposting_on_fb");
        C17880vN.A1B(C18070vi.A02(r2), "pref_auto_crossposting_on_ig");
    }

    public C70393Aw(AnonymousClass00H r1, AnonymousClass00H r2, AnonymousClass00H r3) {
        C18070vi.A0o(r1, r2, r3);
        this.A01 = r1;
        this.A02 = r2;
        this.A00 = r3;
    }
}
