package X;

/* renamed from: X.AhT  reason: case insensitive filesystem */
public class C21282AhT implements C22470B9c {
    public final int A00;
    public final Object A01;

    public C21282AhT(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public static void A00(Object[] objArr, int i, int i2, Object obj) {
        objArr[i2] = new C21282AhT(obj, i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:114:0x03e1, code lost:
        return new X.AnonymousClass9D6(r9, r0, r4, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x042e, code lost:
        r2 = (java.lang.String) r8.A04(r9, java.lang.String.class, X.C108975cc.A0X(), 256L, r1, r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x0441, code lost:
        if (r2 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x044d, code lost:
        return new X.AnonymousClass9DN(r9, new X.AnonymousClass9CY(r9, r2), r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x04f5, code lost:
        r0 = (java.lang.Number) r8.A05(r9, r18, r11, r12, r21, r22, r23);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x0503, code lost:
        if (r0 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x0510, code lost:
        return new X.AnonymousClass9D6(r9, r3, r15, r0.longValue());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:240:0x0888, code lost:
        r0 = (java.lang.String) r8.A04(r9, r10, r11, java.lang.Long.valueOf(r2), r1, r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:241:0x0893, code lost:
        if (r0 != null) goto L_0x08a8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:242:0x0895, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:250:0x08ad, code lost:
        return new X.AnonymousClass9CY(r9, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:251:?, code lost:
        return new X.AnonymousClass9DR(r9, r15 ? 1 : 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:254:?, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:274:?, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:300:?, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:308:?, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0149, code lost:
        return new X.AnonymousClass9DH(r4, r9, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0226, code lost:
        r0 = (java.lang.Number) r8.A05(r9, r10, r11, r12, java.lang.Long.valueOf(r2), r14, r15);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0230, code lost:
        if (r0 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x023b, code lost:
        return new X.C178189Cd(r9, r0.longValue());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0049, code lost:
        if (r8.A05(r9, r18, r11, r12, r21, r22, r23) == null) goto L_?;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object BCF(X.C29621ca r25, X.C62672rm r26) {
        /*
            r24 = this;
            r0 = r24
            int r1 = r0.A00
            java.lang.Object r0 = r0.A01
            r9 = r25
            r8 = r26
            switch(r1) {
                case 0: goto L_0x086f;
                case 1: goto L_0x084f;
                case 2: goto L_0x07ec;
                case 3: goto L_0x0789;
                case 4: goto L_0x0752;
                case 5: goto L_0x000d;
                case 6: goto L_0x06fc;
                case 7: goto L_0x06a6;
                case 8: goto L_0x0752;
                case 9: goto L_0x000d;
                case 10: goto L_0x0669;
                case 11: goto L_0x0613;
                case 12: goto L_0x05bd;
                case 13: goto L_0x0752;
                case 14: goto L_0x000d;
                case 15: goto L_0x0567;
                case 16: goto L_0x0511;
                case 17: goto L_0x0752;
                case 18: goto L_0x000d;
                case 19: goto L_0x04c5;
                case 20: goto L_0x048d;
                case 21: goto L_0x0469;
                case 22: goto L_0x08a3;
                case 23: goto L_0x044e;
                case 24: goto L_0x0413;
                case 25: goto L_0x03fb;
                case 26: goto L_0x03e2;
                case 27: goto L_0x039d;
                case 28: goto L_0x0361;
                case 29: goto L_0x0324;
                case 30: goto L_0x02e5;
                case 31: goto L_0x02cd;
                case 32: goto L_0x089b;
                case 33: goto L_0x0896;
                case 34: goto L_0x027b;
                case 35: goto L_0x0324;
                case 36: goto L_0x023c;
                case 37: goto L_0x02e5;
                case 38: goto L_0x039d;
                case 39: goto L_0x0361;
                case 40: goto L_0x089b;
                case 41: goto L_0x02cd;
                case 42: goto L_0x01fc;
                case 43: goto L_0x01d1;
                case 44: goto L_0x01a6;
                case 45: goto L_0x017a;
                case 46: goto L_0x014a;
                case 47: goto L_0x00dd;
                case 48: goto L_0x0051;
                case 49: goto L_0x0113;
                default: goto L_0x000d;
            }
        L_0x000d:
            r15 = 0
            boolean r2 = X.AnonymousClass8BX.A1U(r0, r9, r8)
            boolean r0 = X.AnonymousClass8BR.A1R(r9, r8)
            r1 = 0
            if (r0 == 0) goto L_0x0050
            java.lang.String[] r14 = X.AnonymousClass8BS.A1U(r2)
            java.lang.Class<java.lang.String> r10 = java.lang.String.class
            java.lang.Long r11 = X.AnonymousClass8BU.A0i()
            java.lang.Long r12 = X.AnonymousClass8BU.A0j()
            java.lang.String r13 = "forbidden"
            r23 = 0
            java.lang.Object r0 = r8.A05(r9, r10, r11, r12, r13, r14, r15)
            if (r0 == 0) goto L_0x0050
            java.lang.String[] r22 = X.AnonymousClass8BS.A1S(r2)
            java.lang.Class r18 = java.lang.Long.TYPE
            r2 = 403(0x193, double:1.99E-321)
            java.lang.Long r21 = java.lang.Long.valueOf(r2)
        L_0x003d:
            r16 = r8
            r17 = r9
            r19 = r11
            r20 = r12
            java.lang.Object r0 = r16.A05(r17, r18, r19, r20, r21, r22, r23)
            if (r0 == 0) goto L_0x0050
            X.9DR r1 = new X.9DR
            r1.<init>(r9, r15)
        L_0x0050:
            return r1
        L_0x0051:
            r5 = 0
            boolean r6 = X.C18070vi.A17(r0, r9)
            r7 = 2
            X.C18070vi.A0d(r8, r7)
            java.lang.String r0 = "section"
            boolean r0 = r8.A09(r9, r0)
            r1 = 0
            if (r0 == 0) goto L_0x0050
            r4 = 3
            java.lang.String[] r2 = new java.lang.String[r4]
            java.lang.String r0 = "all"
            r2[r5] = r0
            java.lang.String r0 = "category"
            r2[r6] = r0
            java.lang.String r0 = "featured"
            java.util.List r2 = X.C18070vi.A0O(r0, r2, r7)
            java.lang.String[] r0 = X.AnonymousClass8BS.A1a(r6, r5)
            java.lang.String r16 = r8.A07(r9, r2, r0)
            if (r16 == 0) goto L_0x0050
            r0 = 6
            java.lang.String[] r3 = new java.lang.String[r0]
            java.lang.String r0 = "hidden"
            r3[r5] = r0
            java.lang.String r0 = "hscroll"
            r3[r6] = r0
            java.lang.String r0 = "hscroll_icebreakers"
            r3[r7] = r0
            java.lang.String r0 = "hscroll_large"
            r3[r4] = r0
            r2 = 4
            java.lang.String r0 = "hscroll_small"
            r3[r2] = r0
            r2 = 5
            java.lang.String r0 = "listview"
            java.util.List r3 = X.C18070vi.A0O(r0, r3, r2)
            java.lang.String[] r2 = new java.lang.String[r6]
            java.lang.String r0 = "display_type"
            r2[r5] = r0
            java.lang.String r17 = r8.A07(r9, r3, r2)
            if (r17 == 0) goto L_0x0050
            java.lang.String[] r14 = X.AnonymousClass8BS.A1T(r6)
            java.lang.Class<java.lang.String> r10 = java.lang.String.class
            java.lang.Long r11 = X.C17890vO.A0L()
            java.lang.Long r12 = X.AnonymousClass8BV.A0g()
            r13 = r1
            r15 = r5
            java.lang.Object r4 = r8.A05(r9, r10, r11, r12, r13, r14, r15)
            java.lang.String r4 = (java.lang.String) r4
            if (r4 == 0) goto L_0x0050
            java.lang.String[] r3 = new java.lang.String[r6]
            java.lang.String r0 = "bot"
            r3[r5] = r0
            r2 = 4
            X.AhR r0 = new X.AhR
            r0.<init>(r2)
            java.util.ArrayList r19 = X.AnonymousClass8BX.A0k(r9, r8, r0, r3)
            if (r19 == 0) goto L_0x0050
            X.9DD r1 = new X.9DD
            r15 = r9
            r18 = r4
            r14 = r1
            r14.<init>((X.C29621ca) r15, (java.lang.String) r16, (java.lang.String) r17, (java.lang.String) r18, (java.util.List) r19)
            return r1
        L_0x00dd:
            r6 = 0
            boolean r2 = X.AnonymousClass8BX.A1U(r0, r9, r8)
            java.lang.String r0 = "default"
            boolean r0 = r8.A09(r9, r0)
            r1 = 0
            if (r0 == 0) goto L_0x0050
            java.lang.String[] r0 = X.AnonymousClass8BS.A1Y(r2, r6)
            com.whatsapp.jid.UserJid r4 = X.AnonymousClass8BY.A0L(r9, r8, r0)
            if (r4 == 0) goto L_0x0050
            java.lang.String[] r5 = new java.lang.String[r2]
            java.lang.String r0 = "persona_id"
            r5[r6] = r0
            java.lang.Class<java.lang.String> r10 = java.lang.String.class
            java.lang.Long r11 = X.C17890vO.A0L()
            r2 = 41
            java.lang.Long r12 = java.lang.Long.valueOf(r2)
            r13 = r1
            r14 = r5
            r15 = r6
            java.lang.Object r0 = r8.A05(r9, r10, r11, r12, r13, r14, r15)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 != 0) goto L_0x0144
            return r1
        L_0x0113:
            r3 = 0
            boolean r2 = X.AnonymousClass8BX.A1U(r0, r9, r8)
            java.lang.String r0 = "bot"
            boolean r0 = r8.A09(r9, r0)
            r1 = 0
            if (r0 == 0) goto L_0x0050
            java.lang.String[] r0 = X.AnonymousClass8BS.A1Y(r2, r3)
            com.whatsapp.jid.UserJid r4 = X.AnonymousClass8BY.A0L(r9, r8, r0)
            if (r4 == 0) goto L_0x0050
            java.lang.String[] r2 = new java.lang.String[r2]
            java.lang.String r0 = "persona_id"
            r2[r3] = r0
            java.lang.Class<java.lang.String> r10 = java.lang.String.class
            java.lang.Long r11 = X.C108975cc.A0X()
            java.lang.Long r12 = X.AnonymousClass8BV.A0c()
            r13 = r1
            r14 = r2
            r15 = r3
            java.lang.Object r0 = r8.A05(r9, r10, r11, r12, r13, r14, r15)
            java.lang.String r0 = (java.lang.String) r0
        L_0x0144:
            X.9DH r1 = new X.9DH
            r1.<init>((com.whatsapp.jid.UserJid) r4, (X.C29621ca) r9, (java.lang.String) r0)
            return r1
        L_0x014a:
            r5 = 0
            boolean r4 = X.C18070vi.A17(r0, r9)
            r0 = 2
            X.C18070vi.A0d(r8, r0)
            java.lang.String r0 = "bot"
            boolean r0 = r8.A09(r9, r0)
            r1 = 0
            if (r0 == 0) goto L_0x0050
            java.util.List r3 = X.AnonymousClass8BX.A0n(r4)
            java.lang.String[] r2 = new java.lang.String[r4]
            java.lang.String r0 = "default"
            r2[r5] = r0
            java.lang.String r2 = r8.A07(r9, r3, r2)
            java.lang.String[] r0 = X.AnonymousClass8BS.A1Y(r4, r5)
            com.whatsapp.jid.UserJid r0 = X.AnonymousClass8BY.A0L(r9, r8, r0)
            if (r0 == 0) goto L_0x0050
            X.9DH r1 = new X.9DH
            r1.<init>(r0, r9, r2, r4)
            return r1
        L_0x017a:
            boolean r2 = X.AnonymousClass8BX.A1U(r0, r9, r8)
            boolean r0 = X.AnonymousClass8BR.A1R(r9, r8)
            r1 = 0
            if (r0 == 0) goto L_0x0050
            java.lang.String[] r14 = X.AnonymousClass8BS.A1U(r2)
            java.lang.Class<java.lang.String> r10 = java.lang.String.class
            java.lang.Long r11 = X.AnonymousClass8BU.A0i()
            java.lang.Long r12 = X.AnonymousClass8BU.A0j()
            java.lang.String r13 = "not-allowed"
            r15 = 0
            java.lang.Object r0 = r8.A05(r9, r10, r11, r12, r13, r14, r15)
            if (r0 == 0) goto L_0x0050
            java.lang.String[] r14 = X.AnonymousClass8BS.A1S(r2)
            java.lang.Class r10 = java.lang.Long.TYPE
            r2 = 405(0x195, double:2.0E-321)
            goto L_0x0226
        L_0x01a6:
            boolean r2 = X.AnonymousClass8BX.A1U(r0, r9, r8)
            boolean r0 = X.AnonymousClass8BR.A1R(r9, r8)
            r1 = 0
            if (r0 == 0) goto L_0x0050
            java.lang.String[] r14 = X.AnonymousClass8BS.A1U(r2)
            java.lang.Class<java.lang.String> r10 = java.lang.String.class
            java.lang.Long r11 = X.AnonymousClass8BU.A0i()
            java.lang.Long r12 = X.AnonymousClass8BU.A0j()
            java.lang.String r13 = "bad-request"
            r15 = 0
            java.lang.Object r0 = r8.A05(r9, r10, r11, r12, r13, r14, r15)
            if (r0 == 0) goto L_0x0050
            java.lang.String[] r14 = X.AnonymousClass8BS.A1S(r2)
            java.lang.Class r10 = java.lang.Long.TYPE
            r2 = 400(0x190, double:1.976E-321)
            goto L_0x0226
        L_0x01d1:
            boolean r2 = X.AnonymousClass8BX.A1U(r0, r9, r8)
            boolean r0 = X.AnonymousClass8BR.A1R(r9, r8)
            r1 = 0
            if (r0 == 0) goto L_0x0050
            java.lang.String[] r14 = X.AnonymousClass8BS.A1U(r2)
            java.lang.Class<java.lang.String> r10 = java.lang.String.class
            java.lang.Long r11 = X.AnonymousClass8BU.A0i()
            java.lang.Long r12 = X.AnonymousClass8BU.A0j()
            java.lang.String r13 = "forbidden"
            r15 = 0
            java.lang.Object r0 = r8.A05(r9, r10, r11, r12, r13, r14, r15)
            if (r0 == 0) goto L_0x0050
            java.lang.String[] r14 = X.AnonymousClass8BS.A1S(r2)
            java.lang.Class r10 = java.lang.Long.TYPE
            r2 = 403(0x193, double:1.99E-321)
            goto L_0x0226
        L_0x01fc:
            boolean r2 = X.AnonymousClass8BX.A1U(r0, r9, r8)
            boolean r0 = X.AnonymousClass8BR.A1R(r9, r8)
            r1 = 0
            if (r0 == 0) goto L_0x0050
            java.lang.String[] r14 = X.AnonymousClass8BS.A1U(r2)
            java.lang.Class<java.lang.String> r10 = java.lang.String.class
            java.lang.Long r11 = X.AnonymousClass8BU.A0i()
            java.lang.Long r12 = X.AnonymousClass8BU.A0j()
            java.lang.String r13 = "internal-server-error"
            r15 = 0
            java.lang.Object r0 = r8.A05(r9, r10, r11, r12, r13, r14, r15)
            if (r0 == 0) goto L_0x0050
            java.lang.String[] r14 = X.AnonymousClass8BS.A1S(r2)
            java.lang.Class r10 = java.lang.Long.TYPE
            r2 = 500(0x1f4, double:2.47E-321)
        L_0x0226:
            java.lang.Long r13 = java.lang.Long.valueOf(r2)
            java.lang.Object r0 = r8.A05(r9, r10, r11, r12, r13, r14, r15)
            java.lang.Number r0 = (java.lang.Number) r0
            if (r0 == 0) goto L_0x0050
            long r2 = r0.longValue()
            X.9Cd r1 = new X.9Cd
            r1.<init>(r9, r2)
            return r1
        L_0x023c:
            boolean r2 = X.AnonymousClass8BX.A1U(r0, r9, r8)
            boolean r0 = X.AnonymousClass8BR.A1R(r9, r8)
            r1 = 0
            if (r0 == 0) goto L_0x0050
            java.lang.String[] r14 = X.AnonymousClass8BS.A1U(r2)
            java.lang.Class<java.lang.String> r10 = java.lang.String.class
            java.lang.Long r11 = X.AnonymousClass8BU.A0i()
            java.lang.Long r12 = X.AnonymousClass8BU.A0j()
            java.lang.String r13 = "forbidden"
            r15 = 0
            java.lang.Object r0 = r8.A05(r9, r10, r11, r12, r13, r14, r15)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L_0x0050
            java.lang.String[] r14 = X.AnonymousClass8BS.A1S(r2)
            java.lang.Class r10 = java.lang.Long.TYPE
            r2 = 403(0x193, double:1.99E-321)
            java.lang.Long r13 = java.lang.Long.valueOf(r2)
            java.lang.Object r2 = r8.A05(r9, r10, r11, r12, r13, r14, r15)
            java.lang.Number r2 = (java.lang.Number) r2
            if (r2 == 0) goto L_0x0050
            long r5 = r2.longValue()
            r4 = 4
            goto L_0x03da
        L_0x027b:
            r15 = 0
            boolean r2 = X.AnonymousClass8BX.A1U(r0, r9, r8)
            boolean r0 = X.AnonymousClass8BR.A1R(r9, r8)
            r1 = 0
            if (r0 == 0) goto L_0x0050
            java.lang.String[] r14 = X.AnonymousClass8BS.A1U(r2)
            java.lang.Class<java.lang.String> r10 = java.lang.String.class
            java.lang.Long r11 = X.AnonymousClass8BU.A0i()
            java.lang.Long r12 = X.AnonymousClass8BU.A0j()
            java.lang.String r13 = "not-acceptable"
            java.lang.Object r3 = r8.A05(r9, r10, r11, r12, r13, r14, r15)
            java.lang.String r3 = (java.lang.String) r3
            if (r3 == 0) goto L_0x0050
            java.lang.String[] r14 = X.AnonymousClass8BS.A1S(r2)
            java.lang.Class r10 = java.lang.Long.TYPE
            r4 = 406(0x196, double:2.006E-321)
            java.lang.Long r13 = java.lang.Long.valueOf(r4)
            java.lang.Object r0 = r8.A05(r9, r10, r11, r12, r13, r14, r15)
            java.lang.Number r0 = (java.lang.Number) r0
            if (r0 == 0) goto L_0x0050
            long r10 = r0.longValue()
            java.lang.String[] r1 = new java.lang.String[r2]
            java.lang.String r0 = "field"
            r1[r15] = r0
            java.lang.Object r0 = X.C21280AhR.A00(r9, r8, r1, r2)
            X.9Ci r0 = (X.C178239Ci) r0
            X.9DC r1 = new X.9DC
            r7 = r9
            r8 = r0
            r9 = r3
            r6 = r1
            r6.<init>((X.C29621ca) r7, (X.C178239Ci) r8, (java.lang.String) r9, (long) r10)
            return r1
        L_0x02cd:
            X.C18070vi.A0n(r0, r9, r8)
            java.lang.String r0 = "item"
            boolean r0 = r8.A09(r9, r0)
            r1 = 0
            if (r0 == 0) goto L_0x0050
            X.9DG r0 = X.C20019A3l.A00(r9, r8)
            if (r0 == 0) goto L_0x0050
            X.9DN r1 = new X.9DN
            r1.<init>((X.C29621ca) r9, (X.AnonymousClass9DG) r0)
            return r1
        L_0x02e5:
            boolean r2 = X.AnonymousClass8BX.A1U(r0, r9, r8)
            boolean r0 = X.AnonymousClass8BR.A1R(r9, r8)
            r1 = 0
            if (r0 == 0) goto L_0x0050
            java.lang.String[] r14 = X.AnonymousClass8BS.A1U(r2)
            java.lang.Class<java.lang.String> r10 = java.lang.String.class
            java.lang.Long r11 = X.AnonymousClass8BU.A0i()
            java.lang.Long r12 = X.AnonymousClass8BU.A0j()
            java.lang.String r13 = "rate-overlimit"
            r15 = 0
            java.lang.Object r0 = r8.A05(r9, r10, r11, r12, r13, r14, r15)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L_0x0050
            java.lang.String[] r14 = X.AnonymousClass8BS.A1S(r2)
            java.lang.Class r10 = java.lang.Long.TYPE
            r2 = 429(0x1ad, double:2.12E-321)
            java.lang.Long r13 = java.lang.Long.valueOf(r2)
            java.lang.Object r2 = r8.A05(r9, r10, r11, r12, r13, r14, r15)
            java.lang.Number r2 = (java.lang.Number) r2
            if (r2 == 0) goto L_0x0050
            long r5 = r2.longValue()
            r4 = 6
            goto L_0x03da
        L_0x0324:
            boolean r2 = X.C18070vi.A17(r0, r9)
            r15 = 2
            X.C18070vi.A0d(r8, r15)
            boolean r0 = X.AnonymousClass8BR.A1R(r9, r8)
            r1 = 0
            if (r0 == 0) goto L_0x0050
            java.lang.String[] r22 = X.AnonymousClass8BS.A1U(r2)
            java.lang.Class<java.lang.String> r18 = java.lang.String.class
            java.lang.Long r11 = X.AnonymousClass8BU.A0i()
            java.lang.Long r12 = X.AnonymousClass8BU.A0j()
            java.lang.String r21 = "bad-request"
            r23 = 0
            r16 = r8
            r17 = r9
            r19 = r11
            r20 = r12
            java.lang.Object r3 = r16.A05(r17, r18, r19, r20, r21, r22, r23)
            java.lang.String r3 = (java.lang.String) r3
            if (r3 == 0) goto L_0x0050
            java.lang.String[] r22 = X.AnonymousClass8BS.A1S(r2)
            java.lang.Class r18 = java.lang.Long.TYPE
            java.lang.Long r21 = X.AnonymousClass8BV.A0h()
            goto L_0x04f5
        L_0x0361:
            boolean r2 = X.AnonymousClass8BX.A1U(r0, r9, r8)
            boolean r0 = X.AnonymousClass8BR.A1R(r9, r8)
            r1 = 0
            if (r0 == 0) goto L_0x0050
            java.lang.String[] r14 = X.AnonymousClass8BS.A1U(r2)
            java.lang.Class<java.lang.String> r10 = java.lang.String.class
            java.lang.Long r11 = X.AnonymousClass8BU.A0i()
            java.lang.Long r12 = X.AnonymousClass8BU.A0j()
            java.lang.String r13 = "internal-server-error"
            r15 = 0
            java.lang.Object r0 = r8.A05(r9, r10, r11, r12, r13, r14, r15)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L_0x0050
            java.lang.String[] r14 = X.AnonymousClass8BS.A1S(r2)
            java.lang.Class r10 = java.lang.Long.TYPE
            java.lang.Long r13 = X.AnonymousClass8BV.A0i()
            java.lang.Object r2 = r8.A05(r9, r10, r11, r12, r13, r14, r15)
            java.lang.Number r2 = (java.lang.Number) r2
            if (r2 == 0) goto L_0x0050
            long r5 = r2.longValue()
            r4 = 5
            goto L_0x03da
        L_0x039d:
            boolean r2 = X.AnonymousClass8BX.A1U(r0, r9, r8)
            boolean r0 = X.AnonymousClass8BR.A1R(r9, r8)
            r1 = 0
            if (r0 == 0) goto L_0x0050
            java.lang.String[] r14 = X.AnonymousClass8BS.A1U(r2)
            java.lang.Class<java.lang.String> r10 = java.lang.String.class
            java.lang.Long r11 = X.AnonymousClass8BU.A0i()
            java.lang.Long r12 = X.AnonymousClass8BU.A0j()
            java.lang.String r13 = "feature-not-implemented"
            r15 = 0
            java.lang.Object r0 = r8.A05(r9, r10, r11, r12, r13, r14, r15)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L_0x0050
            java.lang.String[] r14 = X.AnonymousClass8BS.A1S(r2)
            java.lang.Class r10 = java.lang.Long.TYPE
            r2 = 501(0x1f5, double:2.475E-321)
            java.lang.Long r13 = java.lang.Long.valueOf(r2)
            java.lang.Object r2 = r8.A05(r9, r10, r11, r12, r13, r14, r15)
            java.lang.Number r2 = (java.lang.Number) r2
            if (r2 == 0) goto L_0x0050
            long r5 = r2.longValue()
            r4 = 3
        L_0x03da:
            X.9D6 r1 = new X.9D6
            r2 = r9
            r3 = r0
            r1.<init>(r2, r3, r4, r5)
            return r1
        L_0x03e2:
            r4 = 0
            boolean r3 = X.AnonymousClass8BX.A1U(r0, r9, r8)
            java.lang.String r2 = "artifact"
            boolean r0 = r8.A09(r9, r2)
            r1 = 0
            if (r0 == 0) goto L_0x0050
            boolean r0 = r8.A09(r9, r2)
            if (r0 == 0) goto L_0x0050
            java.lang.String[] r14 = X.AnonymousClass8BS.A1V(r3)
            goto L_0x042e
        L_0x03fb:
            boolean r4 = X.AnonymousClass8BX.A1U(r0, r9, r8)
            java.lang.String r2 = "event_type"
            boolean r0 = r8.A09(r9, r2)
            r1 = 0
            if (r0 == 0) goto L_0x0050
            boolean r0 = r8.A09(r9, r2)
            if (r0 == 0) goto L_0x0050
            java.lang.String[] r14 = X.AnonymousClass8BS.A1V(r4)
            goto L_0x042e
        L_0x0413:
            boolean r3 = X.C18070vi.A17(r0, r9)
            r4 = 2
            X.C18070vi.A0d(r8, r4)
            java.lang.String r2 = "revision"
            boolean r0 = r8.A09(r9, r2)
            r1 = 0
            if (r0 == 0) goto L_0x0050
            boolean r0 = r8.A09(r9, r2)
            if (r0 == 0) goto L_0x0050
            java.lang.String[] r14 = X.AnonymousClass8BS.A1V(r3)
        L_0x042e:
            java.lang.Class<java.lang.String> r10 = java.lang.String.class
            java.lang.Long r11 = X.C108975cc.A0X()
            r2 = 256(0x100, double:1.265E-321)
            java.lang.Long r12 = java.lang.Long.valueOf(r2)
            r13 = r1
            java.lang.Object r2 = r8.A04(r9, r10, r11, r12, r13, r14)
            java.lang.String r2 = (java.lang.String) r2
            if (r2 == 0) goto L_0x0050
            X.9CY r0 = new X.9CY
            r0.<init>(r9, r2)
            X.9DN r1 = new X.9DN
            r1.<init>((X.C29621ca) r9, (X.AnonymousClass9CY) r0, (int) r4)
            return r1
        L_0x044e:
            boolean r2 = X.AnonymousClass8BX.A1U(r0, r9, r8)
            java.lang.String r0 = "fbid"
            boolean r0 = r8.A09(r9, r0)
            r1 = 0
            if (r0 == 0) goto L_0x0050
            java.lang.String[] r14 = X.AnonymousClass8BS.A1V(r2)
            java.lang.Class<java.lang.String> r10 = java.lang.String.class
            java.lang.Long r11 = X.C108975cc.A0X()
            r2 = 20
            goto L_0x0888
        L_0x0469:
            r3 = 0
            boolean r2 = X.AnonymousClass8BX.A1U(r0, r9, r8)
            java.lang.String r0 = "ar_class"
            boolean r0 = r8.A09(r9, r0)
            r1 = 0
            if (r0 == 0) goto L_0x0050
            java.lang.String[] r2 = new java.lang.String[r2]
            java.lang.String r0 = "value"
            r2[r3] = r0
            java.lang.Number r0 = X.AnonymousClass8BY.A0T(r9, r8, r2)
            if (r0 == 0) goto L_0x0050
            long r2 = r0.longValue()
            X.9CX r1 = new X.9CX
            r1.<init>(r9, r2)
            return r1
        L_0x048d:
            boolean r15 = X.AnonymousClass8BX.A1U(r0, r9, r8)
            boolean r0 = X.AnonymousClass8BR.A1R(r9, r8)
            r1 = 0
            if (r0 == 0) goto L_0x0050
            java.lang.String[] r22 = X.AnonymousClass8BS.A1U(r15)
            java.lang.Class<java.lang.String> r18 = java.lang.String.class
            java.lang.Long r11 = X.AnonymousClass8BU.A0i()
            java.lang.Long r12 = X.AnonymousClass8BU.A0j()
            java.lang.String r21 = "internal-server-error"
            r23 = 0
            r16 = r8
            r17 = r9
            r19 = r11
            r20 = r12
            java.lang.Object r3 = r16.A05(r17, r18, r19, r20, r21, r22, r23)
            java.lang.String r3 = (java.lang.String) r3
            if (r3 == 0) goto L_0x0050
            java.lang.String[] r22 = X.AnonymousClass8BS.A1S(r15)
            java.lang.Class r18 = java.lang.Long.TYPE
            java.lang.Long r21 = X.AnonymousClass8BV.A0i()
            goto L_0x04f5
        L_0x04c5:
            r15 = 0
            boolean r2 = X.AnonymousClass8BX.A1U(r0, r9, r8)
            boolean r0 = X.AnonymousClass8BR.A1R(r9, r8)
            r1 = 0
            if (r0 == 0) goto L_0x0050
            java.lang.String[] r14 = X.AnonymousClass8BS.A1U(r2)
            java.lang.Class<java.lang.String> r10 = java.lang.String.class
            java.lang.Long r11 = X.AnonymousClass8BU.A0i()
            java.lang.Long r12 = X.AnonymousClass8BU.A0j()
            java.lang.String r13 = "bad-request"
            r23 = 0
            java.lang.Object r3 = r8.A05(r9, r10, r11, r12, r13, r14, r15)
            java.lang.String r3 = (java.lang.String) r3
            if (r3 == 0) goto L_0x0050
            java.lang.String[] r22 = X.AnonymousClass8BS.A1S(r2)
            java.lang.Class r18 = java.lang.Long.TYPE
            java.lang.Long r21 = X.AnonymousClass8BV.A0h()
        L_0x04f5:
            r16 = r8
            r17 = r9
            r19 = r11
            r20 = r12
            java.lang.Object r0 = r16.A05(r17, r18, r19, r20, r21, r22, r23)
            java.lang.Number r0 = (java.lang.Number) r0
            if (r0 == 0) goto L_0x0050
            long r5 = r0.longValue()
            X.9D6 r1 = new X.9D6
            r2 = r9
            r4 = r15
            r1.<init>(r2, r3, r4, r5)
            return r1
        L_0x0511:
            r2 = 0
            boolean r4 = X.AnonymousClass8BX.A1U(r0, r9, r8)
            boolean r0 = X.AnonymousClass8BR.A1R(r9, r8)
            r1 = 0
            if (r0 == 0) goto L_0x0050
            java.lang.String[] r3 = new java.lang.String[r4]
            java.lang.String r0 = "guess_wait_time"
            r3[r2] = r0
            java.lang.Class r10 = java.lang.Long.TYPE
            java.lang.Long r11 = X.AnonymousClass8BV.A0a()
            java.lang.Long r12 = X.AnonymousClass8BU.A0j()
            r13 = r1
            r14 = r3
            r15 = r2
            java.lang.Object r5 = r8.A05(r9, r10, r11, r12, r13, r14, r15)
            java.lang.Long r5 = (java.lang.Long) r5
            java.lang.String[] r19 = X.AnonymousClass8BS.A1U(r4)
            java.lang.Class<java.lang.String> r15 = java.lang.String.class
            java.lang.Long r16 = X.AnonymousClass8BU.A0i()
            java.lang.String r18 = "pn-otp-guess-too-recent"
            r17 = r12
            r13 = r8
            r14 = r9
            r20 = r2
            java.lang.Object r0 = r13.A05(r14, r15, r16, r17, r18, r19, r20)
            if (r0 == 0) goto L_0x0050
            java.lang.String[] r14 = X.AnonymousClass8BS.A1S(r4)
            r3 = 543(0x21f, double:2.683E-321)
            java.lang.Long r13 = java.lang.Long.valueOf(r3)
            r11 = r16
            r15 = r2
            java.lang.Object r0 = r8.A05(r9, r10, r11, r12, r13, r14, r15)
            if (r0 == 0) goto L_0x0050
            X.9DU r1 = new X.9DU
            r1.<init>(r9, r5, r2)
            return r1
        L_0x0567:
            r15 = 0
            boolean r3 = X.AnonymousClass8BX.A1U(r0, r9, r8)
            boolean r0 = X.AnonymousClass8BR.A1R(r9, r8)
            r1 = 0
            if (r0 == 0) goto L_0x0050
            java.lang.String[] r2 = new java.lang.String[r3]
            java.lang.String r0 = "guess_wait_time"
            r2[r15] = r0
            java.lang.Class r10 = java.lang.Long.TYPE
            java.lang.Long r11 = X.AnonymousClass8BV.A0a()
            java.lang.Long r12 = X.AnonymousClass8BU.A0j()
            r13 = r1
            r14 = r2
            java.lang.Object r2 = r8.A05(r9, r10, r11, r12, r13, r14, r15)
            java.lang.Long r2 = (java.lang.Long) r2
            java.lang.String[] r22 = X.AnonymousClass8BS.A1U(r3)
            java.lang.Class<java.lang.String> r18 = java.lang.String.class
            java.lang.Long r19 = X.AnonymousClass8BU.A0i()
            java.lang.String r21 = "pn-otp-stale"
            r20 = r12
            r23 = r15
            r16 = r8
            r17 = r9
            java.lang.Object r0 = r16.A05(r17, r18, r19, r20, r21, r22, r23)
            if (r0 == 0) goto L_0x0050
            java.lang.String[] r14 = X.AnonymousClass8BS.A1S(r3)
            r4 = 542(0x21e, double:2.68E-321)
            java.lang.Long r13 = java.lang.Long.valueOf(r4)
            r11 = r19
            java.lang.Object r0 = r8.A05(r9, r10, r11, r12, r13, r14, r15)
            if (r0 == 0) goto L_0x0050
            X.9DU r1 = new X.9DU
            r1.<init>(r9, r2, r3)
            return r1
        L_0x05bd:
            r2 = 0
            boolean r4 = X.AnonymousClass8BX.A1U(r0, r9, r8)
            boolean r0 = X.AnonymousClass8BR.A1R(r9, r8)
            r1 = 0
            if (r0 == 0) goto L_0x0050
            java.lang.String[] r3 = new java.lang.String[r4]
            java.lang.String r0 = "wait_time"
            r3[r2] = r0
            java.lang.Class r10 = java.lang.Long.TYPE
            java.lang.Long r11 = X.C17890vO.A0L()
            java.lang.Long r12 = X.AnonymousClass8BU.A0j()
            r13 = r1
            r14 = r3
            r15 = r2
            java.lang.Object r5 = r8.A05(r9, r10, r11, r12, r13, r14, r15)
            java.lang.Long r5 = (java.lang.Long) r5
            java.lang.String[] r19 = X.AnonymousClass8BS.A1U(r4)
            java.lang.Class<java.lang.String> r15 = java.lang.String.class
            java.lang.Long r16 = X.AnonymousClass8BU.A0i()
            java.lang.String r18 = "email-guess-too-recent"
            r17 = r12
            r13 = r8
            r14 = r9
            r20 = r2
            java.lang.Object r0 = r13.A05(r14, r15, r16, r17, r18, r19, r20)
            if (r0 == 0) goto L_0x0050
            java.lang.String[] r14 = X.AnonymousClass8BS.A1S(r4)
            r3 = 537(0x219, double:2.653E-321)
            java.lang.Long r13 = java.lang.Long.valueOf(r3)
            r11 = r16
            r15 = r2
            java.lang.Object r0 = r8.A05(r9, r10, r11, r12, r13, r14, r15)
            if (r0 == 0) goto L_0x0050
            X.9DT r1 = new X.9DT
            r1.<init>(r9, r5, r2)
            return r1
        L_0x0613:
            r15 = 0
            boolean r3 = X.AnonymousClass8BX.A1U(r0, r9, r8)
            boolean r0 = X.AnonymousClass8BR.A1R(r9, r8)
            r1 = 0
            if (r0 == 0) goto L_0x0050
            java.lang.String[] r2 = new java.lang.String[r3]
            java.lang.String r0 = "wait_time"
            r2[r15] = r0
            java.lang.Class r10 = java.lang.Long.TYPE
            java.lang.Long r11 = X.C17890vO.A0L()
            java.lang.Long r12 = X.AnonymousClass8BU.A0j()
            r13 = r1
            r14 = r2
            java.lang.Object r2 = r8.A05(r9, r10, r11, r12, r13, r14, r15)
            java.lang.Long r2 = (java.lang.Long) r2
            java.lang.String[] r22 = X.AnonymousClass8BS.A1U(r3)
            java.lang.Class<java.lang.String> r18 = java.lang.String.class
            java.lang.Long r19 = X.AnonymousClass8BU.A0i()
            java.lang.String r21 = "email-otp-stale"
            r20 = r12
            r23 = r15
            r16 = r8
            r17 = r9
            java.lang.Object r0 = r16.A05(r17, r18, r19, r20, r21, r22, r23)
            if (r0 == 0) goto L_0x0050
            java.lang.String[] r14 = X.AnonymousClass8BS.A1S(r3)
            r4 = 536(0x218, double:2.65E-321)
            java.lang.Long r13 = java.lang.Long.valueOf(r4)
            r11 = r19
            java.lang.Object r0 = r8.A05(r9, r10, r11, r12, r13, r14, r15)
            if (r0 == 0) goto L_0x0050
            X.9DT r1 = new X.9DT
            r1.<init>(r9, r2, r3)
            return r1
        L_0x0669:
            r4 = 0
            boolean r6 = X.C18070vi.A17(r0, r9)
            r5 = 2
            X.C18070vi.A0d(r8, r5)
            java.lang.String r0 = "auto_verify"
            boolean r0 = r8.A09(r9, r0)
            r1 = 0
            if (r0 == 0) goto L_0x0050
            java.lang.String[] r2 = new java.lang.String[r5]
            java.lang.String r0 = "fail"
            r2[r4] = r0
            java.lang.String r0 = "success"
            java.util.List r3 = X.C18070vi.A0O(r0, r2, r6)
            java.lang.String[] r2 = new java.lang.String[r5]
            java.lang.String r0 = "status"
            X.AnonymousClass8BR.A1K(r2, r4, r6, r0)
            java.lang.String r2 = r8.A07(r9, r3, r2)
            if (r2 == 0) goto L_0x0050
            java.lang.String[] r1 = new java.lang.String[r6]
            java.lang.String r0 = "reason"
            r1[r4] = r0
            java.lang.Object r0 = X.C21280AhR.A00(r9, r8, r1, r4)
            X.9CY r0 = (X.AnonymousClass9CY) r0
            X.9DH r1 = new X.9DH
            r1.<init>((X.C29621ca) r9, (X.AnonymousClass9CY) r0, (java.lang.String) r2)
            return r1
        L_0x06a6:
            r15 = 0
            boolean r3 = X.AnonymousClass8BX.A1U(r0, r9, r8)
            boolean r0 = X.AnonymousClass8BR.A1R(r9, r8)
            r1 = 0
            if (r0 == 0) goto L_0x0050
            java.lang.String[] r2 = new java.lang.String[r3]
            java.lang.String r0 = "wait_time"
            r2[r15] = r0
            java.lang.Class r10 = java.lang.Long.TYPE
            java.lang.Long r11 = X.C17890vO.A0L()
            java.lang.Long r12 = X.AnonymousClass8BU.A0j()
            r13 = r1
            r14 = r2
            java.lang.Object r2 = r8.A05(r9, r10, r11, r12, r13, r14, r15)
            java.lang.Long r2 = (java.lang.Long) r2
            java.lang.String[] r22 = X.AnonymousClass8BS.A1U(r3)
            java.lang.Class<java.lang.String> r18 = java.lang.String.class
            java.lang.Long r19 = X.AnonymousClass8BU.A0i()
            java.lang.String r21 = "email-too-recent"
            r20 = r12
            r23 = r15
            r16 = r8
            r17 = r9
            java.lang.Object r0 = r16.A05(r17, r18, r19, r20, r21, r22, r23)
            if (r0 == 0) goto L_0x0050
            java.lang.String[] r14 = X.AnonymousClass8BS.A1S(r3)
            r4 = 534(0x216, double:2.64E-321)
            java.lang.Long r13 = java.lang.Long.valueOf(r4)
            r11 = r19
            java.lang.Object r0 = r8.A05(r9, r10, r11, r12, r13, r14, r15)
            if (r0 == 0) goto L_0x0050
            X.9DS r1 = new X.9DS
            r1.<init>(r9, r2, r3)
            return r1
        L_0x06fc:
            r2 = 0
            boolean r4 = X.AnonymousClass8BX.A1U(r0, r9, r8)
            boolean r0 = X.AnonymousClass8BR.A1R(r9, r8)
            r1 = 0
            if (r0 == 0) goto L_0x0050
            java.lang.String[] r3 = new java.lang.String[r4]
            java.lang.String r0 = "wait_time"
            r3[r2] = r0
            java.lang.Class r10 = java.lang.Long.TYPE
            java.lang.Long r11 = X.C17890vO.A0L()
            java.lang.Long r12 = X.AnonymousClass8BU.A0j()
            r13 = r1
            r14 = r3
            r15 = r2
            java.lang.Object r5 = r8.A05(r9, r10, r11, r12, r13, r14, r15)
            java.lang.Long r5 = (java.lang.Long) r5
            java.lang.String[] r19 = X.AnonymousClass8BS.A1U(r4)
            java.lang.Class<java.lang.String> r15 = java.lang.String.class
            java.lang.Long r16 = X.AnonymousClass8BU.A0i()
            java.lang.String r18 = "email-too-many"
            r17 = r12
            r13 = r8
            r14 = r9
            r20 = r2
            java.lang.Object r0 = r13.A05(r14, r15, r16, r17, r18, r19, r20)
            if (r0 == 0) goto L_0x0050
            java.lang.String[] r14 = X.AnonymousClass8BS.A1S(r4)
            r3 = 535(0x217, double:2.643E-321)
            java.lang.Long r13 = java.lang.Long.valueOf(r3)
            r11 = r16
            r15 = r2
            java.lang.Object r0 = r8.A05(r9, r10, r11, r12, r13, r14, r15)
            if (r0 == 0) goto L_0x0050
            X.9DS r1 = new X.9DS
            r1.<init>(r9, r5, r2)
            return r1
        L_0x0752:
            boolean r15 = X.AnonymousClass8BX.A1U(r0, r9, r8)
            boolean r0 = X.AnonymousClass8BR.A1R(r9, r8)
            r1 = 0
            if (r0 == 0) goto L_0x0050
            java.lang.String[] r22 = X.AnonymousClass8BS.A1U(r15)
            java.lang.Class<java.lang.String> r18 = java.lang.String.class
            java.lang.Long r11 = X.AnonymousClass8BU.A0i()
            java.lang.Long r12 = X.AnonymousClass8BU.A0j()
            java.lang.String r21 = "internal-server-error"
            r23 = 0
            r16 = r8
            r17 = r9
            r19 = r11
            r20 = r12
            java.lang.Object r0 = r16.A05(r17, r18, r19, r20, r21, r22, r23)
            if (r0 == 0) goto L_0x0050
            java.lang.String[] r22 = X.AnonymousClass8BS.A1S(r15)
            java.lang.Class r18 = java.lang.Long.TYPE
            java.lang.Long r21 = X.AnonymousClass8BV.A0i()
            goto L_0x003d
        L_0x0789:
            r15 = 0
            boolean r3 = X.AnonymousClass8BX.A1U(r0, r9, r8)
            boolean r0 = X.AnonymousClass8BR.A1R(r9, r8)
            r1 = 0
            if (r0 == 0) goto L_0x0050
            java.lang.String[] r2 = new java.lang.String[r3]
            java.lang.String r0 = "sms_wait_time"
            r2[r15] = r0
            java.lang.Class r10 = java.lang.Long.TYPE
            java.lang.Long r11 = X.AnonymousClass8BV.A0a()
            java.lang.Long r12 = X.AnonymousClass8BU.A0j()
            r13 = r1
            r14 = r2
            java.lang.Object r2 = r8.A05(r9, r10, r11, r12, r13, r14, r15)
            java.lang.Long r2 = (java.lang.Long) r2
            java.lang.String[] r4 = new java.lang.String[r3]
            java.lang.String r0 = "voice_wait_time"
            r4[r15] = r0
            r14 = r4
            java.lang.Object r4 = r8.A05(r9, r10, r11, r12, r13, r14, r15)
            java.lang.Long r4 = (java.lang.Long) r4
            java.lang.String[] r22 = X.AnonymousClass8BS.A1U(r3)
            java.lang.Class<java.lang.String> r18 = java.lang.String.class
            java.lang.Long r19 = X.AnonymousClass8BU.A0i()
            java.lang.String r21 = "pn-otp-too-recent"
            r20 = r12
            r23 = r15
            r16 = r8
            r17 = r9
            java.lang.Object r0 = r16.A05(r17, r18, r19, r20, r21, r22, r23)
            if (r0 == 0) goto L_0x0050
            java.lang.String[] r14 = X.AnonymousClass8BS.A1S(r3)
            r5 = 540(0x21c, double:2.67E-321)
            java.lang.Long r13 = java.lang.Long.valueOf(r5)
            r11 = r19
            java.lang.Object r0 = r8.A05(r9, r10, r11, r12, r13, r14, r15)
            if (r0 == 0) goto L_0x0050
            X.9DQ r1 = new X.9DQ
            r1.<init>(r9, r2, r4, r3)
            return r1
        L_0x07ec:
            r3 = 0
            boolean r5 = X.AnonymousClass8BX.A1U(r0, r9, r8)
            boolean r0 = X.AnonymousClass8BR.A1R(r9, r8)
            r1 = 0
            if (r0 == 0) goto L_0x0050
            java.lang.String[] r2 = new java.lang.String[r5]
            java.lang.String r0 = "sms_wait_time"
            r2[r3] = r0
            java.lang.Class r10 = java.lang.Long.TYPE
            java.lang.Long r11 = X.AnonymousClass8BV.A0a()
            java.lang.Long r12 = X.AnonymousClass8BU.A0j()
            r13 = r1
            r14 = r2
            r15 = r3
            java.lang.Object r4 = r8.A05(r9, r10, r11, r12, r13, r14, r15)
            java.lang.Long r4 = (java.lang.Long) r4
            java.lang.String[] r2 = new java.lang.String[r5]
            java.lang.String r0 = "voice_wait_time"
            r2[r3] = r0
            r14 = r2
            java.lang.Object r2 = r8.A05(r9, r10, r11, r12, r13, r14, r15)
            java.lang.Long r2 = (java.lang.Long) r2
            java.lang.String[] r19 = X.AnonymousClass8BS.A1U(r5)
            java.lang.Class<java.lang.String> r15 = java.lang.String.class
            java.lang.Long r16 = X.AnonymousClass8BU.A0i()
            java.lang.String r18 = "pn-otp-too-many"
            r17 = r12
            r13 = r8
            r14 = r9
            r20 = r3
            java.lang.Object r0 = r13.A05(r14, r15, r16, r17, r18, r19, r20)
            if (r0 == 0) goto L_0x0050
            java.lang.String[] r14 = X.AnonymousClass8BS.A1S(r5)
            r5 = 541(0x21d, double:2.673E-321)
            java.lang.Long r13 = java.lang.Long.valueOf(r5)
            r11 = r16
            r15 = r3
            java.lang.Object r0 = r8.A05(r9, r10, r11, r12, r13, r14, r15)
            if (r0 == 0) goto L_0x0050
            X.9DQ r1 = new X.9DQ
            r1.<init>(r9, r4, r2, r3)
            return r1
        L_0x084f:
            boolean r3 = X.C18070vi.A17(r0, r9)
            r0 = 2
            X.C18070vi.A0d(r8, r0)
            java.lang.String r0 = "confirmed"
            boolean r0 = r8.A09(r9, r0)
            r1 = 0
            if (r0 == 0) goto L_0x0050
            java.util.List r2 = X.AnonymousClass8BX.A0n(r3)
            java.lang.String[] r0 = X.AnonymousClass8BS.A1V(r3)
            java.lang.String r0 = r8.A07(r9, r2, r0)
            if (r0 != 0) goto L_0x08a8
            return r1
        L_0x086f:
            boolean r2 = X.AnonymousClass8BX.A1U(r0, r9, r8)
            java.lang.String r0 = "email_address"
            boolean r0 = r8.A09(r9, r0)
            r1 = 0
            if (r0 == 0) goto L_0x0050
            java.lang.String[] r14 = X.AnonymousClass8BS.A1V(r2)
            java.lang.Class<java.lang.String> r10 = java.lang.String.class
            java.lang.Long r11 = X.C17890vO.A0L()
            r2 = 320(0x140, double:1.58E-321)
        L_0x0888:
            java.lang.Long r12 = java.lang.Long.valueOf(r2)
            r13 = r1
            java.lang.Object r0 = r8.A04(r9, r10, r11, r12, r13, r14)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 != 0) goto L_0x08a8
            return r1
        L_0x0896:
            X.9DC r1 = X.AnonymousClass8BY.A0Q(r9, r8, r0)
            return r1
        L_0x089b:
            X.C18070vi.A0n(r0, r9, r8)
            X.9DG r1 = X.C20019A3l.A00(r9, r8)
            return r1
        L_0x08a3:
            X.9DC r1 = X.AnonymousClass8BY.A0Q(r9, r8, r0)
            return r1
        L_0x08a8:
            X.9CY r1 = new X.9CY
            r1.<init>(r9, r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21282AhT.BCF(X.1ca, X.2rm):java.lang.Object");
    }
}
