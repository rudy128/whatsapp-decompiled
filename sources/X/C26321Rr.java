package X;

import android.database.Cursor;

/* renamed from: X.1Rr  reason: invalid class name and case insensitive filesystem */
public final class C26321Rr {
    public final C25551Oq A00;

    public C26321Rr(C25551Oq r2) {
        C18070vi.A0d(r2, 1);
        this.A00 = r2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0055, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0056, code lost:
        X.CDX.A00(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0059, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A03(java.util.Collection r10, long r11) {
        /*
            r9 = this;
            r8 = 1
            boolean r0 = r10.isEmpty()
            if (r0 != 0) goto L_0x005a
            java.util.Set r1 = X.C29431cG.A12(r10)
            X.1Oq r0 = r9.A00
            X.1au r4 = r0.A06()
            java.util.Iterator r7 = r1.iterator()     // Catch:{ all -> 0x0053 }
        L_0x0015:
            boolean r0 = r7.hasNext()     // Catch:{ all -> 0x0053 }
            if (r0 == 0) goto L_0x004f
            java.lang.Object r6 = r7.next()     // Catch:{ all -> 0x0053 }
            X.A2n r6 = (X.C19999A2n) r6     // Catch:{ all -> 0x0053 }
            r0 = r4
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x0053 }
            X.1Ev r5 = r0.A02     // Catch:{ all -> 0x0053 }
            java.lang.String r3 = "UPDATE crypto_info SET stale_timestamp = ?  WHERE device_id = ?  AND epoch = ? "
            r0 = 3
            java.lang.String[] r2 = new java.lang.String[r0]     // Catch:{ all -> 0x0053 }
            java.lang.String r1 = java.lang.String.valueOf(r11)     // Catch:{ all -> 0x0053 }
            r0 = 0
            r2[r0] = r1     // Catch:{ all -> 0x0053 }
            int r0 = r6.A00()     // Catch:{ all -> 0x0053 }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x0053 }
            r2[r8] = r0     // Catch:{ all -> 0x0053 }
            byte[] r0 = r6.A00     // Catch:{ all -> 0x0053 }
            r1 = 2
            int r0 = X.A8G.A01(r0, r1)     // Catch:{ all -> 0x0053 }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x0053 }
            r2[r1] = r0     // Catch:{ all -> 0x0053 }
            java.lang.String r0 = "SyncdCryptoInfoTable.UPDATE_STALE_TIMESTAMP_BY_KEY_ID"
            r5.A0F(r3, r0, r2)     // Catch:{ all -> 0x0053 }
            goto L_0x0015
        L_0x004f:
            r4.close()
            return
        L_0x0053:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0055 }
        L_0x0055:
            r0 = move-exception
            X.CDX.A00(r4, r1)
            throw r0
        L_0x005a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26321Rr.A03(java.util.Collection, long):void");
    }

    public static final C59062lh A00(Cursor cursor) {
        try {
            byte[] blob = cursor.getBlob(cursor.getColumnIndexOrThrow("fingerprint"));
            C18070vi.A0X(blob);
            C165148af r0 = (C165148af) C23577Bm6.A07(C165148af.DEFAULT_INSTANCE, blob);
            C18070vi.A0b(r0);
            C195959uE A002 = AnonymousClass9QS.A00(r0);
            if (A002 != null) {
                C19999A2n a2n = new C19999A2n((int) cursor.getLong(cursor.getColumnIndexOrThrow("device_id")), (int) cursor.getLong(cursor.getColumnIndexOrThrow("epoch")));
                byte[] blob2 = cursor.getBlob(cursor.getColumnIndexOrThrow("key_data"));
                C18070vi.A0X(blob2);
                return new C59062lh(new C59372mC(A002, blob2, cursor.getLong(cursor.getColumnIndexOrThrow("timestamp"))), a2n);
            }
            throw new IllegalStateException("Required value was null.");
        } catch (AnonymousClass1PN e) {
            throw new IllegalStateException("SyncdCryptoStore/createSyncdKey", e);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0036, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        X.CDX.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x003a, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x003d, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x003e, code lost:
        X.CDX.A00(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0041, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int A01() {
        /*
            r5 = this;
            X.1Oq r0 = r5.A00
            X.1at r4 = r0.get()
            r0 = r4
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x003b }
            X.1Ev r3 = r0.A02     // Catch:{ all -> 0x003b }
            java.lang.String r2 = "SELECT MAX ( epoch ) as max_epoch FROM crypto_info"
            java.lang.String r1 = "SyncdCryptoInfoTable.SELECT_MAX_EPOCH"
            r0 = 0
            android.database.Cursor r3 = r3.A0A(r2, r1, r0)     // Catch:{ all -> 0x003b }
            boolean r0 = r3.moveToFirst()     // Catch:{ all -> 0x0034 }
            if (r0 == 0) goto L_0x002c
            java.lang.String r0 = "max_epoch"
            int r0 = r3.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0034 }
            long r1 = r3.getLong(r0)     // Catch:{ all -> 0x0034 }
            int r0 = (int) r1     // Catch:{ all -> 0x0034 }
            r3.close()     // Catch:{ all -> 0x003b }
            r4.close()
            return r0
        L_0x002c:
            r3.close()     // Catch:{ all -> 0x003b }
            r4.close()
            r0 = 0
            return r0
        L_0x0034:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0036 }
        L_0x0036:
            r0 = move-exception
            X.CDX.A00(r3, r1)     // Catch:{ all -> 0x003b }
            throw r0     // Catch:{ all -> 0x003b }
        L_0x003b:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x003d }
        L_0x003d:
            r0 = move-exception
            X.CDX.A00(r4, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26321Rr.A01():int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x002e, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        X.CDX.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0032, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0035, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0036, code lost:
        X.CDX.A00(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0039, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C59062lh A02() {
        /*
            r5 = this;
            X.1Oq r0 = r5.A00
            X.1at r4 = r0.get()
            r0 = r4
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x0033 }
            X.1Ev r3 = r0.A02     // Catch:{ all -> 0x0033 }
            java.lang.String r2 = "SELECT device_id, epoch, key_data, timestamp, fingerprint FROM crypto_info ORDER BY epoch DESC, device_id ASC LIMIT 1"
            java.lang.String r0 = "SyncdCryptoInfoTable.SELECT_LATEST_KEY"
            r1 = 0
            android.database.Cursor r2 = r3.A0A(r2, r0, r1)     // Catch:{ all -> 0x0033 }
            boolean r0 = r2.moveToFirst()     // Catch:{ all -> 0x002c }
            if (r0 == 0) goto L_0x0025
            X.2lh r0 = A00(r2)     // Catch:{ all -> 0x002c }
            r2.close()     // Catch:{ all -> 0x0033 }
            r4.close()
            return r0
        L_0x0025:
            r2.close()     // Catch:{ all -> 0x0033 }
            r4.close()
            return r1
        L_0x002c:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x002e }
        L_0x002e:
            r0 = move-exception
            X.CDX.A00(r2, r1)     // Catch:{ all -> 0x0033 }
            throw r0     // Catch:{ all -> 0x0033 }
        L_0x0033:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0035 }
        L_0x0035:
            r0 = move-exception
            X.CDX.A00(r4, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26321Rr.A02():X.2lh");
    }
}
