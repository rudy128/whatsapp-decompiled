package X;

import android.app.Activity;

/* renamed from: X.2D3  reason: invalid class name */
public final class AnonymousClass2D3 extends C196289ul {
    public final AnonymousClass00H A00;
    public final AnonymousClass00H A01;
    public final C18100vl A02;
    public final C18100vl A03;
    public final AnonymousClass00H A04;

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0032, code lost:
        if (r4.length() == 0) goto L_0x0034;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String A08(android.content.Context r6, X.C20285AEt r7, X.C20271AEe r8) {
        /*
            r5 = this;
            r0 = 0
            X.C18070vi.A0d(r6, r0)
            if (r8 == 0) goto L_0x000c
            java.lang.String r0 = r8.A00
        L_0x0008:
            r4 = 0
            if (r0 == 0) goto L_0x0029
            goto L_0x000e
        L_0x000c:
            r0 = 0
            goto L_0x0008
        L_0x000e:
            org.json.JSONObject r1 = X.C17880vN.A16(r0)     // Catch:{ JSONException -> 0x0019 }
            java.lang.String r0 = "catalog_product_id"
            java.lang.String r4 = r1.getString(r0)     // Catch:{ JSONException -> 0x0019 }
            goto L_0x0029
        L_0x0019:
            X.0vl r0 = r5.A02
            java.lang.Object r3 = r0.getValue()
            X.190 r3 = (X.AnonymousClass190) r3
            java.lang.String r2 = "malformed json"
            r1 = 0
            java.lang.String r0 = "CatalogCtaAction/extractProductId"
            r3.A0G(r0, r2, r1)
        L_0x0029:
            if (r4 == 0) goto L_0x0034
            int r1 = r4.length()
            r0 = 2131897871(0x7f122e0f, float:1.9430644E38)
            if (r1 != 0) goto L_0x0037
        L_0x0034:
            r0 = 2131897870(0x7f122e0e, float:1.9430642E38)
        L_0x0037:
            java.lang.String r0 = r6.getString(r0)
            X.C18070vi.A0b(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2D3.A08(android.content.Context, X.AEt, X.AEe):java.lang.String");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00c4, code lost:
        if (r3.length() == 0) goto L_0x00c6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0021, code lost:
        if (r3.length() != 0) goto L_0x0030;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0A(android.app.Activity r8, X.AnonymousClass5XY r9, X.AnonymousClass206 r10, X.C20271AEe r11, int r12) {
        /*
            r7 = this;
            r6 = 0
            X.C18070vi.A0d(r8, r6)
            X.C18070vi.A0k(r10, r11)
            java.lang.String r0 = r11.A00
            java.lang.String r2 = "CatalogCtaAction/extractBizPhone"
            r5 = 0
            if (r0 == 0) goto L_0x000f
            goto L_0x0011
        L_0x000f:
            r3 = r5
            goto L_0x0023
        L_0x0011:
            org.json.JSONObject r1 = X.C17880vN.A16(r0)     // Catch:{ JSONException -> 0x0032 }
            java.lang.String r0 = "business_phone_number"
            java.lang.String r3 = r1.getString(r0)     // Catch:{ JSONException -> 0x0032 }
            if (r3 == 0) goto L_0x0023
            int r0 = r3.length()     // Catch:{ JSONException -> 0x0032 }
            if (r0 != 0) goto L_0x0030
        L_0x0023:
            X.0vl r0 = r7.A02     // Catch:{ JSONException -> 0x0032 }
            java.lang.Object r1 = r0.getValue()     // Catch:{ JSONException -> 0x0032 }
            X.190 r1 = (X.AnonymousClass190) r1     // Catch:{ JSONException -> 0x0032 }
            java.lang.String r0 = "malformed phone number"
            r1.A0G(r2, r0, r6)     // Catch:{ JSONException -> 0x0032 }
        L_0x0030:
            r5 = r3
            goto L_0x003f
        L_0x0032:
            X.0vl r0 = r7.A02
            java.lang.Object r1 = r0.getValue()
            X.190 r1 = (X.AnonymousClass190) r1
            java.lang.String r0 = "malformed json"
            r1.A0G(r2, r0, r6)
        L_0x003f:
            java.lang.String r0 = r11.A00
            r3 = 0
            if (r0 == 0) goto L_0x005e
            org.json.JSONObject r1 = X.C17880vN.A16(r0)     // Catch:{ JSONException -> 0x004f }
            java.lang.String r0 = "catalog_product_id"
            java.lang.String r3 = r1.getString(r0)     // Catch:{ JSONException -> 0x004f }
            goto L_0x005e
        L_0x004f:
            X.0vl r0 = r7.A02
            java.lang.Object r2 = r0.getValue()
            X.190 r2 = (X.AnonymousClass190) r2
            java.lang.String r1 = "malformed json"
            java.lang.String r0 = "CatalogCtaAction/extractProductId"
            r2.A0G(r0, r1, r6)
        L_0x005e:
            java.lang.String r0 = r11.A00
            r4 = 0
            if (r0 == 0) goto L_0x007d
            org.json.JSONObject r1 = X.C17880vN.A16(r0)     // Catch:{ JSONException -> 0x006e }
            java.lang.String r0 = "message_origin"
            java.lang.String r4 = r1.getString(r0)     // Catch:{ JSONException -> 0x006e }
            goto L_0x007d
        L_0x006e:
            X.0vl r0 = r7.A02
            java.lang.Object r2 = r0.getValue()
            X.190 r2 = (X.AnonymousClass190) r2
            java.lang.String r1 = "malformed json"
            java.lang.String r0 = "CatalogCtaAction/extractMessageSource"
            r2.A0G(r0, r1, r6)
        L_0x007d:
            if (r5 == 0) goto L_0x010c
            int r0 = r5.length()
            if (r0 == 0) goto L_0x010c
            if (r3 == 0) goto L_0x0102
            int r0 = r3.length()
            if (r0 == 0) goto L_0x0102
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "/p/"
            X.C17900vP.A0d(r0, r3, r1)
        L_0x0096:
            java.lang.String r0 = X.AnonymousClass000.A0y(r5, r1)
            X.2pH r0 = X.C61192pH.A00(r0)
            android.net.Uri r0 = r0.A00
            java.lang.String r0 = r0.toString()
            android.net.Uri r2 = android.net.Uri.parse(r0)
            X.0vl r0 = r7.A03
            java.lang.Object r1 = r0.getValue()
            X.1nl r1 = (X.C36361nl) r1
            r0 = 0
            r1.CGU(r8, r2, r0)
        L_0x00b4:
            r0 = 4194304(0x400000, double:2.0722615E-317)
            boolean r0 = r10.A11(r0)
            if (r0 == 0) goto L_0x00d6
            if (r3 == 0) goto L_0x00c6
            int r0 = r3.length()
            r2 = 4
            if (r0 != 0) goto L_0x00c7
        L_0x00c6:
            r2 = 3
        L_0x00c7:
            X.00H r0 = r7.A01
            java.lang.Object r1 = r0.get()
            X.6nI r1 = (X.C132656nI) r1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r12)
            r1.A00(r10, r0, r2)
        L_0x00d6:
            com.whatsapp.jid.UserJid r2 = r10.A0I()
            if (r2 == 0) goto L_0x00e8
            X.00H r0 = r7.A00
            java.lang.Object r1 = r0.get()
            X.A5M r1 = (X.A5M) r1
            r0 = 4
            r1.A02(r2, r10, r0)
        L_0x00e8:
            java.lang.String r0 = "ctwa_auto_reply"
            boolean r0 = X.C18070vi.A18(r4, r0)
            if (r0 == 0) goto L_0x0101
            X.00H r0 = r7.A04
            java.lang.Object r2 = r0.get()
            X.6lF r2 = (X.C131526lF) r2
            com.whatsapp.jid.UserJid r1 = r10.A0I()
            java.lang.String r0 = "cta_catalog"
            r2.A00(r1, r0)
        L_0x0101:
            return
        L_0x0102:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "c/"
            r1.append(r0)
            goto L_0x0096
        L_0x010c:
            X.0vl r0 = r7.A02
            java.lang.Object r2 = r0.getValue()
            X.190 r2 = (X.AnonymousClass190) r2
            java.lang.String r1 = "malformed phone passed through"
            java.lang.String r0 = "CatalogCtaAction/execute"
            r2.A0G(r0, r1, r6)
            goto L_0x00b4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2D3.A0A(android.app.Activity, X.5XY, X.206, X.AEe, int):void");
    }

    public boolean A0E(C18030ve r3) {
        C18070vi.A0d(r3, 1);
        return !C18020vd.A05(C18040vf.A02, r3, 4957);
    }

    public boolean A0F(C18030ve r3, C166418cr r4) {
        C18070vi.A0d(r3, 1);
        return !C18020vd.A05(C18040vf.A02, r3, 4957);
    }

    public AnonymousClass2D3(AnonymousClass00H r3, AnonymousClass00H r4, AnonymousClass00H r5, AnonymousClass00H r6, AnonymousClass00H r7) {
        C18070vi.A0w(r3, r4, r5, r6, r7);
        this.A01 = r5;
        this.A00 = r6;
        this.A04 = r7;
        this.A02 = new C18110vm(new C147967gg(r3, 0));
        this.A03 = new C18110vm(new C147967gg(r4, 1));
    }

    public String A07() {
        return "cta_catalog";
    }

    public void A0B(Activity activity, AnonymousClass5XY r3, AnonymousClass206 r4, C20271AEe aEe, Class cls) {
        throw C17880vN.A0y();
    }
}
