package X;

import com.whatsapp.productinfra.music.api.MusicApi;

/* renamed from: X.7SQ  reason: invalid class name */
public final /* synthetic */ class AnonymousClass7SQ implements C22821Di {
    public final /* synthetic */ MusicApi A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x005d, code lost:
        if (r4 != null) goto L_0x005f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0076  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invoke(java.lang.Object r9) {
        /*
            r8 = this;
            com.whatsapp.productinfra.music.api.MusicApi r1 = r8.A00
            java.lang.String r7 = r8.A01
            java.lang.String r4 = r8.A02
            java.lang.String r6 = r8.A03
            java.lang.String r3 = r8.A04
            X.84U r9 = (X.AnonymousClass84U) r9
            r0 = 5
            X.C18070vi.A0d(r9, r0)
            X.00H r0 = r1.A00
            java.lang.Object r0 = r0.get()
            X.1Ur r0 = (X.C27091Ur) r0
            java.lang.String r0 = r0.A03()
            if (r0 == 0) goto L_0x009e
            java.lang.String r0 = X.C108975cc.A0e(r0)
        L_0x0022:
            java.util.List r1 = X.C18070vi.A0M(r0)
            java.lang.String r0 = "available_countries"
            r9.A02(r0, r1)
            java.lang.String r0 = "search_text"
            r9.A01(r0, r7)
            java.lang.Integer r1 = X.AnonymousClass3MY.A0h()
            java.lang.String r0 = "first"
            r9.A01(r0, r1)
            java.lang.String r1 = "product"
            java.lang.String r0 = "WA_STATUS"
            r9.A01(r1, r0)
            java.lang.String r5 = "result_types"
            java.lang.String r1 = "TRACK"
            if (r4 == 0) goto L_0x008d
            java.util.List r0 = java.util.Collections.singletonList(r1)
        L_0x004a:
            X.C18070vi.A0X(r0)
            r9.A02(r5, r0)
            java.lang.String r0 = "browse_session_id"
            r9.A01(r0, r6)
            if (r7 == 0) goto L_0x007e
            int r0 = r7.length()
            if (r0 == 0) goto L_0x007e
            if (r4 == 0) goto L_0x0074
        L_0x005f:
            int r0 = r4.length()
            if (r0 <= 0) goto L_0x0074
            r0 = 1
            X.7S7 r1 = new X.7S7
            r1.<init>(r4, r0)
        L_0x006b:
            X.84U r1 = X.AnonymousClass84U.A00(r1)
            java.lang.String r0 = "constraint"
            r9.A01(r0, r1)
        L_0x0074:
            if (r3 == 0) goto L_0x007b
            java.lang.String r0 = "end_cursor"
            r9.A01(r0, r3)
        L_0x007b:
            X.1Wu r0 = X.C27621Wu.A00
            return r0
        L_0x007e:
            if (r4 == 0) goto L_0x0086
            int r0 = r4.length()
            if (r0 != 0) goto L_0x005f
        L_0x0086:
            r0 = 4
            X.7S5 r1 = new X.7S5
            r1.<init>(r0)
            goto L_0x006b
        L_0x008d:
            java.lang.String[] r2 = X.C17880vN.A1Z()
            r0 = 0
            r2[r0] = r1
            r1 = 1
            java.lang.String r0 = "ARTIST"
            r2[r1] = r0
            java.util.List r0 = java.util.Arrays.asList(r2)
            goto L_0x004a
        L_0x009e:
            r0 = 0
            goto L_0x0022
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7SQ.invoke(java.lang.Object):java.lang.Object");
    }

    public /* synthetic */ AnonymousClass7SQ(MusicApi musicApi, String str, String str2, String str3, String str4) {
        this.A00 = musicApi;
        this.A01 = str;
        this.A02 = str2;
        this.A03 = str3;
        this.A04 = str4;
    }
}
