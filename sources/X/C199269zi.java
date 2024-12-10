package X;

/* renamed from: X.9zi  reason: invalid class name and case insensitive filesystem */
public final class C199269zi {
    public final C22545BCc A00;
    public final A2X A01;
    public final String A02;

    public C199269zi(C22545BCc bCc, A2V a2v, String str) {
        C18070vi.A0d(a2v, 1);
        this.A02 = str;
        this.A00 = bCc;
        this.A01 = a2v.A02(str);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: X.7NV} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v6, resolved type: X.7NV} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v7, resolved type: X.7NV} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A01(X.C187389fj r24, java.lang.String r25, java.lang.String r26, java.util.Map r27, java.util.Map r28, int r29, int r30, boolean r31, boolean r32) {
        /*
            r23 = this;
            java.lang.String r0 = "app_id"
            r13 = r27
            java.lang.Object r3 = r13.get(r0)
            r1 = r23
            if (r3 == 0) goto L_0x0018
            X.A2X r2 = r1.A01
            java.lang.String r3 = (java.lang.String) r3
            X.7NR r0 = new X.7NR
            r0.<init>(r3)
            r2.A02(r0)
        L_0x0018:
            X.Awe r6 = new X.Awe
            r10 = r25
            r12 = r26
            r14 = r28
            r15 = r29
            r16 = r6
            r17 = r1
            r18 = r10
            r19 = r12
            r20 = r13
            r21 = r14
            r22 = r15
            r16.<init>(r17, r18, r19, r20, r21, r22)
            r3 = r24
            X.9Hp r2 = r3.A01
            X.9Hp r0 = X.C179349Hp.MODAL
            if (r2 != r0) goto L_0x0072
            if (r31 != 0) goto L_0x0086
            X.A2X r4 = r1.A01
            java.lang.Class<X.AeT> r5 = X.C21099AeT.class
            r2 = 11
            X.AeH r0 = new X.AeH
            r0.<init>(r6, r2)
            r4.A01(r0, r5, r1)
            java.lang.Class<X.AeX> r2 = X.C21103AeX.class
            r0 = 12
            X.A2X.A00(r4, r2, r1, r0)
            X.BCc r5 = r1.A00
            java.lang.String r7 = r3.A04
            java.lang.String r8 = r3.A00
            java.lang.Integer r0 = r3.A02
            java.lang.String r9 = A00(r0)
            java.lang.Integer r6 = r3.A03
            java.lang.String r11 = r1.A02
            r16 = r30
            r17 = r32
            r5.CAx(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            X.AeQ r3 = new X.AeQ
            r3.<init>()
        L_0x006e:
            r4.A02(r3)
            return
        L_0x0072:
            if (r31 != 0) goto L_0x0086
            X.BCc r6 = r1.A00
            java.lang.String r7 = r3.A04
            java.lang.String r8 = r3.A00
            java.lang.Integer r0 = r3.A02
            java.lang.String r9 = A00(r0)
            java.lang.String r11 = r1.A02
            r6.CAl(r7, r8, r9, r10, r11, r12, r13, r14, r15)
            return
        L_0x0086:
            r6.invoke()
            X.A2X r4 = r1.A01
            java.lang.String r2 = r3.A04
            java.lang.Integer r0 = r3.A02
            java.lang.String r1 = A00(r0)
            java.lang.String r0 = r3.A00
            X.7NV r3 = new X.7NV
            r3.<init>(r2, r1, r0)
            goto L_0x006e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C199269zi.A01(X.9fj, java.lang.String, java.lang.String, java.util.Map, java.util.Map, int, int, boolean, boolean):void");
    }

    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 0:
                return "BACK";
            case 1:
                return "CLOSE";
            default:
                return "NONE";
        }
    }
}
