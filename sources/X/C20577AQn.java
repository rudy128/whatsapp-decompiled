package X;

/* renamed from: X.AQn  reason: case insensitive filesystem */
public final class C20577AQn implements C72113Kr {
    public static final long A05;
    public static final long A06;
    public static final long A07;
    public static final long A08;
    public final C25111Mx A00;
    public final C19830z4 A01;
    public final AnonymousClass00H A02;
    public final C18100vl A03 = C21528Alb.A00(this, 30);
    public final AnonymousClass11P A04;

    static {
        C179589Io r2 = C179589Io.DAYS;
        A05 = C196999vz.A00(r2, 7);
        A06 = C196999vz.A00(r2, 1);
        C179589Io r22 = C179589Io.HOURS;
        A08 = C196999vz.A00(r22, 2);
        A07 = C196999vz.A00(r22, 36);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:100:?, code lost:
        X.CDX.A00(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x0276, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x0279, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x027a, code lost:
        X.CDX.A00(r5, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x027d, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x00b5, code lost:
        if (X.C21348Aid.A02(r23, r0) < 0) goto L_0x00b7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0115, code lost:
        if ((r2 / r0) == r25) goto L_0x0136;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0134, code lost:
        if ((r2 ^ r19) >= 0) goto L_0x0136;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0189, code lost:
        if (r2 > r10) goto L_0x0155;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x0272, code lost:
        r0 = move-exception;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void Bqf() {
        /*
            r34 = this;
            r33 = r34
            r0 = r33
            X.0z4 r0 = r0.A01
            r32 = r0
            android.content.SharedPreferences r1 = X.C17890vO.A0B(r32)
            java.lang.String r31 = "privacy_token_last_batch_time_sec"
            r0 = r31
            long r1 = X.C17890vO.A04(r1, r0)
            X.9Io r30 = X.C179589Io.SECONDS
            r0 = r30
            long r13 = X.C196999vz.A01(r0, r1)
            r0 = r33
            X.0vl r0 = r0.A03
            java.lang.Object r0 = r0.getValue()
            X.Aid r0 = (X.C21348Aid) r0
            long r8 = r0.A00
            r0 = r33
            X.11P r0 = r0.A04
            long r1 = X.AnonymousClass11P.A01(r0)
            X.9Io r19 = X.C179589Io.MILLISECONDS
            r0 = r19
            long r6 = X.C196999vz.A01(r0, r1)
            long r0 = A06
            long r23 = X.C21348Aid.A04(r6, r0)
            long r4 = A08
            r10 = 1
            long r0 = r4 >> r10
            long r2 = -r0
            int r0 = (int) r4
            r0 = r0 & 1
            long r2 = r2 << r10
            long r0 = (long) r0
            long r2 = r2 + r0
            r0 = r23
            long r2 = X.C21348Aid.A04(r0, r2)
            long r4 = A05
            long r0 = X.C21348Aid.A04(r13, r4)
            int r0 = X.C21348Aid.A02(r2, r0)
            boolean r29 = X.AnonymousClass000.A1R(r0)
            long r0 = r8 >> r10
            long r2 = -r0
            int r0 = (int) r8
            r0 = r0 & 1
            long r2 = r2 << r10
            long r0 = (long) r0
            long r2 = r2 + r0
            long r0 = X.C21348Aid.A04(r13, r2)
            double r10 = X.C21348Aid.A00(r0, r4)
            long r0 = (long) r10
            r27 = r0
            long r0 = X.C21348Aid.A04(r6, r2)
            double r0 = X.C21348Aid.A00(r0, r4)
            long r15 = (long) r0
            double r10 = (double) r15
            r2 = r4
            int r12 = X.C22339B3q.A00(r10)
            double r0 = (double) r12
            int r17 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            if (r17 != 0) goto L_0x019f
            boolean r0 = X.C21348Aid.A07(r4)
            if (r0 == 0) goto L_0x00cb
            if (r12 == 0) goto L_0x027e
            if (r12 > 0) goto L_0x009a
            r10 = 1
            long r0 = r4 >> r10
            long r2 = -r0
            int r0 = (int) r4
            r0 = r0 & 1
            long r2 = r2 << r10
            long r0 = (long) r0
        L_0x0099:
            long r2 = r2 + r0
        L_0x009a:
            long r2 = X.C21348Aid.A04(r2, r8)
            long r0 = A07
            long r0 = X.C21348Aid.A04(r2, r0)
            int r2 = (r27 > r15 ? 1 : (r27 == r15 ? 0 : -1))
            if (r2 >= 0) goto L_0x00b7
            int r2 = X.C21348Aid.A02(r6, r0)
            if (r2 >= 0) goto L_0x00b7
            r2 = r23
            int r0 = X.C21348Aid.A02(r2, r0)
            r2 = 1
            if (r0 >= 0) goto L_0x00b8
        L_0x00b7:
            r2 = 0
        L_0x00b8:
            long r0 = X.C21348Aid.A04(r6, r4)
            int r0 = X.C21348Aid.A02(r13, r0)
            boolean r0 = X.AnonymousClass000.A1R(r0)
            if (r29 != 0) goto L_0x0200
            if (r2 != 0) goto L_0x0200
            if (r0 != 0) goto L_0x0200
            return
        L_0x00cb:
            if (r12 != 0) goto L_0x00d0
            r2 = 0
            goto L_0x009a
        L_0x00d0:
            r19 = 1
            long r25 = r4 >> r19
            long r0 = (long) r12
            long r2 = r0 * r25
            int r10 = (int) r4
            r10 = r10 & 1
            if (r10 != 0) goto L_0x0111
            r17 = -2147483647(0xffffffff80000001, double:NaN)
            int r10 = (r17 > r25 ? 1 : (r17 == r25 ? 0 : -1))
            if (r10 > 0) goto L_0x00ef
            r17 = 2147483648(0x80000000, double:1.0609978955E-314)
            int r10 = (r25 > r17 ? 1 : (r25 == r17 ? 0 : -1))
            if (r10 >= 0) goto L_0x00ef
        L_0x00ec:
            long r2 = r2 << r19
            goto L_0x009a
        L_0x00ef:
            long r17 = r2 / r0
            int r10 = (r17 > r25 ? 1 : (r17 == r25 ? 0 : -1))
            if (r10 != 0) goto L_0x0118
            r10 = -4611686018426999999(0xc00000000005eb41, double:-2.0000000001722644)
            int r0 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r0 > 0) goto L_0x0108
            r10 = 4611686018427000000(0x3ffffffffffa14c0, double:1.999999999913868)
            int r0 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1))
            if (r0 >= 0) goto L_0x0108
            goto L_0x00ec
        L_0x0108:
            r0 = 1000000(0xf4240, double:4.940656E-318)
            long r2 = r2 / r0
            long r2 = r2 << r19
            r0 = 1
            goto L_0x0099
        L_0x0111:
            long r10 = r2 / r0
            int r0 = (r10 > r25 ? 1 : (r10 == r25 ? 0 : -1))
            if (r0 != 0) goto L_0x018c
            goto L_0x0136
        L_0x0118:
            r21 = 1000000(0xf4240, double:4.940656E-318)
            long r17 = r25 / r21
            long r10 = r17 * r21
            long r2 = r25 - r10
            long r19 = r0 * r17
            long r2 = r2 * r0
            long r2 = r2 / r21
            long r2 = r2 + r19
            long r10 = r19 / r0
            int r0 = (r10 > r17 ? 1 : (r10 == r17 ? 0 : -1))
            if (r0 != 0) goto L_0x018c
            long r17 = r2 ^ r19
            r10 = 0
            int r0 = (r17 > r10 ? 1 : (r17 == r10 ? 0 : -1))
            if (r0 < 0) goto L_0x018c
        L_0x0136:
            r0 = -4611686018427387903(0xc000000000000001, double:-2.0000000000000004)
            r10 = 4611686018427387903(0x3fffffffffffffff, double:1.9999999999999998)
            r18 = 1
            X.B3s r12 = new X.B3s
            r12.<init>(r0, r10)
            boolean r10 = r12 instanceof X.AnonymousClass3MT
            if (r10 == 0) goto L_0x015f
            java.lang.Long r0 = java.lang.Long.valueOf(r2)
            X.3MT r12 = (X.AnonymousClass3MT) r12
            java.lang.Comparable r17 = X.C28851b7.A06(r0, r12)
        L_0x0155:
            long r2 = X.C17880vN.A05(r17)
        L_0x0159:
            r0 = 1
            long r2 = r2 << r0
            long r2 = r2 + r18
            goto L_0x009a
        L_0x015f:
            long r10 = r12.A01
            int r17 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            if (r17 <= 0) goto L_0x017b
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Cannot coerce value to an empty range: "
            r1.append(r0)
            r1.append(r12)
            r0 = 46
            r1.append(r0)
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0j(r1)
            throw r0
        L_0x017b:
            java.lang.Long r17 = java.lang.Long.valueOf(r0)
            int r12 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r12 < 0) goto L_0x0155
            java.lang.Long r17 = java.lang.Long.valueOf(r10)
            int r0 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1))
            if (r0 <= 0) goto L_0x0159
            goto L_0x0155
        L_0x018c:
            int r1 = java.lang.Long.signum(r25)
            int r0 = java.lang.Integer.signum(r12)
            int r1 = r1 * r0
            if (r1 <= 0) goto L_0x019b
            long r2 = X.C21348Aid.A01
            goto L_0x009a
        L_0x019b:
            long r2 = X.C21348Aid.A02
            goto L_0x009a
        L_0x019f:
            int r0 = (int) r4
            r0 = r0 & 1
            if (r0 != 0) goto L_0x01d3
            X.9Io r12 = X.C179589Io.NANOSECONDS
        L_0x01a6:
            double r0 = X.C21348Aid.A01(r12, r4)
            double r0 = r0 * r10
            X.9Io r2 = X.C179589Io.NANOSECONDS
            double r10 = X.C181869Sd.A00(r12, r2, r0)
            boolean r2 = java.lang.Double.isNaN(r10)
            r2 = r2 ^ 1
            if (r2 == 0) goto L_0x0285
            long r2 = X.C22339B3q.A02(r10)
            r17 = -4611686018426999999(0xc00000000005eb41, double:-2.0000000001722644)
            int r10 = (r17 > r2 ? 1 : (r17 == r2 ? 0 : -1))
            if (r10 > 0) goto L_0x01d6
            r17 = 4611686018427000000(0x3ffffffffffa14c0, double:1.999999999913868)
            int r10 = (r2 > r17 ? 1 : (r2 == r17 ? 0 : -1))
            if (r10 >= 0) goto L_0x01d6
            r0 = 1
            long r2 = r2 << r0
            goto L_0x009a
        L_0x01d3:
            r12 = r19
            goto L_0x01a6
        L_0x01d6:
            r2 = r19
            double r0 = X.C181869Sd.A00(r12, r2, r0)
            long r2 = X.C22339B3q.A02(r0)
            r10 = -4611686018426(0xfffffbce4217d286, double:NaN)
            int r0 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r0 > 0) goto L_0x01fa
            r10 = 4611686018427(0x431bde82d7b, double:2.278475631111E-311)
            int r0 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1))
            if (r0 >= 0) goto L_0x01fa
            r0 = 1000000(0xf4240, double:4.940656E-318)
            long r2 = r2 * r0
            r0 = 1
            long r2 = r2 << r0
            goto L_0x009a
        L_0x01fa:
            long r2 = X.AnonymousClass8BY.A06(r2)
            goto L_0x009a
        L_0x0200:
            r0 = r33
            X.1Mx r0 = r0.A00
            X.1My r0 = r0.A01
            X.1Lt r0 = r0.A00
            X.1at r5 = r0.get()
            r0 = r5
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x0277 }
            X.1Ev r3 = r0.A02     // Catch:{ all -> 0x0277 }
            java.lang.String r2 = "SELECT jid FROM wa_trusted_contacts_send WHERE real_issue_timestamp >= 0"
            r0 = 0
            java.lang.String[] r1 = new java.lang.String[r0]     // Catch:{ all -> 0x0277 }
            java.lang.String r0 = "GET_DEFERRED_TOKEN_JIDS"
            android.database.Cursor r4 = r3.A0A(r2, r0, r1)     // Catch:{ all -> 0x0277 }
            java.lang.String r0 = "jid"
            int r3 = r4.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0270 }
            java.util.HashSet r2 = X.C17880vN.A12()     // Catch:{ all -> 0x0270 }
        L_0x0226:
            boolean r0 = r4.moveToNext()     // Catch:{ all -> 0x0270 }
            if (r0 == 0) goto L_0x023c
            X.1Dw r1 = com.whatsapp.jid.UserJid.Companion     // Catch:{ all -> 0x0270 }
            java.lang.String r0 = r4.getString(r3)     // Catch:{ all -> 0x0270 }
            com.whatsapp.jid.UserJid r0 = r1.A04(r0)     // Catch:{ all -> 0x0270 }
            if (r0 == 0) goto L_0x0226
            r2.add(r0)     // Catch:{ all -> 0x0270 }
            goto L_0x0226
        L_0x023c:
            r4.close()     // Catch:{ all -> 0x0277 }
            r5.close()
            java.util.Iterator r2 = r2.iterator()
        L_0x0246:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0260
            java.lang.Object r1 = r2.next()
            com.whatsapp.jid.UserJid r1 = (com.whatsapp.jid.UserJid) r1
            r0 = r33
            X.00H r0 = r0.A02
            java.lang.Object r0 = r0.get()
            X.2nK r0 = (X.C60062nK) r0
            r0.A00(r1)
            goto L_0x0246
        L_0x0260:
            r0 = r30
            long r2 = X.C21348Aid.A06(r0, r6)
            android.content.SharedPreferences$Editor r1 = X.C19830z4.A00(r32)
            r0 = r31
            X.C17880vN.A1D(r1, r0, r2)
            return
        L_0x0270:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0272 }
        L_0x0272:
            r0 = move-exception
            X.CDX.A00(r4, r1)     // Catch:{ all -> 0x0277 }
            throw r0     // Catch:{ all -> 0x0277 }
        L_0x0277:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0279 }
        L_0x0279:
            r0 = move-exception
            X.CDX.A00(r5, r1)
            throw r0
        L_0x027e:
            java.lang.String r0 = "Multiplying infinite duration by zero yields an undefined result."
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0k(r0)
            throw r0
        L_0x0285:
            java.lang.String r0 = "Duration value cannot be NaN."
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0k(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20577AQn.Bqf():void");
    }

    public C20577AQn(C25111Mx r2, AnonymousClass11P r3, C19830z4 r4, AnonymousClass00H r5) {
        C18070vi.A0s(r3, r2, r4, r5);
        this.A04 = r3;
        this.A00 = r2;
        this.A01 = r4;
        this.A02 = r5;
    }
}
