package X;

/* renamed from: X.AjB  reason: case insensitive filesystem */
public final /* synthetic */ class C21382AjB implements Runnable {
    public final /* synthetic */ long A00;
    public final /* synthetic */ C1404371k A01;
    public final /* synthetic */ AnonymousClass1BI A02;
    public final /* synthetic */ C179819Ka A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;

    /* JADX WARNING: type inference failed for: r7v0, types: [X.24B, X.206] */
    public final void run() {
        AnonymousClass1BI r3 = this.A02;
        String str = this.A04;
        C1404371k r1 = this.A01;
        C179819Ka r11 = this.A03;
        String str2 = this.A05;
        long j = this.A00;
        String str3 = this.A06;
        AnonymousClass205 A012 = AnonymousClass205.A01(r3, str, false);
        C192379oI r8 = (C192379oI) r1.A07.get();
        AnonymousClass11P r2 = r8.A01;
        ? r7 = new AnonymousClass206(AnonymousClass205.A01(r3, AnonymousClass8BS.A0e(r8.A00, r2), true), 88, AnonymousClass11P.A01(r2));
        r7.A01 = C179819Ka.BOT_FEEDBACK_NEGATIVE_OTHER;
        r7.A01 = r11;
        if (str3 == null || str3.length() == 0) {
            r7.A04 = str2;
            r7.A03 = A012;
            if ((j & 8388608) != 0) {
                r7.A0b(8388608);
            }
        } else {
            r7.A00 = new C20949Ac3(AnonymousClass6R7.VOICE, str3).A00();
        }
        r8.A02.BBM(r7);
    }

    public /* synthetic */ C21382AjB(C1404371k r1, AnonymousClass1BI r2, C179819Ka r3, String str, String str2, String str3, long j) {
        this.A02 = r2;
        this.A04 = str;
        this.A01 = r1;
        this.A03 = r3;
        this.A05 = str2;
        this.A00 = j;
        this.A06 = str3;
    }
}
