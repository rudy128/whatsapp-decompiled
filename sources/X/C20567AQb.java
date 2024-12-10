package X;

/* renamed from: X.AQb  reason: case insensitive filesystem */
public final class C20567AQb implements AnonymousClass1L0 {
    public final C20105A7j A00;
    public final C218617r A01;

    public /* synthetic */ void Bqg() {
    }

    public /* synthetic */ void Bqi() {
    }

    /* JADX WARNING: Removed duplicated region for block: B:42:0x01ad  */
    /* JADX WARNING: Removed duplicated region for block: B:51:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void Bqh() {
        /*
            r23 = this;
            r4 = r23
            X.17r r3 = r4.A01
            java.io.File r0 = r3.A0C()
            r1 = 3600000(0x36ee80, double:1.7786363E-317)
            X.C64062u9.A0H(r0, r1)
            java.io.File r0 = r3.A0D()
            X.C64062u9.A0H(r0, r1)
            java.io.File r0 = r3.A0B()
            X.C64062u9.A0H(r0, r1)
            java.io.File r0 = r3.A0F()
            X.C64062u9.A0H(r0, r1)
            X.2hC r0 = r3.A08()
            java.io.File r0 = r0.A08
            r1 = 2592000000(0x9a7ec800, double:1.280618154E-314)
            X.C64062u9.A0H(r0, r1)
            X.2hC r0 = r3.A08()
            java.io.File r0 = r0.A09
            X.C64062u9.A0H(r0, r1)
            X.A7j r2 = r4.A00
            X.1CM r0 = r2.A07
            boolean r0 = r0.A04()
            if (r0 == 0) goto L_0x01b8
            X.1L7 r0 = r2.A02
            r18 = r0
            java.io.File r0 = r18.A06()
            if (r0 == 0) goto L_0x01b8
            int r0 = X.C20105A7j.A01(r2)
            r5 = 5
            if (r0 == r5) goto L_0x01b8
            r7 = 1
            r6 = 0
            java.io.File r1 = android.os.Environment.getExternalStorageDirectory()
            java.lang.String r0 = "WhatsApp"
            java.io.File r12 = X.C17880vN.A0e(r1, r0)
            java.io.File r8 = r18.A06()
            X.C17960vV.A07(r8)
            java.util.concurrent.atomic.AtomicBoolean r11 = r2.A08
            boolean r0 = r11.compareAndSet(r6, r7)
            if (r0 == 0) goto L_0x01b8
            boolean r10 = r18.A0C()     // Catch:{ all -> 0x01b3 }
            int r1 = X.C20105A7j.A01(r2)     // Catch:{ all -> 0x01b3 }
            if (r1 == r5) goto L_0x01a7
            X.195 r0 = r2.A00     // Catch:{ all -> 0x01b3 }
            boolean r0 = r0.A00     // Catch:{ all -> 0x01b3 }
            r4 = 0
            if (r0 == 0) goto L_0x0085
            X.C20105A7j.A03(r4, r2, r5)     // Catch:{ all -> 0x01b3 }
            goto L_0x0091
        L_0x0085:
            X.17x r0 = r2.A04     // Catch:{ all -> 0x01b3 }
            boolean r0 = r0.A0G()     // Catch:{ all -> 0x01b3 }
            if (r0 != 0) goto L_0x0094
            r0 = 7
            X.C20105A7j.A03(r4, r2, r0)     // Catch:{ all -> 0x01b3 }
        L_0x0091:
            r0 = 0
            goto L_0x01a8
        L_0x0094:
            boolean r0 = r12.exists()     // Catch:{ all -> 0x01b3 }
            if (r0 != 0) goto L_0x00a9
            if (r1 != 0) goto L_0x00a9
            X.0z4 r0 = r2.A05     // Catch:{ all -> 0x01b3 }
            r0.A1C(r5)     // Catch:{ all -> 0x01b3 }
            X.C20105A7j.A03(r4, r2, r7)     // Catch:{ all -> 0x01b3 }
            r0.A20(r10)     // Catch:{ all -> 0x01b3 }
            goto L_0x01a7
        L_0x00a9:
            java.util.ArrayList r9 = X.AnonymousClass000.A13()     // Catch:{ all -> 0x01b3 }
            r14 = 3
            if (r1 == 0) goto L_0x00bd
            r0 = 9
            if (r1 >= r14) goto L_0x00b6
            r0 = 8
        L_0x00b6:
            X.C20105A7j.A03(r4, r2, r0)     // Catch:{ all -> 0x01b3 }
            r0 = 2
            if (r1 <= r0) goto L_0x00de
            goto L_0x00d4
        L_0x00bd:
            X.0z4 r3 = r2.A05     // Catch:{ all -> 0x01b3 }
            r3.A20(r6)     // Catch:{ all -> 0x01b3 }
            long r0 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x01b3 }
            android.content.SharedPreferences$Editor r15 = X.C19830z4.A00(r3)     // Catch:{ all -> 0x01b3 }
            java.lang.String r13 = "ext_dir_migration_start_time"
            android.content.SharedPreferences$Editor r0 = r15.putLong(r13, r0)     // Catch:{ all -> 0x01b3 }
            r0.commit()     // Catch:{ all -> 0x01b3 }
            goto L_0x00fe
        L_0x00d4:
            java.util.HashSet r0 = X.C17880vN.A12()     // Catch:{ all -> 0x01b3 }
            r0.add(r8)     // Catch:{ all -> 0x01b3 }
            X.C20105A7j.A04(r2, r8, r9, r0)     // Catch:{ all -> 0x01b3 }
        L_0x00de:
            X.0z4 r3 = r2.A05     // Catch:{ all -> 0x01b3 }
            r0 = -1
            android.content.SharedPreferences$Editor r15 = X.C19830z4.A00(r3)     // Catch:{ all -> 0x01b3 }
            java.lang.String r13 = "ext_dir_migration_move_time"
            android.content.SharedPreferences$Editor r0 = r15.putLong(r13, r0)     // Catch:{ all -> 0x01b3 }
            r0.commit()     // Catch:{ all -> 0x01b3 }
            r0 = -1
            android.content.SharedPreferences$Editor r15 = X.C19830z4.A00(r3)     // Catch:{ all -> 0x01b3 }
            java.lang.String r13 = "ext_dir_migration_rescan_time"
            android.content.SharedPreferences$Editor r0 = r15.putLong(r13, r0)     // Catch:{ all -> 0x01b3 }
            r0.commit()     // Catch:{ all -> 0x01b3 }
        L_0x00fe:
            android.content.SharedPreferences r0 = X.C17890vO.A0B(r3)     // Catch:{ all -> 0x01b3 }
            java.lang.String r15 = "external_dir_migration_attempt_n"
            long r0 = X.C17890vO.A04(r0, r15)     // Catch:{ all -> 0x01b3 }
            r16 = 1
            long r0 = r0 + r16
            android.content.SharedPreferences$Editor r13 = X.C19830z4.A00(r3)     // Catch:{ all -> 0x01b3 }
            android.content.SharedPreferences$Editor r0 = r13.putLong(r15, r0)     // Catch:{ all -> 0x01b3 }
            r0.commit()     // Catch:{ all -> 0x01b3 }
            r3.A1C(r7)     // Catch:{ all -> 0x01b3 }
            r0 = r18
            X.00H r0 = r0.A02     // Catch:{ all -> 0x01b3 }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x01b3 }
            java.io.File r0 = (java.io.File) r0     // Catch:{ all -> 0x01b3 }
            boolean r0 = r8.equals(r0)     // Catch:{ all -> 0x01b3 }
            r1 = r0 ^ 1
            java.util.concurrent.atomic.AtomicBoolean r13 = new java.util.concurrent.atomic.AtomicBoolean     // Catch:{ all -> 0x01b3 }
            r13.<init>(r6)     // Catch:{ all -> 0x01b3 }
            long r15 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x01b3 }
            android.util.SparseIntArray r17 = new android.util.SparseIntArray     // Catch:{ all -> 0x01b3 }
            r17.<init>()     // Catch:{ all -> 0x01b3 }
            r22 = r10 ^ 1
            X.9eA r0 = new X.9eA     // Catch:{ all -> 0x01b3 }
            r0.<init>(r2, r9, r13, r1)     // Catch:{ all -> 0x01b3 }
            r20 = r12
            r21 = r8
            r18 = r0
            r19 = r2
            X.C20105A7j.A00(r17, r18, r19, r20, r21, r22)     // Catch:{ all -> 0x01b3 }
            r3.A1C(r14)     // Catch:{ all -> 0x01b3 }
            long r0 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x01b3 }
            long r0 = r0 - r15
            android.content.SharedPreferences$Editor r14 = X.C19830z4.A00(r3)     // Catch:{ all -> 0x01b3 }
            java.lang.String r8 = "ext_dir_migration_move_time"
            android.content.SharedPreferences$Editor r0 = r14.putLong(r8, r0)     // Catch:{ all -> 0x01b3 }
            r0.commit()     // Catch:{ all -> 0x01b3 }
            boolean r0 = r9.isEmpty()     // Catch:{ all -> 0x01b3 }
            if (r0 != 0) goto L_0x0191
            boolean r17 = r13.get()     // Catch:{ all -> 0x01b3 }
            r0 = 4
            r3.A1C(r0)     // Catch:{ all -> 0x01b3 }
            long r14 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x01b3 }
            X.11C r1 = r2.A03     // Catch:{ all -> 0x01b3 }
            android.net.Uri r0 = android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI     // Catch:{ all -> 0x01b3 }
            X.C20105A7j.A02(r0, r1, r12)     // Catch:{ all -> 0x01b3 }
            android.net.Uri r0 = android.provider.MediaStore.Video.Media.EXTERNAL_CONTENT_URI     // Catch:{ all -> 0x01b3 }
            X.C20105A7j.A02(r0, r1, r12)     // Catch:{ all -> 0x01b3 }
            android.net.Uri r0 = android.provider.MediaStore.Audio.Media.EXTERNAL_CONTENT_URI     // Catch:{ all -> 0x01b3 }
            X.C20105A7j.A02(r0, r1, r12)     // Catch:{ all -> 0x01b3 }
            X.Aip r1 = new X.Aip     // Catch:{ all -> 0x01b3 }
            r12 = r1
            r13 = r2
            r16 = r10
            r12.<init>(r13, r14, r16, r17)     // Catch:{ all -> 0x01b3 }
            X.17r r0 = r2.A01     // Catch:{ all -> 0x01b3 }
            r0.A0k(r1, r9)     // Catch:{ all -> 0x01b3 }
            goto L_0x01a7
        L_0x0191:
            r3.A1C(r5)     // Catch:{ all -> 0x01b3 }
            X.C20105A7j.A03(r4, r2, r7)     // Catch:{ all -> 0x01b3 }
            r3.A20(r10)     // Catch:{ all -> 0x01b3 }
            boolean r0 = r13.get()     // Catch:{ all -> 0x01b3 }
            if (r0 == 0) goto L_0x01a7
            X.196 r1 = r2.A06     // Catch:{ all -> 0x01b3 }
            java.lang.String r0 = "ExternalDirMigration"
            r1.A04(r0)     // Catch:{ all -> 0x01b3 }
        L_0x01a7:
            r0 = 1
        L_0x01a8:
            r11.set(r6)
            if (r0 == 0) goto L_0x01b8
            java.lang.String r0 = "MessageIODailyCron/onDailyCronNoMessageStore: storage successfully migrated"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            return
        L_0x01b3:
            r0 = move-exception
            r11.set(r6)
            throw r0
        L_0x01b8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20567AQb.Bqh():void");
    }

    public C20567AQb(C20105A7j a7j, C218617r r2) {
        C18070vi.A0j(r2, a7j);
        this.A01 = r2;
        this.A00 = a7j;
    }
}
