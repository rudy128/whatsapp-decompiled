package X;

import java.util.HashMap;
import java.util.Map;

/* renamed from: X.11b  reason: invalid class name and case insensitive filesystem */
public final class C201611b implements C201511a {
    public final AnonymousClass1KB A00;
    public final AnonymousClass11S A01;
    public final C26261Rl A02;
    public final C35771mm A03;
    public final C35781mn A04;
    public final C26191Re A05;
    public final AnonymousClass11P A06;
    public final C19830z4 A07;
    public final C25011Mn A08;
    public final C33501iv A09;
    public final C27001Ui A0A;
    public final AnonymousClass00H A0B;
    public final AnonymousClass00H A0C;
    public final AnonymousClass00H A0D;
    public final Map A0E = new HashMap();

    public C201611b(AnonymousClass1KB r2, AnonymousClass11S r3, C26261Rl r4, C35771mm r5, C35781mn r6, C26191Re r7, AnonymousClass11P r8, C19830z4 r9, C25011Mn r10, C33501iv r11, C27001Ui r12, AnonymousClass00H r13, AnonymousClass00H r14, AnonymousClass00H r15) {
        C18070vi.A0d(r8, 1);
        C18070vi.A0d(r2, 2);
        C18070vi.A0d(r13, 3);
        C18070vi.A0d(r3, 4);
        C18070vi.A0d(r10, 5);
        C18070vi.A0d(r14, 6);
        C18070vi.A0d(r15, 7);
        C18070vi.A0d(r7, 8);
        C18070vi.A0d(r12, 9);
        C18070vi.A0d(r9, 10);
        C18070vi.A0d(r4, 11);
        C18070vi.A0d(r11, 12);
        C18070vi.A0d(r5, 13);
        C18070vi.A0d(r6, 14);
        this.A06 = r8;
        this.A00 = r2;
        this.A0B = r13;
        this.A01 = r3;
        this.A08 = r10;
        this.A0D = r14;
        this.A0C = r15;
        this.A05 = r7;
        this.A0A = r12;
        this.A07 = r9;
        this.A02 = r4;
        this.A09 = r11;
        this.A03 = r5;
        this.A04 = r6;
    }

    public static final boolean A00(C201611b r2, int i, long j, boolean z) {
        long j2;
        if (z) {
            Map map = r2.A0E;
            Integer valueOf = Integer.valueOf(i);
            if (map.containsKey(valueOf)) {
                Number number = (Number) map.get(valueOf);
                if (number != null) {
                    j2 = number.longValue();
                } else {
                    j2 = 0;
                }
                if (j - j2 > 60000) {
                    return true;
                }
                return false;
            }
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0092, code lost:
        if (A00(r5, 1, r1, r6) == false) goto L_0x0094;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x009f, code lost:
        if (A00(r5, 2, r1, r6) == false) goto L_0x00a1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00af, code lost:
        if (A00(r5, 3, r1, r6) == false) goto L_0x00b1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00bc, code lost:
        if (A00(r5, 4, r1, r6) == false) goto L_0x00be;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00c9, code lost:
        if (A00(r5, 5, r1, r6) == false) goto L_0x00cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x00d6, code lost:
        if (A00(r5, 7, r1, r6) == false) goto L_0x00d8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x00ff, code lost:
        if ((r1 - r14) <= 14400000) goto L_0x0101;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x0111, code lost:
        if (A00(r5, 8, r1, r6) == false) goto L_0x0113;
     */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0107  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0127  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0133  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void A01(X.C55992gi r32, boolean r33, boolean r34, boolean r35) {
        /*
            r31 = this;
            r5 = r31
            monitor-enter(r5)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x0368 }
            r6.<init>()     // Catch:{ all -> 0x0368 }
            java.lang.String r0 = "AccountSyncManager/fetchAllAccountInfo/fetch account info: "
            r6.append(r0)     // Catch:{ all -> 0x0368 }
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ all -> 0x0368 }
            r9.<init>()     // Catch:{ all -> 0x0368 }
            java.lang.String r0 = "AccountSyncRequest:"
            r9.append(r0)     // Catch:{ all -> 0x0368 }
            r4 = r32
            boolean r8 = r4.A07     // Catch:{ all -> 0x0368 }
            java.lang.String r2 = ""
            if (r8 == 0) goto L_0x007e
            java.lang.String r0 = "S"
        L_0x0021:
            r9.append(r0)     // Catch:{ all -> 0x0368 }
            boolean r12 = r4.A05     // Catch:{ all -> 0x0368 }
            if (r12 == 0) goto L_0x007c
            java.lang.String r0 = "Pi"
        L_0x002a:
            r9.append(r0)     // Catch:{ all -> 0x0368 }
            boolean r0 = r4.A06     // Catch:{ all -> 0x0368 }
            if (r0 == 0) goto L_0x007a
            java.lang.String r1 = "Pr"
        L_0x0033:
            r9.append(r1)     // Catch:{ all -> 0x0368 }
            boolean r13 = r4.A02     // Catch:{ all -> 0x0368 }
            if (r13 == 0) goto L_0x0078
            java.lang.String r1 = "D"
        L_0x003c:
            r9.append(r1)     // Catch:{ all -> 0x0368 }
            boolean r10 = r4.A01     // Catch:{ all -> 0x0368 }
            if (r10 == 0) goto L_0x0076
            java.lang.String r1 = "B"
        L_0x0045:
            r9.append(r1)     // Catch:{ all -> 0x0368 }
            boolean r7 = r4.A03     // Catch:{ all -> 0x0368 }
            if (r7 == 0) goto L_0x0074
            java.lang.String r1 = "N"
        L_0x004e:
            r9.append(r1)     // Catch:{ all -> 0x0368 }
            boolean r14 = r4.A08     // Catch:{ all -> 0x0368 }
            if (r14 == 0) goto L_0x0072
            java.lang.String r1 = "T"
        L_0x0057:
            r9.append(r1)     // Catch:{ all -> 0x0368 }
            boolean r3 = r4.A04     // Catch:{ all -> 0x0368 }
            if (r3 == 0) goto L_0x0060
            java.lang.String r2 = "O"
        L_0x0060:
            r9.append(r2)     // Catch:{ all -> 0x0368 }
            java.lang.String r1 = r9.toString()     // Catch:{ all -> 0x0368 }
            r6.append(r1)     // Catch:{ all -> 0x0368 }
            java.lang.String r1 = r6.toString()     // Catch:{ all -> 0x0368 }
            com.whatsapp.util.Log.i((java.lang.String) r1)     // Catch:{ all -> 0x0368 }
            goto L_0x0080
        L_0x0072:
            r1 = r2
            goto L_0x0057
        L_0x0074:
            r1 = r2
            goto L_0x004e
        L_0x0076:
            r1 = r2
            goto L_0x0045
        L_0x0078:
            r1 = r2
            goto L_0x003c
        L_0x007a:
            r1 = r2
            goto L_0x0033
        L_0x007c:
            r0 = r2
            goto L_0x002a
        L_0x007e:
            r0 = r2
            goto L_0x0021
        L_0x0080:
            X.11P r1 = r5.A06     // Catch:{ all -> 0x0366 }
            long r1 = X.AnonymousClass11P.A01(r1)     // Catch:{ all -> 0x0366 }
            r9 = 0
            r11 = 1
            r6 = r35
            if (r8 == 0) goto L_0x0094
            boolean r8 = A00(r5, r11, r1, r6)     // Catch:{ all -> 0x0366 }
            r24 = 1
            if (r8 != 0) goto L_0x0096
        L_0x0094:
            r24 = 0
        L_0x0096:
            r8 = 2
            if (r12 == 0) goto L_0x00a1
            boolean r12 = A00(r5, r8, r1, r6)     // Catch:{ all -> 0x0366 }
            r23 = 1
            if (r12 != 0) goto L_0x00a3
        L_0x00a1:
            r23 = 0
        L_0x00a3:
            r22 = 3
            if (r0 == 0) goto L_0x00b1
            r0 = r22
            boolean r0 = A00(r5, r0, r1, r6)     // Catch:{ all -> 0x0366 }
            r21 = 1
            if (r0 != 0) goto L_0x00b3
        L_0x00b1:
            r21 = 0
        L_0x00b3:
            r12 = 4
            if (r10 == 0) goto L_0x00be
            boolean r0 = A00(r5, r12, r1, r6)     // Catch:{ all -> 0x0366 }
            r20 = 1
            if (r0 != 0) goto L_0x00c0
        L_0x00be:
            r20 = 0
        L_0x00c0:
            r10 = 5
            if (r13 == 0) goto L_0x00cb
            boolean r0 = A00(r5, r10, r1, r6)     // Catch:{ all -> 0x0366 }
            r19 = 1
            if (r0 != 0) goto L_0x00cd
        L_0x00cb:
            r19 = 0
        L_0x00cd:
            r13 = 7
            if (r14 == 0) goto L_0x00d8
            boolean r0 = A00(r5, r13, r1, r6)     // Catch:{ all -> 0x0366 }
            r18 = 1
            if (r0 != 0) goto L_0x00da
        L_0x00d8:
            r18 = 0
        L_0x00da:
            if (r7 == 0) goto L_0x0101
            java.util.Map r14 = r5.A0E     // Catch:{ all -> 0x0366 }
            r0 = 6
            java.lang.Integer r7 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0366 }
            boolean r0 = r14.containsKey(r7)     // Catch:{ all -> 0x0366 }
            if (r0 == 0) goto L_0x0108
            java.lang.Object r0 = r14.get(r7)     // Catch:{ all -> 0x0366 }
            java.lang.Long r0 = (java.lang.Long) r0     // Catch:{ all -> 0x0366 }
            if (r0 == 0) goto L_0x00f6
            long r14 = r0.longValue()     // Catch:{ all -> 0x0366 }
            goto L_0x00f8
        L_0x00f6:
            r14 = 0
        L_0x00f8:
            long r16 = r1 - r14
            r14 = 14400000(0xdbba00, double:7.1145453E-317)
            int r0 = (r16 > r14 ? 1 : (r16 == r14 ? 0 : -1))
            if (r0 > 0) goto L_0x0108
        L_0x0101:
            r17 = 0
        L_0x0103:
            r0 = 8
            if (r3 == 0) goto L_0x0113
            goto L_0x010b
        L_0x0108:
            r17 = 1
            goto L_0x0103
        L_0x010b:
            boolean r0 = A00(r5, r0, r1, r6)     // Catch:{ all -> 0x0366 }
            r16 = 1
            if (r0 != 0) goto L_0x0115
        L_0x0113:
            r16 = 0
        L_0x0115:
            int r3 = r24 + r23
            int r3 = r3 + r21
            int r3 = r3 + r20
            int r3 = r3 + r19
            int r3 = r3 + r17
            int r3 = r3 + r18
            int r3 = r3 + r16
            r7 = r33
            if (r3 != 0) goto L_0x0133
            if (r33 == 0) goto L_0x0364
            X.1Mn r2 = r5.A08     // Catch:{ all -> 0x0366 }
            java.lang.String r1 = "account_sync"
            r0 = 0
            r2.A02(r1, r0)     // Catch:{ all -> 0x0366 }
            goto L_0x0364
        L_0x0133:
            X.0z4 r0 = r5.A07     // Catch:{ all -> 0x0366 }
            X.2jY r6 = new X.2jY     // Catch:{ all -> 0x0366 }
            r6.<init>(r0, r5, r3, r7)     // Catch:{ all -> 0x0366 }
            if (r34 == 0) goto L_0x025f
            boolean r4 = r4.A00     // Catch:{ all -> 0x0366 }
            r7 = 8
            if (r24 == 0) goto L_0x016f
            X.00H r3 = r0.A00     // Catch:{ all -> 0x0366 }
            java.lang.Object r3 = r3.get()     // Catch:{ all -> 0x0366 }
            android.content.SharedPreferences r3 = (android.content.SharedPreferences) r3     // Catch:{ all -> 0x0366 }
            java.lang.String r14 = "account_sync_status_num_retries"
            int r3 = r3.getInt(r14, r9)     // Catch:{ all -> 0x0366 }
            if (r4 != r11) goto L_0x0165
            int r3 = r3 - r11
            int r15 = java.lang.Math.max(r3, r9)     // Catch:{ all -> 0x0366 }
            if (r15 != 0) goto L_0x0166
            android.content.SharedPreferences$Editor r3 = X.C19830z4.A00(r0)     // Catch:{ all -> 0x0366 }
            android.content.SharedPreferences$Editor r3 = r3.remove(r14)     // Catch:{ all -> 0x0366 }
        L_0x0161:
            r3.apply()     // Catch:{ all -> 0x0366 }
            goto L_0x016f
        L_0x0165:
            r15 = 3
        L_0x0166:
            android.content.SharedPreferences$Editor r3 = X.C19830z4.A00(r0)     // Catch:{ all -> 0x0366 }
            android.content.SharedPreferences$Editor r3 = r3.putInt(r14, r15)     // Catch:{ all -> 0x0366 }
            goto L_0x0161
        L_0x016f:
            if (r23 == 0) goto L_0x019e
            X.00H r3 = r0.A00     // Catch:{ all -> 0x0366 }
            java.lang.Object r3 = r3.get()     // Catch:{ all -> 0x0366 }
            android.content.SharedPreferences r3 = (android.content.SharedPreferences) r3     // Catch:{ all -> 0x0366 }
            java.lang.String r14 = "account_sync_picture_num_retries"
            int r3 = r3.getInt(r14, r9)     // Catch:{ all -> 0x0366 }
            if (r4 != r11) goto L_0x0194
            int r3 = r3 - r11
            int r15 = java.lang.Math.max(r3, r9)     // Catch:{ all -> 0x0366 }
            if (r15 != 0) goto L_0x0195
            android.content.SharedPreferences$Editor r3 = X.C19830z4.A00(r0)     // Catch:{ all -> 0x0366 }
            android.content.SharedPreferences$Editor r3 = r3.remove(r14)     // Catch:{ all -> 0x0366 }
        L_0x0190:
            r3.apply()     // Catch:{ all -> 0x0366 }
            goto L_0x019e
        L_0x0194:
            r15 = 3
        L_0x0195:
            android.content.SharedPreferences$Editor r3 = X.C19830z4.A00(r0)     // Catch:{ all -> 0x0366 }
            android.content.SharedPreferences$Editor r3 = r3.putInt(r14, r15)     // Catch:{ all -> 0x0366 }
            goto L_0x0190
        L_0x019e:
            if (r21 == 0) goto L_0x01cd
            X.00H r3 = r0.A00     // Catch:{ all -> 0x0366 }
            java.lang.Object r3 = r3.get()     // Catch:{ all -> 0x0366 }
            android.content.SharedPreferences r3 = (android.content.SharedPreferences) r3     // Catch:{ all -> 0x0366 }
            java.lang.String r14 = "account_sync_privacy_num_retries"
            int r3 = r3.getInt(r14, r9)     // Catch:{ all -> 0x0366 }
            if (r4 != r11) goto L_0x01c3
            int r3 = r3 - r11
            int r15 = java.lang.Math.max(r3, r9)     // Catch:{ all -> 0x0366 }
            if (r15 != 0) goto L_0x01c4
            android.content.SharedPreferences$Editor r3 = X.C19830z4.A00(r0)     // Catch:{ all -> 0x0366 }
            android.content.SharedPreferences$Editor r3 = r3.remove(r14)     // Catch:{ all -> 0x0366 }
        L_0x01bf:
            r3.apply()     // Catch:{ all -> 0x0366 }
            goto L_0x01cd
        L_0x01c3:
            r15 = 3
        L_0x01c4:
            android.content.SharedPreferences$Editor r3 = X.C19830z4.A00(r0)     // Catch:{ all -> 0x0366 }
            android.content.SharedPreferences$Editor r3 = r3.putInt(r14, r15)     // Catch:{ all -> 0x0366 }
            goto L_0x01bf
        L_0x01cd:
            if (r20 == 0) goto L_0x01fc
            X.00H r3 = r0.A00     // Catch:{ all -> 0x0366 }
            java.lang.Object r3 = r3.get()     // Catch:{ all -> 0x0366 }
            android.content.SharedPreferences r3 = (android.content.SharedPreferences) r3     // Catch:{ all -> 0x0366 }
            java.lang.String r14 = "account_sync_blocklist_num_retries"
            int r3 = r3.getInt(r14, r9)     // Catch:{ all -> 0x0366 }
            if (r4 != r11) goto L_0x01f2
            int r3 = r3 - r11
            int r15 = java.lang.Math.max(r3, r9)     // Catch:{ all -> 0x0366 }
            if (r15 != 0) goto L_0x01f3
            android.content.SharedPreferences$Editor r3 = X.C19830z4.A00(r0)     // Catch:{ all -> 0x0366 }
            android.content.SharedPreferences$Editor r3 = r3.remove(r14)     // Catch:{ all -> 0x0366 }
        L_0x01ee:
            r3.apply()     // Catch:{ all -> 0x0366 }
            goto L_0x01fc
        L_0x01f2:
            r15 = 3
        L_0x01f3:
            android.content.SharedPreferences$Editor r3 = X.C19830z4.A00(r0)     // Catch:{ all -> 0x0366 }
            android.content.SharedPreferences$Editor r3 = r3.putInt(r14, r15)     // Catch:{ all -> 0x0366 }
            goto L_0x01ee
        L_0x01fc:
            if (r18 == 0) goto L_0x0220
            X.00H r3 = r0.A00     // Catch:{ all -> 0x0366 }
            java.lang.Object r3 = r3.get()     // Catch:{ all -> 0x0366 }
            android.content.SharedPreferences r3 = (android.content.SharedPreferences) r3     // Catch:{ all -> 0x0366 }
            java.lang.String r14 = "account_sync_text_status_num_retries"
            int r3 = r3.getInt(r14, r9)     // Catch:{ all -> 0x0366 }
            if (r4 != r11) goto L_0x0255
            int r3 = r3 - r11
            int r3 = java.lang.Math.max(r3, r9)     // Catch:{ all -> 0x0366 }
            if (r3 != 0) goto L_0x0256
            android.content.SharedPreferences$Editor r0 = X.C19830z4.A00(r0)     // Catch:{ all -> 0x0366 }
            android.content.SharedPreferences$Editor r0 = r0.remove(r14)     // Catch:{ all -> 0x0366 }
        L_0x021d:
            r0.apply()     // Catch:{ all -> 0x0366 }
        L_0x0220:
            X.1mn r14 = r5.A04     // Catch:{ all -> 0x0366 }
            if (r16 == 0) goto L_0x0261
            android.content.SharedPreferences r0 = X.C35781mn.A00(r14)     // Catch:{ all -> 0x0366 }
            java.lang.String r3 = "account_sync_opt_out_list_num_retries"
            int r0 = r0.getInt(r3, r9)     // Catch:{ all -> 0x0366 }
            if (r4 != r11) goto L_0x0247
            int r0 = r0 - r11
            int r4 = java.lang.Math.max(r0, r9)     // Catch:{ all -> 0x0366 }
            if (r4 != 0) goto L_0x0248
            android.content.SharedPreferences r0 = X.C35781mn.A00(r14)     // Catch:{ all -> 0x0366 }
            android.content.SharedPreferences$Editor r0 = r0.edit()     // Catch:{ all -> 0x0366 }
            android.content.SharedPreferences$Editor r0 = r0.remove(r3)     // Catch:{ all -> 0x0366 }
        L_0x0243:
            r0.apply()     // Catch:{ all -> 0x0366 }
            goto L_0x0261
        L_0x0247:
            r4 = 3
        L_0x0248:
            android.content.SharedPreferences r0 = X.C35781mn.A00(r14)     // Catch:{ all -> 0x0366 }
            android.content.SharedPreferences$Editor r0 = r0.edit()     // Catch:{ all -> 0x0366 }
            android.content.SharedPreferences$Editor r0 = r0.putInt(r3, r4)     // Catch:{ all -> 0x0366 }
            goto L_0x0243
        L_0x0255:
            r3 = 3
        L_0x0256:
            android.content.SharedPreferences$Editor r0 = X.C19830z4.A00(r0)     // Catch:{ all -> 0x0366 }
            android.content.SharedPreferences$Editor r0 = r0.putInt(r14, r3)     // Catch:{ all -> 0x0366 }
            goto L_0x021d
        L_0x025f:
            r7 = 8
        L_0x0261:
            if (r24 == 0) goto L_0x0280
            java.lang.Long r4 = java.lang.Long.valueOf(r1)     // Catch:{ all -> 0x0366 }
            java.util.Map r3 = r5.A0E     // Catch:{ all -> 0x0366 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r11)     // Catch:{ all -> 0x0366 }
            r3.put(r0, r4)     // Catch:{ all -> 0x0366 }
            X.00H r0 = r5.A0B     // Catch:{ all -> 0x0366 }
            java.lang.Object r3 = r0.get()     // Catch:{ all -> 0x0366 }
            X.2n7 r3 = (X.C59932n7) r3     // Catch:{ all -> 0x0366 }
            X.37O r0 = new X.37O     // Catch:{ all -> 0x0366 }
            r0.<init>(r6, r5)     // Catch:{ all -> 0x0366 }
            r3.A01(r0)     // Catch:{ all -> 0x0366 }
        L_0x0280:
            if (r18 == 0) goto L_0x029a
            java.lang.Long r4 = java.lang.Long.valueOf(r1)     // Catch:{ all -> 0x0366 }
            java.util.Map r3 = r5.A0E     // Catch:{ all -> 0x0366 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r13)     // Catch:{ all -> 0x0366 }
            r3.put(r0, r4)     // Catch:{ all -> 0x0366 }
            X.00H r0 = r5.A0D     // Catch:{ all -> 0x0366 }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x0366 }
            X.6uV r0 = (X.C136846uV) r0     // Catch:{ all -> 0x0366 }
            r0.A03(r6)     // Catch:{ all -> 0x0366 }
        L_0x029a:
            if (r23 == 0) goto L_0x02c5
            java.lang.Long r4 = java.lang.Long.valueOf(r1)     // Catch:{ all -> 0x0366 }
            java.util.Map r3 = r5.A0E     // Catch:{ all -> 0x0366 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x0366 }
            r3.put(r0, r4)     // Catch:{ all -> 0x0366 }
            X.1Ui r3 = r5.A0A     // Catch:{ all -> 0x0366 }
            X.11S r0 = r5.A01     // Catch:{ all -> 0x0366 }
            r0.A0I()     // Catch:{ all -> 0x0366 }
            com.whatsapp.jid.PhoneUserJid r0 = r0.A0E     // Catch:{ all -> 0x0366 }
            java.lang.String r27 = "AccountSyncManager.fetchAccountInfoWithIqs"
            r24 = 0
            r30 = r9
            r23 = r3
            r25 = r0
            r26 = r6
            r28 = r9
            r29 = r11
            r23.A00(r24, r25, r26, r27, r28, r29, r30)     // Catch:{ all -> 0x0366 }
        L_0x02c5:
            if (r21 == 0) goto L_0x02d9
            java.lang.Long r4 = java.lang.Long.valueOf(r1)     // Catch:{ all -> 0x0366 }
            java.util.Map r3 = r5.A0E     // Catch:{ all -> 0x0366 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r22)     // Catch:{ all -> 0x0366 }
            r3.put(r0, r4)     // Catch:{ all -> 0x0366 }
            X.1Rl r0 = r5.A02     // Catch:{ all -> 0x0366 }
            r0.A01(r6)     // Catch:{ all -> 0x0366 }
        L_0x02d9:
            if (r20 == 0) goto L_0x02f3
            java.lang.Long r4 = java.lang.Long.valueOf(r1)     // Catch:{ all -> 0x0366 }
            java.util.Map r3 = r5.A0E     // Catch:{ all -> 0x0366 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r12)     // Catch:{ all -> 0x0366 }
            r3.put(r0, r4)     // Catch:{ all -> 0x0366 }
            X.00H r0 = r5.A0C     // Catch:{ all -> 0x0366 }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x0366 }
            X.1pj r0 = (X.C37551pj) r0     // Catch:{ all -> 0x0366 }
            r0.A0L(r6)     // Catch:{ all -> 0x0366 }
        L_0x02f3:
            if (r19 == 0) goto L_0x0320
            java.lang.Long r4 = java.lang.Long.valueOf(r1)     // Catch:{ all -> 0x0366 }
            java.util.Map r3 = r5.A0E     // Catch:{ all -> 0x0366 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r10)     // Catch:{ all -> 0x0366 }
            r3.put(r0, r4)     // Catch:{ all -> 0x0366 }
            X.1Re r4 = r5.A05     // Catch:{ all -> 0x0366 }
            com.whatsapp.jid.UserJid[] r3 = new com.whatsapp.jid.UserJid[r11]     // Catch:{ all -> 0x0366 }
            X.11S r0 = r5.A01     // Catch:{ all -> 0x0366 }
            r0.A0I()     // Catch:{ all -> 0x0366 }
            com.whatsapp.jid.PhoneUserJid r0 = r0.A0E     // Catch:{ all -> 0x0366 }
            if (r0 == 0) goto L_0x0318
            r3[r9] = r0     // Catch:{ all -> 0x0366 }
            r4.A01(r3, r8)     // Catch:{ all -> 0x0366 }
            r6.A00(r10)     // Catch:{ all -> 0x0366 }
            goto L_0x0320
        L_0x0318:
            java.lang.String r1 = "Required value was null."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0366 }
            r0.<init>(r1)     // Catch:{ all -> 0x0366 }
            throw r0     // Catch:{ all -> 0x0366 }
        L_0x0320:
            if (r17 == 0) goto L_0x034d
            java.lang.Long r4 = java.lang.Long.valueOf(r1)     // Catch:{ all -> 0x0366 }
            java.util.Map r3 = r5.A0E     // Catch:{ all -> 0x0366 }
            r9 = 6
            java.lang.Integer r0 = java.lang.Integer.valueOf(r9)     // Catch:{ all -> 0x0366 }
            r3.put(r0, r4)     // Catch:{ all -> 0x0366 }
            X.1iv r8 = r5.A09     // Catch:{ all -> 0x0366 }
            X.0ve r4 = r8.A01     // Catch:{ all -> 0x0366 }
            r3 = 4779(0x12ab, float:6.697E-42)
            X.0vf r0 = X.C18040vf.A02     // Catch:{ all -> 0x0366 }
            boolean r0 = X.C18020vd.A05(r0, r4, r3)     // Catch:{ all -> 0x0366 }
            if (r0 == 0) goto L_0x034a
            X.10I r4 = r8.A05     // Catch:{ all -> 0x0366 }
            r3 = 34
            X.AkF r0 = new X.AkF     // Catch:{ all -> 0x0366 }
            r0.<init>(r8, r3)     // Catch:{ all -> 0x0366 }
            r4.CGF(r0)     // Catch:{ all -> 0x0366 }
        L_0x034a:
            r6.A00(r9)     // Catch:{ all -> 0x0366 }
        L_0x034d:
            if (r16 == 0) goto L_0x0364
            java.lang.Long r2 = java.lang.Long.valueOf(r1)     // Catch:{ all -> 0x0366 }
            java.util.Map r1 = r5.A0E     // Catch:{ all -> 0x0366 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r7)     // Catch:{ all -> 0x0366 }
            r1.put(r0, r2)     // Catch:{ all -> 0x0366 }
            X.1mm r0 = r5.A03     // Catch:{ all -> 0x0366 }
            r0.A04()     // Catch:{ all -> 0x0366 }
            r6.A00(r7)     // Catch:{ all -> 0x0366 }
        L_0x0364:
            monitor-exit(r5)
            return
        L_0x0366:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0368 }
        L_0x0368:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C201611b.A01(X.2gi, boolean, boolean, boolean):void");
    }
}
