package X;

/* renamed from: X.6pw  reason: invalid class name and case insensitive filesystem */
public final class C134056pw {
    public Long A00;
    public String A01;
    public final AnonymousClass00H A02;
    public final AnonymousClass00H A03;
    public final AnonymousClass00H A04;
    public final AnonymousClass00H A05;
    public final AnonymousClass1G4 A06 = C34071js.A00((Object) null);
    public final AnonymousClass00H A07;

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r2 = "";
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String A00() {
        /*
            r3 = this;
            java.lang.String r2 = r3.A01
            if (r2 != 0) goto L_0x0015
            X.00H r0 = r3.A03
            android.content.SharedPreferences r1 = X.C108995ce.A0G(r0)
            java.lang.String r0 = "meta_ai_voice_option_selection_name"
            java.lang.String r2 = ""
            java.lang.String r0 = r1.getString(r0, r2)
            if (r0 == 0) goto L_0x0015
            r2 = r0
        L_0x0015:
            int r0 = r2.length()
            if (r0 != 0) goto L_0x002a
            X.00H r0 = r3.A07
            java.lang.Object r1 = r0.get()
            X.118 r1 = (X.AnonymousClass118) r1
            r0 = 2131892215(0x7f1217f7, float:1.9419172E38)
            java.lang.String r2 = X.C18070vi.A0G(r1, r0)
        L_0x002a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C134056pw.A00():java.lang.String");
    }

    public final boolean A01() {
        long A052;
        Long l = this.A00;
        if (l != null) {
            A052 = l.longValue();
        } else {
            A052 = C17890vO.A05(C108995ce.A0G(this.A03), "meta_ai_voice_option_last_fetch_ts");
        }
        String A0r = C17880vN.A0r(C108995ce.A0G(this.A03), "meta_ai_voice_options");
        if (A0r == null) {
            A0r = "";
        }
        if (A052 == 0 || A0r.length() == 0) {
            return false;
        }
        this.A05.get();
        if (System.currentTimeMillis() - A052 < 86400000) {
            return true;
        }
        return false;
    }

    public C134056pw(AnonymousClass00H r2, AnonymousClass00H r3, AnonymousClass00H r4, AnonymousClass00H r5, AnonymousClass00H r6) {
        C18070vi.A0w(r2, r3, r4, r5, r6);
        this.A04 = r2;
        this.A03 = r3;
        this.A07 = r4;
        this.A05 = r5;
        this.A02 = r6;
    }
}
