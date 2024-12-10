package X;

/* renamed from: X.2zh  reason: invalid class name and case insensitive filesystem */
public final class C67382zh implements AnonymousClass1L0 {
    public final C25481Oj A00;
    public final C18030ve A01;
    public final AnonymousClass18K A02;

    public /* synthetic */ void Bqg() {
    }

    public /* synthetic */ void Bqi() {
    }

    public void Bqh() {
        if (C18020vd.A05(C18040vf.A02, this.A01, 9669)) {
            AnonymousClass18K r3 = this.A02;
            C25481Oj r1 = this.A00;
            AnonymousClass2GN r2 = new AnonymousClass2GN();
            r2.A00 = Boolean.valueOf(r1.A01.A2H());
            C25451Og r4 = r1.A00;
            r2.A03 = C17880vN.A0n(C25451Og.A00(r4).getInt("emoji_reply_count", 0));
            r2.A05 = C17880vN.A0n(C25451Og.A00(r4).getInt("single_emoji_send_count", 0));
            r2.A04 = C17880vN.A0n(C25451Og.A00(r4).getInt("single_emoji_receive_count", 0));
            r2.A02 = C17880vN.A0n(C25451Og.A00(r4).getInt("animated_emoji_send_count", 0));
            r2.A01 = C17880vN.A0n(C25451Og.A00(r4).getInt("animated_emoji_receive_count", 0));
            C17900vP.A0J(C25451Og.A00(r4));
            r3.CC4(r2);
        }
    }

    public C67382zh(C25481Oj r1, C18030ve r2, AnonymousClass18K r3) {
        C18070vi.A0o(r2, r3, r1);
        this.A01 = r2;
        this.A02 = r3;
        this.A00 = r1;
    }
}
