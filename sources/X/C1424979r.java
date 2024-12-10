package X;

import android.os.SystemClock;
import java.util.AbstractCollection;

/* renamed from: X.79r  reason: invalid class name and case insensitive filesystem */
public class C1424979r implements C15950rT {
    public final int A00;
    public final Object A01;

    public C1424979r(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public static long A00(AnonymousClass1DS r1, AnonymousClass19Y r2, C136896ua r3, AnonymousClass1Ez r4, int i) {
        r4.A03("done");
        r1.A0E(Boolean.FALSE);
        r2.markerEnd(926875649, i, 2);
        r3.A01();
        return SystemClock.uptimeMillis();
    }

    public static void A01(AnonymousClass1DS r1, C22801Dg r2, CW0 cw0, Object obj, int i) {
        cw0.A00(new C1424979r(obj, i), r1, r2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:137:0x02a2, code lost:
        if (r1 == null) goto L_0x02a4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:212:0x03c0, code lost:
        if ((r1 instanceof android.os.OperationCanceledException) == false) goto L_0x03e7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:238:0x04b0, code lost:
        if (r1 == -3) goto L_0x04b2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:264:0x0534, code lost:
        if (r0.BLC(r15) == false) goto L_0x0536;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:337:?, code lost:
        r8.A01();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:340:?, code lost:
        A03(r5, r8, X.C108945cZ.A1A(X.AnonymousClass000.A1X(r11.A0A.A00)), r3, 1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:344:0x075a, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:345:0x075b, code lost:
        X.AnonymousClass3MY.A1M(r7, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:346:0x075e, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:503:?, code lost:
        r10.A01();
        r5.A03("cancelled");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:504:0x0bcd, code lost:
        if (r5.A01() < 300) goto L_0x0bcf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:505:0x0bcf, code lost:
        r6.markerDrop(926875649, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:506:0x0bd5, code lost:
        r10.A01();
        A03(r8, r10, (java.lang.Boolean) null, r3, 1);
        r10.A03();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:507:0x0be2, code lost:
        r6.markerEnd(926875649, r7, 4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:510:0x0bee, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:511:0x0bef, code lost:
        r5.A02();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:512:0x0bf2, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x0166, code lost:
        if ((r1 instanceof android.os.OperationCanceledException) == false) goto L_0x03e7;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:336:0x0740 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:502:0x0bbd */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x01c4  */
    /* JADX WARNING: Removed duplicated region for block: B:223:0x03ef  */
    /* JADX WARNING: Removed duplicated region for block: B:435:0x09a6 A[Catch:{ 1QC -> 0x09c9, all -> 0x0a1d }] */
    /* JADX WARNING: Removed duplicated region for block: B:438:0x09ae A[Catch:{ 1QC -> 0x09c9, all -> 0x0a1d }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object apply(java.lang.Object r34) {
        /*
            r33 = this;
            r1 = r34
            r2 = r33
            int r0 = r2.A00
            switch(r0) {
                case 0: goto L_0x0bf3;
                case 1: goto L_0x0a38;
                case 2: goto L_0x075f;
                case 3: goto L_0x067b;
                case 4: goto L_0x03fc;
                case 5: goto L_0x0171;
                default: goto L_0x0009;
            }
        L_0x0009:
            java.lang.Object r2 = r2.A01
            X.6kD r2 = (X.C130916kD) r2
            X.COf r1 = (X.C24887COf) r1
            X.1yT r9 = r1.A00
            r2.A0A = r9
            java.lang.Object r1 = r1.A01
            X.1jz r1 = (X.C34141jz) r1
            int r0 = r1.A02
            if (r0 != 0) goto L_0x0035
            X.77Z r0 = r1.A06
            if (r0 != 0) goto L_0x0035
            X.77M r0 = r1.A04
            if (r0 != 0) goto L_0x0035
            X.1BI r0 = r1.A03
            boolean r0 = X.AnonymousClass000.A1W(r0)
            if (r0 != 0) goto L_0x003b
            java.lang.String r0 = r1.A02()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x003b
        L_0x0035:
            android.util.SparseIntArray r3 = new android.util.SparseIntArray
            r3.<init>()
            return r3
        L_0x003b:
            X.1DT r4 = r2.A04
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r4.A0E(r0)
            X.1QB r7 = r2.A05
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()
            java.lang.String r0 = "FtsMessageStore/getMediaCounts/"
            r2.append(r0)
            int r0 = X.C108955ca.A03(r1)
            java.lang.String r0 = X.C17880vN.A0t(r2, r0)
            X.1Ez r2 = new X.1Ez
            r2.<init>((java.lang.String) r0)
            android.util.SparseIntArray r3 = new android.util.SparseIntArray
            r3.<init>()
            boolean r0 = r7.A0O()
            if (r0 != 0) goto L_0x0073
            java.lang.String r0 = "FtsMessageStore not ready"
        L_0x0067:
            r2.A03(r0)
        L_0x006a:
            r2.A02()
        L_0x006d:
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r4.A0E(r0)
            return r3
        L_0x0073:
            boolean r0 = X.AnonymousClass1QB.A05(r9)
            java.lang.String r10 = "cancelled"
            if (r0 != 0) goto L_0x016c
            long r11 = r7.BS5()
            r5 = 1
            int r0 = (r11 > r5 ? 1 : (r11 == r5 ? 0 : -1))
            if (r0 != 0) goto L_0x0088
            java.lang.String r0 = "v1"
            goto L_0x0067
        L_0x0088:
            java.util.ArrayList r12 = X.AnonymousClass000.A13()
            java.util.ArrayList r8 = X.AnonymousClass000.A13()
            java.lang.String r0 = r1.A02()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            java.lang.String r14 = ""
            if (r0 == 0) goto L_0x00cc
            X.1BI r0 = r1.A03
            if (r0 != 0) goto L_0x00cc
            r13 = r14
        L_0x00a1:
            X.0vb r0 = r7.A04
            X.1jz r11 = new X.1jz
            r11.<init>(r0)
            int[] r15 = X.AnonymousClass1QB.A0O
            r6 = 8
            r5 = 0
        L_0x00ad:
            if (r5 >= r6) goto L_0x00d2
            r1 = r15[r5]
            java.lang.String r0 = "SELECT count(*) AS count FROM message_ftsv2 WHERE message_ftsv2 MATCH ? "
            r12.add(r0)
            r11.A02 = r1
            java.lang.String r0 = r7.A0D(r9, r11, r14)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A11(r0)
            java.lang.String r0 = " "
            java.lang.String r0 = X.AnonymousClass001.A1H(r0, r13, r1)
            r8.add(r0)
            int r5 = r5 + 1
            goto L_0x00ad
        L_0x00cc:
            r0 = 0
            java.lang.String r13 = r7.A0C(r9, r1, r0)
            goto L_0x00a1
        L_0x00d2:
            boolean r0 = X.AnonymousClass1QB.A05(r9)
            if (r0 != 0) goto L_0x016c
            java.lang.String r0 = " UNION ALL "
            java.lang.String r6 = android.text.TextUtils.join(r0, r12)
            r0 = 0
            java.lang.String[] r5 = X.C17890vO.A1b(r8, r0)
            java.lang.String r0 = "matchterm"
            r2.A03(r0)
            X.1Cd r0 = r7.A0C     // Catch:{ SQLiteDatabaseCorruptException -> 0x0159, SQLiteException -> 0x0149, 1QC -> 0x0168, Exception -> 0x0163 }
            X.1at r11 = r0.get()     // Catch:{ SQLiteDatabaseCorruptException -> 0x0159, SQLiteException -> 0x0149, 1QC -> 0x0168, Exception -> 0x0163 }
            r0 = r11
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x013f }
            X.1Ev r1 = r0.A02     // Catch:{ all -> 0x013f }
            java.lang.String r0 = "GET_MEDIA_COUNTS"
            X.26f r8 = r1.A0C(r9, r6, r0, r5)     // Catch:{ all -> 0x013f }
            java.lang.String r0 = "count"
            int r6 = r8.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0135 }
            r5 = 0
        L_0x0100:
            boolean r0 = r8.moveToNext()     // Catch:{ all -> 0x0135 }
            if (r0 == 0) goto L_0x0129
            boolean r0 = X.AnonymousClass1QB.A05(r9)     // Catch:{ all -> 0x0135 }
            if (r0 == 0) goto L_0x0113
            r2.A03(r10)     // Catch:{ all -> 0x0135 }
            r2.A02()     // Catch:{ all -> 0x0135 }
            goto L_0x0121
        L_0x0113:
            int r1 = r8.getInt(r6)     // Catch:{ all -> 0x0135 }
            if (r1 <= 0) goto L_0x011e
            r0 = r15[r5]     // Catch:{ all -> 0x0135 }
            r3.put(r0, r1)     // Catch:{ all -> 0x0135 }
        L_0x011e:
            int r5 = r5 + 1
            goto L_0x0100
        L_0x0121:
            r8.close()     // Catch:{ all -> 0x013f }
            r11.close()     // Catch:{ SQLiteDatabaseCorruptException -> 0x0159, SQLiteException -> 0x0149, 1QC -> 0x0168, Exception -> 0x0163 }
            goto L_0x006d
        L_0x0129:
            java.lang.String r0 = "counted"
            r2.A03(r0)     // Catch:{ all -> 0x0135 }
            r8.close()     // Catch:{ all -> 0x013f }
            r11.close()     // Catch:{ SQLiteDatabaseCorruptException -> 0x0159, SQLiteException -> 0x0149, 1QC -> 0x0168, Exception -> 0x0163 }
            goto L_0x0168
        L_0x0135:
            r1 = move-exception
            r8.close()     // Catch:{ all -> 0x013a }
            goto L_0x013e
        L_0x013a:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x013f }
        L_0x013e:
            throw r1     // Catch:{ all -> 0x013f }
        L_0x013f:
            r1 = move-exception
            r11.close()     // Catch:{ all -> 0x0144 }
            goto L_0x0148
        L_0x0144:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0159, SQLiteException -> 0x0149, 1QC -> 0x0168, Exception -> 0x0163 }
        L_0x0148:
            throw r1     // Catch:{ SQLiteDatabaseCorruptException -> 0x0159, SQLiteException -> 0x0149, 1QC -> 0x0168, Exception -> 0x0163 }
        L_0x0149:
            r1 = move-exception
            java.lang.String r0 = "FtsMessageStore/search/error"
            com.whatsapp.util.Log.e(r0, r1)
            java.lang.String r0 = "error"
            r2.A03(r0)
            r2.A02()
            goto L_0x006d
        L_0x0159:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)
            X.1Cn r0 = r7.A0B
            r0.A03()
            goto L_0x0168
        L_0x0163:
            r1 = move-exception
            boolean r0 = r1 instanceof android.os.OperationCanceledException
            if (r0 == 0) goto L_0x03e7
        L_0x0168:
            java.lang.String r0 = "complete"
            goto L_0x0067
        L_0x016c:
            r2.A03(r10)
            goto L_0x006a
        L_0x0171:
            java.lang.Object r7 = r2.A01
            X.6kD r7 = (X.C130916kD) r7
            X.COf r1 = (X.C24887COf) r1
            X.1yT r6 = r1.A00
            r7.A09 = r6
            java.lang.Object r8 = r1.A01
            X.1jz r8 = (X.C34141jz) r8
            X.1BI r0 = r8.A03
            if (r0 != 0) goto L_0x03e8
            X.77Z r0 = r8.A06
            if (r0 != 0) goto L_0x03e8
            X.1DT r4 = r7.A03
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r4.A0E(r0)
            X.1QB r3 = r7.A05
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "FtsMessageStore/findChats/"
            r1.append(r0)
            int r0 = X.C108955ca.A03(r8)
            java.lang.String r0 = X.C17880vN.A0t(r1, r0)
            X.1Ez r2 = new X.1Ez
            r2.<init>((java.lang.String) r0)
            java.util.ArrayList r5 = X.AnonymousClass000.A13()
            boolean r0 = r3.A0O()
            if (r0 != 0) goto L_0x01f0
            java.lang.String r0 = "FtsMessageStore not ready"
        L_0x01b2:
            r2.A03(r0)
        L_0x01b5:
            r2.A02()
        L_0x01b8:
            X.0ve r2 = r7.A07
            r1 = 1448(0x5a8, float:2.029E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x03ef
            r0 = 0
            java.util.ArrayList r0 = r3.A0H(r6, r8, r0)
            java.util.Iterator r1 = r0.iterator()
            r2 = 0
        L_0x01ce:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x03e0
            java.lang.Object r0 = r1.next()
            android.util.Pair r0 = (android.util.Pair) r0
            if (r2 != 0) goto L_0x01e8
            java.util.HashSet r2 = X.C17880vN.A12()
            java.lang.Object r0 = r0.second
            java.util.Collection r0 = (java.util.Collection) r0
            r2.addAll(r0)
            goto L_0x01ce
        L_0x01e8:
            java.lang.Object r0 = r0.second
            java.util.Collection r0 = (java.util.Collection) r0
            r2.retainAll(r0)
            goto L_0x01ce
        L_0x01f0:
            boolean r0 = X.AnonymousClass1QB.A05(r6)
            java.lang.String r10 = "cancelled"
            if (r0 == 0) goto L_0x01fc
            r2.A03(r10)
            goto L_0x01b5
        L_0x01fc:
            java.util.List r0 = r8.A04()
            boolean r0 = X.AnonymousClass000.A1a(r0)
            if (r0 != 0) goto L_0x0209
            java.lang.String r0 = "empty"
            goto L_0x01b2
        L_0x0209:
            long r13 = r3.BS5()
            r11 = 1
            int r0 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r0 != 0) goto L_0x0216
            java.lang.String r0 = "v1"
            goto L_0x01b2
        L_0x0216:
            java.util.List r0 = r8.A04()
            boolean r0 = X.AnonymousClass000.A1a(r0)
            if (r0 != 0) goto L_0x0237
            java.lang.String r1 = ""
        L_0x0222:
            r0 = 0
            java.lang.String r0 = r3.A0C(r6, r8, r0)
            java.lang.StringBuilder r0 = X.AnonymousClass000.A11(r0)
            java.lang.String r12 = " "
            java.lang.String r14 = X.AnonymousClass001.A1H(r12, r1, r0)
            java.lang.String r0 = "matchterm"
            r2.A03(r0)
            goto L_0x02a8
        L_0x0237:
            r0 = 0
            java.util.ArrayList r0 = r3.A0H(r6, r8, r0)
            java.util.HashSet r11 = X.C17880vN.A12()
            java.util.Iterator r12 = r0.iterator()
        L_0x0244:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x026a
            java.lang.Object r0 = r12.next()
            android.util.Pair r0 = (android.util.Pair) r0
            java.lang.Object r0 = r0.second
            java.util.List r0 = (java.util.List) r0
            java.util.Iterator r9 = r0.iterator()
        L_0x0258:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x0244
            java.lang.Object r1 = r9.next()
            boolean r0 = r1 instanceof com.whatsapp.jid.UserJid
            if (r0 == 0) goto L_0x0258
            r11.add(r1)
            goto L_0x0258
        L_0x026a:
            boolean r0 = r11.isEmpty()
            if (r0 != 0) goto L_0x02a4
            int r0 = r11.size()
            java.lang.String[] r12 = new java.lang.String[r0]
            java.util.Iterator r14 = r11.iterator()
            r13 = 0
        L_0x027b:
            boolean r0 = r14.hasNext()
            if (r0 == 0) goto L_0x029c
            X.1BI r11 = X.C17880vN.A0Q(r14)
            int r9 = r13 + 1
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "fts_jid:"
            r1.append(r0)
            java.lang.String r0 = r3.A0E(r11)
            java.lang.String r0 = X.AnonymousClass000.A0y(r0, r1)
            r12[r13] = r0
            r13 = r9
            goto L_0x027b
        L_0x029c:
            java.lang.String r0 = " OR "
            java.lang.String r1 = android.text.TextUtils.join(r0, r12)
            if (r1 != 0) goto L_0x0222
        L_0x02a4:
            java.lang.String r0 = "no user"
            goto L_0x01b2
        L_0x02a8:
            X.1Cd r0 = r3.A0C     // Catch:{ SQLiteDatabaseCorruptException -> 0x03d3, SQLiteException -> 0x03c3, 1QC -> 0x03dc, Exception -> 0x03bd }
            X.1at r18 = r0.get()     // Catch:{ SQLiteDatabaseCorruptException -> 0x03d3, SQLiteException -> 0x03c3, 1QC -> 0x03dc, Exception -> 0x03bd }
            r0 = r18
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x03b3 }
            X.1Ev r13 = r0.A02     // Catch:{ all -> 0x03b3 }
            java.lang.String r9 = "SELECT fts_jid, count(*) AS count FROM message_ftsv2 WHERE message_ftsv2 MATCH ? GROUP BY fts_jid"
            java.lang.String[] r1 = X.C17880vN.A1Y()     // Catch:{ all -> 0x03b3 }
            r11 = 0
            r1[r11] = r14     // Catch:{ all -> 0x03b3 }
            java.lang.String r0 = "SEARCH_FTS_JID_SQL"
            X.26f r9 = r13.A0C(r6, r9, r0, r1)     // Catch:{ all -> 0x03b3 }
            java.lang.String r0 = "fts_jid"
            int r17 = r9.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x03a9 }
            java.lang.String r0 = "count"
            int r16 = r9.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x03a9 }
            java.util.HashMap r1 = X.C17880vN.A11()     // Catch:{ all -> 0x03a9 }
        L_0x02d3:
            boolean r0 = r9.moveToNext()     // Catch:{ all -> 0x03a9 }
            if (r0 == 0) goto L_0x0311
            boolean r0 = X.AnonymousClass1QB.A05(r6)     // Catch:{ all -> 0x03a9 }
            if (r0 != 0) goto L_0x0338
            r0 = r17
            java.lang.String r0 = r9.getString(r0)     // Catch:{ all -> 0x03a9 }
            java.lang.String[] r13 = android.text.TextUtils.split(r0, r12)     // Catch:{ all -> 0x03a9 }
            r0 = r16
            int r14 = r9.getInt(r0)     // Catch:{ all -> 0x03a9 }
            int r0 = r13.length     // Catch:{ all -> 0x03a9 }
            r19 = r0
        L_0x02f2:
            r0 = r19
            if (r11 >= r0) goto L_0x030f
            r15 = r13[r11]     // Catch:{ all -> 0x03a9 }
            java.lang.Object r0 = r1.get(r15)     // Catch:{ all -> 0x03a9 }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ all -> 0x03a9 }
            if (r0 != 0) goto L_0x0304
            X.C17890vO.A0z(r15, r1, r14)     // Catch:{ all -> 0x03a9 }
            goto L_0x030c
        L_0x0304:
            int r0 = r0.intValue()     // Catch:{ all -> 0x03a9 }
            int r0 = r0 + r14
            X.C17890vO.A0z(r15, r1, r0)     // Catch:{ all -> 0x03a9 }
        L_0x030c:
            int r11 = r11 + 1
            goto L_0x02f2
        L_0x030f:
            r11 = 0
            goto L_0x02d3
        L_0x0311:
            java.lang.String r0 = "counted"
            r2.A03(r0)     // Catch:{ all -> 0x03a9 }
            java.util.Set r0 = r1.entrySet()     // Catch:{ all -> 0x03a9 }
            java.util.ArrayList r1 = X.C17880vN.A10(r0)     // Catch:{ all -> 0x03a9 }
            boolean r0 = X.AnonymousClass1QB.A05(r6)     // Catch:{ all -> 0x03a9 }
            if (r0 != 0) goto L_0x0338
            r0 = 10
            X.C147027Rn.A01(r0, r1)     // Catch:{ all -> 0x03a9 }
            java.lang.String r0 = "sorted"
            r2.A03(r0)     // Catch:{ all -> 0x03a9 }
            java.util.Iterator r15 = r1.iterator()     // Catch:{ all -> 0x03a9 }
            boolean r0 = X.AnonymousClass1QB.A05(r6)     // Catch:{ all -> 0x03a9 }
            if (r0 == 0) goto L_0x033f
        L_0x0338:
            r2.A03(r10)     // Catch:{ all -> 0x03a9 }
            r2.A02()     // Catch:{ all -> 0x03a9 }
            goto L_0x0395
        L_0x033f:
            boolean r0 = r15.hasNext()     // Catch:{ all -> 0x03a9 }
            if (r0 == 0) goto L_0x039d
            int r1 = r5.size()     // Catch:{ all -> 0x03a9 }
            r0 = 5
            if (r1 >= r0) goto L_0x039d
            boolean r0 = X.AnonymousClass1QB.A05(r6)     // Catch:{ all -> 0x03a9 }
            if (r0 != 0) goto L_0x0338
            java.util.Map$Entry r0 = X.AnonymousClass000.A16(r15)     // Catch:{ all -> 0x03a9 }
            java.lang.String r1 = X.C17880vN.A0x(r0)     // Catch:{ all -> 0x03a9 }
            boolean r0 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x03a9 }
            r12 = 0
            if (r0 != 0) goto L_0x0385
            java.lang.String r0 = "0"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x03a9 }
            if (r0 != 0) goto L_0x0385
            r0 = 36
            long r0 = java.lang.Long.parseLong(r1, r0)     // Catch:{ Exception -> 0x037d }
            X.1DL r14 = r3.A09     // Catch:{ all -> 0x03a9 }
            java.lang.Class<X.1BI> r13 = X.AnonymousClass1BI.class
            r11 = 10
            long r0 = r0 - r11
            com.whatsapp.jid.Jid r12 = r14.A0E(r13, r0)     // Catch:{ all -> 0x03a9 }
            X.1BI r12 = (X.AnonymousClass1BI) r12     // Catch:{ all -> 0x03a9 }
            goto L_0x0385
        L_0x037d:
            r11 = move-exception
            X.190 r1 = r3.A01     // Catch:{ all -> 0x03a9 }
            java.lang.String r0 = "ftsMessageStore/corrupt_db"
            r1.A0E(r0, r12, r11)     // Catch:{ all -> 0x03a9 }
        L_0x0385:
            boolean r0 = X.C22971Dz.A0Y(r12)     // Catch:{ all -> 0x03a9 }
            if (r0 == 0) goto L_0x033f
            X.1Nf r0 = r3.A07     // Catch:{ all -> 0x03a9 }
            X.1E7 r0 = r0.A01(r12)     // Catch:{ all -> 0x03a9 }
            r5.add(r0)     // Catch:{ all -> 0x03a9 }
            goto L_0x033f
        L_0x0395:
            r9.close()     // Catch:{ all -> 0x03b3 }
            r18.close()     // Catch:{ SQLiteDatabaseCorruptException -> 0x03d3, SQLiteException -> 0x03c3, 1QC -> 0x03dc, Exception -> 0x03bd }
            goto L_0x01b8
        L_0x039d:
            java.lang.String r0 = "lookup"
            r2.A03(r0)     // Catch:{ all -> 0x03a9 }
            r9.close()     // Catch:{ all -> 0x03b3 }
            r18.close()     // Catch:{ SQLiteDatabaseCorruptException -> 0x03d3, SQLiteException -> 0x03c3, 1QC -> 0x03dc, Exception -> 0x03bd }
            goto L_0x03dc
        L_0x03a9:
            r1 = move-exception
            r9.close()     // Catch:{ all -> 0x03ae }
            goto L_0x03b2
        L_0x03ae:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x03b3 }
        L_0x03b2:
            throw r1     // Catch:{ all -> 0x03b3 }
        L_0x03b3:
            r1 = move-exception
            r18.close()     // Catch:{ all -> 0x03b8 }
            goto L_0x03bc
        L_0x03b8:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ SQLiteDatabaseCorruptException -> 0x03d3, SQLiteException -> 0x03c3, 1QC -> 0x03dc, Exception -> 0x03bd }
        L_0x03bc:
            throw r1     // Catch:{ SQLiteDatabaseCorruptException -> 0x03d3, SQLiteException -> 0x03c3, 1QC -> 0x03dc, Exception -> 0x03bd }
        L_0x03bd:
            r1 = move-exception
            boolean r0 = r1 instanceof android.os.OperationCanceledException
            if (r0 == 0) goto L_0x03e7
            goto L_0x03dc
        L_0x03c3:
            r1 = move-exception
            java.lang.String r0 = "FtsMessageStore/search/error"
            com.whatsapp.util.Log.e(r0, r1)
            java.lang.String r0 = "error"
            r2.A03(r0)
            r2.A02()
            goto L_0x01b8
        L_0x03d3:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)
            X.1Cn r0 = r3.A0B
            r0.A03()
        L_0x03dc:
            java.lang.String r0 = "complete"
            goto L_0x01b2
        L_0x03e0:
            if (r2 != 0) goto L_0x03f1
            java.util.HashSet r2 = X.C17880vN.A12()
            goto L_0x03f1
        L_0x03e7:
            throw r1
        L_0x03e8:
            java.util.ArrayList r5 = X.AnonymousClass000.A13()
            java.util.Set r2 = java.util.Collections.EMPTY_SET
            goto L_0x03f6
        L_0x03ef:
            java.util.Set r2 = java.util.Collections.EMPTY_SET
        L_0x03f1:
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r4.A0E(r0)
        L_0x03f6:
            X.6ep r3 = new X.6ep
            r3.<init>(r5, r2)
            return r3
        L_0x03fc:
            java.lang.Object r8 = r2.A01
            X.6q8 r8 = (X.C134156q8) r8
            X.COf r1 = (X.C24887COf) r1
            X.6ku r0 = r8.A06
            r2 = 2
            X.6ua r23 = r0.A00(r2)
            r23.A02()
            X.1yT r12 = r1.A00
            r8.A0I = r12
            long r18 = android.os.SystemClock.uptimeMillis()
            X.1DT r0 = r8.A04
            r32 = r0
            java.lang.Boolean r3 = java.lang.Boolean.TRUE
            r0.A0E(r3)
            java.util.concurrent.atomic.AtomicBoolean r0 = r8.A0G
            r31 = r0
            r3 = 1
            r0.set(r3)
            java.lang.Object r7 = r1.A01
            X.1jz r7 = (X.C34141jz) r7
            int r0 = r7.A00
            r30 = r0
            X.1Dg r0 = r8.A01
            java.lang.Object r3 = r0.A06()
            X.6yD r3 = (X.C139096yD) r3
            int r6 = X.C137386vN.A00(r2)
            X.19Y r5 = r8.A0C
            r4 = 926875649(0x373f0001, float:1.1384488E-5)
            r5.markerStart(r4, r6)
            java.lang.String r1 = "page"
            int r0 = r7.A00
            r5.markerAnnotate((int) r4, (int) r6, (java.lang.String) r1, (int) r0)
            java.lang.String r1 = "type"
            int r0 = r7.A02
            r5.markerAnnotate((int) r4, (int) r6, (java.lang.String) r1, (int) r0)
            X.1BI r0 = r7.A03
            boolean r1 = X.AnonymousClass000.A1W(r0)
            java.lang.String r0 = "jid"
            r5.markerAnnotate((int) r4, (int) r6, (java.lang.String) r0, (boolean) r1)
            A02(r5, r7, r6, r2)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "MessageSearchManager/getMessagesForQuery/"
            r1.append(r0)
            int r0 = X.C108955ca.A03(r7)
            java.lang.String r1 = X.C17880vN.A0t(r1, r0)
            X.1Ez r22 = new X.1Ez
            r0 = r22
            r0.<init>((java.lang.String) r1)
            java.lang.Boolean r0 = r7.A08
            boolean r0 = X.AnonymousClass000.A1W(r0)
            r9 = 0
            java.lang.Boolean r21 = java.lang.Boolean.valueOf(r9)
            if (r0 == 0) goto L_0x04e8
            java.lang.Boolean r0 = r7.A01()
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x04e8
            r0 = 0
            r7.A08 = r0
            r4 = 1
        L_0x0490:
            X.1QB r2 = r8.A09
            java.lang.Integer r14 = java.lang.Integer.valueOf(r6)
            android.util.Pair r13 = r2.A08(r12, r7, r14)
            int r1 = X.C108965cb.A01(r13)
            r0 = -2
            if (r1 != r0) goto L_0x04a7
            r7.A0F = r9
            android.util.Pair r13 = r2.A08(r12, r7, r14)
        L_0x04a7:
            int r1 = X.C108965cb.A01(r13)
            if (r1 == 0) goto L_0x04b2
            r0 = -3
            r20 = 0
            if (r1 != r0) goto L_0x04b4
        L_0x04b2:
            r20 = 1
        L_0x04b4:
            java.lang.Object r0 = r13.second
            java.util.List r0 = (java.util.List) r0
            java.util.Iterator r2 = r0.iterator()
            java.lang.String r0 = "search"
            X.C137386vN.A01(r5, r14, r0)
        L_0x04c1:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x04ea
            X.206 r1 = X.C17880vN.A0Y(r2)
            if (r4 == 0) goto L_0x04d5
            boolean r0 = r1.A0q
            if (r0 == 0) goto L_0x04d5
        L_0x04d1:
            r2.remove()
            goto L_0x04c1
        L_0x04d5:
            X.205 r0 = r1.A0v
            X.1BI r0 = r0.A00
            boolean r0 = X.C22971Dz.A0S(r0)
            if (r0 != 0) goto L_0x04d1
            X.1BI r0 = r1.A0K
            boolean r0 = X.C22971Dz.A0S(r0)
            if (r0 == 0) goto L_0x04c1
            goto L_0x04d1
        L_0x04e8:
            r4 = 0
            goto L_0x0490
        L_0x04ea:
            java.lang.String r0 = "remove starred"
            X.C137386vN.A01(r5, r14, r0)
            java.lang.Object r0 = r13.second
            java.util.Collection r0 = (java.util.Collection) r0
            java.util.ArrayList r17 = X.C17880vN.A10(r0)
            java.util.ArrayList r11 = X.AnonymousClass000.A13()
            java.util.ArrayList r10 = X.AnonymousClass000.A13()
            java.util.ArrayList r9 = X.AnonymousClass000.A13()
            java.util.ArrayList r4 = X.AnonymousClass000.A13()
            X.1jz r0 = r8.A0D
            X.77Z r2 = r0.A06
            java.util.Iterator r16 = r17.iterator()
        L_0x050f:
            boolean r0 = r16.hasNext()
            if (r0 == 0) goto L_0x0574
            X.206 r1 = X.C17880vN.A0Y(r16)
            if (r1 == 0) goto L_0x0536
            boolean r0 = r1.A0z
            if (r0 != 0) goto L_0x0536
            X.205 r0 = r1.A0v
            X.1BI r15 = r0.A00
            if (r2 == 0) goto L_0x053a
            if (r15 == 0) goto L_0x053a
            X.2qo r0 = r8.A0E
            X.88w r0 = r0.A01(r2)
            X.C17960vV.A07(r0)
            boolean r0 = r0.BLC(r15)
            if (r0 != 0) goto L_0x053a
        L_0x0536:
            r16.remove()
            goto L_0x050f
        L_0x053a:
            boolean r0 = r1.A0q
            if (r0 == 0) goto L_0x0565
            r10.add(r1)
        L_0x0541:
            boolean r0 = r1 instanceof X.C438421d
            if (r0 != 0) goto L_0x0555
            boolean r0 = r1 instanceof X.AnonymousClass21X
            if (r0 != 0) goto L_0x0555
            boolean r0 = r1 instanceof X.C441822l
            if (r0 != 0) goto L_0x0555
            boolean r0 = r1 instanceof X.C441322g
            if (r0 != 0) goto L_0x0555
            boolean r0 = r1 instanceof X.C441522i
            if (r0 == 0) goto L_0x050f
        L_0x0555:
            X.21V r1 = (X.AnonymousClass21V) r1
            boolean r0 = r1.A1E()
            if (r0 != 0) goto L_0x0561
            boolean r0 = r1 instanceof X.C441322g
            if (r0 == 0) goto L_0x050f
        L_0x0561:
            r4.add(r1)
            goto L_0x050f
        L_0x0565:
            int r0 = r1.A0C()
            r15 = 1
            if (r0 != r15) goto L_0x0570
            r11.add(r1)
            goto L_0x0541
        L_0x0570:
            r9.add(r1)
            goto L_0x0541
        L_0x0574:
            java.lang.String r0 = "filter"
            X.C137386vN.A01(r5, r14, r0)
            if (r3 == 0) goto L_0x0668
            java.util.List r1 = r3.A02
            r0 = r17
            r1.addAll(r0)
            java.util.List r0 = r3.A00
            r0.addAll(r11)
            java.util.List r0 = r3.A03
            r0.addAll(r10)
            java.util.List r0 = r3.A04
            r0.addAll(r9)
            java.util.List r0 = r3.A01
            r0.addAll(r4)
        L_0x0596:
            boolean r0 = r12.A03()
            if (r0 == 0) goto L_0x05d4
            long r8 = r22.A01()
            r1 = 300(0x12c, double:1.48E-321)
            int r0 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x05cc
            r0 = 926875649(0x373f0001, float:1.1384488E-5)
            r5.markerDrop(r0, r6)
        L_0x05ac:
            r23.A01()
            int r0 = X.C108955ca.A03(r7)
            java.lang.Long r5 = X.C17880vN.A0n(r0)
            java.util.List r0 = r3.A02
            java.lang.Long r4 = X.C108975cc.A0Y(r0)
            java.lang.Integer r2 = X.C17880vN.A0h()
        L_0x05c1:
            r1 = r23
            r0 = r21
            r1.A04(r0, r2, r5, r4)
            r23.A03()
            return r3
        L_0x05cc:
            r1 = 4
            r0 = 926875649(0x373f0001, float:1.1384488E-5)
            r5.markerEnd(r0, r6, r1)
            goto L_0x05ac
        L_0x05d4:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "found: "
            r1.append(r0)
            java.lang.Object r0 = r13.first
            r1.append(r0)
            java.lang.String r0 = "|:"
            r1.append(r0)
            java.lang.Object r0 = r13.second
            java.util.List r0 = (java.util.List) r0
            int r0 = r0.size()
            java.lang.String r1 = X.C17880vN.A0t(r1, r0)
            r0 = r22
            r0.A03(r1)
            r22.A02()
            X.1DT r1 = r8.A03
            if (r20 == 0) goto L_0x0662
            r0 = -1
            X.AnonymousClass3MX.A1K(r1, r0)
            java.lang.Boolean r0 = r7.A01()
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x0614
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            r0 = r32
            r0.A0E(r1)
        L_0x0614:
            r2 = 0
            r0 = r31
            r0.set(r2)
            r9 = 2
            r0 = 926875649(0x373f0001, float:1.1384488E-5)
            r5.markerEnd(r0, r6, r9)
            r23.A01()
            long r4 = android.os.SystemClock.uptimeMillis()
            long r4 = r4 - r18
            X.63L r1 = new X.63L
            r1.<init>()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r9)
            r1.A02 = r0
            java.lang.Long r0 = java.lang.Long.valueOf(r4)
            r1.A04 = r0
            java.lang.Boolean r0 = r7.A01()
            r1.A01 = r0
            int r0 = r7.A00
            java.lang.Long r0 = X.C17880vN.A0n(r0)
            r1.A03 = r0
            X.18K r0 = r8.A0B
            r0.CC7(r1)
            int r0 = X.C108955ca.A03(r7)
            java.lang.Long r5 = X.C17880vN.A0n(r0)
            java.util.List r0 = r3.A02
            java.lang.Long r4 = X.C108975cc.A0Y(r0)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            goto L_0x05c1
        L_0x0662:
            r0 = r30
            X.AnonymousClass3MX.A1K(r1, r0)
            goto L_0x0614
        L_0x0668:
            X.6yD r3 = new X.6yD
            r24 = r3
            r25 = r17
            r26 = r11
            r27 = r10
            r28 = r9
            r29 = r4
            r24.<init>(r25, r26, r27, r28, r29)
            goto L_0x0596
        L_0x067b:
            java.lang.Object r11 = r2.A01
            X.6kR r11 = (X.C131056kR) r11
            X.COf r1 = (X.C24887COf) r1
            X.6ku r2 = r11.A08
            r0 = 5
            X.6ua r8 = r2.A00(r0)
            long r13 = android.os.SystemClock.uptimeMillis()
            r8.A02()
            X.1DT r7 = r11.A07
            r6 = 1
            X.AnonymousClass3MY.A1M(r7, r6)
            java.lang.Object r5 = r1.A01
            X.1jz r5 = (X.C34141jz) r5
            X.1yT r10 = r1.A00
            java.util.ArrayList r3 = X.AnonymousClass000.A13()
            r4 = 0
            r10.A02()     // Catch:{ 1QC -> 0x0740 }
            int r0 = r5.A02     // Catch:{ 1QC -> 0x0740 }
            if (r0 != 0) goto L_0x0738
            X.1BI r0 = r5.A03     // Catch:{ 1QC -> 0x0740 }
            if (r0 != 0) goto L_0x0738
            X.77Z r0 = r5.A06     // Catch:{ 1QC -> 0x0740 }
            if (r0 != 0) goto L_0x0738
            java.util.List r0 = r5.A04()     // Catch:{ 1QC -> 0x0740 }
            boolean r0 = X.AnonymousClass000.A1a(r0)     // Catch:{ 1QC -> 0x0740 }
            if (r0 == 0) goto L_0x0738
            java.util.ArrayList r9 = X.AnonymousClass000.A13()     // Catch:{ 1QC -> 0x0740 }
            java.util.List r0 = r5.A04()     // Catch:{ 1QC -> 0x0740 }
            boolean r0 = X.AnonymousClass000.A1a(r0)     // Catch:{ 1QC -> 0x0740 }
            if (r0 == 0) goto L_0x06da
            java.util.List r12 = r5.A04()     // Catch:{ 1QC -> 0x0740 }
            X.C18070vi.A0X(r12)     // Catch:{ 1QC -> 0x0740 }
            X.1Me r2 = r11.A09     // Catch:{ 1QC -> 0x0740 }
            X.6mc r1 = r11.A0A     // Catch:{ 1QC -> 0x0740 }
            X.7Eg r0 = new X.7Eg     // Catch:{ 1QC -> 0x0740 }
            r0.<init>(r2, r1, r12)     // Catch:{ 1QC -> 0x0740 }
            r9.add(r0)     // Catch:{ 1QC -> 0x0740 }
        L_0x06da:
            r10.A02()     // Catch:{ 1QC -> 0x0740 }
            X.6mc r1 = r11.A0A     // Catch:{ 1QC -> 0x0740 }
            java.util.List r0 = r1.A00     // Catch:{ 1QC -> 0x0740 }
            boolean r0 = X.AnonymousClass000.A1X(r0)
            r12 = r0 ^ 1
            java.util.List r0 = r1.A00()     // Catch:{ 1QC -> 0x0740 }
            java.util.Iterator r2 = r0.iterator()     // Catch:{ 1QC -> 0x0740 }
        L_0x06ef:
            boolean r0 = r2.hasNext()     // Catch:{ 1QC -> 0x0740 }
            if (r0 == 0) goto L_0x0710
            X.1E7 r1 = X.C17880vN.A0O(r2)     // Catch:{ 1QC -> 0x0740 }
            r10.A02()     // Catch:{ 1QC -> 0x0740 }
            X.2lf r0 = r1.A0H     // Catch:{ 1QC -> 0x0740 }
            if (r0 == 0) goto L_0x06ef
            X.1BI r0 = X.AnonymousClass1E7.A00(r1)     // Catch:{ 1QC -> 0x0740 }
            if (r0 == 0) goto L_0x06ef
            boolean r0 = X.C25181Nf.A00(r0, r9)     // Catch:{ 1QC -> 0x0740 }
            if (r0 == 0) goto L_0x06ef
            r3.add(r1)     // Catch:{ 1QC -> 0x0740 }
            goto L_0x06ef
        L_0x0710:
            r8.A01()     // Catch:{ 1QC -> 0x0740 }
            long r9 = android.os.SystemClock.uptimeMillis()     // Catch:{ 1QC -> 0x0740 }
            long r9 = r9 - r13
            X.63L r2 = new X.63L     // Catch:{ 1QC -> 0x0740 }
            r2.<init>()     // Catch:{ 1QC -> 0x0740 }
            java.lang.Integer r0 = X.C17880vN.A0l()     // Catch:{ 1QC -> 0x0740 }
            r2.A02 = r0     // Catch:{ 1QC -> 0x0740 }
            java.lang.Long r0 = java.lang.Long.valueOf(r9)     // Catch:{ 1QC -> 0x0740 }
            r2.A04 = r0     // Catch:{ 1QC -> 0x0740 }
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r12)     // Catch:{ 1QC -> 0x0740 }
            r2.A00 = r1     // Catch:{ 1QC -> 0x0740 }
            X.18K r0 = r11.A0B     // Catch:{ 1QC -> 0x0740 }
            r0.CC7(r2)     // Catch:{ 1QC -> 0x0740 }
            A03(r5, r8, r1, r3, r4)     // Catch:{ 1QC -> 0x0740 }
            goto L_0x0752
        L_0x0738:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r4)     // Catch:{ 1QC -> 0x0740 }
            r7.A0E(r0)     // Catch:{ 1QC -> 0x0740 }
            goto L_0x0756
        L_0x0740:
            r8.A01()     // Catch:{ all -> 0x075a }
            X.6mc r0 = r11.A0A     // Catch:{ all -> 0x075a }
            java.util.List r0 = r0.A00     // Catch:{ all -> 0x075a }
            boolean r0 = X.AnonymousClass000.A1X(r0)
            java.lang.Boolean r0 = X.C108945cZ.A1A(r0)     // Catch:{ all -> 0x075a }
            A03(r5, r8, r0, r3, r6)     // Catch:{ all -> 0x075a }
        L_0x0752:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r4)
        L_0x0756:
            r7.A0E(r0)
            return r3
        L_0x075a:
            r0 = move-exception
            X.AnonymousClass3MY.A1M(r7, r4)
            throw r0
        L_0x075f:
            java.lang.Object r2 = r2.A01
            X.6k7 r2 = (X.C130856k7) r2
            X.COf r1 = (X.C24887COf) r1
            java.lang.String r23 = "found groups in common"
            java.lang.String r9 = "filtered contacts"
            X.6ku r0 = r2.A04
            r3 = 3
            X.6ua r6 = r0.A00(r3)
            r6.A02()
            long r21 = android.os.SystemClock.uptimeMillis()
            X.1DT r8 = r2.A03
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r8.A0E(r0)
            java.lang.Object r5 = r1.A01
            X.6iQ r5 = (X.C129826iQ) r5
            int r4 = X.C137386vN.A00(r3)
            X.1yT r0 = r1.A00
            r24 = r0
            java.util.HashSet r1 = X.C17880vN.A12()
            java.util.Set r0 = r5.A02
            r7 = 0
            if (r0 == 0) goto L_0x07bc
            int r3 = r0.size()
        L_0x0797:
            java.util.List r0 = r5.A01
            if (r0 == 0) goto L_0x079f
            int r7 = r0.size()
        L_0x079f:
            int r3 = r3 + r7
            if (r3 == 0) goto L_0x07d4
            r0 = 10
            if (r3 > r0) goto L_0x07d4
            java.util.Set r0 = r5.A02
            if (r0 == 0) goto L_0x07be
            java.util.Iterator r3 = r0.iterator()
        L_0x07ae:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x07be
            java.lang.Object r0 = r3.next()
            r1.add(r0)
            goto L_0x07ae
        L_0x07bc:
            r3 = 0
            goto L_0x0797
        L_0x07be:
            java.util.List r0 = r5.A01
            if (r0 == 0) goto L_0x07d4
            java.util.Iterator r3 = r0.iterator()
        L_0x07c6:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x07d4
            X.1BI r0 = X.C72453Mb.A0l(r3)
            r1.add(r0)
            goto L_0x07c6
        L_0x07d4:
            java.lang.StringBuilder r3 = X.AnonymousClass000.A10()
            java.lang.String r0 = "GroupSearchManager/getGroupsForQuery/"
            X.C17890vO.A14(r0, r3, r1)
            java.lang.String r0 = r3.toString()
            X.1Ez r7 = new X.1Ez
            r7.<init>((java.lang.String) r0)
            java.util.ArrayList r3 = X.AnonymousClass000.A13()
            int r0 = r5.A00
            if (r0 != 0) goto L_0x0a22
            boolean r0 = r5.A03
            if (r0 != 0) goto L_0x0a22
            r20 = 0
            boolean r0 = r1.isEmpty()     // Catch:{ 1QC -> 0x09c9 }
            if (r0 == 0) goto L_0x0811
            java.lang.String r0 = "empty"
            r7.A03(r0)     // Catch:{ 1QC -> 0x09c9 }
            r7.A02()     // Catch:{ 1QC -> 0x09c9 }
            X.19Y r1 = r2.A07     // Catch:{ 1QC -> 0x09c9 }
            r0 = 926875649(0x373f0001, float:1.1384488E-5)
            r1.markerDrop(r0, r4)     // Catch:{ 1QC -> 0x09c9 }
            java.lang.Boolean r0 = java.lang.Boolean.FALSE     // Catch:{ 1QC -> 0x09c9 }
            r8.A0E(r0)     // Catch:{ 1QC -> 0x09c9 }
            goto L_0x0a19
        L_0x0811:
            r7.A03(r9)     // Catch:{ 1QC -> 0x09c9 }
            X.19Y r10 = r2.A07     // Catch:{ 1QC -> 0x09c9 }
            java.lang.Integer r19 = java.lang.Integer.valueOf(r4)     // Catch:{ 1QC -> 0x09c9 }
            r0 = r19
            X.C137386vN.A01(r10, r0, r9)     // Catch:{ 1QC -> 0x09c9 }
            r24.A02()     // Catch:{ 1QC -> 0x09c9 }
            X.1UL r14 = r2.A06     // Catch:{ 1QC -> 0x09c9 }
            int r12 = r2.A00     // Catch:{ 1QC -> 0x09c9 }
            X.11S r9 = r14.A00     // Catch:{ 1QC -> 0x09c9 }
            r9.A0I()     // Catch:{ 1QC -> 0x09c9 }
            X.1E8 r0 = r9.A0D     // Catch:{ 1QC -> 0x09c9 }
            if (r0 == 0) goto L_0x096a
            X.1BI r15 = r0.A0J     // Catch:{ 1QC -> 0x09c9 }
            com.whatsapp.jid.UserJid r15 = (com.whatsapp.jid.UserJid) r15     // Catch:{ 1QC -> 0x09c9 }
            X.1E2 r11 = r9.A09()     // Catch:{ 1QC -> 0x09c9 }
            java.util.HashSet r0 = X.C17880vN.A12()     // Catch:{ 1QC -> 0x09c9 }
            java.util.Iterator r13 = r1.iterator()     // Catch:{ 1QC -> 0x09c9 }
        L_0x083f:
            boolean r1 = r13.hasNext()     // Catch:{ 1QC -> 0x09c9 }
            if (r1 == 0) goto L_0x0859
            com.whatsapp.jid.Jid r9 = X.C17880vN.A0S(r13)     // Catch:{ 1QC -> 0x09c9 }
            boolean r1 = X.C22971Dz.A0Y(r9)     // Catch:{ 1QC -> 0x09c9 }
            if (r1 != 0) goto L_0x0855
            boolean r1 = X.C22971Dz.A0T(r9)     // Catch:{ 1QC -> 0x09c9 }
            if (r1 == 0) goto L_0x083f
        L_0x0855:
            r0.add(r9)     // Catch:{ 1QC -> 0x09c9 }
            goto L_0x083f
        L_0x0859:
            boolean r1 = r0.isEmpty()     // Catch:{ 1QC -> 0x09c9 }
            if (r1 != 0) goto L_0x096a
            r24.A02()     // Catch:{ 1QC -> 0x09c9 }
            java.util.HashMap r18 = X.C17880vN.A11()     // Catch:{ 1QC -> 0x09c9 }
            java.util.HashSet r13 = X.C17880vN.A12()     // Catch:{ 1QC -> 0x09c9 }
            java.util.HashSet r1 = X.C17880vN.A12()     // Catch:{ 1QC -> 0x09c9 }
            java.util.Iterator r17 = r0.iterator()     // Catch:{ 1QC -> 0x09c9 }
        L_0x0872:
            boolean r0 = r17.hasNext()     // Catch:{ 1QC -> 0x09c9 }
            if (r0 == 0) goto L_0x08a2
            java.lang.Object r9 = r17.next()     // Catch:{ 1QC -> 0x09c9 }
            com.whatsapp.jid.UserJid r9 = (com.whatsapp.jid.UserJid) r9     // Catch:{ 1QC -> 0x09c9 }
            X.1Ln r0 = r14.A05     // Catch:{ 1QC -> 0x09c9 }
            com.whatsapp.jid.UserJid r0 = r0.A0F(r9)     // Catch:{ 1QC -> 0x09c9 }
            boolean r16 = X.C22971Dz.A0U(r9)     // Catch:{ 1QC -> 0x09c9 }
            if (r16 == 0) goto L_0x0893
            r1.add(r9)     // Catch:{ 1QC -> 0x09c9 }
            if (r0 == 0) goto L_0x0872
            r13.add(r0)     // Catch:{ 1QC -> 0x09c9 }
            goto L_0x0872
        L_0x0893:
            boolean r16 = X.C22971Dz.A0Y(r9)     // Catch:{ 1QC -> 0x09c9 }
            if (r16 == 0) goto L_0x0872
            r13.add(r9)     // Catch:{ 1QC -> 0x09c9 }
            if (r0 == 0) goto L_0x0872
            r1.add(r0)     // Catch:{ 1QC -> 0x09c9 }
            goto L_0x0872
        L_0x08a2:
            java.util.HashMap r9 = X.C17880vN.A11()     // Catch:{ 1QC -> 0x09c9 }
            boolean r0 = r13.isEmpty()     // Catch:{ 1QC -> 0x09c9 }
            if (r0 != 0) goto L_0x08de
            if (r15 == 0) goto L_0x08de
            X.1MZ r0 = r14.A03     // Catch:{ 1QC -> 0x09c9 }
            X.1MW r0 = r0.A08     // Catch:{ 1QC -> 0x09c9 }
            java.util.HashMap r0 = r0.A0E(r15, r13, r12)     // Catch:{ 1QC -> 0x09c9 }
            java.util.Iterator r16 = X.C17890vO.A0i(r0)     // Catch:{ 1QC -> 0x09c9 }
        L_0x08ba:
            boolean r0 = r16.hasNext()     // Catch:{ 1QC -> 0x09c9 }
            if (r0 == 0) goto L_0x08de
            java.util.Map$Entry r13 = X.AnonymousClass000.A16(r16)     // Catch:{ 1QC -> 0x09c9 }
            X.00H r0 = r14.A06     // Catch:{ 1QC -> 0x09c9 }
            java.lang.Object r0 = r0.get()     // Catch:{ 1QC -> 0x09c9 }
            X.2mo r0 = (X.C59742mo) r0     // Catch:{ 1QC -> 0x09c9 }
            java.lang.Object r15 = r13.getKey()     // Catch:{ 1QC -> 0x09c9 }
            X.1BI r15 = (X.AnonymousClass1BI) r15     // Catch:{ 1QC -> 0x09c9 }
            X.1CJ r0 = r0.A02     // Catch:{ 1QC -> 0x09c9 }
            boolean r0 = r0.A0R(r15)     // Catch:{ 1QC -> 0x09c9 }
            if (r0 != 0) goto L_0x08ba
            X.C108985cd.A1R(r9, r13)     // Catch:{ 1QC -> 0x09c9 }
            goto L_0x08ba
        L_0x08de:
            r24.A02()     // Catch:{ 1QC -> 0x09c9 }
            boolean r0 = r1.isEmpty()     // Catch:{ 1QC -> 0x09c9 }
            if (r0 != 0) goto L_0x091c
            if (r11 == 0) goto L_0x091c
            X.1MZ r0 = r14.A03     // Catch:{ 1QC -> 0x09c9 }
            X.1MW r0 = r0.A08     // Catch:{ 1QC -> 0x09c9 }
            java.util.HashMap r0 = r0.A0E(r11, r1, r12)     // Catch:{ 1QC -> 0x09c9 }
            java.util.Iterator r12 = X.C17890vO.A0i(r0)     // Catch:{ 1QC -> 0x09c9 }
        L_0x08f5:
            boolean r0 = r12.hasNext()     // Catch:{ 1QC -> 0x09c9 }
            if (r0 == 0) goto L_0x091c
            java.util.Map$Entry r11 = X.AnonymousClass000.A16(r12)     // Catch:{ 1QC -> 0x09c9 }
            r24.A02()     // Catch:{ 1QC -> 0x09c9 }
            X.00H r0 = r14.A06     // Catch:{ 1QC -> 0x09c9 }
            java.lang.Object r0 = r0.get()     // Catch:{ 1QC -> 0x09c9 }
            X.2mo r0 = (X.C59742mo) r0     // Catch:{ 1QC -> 0x09c9 }
            java.lang.Object r1 = r11.getKey()     // Catch:{ 1QC -> 0x09c9 }
            X.1BI r1 = (X.AnonymousClass1BI) r1     // Catch:{ 1QC -> 0x09c9 }
            X.1CJ r0 = r0.A02     // Catch:{ 1QC -> 0x09c9 }
            boolean r0 = r0.A0R(r1)     // Catch:{ 1QC -> 0x09c9 }
            if (r0 != 0) goto L_0x08f5
            X.C108985cd.A1R(r9, r11)     // Catch:{ 1QC -> 0x09c9 }
            goto L_0x08f5
        L_0x091c:
            r0 = r18
            r0.putAll(r9)     // Catch:{ 1QC -> 0x09c9 }
            X.1M9 r1 = r14.A01     // Catch:{ 1QC -> 0x09c9 }
            java.util.Set r0 = r18.keySet()     // Catch:{ 1QC -> 0x09c9 }
            java.util.HashMap r13 = r1.A0P(r0)     // Catch:{ 1QC -> 0x09c9 }
            java.util.ArrayList r15 = X.AnonymousClass000.A13()     // Catch:{ 1QC -> 0x09c9 }
            java.util.Iterator r16 = X.C17890vO.A0i(r18)     // Catch:{ 1QC -> 0x09c9 }
        L_0x0933:
            boolean r0 = r16.hasNext()     // Catch:{ 1QC -> 0x09c9 }
            if (r0 == 0) goto L_0x096e
            java.util.Map$Entry r9 = X.AnonymousClass000.A16(r16)     // Catch:{ 1QC -> 0x09c9 }
            r24.A02()     // Catch:{ 1QC -> 0x09c9 }
            java.lang.Object r0 = r9.getKey()     // Catch:{ 1QC -> 0x09c9 }
            java.lang.Object r12 = r13.get(r0)     // Catch:{ 1QC -> 0x09c9 }
            X.1E7 r12 = (X.AnonymousClass1E7) r12     // Catch:{ 1QC -> 0x09c9 }
            X.1R3 r1 = r14.A04     // Catch:{ 1QC -> 0x09c9 }
            X.1BI r0 = r12.A0J     // Catch:{ 1QC -> 0x09c9 }
            if (r0 == 0) goto L_0x0967
            X.206 r0 = r1.A05(r0)     // Catch:{ 1QC -> 0x09c9 }
            if (r0 == 0) goto L_0x0967
            long r0 = r0.A0I     // Catch:{ 1QC -> 0x09c9 }
        L_0x0958:
            java.lang.Object r11 = r9.getValue()     // Catch:{ 1QC -> 0x09c9 }
            java.util.Set r11 = (java.util.Set) r11     // Catch:{ 1QC -> 0x09c9 }
            X.6FH r9 = new X.6FH     // Catch:{ 1QC -> 0x09c9 }
            r9.<init>(r12, r11, r0)     // Catch:{ 1QC -> 0x09c9 }
            r15.add(r9)     // Catch:{ 1QC -> 0x09c9 }
            goto L_0x0933
        L_0x0967:
            r0 = -1
            goto L_0x0958
        L_0x096a:
            java.util.List r15 = java.util.Collections.emptyList()     // Catch:{ 1QC -> 0x09c9 }
        L_0x096e:
            r3.addAll(r15)     // Catch:{ 1QC -> 0x09c9 }
            r0 = r23
            r7.A03(r0)     // Catch:{ 1QC -> 0x09c9 }
            r1 = r0
            r0 = r19
            X.C137386vN.A01(r10, r0, r1)     // Catch:{ 1QC -> 0x09c9 }
            r0 = 32
            X.C147027Rn.A01(r0, r3)     // Catch:{ 1QC -> 0x09c9 }
            long r8 = A00(r8, r10, r6, r7, r4)     // Catch:{ 1QC -> 0x09c9 }
            long r8 = r8 - r21
            X.63L r1 = new X.63L     // Catch:{ 1QC -> 0x09c9 }
            r1.<init>()     // Catch:{ 1QC -> 0x09c9 }
            java.lang.Integer r0 = X.C17880vN.A0j()     // Catch:{ 1QC -> 0x09c9 }
            r1.A02 = r0     // Catch:{ 1QC -> 0x09c9 }
            java.lang.Long r0 = java.lang.Long.valueOf(r8)     // Catch:{ 1QC -> 0x09c9 }
            r1.A04 = r0     // Catch:{ 1QC -> 0x09c9 }
            X.18K r0 = r2.A05     // Catch:{ 1QC -> 0x09c9 }
            r0.CC7(r1)     // Catch:{ 1QC -> 0x09c9 }
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r20)     // Catch:{ 1QC -> 0x09c9 }
            java.util.Set r0 = r5.A02     // Catch:{ 1QC -> 0x09c9 }
            r1 = 0
            if (r0 == 0) goto L_0x09aa
            int r1 = r0.size()     // Catch:{ 1QC -> 0x09c9 }
        L_0x09aa:
            java.util.List r0 = r5.A01     // Catch:{ 1QC -> 0x09c9 }
            if (r0 == 0) goto L_0x09b2
            int r1 = X.C108945cZ.A0A(r0, r1)     // Catch:{ 1QC -> 0x09c9 }
        L_0x09b2:
            java.lang.Long r8 = X.C17880vN.A0n(r1)     // Catch:{ 1QC -> 0x09c9 }
            int r0 = r3.size()     // Catch:{ 1QC -> 0x09c9 }
            java.lang.Long r1 = X.C17880vN.A0n(r0)     // Catch:{ 1QC -> 0x09c9 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r20)     // Catch:{ 1QC -> 0x09c9 }
            r6.A04(r9, r0, r8, r1)     // Catch:{ 1QC -> 0x09c9 }
            r6.A03()     // Catch:{ 1QC -> 0x09c9 }
            goto L_0x0a19
        L_0x09c9:
            java.lang.String r0 = "cancelled"
            r7.A03(r0)     // Catch:{ all -> 0x0a1d }
            long r10 = r7.A01()     // Catch:{ all -> 0x0a1d }
            r8 = 300(0x12c, double:1.48E-321)
            int r0 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r0 >= 0) goto L_0x0a0f
            X.19Y r1 = r2.A07     // Catch:{ all -> 0x0a1d }
            r0 = 926875649(0x373f0001, float:1.1384488E-5)
            r1.markerDrop(r0, r4)     // Catch:{ all -> 0x0a1d }
        L_0x09e0:
            r6.A01()     // Catch:{ all -> 0x0a1d }
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r20)     // Catch:{ all -> 0x0a1d }
            java.util.Set r0 = r5.A02     // Catch:{ all -> 0x0a1d }
            r1 = 0
            if (r0 == 0) goto L_0x09f0
            int r1 = r0.size()     // Catch:{ all -> 0x0a1d }
        L_0x09f0:
            java.util.List r0 = r5.A01     // Catch:{ all -> 0x0a1d }
            if (r0 == 0) goto L_0x09f8
            int r1 = X.C108945cZ.A0A(r0, r1)     // Catch:{ all -> 0x0a1d }
        L_0x09f8:
            java.lang.Long r2 = X.C17880vN.A0n(r1)     // Catch:{ all -> 0x0a1d }
            int r0 = r3.size()     // Catch:{ all -> 0x0a1d }
            java.lang.Long r1 = X.C17880vN.A0n(r0)     // Catch:{ all -> 0x0a1d }
            java.lang.Integer r0 = X.C17880vN.A0h()     // Catch:{ all -> 0x0a1d }
            r6.A04(r4, r0, r2, r1)     // Catch:{ all -> 0x0a1d }
            r6.A03()     // Catch:{ all -> 0x0a1d }
            goto L_0x0a19
        L_0x0a0f:
            X.19Y r2 = r2.A07     // Catch:{ all -> 0x0a1d }
            r1 = 4
            r0 = 926875649(0x373f0001, float:1.1384488E-5)
            r2.markerEnd(r0, r4, r1)     // Catch:{ all -> 0x0a1d }
            goto L_0x09e0
        L_0x0a19:
            r7.A02()
            return r3
        L_0x0a1d:
            r0 = move-exception
            r7.A02()
            throw r0
        L_0x0a22:
            java.lang.String r0 = "empty"
            r7.A03(r0)
            r7.A02()
            X.19Y r1 = r2.A07
            r0 = 926875649(0x373f0001, float:1.1384488E-5)
            r1.markerDrop(r0, r4)
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r8.A0E(r0)
            return r3
        L_0x0a38:
            java.lang.Object r12 = r2.A01
            X.6kQ r12 = (X.C131046kQ) r12
            X.COf r1 = (X.C24887COf) r1
            java.lang.String r13 = "filter"
            X.6ku r0 = r12.A03
            r3 = 0
            java.lang.Boolean r18 = java.lang.Boolean.valueOf(r3)
            java.lang.Integer r11 = java.lang.Integer.valueOf(r3)
            X.6ua r10 = r0.A00(r3)
            r10.A02()
            long r16 = android.os.SystemClock.uptimeMillis()
            X.1DT r9 = r12.A02
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r9.A0E(r0)
            java.lang.Object r8 = r1.A01
            X.1jz r8 = (X.C34141jz) r8
            int r7 = X.C137386vN.A00(r3)
            X.19Y r6 = r12.A0A
            r2 = 926875649(0x373f0001, float:1.1384488E-5)
            r6.markerStart(r2, r7)
            A02(r6, r8, r7, r3)
            X.1yT r0 = r1.A00
            r27 = r0
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "ContactSearchManager/getForContactsQuery/"
            r1.append(r0)
            int r0 = X.C108955ca.A03(r8)
            java.lang.String r0 = X.C17880vN.A0t(r1, r0)
            X.1Ez r5 = new X.1Ez
            r5.<init>((java.lang.String) r0)
            java.util.ArrayList r3 = X.AnonymousClass000.A13()
            r27.A02()     // Catch:{ 1QC -> 0x0bbd }
            int r0 = r8.A02     // Catch:{ 1QC -> 0x0bbd }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ 1QC -> 0x0bbd }
            boolean r0 = r11.equals(r0)     // Catch:{ 1QC -> 0x0bbd }
            if (r0 == 0) goto L_0x0aaf
            X.1BI r0 = r8.A03     // Catch:{ 1QC -> 0x0bbd }
            if (r0 != 0) goto L_0x0aaf
            java.util.List r0 = r8.A04()     // Catch:{ 1QC -> 0x0bbd }
            boolean r0 = X.AnonymousClass000.A1a(r0)     // Catch:{ 1QC -> 0x0bbd }
            if (r0 != 0) goto L_0x0abe
            X.77Z r0 = r8.A06     // Catch:{ 1QC -> 0x0bbd }
            if (r0 != 0) goto L_0x0abe
        L_0x0aaf:
            java.lang.String r0 = "empty"
            r5.A03(r0)     // Catch:{ 1QC -> 0x0bbd }
            r6.markerDrop(r2, r7)     // Catch:{ 1QC -> 0x0bbd }
            java.lang.Boolean r0 = java.lang.Boolean.FALSE     // Catch:{ 1QC -> 0x0bbd }
            r9.A0E(r0)     // Catch:{ 1QC -> 0x0bbd }
            goto L_0x0bea
        L_0x0abe:
            java.util.ArrayList r4 = X.AnonymousClass000.A13()     // Catch:{ 1QC -> 0x0bbd }
            java.util.List r0 = r8.A04()     // Catch:{ 1QC -> 0x0bbd }
            boolean r0 = X.AnonymousClass000.A1a(r0)     // Catch:{ 1QC -> 0x0bbd }
            if (r0 == 0) goto L_0x0ae1
            X.2bJ r0 = r12.A0D     // Catch:{ 1QC -> 0x0bbd }
            r14 = r0
            X.1Nf r0 = r12.A08     // Catch:{ 1QC -> 0x0bbd }
            r2 = r0
            X.1Me r0 = r12.A06     // Catch:{ 1QC -> 0x0bbd }
            r1 = r0
            java.util.List r0 = r8.A04()     // Catch:{ 1QC -> 0x0bbd }
            X.2zJ r15 = new X.2zJ     // Catch:{ 1QC -> 0x0bbd }
            r15.<init>(r1, r2, r14, r0)     // Catch:{ 1QC -> 0x0bbd }
            r4.add(r15)     // Catch:{ 1QC -> 0x0bbd }
        L_0x0ae1:
            X.77Z r1 = r8.A06     // Catch:{ 1QC -> 0x0bbd }
            if (r1 == 0) goto L_0x0aee
            X.2qo r0 = r12.A0C     // Catch:{ 1QC -> 0x0bbd }
            X.88w r0 = r0.A01(r1)     // Catch:{ 1QC -> 0x0bbd }
            r4.add(r0)     // Catch:{ 1QC -> 0x0bbd }
        L_0x0aee:
            r5.A03(r13)     // Catch:{ 1QC -> 0x0bbd }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r7)     // Catch:{ 1QC -> 0x0bbd }
            X.C137386vN.A01(r6, r0, r13)     // Catch:{ 1QC -> 0x0bbd }
            r27.A02()     // Catch:{ 1QC -> 0x0bbd }
            X.1Nf r1 = r12.A08     // Catch:{ 1QC -> 0x0bbd }
            java.util.List r0 = r1.A00     // Catch:{ 1QC -> 0x0bbd }
            boolean r0 = X.AnonymousClass000.A1X(r0)
            r15 = r0 ^ 1
            boolean r0 = X.C60542oC.A01(r8)     // Catch:{ 1QC -> 0x0bbd }
            if (r0 == 0) goto L_0x0b6f
            X.1M9 r2 = r12.A05     // Catch:{ 1QC -> 0x0bbd }
            java.util.ArrayList r1 = X.AnonymousClass000.A13()     // Catch:{ 1QC -> 0x0bbd }
            X.1M2 r0 = r2.A04     // Catch:{ 1QC -> 0x0bbd }
            r21 = 0
            r25 = 1
            r23 = r21
            r24 = r21
            r26 = r21
            r19 = r0
            r20 = r1
            r22 = r21
            X.AnonymousClass1M2.A0C(r19, r20, r21, r22, r23, r24, r25, r26)     // Catch:{ 1QC -> 0x0bbd }
            X.AnonymousClass1M9.A01(r2, r1)     // Catch:{ 1QC -> 0x0bbd }
        L_0x0b29:
            java.util.Iterator r14 = r1.iterator()     // Catch:{ 1QC -> 0x0bbd }
            r2 = 0
        L_0x0b2e:
            boolean r0 = r14.hasNext()     // Catch:{ 1QC -> 0x0bbd }
            if (r0 == 0) goto L_0x0b74
            X.1E7 r1 = X.C17880vN.A0O(r14)     // Catch:{ 1QC -> 0x0bbd }
            r27.A02()     // Catch:{ 1QC -> 0x0bbd }
            X.2lf r0 = r1.A0H     // Catch:{ 1QC -> 0x0bbd }
            if (r0 == 0) goto L_0x0b2e
            X.1BI r13 = X.AnonymousClass1E7.A00(r1)     // Catch:{ 1QC -> 0x0bbd }
            if (r13 == 0) goto L_0x0b2e
            X.1fA r0 = r12.A04     // Catch:{ 1QC -> 0x0bbd }
            boolean r0 = r0.A0M(r13)     // Catch:{ 1QC -> 0x0bbd }
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0b2e
            X.1Nd r0 = r12.A07     // Catch:{ 1QC -> 0x0bbd }
            java.util.ArrayList r0 = r0.A06()     // Catch:{ 1QC -> 0x0bbd }
            boolean r0 = r0.contains(r13)     // Catch:{ 1QC -> 0x0bbd }
            if (r0 != 0) goto L_0x0b2e
            boolean r0 = X.C25181Nf.A00(r13, r4)     // Catch:{ 1QC -> 0x0bbd }
            if (r0 == 0) goto L_0x0b2e
            r3.add(r1)     // Catch:{ 1QC -> 0x0bbd }
            X.1BI r0 = r1.A0J     // Catch:{ 1QC -> 0x0bbd }
            boolean r0 = X.C22971Dz.A0T(r0)     // Catch:{ 1QC -> 0x0bbd }
            if (r0 == 0) goto L_0x0b2e
            int r2 = r2 + 1
            goto L_0x0b2e
        L_0x0b6f:
            java.util.List r1 = r1.A03()     // Catch:{ 1QC -> 0x0bbd }
            goto L_0x0b29
        L_0x0b74:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ 1QC -> 0x0bbd }
            java.lang.String r0 = "found: "
            X.C17890vO.A14(r0, r1, r3)     // Catch:{ 1QC -> 0x0bbd }
            java.lang.String r0 = " | "
            java.lang.String r0 = X.AnonymousClass001.A1I(r0, r1, r2)     // Catch:{ 1QC -> 0x0bbd }
            r5.A03(r0)     // Catch:{ 1QC -> 0x0bbd }
            long r13 = A00(r9, r6, r10, r5, r7)     // Catch:{ 1QC -> 0x0bbd }
            long r13 = r13 - r16
            X.63L r1 = new X.63L     // Catch:{ 1QC -> 0x0bbd }
            r1.<init>()     // Catch:{ 1QC -> 0x0bbd }
            r1.A02 = r11     // Catch:{ 1QC -> 0x0bbd }
            java.lang.Long r0 = java.lang.Long.valueOf(r13)     // Catch:{ 1QC -> 0x0bbd }
            r1.A04 = r0     // Catch:{ 1QC -> 0x0bbd }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r15)     // Catch:{ 1QC -> 0x0bbd }
            r1.A00 = r0     // Catch:{ 1QC -> 0x0bbd }
            X.18K r0 = r12.A09     // Catch:{ 1QC -> 0x0bbd }
            r0.CC7(r1)     // Catch:{ 1QC -> 0x0bbd }
            int r0 = X.C108955ca.A03(r8)     // Catch:{ 1QC -> 0x0bbd }
            java.lang.Long r2 = X.C17880vN.A0n(r0)     // Catch:{ 1QC -> 0x0bbd }
            int r0 = r3.size()     // Catch:{ 1QC -> 0x0bbd }
            java.lang.Long r1 = X.C17880vN.A0n(r0)     // Catch:{ 1QC -> 0x0bbd }
            r0 = r18
            r10.A04(r0, r11, r2, r1)     // Catch:{ 1QC -> 0x0bbd }
            r10.A03()     // Catch:{ 1QC -> 0x0bbd }
            goto L_0x0bea
        L_0x0bbd:
            r10.A01()     // Catch:{ all -> 0x0bee }
            java.lang.String r0 = "cancelled"
            r5.A03(r0)     // Catch:{ all -> 0x0bee }
            long r11 = r5.A01()     // Catch:{ all -> 0x0bee }
            r1 = 300(0x12c, double:1.48E-321)
            int r0 = (r11 > r1 ? 1 : (r11 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x0be2
            r0 = 926875649(0x373f0001, float:1.1384488E-5)
            r6.markerDrop(r0, r7)     // Catch:{ all -> 0x0bee }
        L_0x0bd5:
            r10.A01()     // Catch:{ all -> 0x0bee }
            r1 = 1
            r0 = r18
            A03(r8, r10, r0, r3, r1)     // Catch:{ all -> 0x0bee }
            r10.A03()     // Catch:{ all -> 0x0bee }
            goto L_0x0bea
        L_0x0be2:
            r1 = 4
            r0 = 926875649(0x373f0001, float:1.1384488E-5)
            r6.markerEnd(r0, r7, r1)     // Catch:{ all -> 0x0bee }
            goto L_0x0bd5
        L_0x0bea:
            r5.A02()
            return r3
        L_0x0bee:
            r0 = move-exception
            r5.A02()
            throw r0
        L_0x0bf3:
            java.lang.Object r10 = r2.A01
            X.6kP r10 = (X.C131036kP) r10
            X.COf r1 = (X.C24887COf) r1
            java.lang.String r11 = "filter"
            X.6ku r0 = r10.A04
            r9 = 1
            X.6ua r8 = r0.A00(r9)
            long r19 = android.os.SystemClock.uptimeMillis()
            r8.A02()
            X.1DT r7 = r10.A03
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r7.A0E(r0)
            java.lang.Object r6 = r1.A01
            X.1jz r6 = (X.C34141jz) r6
            int r5 = X.C137386vN.A00(r9)
            X.19Y r4 = r10.A09
            r12 = 926875649(0x373f0001, float:1.1384488E-5)
            r4.markerStart(r12, r5)
            java.lang.String r2 = "type"
            int r0 = r6.A02
            r4.markerAnnotate((int) r12, (int) r5, (java.lang.String) r2, (int) r0)
            X.1BI r0 = r6.A03
            boolean r2 = X.AnonymousClass000.A1W(r0)
            java.lang.String r0 = "jid"
            r4.markerAnnotate((int) r12, (int) r5, (java.lang.String) r0, (boolean) r2)
            A02(r4, r6, r5, r9)
            X.1yT r0 = r1.A00
            r22 = r0
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()
            java.lang.String r13 = "chatSearchManager/getContactsForQuery "
            r2.append(r13)
            java.util.concurrent.atomic.AtomicInteger r0 = r10.A0D
            r21 = r0
            int r0 = r21.getAndIncrement()
            r2.append(r0)
            java.lang.String r1 = "/"
            r2.append(r1)
            int r0 = X.C108955ca.A03(r6)
            java.lang.String r0 = X.C17880vN.A0t(r2, r0)
            X.1Ez r2 = new X.1Ez
            r2.<init>((java.lang.String) r0)
            java.util.ArrayList r3 = X.AnonymousClass000.A13()
            r18 = 0
            java.lang.Integer r17 = java.lang.Integer.valueOf(r18)     // Catch:{ 1QC -> 0x0d88 }
            int r0 = r6.A02     // Catch:{ 1QC -> 0x0d88 }
            java.lang.Integer r14 = java.lang.Integer.valueOf(r0)     // Catch:{ 1QC -> 0x0d88 }
            r0 = r17
            boolean r0 = r0.equals(r14)     // Catch:{ 1QC -> 0x0d88 }
            if (r0 == 0) goto L_0x0c89
            X.1BI r0 = r6.A03     // Catch:{ 1QC -> 0x0d88 }
            if (r0 != 0) goto L_0x0c89
            java.util.List r0 = r6.A04()     // Catch:{ 1QC -> 0x0d88 }
            boolean r0 = X.AnonymousClass000.A1a(r0)     // Catch:{ 1QC -> 0x0d88 }
            if (r0 != 0) goto L_0x0c98
            X.77Z r0 = r6.A06     // Catch:{ 1QC -> 0x0d88 }
            if (r0 != 0) goto L_0x0c98
        L_0x0c89:
            java.lang.String r0 = "empty"
            r2.A03(r0)     // Catch:{ 1QC -> 0x0d88 }
            r4.markerDrop(r12, r5)     // Catch:{ 1QC -> 0x0d88 }
            java.lang.Boolean r0 = java.lang.Boolean.FALSE     // Catch:{ 1QC -> 0x0d88 }
            r7.A0E(r0)     // Catch:{ 1QC -> 0x0d88 }
            goto L_0x0db3
        L_0x0c98:
            java.util.ArrayList r15 = X.AnonymousClass000.A13()     // Catch:{ 1QC -> 0x0d88 }
            X.87u r12 = r10.A0A     // Catch:{ 1QC -> 0x0d88 }
            java.util.List r0 = r6.A04()     // Catch:{ 1QC -> 0x0d88 }
            X.7Eh r12 = r12.BGg(r0)     // Catch:{ 1QC -> 0x0d88 }
            java.util.List r0 = r6.A04()     // Catch:{ 1QC -> 0x0d88 }
            boolean r0 = X.AnonymousClass000.A1a(r0)     // Catch:{ 1QC -> 0x0d88 }
            if (r0 == 0) goto L_0x0cb3
            r15.add(r12)     // Catch:{ 1QC -> 0x0d88 }
        L_0x0cb3:
            X.77Z r14 = r6.A06     // Catch:{ 1QC -> 0x0d88 }
            if (r14 == 0) goto L_0x0cc0
            X.2qo r0 = r10.A0C     // Catch:{ 1QC -> 0x0d88 }
            X.88w r0 = r0.A01(r14)     // Catch:{ 1QC -> 0x0d88 }
            r15.add(r0)     // Catch:{ 1QC -> 0x0d88 }
        L_0x0cc0:
            r2.A03(r11)     // Catch:{ 1QC -> 0x0d88 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)     // Catch:{ 1QC -> 0x0d88 }
            X.C137386vN.A01(r4, r0, r11)     // Catch:{ 1QC -> 0x0d88 }
            r22.A02()     // Catch:{ 1QC -> 0x0d88 }
            X.1Nd r0 = r10.A06     // Catch:{ 1QC -> 0x0d88 }
            java.util.ArrayList r11 = r0.A06()     // Catch:{ 1QC -> 0x0d88 }
            java.lang.String r0 = "get"
            r2.A03(r0)     // Catch:{ 1QC -> 0x0d88 }
            java.util.Iterator r16 = r11.iterator()     // Catch:{ 1QC -> 0x0d88 }
        L_0x0cdc:
            boolean r0 = r16.hasNext()     // Catch:{ 1QC -> 0x0d88 }
            if (r0 == 0) goto L_0x0d0c
            X.1BI r11 = X.C17880vN.A0Q(r16)     // Catch:{ 1QC -> 0x0d88 }
            r22.A02()     // Catch:{ 1QC -> 0x0d88 }
            X.1fA r14 = r10.A05     // Catch:{ 1QC -> 0x0d88 }
            boolean r0 = r14.A0L()     // Catch:{ 1QC -> 0x0d88 }
            if (r0 != 0) goto L_0x0cf2
            goto L_0x0cf9
        L_0x0cf2:
            boolean r0 = r14.A0M(r11)     // Catch:{ 1QC -> 0x0d88 }
            r0 = r0 ^ 1
            goto L_0x0cfa
        L_0x0cf9:
            r0 = 1
        L_0x0cfa:
            if (r0 == 0) goto L_0x0cdc
            boolean r0 = X.C25181Nf.A00(r11, r15)     // Catch:{ 1QC -> 0x0d88 }
            if (r0 == 0) goto L_0x0cdc
            X.1Nf r0 = r10.A07     // Catch:{ 1QC -> 0x0d88 }
            X.1E7 r0 = r0.A01(r11)     // Catch:{ 1QC -> 0x0d88 }
            r3.add(r0)     // Catch:{ 1QC -> 0x0d88 }
            goto L_0x0cdc
        L_0x0d0c:
            java.lang.StringBuilder r11 = X.AnonymousClass000.A10()     // Catch:{ 1QC -> 0x0d88 }
            java.lang.StringBuilder r14 = X.AnonymousClass000.A10()     // Catch:{ 1QC -> 0x0d88 }
            r14.append(r13)     // Catch:{ 1QC -> 0x0d88 }
            int r0 = r21.getAndIncrement()     // Catch:{ 1QC -> 0x0d88 }
            r14.append(r0)     // Catch:{ 1QC -> 0x0d88 }
            r14.append(r1)     // Catch:{ 1QC -> 0x0d88 }
            int r0 = X.C108955ca.A03(r6)     // Catch:{ 1QC -> 0x0d88 }
            java.lang.String r0 = X.C17880vN.A0t(r14, r0)     // Catch:{ 1QC -> 0x0d88 }
            r11.append(r0)     // Catch:{ 1QC -> 0x0d88 }
            java.lang.String r0 = "/breakdown: get:"
            r11.append(r0)     // Catch:{ 1QC -> 0x0d88 }
            long r0 = r12.A00     // Catch:{ 1QC -> 0x0d88 }
            r13 = 1000000(0xf4240, double:4.940656E-318)
            long r0 = r0 / r13
            r11.append(r0)     // Catch:{ 1QC -> 0x0d88 }
            java.lang.String r0 = "; match: "
            r11.append(r0)     // Catch:{ 1QC -> 0x0d88 }
            long r0 = r12.A01     // Catch:{ 1QC -> 0x0d88 }
            long r0 = r0 / r13
            X.C17890vO.A16(r11, r0)     // Catch:{ 1QC -> 0x0d88 }
            long r11 = A00(r7, r4, r8, r2, r5)     // Catch:{ 1QC -> 0x0d88 }
            long r11 = r11 - r19
            X.63L r1 = new X.63L     // Catch:{ 1QC -> 0x0d88 }
            r1.<init>()     // Catch:{ 1QC -> 0x0d88 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r9)     // Catch:{ 1QC -> 0x0d88 }
            r1.A02 = r0     // Catch:{ 1QC -> 0x0d88 }
            java.lang.Long r0 = java.lang.Long.valueOf(r11)     // Catch:{ 1QC -> 0x0d88 }
            r1.A04 = r0     // Catch:{ 1QC -> 0x0d88 }
            boolean r0 = r10.A00     // Catch:{ 1QC -> 0x0d88 }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ 1QC -> 0x0d88 }
            r1.A00 = r0     // Catch:{ 1QC -> 0x0d88 }
            r10.A00 = r9     // Catch:{ 1QC -> 0x0d88 }
            X.18K r0 = r10.A08     // Catch:{ 1QC -> 0x0d88 }
            r0.CC7(r1)     // Catch:{ 1QC -> 0x0d88 }
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r18)     // Catch:{ 1QC -> 0x0d88 }
            int r0 = X.C108955ca.A03(r6)     // Catch:{ 1QC -> 0x0d88 }
            java.lang.Long r7 = X.C17880vN.A0n(r0)     // Catch:{ 1QC -> 0x0d88 }
            int r0 = r3.size()     // Catch:{ 1QC -> 0x0d88 }
            java.lang.Long r1 = X.C17880vN.A0n(r0)     // Catch:{ 1QC -> 0x0d88 }
            r0 = r17
            r8.A04(r10, r0, r7, r1)     // Catch:{ 1QC -> 0x0d88 }
            r8.A03()     // Catch:{ 1QC -> 0x0d88 }
            goto L_0x0db3
        L_0x0d88:
            java.lang.String r0 = "cancelled"
            r2.A03(r0)     // Catch:{ all -> 0x0db7 }
            long r12 = r2.A01()     // Catch:{ all -> 0x0db7 }
            r10 = 300(0x12c, double:1.48E-321)
            int r0 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r0 >= 0) goto L_0x0dab
            r0 = 926875649(0x373f0001, float:1.1384488E-5)
            r4.markerDrop(r0, r5)     // Catch:{ all -> 0x0db7 }
        L_0x0d9d:
            r8.A01()     // Catch:{ all -> 0x0db7 }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r18)     // Catch:{ all -> 0x0db7 }
            A03(r6, r8, r0, r3, r9)     // Catch:{ all -> 0x0db7 }
            r8.A03()     // Catch:{ all -> 0x0db7 }
            goto L_0x0db3
        L_0x0dab:
            r1 = 4
            r0 = 926875649(0x373f0001, float:1.1384488E-5)
            r4.markerEnd(r0, r5, r1)     // Catch:{ all -> 0x0db7 }
            goto L_0x0d9d
        L_0x0db3:
            r2.A02()
            return r3
        L_0x0db7:
            r0 = move-exception
            r2.A02()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1424979r.apply(java.lang.Object):java.lang.Object");
    }

    public static void A02(AnonymousClass19Y r3, C34141jz r4, int i, int i2) {
        r3.markerAnnotate(926875649, i, "token_count", r4.A04().size());
        r3.markerAnnotate(926875649, i, "domain", i2);
    }

    public static void A03(C34141jz r2, C136896ua r3, Boolean bool, AbstractCollection abstractCollection, int i) {
        r3.A04(bool, Integer.valueOf(i), Long.valueOf((long) r2.A02().length()), Long.valueOf((long) abstractCollection.size()));
    }
}
