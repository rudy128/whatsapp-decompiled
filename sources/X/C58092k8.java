package X;

import com.whatsapp.wamsys.JniBridge;

/* renamed from: X.2k8  reason: invalid class name and case insensitive filesystem */
public final class C58092k8 {
    public Integer A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final boolean A05;
    public final C18030ve A06;
    public final JniBridge A07;

    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0127, code lost:
        if (r3.equals("aggressive_prefetch_manual") != false) goto L_0x0129;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0129, code lost:
        r1 = "fetch";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x016f, code lost:
        if (X.AnonymousClass1YF.A0V(r3, r1) != false) goto L_0x012a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x01c6, code lost:
        if (X.AnonymousClass1YF.A0V(r9, r1) != false) goto L_0x01c8;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String A00() {
        /*
            r13 = this;
            X.0ve r3 = r13.A06
            r0 = 5841(0x16d1, float:8.185E-42)
            X.0vf r2 = X.C18040vf.A02
            boolean r1 = X.C18020vd.A05(r2, r3, r0)
            r0 = 0
            if (r1 == 0) goto L_0x00be
            r0 = 8349(0x209d, float:1.17E-41)
            boolean r0 = X.C18020vd.A05(r2, r3, r0)
            if (r0 == 0) goto L_0x00da
            java.lang.String r10 = "994766073959253"
            java.lang.String r11 = r13.A04
            boolean r3 = r13.A05
            r2 = 0
            if (r3 != 0) goto L_0x0034
            java.lang.String r1 = r13.A02
            if (r1 == 0) goto L_0x0034
            java.lang.String r0 = "status_user"
            boolean r0 = X.C18070vi.A18(r11, r0)
            if (r0 == 0) goto L_0x00c7
            java.lang.String r0 = "aggressive_prefetch_manual"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x00c7
        L_0x0033:
            r2 = 2
        L_0x0034:
            org.json.JSONObject r5 = X.C17880vN.A15()
            java.lang.String r4 = r13.A03
            java.lang.String r0 = "media_type"
            r5.put(r0, r4)
            java.lang.String r1 = "download_mode"
            java.lang.String r0 = r13.A02
            r5.put(r1, r0)
            java.lang.String r1 = r13.A01
            if (r1 == 0) goto L_0x0050
            java.lang.String r0 = "source_class"
            r5.put(r0, r1)
        L_0x0050:
            java.lang.String r12 = r5.toString()
            r1 = 5
            if (r3 != 0) goto L_0x00ab
            r1 = 0
            java.lang.String r0 = "image"
            boolean r0 = X.AnonymousClass1YF.A0Y(r4, r0, r1)
            if (r0 != 0) goto L_0x00c5
            java.lang.String r0 = "photo"
            boolean r0 = X.AnonymousClass1YF.A0Y(r4, r0, r1)
            if (r0 != 0) goto L_0x00c5
            java.lang.String r0 = "sticker"
            boolean r0 = X.AnonymousClass1YF.A0Y(r4, r0, r1)
            if (r0 != 0) goto L_0x00c5
            java.lang.String r0 = "ppic"
            boolean r0 = X.AnonymousClass1YF.A0Y(r4, r0, r1)
            if (r0 != 0) goto L_0x00c5
            java.lang.String r0 = "video"
            boolean r0 = X.AnonymousClass1YF.A0Y(r4, r0, r1)
            if (r0 != 0) goto L_0x00c3
            java.lang.String r0 = "gif"
            boolean r0 = X.AnonymousClass1YF.A0Y(r4, r0, r1)
            if (r0 != 0) goto L_0x00c3
            java.lang.String r0 = "ptv"
            boolean r0 = X.AnonymousClass1YF.A0Y(r4, r0, r1)
            if (r0 != 0) goto L_0x00c3
            java.lang.String r0 = "ptt"
            boolean r0 = X.AnonymousClass1YF.A0Y(r4, r0, r1)
            if (r0 != 0) goto L_0x00c1
            java.lang.String r0 = "audio"
            boolean r0 = X.AnonymousClass1YF.A0Y(r4, r0, r1)
            if (r0 != 0) goto L_0x00c1
            java.lang.String r0 = "document"
            boolean r0 = X.AnonymousClass1YF.A0Y(r4, r0, r1)
            if (r0 == 0) goto L_0x00ab
            r1 = 7
        L_0x00ab:
            java.lang.Integer r0 = r13.A00
            if (r0 == 0) goto L_0x00bf
            int r0 = r0.intValue()
        L_0x00b3:
            long r2 = (long) r2
            long r4 = (long) r1
            r6 = 1
            long r8 = (long) r0
            java.lang.Object r0 = com.whatsapp.wamsys.JniBridge.jvidispatchOIIIIOOO(r2, r4, r6, r8, r10, r11, r12)
            java.lang.String r0 = (java.lang.String) r0
        L_0x00be:
            return r0
        L_0x00bf:
            r0 = 0
            goto L_0x00b3
        L_0x00c1:
            r1 = 6
            goto L_0x00ab
        L_0x00c3:
            r1 = 2
            goto L_0x00ab
        L_0x00c5:
            r1 = 1
            goto L_0x00ab
        L_0x00c7:
            java.lang.String r0 = "prefetch"
            boolean r0 = X.AnonymousClass1YF.A0Y(r1, r0, r2)
            if (r0 != 0) goto L_0x00d7
            java.lang.String r0 = "full"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0033
        L_0x00d7:
            r2 = 1
            goto L_0x0034
        L_0x00da:
            org.json.JSONObject r8 = X.C17880vN.A15()
            java.lang.String r7 = "network_tags"
            org.json.JSONObject r6 = X.C17880vN.A15()
            java.lang.String r1 = "product"
            java.lang.String r0 = "994766073959253"
            r6.put(r1, r0)
            java.lang.String r0 = "surface"
            java.lang.String r5 = r13.A04
            r6.put(r0, r5)
            java.lang.String r4 = "request_category"
            boolean r3 = r13.A05
            if (r3 == 0) goto L_0x0172
            java.lang.String r2 = "upload"
        L_0x00fc:
            r6.put(r4, r2)
            java.lang.String r1 = "0"
            java.lang.String r0 = "is_ad"
            r6.put(r0, r1)
            if (r3 != 0) goto L_0x012f
            java.lang.String r3 = r13.A02
            if (r3 == 0) goto L_0x012f
            java.lang.String r0 = "status_user"
            boolean r0 = X.C18070vi.A18(r5, r0)
            java.lang.String r2 = "fetch"
            java.lang.String r1 = "prefetch"
            if (r0 == 0) goto L_0x016b
            java.lang.String r0 = "full"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L_0x012a
            java.lang.String r0 = "aggressive_prefetch_manual"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x016b
        L_0x0129:
            r1 = r2
        L_0x012a:
            java.lang.String r0 = "purpose"
            r6.put(r0, r1)
        L_0x012f:
            java.lang.Integer r0 = r13.A00
            if (r0 == 0) goto L_0x0142
            int r0 = r0.intValue()
            java.lang.String r1 = java.lang.String.valueOf(r0)
            if (r1 == 0) goto L_0x0142
            java.lang.String r0 = "retry_attempt"
            r6.put(r0, r1)
        L_0x0142:
            r8.put(r7, r6)
            java.lang.String r3 = "application_tags"
            org.json.JSONObject r2 = X.C17880vN.A15()
            java.lang.String r1 = r13.A03
            java.lang.String r0 = "media_type"
            r2.put(r0, r1)
            java.lang.String r1 = "download_mode"
            java.lang.String r0 = r13.A02
            r2.put(r1, r0)
            java.lang.String r1 = r13.A01
            if (r1 == 0) goto L_0x0163
            java.lang.String r0 = "source_class"
            r2.put(r0, r1)
        L_0x0163:
            r8.put(r3, r2)
            java.lang.String r0 = r8.toString()
            return r0
        L_0x016b:
            boolean r0 = X.AnonymousClass1YF.A0V(r3, r1)
            if (r0 == 0) goto L_0x0129
            goto L_0x012a
        L_0x0172:
            java.lang.String r9 = r13.A03
            java.lang.String r2 = "other"
            java.lang.String r1 = "image"
            boolean r0 = X.AnonymousClass1YF.A0V(r9, r1)
            if (r0 != 0) goto L_0x01c8
            java.lang.String r0 = "photo"
            boolean r0 = X.AnonymousClass1YF.A0V(r9, r0)
            if (r0 != 0) goto L_0x01c8
            java.lang.String r0 = "sticker"
            boolean r0 = X.AnonymousClass1YF.A0V(r9, r0)
            if (r0 != 0) goto L_0x01c8
            java.lang.String r0 = "ppic"
            boolean r0 = X.AnonymousClass1YF.A0V(r9, r0)
            if (r0 != 0) goto L_0x01c8
            java.lang.String r1 = "video"
            boolean r0 = X.AnonymousClass1YF.A0V(r9, r1)
            if (r0 != 0) goto L_0x01c8
            java.lang.String r0 = "gif"
            boolean r0 = X.AnonymousClass1YF.A0V(r9, r0)
            if (r0 != 0) goto L_0x01c8
            java.lang.String r0 = "ptv"
            boolean r0 = X.AnonymousClass1YF.A0V(r9, r0)
            if (r0 != 0) goto L_0x01c8
            java.lang.String r0 = "ptt"
            boolean r0 = X.AnonymousClass1YF.A0V(r9, r0)
            java.lang.String r1 = "audio"
            if (r0 != 0) goto L_0x01c8
            boolean r0 = X.AnonymousClass1YF.A0V(r9, r1)
            if (r0 != 0) goto L_0x01c8
            java.lang.String r1 = "document"
            boolean r0 = X.AnonymousClass1YF.A0V(r9, r1)
            if (r0 == 0) goto L_0x00fc
        L_0x01c8:
            r2 = r1
            goto L_0x00fc
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C58092k8.A00():java.lang.String");
    }

    public C58092k8(C18030ve r1, JniBridge jniBridge, Integer num, String str, String str2, String str3, String str4, boolean z) {
        C18070vi.A0j(r1, jniBridge);
        this.A06 = r1;
        this.A07 = jniBridge;
        this.A04 = str;
        this.A05 = z;
        this.A03 = str2;
        this.A02 = str3;
        this.A00 = num;
        this.A01 = str4;
    }
}
