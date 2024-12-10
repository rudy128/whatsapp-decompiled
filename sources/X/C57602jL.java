package X;

/* renamed from: X.2jL  reason: invalid class name and case insensitive filesystem */
public final class C57602jL {
    public C60162nU A00;
    public final AnonymousClass00H A01;
    public final C30141dS A02;

    public C57602jL(C19830z4 r2, C18030ve r3, C30071dL r4, C56972iK r5, C30141dS r6, AnonymousClass00H r7) {
        C18070vi.A0w(r4, r3, r2, r5, r6);
        C18070vi.A0d(r7, 6);
        this.A02 = r6;
        this.A01 = r7;
        this.A00 = new C60162nU(r2, r3, r4, r5);
    }

    public final void A00(int i, long j) {
        String str;
        switch (i) {
            case 3:
                str = "status_tab_camera";
                break;
            case 4:
                str = "status_tab_pen";
                break;
            case 5:
                str = "status_deeplink";
                break;
            case 6:
                str = "channel_post";
                break;
            case 7:
                str = "channel_link";
                break;
            default:
                str = "unknown_entry_point";
                break;
        }
        AnonymousClass00H r2 = this.A01;
        Integer num = AnonymousClass00R.A0L;
        boolean A06 = ((C35511mM) r2.get()).A06(num);
        boolean A002 = this.A02.A00();
        boolean A18 = C18070vi.A18(((C35511mM) r2.get()).A01(num), AnonymousClass000.A0i());
        C60162nU r1 = this.A00;
        r1.A01(453122511, str, j);
        r1.A04("tap_status_entry");
        r1.A05("status_creation_entry_point", str);
        r1.A06("is_fb_linked", A06);
        r1.A06("is_waffle_v2_enabled", A002);
        r1.A06("is_fb_auto_crossposting_enabled_start", A18);
    }
}
