package X;

import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.Map;

/* renamed from: X.1Mx  reason: invalid class name and case insensitive filesystem */
public final class C25111Mx {
    public final C25131Mz A00;
    public final C25121My A01;
    public final AnonymousClass11P A02;
    public final C19830z4 A03;
    public final C18030ve A04;
    public final C18100vl A05 = new C18110vm(new AnonymousClass3Di(0));
    public final C18100vl A06 = new C18110vm(new AnonymousClass3Di(1));

    /* JADX WARNING: type inference failed for: r0v5, types: [X.1Ly, X.1My] */
    public C25111Mx(C25091Mv r3, AnonymousClass11P r4, C19830z4 r5, C18030ve r6, C24811Lt r7) {
        C18070vi.A0d(r4, 1);
        C18070vi.A0d(r6, 2);
        C18070vi.A0d(r7, 3);
        C18070vi.A0d(r5, 4);
        C18070vi.A0d(r3, 5);
        this.A02 = r4;
        this.A04 = r6;
        this.A03 = r5;
        this.A01 = new C24861Ly(r7);
        this.A00 = r3.BH3("privacytokendatacache", 10);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0049, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        X.CDX.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x004d, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0050, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0051, code lost:
        X.CDX.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0054, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C58962lX A05(com.whatsapp.jid.UserJid r9) {
        /*
            r8 = this;
            r7 = 0
            X.C18070vi.A0d(r9, r7)
            X.1Mz r5 = r8.A00
            java.lang.Object r6 = r5.A0A(r9)
            X.2lX r6 = (X.C58962lX) r6
            if (r6 != 0) goto L_0x005d
            X.1My r0 = r8.A01
            X.1Lt r0 = r0.A00
            X.1at r3 = r0.get()
            r0 = r3
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x004e }
            X.1Ev r4 = r0.A02     // Catch:{ all -> 0x004e }
            java.lang.String r2 = "SELECT incoming_tc_token, incoming_tc_token_timestamp FROM wa_trusted_contacts WHERE jid=?"
            r0 = 1
            java.lang.String[] r1 = new java.lang.String[r0]     // Catch:{ all -> 0x004e }
            java.lang.String r0 = r9.getRawString()     // Catch:{ all -> 0x004e }
            r1[r7] = r0     // Catch:{ all -> 0x004e }
            java.lang.String r0 = "GET_RECEIVED_TOKEN_AND_TIMESTAMP_BY_JID"
            android.database.Cursor r2 = r4.A0A(r2, r0, r1)     // Catch:{ all -> 0x004e }
            boolean r0 = r2.moveToNext()     // Catch:{ all -> 0x0047 }
            r6 = 0
            if (r0 == 0) goto L_0x0043
            java.lang.String r0 = "incoming_tc_token"
            int r1 = r2.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0047 }
            java.lang.String r0 = "incoming_tc_token_timestamp"
            int r0 = r2.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0047 }
            X.2lX r6 = X.C25121My.A04(r2, r1, r0)     // Catch:{ all -> 0x0047 }
        L_0x0043:
            r2.close()     // Catch:{ all -> 0x004e }
            goto L_0x0055
        L_0x0047:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0049 }
        L_0x0049:
            r0 = move-exception
            X.CDX.A00(r2, r1)     // Catch:{ all -> 0x004e }
            throw r0     // Catch:{ all -> 0x004e }
        L_0x004e:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0050 }
        L_0x0050:
            r0 = move-exception
            X.CDX.A00(r3, r1)
            throw r0
        L_0x0055:
            r3.close()
            if (r6 == 0) goto L_0x005d
            r5.A0F(r9, r6)
        L_0x005d:
            r5 = 0
            if (r6 != 0) goto L_0x0061
            return r5
        L_0x0061:
            long r3 = r6.A00
            long r1 = r8.A04()
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x006c
            return r5
        L_0x006c:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C25111Mx.A05(com.whatsapp.jid.UserJid):X.2lX");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x008c, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
        X.CDX.A00(r6, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0090, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0093, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0094, code lost:
        X.CDX.A00(r5, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0097, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Integer A07(com.whatsapp.jid.UserJid r13, byte[] r14, long r15) {
        /*
            r12 = this;
            r9 = 0
            X.C18070vi.A0d(r13, r9)
            r0 = r15
            A02(r12, r13, r0)
            X.1Mz r2 = r12.A00
            r2.A0E(r13)
            X.1My r5 = r12.A01
            java.lang.String r4 = "jid"
            r10 = 1
            r2 = 3
            android.content.ContentValues r3 = new android.content.ContentValues
            r3.<init>(r2)
            java.lang.String r2 = r13.getRawString()
            r3.put(r4, r2)
            java.lang.String r2 = "incoming_tc_token"
            r3.put(r2, r14)
            java.lang.String r4 = "incoming_tc_token_timestamp"
            java.lang.Long r2 = java.lang.Long.valueOf(r0)
            r3.put(r4, r2)
            X.1Lt r2 = r5.A00
            X.1au r5 = r2.A06()
            X.1xA r6 = r5.BD0()     // Catch:{ all -> 0x0091 }
            java.lang.String r4 = "wa_trusted_contacts"
            java.lang.String r8 = "jid = ? AND incoming_tc_token_timestamp < ? "
            r2 = 2
            java.lang.String[] r7 = new java.lang.String[r2]     // Catch:{ all -> 0x008a }
            java.lang.String r2 = r13.getRawString()     // Catch:{ all -> 0x008a }
            r11 = 0
            r7[r9] = r2     // Catch:{ all -> 0x008a }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x008a }
            r7[r10] = r0     // Catch:{ all -> 0x008a }
            long r9 = X.C24861Ly.A01(r3, r5, r4, r8, r7)     // Catch:{ all -> 0x008a }
            r7 = 0
            int r0 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r0 == 0) goto L_0x005c
            r1 = 1
            int r0 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x005d
        L_0x005c:
            r11 = 1
        L_0x005d:
            X.C17960vV.A0D(r11)     // Catch:{ all -> 0x008a }
            int r0 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r0 != 0) goto L_0x0065
            goto L_0x0068
        L_0x0065:
            java.lang.Integer r0 = X.AnonymousClass00R.A01     // Catch:{ all -> 0x008a }
            goto L_0x007c
        L_0x0068:
            r0 = r5
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x008a }
            X.1Ev r2 = r0.A02     // Catch:{ all -> 0x008a }
            java.lang.String r1 = "PrivacyTokenStore/insert_wa_trusted_contacts"
            r0 = 4
            long r3 = r2.A09(r4, r1, r3, r0)     // Catch:{ all -> 0x008a }
            r1 = -1
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x0080
            java.lang.Integer r0 = X.AnonymousClass00R.A0C     // Catch:{ all -> 0x008a }
        L_0x007c:
            r6.A00()     // Catch:{ all -> 0x008a }
            goto L_0x0083
        L_0x0080:
            java.lang.Integer r0 = X.AnonymousClass00R.A00     // Catch:{ all -> 0x008a }
            goto L_0x007c
        L_0x0083:
            r6.close()     // Catch:{ all -> 0x0091 }
            r5.close()
            return r0
        L_0x008a:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x008c }
        L_0x008c:
            r0 = move-exception
            X.CDX.A00(r6, r1)     // Catch:{ all -> 0x0091 }
            throw r0     // Catch:{ all -> 0x0091 }
        L_0x0091:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0093 }
        L_0x0093:
            r0 = move-exception
            X.CDX.A00(r5, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C25111Mx.A07(com.whatsapp.jid.UserJid, byte[], long):java.lang.Integer");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00c9, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
        X.CDX.A00(r7, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00cd, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00d0, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00d1, code lost:
        X.CDX.A00(r5, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00d4, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0A(com.whatsapp.jid.UserJid r20, long r21) {
        /*
            r19 = this;
            r15 = 0
            r6 = r20
            X.C18070vi.A0d(r6, r15)
            r8 = r19
            X.1My r0 = r8.A01
            java.lang.String r1 = "real_issue_timestamp"
            java.lang.String r12 = "sent_tc_token_timestamp"
            java.lang.String r11 = "jid"
            X.1Lt r0 = r0.A00
            X.1au r5 = r0.A06()
            X.1xA r7 = r5.BD0()     // Catch:{ all -> 0x00ce }
            r13 = 2
            android.content.ContentValues r9 = new android.content.ContentValues     // Catch:{ all -> 0x00c7 }
            r9.<init>(r13)     // Catch:{ all -> 0x00c7 }
            java.lang.Long r10 = java.lang.Long.valueOf(r21)     // Catch:{ all -> 0x00c7 }
            r9.put(r12, r10)     // Catch:{ all -> 0x00c7 }
            r9.putNull(r1)     // Catch:{ all -> 0x00c7 }
            java.lang.String r4 = "wa_trusted_contacts_send"
            java.lang.String r3 = "jid = ? AND sent_tc_token_timestamp <= ?"
            java.lang.String[] r2 = new java.lang.String[r13]     // Catch:{ all -> 0x00c7 }
            java.lang.String r0 = r6.getRawString()     // Catch:{ all -> 0x00c7 }
            r2[r15] = r0     // Catch:{ all -> 0x00c7 }
            java.lang.String r18 = java.lang.String.valueOf(r21)     // Catch:{ all -> 0x00c7 }
            r0 = 1
            r2[r0] = r18     // Catch:{ all -> 0x00c7 }
            r14 = 1
            long r2 = X.C24861Ly.A01(r9, r5, r4, r3, r2)     // Catch:{ all -> 0x00c7 }
            java.lang.String r9 = "Should have only one row per JID"
            r16 = 1
            int r0 = (r2 > r16 ? 1 : (r2 == r16 ? 0 : -1))
            if (r0 < 0) goto L_0x005a
            int r0 = (r2 > r16 ? 1 : (r2 == r16 ? 0 : -1))
            if (r0 == 0) goto L_0x0051
            r14 = 0
        L_0x0051:
            X.C17960vV.A0F(r14, r9)     // Catch:{ all -> 0x00c7 }
            r7.A00()     // Catch:{ all -> 0x00c7 }
            java.lang.Integer r1 = X.AnonymousClass00R.A01     // Catch:{ all -> 0x00c7 }
            goto L_0x00ae
        L_0x005a:
            android.content.ContentValues r3 = new android.content.ContentValues     // Catch:{ all -> 0x00c7 }
            r3.<init>(r14)     // Catch:{ all -> 0x00c7 }
            r3.put(r1, r10)     // Catch:{ all -> 0x00c7 }
            java.lang.String r2 = "jid = ? AND real_issue_timestamp IS NOT NULL AND real_issue_timestamp <= ?"
            java.lang.String[] r1 = new java.lang.String[r13]     // Catch:{ all -> 0x00c7 }
            java.lang.String r0 = r6.getRawString()     // Catch:{ all -> 0x00c7 }
            r1[r15] = r0     // Catch:{ all -> 0x00c7 }
            r1[r14] = r18     // Catch:{ all -> 0x00c7 }
            long r2 = X.C24861Ly.A01(r3, r5, r4, r2, r1)     // Catch:{ all -> 0x00c7 }
            int r0 = (r2 > r16 ? 1 : (r2 == r16 ? 0 : -1))
            if (r0 < 0) goto L_0x0085
            int r1 = (r2 > r16 ? 1 : (r2 == r16 ? 0 : -1))
            r0 = 0
            if (r1 != 0) goto L_0x007c
            r0 = 1
        L_0x007c:
            X.C17960vV.A0F(r0, r9)     // Catch:{ all -> 0x00c7 }
            r7.A00()     // Catch:{ all -> 0x00c7 }
            java.lang.Integer r1 = X.AnonymousClass00R.A01     // Catch:{ all -> 0x00c7 }
            goto L_0x00ae
        L_0x0085:
            android.content.ContentValues r3 = new android.content.ContentValues     // Catch:{ all -> 0x00c7 }
            r3.<init>(r13)     // Catch:{ all -> 0x00c7 }
            java.lang.String r0 = r6.getRawString()     // Catch:{ all -> 0x00c7 }
            r3.put(r11, r0)     // Catch:{ all -> 0x00c7 }
            r3.put(r12, r10)     // Catch:{ all -> 0x00c7 }
            r0 = r5
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x00c7 }
            X.1Ev r2 = r0.A02     // Catch:{ all -> 0x00c7 }
            java.lang.String r1 = "PrivacyTokenStore/insert_wa_trusted_contacts_send"
            r0 = 4
            long r3 = r2.A09(r4, r1, r3, r0)     // Catch:{ all -> 0x00c7 }
            r7.A00()     // Catch:{ all -> 0x00c7 }
            r1 = -1
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x00ac
            java.lang.Integer r1 = X.AnonymousClass00R.A00     // Catch:{ all -> 0x00c7 }
            goto L_0x00ae
        L_0x00ac:
            java.lang.Integer r1 = X.AnonymousClass00R.A0C     // Catch:{ all -> 0x00c7 }
        L_0x00ae:
            r7.close()     // Catch:{ all -> 0x00ce }
            r5.close()
            java.lang.Integer r0 = X.AnonymousClass00R.A0C
            if (r1 == r0) goto L_0x00c6
            X.0vl r0 = r8.A05
            java.lang.Object r0 = r0.getValue()
            X.C18070vi.A0X(r0)
            java.util.Map r0 = (java.util.Map) r0
            r0.remove(r6)
        L_0x00c6:
            return
        L_0x00c7:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00c9 }
        L_0x00c9:
            r0 = move-exception
            X.CDX.A00(r7, r1)     // Catch:{ all -> 0x00ce }
            throw r0     // Catch:{ all -> 0x00ce }
        L_0x00ce:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00d0 }
        L_0x00d0:
            r0 = move-exception
            X.CDX.A00(r5, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C25111Mx.A0A(com.whatsapp.jid.UserJid, long):void");
    }

    public static final long A00(C25111Mx r12, long j, long j2) {
        long A052 = r12.A02.A05() / 1000;
        long j3 = A052 - 15724800;
        long j4 = j;
        long j5 = j2;
        if (j <= 0 || j2 <= 0) {
            StringBuilder sb = new StringBuilder();
            sb.append("Bad bucket configuration: numValidBuckets = ");
            sb.append(j5);
            sb.append(", bucketLengthSec = ");
            sb.append(j);
            Log.e(sb.toString());
            return j3;
        }
        long j6 = A052 / j;
        long j7 = j5 - 1;
        if (j6 < j7) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Strange bucket configuration: currentBucket = ");
            sb2.append(j6);
            sb2.append(", currentTimeSec = ");
            sb2.append(A052);
            sb2.append(", numValidBuckets = ");
            sb2.append(j5);
            sb2.append(", bucketLengthSec = ");
            sb2.append(j4);
            Log.e(sb2.toString());
        }
        return Math.max((j6 - j7) * j4, j3);
    }

    public static final C54192dk A01(C25111Mx r11, UserJid userJid) {
        Object value = r11.A06.getValue();
        C18070vi.A0X(value);
        Map map = (Map) value;
        C54192dk r6 = (C54192dk) map.get(userJid);
        if (r6 != null) {
            Integer num = r6.A01;
            if (num == AnonymousClass00R.A01 || num == AnonymousClass00R.A00) {
                if (r6.A00 > r11.A02.A05() - 21600000) {
                    return r6;
                }
            } else if (num == AnonymousClass00R.A0C && r6.A00 >= r11.A04() * 1000) {
                return r6;
            }
            map.remove(userJid);
        }
        return null;
    }

    public static final void A02(C25111Mx r4, UserJid userJid, long j) {
        Object value = r4.A06.getValue();
        C18070vi.A0X(value);
        ((Map) value).put(userJid, new C54192dk(r4, AnonymousClass00R.A0C, j * 1000));
    }

    public final long A03() {
        C18030ve r4 = this.A04;
        C18040vf r1 = C18040vf.A02;
        return Math.min(A00(this, (long) C18020vd.A00(r1, r4, 996), (long) C18020vd.A00(r1, r4, 997)), A04());
    }

    public final long A04() {
        C18030ve r4 = this.A04;
        C18040vf r1 = C18040vf.A02;
        return A00(this, (long) C18020vd.A00(r1, r4, 865), (long) C18020vd.A00(r1, r4, 909));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0054, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        X.CDX.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0058, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x005b, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x005c, code lost:
        X.CDX.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x005f, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C53122c1 A06(com.whatsapp.jid.UserJid r8) {
        /*
            r7 = this;
            X.0vl r0 = r7.A05
            java.lang.Object r6 = r0.getValue()
            X.C18070vi.A0X(r6)
            java.util.Map r6 = (java.util.Map) r6
            boolean r0 = r6.containsKey(r8)
            if (r0 != 0) goto L_0x0060
            X.1My r0 = r7.A01
            r5 = 0
            X.1Lt r0 = r0.A00
            X.1at r3 = r0.get()
            r0 = r3
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x0059 }
            X.1Ev r4 = r0.A02     // Catch:{ all -> 0x0059 }
            java.lang.String r2 = "SELECT sent_tc_token_timestamp, real_issue_timestamp FROM wa_trusted_contacts_send WHERE jid=?"
            r0 = 1
            java.lang.String[] r1 = new java.lang.String[r0]     // Catch:{ all -> 0x0059 }
            java.lang.String r0 = r8.getRawString()     // Catch:{ all -> 0x0059 }
            r1[r5] = r0     // Catch:{ all -> 0x0059 }
            java.lang.String r0 = "GET_SENT_TOKEN_BY_JID"
            android.database.Cursor r2 = r4.A0A(r2, r0, r1)     // Catch:{ all -> 0x0059 }
            boolean r0 = r2.moveToNext()     // Catch:{ all -> 0x0052 }
            r5 = 0
            if (r0 == 0) goto L_0x003b
            X.2c1 r5 = X.C25121My.A06(r2)     // Catch:{ all -> 0x0052 }
        L_0x003b:
            r2.close()     // Catch:{ all -> 0x0059 }
            r3.close()
            if (r5 == 0) goto L_0x004e
            long r3 = r5.A00
            long r1 = r7.A03()
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x004e
            r5 = 0
        L_0x004e:
            r6.put(r8, r5)
            return r5
        L_0x0052:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0054 }
        L_0x0054:
            r0 = move-exception
            X.CDX.A00(r2, r1)     // Catch:{ all -> 0x0059 }
            throw r0     // Catch:{ all -> 0x0059 }
        L_0x0059:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x005b }
        L_0x005b:
            r0 = move-exception
            X.CDX.A00(r3, r1)
            throw r0
        L_0x0060:
            java.lang.Object r0 = r6.get(r8)
            X.2c1 r0 = (X.C53122c1) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C25111Mx.A06(com.whatsapp.jid.UserJid):X.2c1");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0046, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        X.CDX.A00(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x004a, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x004d, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x004e, code lost:
        X.CDX.A00(r5, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0051, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.HashMap A08() {
        /*
            r6 = this;
            X.1My r0 = r6.A01
            X.1Lt r0 = r0.A00
            X.1at r5 = r0.get()
            r0 = r5
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x004b }
            X.1Ev r3 = r0.A02     // Catch:{ all -> 0x004b }
            java.lang.String r2 = "SELECT jid, sent_tc_token_timestamp, real_issue_timestamp FROM wa_trusted_contacts_send"
            r0 = 0
            java.lang.String[] r1 = new java.lang.String[r0]     // Catch:{ all -> 0x004b }
            java.lang.String r0 = "GET_ALL_SENT_TOKENS"
            android.database.Cursor r4 = r3.A0A(r2, r0, r1)     // Catch:{ all -> 0x004b }
            java.lang.String r0 = "jid"
            int r3 = r4.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0044 }
            java.util.HashMap r2 = new java.util.HashMap     // Catch:{ all -> 0x0044 }
            r2.<init>()     // Catch:{ all -> 0x0044 }
        L_0x0023:
            boolean r0 = r4.moveToNext()     // Catch:{ all -> 0x0044 }
            if (r0 == 0) goto L_0x003d
            X.1Dv r1 = X.AnonymousClass1BI.A00     // Catch:{ all -> 0x0044 }
            java.lang.String r0 = r4.getString(r3)     // Catch:{ all -> 0x0044 }
            X.1BI r1 = r1.A02(r0)     // Catch:{ all -> 0x0044 }
            if (r1 == 0) goto L_0x0023
            X.2c1 r0 = X.C25121My.A06(r4)     // Catch:{ all -> 0x0044 }
            r2.put(r1, r0)     // Catch:{ all -> 0x0044 }
            goto L_0x0023
        L_0x003d:
            r4.close()     // Catch:{ all -> 0x004b }
            r5.close()
            return r2
        L_0x0044:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0046 }
        L_0x0046:
            r0 = move-exception
            X.CDX.A00(r4, r1)     // Catch:{ all -> 0x004b }
            throw r0     // Catch:{ all -> 0x004b }
        L_0x004b:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x004d }
        L_0x004d:
            r0 = move-exception
            X.CDX.A00(r5, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C25111Mx.A08():java.util.HashMap");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00b9, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:?, code lost:
        X.CDX.A00(r6, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00bd, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00c0, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00c1, code lost:
        X.CDX.A00(r5, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00c4, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.LinkedHashMap A09(java.util.List r11) {
        /*
            r10 = this;
            X.1My r7 = r10.A01
            X.0ve r2 = r10.A04
            r1 = 11263(0x2bff, float:1.5783E-41)
            X.0vf r0 = X.C18040vf.A02
            int r1 = X.C18020vd.A00(r0, r2, r1)
            if (r1 <= 0) goto L_0x012c
            r0 = 975(0x3cf, float:1.366E-42)
            if (r1 < r0) goto L_0x0014
            r1 = 975(0x3cf, float:1.366E-42)
        L_0x0014:
            java.util.HashMap r8 = new java.util.HashMap
            r8.<init>()
            java.util.ArrayList r0 = X.C29431cG.A0i(r11, r1, r1)
            java.util.Iterator r9 = r0.iterator()
        L_0x0021:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x00c5
            java.lang.Object r6 = r9.next()
            java.util.List r6 = (java.util.List) r6
            X.1Lt r0 = r7.A00
            X.1at r5 = r0.get()
            r0 = r5
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x00be }
            X.1Ev r4 = r0.A02     // Catch:{ all -> 0x00be }
            int r2 = r6.size()     // Catch:{ all -> 0x00be }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00be }
            r1.<init>()     // Catch:{ all -> 0x00be }
            java.lang.String r0 = "SELECT jid, incoming_tc_token, incoming_tc_token_timestamp FROM wa_trusted_contacts WHERE jid IN "
            r1.append(r0)     // Catch:{ all -> 0x00be }
            java.lang.String r0 = X.AnonymousClass1H2.A00(r2)     // Catch:{ all -> 0x00be }
            r1.append(r0)     // Catch:{ all -> 0x00be }
            java.lang.String r3 = r1.toString()     // Catch:{ all -> 0x00be }
            r0 = 10
            int r0 = X.C29351c6.A0C(r6, r0)     // Catch:{ all -> 0x00be }
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ all -> 0x00be }
            r2.<init>(r0)     // Catch:{ all -> 0x00be }
            java.util.Iterator r1 = r6.iterator()     // Catch:{ all -> 0x00be }
        L_0x0060:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x00be }
            if (r0 == 0) goto L_0x0074
            java.lang.Object r0 = r1.next()     // Catch:{ all -> 0x00be }
            com.whatsapp.jid.UserJid r0 = (com.whatsapp.jid.UserJid) r0     // Catch:{ all -> 0x00be }
            java.lang.String r0 = r0.getRawString()     // Catch:{ all -> 0x00be }
            r2.add(r0)     // Catch:{ all -> 0x00be }
            goto L_0x0060
        L_0x0074:
            r0 = 0
            java.lang.String[] r0 = new java.lang.String[r0]     // Catch:{ all -> 0x00be }
            java.lang.Object[] r1 = r2.toArray(r0)     // Catch:{ all -> 0x00be }
            java.lang.String[] r1 = (java.lang.String[]) r1     // Catch:{ all -> 0x00be }
            java.lang.String r0 = "GET_RECEIVED_TOKEN_BY_LIST_OF_JIDS"
            android.database.Cursor r6 = r4.A0A(r3, r0, r1)     // Catch:{ all -> 0x00be }
            java.lang.String r0 = "jid"
            int r4 = r6.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x00b7 }
            java.lang.String r0 = "incoming_tc_token"
            int r3 = r6.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x00b7 }
            java.lang.String r0 = "incoming_tc_token_timestamp"
            int r2 = r6.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x00b7 }
        L_0x0095:
            boolean r0 = r6.moveToNext()     // Catch:{ all -> 0x00b7 }
            if (r0 == 0) goto L_0x00af
            X.1Dw r1 = com.whatsapp.jid.UserJid.Companion     // Catch:{ all -> 0x00b7 }
            java.lang.String r0 = r6.getString(r4)     // Catch:{ all -> 0x00b7 }
            com.whatsapp.jid.UserJid r1 = r1.A04(r0)     // Catch:{ all -> 0x00b7 }
            if (r1 == 0) goto L_0x0095
            X.2lX r0 = X.C25121My.A04(r6, r3, r2)     // Catch:{ all -> 0x00b7 }
            r8.put(r1, r0)     // Catch:{ all -> 0x00b7 }
            goto L_0x0095
        L_0x00af:
            r6.close()     // Catch:{ all -> 0x00be }
            r5.close()
            goto L_0x0021
        L_0x00b7:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00b9 }
        L_0x00b9:
            r0 = move-exception
            X.CDX.A00(r6, r1)     // Catch:{ all -> 0x00be }
            throw r0     // Catch:{ all -> 0x00be }
        L_0x00be:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00c0 }
        L_0x00c0:
            r0 = move-exception
            X.CDX.A00(r5, r1)
            throw r0
        L_0x00c5:
            java.util.LinkedHashMap r7 = new java.util.LinkedHashMap
            r7.<init>()
            java.util.Set r0 = r8.entrySet()
            java.util.Iterator r6 = r0.iterator()
        L_0x00d2:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x00fa
            java.lang.Object r5 = r6.next()
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            java.lang.Object r0 = r5.getValue()
            X.2lX r0 = (X.C58962lX) r0
            long r3 = r0.A00
            long r1 = r10.A04()
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x00d2
            java.lang.Object r1 = r5.getKey()
            java.lang.Object r0 = r5.getValue()
            r7.put(r1, r0)
            goto L_0x00d2
        L_0x00fa:
            int r0 = r7.size()
            int r0 = X.C200610r.A03(r0)
            java.util.LinkedHashMap r3 = new java.util.LinkedHashMap
            r3.<init>(r0)
            java.util.Set r0 = r7.entrySet()
            java.util.Iterator r2 = r0.iterator()
        L_0x010f:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x012b
            java.lang.Object r0 = r2.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r1 = r0.getKey()
            java.lang.Object r0 = r0.getValue()
            X.2lX r0 = (X.C58962lX) r0
            byte[] r0 = r0.A01
            r3.put(r1, r0)
            goto L_0x010f
        L_0x012b:
            return r3
        L_0x012c:
            java.lang.String r1 = "Failed requirement."
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C25111Mx.A09(java.util.List):java.util.LinkedHashMap");
    }
}
