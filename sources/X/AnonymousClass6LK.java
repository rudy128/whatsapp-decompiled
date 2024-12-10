package X;

/* renamed from: X.6LK  reason: invalid class name */
public abstract class AnonymousClass6LK extends A34 {
    public CharSequence A00;
    public String A01;
    public final /* synthetic */ C140126zz A02;

    public AnonymousClass6LK(C140126zz r1, CharSequence charSequence, String str) {
        this.A02 = r1;
        this.A00 = charSequence;
        this.A01 = str;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x009e  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00b2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object A0G(java.lang.Object[] r19) {
        /*
            r18 = this;
            r3 = r18
            X.6zz r8 = r3.A02
            X.A0r r0 = r8.A08
            java.util.Locale r7 = r0.A01()
            java.lang.CharSequence r10 = r3.A00
            java.lang.String r6 = r3.A01
            X.66R r3 = (X.AnonymousClass66R) r3
            int r5 = r3.A00
            r4 = 1
            if (r5 == 0) goto L_0x00e4
            X.C18070vi.A0d(r10, r4)
            java.lang.Object r3 = r3.A02
            r9 = r3
            X.6zz r9 = (X.C140126zz) r9
            X.0ve r1 = r9.A05
            r0 = 11434(0x2caa, float:1.6022E-41)
            boolean r17 = X.C25291Nq.A04(r1, r0)
            r16 = 5
            java.lang.String r15 = "locale"
            r14 = 4
            r13 = 3
            java.lang.String r12 = "key"
            r0 = 6
            r1 = 2
            r11 = 0
            java.lang.String[] r2 = new java.lang.String[r0]
            r2[r11] = r12
            if (r17 == 0) goto L_0x00c8
            java.lang.String r0 = X.C197569wu.A0c
            r2[r4] = r0
            java.lang.String r0 = "q"
            r2[r1] = r0
            java.lang.String r0 = r10.toString()
            r2[r13] = r0
            r2[r14] = r15
            X.0vb r0 = r9.A04
            java.lang.String r0 = X.AnonymousClass66R.A00(r0, r7)
            r2[r16] = r0
            java.lang.String r0 = "https://tenor.googleapis.com/v2/search"
        L_0x0050:
            java.lang.String r9 = X.AnonymousClass6WU.A00(r0, r2)
            if (r6 == 0) goto L_0x0068
            int r0 = r6.length()
            if (r0 == 0) goto L_0x0068
            java.lang.String[] r1 = new java.lang.String[r1]
            java.lang.String r0 = "pos"
        L_0x0060:
            r1[r11] = r0
            r1[r4] = r6
            java.lang.String r9 = X.AnonymousClass6WU.A00(r9, r1)
        L_0x0068:
            if (r5 == 0) goto L_0x00b2
            X.66T r3 = (X.AnonymousClass66T) r3
            X.63v r1 = new X.63v
            r1.<init>()
            java.lang.String r0 = "Tenor"
            r1.A08 = r0
            java.lang.Integer r0 = X.C17880vN.A0j()
            r1.A00 = r0
            X.0yx r2 = X.AnonymousClass66T.A01(r1, r3, r9)
        L_0x007f:
            if (r2 == 0) goto L_0x008d
            java.lang.Object r0 = r2.A01
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto L_0x008d
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x00b1
        L_0x008d:
            X.62e r1 = new X.62e
            r1.<init>()
            int r0 = r8.A03()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.A00 = r0
            if (r7 == 0) goto L_0x00a4
            java.lang.String r0 = r7.getLanguage()
            r1.A01 = r0
        L_0x00a4:
            X.0vb r0 = r8.A04
            java.lang.String r0 = r0.A05()
            r1.A02 = r0
            X.18K r0 = r8.A06
            r0.CC7(r1)
        L_0x00b1:
            return r2
        L_0x00b2:
            X.66S r3 = (X.AnonymousClass66S) r3
            X.63v r1 = new X.63v
            r1.<init>()
            java.lang.String r0 = "Giphy"
            r1.A08 = r0
            java.lang.Integer r0 = X.C17880vN.A0j()
            r1.A00 = r0
            X.0yx r2 = X.AnonymousClass66S.A00(r1, r3, r9)
            goto L_0x007f
        L_0x00c8:
            java.lang.String r0 = X.C197569wu.A0b
            r2[r4] = r0
            java.lang.String r0 = "tag"
            r2[r1] = r0
            java.lang.String r0 = r10.toString()
            r2[r13] = r0
            r2[r14] = r15
            X.0vb r0 = r9.A04
            java.lang.String r0 = X.AnonymousClass66R.A00(r0, r7)
            r2[r16] = r0
            java.lang.String r0 = "https://wa.tenor.co/v1/search"
            goto L_0x0050
        L_0x00e4:
            X.C18070vi.A0d(r10, r4)
            r0 = 8
            java.lang.String[] r9 = new java.lang.String[r0]
            java.lang.String r0 = "api_key"
            r11 = 0
            r9[r11] = r0
            java.lang.String r0 = X.C197569wu.A0J
            r9[r4] = r0
            java.lang.String r0 = "q"
            r2 = 2
            r9[r2] = r0
            r1 = 3
            java.lang.String r0 = r10.toString()
            r9[r1] = r0
            r1 = 4
            java.lang.String r0 = "lang"
            r9[r1] = r0
            X.73P r1 = X.AnonymousClass73P.A00
            java.lang.Object r3 = r3.A02
            r0 = r3
            X.6zz r0 = (X.C140126zz) r0
            X.0vb r0 = r0.A04
            java.lang.String r1 = r1.A03(r0, r7)
            r0 = 5
            r9[r0] = r1
            r1 = 6
            java.lang.String r0 = "rating"
            r9[r1] = r0
            r1 = 7
            java.lang.String r0 = "pg-13"
            r9[r1] = r0
            java.lang.String r0 = "https://api.giphy.com/v1/gifs/search"
            java.lang.String r9 = X.AnonymousClass6WU.A00(r0, r9)
            if (r6 == 0) goto L_0x0068
            int r0 = r6.length()
            if (r0 == 0) goto L_0x0068
            java.lang.String[] r1 = new java.lang.String[r2]
            java.lang.String r0 = "offset"
            goto L_0x0060
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6LK.A0G(java.lang.Object[]):java.lang.Object");
    }
}
