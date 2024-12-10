package X;

import com.whatsapp.jid.Jid;

/* renamed from: X.AjZ  reason: case insensitive filesystem */
public final /* synthetic */ class C21406AjZ implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ A0M A01;
    public final /* synthetic */ Jid A02;
    public final /* synthetic */ AnonymousClass206 A03;
    public final /* synthetic */ Integer A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ String A08;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: X.9tm} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: X.9tm} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v18, resolved type: X.9tm} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: X.9tm} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r15 = this;
            java.lang.String r0 = r15.A05
            com.whatsapp.jid.Jid r1 = r15.A02
            X.A0M r6 = r15.A01
            java.lang.String r4 = r15.A06
            X.206 r8 = r15.A03
            int r14 = r15.A00
            java.lang.Integer r9 = r15.A04
            java.lang.String r11 = r15.A07
            java.lang.String r12 = r15.A08
            org.json.JSONObject r13 = X.C17880vN.A16(r0)
            X.1Dw r2 = com.whatsapp.jid.UserJid.Companion
            java.lang.String r0 = X.C72463Mc.A0n(r1)
            com.whatsapp.jid.UserJid r7 = r2.A04(r0)
            java.lang.String r0 = "flow_id"
            java.lang.String r3 = r13.optString(r0)
            X.00H r0 = r6.A03
            java.lang.Object r0 = r0.get()
            X.A0p r0 = (X.C19958A0p) r0
            X.9rh r5 = r0.A01(r4)
            if (r7 == 0) goto L_0x008e
            int r0 = X.C108955ca.A05(r3)
            if (r0 <= 0) goto L_0x008e
            X.00H r0 = r6.A04
            X.A5U r0 = X.AnonymousClass8BR.A0S(r0)
            r2 = 0
            X.9dK r0 = r0.A03(r2, r3)
            if (r0 == 0) goto L_0x007e
            java.util.List r0 = r0.A02
            java.util.Iterator r4 = r0.iterator()
        L_0x004d:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0063
            java.lang.Object r1 = r4.next()
            r0 = r1
            X.9tm r0 = (X.C195709tm) r0
            java.lang.String r0 = r0.A04
            boolean r0 = X.C18070vi.A18(r0, r3)
            if (r0 == 0) goto L_0x004d
            r2 = r1
        L_0x0063:
            X.9tm r2 = (X.C195709tm) r2
            if (r2 == 0) goto L_0x007e
            java.lang.String[] r0 = r2.A09
            if (r0 == 0) goto L_0x0075
            org.json.JSONArray r1 = new org.json.JSONArray
            r1.<init>(r0)
            java.lang.String r0 = "categories"
            r13.put(r0, r1)
        L_0x0075:
            java.lang.String r1 = r2.A00
            if (r1 == 0) goto L_0x007e
            java.lang.String r0 = "extension_status"
            r13.put(r0, r1)
        L_0x007e:
            X.00H r0 = r6.A02
            java.lang.Object r0 = r0.get()
            X.9o1 r0 = (X.C192229o1) r0
            java.lang.Integer r10 = r0.A00(r7)
            X.A0M.A00(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            return
        L_0x008e:
            r7 = 0
            r2 = r5
            r3 = r6
            r4 = r1
            r5 = r8
            r6 = r9
            r8 = r11
            r9 = r12
            r10 = r13
            r11 = r14
            X.A0M.A00(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21406AjZ.run():void");
    }

    public /* synthetic */ C21406AjZ(A0M a0m, Jid jid, AnonymousClass206 r3, Integer num, String str, String str2, String str3, String str4, int i) {
        this.A05 = str;
        this.A02 = jid;
        this.A01 = a0m;
        this.A06 = str2;
        this.A03 = r3;
        this.A00 = i;
        this.A04 = num;
        this.A07 = str3;
        this.A08 = str4;
    }
}
