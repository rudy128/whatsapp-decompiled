package X;

/* renamed from: X.2ql  reason: invalid class name and case insensitive filesystem */
public final class C62082ql {
    public static final long A06;
    public static final long A07;
    public final AnonymousClass00H A00;
    public final AnonymousClass00H A01;
    public final AnonymousClass00H A02;
    public final AnonymousClass00H A03;
    public final AnonymousClass00H A04;
    public final AnonymousClass00H A05;

    static {
        long j = new C70543Bm().A01 - 65536;
        A07 = j;
        A06 = (j * 3) / 4;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0155, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:?, code lost:
        X.CDX.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0159, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x015c, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x015d, code lost:
        X.CDX.A00(r2, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0160, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x016a, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:?, code lost:
        X.CDX.A00(r7, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x016e, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0171, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0172, code lost:
        X.CDX.A00(r5, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0175, code lost:
        throw r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.Map A00(java.util.Set r25) {
        /*
            r24 = this;
            r10 = r25
            boolean r0 = r10.isEmpty()
            if (r0 == 0) goto L_0x0010
            X.1CQ r5 = X.AnonymousClass1CQ.A00
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.emptyMap, V of kotlin.collections.MapsKt__MapsKt.emptyMap>"
            X.C18070vi.A0z(r5, r0)
            return r5
        L_0x0010:
            int r3 = r10.size()
            java.lang.String r9 = "ClientAssignedLidManager/total_client_assigned_lid_ids_generated"
            r6 = r24
            X.00H r8 = r6.A01
            X.1au r5 = X.AnonymousClass1Cd.A00(r8)
            X.1xA r7 = r5.BD0()     // Catch:{ all -> 0x016f }
            X.00H r11 = r6.A02     // Catch:{ all -> 0x0168 }
            java.lang.Object r2 = r11.get()     // Catch:{ all -> 0x0168 }
            X.1La r2 = (X.C24621La) r2     // Catch:{ all -> 0x0168 }
            r0 = 0
            long r13 = r2.A01(r9, r0)     // Catch:{ all -> 0x0168 }
            long r1 = (long) r3     // Catch:{ all -> 0x0168 }
            long r1 = r1 + r13
            long r3 = A07     // Catch:{ all -> 0x0168 }
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 >= 0) goto L_0x0161
            long r3 = A06     // Catch:{ all -> 0x0168 }
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 < 0) goto L_0x0057
            X.00H r0 = r6.A00     // Catch:{ all -> 0x0168 }
            java.lang.Object r12 = r0.get()     // Catch:{ all -> 0x0168 }
            X.190 r12 = (X.AnonymousClass190) r12     // Catch:{ all -> 0x0168 }
            java.lang.StringBuilder r3 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x0168 }
            java.lang.String r0 = "totalClientAssignedLidIdsGenerated="
            java.lang.String r4 = X.C17890vO.A0a(r0, r3, r1)     // Catch:{ all -> 0x0168 }
            r3 = 1
            java.lang.String r0 = "ClientAssignedLidManager/clientAssignedLidsRunningLow"
            r12.A0G(r0, r4, r3)     // Catch:{ all -> 0x0168 }
        L_0x0057:
            java.lang.Object r0 = r11.get()     // Catch:{ all -> 0x0168 }
            X.1La r0 = (X.C24621La) r0     // Catch:{ all -> 0x0168 }
            r0.A05(r9, r1)     // Catch:{ all -> 0x0168 }
            r7.A00()     // Catch:{ all -> 0x0168 }
            r7.close()     // Catch:{ all -> 0x016f }
            r5.close()
            r22 = 65536(0x10000, double:3.2379E-319)
            long r22 = r22 + r13
            X.1au r2 = X.AnonymousClass1Cd.A00(r8)
            X.1xA r3 = r2.BD0()     // Catch:{ all -> 0x015a }
            java.util.LinkedHashSet r9 = X.C17880vN.A14()     // Catch:{ all -> 0x0153 }
            int r8 = r10.size()     // Catch:{ all -> 0x0153 }
            r20 = -1
            r7 = 1
            if (r7 > r8) goto L_0x00f4
        L_0x0083:
            long r4 = (long) r7     // Catch:{ all -> 0x0153 }
            long r4 = r4 + r22
            r0 = 24
            long r4 = r4 << r0
            long r0 = X.C50832Vy.A00     // Catch:{ all -> 0x0153 }
            long r4 = r4 | r0
            android.os.Parcelable$Creator r0 = X.AnonymousClass1E2.CREATOR     // Catch:{ all -> 0x0153 }
            r13 = 10
            r18 = 0
            int r0 = (r4 > r18 ? 1 : (r4 == r18 ? 0 : -1))
            if (r0 != 0) goto L_0x00ae
            java.lang.String r1 = "0"
        L_0x0098:
            X.1E2 r1 = X.C42501yH.A01(r1)     // Catch:{ all -> 0x0153 }
            X.00H r0 = r6.A05     // Catch:{ all -> 0x0153 }
            long r4 = X.AnonymousClass1DL.A02(r1, r0)     // Catch:{ all -> 0x0153 }
            int r0 = (r4 > r20 ? 1 : (r4 == r20 ? 0 : -1))
            if (r0 == 0) goto L_0x00ed
            r9.add(r1)     // Catch:{ all -> 0x0153 }
            if (r7 == r8) goto L_0x00f4
            int r7 = r7 + 1
            goto L_0x0083
        L_0x00ae:
            int r0 = (r4 > r18 ? 1 : (r4 == r18 ? 0 : -1))
            if (r0 <= 0) goto L_0x00b7
            java.lang.String r1 = java.lang.Long.toString(r4, r13)     // Catch:{ all -> 0x0153 }
            goto L_0x0098
        L_0x00b7:
            r0 = 64
            char[] r12 = new char[r0]     // Catch:{ all -> 0x0153 }
            r0 = 1
            long r16 = r4 >>> r0
            r0 = 5
            long r16 = r16 / r0
            r0 = 10
            r14 = 10
            long r0 = r0 * r16
            long r4 = r4 - r0
            r11 = 63
            int r0 = (int) r4     // Catch:{ all -> 0x0153 }
            char r0 = java.lang.Character.forDigit(r0, r13)     // Catch:{ all -> 0x0153 }
            r12[r11] = r0     // Catch:{ all -> 0x0153 }
        L_0x00d2:
            int r0 = (r16 > r18 ? 1 : (r16 == r18 ? 0 : -1))
            if (r0 <= 0) goto L_0x00e4
            int r11 = r11 + -1
            long r0 = r16 % r14
            int r4 = (int) r0     // Catch:{ all -> 0x0153 }
            char r0 = java.lang.Character.forDigit(r4, r13)     // Catch:{ all -> 0x0153 }
            r12[r11] = r0     // Catch:{ all -> 0x0153 }
            long r16 = r16 / r14
            goto L_0x00d2
        L_0x00e4:
            r0 = 64
            int r0 = r0 - r11
            java.lang.String r1 = new java.lang.String     // Catch:{ all -> 0x0153 }
            r1.<init>(r12, r11, r0)     // Catch:{ all -> 0x0153 }
            goto L_0x0098
        L_0x00ed:
            java.lang.String r0 = "LID was not successfully stored in the JidTable"
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0n(r0)     // Catch:{ all -> 0x0153 }
            throw r0     // Catch:{ all -> 0x0153 }
        L_0x00f4:
            java.util.ArrayList r0 = X.C29431cG.A0j(r10, r9)     // Catch:{ all -> 0x0153 }
            java.util.Map r5 = X.AnonymousClass1D7.A0D(r0)     // Catch:{ all -> 0x0153 }
            java.util.Iterator r7 = X.AnonymousClass000.A15(r5)     // Catch:{ all -> 0x0153 }
        L_0x0100:
            boolean r0 = r7.hasNext()     // Catch:{ all -> 0x0153 }
            if (r0 == 0) goto L_0x013e
            java.util.Map$Entry r0 = X.AnonymousClass000.A16(r7)     // Catch:{ all -> 0x0153 }
            java.lang.Object r4 = r0.getKey()     // Catch:{ all -> 0x0153 }
            com.whatsapp.jid.PhoneUserJid r4 = (com.whatsapp.jid.PhoneUserJid) r4     // Catch:{ all -> 0x0153 }
            java.lang.Object r1 = r0.getValue()     // Catch:{ all -> 0x0153 }
            X.1E2 r1 = (X.AnonymousClass1E2) r1     // Catch:{ all -> 0x0153 }
            X.00H r0 = r6.A05     // Catch:{ all -> 0x0153 }
            long r10 = X.AnonymousClass1DL.A02(r1, r0)     // Catch:{ all -> 0x0153 }
            long r12 = X.AnonymousClass1DL.A02(r4, r0)     // Catch:{ all -> 0x0153 }
            X.00H r0 = r6.A04     // Catch:{ all -> 0x0153 }
            java.lang.Object r4 = r0.get()     // Catch:{ all -> 0x0153 }
            X.1Lj r4 = (X.C24711Lj) r4     // Catch:{ all -> 0x0153 }
            long r0 = -r10
            java.lang.Long r9 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0153 }
            X.2ko r8 = new X.2ko     // Catch:{ all -> 0x0153 }
            r8.<init>(r9, r10, r12)     // Catch:{ all -> 0x0153 }
            java.util.List r0 = java.util.Collections.singletonList(r8)     // Catch:{ all -> 0x0153 }
            java.util.ArrayList r0 = r4.A02(r0)     // Catch:{ all -> 0x0153 }
            r0.isEmpty()     // Catch:{ all -> 0x0153 }
            goto L_0x0100
        L_0x013e:
            r3.A00()     // Catch:{ all -> 0x0153 }
            r3.close()     // Catch:{ all -> 0x015a }
            r2.close()
            X.00H r0 = r6.A03
            java.lang.Object r0 = r0.get()
            X.1Ln r0 = (X.C24751Ln) r0
            r0.A0O()
            return r5
        L_0x0153:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0155 }
        L_0x0155:
            r0 = move-exception
            X.CDX.A00(r3, r1)     // Catch:{ all -> 0x015a }
            throw r0     // Catch:{ all -> 0x015a }
        L_0x015a:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x015c }
        L_0x015c:
            r1 = move-exception
            X.CDX.A00(r2, r0)
            throw r1
        L_0x0161:
            java.lang.String r0 = "Total client assigned LID ids can not exceed the allowed limit"
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0n(r0)     // Catch:{ all -> 0x0168 }
            throw r0     // Catch:{ all -> 0x0168 }
        L_0x0168:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x016a }
        L_0x016a:
            r0 = move-exception
            X.CDX.A00(r7, r1)     // Catch:{ all -> 0x016f }
            throw r0     // Catch:{ all -> 0x016f }
        L_0x016f:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0171 }
        L_0x0171:
            r1 = move-exception
            X.CDX.A00(r5, r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C62082ql.A00(java.util.Set):java.util.Map");
    }

    public C62082ql(AnonymousClass00H r2, AnonymousClass00H r3, AnonymousClass00H r4, AnonymousClass00H r5, AnonymousClass00H r6, AnonymousClass00H r7) {
        C18070vi.A0w(r2, r3, r4, r5, r6);
        C18070vi.A0d(r7, 6);
        this.A05 = r2;
        this.A00 = r3;
        this.A04 = r4;
        this.A03 = r5;
        this.A02 = r6;
        this.A01 = r7;
    }
}
