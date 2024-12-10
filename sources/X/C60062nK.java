package X;

import com.whatsapp.jid.UserJid;
import com.whatsapp.jobqueue.job.GeneratePrivacyTokenJob;
import java.util.Set;

/* renamed from: X.2nK  reason: invalid class name and case insensitive filesystem */
public final class C60062nK {
    public final AnonymousClass11P A00;
    public final C18030ve A01;
    public final C18100vl A02 = new C18110vm(new C21527Ala(7));
    public final C25001Mm A03;
    public final C25111Mx A04;

    public final void A00(UserJid userJid) {
        C18070vi.A0d(userJid, 0);
        if (A03(userJid)) {
            C25111Mx r1 = this.A04;
            C53122c1 A06 = r1.A06(userJid);
            if (A06 != null) {
                long j = A06.A00;
                if (Long.valueOf(j) != null && j >= r1.A03()) {
                    this.A03.A01(new GeneratePrivacyTokenJob(userJid));
                    return;
                }
            }
            A01(userJid);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00a4, code lost:
        if (r16 < 0) goto L_0x00a6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00de, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:?, code lost:
        X.CDX.A00(r12, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00e2, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00e5, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:?, code lost:
        X.CDX.A00(r8, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00e9, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00ec, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00ed, code lost:
        X.CDX.A00(r7, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00f0, code lost:
        throw r0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x00f8  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x011c  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x016e  */
    /* JADX WARNING: Removed duplicated region for block: B:77:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A02(com.whatsapp.jid.UserJid r21) {
        /*
            r20 = this;
            r0 = 0
            r11 = r21
            X.C18070vi.A0d(r11, r0)
            r10 = r20
            X.1Mx r2 = r10.A04
            X.2c1 r9 = r2.A06(r11)
            if (r9 == 0) goto L_0x0044
            long r3 = r9.A00
            java.lang.Long r0 = java.lang.Long.valueOf(r3)
            if (r0 == 0) goto L_0x0044
            X.0ve r5 = r10.A01
            r1 = 996(0x3e4, float:1.396E-42)
            X.0vf r0 = X.C18040vf.A02
            int r0 = X.C18020vd.A00(r0, r5, r1)
            long r0 = (long) r0
            r6 = 0
            int r5 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r5 > 0) goto L_0x005a
            java.lang.StringBuilder r6 = X.AnonymousClass000.A10()
            java.lang.String r5 = "Bad bucket configuration, bucketLengthSec = "
            X.C17900vP.A0l(r5, r6, r0)
            X.11P r0 = r10.A00
            long r0 = r0.A05()
            long r5 = X.C17880vN.A04(r0)
            r0 = 15724800(0xeff100, double:7.7690835E-317)
            long r5 = r5 - r0
        L_0x0040:
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 >= 0) goto L_0x0167
        L_0x0044:
            X.11P r0 = r10.A00
            long r3 = r0.A05()
            r18 = 1000(0x3e8, double:4.94E-321)
            long r3 = r3 / r18
            X.1My r0 = r2.A01
            java.lang.String r15 = "jid"
            r6 = 0
            X.1Lt r0 = r0.A00
            X.1au r7 = r0.A06()
            goto L_0x0067
        L_0x005a:
            X.11P r5 = r10.A00
            long r5 = r5.A05()
            long r5 = X.C17880vN.A04(r5)
            long r5 = r5 / r0
            long r3 = r3 / r0
            goto L_0x0040
        L_0x0067:
            X.1xA r8 = r7.BD0()     // Catch:{ all -> 0x00ea }
            r0 = r7
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x00e3 }
            X.1Ev r14 = r0.A02     // Catch:{ all -> 0x00e3 }
            java.lang.String r5 = "SELECT sent_tc_token_timestamp, real_issue_timestamp FROM wa_trusted_contacts_send WHERE jid=?"
            java.lang.String[] r1 = X.C17880vN.A1Y()     // Catch:{ all -> 0x00e3 }
            X.C17880vN.A1J(r11, r1, r6)     // Catch:{ all -> 0x00e3 }
            java.lang.String r0 = "GET_SENT_TOKEN_BY_JID"
            android.database.Cursor r12 = r14.A0A(r5, r0, r1)     // Catch:{ all -> 0x00e3 }
            boolean r0 = r12.moveToNext()     // Catch:{ all -> 0x00dc }
            r13 = 0
            if (r0 == 0) goto L_0x008a
            X.2c1 r13 = X.C25121My.A06(r12)     // Catch:{ all -> 0x00dc }
        L_0x008a:
            r0 = 0
            if (r13 == 0) goto L_0x00a6
            long r5 = r13.A00     // Catch:{ all -> 0x00dc }
            int r16 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r16 < 0) goto L_0x009a
            r8.A00()     // Catch:{ all -> 0x00dc }
            java.lang.Integer r1 = X.AnonymousClass00R.A0C     // Catch:{ all -> 0x00dc }
            goto L_0x00d5
        L_0x009a:
            java.lang.Long r5 = r13.A01     // Catch:{ all -> 0x00dc }
            if (r5 == 0) goto L_0x00c9
            long r16 = r5.longValue()     // Catch:{ all -> 0x00dc }
            int r5 = (r16 > r0 ? 1 : (r16 == r0 ? 0 : -1))
            if (r5 >= 0) goto L_0x00cb
        L_0x00a6:
            r5 = 3
            android.content.ContentValues r5 = X.C17880vN.A09(r5)     // Catch:{ all -> 0x00dc }
            java.lang.String r6 = r11.getRawString()     // Catch:{ all -> 0x00dc }
            r5.put(r15, r6)     // Catch:{ all -> 0x00dc }
            java.lang.String r6 = "sent_tc_token_timestamp"
            X.C17880vN.A19(r5, r6, r3)     // Catch:{ all -> 0x00dc }
            java.lang.String r3 = "real_issue_timestamp"
            X.C17880vN.A19(r5, r3, r0)     // Catch:{ all -> 0x00dc }
            java.lang.String r1 = "wa_trusted_contacts_send"
            java.lang.String r0 = "UPDATE_SCHEDULED_TIMESTAMP"
            r14.A07(r1, r0, r5)     // Catch:{ all -> 0x00dc }
            r8.A00()     // Catch:{ all -> 0x00dc }
            goto L_0x00ce
        L_0x00c9:
            r16 = 0
        L_0x00cb:
            r0 = r16
            goto L_0x00a6
        L_0x00ce:
            if (r13 == 0) goto L_0x00d3
            java.lang.Integer r1 = X.AnonymousClass00R.A01     // Catch:{ all -> 0x00dc }
            goto L_0x00d5
        L_0x00d3:
            java.lang.Integer r1 = X.AnonymousClass00R.A00     // Catch:{ all -> 0x00dc }
        L_0x00d5:
            r12.close()     // Catch:{ all -> 0x00e3 }
            r8.close()     // Catch:{ all -> 0x00ea }
            goto L_0x00f1
        L_0x00dc:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00de }
        L_0x00de:
            r0 = move-exception
            X.CDX.A00(r12, r1)     // Catch:{ all -> 0x00e3 }
            throw r0     // Catch:{ all -> 0x00e3 }
        L_0x00e3:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00e5 }
        L_0x00e5:
            r0 = move-exception
            X.CDX.A00(r8, r1)     // Catch:{ all -> 0x00ea }
            throw r0     // Catch:{ all -> 0x00ea }
        L_0x00ea:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00ec }
        L_0x00ec:
            r0 = move-exception
            X.CDX.A00(r7, r1)
            throw r0
        L_0x00f1:
            r7.close()
            java.lang.Integer r0 = X.AnonymousClass00R.A0C
            if (r1 == r0) goto L_0x0106
            X.0vl r0 = r2.A05
            java.lang.Object r0 = r0.getValue()
            X.C18070vi.A0X(r0)
            java.util.Map r0 = (java.util.Map) r0
            r0.remove(r11)
        L_0x0106:
            if (r9 == 0) goto L_0x0168
            java.lang.Long r0 = r9.A01
            if (r0 == 0) goto L_0x0168
            long r13 = r0.longValue()
            X.0ve r3 = r2.A04
            r0 = 4063(0xfdf, float:5.693E-42)
            X.0vf r1 = X.C18040vf.A02
            int r12 = X.C18020vd.A00(r1, r3, r0)
            if (r12 <= 0) goto L_0x0168
            r0 = 996(0x3e4, float:1.396E-42)
            int r0 = X.C18020vd.A00(r1, r3, r0)
            long r8 = (long) r0
            X.0z4 r0 = r2.A03
            android.content.SharedPreferences r1 = X.C17890vO.A0B(r0)
            java.lang.String r0 = "privacy_token_last_batch_time_sec"
            long r6 = X.C17890vO.A04(r1, r0)
            long r6 = r6 / r8
            X.11P r0 = r2.A02
            long r4 = r0.A05()
            long r4 = r4 / r18
            long r4 = r4 / r8
            long r0 = X.C20577AQn.A05
            X.9Io r2 = X.C179589Io.SECONDS
            long r0 = X.C21348Aid.A06(r2, r0)
            r2 = 1
            long r0 = r0 + r2
            double r2 = (double) r0
            r0 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r2 = r2 * r0
            double r0 = (double) r8
            double r2 = r2 / r0
            double r0 = java.lang.Math.ceil(r2)
            int r2 = (int) r0
            long r2 = (long) r2
            long r0 = r4 - r2
            long r2 = java.lang.Math.min(r6, r4)
            long r2 = java.lang.Math.max(r0, r2)
            long r0 = (long) r12
            long r2 = r2 - r0
            long r2 = r2 * r8
            java.lang.Long r0 = java.lang.Long.valueOf(r2)
            if (r0 == 0) goto L_0x0168
            int r0 = (r13 > r2 ? 1 : (r13 == r2 ? 0 : -1))
            if (r0 < 0) goto L_0x0168
        L_0x0167:
            return
        L_0x0168:
            boolean r0 = r10.A03(r11)
            if (r0 == 0) goto L_0x0167
            X.1Mm r1 = r10.A03
            com.whatsapp.jobqueue.job.GeneratePrivacyTokenJob r0 = new com.whatsapp.jobqueue.job.GeneratePrivacyTokenJob
            r0.<init>(r11)
            r1.A01(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C60062nK.A02(com.whatsapp.jid.UserJid):void");
    }

    public final void A01(UserJid userJid) {
        Object value = this.A02.getValue();
        C18070vi.A0X(value);
        Set set = (Set) value;
        synchronized (set) {
            set.remove(userJid);
        }
    }

    public final boolean A03(UserJid userJid) {
        boolean z;
        Object value = this.A02.getValue();
        C18070vi.A0X(value);
        Set set = (Set) value;
        synchronized (set) {
            if (!set.contains(userJid)) {
                set.add(userJid);
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    public C60062nK(C25001Mm r3, C25111Mx r4, AnonymousClass11P r5, C18030ve r6) {
        C18070vi.A0s(r5, r6, r3, r4);
        this.A00 = r5;
        this.A01 = r6;
        this.A03 = r3;
        this.A04 = r4;
    }
}
