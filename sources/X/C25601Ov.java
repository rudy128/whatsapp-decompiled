package X;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: X.1Ov  reason: invalid class name and case insensitive filesystem */
public final class C25601Ov {
    public final AnonymousClass11P A00;
    public final AnonymousClass1MH A01;
    public final C18030ve A02;
    public final AnonymousClass1MK A03;
    public final AnonymousClass00H A04;

    public C25601Ov(AnonymousClass11P r2, AnonymousClass1MH r3, C18030ve r4, AnonymousClass1MK r5, AnonymousClass00H r6) {
        C18070vi.A0d(r2, 1);
        C18070vi.A0d(r4, 2);
        C18070vi.A0d(r3, 3);
        C18070vi.A0d(r6, 4);
        C18070vi.A0d(r5, 5);
        this.A00 = r2;
        this.A02 = r4;
        this.A01 = r3;
        this.A04 = r6;
        this.A03 = r5;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x00b6, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x00b7, code lost:
        X.CDX.A00(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x00ba, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A06(X.C60002nE r9) {
        /*
            r8 = this;
            r0 = 0
            X.C18070vi.A0d(r9, r0)
            java.lang.String r0 = "removeSession"
            X.2nE r7 = A00(r8, r9, r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r6 = "SignalSessionStore/removeSession "
            r1.append(r6)
            r1.append(r9)
            java.lang.String r0 = " & translated="
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            if (r7 == 0) goto L_0x005e
            X.1MH r0 = r8.A01
            X.1au r4 = r0.A06()
            r0 = r4
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x00b4 }
            X.1Ev r5 = r0.A02     // Catch:{ all -> 0x00b4 }
            java.lang.String r3 = "sessions"
            java.lang.String r2 = "recipient_account_id = ? AND recipient_account_type = ? AND device_id = ? "
            java.lang.String[] r1 = r7.A00()     // Catch:{ all -> 0x00b4 }
            java.lang.String r0 = "SignalSessionStore/removeSessionSingleSession"
            int r0 = r5.A04(r3, r2, r0, r1)     // Catch:{ all -> 0x00b4 }
            long r2 = (long) r0     // Catch:{ all -> 0x00b4 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00b4 }
            r1.<init>()     // Catch:{ all -> 0x00b4 }
            r1.append(r6)     // Catch:{ all -> 0x00b4 }
            r1.append(r2)     // Catch:{ all -> 0x00b4 }
            java.lang.String r0 = " sessions with "
            r1.append(r0)     // Catch:{ all -> 0x00b4 }
            r1.append(r7)     // Catch:{ all -> 0x00b4 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x00b4 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x00b4 }
            goto L_0x00b0
        L_0x005e:
            X.1MK r0 = r8.A03
            boolean r0 = r0.A09(r9)
            if (r0 == 0) goto L_0x006f
            java.lang.String r2 = "AND recipient_account_id IS NULL "
        L_0x0068:
            X.1MH r0 = r8.A01
            X.1au r4 = r0.A06()
            goto L_0x0072
        L_0x006f:
            java.lang.String r2 = ""
            goto L_0x0068
        L_0x0072:
            r0 = r4
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x00b4 }
            X.1Ev r5 = r0.A02     // Catch:{ all -> 0x00b4 }
            java.lang.String r3 = "sessions"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00b4 }
            r1.<init>()     // Catch:{ all -> 0x00b4 }
            java.lang.String r0 = "recipient_id = ? AND recipient_type = ? AND device_id = ? "
            r1.append(r0)     // Catch:{ all -> 0x00b4 }
            r1.append(r2)     // Catch:{ all -> 0x00b4 }
            java.lang.String r2 = r1.toString()     // Catch:{ all -> 0x00b4 }
            java.lang.String[] r1 = r9.A00()     // Catch:{ all -> 0x00b4 }
            java.lang.String r0 = "SignalSessionStore/removeSessionLegacy"
            int r0 = r5.A04(r3, r2, r0, r1)     // Catch:{ all -> 0x00b4 }
            long r2 = (long) r0     // Catch:{ all -> 0x00b4 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00b4 }
            r1.<init>()     // Catch:{ all -> 0x00b4 }
            r1.append(r6)     // Catch:{ all -> 0x00b4 }
            r1.append(r2)     // Catch:{ all -> 0x00b4 }
            java.lang.String r0 = " sessions with "
            r1.append(r0)     // Catch:{ all -> 0x00b4 }
            r1.append(r9)     // Catch:{ all -> 0x00b4 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x00b4 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x00b4 }
        L_0x00b0:
            r4.close()
            return
        L_0x00b4:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00b6 }
        L_0x00b6:
            r0 = move-exception
            X.CDX.A00(r4, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C25601Ov.A06(X.2nE):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0138, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:?, code lost:
        X.CDX.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x013c, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x013f, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:?, code lost:
        X.CDX.A00(r6, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0143, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0146, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0147, code lost:
        X.CDX.A00(r7, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x014a, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A07(X.C60002nE r20, byte[] r21) {
        /*
            r19 = this;
            r0 = 1
            r5 = r21
            X.C18070vi.A0d(r5, r0)
            java.lang.String r1 = "saveSession"
            r0 = r19
            r4 = r20
            X.2nE r9 = A00(r0, r4, r1)
            X.1MH r1 = r0.A01
            X.1au r7 = r1.A06()
            X.1xA r6 = r7.BD0()     // Catch:{ all -> 0x0144 }
            if (r9 == 0) goto L_0x003f
            X.1au r3 = r1.A06()     // Catch:{ all -> 0x013d }
            android.content.ContentValues r11 = new android.content.ContentValues     // Catch:{ all -> 0x0136 }
            r11.<init>()     // Catch:{ all -> 0x0136 }
            java.lang.String r2 = "record"
            r11.put(r2, r5)     // Catch:{ all -> 0x0136 }
            r8 = r3
            X.1av r8 = (X.C28801av) r8     // Catch:{ all -> 0x0136 }
            X.1Ev r10 = r8.A02     // Catch:{ all -> 0x0136 }
            java.lang.String r12 = "sessions"
            java.lang.String r13 = "recipient_account_id = ? AND recipient_account_type = ? AND device_id = ? "
            java.lang.String[] r15 = r9.A00()     // Catch:{ all -> 0x0136 }
            java.lang.String r14 = "SignalSessionStore/saveSessionUpdateSingleSession"
            int r8 = r10.A02(r11, r12, r13, r14, r15)     // Catch:{ all -> 0x0136 }
            goto L_0x007f
        L_0x003f:
            X.1MK r2 = r0.A03     // Catch:{ all -> 0x013d }
            boolean r2 = r2.A09(r4)     // Catch:{ all -> 0x013d }
            if (r2 == 0) goto L_0x004e
            java.lang.String r10 = "AND recipient_account_id IS NULL "
        L_0x0049:
            X.1au r3 = r1.A06()     // Catch:{ all -> 0x013d }
            goto L_0x0051
        L_0x004e:
            java.lang.String r10 = ""
            goto L_0x0049
        L_0x0051:
            android.content.ContentValues r14 = new android.content.ContentValues     // Catch:{ all -> 0x0136 }
            r14.<init>()     // Catch:{ all -> 0x0136 }
            java.lang.String r2 = "record"
            r14.put(r2, r5)     // Catch:{ all -> 0x0136 }
            r8 = r3
            X.1av r8 = (X.C28801av) r8     // Catch:{ all -> 0x0136 }
            X.1Ev r13 = r8.A02     // Catch:{ all -> 0x0136 }
            java.lang.String r12 = "sessions"
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ all -> 0x0136 }
            r9.<init>()     // Catch:{ all -> 0x0136 }
            java.lang.String r8 = "recipient_id = ? AND recipient_type = ? AND device_id = ? "
            r9.append(r8)     // Catch:{ all -> 0x0136 }
            r9.append(r10)     // Catch:{ all -> 0x0136 }
            java.lang.String r16 = r9.toString()     // Catch:{ all -> 0x0136 }
            java.lang.String[] r18 = r4.A00()     // Catch:{ all -> 0x0136 }
            java.lang.String r17 = "SignalSessionStore/saveSessionUpdateLegacy"
            r15 = r12
            int r8 = r13.A02(r14, r15, r16, r17, r18)     // Catch:{ all -> 0x0136 }
        L_0x007f:
            r3.close()     // Catch:{ all -> 0x013d }
            if (r8 != 0) goto L_0x0118
            java.lang.String r10 = "insertNewSession"
            X.0ve r9 = r0.A02     // Catch:{ all -> 0x013d }
            r8 = 11643(0x2d7b, float:1.6315E-41)
            X.0vf r3 = X.C18040vf.A02     // Catch:{ all -> 0x013d }
            int r3 = X.C18020vd.A00(r3, r9, r8)     // Catch:{ all -> 0x013d }
            if (r3 == 0) goto L_0x00a1
            boolean r3 = r4 instanceof X.AnonymousClass2DV     // Catch:{ all -> 0x013d }
            if (r3 != 0) goto L_0x00a1
            X.1MK r3 = r0.A03     // Catch:{ all -> 0x013d }
            X.2nE r9 = r3.A02(r4, r10, r12)     // Catch:{ all -> 0x013d }
        L_0x009c:
            X.1au r3 = r1.A06()     // Catch:{ all -> 0x013d }
            goto L_0x00a3
        L_0x00a1:
            r9 = 0
            goto L_0x009c
        L_0x00a3:
            X.11P r0 = r0.A00     // Catch:{ all -> 0x0136 }
            long r0 = X.AnonymousClass11P.A01(r0)     // Catch:{ all -> 0x0136 }
            r10 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 / r10
            android.content.ContentValues r8 = new android.content.ContentValues     // Catch:{ all -> 0x0136 }
            r8.<init>()     // Catch:{ all -> 0x0136 }
            r8.put(r2, r5)     // Catch:{ all -> 0x0136 }
            java.lang.String r5 = "recipient_id"
            java.lang.String r2 = r4.A03     // Catch:{ all -> 0x0136 }
            r8.put(r5, r2)     // Catch:{ all -> 0x0136 }
            java.lang.String r5 = "recipient_type"
            int r2 = r4.A01     // Catch:{ all -> 0x0136 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x0136 }
            r8.put(r5, r2)     // Catch:{ all -> 0x0136 }
            java.lang.String r5 = "device_id"
            int r2 = r4.A00     // Catch:{ all -> 0x0136 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x0136 }
            r8.put(r5, r2)     // Catch:{ all -> 0x0136 }
            java.lang.String r5 = "timestamp"
            java.lang.Long r2 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0136 }
            r8.put(r5, r2)     // Catch:{ all -> 0x0136 }
            if (r9 == 0) goto L_0x00ef
            java.lang.String r5 = "recipient_account_id"
            java.lang.String r2 = r9.A03     // Catch:{ all -> 0x0136 }
            r8.put(r5, r2)     // Catch:{ all -> 0x0136 }
            java.lang.String r5 = "recipient_account_type"
            int r2 = r9.A01     // Catch:{ all -> 0x0136 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x0136 }
            r8.put(r5, r2)     // Catch:{ all -> 0x0136 }
        L_0x00ef:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x0136 }
            r5.<init>()     // Catch:{ all -> 0x0136 }
            java.lang.String r2 = "SignalSessionStore/insertNewSession "
            r5.append(r2)     // Catch:{ all -> 0x0136 }
            r5.append(r4)     // Catch:{ all -> 0x0136 }
            java.lang.String r2 = " at "
            r5.append(r2)     // Catch:{ all -> 0x0136 }
            r5.append(r0)     // Catch:{ all -> 0x0136 }
            java.lang.String r0 = r5.toString()     // Catch:{ all -> 0x0136 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0136 }
            r0 = r3
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x0136 }
            X.1Ev r1 = r0.A02     // Catch:{ all -> 0x0136 }
            java.lang.String r0 = "SignalSessionStore/saveSession"
            r1.A05(r12, r0, r8)     // Catch:{ all -> 0x0136 }
            r3.close()     // Catch:{ all -> 0x013d }
        L_0x0118:
            r6.A00()     // Catch:{ all -> 0x013d }
            r6.close()     // Catch:{ all -> 0x0144 }
            r7.close()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "SignalSessionStore/saveSession "
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            return
        L_0x0136:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0138 }
        L_0x0138:
            r0 = move-exception
            X.CDX.A00(r3, r1)     // Catch:{ all -> 0x013d }
            throw r0     // Catch:{ all -> 0x013d }
        L_0x013d:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x013f }
        L_0x013f:
            r0 = move-exception
            X.CDX.A00(r6, r1)     // Catch:{ all -> 0x0144 }
            throw r0     // Catch:{ all -> 0x0144 }
        L_0x0144:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0146 }
        L_0x0146:
            r0 = move-exception
            X.CDX.A00(r7, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C25601Ov.A07(X.2nE, byte[]):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0088, code lost:
        if (r3 != null) goto L_0x008a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0093, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
        X.CDX.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0097, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x009a, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x009b, code lost:
        X.CDX.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x009e, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final byte[] A08(X.C60002nE r15) {
        /*
            r14 = this;
            r0 = 0
            X.C18070vi.A0d(r15, r0)
            java.lang.String r0 = "getSession"
            X.2nE r2 = A00(r14, r15, r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "SignalSessionStore/getSession "
            r1.append(r0)
            r1.append(r15)
            java.lang.String r0 = " & translated="
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            if (r2 == 0) goto L_0x002f
            java.lang.String r0 = "SELECT record FROM sessions WHERE recipient_account_id = ? AND recipient_account_type = ? AND device_id = ? "
            byte[] r10 = r14.A03(r2, r0)
            return r10
        L_0x002f:
            X.1MK r0 = r14.A03
            boolean r0 = r0.A09(r15)
            if (r0 == 0) goto L_0x003e
            java.lang.String r0 = "SELECT record FROM sessions WHERE recipient_id = ? AND recipient_type = ? AND device_id = ? AND recipient_account_id IS NULL "
            byte[] r10 = r14.A03(r15, r0)
            return r10
        L_0x003e:
            java.lang.String r4 = "record"
            r3 = 0
            r10 = 0
            r1 = 1
            X.1MH r0 = r14.A01
            X.1at r2 = r0.get()
            r0 = r2
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x0098 }
            X.1Ev r5 = r0.A02     // Catch:{ all -> 0x0098 }
            java.lang.String r6 = "sessions"
            java.lang.String[] r7 = new java.lang.String[r1]     // Catch:{ all -> 0x0098 }
            r7[r3] = r4     // Catch:{ all -> 0x0098 }
            java.lang.String r8 = "recipient_id = ? AND recipient_type = ? AND device_id = ? "
            java.lang.String[] r9 = r15.A00()     // Catch:{ all -> 0x0098 }
            java.lang.String r13 = "SignalSessionStore/getSession"
            r12 = r10
            r11 = r10
            android.database.Cursor r3 = r5.A0B(r6, r7, r8, r9, r10, r11, r12, r13)     // Catch:{ all -> 0x0098 }
            if (r3 == 0) goto L_0x0074
            boolean r0 = r3.moveToNext()     // Catch:{ all -> 0x0091 }
            if (r0 == 0) goto L_0x0074
            int r0 = r3.getColumnIndexOrThrow(r4)     // Catch:{ all -> 0x0091 }
            byte[] r10 = r3.getBlob(r0)     // Catch:{ all -> 0x0091 }
            goto L_0x008a
        L_0x0074:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0091 }
            r1.<init>()     // Catch:{ all -> 0x0091 }
            java.lang.String r0 = "SignalSessionStore/getSession cant load a session record for "
            r1.append(r0)     // Catch:{ all -> 0x0091 }
            r1.append(r15)     // Catch:{ all -> 0x0091 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0091 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0091 }
            if (r3 == 0) goto L_0x008d
        L_0x008a:
            r3.close()     // Catch:{ all -> 0x0098 }
        L_0x008d:
            r2.close()
            return r10
        L_0x0091:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0093 }
        L_0x0093:
            r0 = move-exception
            X.CDX.A00(r3, r1)     // Catch:{ all -> 0x0098 }
            throw r0     // Catch:{ all -> 0x0098 }
        L_0x0098:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x009a }
        L_0x009a:
            r0 = move-exception
            X.CDX.A00(r2, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C25601Ov.A08(X.2nE):byte[]");
    }

    public static final C60002nE A00(C25601Ov r2, C60002nE r3, String str) {
        AnonymousClass1MK r22 = r2.A03;
        r22.A07(r3, "sessions", str);
        if (r22.A0A(r3)) {
            return r22.A02(r3, str, "sessions");
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00df, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00e0, code lost:
        X.CDX.A00(r8, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00e3, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.util.HashMap A01(java.lang.String r13, java.lang.String r14, java.util.Set r15) {
        /*
            r12 = this;
            java.util.HashMap r10 = new java.util.HashMap
            r10.<init>()
            java.lang.Object r0 = X.C29431cG.A0Y(r15)
            boolean r1 = r0 instanceof X.AnonymousClass2DV
            X.1MH r0 = r12.A01
            X.1Ev r3 = r0.Bbw()
            int r5 = r15.size()
            if (r1 == 0) goto L_0x008d
            java.lang.String r4 = " AND recipient_account_id IS NULL "
        L_0x0019:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "SELECT record, "
            r1.append(r0)
            r1.append(r13)
            java.lang.String r0 = ", "
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r2.append(r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r14)
            java.lang.String r0 = ", device_id "
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r2.append(r0)
            java.lang.String r0 = "FROM sessions "
            r2.append(r0)
            java.lang.String r0 = " WHERE "
            r2.append(r0)
            r1 = 0
        L_0x0056:
            if (r1 >= r5) goto L_0x0090
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r0 = 40
            r6.append(r0)
            r6.append(r13)
            java.lang.String r0 = " = ? AND "
            r6.append(r0)
            r6.append(r14)
            java.lang.String r0 = " = ? AND device_id = ? "
            r6.append(r0)
            r6.append(r4)
            r0 = 41
            r6.append(r0)
            java.lang.String r0 = r6.toString()
            r2.append(r0)
            int r0 = r5 + -1
            if (r1 == r0) goto L_0x008a
            java.lang.String r0 = " OR "
            r2.append(r0)
        L_0x008a:
            int r1 = r1 + 1
            goto L_0x0056
        L_0x008d:
            java.lang.String r4 = " "
            goto L_0x0019
        L_0x0090:
            java.lang.String r2 = r2.toString()
            X.C18070vi.A0X(r2)
            java.lang.String[] r1 = X.AnonymousClass2TO.A00(r15)
            java.lang.String r0 = "SignalSessionStore/getBulkSessions"
            android.database.Cursor r8 = r3.A0A(r2, r0, r1)
            java.lang.String r0 = "record"
            int r9 = r8.getColumnIndex(r0)     // Catch:{ all -> 0x00dd }
            int r11 = r8.getColumnIndex(r13)     // Catch:{ all -> 0x00dd }
            int r7 = r8.getColumnIndex(r14)     // Catch:{ all -> 0x00dd }
            java.lang.String r0 = "device_id"
            int r6 = r8.getColumnIndex(r0)     // Catch:{ all -> 0x00dd }
        L_0x00b5:
            boolean r0 = r8.moveToNext()     // Catch:{ all -> 0x00dd }
            if (r0 == 0) goto L_0x00d9
            byte[] r5 = r8.getBlob(r9)     // Catch:{ all -> 0x00dd }
            X.C18070vi.A0X(r5)     // Catch:{ all -> 0x00dd }
            java.lang.String r4 = r8.getString(r11)     // Catch:{ all -> 0x00dd }
            int r3 = r8.getInt(r7)     // Catch:{ all -> 0x00dd }
            int r2 = r8.getInt(r6)     // Catch:{ all -> 0x00dd }
            java.lang.Integer r1 = X.AnonymousClass00R.A00     // Catch:{ all -> 0x00dd }
            X.2nE r0 = new X.2nE     // Catch:{ all -> 0x00dd }
            r0.<init>(r1, r4, r3, r2)     // Catch:{ all -> 0x00dd }
            r10.put(r0, r5)     // Catch:{ all -> 0x00dd }
            goto L_0x00b5
        L_0x00d9:
            r8.close()
            return r10
        L_0x00dd:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00df }
        L_0x00df:
            r0 = move-exception
            X.CDX.A00(r8, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C25601Ov.A01(java.lang.String, java.lang.String, java.util.Set):java.util.HashMap");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x004a, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        X.CDX.A00(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x004e, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0051, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0052, code lost:
        X.CDX.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0055, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final byte[] A03(X.C60002nE r6, java.lang.String r7) {
        /*
            r5 = this;
            X.1MH r0 = r5.A01
            X.1at r3 = r0.get()
            r0 = r3
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x004f }
            X.1Ev r2 = r0.A02     // Catch:{ all -> 0x004f }
            java.lang.String[] r1 = r6.A00()     // Catch:{ all -> 0x004f }
            java.lang.String r0 = "SignalSessionStore/SELECT_SESSION"
            android.database.Cursor r4 = r2.A0A(r7, r0, r1)     // Catch:{ all -> 0x004f }
            boolean r0 = r4.moveToNext()     // Catch:{ all -> 0x0048 }
            r2 = 0
            if (r0 != 0) goto L_0x0037
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0048 }
            r1.<init>()     // Catch:{ all -> 0x0048 }
            java.lang.String r0 = "SignalSessionStore/getSession cant load a session record for "
            r1.append(r0)     // Catch:{ all -> 0x0048 }
            r1.append(r6)     // Catch:{ all -> 0x0048 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0048 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0048 }
            r4.close()     // Catch:{ all -> 0x004f }
            r3.close()
            return r2
        L_0x0037:
            java.lang.String r0 = "record"
            int r0 = r4.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0048 }
            byte[] r0 = r4.getBlob(r0)     // Catch:{ all -> 0x0048 }
            r4.close()     // Catch:{ all -> 0x004f }
            r3.close()
            return r0
        L_0x0048:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x004a }
        L_0x004a:
            r0 = move-exception
            X.CDX.A00(r4, r1)     // Catch:{ all -> 0x004f }
            throw r0     // Catch:{ all -> 0x004f }
        L_0x004f:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0051 }
        L_0x0051:
            r0 = move-exception
            X.CDX.A00(r3, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C25601Ov.A03(X.2nE, java.lang.String):byte[]");
    }

    public final LinkedHashMap A04(String str, Set set) {
        C18030ve r2 = this.A02;
        Object obj = this.A04.get();
        C18070vi.A0X(obj);
        C63182se r1 = (C63182se) obj;
        C18070vi.A0d(r1, 1);
        if (r1.A02() && C18020vd.A00(C18040vf.A02, r2, 7821) != 0) {
            HashSet hashSet = new HashSet();
            Iterator it = set.iterator();
            while (it.hasNext()) {
                C60002nE r12 = (C60002nE) it.next();
                if (this.A03.A0A(r12)) {
                    hashSet.add(r12);
                }
            }
            if (!hashSet.isEmpty()) {
                return AnonymousClass1D7.A08(this.A03.A05(str, "sessions", hashSet));
            }
        }
        return new LinkedHashMap();
    }

    /* JADX WARNING: Removed duplicated region for block: B:5:0x0012 A[LOOP:0: B:5:0x0012->B:8:0x001e, LOOP_START] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.util.Map A02(java.util.Set r3) {
        /*
            r2 = this;
            boolean r0 = r3.isEmpty()
            if (r0 == 0) goto L_0x000e
            X.1CQ r1 = X.AnonymousClass1CQ.A00
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.emptyMap, V of kotlin.collections.MapsKt__MapsKt.emptyMap>"
            X.C18070vi.A0z(r1, r0)
            return r1
        L_0x000e:
            java.util.Iterator r1 = r3.iterator()
        L_0x0012:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0020
            java.lang.Object r0 = r1.next()
            boolean r0 = r0 instanceof X.AnonymousClass2DV
            if (r0 == 0) goto L_0x0012
        L_0x0020:
            java.lang.String r1 = "recipient_id"
            java.lang.String r0 = "recipient_type"
            java.util.HashMap r1 = r2.A01(r1, r0, r3)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C25601Ov.A02(java.util.Set):java.util.Map");
    }

    public final LinkedHashMap A05(Set set) {
        Map A0D;
        int size = set.size();
        boolean z = false;
        if (1 <= size && size < 101) {
            z = true;
        }
        C17960vV.A0C(z);
        LinkedHashMap A042 = A04("getSessionsSingleSession", set);
        ArrayList arrayList = new ArrayList();
        for (Object next : set) {
            if (next instanceof AnonymousClass2DV) {
                arrayList.add(next);
            }
        }
        Set A12 = C29431cG.A12(arrayList);
        if (A042.isEmpty()) {
            A0D = AnonymousClass1CQ.A00;
            C18070vi.A0z(A0D, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.emptyMap, V of kotlin.collections.MapsKt__MapsKt.emptyMap>");
        } else {
            HashMap A012 = A01("recipient_account_id", "recipient_account_type", C29431cG.A12(A042.values()));
            ArrayList arrayList2 = new ArrayList();
            for (Map.Entry entry : A042.entrySet()) {
                Object obj = A012.get(entry.getValue());
                if (obj != null) {
                    arrayList2.add(new AnonymousClass1D6(entry.getKey(), obj));
                }
            }
            A0D = AnonymousClass1D7.A0D(arrayList2);
        }
        return AnonymousClass1D7.A09(AnonymousClass1D7.A09(A02(C41841x9.A06(A12, C41841x9.A06(A042.keySet(), set))), A02(A12)), A0D);
    }
}
