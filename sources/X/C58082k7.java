package X;

import com.whatsapp.bridge.wfal.WfalManager;

/* renamed from: X.2k7  reason: invalid class name and case insensitive filesystem */
public final class C58082k7 {
    public Long A00;
    public final C30071dL A01;
    public final C35511mM A02;
    public final C19830z4 A03;
    public final C18030ve A04;
    public final AnonymousClass00H A05;
    public final AnonymousClass00H A06;
    public final AnonymousClass00H A07;

    public final void A00(int i, long j) {
        Long l = this.A00;
        if (l != null) {
            this.A01.flowEndFail(l.longValue(), "FLOW_STARTED_BEFORE_PREVIOUS_ENDED", (String) null);
        }
        boolean A002 = WfalManager.A00((WfalManager) this.A06.get(), false);
        C30071dL r6 = this.A01;
        long j2 = 453118619 | (0 << 32);
        r6.BLQ(new C58442kh(C17900vP.A08(Integer.valueOf(i)), false), j2);
        r6.flowAnnotate(j2, "status_session_id", j);
        C35511mM r4 = this.A02;
        Integer num = AnonymousClass00R.A0L;
        r6.flowAnnotate(j2, "is_fb_auto_crossposting_enabled_start", C18070vi.A18(r4.A01(num), AnonymousClass000.A0i()));
        r6.flowAnnotate(j2, "is_fb_account_linked", r4.A06(num));
        r6.flowAnnotate(j2, "is_waffle_v2_enabled", ((C30141dS) this.A07.get()).A00());
        r6.flowAnnotate(j2, "is_waffle_v3_enabled", A002);
        r6.flowAnnotate(j2, "is_channels_enabled", ((AnonymousClass1c4) this.A05.get()).A08());
        if (C18020vd.A05(C18040vf.A02, this.A04, 6084)) {
            r6.flowAnnotate(j2, "encrypted_rid", this.A03.A0d());
        }
        this.A00 = Long.valueOf(j2);
    }

    public C58082k7(C19830z4 r1, C18030ve r2, C30071dL r3, C35511mM r4, AnonymousClass00H r5, AnonymousClass00H r6, AnonymousClass00H r7) {
        C18070vi.A0w(r4, r5, r3, r6, r7);
        C18070vi.A0l(r2, r1);
        this.A02 = r4;
        this.A07 = r5;
        this.A01 = r3;
        this.A05 = r6;
        this.A06 = r7;
        this.A04 = r2;
        this.A03 = r1;
    }
}
