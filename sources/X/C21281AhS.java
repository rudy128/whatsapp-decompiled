package X;

/* renamed from: X.AhS  reason: case insensitive filesystem */
public class C21281AhS implements C22470B9c {
    public final int A00;

    public C21281AhS(int i) {
        this.A00 = i;
    }

    public static Object A00(C29621ca r1, C62672rm r2, String[] strArr, int i) {
        return r2.A02(r1, new C21281AhS(i), strArr);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:104:0x0474, code lost:
        if (r5.A09(r4, r0) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x0476, code lost:
        r0 = X.C20072A5y.A00(r4, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x047a, code lost:
        if (r0 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x0481, code lost:
        return new X.AnonymousClass9DM(r4, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00b1, code lost:
        return new X.AnonymousClass9CR(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x014d, code lost:
        return new X.AnonymousClass9DM(r4, r1, r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object BCF(X.C29621ca r63, X.C62672rm r64) {
        /*
            r62 = this;
            r0 = r62
            int r0 = r0.A00
            r4 = r63
            r5 = r64
            switch(r0) {
                case 0: goto L_0x000d;
                case 1: goto L_0x005d;
                case 2: goto L_0x0482;
                case 3: goto L_0x00b2;
                case 4: goto L_0x00f3;
                case 5: goto L_0x011e;
                case 6: goto L_0x014e;
                case 7: goto L_0x0406;
                case 8: goto L_0x0482;
                case 9: goto L_0x0428;
                case 10: goto L_0x0482;
                case 11: goto L_0x0464;
                case 12: goto L_0x046a;
                case 13: goto L_0x0482;
                default: goto L_0x000b;
            }
        L_0x000b:
            r6 = 0
        L_0x000c:
            return r6
        L_0x000d:
            r14 = 0
            boolean r2 = X.C18070vi.A17(r4, r5)
            java.lang.String r0 = "promotion_config"
            boolean r0 = r5.A09(r4, r0)
            r6 = 0
            if (r0 == 0) goto L_0x000c
            java.lang.String[] r1 = new java.lang.String[r2]
            java.lang.String r0 = "max_impressions"
            r1[r14] = r0
            java.lang.Class r9 = java.lang.Long.TYPE
            java.lang.Long r10 = X.AnonymousClass8BU.A0i()
            java.lang.Long r11 = X.AnonymousClass8BU.A0j()
            r7 = r5
            r8 = r4
            r12 = r6
            r13 = r1
            java.lang.Object r0 = r7.A05(r8, r9, r10, r11, r12, r13, r14)
            if (r0 == 0) goto L_0x000c
            java.lang.String[] r1 = new java.lang.String[r2]
            java.lang.String r0 = "max_primary_clicks"
            r1[r14] = r0
            r13 = r1
            java.lang.Object r0 = r7.A05(r8, r9, r10, r11, r12, r13, r14)
            if (r0 == 0) goto L_0x000c
            java.lang.String[] r1 = new java.lang.String[r2]
            java.lang.String r0 = "max_secondary_clicks"
            r1[r14] = r0
            r13 = r1
            java.lang.Object r0 = r7.A05(r8, r9, r10, r11, r12, r13, r14)
            if (r0 == 0) goto L_0x000c
            java.lang.String[] r1 = new java.lang.String[r2]
            java.lang.String r0 = "max_dismisses"
            r1[r14] = r0
            r13 = r1
            java.lang.Object r0 = r7.A05(r8, r9, r10, r11, r12, r13, r14)
            if (r0 == 0) goto L_0x000c
            goto L_0x00ac
        L_0x005d:
            r14 = 0
            boolean r2 = X.C18070vi.A17(r4, r5)
            java.lang.String r0 = "user_info"
            boolean r0 = r5.A09(r4, r0)
            r6 = 0
            if (r0 == 0) goto L_0x000c
            java.lang.String[] r1 = new java.lang.String[r2]
            java.lang.String r0 = "impression_count"
            r1[r14] = r0
            java.lang.Class r9 = java.lang.Long.TYPE
            java.lang.Long r10 = X.AnonymousClass8BU.A0i()
            java.lang.Long r11 = X.AnonymousClass8BU.A0j()
            r7 = r5
            r8 = r4
            r12 = r6
            r13 = r1
            java.lang.Object r0 = r7.A05(r8, r9, r10, r11, r12, r13, r14)
            if (r0 == 0) goto L_0x000c
            java.lang.String[] r1 = new java.lang.String[r2]
            java.lang.String r0 = "primary_click_count"
            r1[r14] = r0
            r13 = r1
            java.lang.Object r0 = r7.A05(r8, r9, r10, r11, r12, r13, r14)
            if (r0 == 0) goto L_0x000c
            java.lang.String[] r1 = new java.lang.String[r2]
            java.lang.String r0 = "secondary_click_count"
            r1[r14] = r0
            r13 = r1
            java.lang.Object r0 = r7.A05(r8, r9, r10, r11, r12, r13, r14)
            if (r0 == 0) goto L_0x000c
            java.lang.String[] r1 = new java.lang.String[r2]
            java.lang.String r0 = "dismiss_click_count"
            r1[r14] = r0
            r13 = r1
            java.lang.Object r0 = r7.A05(r8, r9, r10, r11, r12, r13, r14)
            if (r0 == 0) goto L_0x000c
        L_0x00ac:
            X.9CR r6 = new X.9CR
            r6.<init>(r4)
            return r6
        L_0x00b2:
            r14 = 0
            boolean r3 = X.C18070vi.A17(r4, r5)
            java.lang.String r0 = "attribute"
            boolean r0 = r5.A09(r4, r0)
            r6 = 0
            if (r0 == 0) goto L_0x000c
            java.lang.String[] r1 = new java.lang.String[r3]
            java.lang.String r0 = "key"
            r1[r14] = r0
            java.lang.Class<java.lang.String> r9 = java.lang.String.class
            java.lang.Long r10 = X.AnonymousClass8BU.A0i()
            java.lang.Long r11 = X.AnonymousClass8BU.A0j()
            r7 = r5
            r8 = r4
            r12 = r6
            r13 = r1
            java.lang.Object r2 = r7.A05(r8, r9, r10, r11, r12, r13, r14)
            java.lang.String r2 = (java.lang.String) r2
            if (r2 == 0) goto L_0x000c
            java.lang.String[] r1 = new java.lang.String[r3]
            java.lang.String r0 = "value"
            r1[r14] = r0
            r13 = r1
            java.lang.Object r1 = r7.A05(r8, r9, r10, r11, r12, r13, r14)
            java.lang.String r1 = (java.lang.String) r1
            if (r1 == 0) goto L_0x000c
            r0 = 9
            X.9Ci r6 = new X.9Ci
            r6.<init>(r4, r2, r1, r0)
            return r6
        L_0x00f3:
            r2 = 0
            boolean r1 = X.C18070vi.A17(r4, r5)
            java.lang.String r0 = "light"
            boolean r0 = r5.A09(r4, r0)
            r6 = 0
            if (r0 == 0) goto L_0x000c
            java.lang.String[] r1 = new java.lang.String[r1]
            java.lang.String r0 = "#elementValue"
            java.lang.Long r10 = X.AnonymousClass8BW.A0Z(r0, r1, r2)
            java.lang.Long r11 = X.AnonymousClass8BU.A0j()
            java.lang.Class<byte[]> r9 = byte[].class
            r7 = r5
            r8 = r4
            r12 = r6
            r13 = r1
            java.lang.Object r1 = r7.A04(r8, r9, r10, r11, r12, r13)
            byte[] r1 = (byte[]) r1
            if (r1 == 0) goto L_0x000c
            r0 = 20
            goto L_0x0148
        L_0x011e:
            r2 = 0
            boolean r1 = X.C18070vi.A17(r4, r5)
            java.lang.String r0 = "dark"
            boolean r0 = r5.A09(r4, r0)
            r6 = 0
            if (r0 == 0) goto L_0x000c
            java.lang.String[] r1 = new java.lang.String[r1]
            java.lang.String r0 = "#elementValue"
            java.lang.Long r10 = X.AnonymousClass8BW.A0Z(r0, r1, r2)
            java.lang.Long r11 = X.AnonymousClass8BU.A0j()
            java.lang.Class<byte[]> r9 = byte[].class
            r7 = r5
            r8 = r4
            r12 = r6
            r13 = r1
            java.lang.Object r1 = r7.A04(r8, r9, r10, r11, r12, r13)
            byte[] r1 = (byte[]) r1
            if (r1 == 0) goto L_0x000c
            r0 = 19
        L_0x0148:
            X.9DM r6 = new X.9DM
            r6.<init>((X.C29621ca) r4, (byte[]) r1, (int) r0)
            return r6
        L_0x014e:
            r2 = 0
            boolean r1 = X.C18070vi.A17(r4, r5)
            java.lang.String r0 = "promotion"
            boolean r0 = r5.A09(r4, r0)
            r6 = 0
            if (r0 == 0) goto L_0x000c
            r3 = 2
            java.lang.String[] r0 = new java.lang.String[r3]
            java.lang.String r10 = "false"
            r0[r2] = r10
            java.lang.String r9 = "true"
            java.util.List r8 = X.C18070vi.A0O(r9, r0, r1)
            java.lang.String[] r7 = new java.lang.String[r3]
            java.lang.String r23 = "qp_config"
            r7[r2] = r23
            java.lang.String r0 = "dismissable"
            r7[r1] = r0
            java.lang.String r34 = r5.A07(r4, r8, r7)
            if (r34 == 0) goto L_0x000c
            java.util.List r8 = X.AnonymousClass8BX.A0o(r10, r9, r3, r1)
            java.lang.String[] r7 = new java.lang.String[r3]
            r7[r2] = r23
            java.lang.String r0 = "force_pass"
            r7[r1] = r0
            java.lang.String r35 = r5.A07(r4, r8, r7)
            if (r35 == 0) goto L_0x000c
            java.util.List r8 = X.AnonymousClass8BX.A0o(r10, r9, r3, r1)
            java.lang.String[] r7 = new java.lang.String[r3]
            r7[r2] = r23
            java.lang.String r0 = "deterministic"
            r7[r1] = r0
            java.lang.String r36 = r5.A07(r4, r8, r7)
            if (r36 == 0) goto L_0x000c
            java.util.List r8 = X.AnonymousClass8BX.A0o(r10, r9, r3, r1)
            java.lang.String[] r7 = new java.lang.String[r3]
            r7[r2] = r23
            java.lang.String r0 = "exposure_holdout"
            r7[r1] = r0
            java.lang.String r37 = r5.A07(r4, r8, r7)
            if (r37 == 0) goto L_0x000c
            java.util.List r8 = X.AnonymousClass8BX.A0o(r10, r9, r3, r1)
            java.lang.String[] r7 = new java.lang.String[r3]
            r7[r2] = r23
            java.lang.String r0 = "log_eligibility_waterfall"
            r7[r1] = r0
            java.lang.String r38 = r5.A07(r4, r8, r7)
            if (r38 == 0) goto L_0x000c
            java.lang.String[] r13 = X.AnonymousClass8BS.A1W(r1, r2)
            java.lang.Class<java.lang.String> r9 = java.lang.String.class
            java.lang.Long r10 = X.AnonymousClass8BU.A0i()
            java.lang.Long r11 = X.AnonymousClass8BU.A0j()
            r7 = r5
            r8 = r4
            r12 = r6
            r14 = r2
            java.lang.Object r22 = r7.A05(r8, r9, r10, r11, r12, r13, r14)
            r0 = r22
            java.lang.String r0 = (java.lang.String) r0
            r22 = r0
            if (r0 == 0) goto L_0x000c
            java.lang.String[] r7 = new java.lang.String[r1]
            java.lang.String r0 = "instance_id"
            r7[r2] = r0
            r12 = r5
            r13 = r4
            r17 = r6
            r18 = r7
            r19 = r2
            r14 = r9
            r15 = r10
            r16 = r11
            java.lang.Object r21 = r12.A05(r13, r14, r15, r16, r17, r18, r19)
            r0 = r21
            java.lang.String r0 = (java.lang.String) r0
            r21 = r0
            java.lang.String[] r0 = new java.lang.String[r3]
            java.lang.String r7 = "title"
            r0[r2] = r7
            java.lang.String r7 = "#elementValue"
            r0[r1] = r7
            r18 = r0
            java.lang.Object r20 = r12.A04(r13, r14, r15, r16, r17, r18)
            r0 = r20
            java.lang.String r0 = (java.lang.String) r0
            r20 = r0
            if (r0 == 0) goto L_0x000c
            java.lang.String[] r13 = X.AnonymousClass8BS.A1U(r3)
            r13[r1] = r7
            r7 = r5
            r12 = r6
            java.lang.Object r19 = r7.A04(r8, r9, r10, r11, r12, r13)
            r0 = r19
            java.lang.String r0 = (java.lang.String) r0
            r19 = r0
            if (r0 == 0) goto L_0x000c
            java.lang.String[] r7 = new java.lang.String[r3]
            r7[r2] = r23
            java.lang.String r0 = "template_name"
            r7[r1] = r0
            r24 = r5
            r25 = r4
            r29 = r6
            r30 = r7
            r31 = r2
            r26 = r9
            r27 = r10
            r28 = r11
            java.lang.Object r18 = r24.A05(r25, r26, r27, r28, r29, r30, r31)
            r0 = r18
            java.lang.String r0 = (java.lang.String) r0
            r18 = r0
            if (r0 == 0) goto L_0x000c
            java.lang.String[] r0 = new java.lang.String[r3]
            r0[r2] = r23
            java.lang.String r7 = "start_time_seconds"
            r0[r1] = r7
            java.lang.Class r26 = java.lang.Long.TYPE
            r30 = r0
            java.lang.Object r0 = r24.A05(r25, r26, r27, r28, r29, r30, r31)
            java.lang.Number r0 = (java.lang.Number) r0
            if (r0 == 0) goto L_0x000c
            long r46 = r0.longValue()
            java.lang.String[] r0 = new java.lang.String[r3]
            r0[r2] = r23
            java.lang.String r7 = "end_time_seconds"
            r0[r1] = r7
            r30 = r0
            java.lang.Object r0 = r24.A05(r25, r26, r27, r28, r29, r30, r31)
            java.lang.Number r0 = (java.lang.Number) r0
            if (r0 == 0) goto L_0x000c
            long r48 = r0.longValue()
            java.lang.String[] r0 = new java.lang.String[r3]
            r0[r2] = r23
            java.lang.String r7 = "ttl_seconds"
            r0[r1] = r7
            r30 = r0
            java.lang.Object r0 = r24.A05(r25, r26, r27, r28, r29, r30, r31)
            java.lang.Number r0 = (java.lang.Number) r0
            if (r0 == 0) goto L_0x000c
            long r50 = r0.longValue()
            java.lang.String[] r0 = new java.lang.String[r3]
            r0[r2] = r23
            java.lang.String r7 = "surface_delay_time_seconds"
            r0[r1] = r7
            r30 = r0
            java.lang.Object r0 = r24.A05(r25, r26, r27, r28, r29, r30, r31)
            java.lang.Number r0 = (java.lang.Number) r0
            if (r0 == 0) goto L_0x000c
            long r52 = r0.longValue()
            java.lang.String[] r0 = new java.lang.String[r3]
            r0[r2] = r23
            java.lang.String r7 = "experiment_key"
            r0[r1] = r7
            r7 = r5
            r13 = r0
            r14 = r2
            java.lang.Object r17 = r7.A05(r8, r9, r10, r11, r12, r13, r14)
            r0 = r17
            java.lang.String r0 = (java.lang.String) r0
            r17 = r0
            java.lang.String[] r0 = new java.lang.String[r3]
            r0[r2] = r23
            java.lang.String r7 = "max_impressions"
            r0[r1] = r7
            r30 = r0
            java.lang.Object r0 = r24.A05(r25, r26, r27, r28, r29, r30, r31)
            java.lang.Number r0 = (java.lang.Number) r0
            if (r0 == 0) goto L_0x000c
            long r54 = r0.longValue()
            java.lang.String[] r0 = new java.lang.String[r3]
            r0[r2] = r23
            java.lang.String r7 = "impression_cooldown"
            r0[r1] = r7
            r30 = r0
            java.lang.Object r0 = r24.A05(r25, r26, r27, r28, r29, r30, r31)
            java.lang.Number r0 = (java.lang.Number) r0
            if (r0 == 0) goto L_0x000c
            long r56 = r0.longValue()
            java.lang.String[] r0 = new java.lang.String[r3]
            r0[r2] = r23
            java.lang.String r7 = "eligibility_duration_ms"
            r0[r1] = r7
            r30 = r0
            java.lang.Object r0 = r24.A05(r25, r26, r27, r28, r29, r30, r31)
            java.lang.Number r0 = (java.lang.Number) r0
            if (r0 == 0) goto L_0x000c
            long r58 = r0.longValue()
            java.lang.String[] r0 = new java.lang.String[r3]
            r0[r2] = r23
            java.lang.String r7 = "priority"
            r0[r1] = r7
            r30 = r0
            java.lang.Object r0 = r24.A05(r25, r26, r27, r28, r29, r30, r31)
            java.lang.Number r0 = (java.lang.Number) r0
            if (r0 == 0) goto L_0x000c
            long r60 = r0.longValue()
            java.lang.String[] r0 = new java.lang.String[r1]
            java.lang.String r7 = "header"
            r0[r2] = r7
            r7 = 7
            java.lang.Object r16 = A00(r4, r5, r0, r7)
            r0 = r16
            X.9Cb r0 = (X.C178169Cb) r0
            r16 = r0
            java.lang.String[] r0 = new java.lang.String[r1]
            java.lang.String r7 = "image"
            r0[r2] = r7
            r7 = 9
            java.lang.Object r15 = A00(r4, r5, r0, r7)
            X.9DI r15 = (X.AnonymousClass9DI) r15
            java.lang.String[] r7 = new java.lang.String[r1]
            java.lang.String r0 = "primary_action"
            r7[r2] = r0
            r9 = 3
            X.AfT r0 = new X.AfT
            r0.<init>(r9)
            java.lang.Object r14 = r5.A02(r4, r0, r7)
            X.9Ct r14 = (X.C178349Ct) r14
            java.lang.String[] r7 = new java.lang.String[r1]
            java.lang.String r0 = "secondary_action"
            r7[r2] = r0
            X.AfT r0 = new X.AfT
            r0.<init>(r3)
            java.lang.Object r13 = r5.A02(r4, r0, r7)
            X.9Ct r13 = (X.C178349Ct) r13
            java.lang.String[] r0 = new java.lang.String[r1]
            java.lang.String r7 = "colors"
            r0[r2] = r7
            r7 = 43
            java.lang.Object r12 = X.C21288AhZ.A01(r4, r5, r0, r7)
            X.9D9 r12 = (X.AnonymousClass9D9) r12
            java.lang.String[] r0 = new java.lang.String[r1]
            java.lang.String r7 = "content_attributes"
            r0[r2] = r7
            r7 = 44
            java.lang.Object r11 = X.C21288AhZ.A01(r4, r5, r0, r7)
            X.9DM r11 = (X.AnonymousClass9DM) r11
            java.lang.String[] r0 = new java.lang.String[r3]
            r0[r2] = r23
            java.lang.String r7 = "filter_rules"
            r0[r1] = r7
            r7 = 45
            java.lang.Object r10 = X.C21288AhZ.A01(r4, r5, r0, r7)
            X.9DM r10 = (X.AnonymousClass9DM) r10
            java.lang.String[] r0 = new java.lang.String[r3]
            r0[r2] = r23
            java.lang.String r7 = "instance_log_data"
            r0[r1] = r7
            r7 = 46
            java.lang.Object r8 = X.C21288AhZ.A01(r4, r5, r0, r7)
            X.9DM r8 = (X.AnonymousClass9DM) r8
            java.lang.String[] r0 = new java.lang.String[r3]
            r0[r2] = r23
            java.lang.String r7 = "pacing"
            r0[r1] = r7
            r7 = 47
            java.lang.Object r7 = X.C21288AhZ.A01(r4, r5, r0, r7)
            X.9DP r7 = (X.AnonymousClass9DP) r7
            java.lang.String[] r0 = new java.lang.String[r9]
            r0[r2] = r23
            java.lang.String r9 = "triggers"
            r0[r1] = r9
            java.lang.String r9 = "trigger"
            r0[r3] = r9
            r3 = 48
            X.AhZ r9 = new X.AhZ
            r9.<init>(r3)
            r28 = 1
            r30 = 50
            r26 = r9
            r27 = r0
            java.util.ArrayList r45 = r24.A08(r25, r26, r27, r28, r30)
            if (r45 == 0) goto L_0x000c
            java.lang.String[] r3 = new java.lang.String[r1]
            r3[r2] = r23
            r1 = 8
            X.AhS r0 = new X.AhS
            r0.<init>(r1)
            r30 = r28
            r26 = r0
            r27 = r3
            java.util.ArrayList r0 = r24.A08(r25, r26, r27, r28, r30)
            if (r0 == 0) goto L_0x000c
            X.1ca r23 = X.AnonymousClass8BR.A0m(r0, r2)
            if (r23 == 0) goto L_0x000c
            X.2Q9 r6 = new X.2Q9
            r30 = r16
            r31 = r11
            r32 = r10
            r33 = r8
            r39 = r22
            r40 = r21
            r41 = r20
            r42 = r19
            r43 = r18
            r44 = r17
            r22 = r6
            r24 = r4
            r25 = r7
            r26 = r15
            r27 = r14
            r28 = r13
            r29 = r12
            r22.<init>(r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r48, r50, r52, r54, r56, r58, r60)
            return r6
        L_0x0406:
            r2 = 0
            boolean r1 = X.C18070vi.A17(r4, r5)
            java.lang.String r0 = "header"
            boolean r0 = r5.A09(r4, r0)
            r6 = 0
            if (r0 == 0) goto L_0x000c
            java.lang.String[] r1 = new java.lang.String[r1]
            java.lang.String r0 = "title"
            r1[r2] = r0
            java.lang.Object r0 = X.AnonymousClass8BY.A0W(r4, r5, r6, r1, r2)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L_0x000c
            X.9Cb r6 = new X.9Cb
            r6.<init>(r4, r0)
            return r6
        L_0x0428:
            r8 = 0
            boolean r7 = X.C18070vi.A17(r4, r5)
            java.lang.String r0 = "image"
            boolean r0 = r5.A09(r4, r0)
            r6 = 0
            if (r0 == 0) goto L_0x000c
            java.lang.String[] r1 = new java.lang.String[r7]
            java.lang.String r0 = "description"
            r1[r8] = r0
            java.lang.Object r3 = X.AnonymousClass8BY.A0W(r4, r5, r6, r1, r8)
            java.lang.String r3 = (java.lang.String) r3
            if (r3 == 0) goto L_0x000c
            java.lang.String[] r1 = new java.lang.String[r7]
            java.lang.String r0 = "light"
            r1[r8] = r0
            r0 = 4
            java.lang.Object r2 = A00(r4, r5, r1, r0)
            X.9DM r2 = (X.AnonymousClass9DM) r2
            java.lang.String[] r1 = new java.lang.String[r7]
            java.lang.String r0 = "dark"
            r1[r8] = r0
            r0 = 5
            java.lang.Object r0 = A00(r4, r5, r1, r0)
            X.9DM r0 = (X.AnonymousClass9DM) r0
            X.9DI r6 = new X.9DI
            r6.<init>((X.C29621ca) r4, (X.AnonymousClass9DM) r2, (X.AnonymousClass9DM) r0, (java.lang.String) r3)
            return r6
        L_0x0464:
            X.C18070vi.A0h(r4, r5)
            java.lang.String r0 = "fee"
            goto L_0x046f
        L_0x046a:
            X.C18070vi.A0h(r4, r5)
            java.lang.String r0 = "gst"
        L_0x046f:
            boolean r0 = r5.A09(r4, r0)
            r6 = 0
            if (r0 == 0) goto L_0x000c
            X.9DD r0 = X.C20072A5y.A00(r4, r5)
            if (r0 == 0) goto L_0x000c
            X.9DM r6 = new X.9DM
            r6.<init>((X.C29621ca) r4, (X.AnonymousClass9DD) r0)
            return r6
        L_0x0482:
            r0 = 0
            X.C18070vi.A0d(r4, r0)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21281AhS.BCF(X.1ca, X.2rm):java.lang.Object");
    }
}
