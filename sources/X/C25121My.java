package X;

import android.database.Cursor;

/* renamed from: X.1My  reason: invalid class name and case insensitive filesystem */
public final class C25121My extends C24861Ly {
    public static final C53122c1 A06(Cursor cursor) {
        Long valueOf;
        int columnIndexOrThrow = cursor.getColumnIndexOrThrow("real_issue_timestamp");
        long j = cursor.getLong(cursor.getColumnIndexOrThrow("sent_tc_token_timestamp"));
        if (cursor.isNull(columnIndexOrThrow)) {
            valueOf = Long.valueOf(j);
        } else {
            long j2 = cursor.getLong(columnIndexOrThrow);
            if (j2 == 0) {
                valueOf = null;
            } else {
                valueOf = Long.valueOf(j2);
            }
        }
        return new C53122c1(valueOf, j);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0050, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        X.CDX.A00(r7, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0054, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0057, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0058, code lost:
        X.CDX.A00(r5, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x005b, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.HashMap A0I() {
        /*
            r8 = this;
            X.1Lt r0 = r8.A00
            X.1at r5 = r0.get()
            r0 = r5
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x0055 }
            X.1Ev r3 = r0.A02     // Catch:{ all -> 0x0055 }
            java.lang.String r2 = "SELECT jid, incoming_tc_token, incoming_tc_token_timestamp FROM wa_trusted_contacts"
            r0 = 0
            java.lang.String[] r1 = new java.lang.String[r0]     // Catch:{ all -> 0x0055 }
            java.lang.String r0 = "GET_ALL_RECEIVED_TOKENS"
            android.database.Cursor r7 = r3.A0A(r2, r0, r1)     // Catch:{ all -> 0x0055 }
            java.lang.String r0 = "jid"
            int r6 = r7.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x004e }
            java.lang.String r0 = "incoming_tc_token"
            int r4 = r7.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x004e }
            java.lang.String r0 = "incoming_tc_token_timestamp"
            int r3 = r7.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x004e }
            java.util.HashMap r2 = new java.util.HashMap     // Catch:{ all -> 0x004e }
            r2.<init>()     // Catch:{ all -> 0x004e }
        L_0x002d:
            boolean r0 = r7.moveToNext()     // Catch:{ all -> 0x004e }
            if (r0 == 0) goto L_0x0047
            X.1Dw r1 = com.whatsapp.jid.UserJid.Companion     // Catch:{ all -> 0x004e }
            java.lang.String r0 = r7.getString(r6)     // Catch:{ all -> 0x004e }
            com.whatsapp.jid.UserJid r1 = r1.A04(r0)     // Catch:{ all -> 0x004e }
            if (r1 == 0) goto L_0x002d
            X.2lX r0 = A04(r7, r4, r3)     // Catch:{ all -> 0x004e }
            r2.put(r1, r0)     // Catch:{ all -> 0x004e }
            goto L_0x002d
        L_0x0047:
            r7.close()     // Catch:{ all -> 0x0055 }
            r5.close()
            return r2
        L_0x004e:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0050 }
        L_0x0050:
            r0 = move-exception
            X.CDX.A00(r7, r1)     // Catch:{ all -> 0x0055 }
            throw r0     // Catch:{ all -> 0x0055 }
        L_0x0055:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0057 }
        L_0x0057:
            r0 = move-exception
            X.CDX.A00(r5, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C25121My.A0I():java.util.HashMap");
    }

    public static final C58962lX A04(Cursor cursor, int i, int i2) {
        byte[] blob = cursor.getBlob(i);
        long j = cursor.getLong(i2);
        if (blob != null) {
            return new C58962lX(blob, j);
        }
        throw new IllegalStateException("Required value was null.");
    }
}
