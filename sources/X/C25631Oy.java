package X;

import com.whatsapp.util.Log;
import java.io.IOException;
import java.util.LinkedList;

/* renamed from: X.1Oy  reason: invalid class name and case insensitive filesystem */
public final class C25631Oy {
    public final C25611Ow A00;
    public final AnonymousClass11P A01;
    public final C25571Os A02;
    public final AnonymousClass1MH A03;
    public final C18030ve A04;
    public final AnonymousClass1MK A05;
    public final C25581Ot A06;

    public C25631Oy(C25611Ow r2, AnonymousClass11P r3, C25581Ot r4, C25571Os r5, AnonymousClass1MH r6, C18030ve r7, AnonymousClass1MK r8) {
        C18070vi.A0d(r3, 1);
        C18070vi.A0d(r7, 2);
        C18070vi.A0d(r5, 3);
        C18070vi.A0d(r4, 4);
        C18070vi.A0d(r6, 5);
        C18070vi.A0d(r2, 6);
        C18070vi.A0d(r8, 7);
        this.A01 = r3;
        this.A04 = r7;
        this.A02 = r5;
        this.A06 = r4;
        this.A03 = r6;
        this.A00 = r2;
        this.A05 = r8;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0091, code lost:
        if (((X.C28801av) r7).A02.A04("sender_keys", "group_id = ? AND sender_id = ? AND sender_type = ? AND device_id = ?", "SignalSenderKeyStore/removeSenderKeyLegacy", r9.A00()) > 0) goto L_0x0093;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00ab, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:?, code lost:
        X.CDX.A00(r7, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00af, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00d1, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00d2, code lost:
        X.CDX.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00d5, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A05(X.C59982nC r9, boolean r10) {
        /*
            r8 = this;
            r5 = 0
            if (r10 != 0) goto L_0x000b
            X.2nE r0 = r9.A00
            int r1 = r0.A01
            r0 = 1
            if (r1 != r0) goto L_0x000b
            return r5
        L_0x000b:
            X.1Os r0 = r8.A02
            X.3Ez r3 = X.C25571Os.A01(r0, r9)
            r3.lock()
            java.lang.String r4 = r9.A01     // Catch:{ all -> 0x00cf }
            X.C18070vi.A0X(r4)     // Catch:{ all -> 0x00cf }
            X.1Dv r0 = X.AnonymousClass1BI.A00     // Catch:{ 11T -> 0x00b6 }
            com.whatsapp.jid.Jid r6 = X.C22911Dt.A00(r4)     // Catch:{ 11T -> 0x00b6 }
            boolean r0 = r6 instanceof X.AnonymousClass1E9     // Catch:{ 11T -> 0x00b6 }
            if (r0 == 0) goto L_0x00b0
            X.1E9 r6 = (X.AnonymousClass1E9) r6     // Catch:{ 11T -> 0x00b6 }
            if (r6 == 0) goto L_0x00b0
            java.lang.String r1 = "removeSenderKey"
            X.2nE r0 = r9.A00     // Catch:{ all -> 0x00cf }
            X.C18070vi.A0X(r0)     // Catch:{ all -> 0x00cf }
            X.2nE r0 = A00(r8, r0, r1)     // Catch:{ all -> 0x00cf }
            if (r0 == 0) goto L_0x0056
            X.2nC r2 = new X.2nC     // Catch:{ all -> 0x00cf }
            r2.<init>(r0, r4)     // Catch:{ all -> 0x00cf }
        L_0x0039:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00cf }
            r1.<init>()     // Catch:{ all -> 0x00cf }
            java.lang.String r0 = "SignalSenderKeyStore/removeSenderKey/"
            r1.append(r0)     // Catch:{ all -> 0x00cf }
            r1.append(r9)     // Catch:{ all -> 0x00cf }
            java.lang.String r0 = " & translated = "
            r1.append(r0)     // Catch:{ all -> 0x00cf }
            r1.append(r2)     // Catch:{ all -> 0x00cf }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x00cf }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x00cf }
            goto L_0x0058
        L_0x0056:
            r2 = 0
            goto L_0x0039
        L_0x0058:
            if (r2 == 0) goto L_0x0077
            X.1MH r0 = r8.A03     // Catch:{ all -> 0x00cf }
            X.1au r7 = r0.A06()     // Catch:{ all -> 0x00cf }
            java.lang.String r5 = "group_id = ? AND sender_account_id = ? AND sender_account_type = ? AND device_id = ?"
            java.lang.String[] r4 = r2.A00()     // Catch:{ all -> 0x00a9 }
            r0 = r7
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x00a9 }
            X.1Ev r2 = r0.A02     // Catch:{ all -> 0x00a9 }
            java.lang.String r1 = "sender_keys"
            java.lang.String r0 = "SignalSenderKeyStore/removeSenderKeySingleSession"
            int r0 = r2.A04(r1, r5, r0, r4)     // Catch:{ all -> 0x00a9 }
            if (r0 <= 0) goto L_0x0095
            goto L_0x0093
        L_0x0077:
            X.1MH r0 = r8.A03     // Catch:{ all -> 0x00cf }
            X.1au r7 = r0.A06()     // Catch:{ all -> 0x00cf }
            java.lang.String r5 = "group_id = ? AND sender_id = ? AND sender_type = ? AND device_id = ?"
            java.lang.String[] r4 = r9.A00()     // Catch:{ all -> 0x00a9 }
            r0 = r7
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x00a9 }
            X.1Ev r2 = r0.A02     // Catch:{ all -> 0x00a9 }
            java.lang.String r1 = "sender_keys"
            java.lang.String r0 = "SignalSenderKeyStore/removeSenderKeyLegacy"
            int r0 = r2.A04(r1, r5, r0, r4)     // Catch:{ all -> 0x00a9 }
            if (r0 <= 0) goto L_0x0095
        L_0x0093:
            r2 = 1
            goto L_0x0096
        L_0x0095:
            r2 = 0
        L_0x0096:
            r7.close()     // Catch:{ all -> 0x00cf }
            X.1Ow r1 = r8.A00     // Catch:{ all -> 0x00cf }
            X.2hs r0 = new X.2hs     // Catch:{ all -> 0x00cf }
            r0.<init>(r6)     // Catch:{ all -> 0x00cf }
            X.1Ox r0 = r1.A01     // Catch:{ all -> 0x00cf }
            r0.A00()     // Catch:{ all -> 0x00cf }
            r3.close()
            return r2
        L_0x00a9:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00ab }
        L_0x00ab:
            r0 = move-exception
            X.CDX.A00(r7, r1)     // Catch:{ all -> 0x00cf }
            throw r0     // Catch:{ all -> 0x00cf }
        L_0x00b0:
            X.11T r0 = new X.11T     // Catch:{ 11T -> 0x00b6 }
            r0.<init>((java.lang.String) r4)     // Catch:{ 11T -> 0x00b6 }
            throw r0     // Catch:{ 11T -> 0x00b6 }
        L_0x00b6:
            r2 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00cf }
            r1.<init>()     // Catch:{ all -> 0x00cf }
            java.lang.String r0 = "SignalSenderKeyStore/removesenderkey/invalidgroupid "
            r1.append(r0)     // Catch:{ all -> 0x00cf }
            r1.append(r4)     // Catch:{ all -> 0x00cf }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x00cf }
            com.whatsapp.util.Log.w(r0, r2)     // Catch:{ all -> 0x00cf }
            r3.close()
            return r5
        L_0x00cf:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00d1 }
        L_0x00d1:
            r0 = move-exception
            X.CDX.A00(r3, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C25631Oy.A05(X.2nC, boolean):boolean");
    }

    public static final C60002nE A00(C25631Oy r2, C60002nE r3, String str) {
        AnonymousClass1MK r22 = r2.A05;
        r22.A07(r3, "sender_keys", str);
        if (r22.A0A(r3)) {
            return r22.A02(r3, str, "sender_keys");
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0096, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        X.CDX.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x009a, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x009d, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x009e, code lost:
        X.CDX.A00(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00a1, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00f3, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:?, code lost:
        X.CDX.A00(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00f7, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00fe, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00ff, code lost:
        X.CDX.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0102, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C52982bn A01(X.C59982nC r14) {
        /*
            r13 = this;
            java.lang.String r1 = "getSenderKey"
            X.2nE r0 = r14.A00
            X.C18070vi.A0X(r0)
            X.2nE r1 = A00(r13, r0, r1)
            if (r1 == 0) goto L_0x0039
            java.lang.String r0 = r14.A01
            X.2nC r2 = new X.2nC
            r2.<init>(r1, r0)
        L_0x0014:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "SignalSenderKeyStore/getSenderKey "
            r1.append(r0)
            r1.append(r14)
            java.lang.String r0 = " & translated = "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            if (r2 == 0) goto L_0x00a2
            X.1MH r0 = r13.A03
            X.1at r4 = r0.get()
            goto L_0x003b
        L_0x0039:
            r2 = 0
            goto L_0x0014
        L_0x003b:
            r0 = 4
            java.lang.String[] r3 = new java.lang.String[r0]     // Catch:{ all -> 0x009b }
            java.lang.String r1 = r2.A01     // Catch:{ all -> 0x009b }
            r0 = 0
            r3[r0] = r1     // Catch:{ all -> 0x009b }
            X.2nE r2 = r2.A00     // Catch:{ all -> 0x009b }
            java.lang.String r1 = r2.A03     // Catch:{ all -> 0x009b }
            r0 = 1
            r3[r0] = r1     // Catch:{ all -> 0x009b }
            int r0 = r2.A01     // Catch:{ all -> 0x009b }
            java.lang.String r1 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x009b }
            r0 = 2
            r3[r0] = r1     // Catch:{ all -> 0x009b }
            int r0 = r2.A00     // Catch:{ all -> 0x009b }
            java.lang.String r1 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x009b }
            r0 = 3
            r3[r0] = r1     // Catch:{ all -> 0x009b }
            r0 = r4
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x009b }
            X.1Ev r2 = r0.A02     // Catch:{ all -> 0x009b }
            java.lang.String r1 = "SELECT record, timestamp FROM sender_keys WHERE group_id = ? AND sender_account_id = ? AND sender_account_type = ? AND device_id = ?"
            java.lang.String r0 = "SignalSenderKeyStore/SELECT_SENDER_KEY"
            android.database.Cursor r3 = r2.A0A(r1, r0, r3)     // Catch:{ all -> 0x009b }
            boolean r0 = r3.moveToNext()     // Catch:{ all -> 0x0094 }
            r9 = 0
            if (r0 == 0) goto L_0x008d
            java.lang.String r0 = "record"
            int r0 = r3.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0094 }
            byte[] r2 = r3.getBlob(r0)     // Catch:{ all -> 0x0094 }
            X.C18070vi.A0X(r2)     // Catch:{ all -> 0x0094 }
            java.lang.String r0 = "timestamp"
            int r0 = r3.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0094 }
            long r0 = r3.getLong(r0)     // Catch:{ all -> 0x0094 }
            X.2bn r9 = new X.2bn     // Catch:{ all -> 0x0094 }
            r9.<init>(r2, r0)     // Catch:{ all -> 0x0094 }
        L_0x008d:
            r3.close()     // Catch:{ all -> 0x009b }
            r4.close()
            return r9
        L_0x0094:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0096 }
        L_0x0096:
            r0 = move-exception
            X.CDX.A00(r3, r1)     // Catch:{ all -> 0x009b }
            throw r0     // Catch:{ all -> 0x009b }
        L_0x009b:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x009d }
        L_0x009d:
            r0 = move-exception
            X.CDX.A00(r4, r1)
            throw r0
        L_0x00a2:
            java.lang.String r1 = "timestamp"
            java.lang.String r3 = "record"
            X.1MH r0 = r13.A03
            X.1at r2 = r0.get()
            java.lang.String r7 = "group_id = ? AND sender_id = ? AND sender_type = ? AND device_id = ?"
            java.lang.String[] r8 = r14.A00()     // Catch:{ all -> 0x00fc }
            r0 = r2
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x00fc }
            X.1Ev r4 = r0.A02     // Catch:{ all -> 0x00fc }
            java.lang.String r5 = "sender_keys"
            r0 = 2
            java.lang.String[] r6 = new java.lang.String[r0]     // Catch:{ all -> 0x00fc }
            r0 = 0
            r6[r0] = r3     // Catch:{ all -> 0x00fc }
            r0 = 1
            r6[r0] = r1     // Catch:{ all -> 0x00fc }
            java.lang.String r12 = "SignalSenderKeyStore/getSenderKeyLegacy"
            r9 = 0
            r11 = r9
            r10 = r9
            android.database.Cursor r4 = r4.A0B(r5, r6, r7, r8, r9, r10, r11, r12)     // Catch:{ all -> 0x00fc }
            if (r4 == 0) goto L_0x00f8
            boolean r0 = r4.moveToNext()     // Catch:{ all -> 0x00f1 }
            if (r0 == 0) goto L_0x00ed
            int r0 = r4.getColumnIndexOrThrow(r3)     // Catch:{ all -> 0x00f1 }
            byte[] r3 = r4.getBlob(r0)     // Catch:{ all -> 0x00f1 }
            X.C18070vi.A0X(r3)     // Catch:{ all -> 0x00f1 }
            int r0 = r4.getColumnIndexOrThrow(r1)     // Catch:{ all -> 0x00f1 }
            long r0 = r4.getLong(r0)     // Catch:{ all -> 0x00f1 }
            X.2bn r9 = new X.2bn     // Catch:{ all -> 0x00f1 }
            r9.<init>(r3, r0)     // Catch:{ all -> 0x00f1 }
        L_0x00ed:
            r4.close()     // Catch:{ all -> 0x00fc }
            goto L_0x00f8
        L_0x00f1:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00f3 }
        L_0x00f3:
            r0 = move-exception
            X.CDX.A00(r4, r1)     // Catch:{ all -> 0x00fc }
            throw r0     // Catch:{ all -> 0x00fc }
        L_0x00f8:
            r2.close()
            return r9
        L_0x00fc:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00fe }
        L_0x00fe:
            r0 = move-exception
            X.CDX.A00(r2, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C25631Oy.A01(X.2nC):X.2bn");
    }

    /* JADX WARNING: type inference failed for: r1v3, types: [java.lang.Object, X.2bX] */
    /* JADX WARNING: type inference failed for: r1v4, types: [java.lang.Object, X.2bX] */
    public C52822bX A02(C58462kj r4) {
        this.A06.A03();
        C17960vV.A07(r4);
        C52982bn A012 = A01(new C59982nC(C62812s2.A00(r4.A01), r4.A00));
        if (A012 != null) {
            return new C52822bX(A012.A01);
        }
        try {
            ? obj = new Object();
            obj.A00 = new LinkedList();
            return obj;
        } catch (IOException e) {
            Log.w("SignalSenderKeyStore ioexception while reading sender key record", e);
            ? obj2 = new Object();
            obj2.A00 = new LinkedList();
            return obj2;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0138, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:?, code lost:
        X.CDX.A00(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x013c, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x013f, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:?, code lost:
        X.CDX.A00(r11, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0143, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0146, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0147, code lost:
        X.CDX.A00(r6, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x014a, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A03(X.C59982nC r23, byte[] r24) {
        /*
            r22 = this;
            java.lang.String r8 = "saveSenderKey"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "SignalSenderKeyStore/saveSenderKey "
            r1.append(r0)
            r9 = r23
            r1.append(r9)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r7 = r22
            X.1MH r3 = r7.A03
            X.1au r6 = r3.A06()
            X.1xA r11 = r6.BD0()     // Catch:{ all -> 0x0144 }
            X.11P r0 = r7.A01     // Catch:{ all -> 0x013d }
            long r14 = X.AnonymousClass11P.A01(r0)     // Catch:{ all -> 0x013d }
            r0 = 1000(0x3e8, double:4.94E-321)
            long r14 = r14 / r0
            X.2nE r5 = r9.A00     // Catch:{ all -> 0x013d }
            X.C18070vi.A0X(r5)     // Catch:{ all -> 0x013d }
            X.2nE r2 = A00(r7, r5, r8)     // Catch:{ all -> 0x013d }
            r10 = r24
            if (r2 == 0) goto L_0x006b
            java.lang.String r1 = r9.A01     // Catch:{ all -> 0x013d }
            X.2nC r0 = new X.2nC     // Catch:{ all -> 0x013d }
            r0.<init>(r2, r1)     // Catch:{ all -> 0x013d }
            X.1au r4 = r3.A06()     // Catch:{ all -> 0x013d }
            android.content.ContentValues r1 = new android.content.ContentValues     // Catch:{ all -> 0x0136 }
            r1.<init>()     // Catch:{ all -> 0x0136 }
            java.lang.String r3 = "record"
            r1.put(r3, r10)     // Catch:{ all -> 0x0136 }
            java.lang.String r19 = "group_id = ? AND sender_account_id = ? AND sender_account_type = ? AND device_id = ?"
            java.lang.String[] r21 = r0.A00()     // Catch:{ all -> 0x0136 }
            r0 = r4
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x0136 }
            X.1Ev r0 = r0.A02     // Catch:{ all -> 0x0136 }
            java.lang.String r2 = "sender_keys"
            java.lang.String r20 = "SignalSenderKeyStore/updateSenderKeySingleSession"
            r17 = r1
            r18 = r2
            r16 = r0
            int r0 = r16.A02(r17, r18, r19, r20, r21)     // Catch:{ all -> 0x0136 }
            long r0 = (long) r0     // Catch:{ all -> 0x0136 }
            goto L_0x0094
        L_0x006b:
            X.1au r4 = r3.A06()     // Catch:{ all -> 0x013d }
            android.content.ContentValues r1 = new android.content.ContentValues     // Catch:{ all -> 0x0136 }
            r1.<init>()     // Catch:{ all -> 0x0136 }
            java.lang.String r3 = "record"
            r1.put(r3, r10)     // Catch:{ all -> 0x0136 }
            java.lang.String r19 = "group_id = ? AND sender_id = ? AND sender_type = ? AND device_id = ?"
            java.lang.String[] r21 = r9.A00()     // Catch:{ all -> 0x0136 }
            r0 = r4
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x0136 }
            X.1Ev r0 = r0.A02     // Catch:{ all -> 0x0136 }
            java.lang.String r2 = "sender_keys"
            java.lang.String r20 = "SignalSenderKeyStore/updateSenderKeyLegacy"
            r17 = r1
            r18 = r2
            r16 = r0
            int r0 = r16.A02(r17, r18, r19, r20, r21)     // Catch:{ all -> 0x0136 }
            long r0 = (long) r0     // Catch:{ all -> 0x0136 }
        L_0x0094:
            r4.close()     // Catch:{ all -> 0x013d }
            r12 = 0
            int r4 = (r0 > r12 ? 1 : (r0 == r12 ? 0 : -1))
            if (r4 != 0) goto L_0x0118
            boolean r0 = r5 instanceof X.AnonymousClass2DV     // Catch:{ all -> 0x013d }
            r12 = 0
            if (r0 != 0) goto L_0x00bd
            X.0ve r4 = r7.A04     // Catch:{ all -> 0x013d }
            r1 = 11642(0x2d7a, float:1.6314E-41)
            X.0vf r0 = X.C18040vf.A02     // Catch:{ all -> 0x013d }
            int r0 = X.C18020vd.A00(r0, r4, r1)     // Catch:{ all -> 0x013d }
            if (r0 == 0) goto L_0x00bd
            X.1MK r0 = r7.A05     // Catch:{ all -> 0x013d }
            X.2nE r1 = r0.A02(r5, r8, r2)     // Catch:{ all -> 0x013d }
            if (r1 == 0) goto L_0x00bd
            java.lang.String r0 = r9.A01     // Catch:{ all -> 0x013d }
            X.2nC r12 = new X.2nC     // Catch:{ all -> 0x013d }
            r12.<init>(r1, r0)     // Catch:{ all -> 0x013d }
        L_0x00bd:
            android.content.ContentValues r4 = new android.content.ContentValues     // Catch:{ all -> 0x013d }
            r4.<init>()     // Catch:{ all -> 0x013d }
            r4.put(r3, r10)     // Catch:{ all -> 0x013d }
            java.lang.String r1 = "group_id"
            java.lang.String r0 = r9.A01     // Catch:{ all -> 0x013d }
            r4.put(r1, r0)     // Catch:{ all -> 0x013d }
            java.lang.String r1 = "sender_id"
            java.lang.String r0 = r5.A03     // Catch:{ all -> 0x013d }
            r4.put(r1, r0)     // Catch:{ all -> 0x013d }
            java.lang.String r1 = "sender_type"
            int r0 = r5.A01     // Catch:{ all -> 0x013d }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x013d }
            r4.put(r1, r0)     // Catch:{ all -> 0x013d }
            java.lang.String r1 = "device_id"
            int r0 = r5.A00     // Catch:{ all -> 0x013d }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x013d }
            r4.put(r1, r0)     // Catch:{ all -> 0x013d }
            java.lang.String r1 = "timestamp"
            java.lang.Long r0 = java.lang.Long.valueOf(r14)     // Catch:{ all -> 0x013d }
            r4.put(r1, r0)     // Catch:{ all -> 0x013d }
            if (r12 == 0) goto L_0x010d
            java.lang.String r1 = "sender_account_id"
            X.2nE r3 = r12.A00     // Catch:{ all -> 0x013d }
            java.lang.String r0 = r3.A03     // Catch:{ all -> 0x013d }
            r4.put(r1, r0)     // Catch:{ all -> 0x013d }
            java.lang.String r1 = "sender_account_type"
            int r0 = r3.A01     // Catch:{ all -> 0x013d }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x013d }
            r4.put(r1, r0)     // Catch:{ all -> 0x013d }
        L_0x010d:
            r0 = r6
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x013d }
            X.1Ev r1 = r0.A02     // Catch:{ all -> 0x013d }
            java.lang.String r0 = "SignalSenderKeyStore/saveSenderKey"
            long r0 = r1.A06(r2, r0, r4)     // Catch:{ all -> 0x013d }
        L_0x0118:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x013d }
            r3.<init>()     // Catch:{ all -> 0x013d }
            java.lang.String r2 = "SignalSenderKeyStore/saveSenderKey/result "
            r3.append(r2)     // Catch:{ all -> 0x013d }
            r3.append(r0)     // Catch:{ all -> 0x013d }
            java.lang.String r0 = r3.toString()     // Catch:{ all -> 0x013d }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x013d }
            r11.A00()     // Catch:{ all -> 0x013d }
            r11.close()     // Catch:{ all -> 0x0144 }
            r6.close()
            return
        L_0x0136:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0138 }
        L_0x0138:
            r0 = move-exception
            X.CDX.A00(r4, r1)     // Catch:{ all -> 0x013d }
            throw r0     // Catch:{ all -> 0x013d }
        L_0x013d:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x013f }
        L_0x013f:
            r0 = move-exception
            X.CDX.A00(r11, r1)     // Catch:{ all -> 0x0144 }
            throw r0     // Catch:{ all -> 0x0144 }
        L_0x0144:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0146 }
        L_0x0146:
            r0 = move-exception
            X.CDX.A00(r6, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C25631Oy.A03(X.2nC, byte[]):void");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:20|21) */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        r1 = new java.lang.StringBuilder();
        r1.append("SignalSenderKeyStore/storesenderkey/invalidgroupid ");
        r1.append(r3);
        com.whatsapp.util.Log.w(r1.toString());
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:20:0x007e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A04(X.C58462kj r8, X.C52822bX r9) {
        /*
            r7 = this;
            X.2mN r0 = r8.A01
            X.2nE r1 = X.C62812s2.A00(r0)
            java.lang.String r0 = r8.A00
            X.2nC r5 = new X.2nC
            r5.<init>(r1, r0)
            X.8XQ r0 = X.AnonymousClass8XQ.DEFAULT_INSTANCE
            X.Bmt r6 = r0.A0N()
            java.util.LinkedList r0 = r9.A00
            java.util.Iterator r4 = r0.iterator()
        L_0x0019:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0044
            java.lang.Object r0 = r4.next()
            X.9ns r0 = (X.C192139ns) r0
            X.8b3 r3 = r0.A00
            r6.A0E()
            X.Bm6 r2 = r6.A00
            X.8XQ r2 = (X.AnonymousClass8XQ) r2
            r3.getClass()
            X.EE9 r1 = r2.senderKeyStates_
            r0 = r1
            X.DbR r0 = (X.C27296DbR) r0
            boolean r0 = r0.A00
            if (r0 != 0) goto L_0x0040
            X.EE9 r1 = X.C23577Bm6.A09(r1)
            r2.senderKeyStates_ = r1
        L_0x0040:
            r1.add(r3)
            goto L_0x0019
        L_0x0044:
            X.Bm6 r0 = r6.A0C()
            byte[] r1 = r0.A0M()
            X.1Os r0 = r7.A02
            X.3Ez r4 = X.C25571Os.A01(r0, r5)
            r4.lock()
            java.lang.String r3 = r5.A01     // Catch:{ all -> 0x0096 }
            X.C18070vi.A0X(r3)     // Catch:{ all -> 0x0096 }
            X.1Dv r0 = X.AnonymousClass1BI.A00     // Catch:{ 11T -> 0x007e }
            com.whatsapp.jid.Jid r2 = X.C22911Dt.A00(r3)     // Catch:{ 11T -> 0x007e }
            boolean r0 = r2 instanceof X.AnonymousClass1E9     // Catch:{ 11T -> 0x007e }
            if (r0 == 0) goto L_0x0078
            X.1E9 r2 = (X.AnonymousClass1E9) r2     // Catch:{ 11T -> 0x007e }
            if (r2 == 0) goto L_0x0078
            r7.A03(r5, r1)     // Catch:{ all -> 0x0096 }
            X.1Ow r1 = r7.A00     // Catch:{ all -> 0x0096 }
            X.2hs r0 = new X.2hs     // Catch:{ all -> 0x0096 }
            r0.<init>(r2)     // Catch:{ all -> 0x0096 }
            X.1Ox r0 = r1.A01     // Catch:{ all -> 0x0096 }
            r0.A00()     // Catch:{ all -> 0x0096 }
            goto L_0x0092
        L_0x0078:
            X.11T r0 = new X.11T     // Catch:{ 11T -> 0x007e }
            r0.<init>((java.lang.String) r3)     // Catch:{ 11T -> 0x007e }
            throw r0     // Catch:{ 11T -> 0x007e }
        L_0x007e:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0096 }
            r1.<init>()     // Catch:{ all -> 0x0096 }
            java.lang.String r0 = "SignalSenderKeyStore/storesenderkey/invalidgroupid "
            r1.append(r0)     // Catch:{ all -> 0x0096 }
            r1.append(r3)     // Catch:{ all -> 0x0096 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0096 }
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ all -> 0x0096 }
        L_0x0092:
            r4.close()
            return
        L_0x0096:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0098 }
        L_0x0098:
            r0 = move-exception
            X.CDX.A00(r4, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C25631Oy.A04(X.2kj, X.2bX):void");
    }
}
