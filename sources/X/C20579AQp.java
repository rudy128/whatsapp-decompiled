package X;

import java.util.List;

/* renamed from: X.AQp  reason: case insensitive filesystem */
public final class C20579AQp implements C72113Kr {
    public final C24881Ma A00;
    public final AnonymousClass00H A01;

    /* JADX WARNING: Code restructure failed: missing block: B:52:0x013b, code lost:
        r6 = -1;
        r5 = -1;
        r4 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x014d, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:?, code lost:
        X.CDX.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0151, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0154, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0155, code lost:
        X.CDX.A00(r17, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x015a, code lost:
        throw r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void Bqf() {
        /*
            r25 = this;
            r24 = r25
            r0 = r24
            X.00H r0 = r0.A01
            java.lang.Object r11 = r0.get()
            X.9yY r11 = (X.C198569yY) r11
            X.0ve r1 = r11.A03
            r0 = 4960(0x1360, float:6.95E-42)
            X.0vf r15 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r15, r1, r0)
            if (r0 == 0) goto L_0x01d4
            X.0z4 r9 = r11.A01
            android.content.SharedPreferences r0 = X.C17890vO.A0B(r9)
            java.lang.String r8 = "calling_privacy_last_unknown_caller_stats_millis"
            long r6 = X.C17890vO.A04(r0, r8)
            X.11P r5 = r11.A00
            long r1 = r5.A05()
            long r3 = X.C198569yY.A06
            long r6 = r6 + r3
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x01d4
            android.content.SharedPreferences$Editor r0 = X.C19830z4.A00(r9)
            X.C17880vN.A1D(r0, r8, r1)
            long[] r10 = X.C198569yY.A07
            r1 = 0
            X.C18070vi.A0d(r10, r1)
            r0 = 5
            X.9eV[] r14 = new X.C186629eV[r0]
            r9 = 0
            r21 = r10[r1]
            long r19 = r5.A05()
            r8 = 0
            r7 = 0
            r6 = 0
            r5 = 0
            r4 = 0
        L_0x004d:
            int r9 = r9 + 1
            X.1TD r2 = r11.A02
            r1 = 0
            r0 = 1000(0x3e8, float:1.401E-42)
            java.util.ArrayList r18 = r2.A09(r1, r8, r0)
            int r8 = r8 + r0
            boolean r0 = r18.isEmpty()
            if (r0 != 0) goto L_0x013e
            java.util.Iterator r13 = r18.iterator()
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto L_0x0161
            java.lang.Object r0 = r13.next()
            X.AiT r0 = (X.C21340AiT) r0
            long r2 = r0.A00
        L_0x0071:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto L_0x0085
            java.lang.Object r0 = r13.next()
            X.AiT r0 = (X.C21340AiT) r0
            long r0 = r0.A00
            int r12 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r12 <= 0) goto L_0x0071
            r2 = r0
            goto L_0x0071
        L_0x0085:
            java.util.Iterator r17 = r18.iterator()
            boolean r0 = r17.hasNext()
            if (r0 == 0) goto L_0x015b
            java.lang.Object r0 = r17.next()
            X.AiT r0 = (X.C21340AiT) r0
            long r0 = r0.A00
        L_0x0097:
            boolean r12 = r17.hasNext()
            if (r12 == 0) goto L_0x00ab
            java.lang.Object r12 = r17.next()
            X.AiT r12 = (X.C21340AiT) r12
            long r12 = r12.A00
            int r16 = (r0 > r12 ? 1 : (r0 == r12 ? 0 : -1))
            if (r16 >= 0) goto L_0x0097
            r0 = r12
            goto L_0x0097
        L_0x00ab:
            X.00H r12 = r11.A05
            java.lang.Object r13 = r12.get()
            X.9XP r13 = (X.AnonymousClass9XP) r13
            java.util.HashSet r12 = X.C17880vN.A12()
            X.1Cd r13 = r13.A00
            X.1at r17 = r13.get()
            r13 = r17
            X.1av r13 = (X.C28801av) r13     // Catch:{ all -> 0x0152 }
            X.1Ev r13 = r13.A02     // Catch:{ all -> 0x0152 }
            r23 = r13
            java.lang.String r16 = "SELECT call_log_row_id FROM call_unknown_caller WHERE call_log_row_id <= ? AND call_log_row_id >= ?"
            java.lang.String[] r13 = X.C17880vN.A1Z()     // Catch:{ all -> 0x0152 }
            X.C17890vO.A1J(r13, r0)     // Catch:{ all -> 0x0152 }
            X.C17890vO.A1K(r13, r2)     // Catch:{ all -> 0x0152 }
            java.lang.String r2 = "CallUnknownCallerStore.getUnknownCalls"
            r1 = r23
            r0 = r16
            android.database.Cursor r2 = r1.A0A(r0, r2, r13)     // Catch:{ all -> 0x0152 }
            java.lang.String r0 = "call_log_row_id"
            int r1 = r2.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x014b }
        L_0x00e1:
            boolean r0 = r2.moveToNext()     // Catch:{ all -> 0x014b }
            if (r0 == 0) goto L_0x00eb
            X.C17900vP.A0K(r2, r12, r1)     // Catch:{ all -> 0x014b }
            goto L_0x00e1
        L_0x00eb:
            r2.close()     // Catch:{ all -> 0x0152 }
            r17.close()
            java.util.Iterator r13 = r18.iterator()
        L_0x00f5:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto L_0x0137
            java.lang.Object r2 = r13.next()
            X.9Bw r2 = (X.C178119Bw) r2
        L_0x0101:
            long r0 = r2.A01
            long r16 = r19 - r21
            int r3 = (r0 > r16 ? 1 : (r0 == r16 ? 0 : -1))
            if (r3 >= 0) goto L_0x0118
            X.9eV r0 = new X.9eV
            r0.<init>(r11, r6, r5, r4)
            r14[r7] = r0
            int r7 = r7 + 1
            r0 = 5
            if (r7 >= r0) goto L_0x0167
            r21 = r10[r7]
            goto L_0x0101
        L_0x0118:
            X.4cT r0 = r2.A04
            boolean r0 = r0.A03
            if (r0 != 0) goto L_0x00f5
            int r6 = r6 + 1
            long r0 = r2.A00
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            boolean r0 = r12.contains(r0)
            if (r0 == 0) goto L_0x00f5
            int r5 = r5 + 1
            boolean r0 = r2.A0V()
            if (r0 != 0) goto L_0x00f5
            int r4 = r4 + 1
            goto L_0x00f5
        L_0x0137:
            r0 = 10
            if (r9 < r0) goto L_0x004d
            r6 = -1
            r5 = -1
            r4 = -1
        L_0x013e:
            X.9eV r0 = new X.9eV
            r0.<init>(r11, r6, r5, r4)
            r14[r7] = r0
            int r7 = r7 + 1
            r0 = 5
            if (r7 >= r0) goto L_0x0167
            goto L_0x013e
        L_0x014b:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x014d }
        L_0x014d:
            r0 = move-exception
            X.CDX.A00(r2, r1)     // Catch:{ all -> 0x0152 }
            throw r0     // Catch:{ all -> 0x0152 }
        L_0x0152:
            r2 = move-exception
            throw r2     // Catch:{ all -> 0x0154 }
        L_0x0154:
            r1 = move-exception
            r0 = r17
            X.CDX.A00(r0, r2)
            throw r1
        L_0x015b:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            r0.<init>()
            throw r0
        L_0x0161:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            r0.<init>()
            throw r0
        L_0x0167:
            java.util.List r3 = X.C200410p.A0P(r14)
            X.8s4 r2 = new X.8s4
            r2.<init>()
            r1 = 0
            java.lang.Long r0 = A02(r3, r1)
            r2.A0B = r0
            java.lang.Long r0 = A00(r3, r1)
            r2.A06 = r0
            java.lang.Long r0 = A01(r3, r1)
            r2.A01 = r0
            r1 = 1
            java.lang.Long r0 = A02(r3, r1)
            r2.A0D = r0
            java.lang.Long r0 = A00(r3, r1)
            r2.A08 = r0
            java.lang.Long r0 = A01(r3, r1)
            r2.A03 = r0
            r1 = 2
            java.lang.Long r0 = A02(r3, r1)
            r2.A0E = r0
            java.lang.Long r0 = A00(r3, r1)
            r2.A09 = r0
            java.lang.Long r0 = A01(r3, r1)
            r2.A04 = r0
            r1 = 3
            java.lang.Long r0 = A02(r3, r1)
            r2.A0A = r0
            java.lang.Long r0 = A00(r3, r1)
            r2.A05 = r0
            java.lang.Long r0 = A01(r3, r1)
            r2.A00 = r0
            r1 = 4
            java.lang.Long r0 = A02(r3, r1)
            r2.A0C = r0
            java.lang.Long r0 = A00(r3, r1)
            r2.A07 = r0
            java.lang.Long r0 = A01(r3, r1)
            r2.A02 = r0
            X.18K r0 = r11.A04
            r0.CC7(r2)
        L_0x01d4:
            r0 = r24
            X.1Ma r7 = r0.A00
            java.util.ArrayList r6 = X.AnonymousClass000.A13()
            java.util.Set r8 = r7.A0B
            monitor-enter(r8)
            X.C24881Ma.A00(r7)     // Catch:{ all -> 0x0275 }
            java.util.Iterator r5 = X.AnonymousClass8BV.A0y(r8)     // Catch:{ all -> 0x0275 }
            r4 = 0
            r3 = 0
        L_0x01e8:
            boolean r0 = r5.hasNext()     // Catch:{ all -> 0x0275 }
            if (r0 == 0) goto L_0x0214
            java.lang.String r2 = X.C17880vN.A0v(r5)     // Catch:{ all -> 0x0275 }
            java.util.Set r0 = r7.A0A     // Catch:{ all -> 0x0275 }
            boolean r0 = r0.contains(r2)     // Catch:{ all -> 0x0275 }
            if (r0 != 0) goto L_0x01e8
            X.1yz r0 = X.AnonymousClass1EC.A01     // Catch:{ all -> 0x0275 }
            X.1EC r1 = r0.A02(r2)     // Catch:{ all -> 0x0275 }
            if (r1 == 0) goto L_0x020c
            boolean r0 = r7.A03(r1)     // Catch:{ all -> 0x0275 }
            if (r0 == 0) goto L_0x020c
            r6.add(r1)     // Catch:{ all -> 0x0275 }
            goto L_0x01e8
        L_0x020c:
            boolean r0 = r8.remove(r2)     // Catch:{ all -> 0x0275 }
            if (r0 == 0) goto L_0x01e8
            r3 = 1
            goto L_0x01e8
        L_0x0214:
            if (r3 == 0) goto L_0x0219
            X.C24881Ma.A01(r7)     // Catch:{ all -> 0x0275 }
        L_0x0219:
            monitor-exit(r8)
            int r1 = r6.size()
            r0 = 32
            if (r1 <= r0) goto L_0x0229
            java.util.Collections.shuffle(r6)
            java.util.List r6 = r6.subList(r4, r0)
        L_0x0229:
            java.util.Iterator r8 = r6.iterator()
        L_0x022d:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x0274
            java.lang.Object r6 = r8.next()
            X.1EC r6 = (X.AnonymousClass1EC) r6
            X.00H r0 = r7.A08
            java.lang.Object r0 = r0.get()
            X.2mo r0 = (X.C59742mo) r0
            int r0 = r0.A00(r6)
            boolean r5 = X.AnonymousClass000.A1O(r0)
            X.0ve r1 = r7.A05
            r0 = 7053(0x1b8d, float:9.883E-42)
            boolean r0 = X.C18020vd.A05(r15, r1, r0)
            r4 = 3
            if (r0 == 0) goto L_0x026c
            if (r5 != 0) goto L_0x026c
            X.12M r3 = r7.A06
            java.lang.String r2 = "ack_group_mismatch"
            X.1MZ r0 = r7.A04
            java.lang.String r1 = r0.A07(r6, r5)
            X.C18070vi.A0X(r1)
            X.2sm r0 = new X.2sm
            r0.<init>(r2, r4, r1)
            r3.A0C(r0, r6)
            goto L_0x022d
        L_0x026c:
            X.12M r1 = r7.A06
            java.lang.String r0 = "ack_group_mismatch"
            r1.A0H(r6, r0, r4)
            goto L_0x022d
        L_0x0274:
            return
        L_0x0275:
            r1 = move-exception
            monitor-exit(r8)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20579AQp.Bqf():void");
    }

    public C20579AQp(C24881Ma r1, AnonymousClass00H r2) {
        C18070vi.A0j(r1, r2);
        this.A00 = r1;
        this.A01 = r2;
    }

    public static Long A00(List list, int i) {
        return Long.valueOf((long) ((C186629eV) list.get(i)).A01);
    }

    public static Long A01(List list, int i) {
        return Long.valueOf((long) ((C186629eV) list.get(i)).A00);
    }

    public static Long A02(List list, int i) {
        return Long.valueOf((long) ((C186629eV) list.get(i)).A02);
    }
}
