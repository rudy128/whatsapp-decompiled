package X;

/* renamed from: X.3CE  reason: invalid class name */
public class AnonymousClass3CE implements Runnable {
    public final int A00;
    public final long A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;

    public AnonymousClass3CE(Object obj, Object obj2, Object obj3, Object obj4, int i, long j) {
        this.A00 = i;
        this.A01 = j;
        this.A03 = obj;
        this.A05 = obj2;
        this.A04 = obj3;
        this.A02 = obj4;
    }

    /* JADX WARNING: Removed duplicated region for block: B:121:0x0227 A[SYNTHETIC, Splitter:B:121:0x0227] */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x0239 A[SYNTHETIC, Splitter:B:126:0x0239] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r17 = this;
            r6 = r17
            int r0 = r6.A00
            switch(r0) {
                case 0: goto L_0x001f;
                case 1: goto L_0x0071;
                case 2: goto L_0x0143;
                case 3: goto L_0x00e6;
                case 4: goto L_0x01e3;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r5 = r6.A02
            X.1MV r5 = (X.AnonymousClass1MV) r5
            java.lang.Object r7 = r6.A03
            X.1E9 r7 = (X.AnonymousClass1E9) r7
            java.lang.Object r8 = r6.A04
            com.whatsapp.jid.UserJid r8 = (com.whatsapp.jid.UserJid) r8
            long r9 = r6.A01
            java.lang.Object r0 = r6.A05
            X.10f r6 = X.C199410f.of(r0)
            r5.A02(r6, r7, r8, r9)
        L_0x001e:
            return
        L_0x001f:
            long r10 = r6.A01
            java.lang.Object r7 = r6.A03
            X.E4Q r7 = (X.E4Q) r7
            X.BFG r7 = (X.BFG) r7
            long r1 = r7.A00
            int r0 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x001e
            java.lang.Object r5 = r6.A05
            X.CuY r5 = (X.C26202CuY) r5
            X.Ch8 r4 = r5.A01
            java.lang.Object r0 = r6.A04
            X.DBr r0 = (X.C26738DBr) r0
            X.E13 r2 = r0.A02
            boolean r1 = r2 instanceof X.C26745DBy
            r0 = 0
            if (r1 == 0) goto L_0x0044
            X.DBy r2 = (X.C26745DBy) r2
            if (r2 == 0) goto L_0x0044
            android.net.Uri r0 = r2.A01
        L_0x0044:
            X.BRN r3 = new X.BRN
            r3.<init>()
            X.74k r2 = r4.A00
            java.lang.String r1 = java.lang.String.valueOf(r0)
            r0 = 0
            X.C18070vi.A0d(r1, r0)
            X.4VT r0 = X.AnonymousClass74k.A00(r2)
            r0.A04(r3, r1)
            X.1nB r9 = r5.A04
            java.util.concurrent.Executor r8 = r5.A03
            X.DBT r6 = new X.DBT
            r6.<init>(r7, r8, r9, r10)
            r3.A04(r6, r8)
            X.BQl r2 = r7.A0B
            X.EEE[] r1 = X.BFG.A0K
            r0 = 0
            r0 = r1[r0]
            r2.CLJ(r3, r0)
            return
        L_0x0071:
            r5 = 0
            java.lang.Object r7 = r6.A02     // Catch:{ IOException -> 0x0098, all -> 0x021c }
            java.io.InputStream r7 = (java.io.InputStream) r7     // Catch:{ IOException -> 0x0098, all -> 0x021c }
            java.lang.Object r4 = r6.A03     // Catch:{ IOException -> 0x0098, all -> 0x021c }
            java.io.OutputStream r4 = (java.io.OutputStream) r4     // Catch:{ IOException -> 0x0098, all -> 0x021c }
            r3 = 65536(0x10000, float:9.18355E-41)
            byte[] r2 = new byte[r3]     // Catch:{ IOException -> 0x0098, all -> 0x021c }
        L_0x007e:
            int r1 = r7.read(r2, r5, r3)     // Catch:{ all -> 0x0096 }
            r0 = -1
            if (r1 == r0) goto L_0x0089
            r4.write(r2, r5, r1)     // Catch:{ all -> 0x0096 }
            goto L_0x007e
        L_0x0089:
            r7.close()     // Catch:{ IOException -> 0x008c }
        L_0x008c:
            java.lang.Object r2 = r6.A04
            java.io.OutputStream r2 = (java.io.OutputStream) r2
            long r0 = r6.A01
            X.C25583CiN.A00(r2, r0, r5)
            goto L_0x00db
        L_0x0096:
            r0 = move-exception
            throw r0     // Catch:{ IOException -> 0x0098, all -> 0x021c }
        L_0x0098:
            r9 = move-exception
            r8 = 1
            java.lang.Object r0 = r6.A05     // Catch:{ all -> 0x021f }
            X.CiN r0 = (X.C25583CiN) r0     // Catch:{ all -> 0x021f }
            boolean r0 = r0.A04     // Catch:{ all -> 0x021f }
            java.lang.String r7 = "NearbyConnections"
            if (r0 != 0) goto L_0x00b8
            java.lang.String r4 = "Exception copying stream for Payload %d"
            java.lang.Object[] r3 = new java.lang.Object[r8]     // Catch:{ all -> 0x021f }
            long r1 = r6.A01     // Catch:{ all -> 0x021f }
            java.lang.Long r0 = java.lang.Long.valueOf(r1)     // Catch:{ all -> 0x021f }
            r3[r5] = r0     // Catch:{ all -> 0x021f }
            java.lang.String r0 = java.lang.String.format(r4, r3)     // Catch:{ all -> 0x021f }
            android.util.Log.w(r7, r0, r9)     // Catch:{ all -> 0x021f }
            goto L_0x00cb
        L_0x00b8:
            java.lang.String r4 = "Terminating copying stream for Payload %d due to shutdown of OutgoingPayloadStreamer."
            java.lang.Object[] r3 = new java.lang.Object[r8]     // Catch:{ all -> 0x021f }
            long r1 = r6.A01     // Catch:{ all -> 0x021f }
            java.lang.Long r0 = java.lang.Long.valueOf(r1)     // Catch:{ all -> 0x021f }
            r3[r5] = r0     // Catch:{ all -> 0x021f }
            java.lang.String r0 = java.lang.String.format(r4, r3)     // Catch:{ all -> 0x021f }
            android.util.Log.d(r7, r0)     // Catch:{ all -> 0x021f }
        L_0x00cb:
            java.lang.Object r0 = r6.A02
            java.io.InputStream r0 = (java.io.InputStream) r0
            if (r0 == 0) goto L_0x00d4
            r0.close()     // Catch:{ IOException -> 0x00d4 }
        L_0x00d4:
            java.lang.Object r0 = r6.A04
            java.io.OutputStream r0 = (java.io.OutputStream) r0
            X.C25583CiN.A00(r0, r1, r8)
        L_0x00db:
            java.lang.Object r0 = r6.A03
            java.io.OutputStream r0 = (java.io.OutputStream) r0
            if (r0 == 0) goto L_0x001e
            r0.close()     // Catch:{ IOException -> 0x001e }
            goto L_0x021e
        L_0x00e6:
            java.lang.Object r2 = r6.A02
            X.1hb r2 = (X.C32691hb) r2
            java.lang.Object r5 = r6.A03
            X.1BI r5 = (X.AnonymousClass1BI) r5
            java.lang.Object r1 = r6.A04
            java.lang.Object r7 = r6.A05
            X.1ci r7 = (X.C29691ci) r7
            long r3 = r6.A01
            X.1RW r0 = r2.A04
            X.1RX r0 = r0.A00()
            boolean r0 = r0.A01(r5)
            if (r0 == 0) goto L_0x0114
            X.00H r0 = r2.A0Z
            java.lang.Object r3 = r0.get()
            X.1Q1 r3 = (X.AnonymousClass1Q1) r3
            java.util.List r2 = java.util.Collections.singletonList(r1)
            r1 = 1
            r0 = 0
            r3.A02(r5, r2, r1, r0)
            return
        L_0x0114:
            X.1LW r6 = r2.A07
            X.1CJ r0 = r6.A00
            X.1ci r8 = r0.A0A(r5)
            X.C17960vV.A07(r8)
            monitor-enter(r8)
            r1 = -1
            r5 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x013c
            long r1 = r7.A0O     // Catch:{ all -> 0x023d }
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0130
            r7.A0O = r3     // Catch:{ all -> 0x023d }
            r5 = 1
        L_0x0130:
            long r1 = r7.A0V     // Catch:{ all -> 0x023d }
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x013c
            r0 = 1
            long r3 = r3 - r0
            r7.A0V = r3     // Catch:{ all -> 0x023d }
            r5 = 1
        L_0x013c:
            monitor-exit(r8)     // Catch:{ all -> 0x023d }
            if (r5 == 0) goto L_0x001e
            r6.A06(r7)
            return
        L_0x0143:
            java.lang.Object r0 = r6.A04
            X.11P r0 = (X.AnonymousClass11P) r0
            long r7 = X.AnonymousClass11P.A01(r0)
            java.lang.Object r3 = r6.A03
            X.1SI r3 = (X.AnonymousClass1SI) r3
            r2 = 0
            r1 = 0
            r0 = 2
            long r15 = r3.A00(r2, r0, r1)
            long r4 = r6.A01
            r0 = 210(0xd2, double:1.04E-321)
            r13 = 210(0xd2, double:1.04E-321)
            long r2 = r4 / r0
            r0 = 1
            long r2 = r2 + r0
            java.lang.Object r12 = r6.A02
            X.122 r12 = (X.AnonymousClass122) r12
            r9 = 86400000(0x5265c00, double:4.2687272E-316)
            long r9 = r9 * r15
            long r0 = r7 - r9
            java.lang.String r10 = "CoreMessageStore/getNumMessagesSince"
            X.1Ez r9 = new X.1Ez
            r9.<init>((java.lang.String) r10)
            r10 = 3
            java.lang.String[] r10 = new java.lang.String[r10]
            r11 = 0
            X.C17880vN.A1V(r10, r11, r0)
            r0 = 1
            X.C17880vN.A1V(r10, r0, r7)
            r0 = 2
            X.C17880vN.A1V(r10, r0, r2)
            X.1Cd r0 = r12.A0V     // Catch:{ all -> 0x01de }
            X.1at r3 = r0.get()     // Catch:{ all -> 0x01de }
            r0 = r3
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x01d4 }
            X.1Ev r2 = r0.A02     // Catch:{ all -> 0x01d4 }
            java.lang.String r1 = "SELECT COUNT(*) as count FROM (SELECT _id FROM available_message_view WHERE timestamp >= ?  AND (expire_timestamp IS NULL OR expire_timestamp >= ? OR keep_in_chat = 1)  LIMIT ?)"
            java.lang.String r0 = "SELECT_NUM_MESSAGES_SINCE_TIMESTAMP_SQL"
            android.database.Cursor r2 = r2.A0A(r1, r0, r10)     // Catch:{ all -> 0x01d4 }
            boolean r0 = r2.moveToFirst()     // Catch:{ all -> 0x01c8 }
            if (r0 != 0) goto L_0x01a6
            r2.close()     // Catch:{ all -> 0x01d4 }
            r3.close()     // Catch:{ all -> 0x01de }
            r9.A02()
            r0 = -1
            goto L_0x01b5
        L_0x01a6:
            java.lang.String r0 = "count"
            long r0 = X.C17890vO.A06(r2, r0)     // Catch:{ all -> 0x01c8 }
            r2.close()     // Catch:{ all -> 0x01d4 }
            r3.close()     // Catch:{ all -> 0x01de }
            r9.A02()
        L_0x01b5:
            long r0 = r0 * r13
            long r2 = java.lang.Math.min(r0, r4)
            java.lang.Object r0 = r6.A05
            X.0z4 r0 = (X.C19830z4) r0
            android.content.SharedPreferences$Editor r1 = X.C19830z4.A00(r0)
            java.lang.String r0 = "md_initial_sync_estimate_bytes"
            X.C17880vN.A1D(r1, r0, r2)
            return
        L_0x01c8:
            r1 = move-exception
            if (r2 == 0) goto L_0x01d3
            r2.close()     // Catch:{ all -> 0x01cf }
            goto L_0x01d3
        L_0x01cf:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x01d4 }
        L_0x01d3:
            throw r1     // Catch:{ all -> 0x01d4 }
        L_0x01d4:
            r1 = move-exception
            r3.close()     // Catch:{ all -> 0x01d9 }
            goto L_0x01dd
        L_0x01d9:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x01de }
        L_0x01dd:
            throw r1     // Catch:{ all -> 0x01de }
        L_0x01de:
            r0 = move-exception
            r9.A02()
            throw r0
        L_0x01e3:
            java.lang.Object r8 = r6.A02
            X.1Ux r8 = (X.C27151Ux) r8
            java.lang.Object r2 = r6.A03
            X.1EC r2 = (X.AnonymousClass1EC) r2
            java.lang.Object r1 = r6.A04
            com.whatsapp.jid.UserJid r1 = (com.whatsapp.jid.UserJid) r1
            long r3 = r6.A01
            java.lang.Object r7 = r6.A05
            X.2rV r7 = (X.C62502rV) r7
            X.1Qh r0 = r8.A01
            long r5 = r0.A01(r2, r1)
            r1 = -1
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0217
            X.00H r0 = r8.A03
            X.206 r2 = X.AnonymousClass1W2.A02(r0, r5)
            X.23S r2 = (X.AnonymousClass23S) r2
            if (r2 == 0) goto L_0x0217
            r0 = 1
            r2.A07 = r0
            r2.A01 = r3
            X.122 r1 = r8.A00
            r0 = 21
            r1.CQx(r2, r0)
        L_0x0217:
            r0 = 0
            X.C62502rV.A00(r0, r7, r0)
            return
        L_0x021c:
            r3 = move-exception
            goto L_0x0221
        L_0x021e:
            return
        L_0x021f:
            r3 = move-exception
            r5 = 1
        L_0x0221:
            java.lang.Object r0 = r6.A02
            java.io.InputStream r0 = (java.io.InputStream) r0
            if (r0 == 0) goto L_0x022a
            r0.close()     // Catch:{ IOException -> 0x022a }
        L_0x022a:
            java.lang.Object r2 = r6.A04
            java.io.OutputStream r2 = (java.io.OutputStream) r2
            long r0 = r6.A01
            X.C25583CiN.A00(r2, r0, r5)
            java.lang.Object r0 = r6.A03
            java.io.OutputStream r0 = (java.io.OutputStream) r0
            if (r0 == 0) goto L_0x023c
            r0.close()     // Catch:{ IOException -> 0x023c }
        L_0x023c:
            throw r3
        L_0x023d:
            r0 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x023d }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3CE.run():void");
    }
}
