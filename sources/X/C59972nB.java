package X;

/* renamed from: X.2nB  reason: invalid class name and case insensitive filesystem */
public final class C59972nB {
    public final AnonymousClass1Cd A00;

    public C59972nB(AnonymousClass1Cd r2) {
        C18070vi.A0d(r2, 1);
        this.A00 = r2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0035, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        X.CDX.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0039, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x003c, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x003d, code lost:
        X.CDX.A00(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0040, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long A00(long r6) {
        /*
            r5 = this;
            X.1Cd r0 = r5.A00
            X.1at r4 = r0.get()
            r0 = r4
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x003a }
            X.1Ev r3 = r0.A02     // Catch:{ all -> 0x003a }
            java.lang.String r2 = "SELECT pn_requested_ts FROM lid_chat_state WHERE jid_row_id = ?"
            java.lang.String[] r1 = X.C17900vP.A0t(r6)     // Catch:{ all -> 0x003a }
            java.lang.String r0 = "LidChatStateStore/GET_PN_REQUESTED_TS"
            android.database.Cursor r2 = X.C18070vi.A04(r3, r2, r0, r1)     // Catch:{ all -> 0x003a }
            java.lang.String r0 = "pn_requested_ts"
            int r1 = r2.getColumnIndex(r0)     // Catch:{ all -> 0x0033 }
            if (r1 < 0) goto L_0x002a
            boolean r0 = r2.moveToFirst()     // Catch:{ all -> 0x0033 }
            if (r0 == 0) goto L_0x002a
            long r0 = r2.getLong(r1)     // Catch:{ all -> 0x0033 }
            goto L_0x002c
        L_0x002a:
            r0 = 0
        L_0x002c:
            r2.close()     // Catch:{ all -> 0x003a }
            r4.close()
            return r0
        L_0x0033:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0035 }
        L_0x0035:
            r0 = move-exception
            X.CDX.A00(r2, r1)     // Catch:{ all -> 0x003a }
            throw r0     // Catch:{ all -> 0x003a }
        L_0x003a:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x003c }
        L_0x003c:
            r0 = move-exception
            X.CDX.A00(r4, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C59972nB.A00(long):long");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x003e, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
        X.CDX.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0042, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0045, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0046, code lost:
        X.CDX.A00(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0049, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Boolean A01(long r6) {
        /*
            r5 = this;
            X.1Cd r0 = r5.A00
            X.1at r4 = r0.get()
            r0 = r4
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x0043 }
            X.1Ev r3 = r0.A02     // Catch:{ all -> 0x0043 }
            java.lang.String r2 = "SELECT is_pn_shared FROM lid_chat_state WHERE jid_row_id = ?"
            java.lang.String[] r1 = X.C17900vP.A0t(r6)     // Catch:{ all -> 0x0043 }
            java.lang.String r0 = "LidChatStateStore/GET_PN_SHARED_BY_JID"
            android.database.Cursor r3 = X.C18070vi.A04(r3, r2, r0, r1)     // Catch:{ all -> 0x0043 }
            java.lang.String r0 = "is_pn_shared"
            int r1 = r3.getColumnIndex(r0)     // Catch:{ all -> 0x003c }
            r2 = 0
            if (r1 < 0) goto L_0x0035
            boolean r0 = r3.moveToFirst()     // Catch:{ all -> 0x003c }
            if (r0 == 0) goto L_0x0035
            int r1 = r3.getInt(r1)     // Catch:{ all -> 0x003c }
            r0 = 0
            if (r1 == 0) goto L_0x0031
            r0 = 1
            if (r1 == r0) goto L_0x0031
            goto L_0x0035
        L_0x0031:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x003c }
        L_0x0035:
            r3.close()     // Catch:{ all -> 0x0043 }
            r4.close()
            return r2
        L_0x003c:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x003e }
        L_0x003e:
            r0 = move-exception
            X.CDX.A00(r3, r1)     // Catch:{ all -> 0x0043 }
            throw r0     // Catch:{ all -> 0x0043 }
        L_0x0043:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0045 }
        L_0x0045:
            r0 = move-exception
            X.CDX.A00(r4, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C59972nB.A01(long):java.lang.Boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0037, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        X.CDX.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x003b, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x003e, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x003f, code lost:
        X.CDX.A00(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0042, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A02(long r6) {
        /*
            r5 = this;
            X.1Cd r0 = r5.A00
            X.1at r4 = r0.get()
            r0 = r4
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x003c }
            X.1Ev r3 = r0.A02     // Catch:{ all -> 0x003c }
            java.lang.String r2 = "SELECT pnh_duplicate_lid_thread FROM lid_chat_state WHERE jid_row_id = ?"
            java.lang.String[] r1 = X.C17900vP.A0t(r6)     // Catch:{ all -> 0x003c }
            java.lang.String r0 = "LidChatStateStore/GET_LID_DUPLICATE_FLAG"
            android.database.Cursor r3 = X.C18070vi.A04(r3, r2, r0, r1)     // Catch:{ all -> 0x003c }
            java.lang.String r0 = "pnh_duplicate_lid_thread"
            int r1 = r3.getColumnIndex(r0)     // Catch:{ all -> 0x0035 }
            r2 = 0
            if (r1 < 0) goto L_0x002e
            boolean r0 = r3.moveToFirst()     // Catch:{ all -> 0x0035 }
            if (r0 == 0) goto L_0x002e
            int r1 = r3.getInt(r1)     // Catch:{ all -> 0x0035 }
            r0 = 1
            if (r1 != r0) goto L_0x002e
            r2 = 1
        L_0x002e:
            r3.close()     // Catch:{ all -> 0x003c }
            r4.close()
            return r2
        L_0x0035:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0037 }
        L_0x0037:
            r0 = move-exception
            X.CDX.A00(r3, r1)     // Catch:{ all -> 0x003c }
            throw r0     // Catch:{ all -> 0x003c }
        L_0x003c:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x003e }
        L_0x003e:
            r0 = move-exception
            X.CDX.A00(r4, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C59972nB.A02(long):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0038, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
        X.CDX.A00(r5, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003c, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x003f, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
        X.CDX.A00(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0043, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A03(long r8, long r10) {
        /*
            r7 = this;
            X.1Cd r0 = r7.A00     // Catch:{ all -> 0x0044 }
            X.1au r4 = r0.A05()     // Catch:{ all -> 0x0044 }
            X.C18070vi.A0b(r4)     // Catch:{ all -> 0x003d }
            X.1xA r5 = r4.BD0()     // Catch:{ all -> 0x003d }
            android.content.ContentValues r6 = X.C17880vN.A08()     // Catch:{ all -> 0x0036 }
            java.lang.String r0 = "jid_row_id"
            X.C17880vN.A19(r6, r0, r8)     // Catch:{ all -> 0x0036 }
            java.lang.String r0 = "pn_requested_ts"
            X.C17880vN.A19(r6, r0, r10)     // Catch:{ all -> 0x0036 }
            java.lang.String r3 = "LidChatStateStore/SET_PN_REQUESTED_TS"
            r0 = r4
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x0036 }
            X.1Ev r2 = r0.A02     // Catch:{ all -> 0x0036 }
            r1 = 5
            java.lang.String r0 = "lid_chat_state"
            r2.A09(r0, r3, r6, r1)     // Catch:{ all -> 0x0036 }
            r5.A00()     // Catch:{ all -> 0x0036 }
            r5.close()     // Catch:{ all -> 0x003d }
            r4.close()     // Catch:{ all -> 0x0044 }
            java.lang.Boolean r2 = X.AnonymousClass000.A0i()     // Catch:{ all -> 0x0044 }
            goto L_0x004a
        L_0x0036:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0038 }
        L_0x0038:
            r0 = move-exception
            X.CDX.A00(r5, r1)     // Catch:{ all -> 0x003d }
            throw r0     // Catch:{ all -> 0x003d }
        L_0x003d:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x003f }
        L_0x003f:
            r0 = move-exception
            X.CDX.A00(r4, r1)     // Catch:{ all -> 0x0044 }
            throw r0     // Catch:{ all -> 0x0044 }
        L_0x0044:
            r0 = move-exception
            X.1IU r2 = new X.1IU
            r2.<init>(r0)
        L_0x004a:
            java.lang.Throwable r1 = X.C30671eK.A00(r2)
            if (r1 == 0) goto L_0x0056
            java.lang.String r0 = "{LidChatStateStore/}failed to set phone requested time"
            com.whatsapp.util.Log.e(r0, r1)
        L_0x0056:
            java.lang.Boolean r1 = X.AnonymousClass000.A0h()
            boolean r0 = r2 instanceof X.AnonymousClass1IU
            if (r0 == 0) goto L_0x005f
            r2 = r1
        L_0x005f:
            boolean r0 = X.AnonymousClass000.A1Y(r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C59972nB.A03(long, long):boolean");
    }
}
