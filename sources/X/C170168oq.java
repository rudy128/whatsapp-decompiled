package X;

import java.io.File;
import java.util.ArrayList;

/* renamed from: X.8oq  reason: invalid class name and case insensitive filesystem */
public final class C170168oq extends AnonymousClass1NZ {
    public boolean A00;
    public final AnonymousClass1NP A01;
    public final AnonymousClass118 A02;
    public final AnonymousClass11O A03;
    public final C18030ve A04;
    public final AnonymousClass00H A05;
    public final AnonymousClass00H A06;

    public ArrayList A0N(File file) {
        C18070vi.A0d(file, 0);
        return AnonymousClass8BU.A0v(file, "backup_settings.json", A3K.A02(AnonymousClass9JN.CRYPT14));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00ed, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:?, code lost:
        X.CDX.A00(r5, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00f1, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized boolean A0S(X.C171768sF r12, java.io.File r13) {
        /*
            r11 = this;
            monitor-enter(r11)
            r2 = 1
            X.C18070vi.A0d(r13, r2)     // Catch:{ all -> 0x010f }
            r8 = 0
            X.17y r0 = r11.A04     // Catch:{ Exception -> 0x00f9 }
            java.lang.String r3 = "backup_settings.json"
            java.io.File r7 = r0.A00(r3)     // Catch:{ Exception -> 0x00f9 }
            r13.length()     // Catch:{ Exception -> 0x00f9 }
            X.00H r0 = r11.A05     // Catch:{ Exception -> 0x00f9 }
            java.lang.Object r1 = r0.get()     // Catch:{ Exception -> 0x00f9 }
            X.9mv r1 = (X.C191639mv) r1     // Catch:{ Exception -> 0x00f9 }
            java.lang.String r0 = X.AnonymousClass8BS.A0i(r13)     // Catch:{ Exception -> 0x00f9 }
            int r0 = X.A3K.A00(r0, r3)     // Catch:{ Exception -> 0x00f9 }
            if (r0 <= 0) goto L_0x0037
            X.9JN r0 = X.AnonymousClass9JN.A02(r0)     // Catch:{ Exception -> 0x00f9 }
            if (r0 == 0) goto L_0x0037
        L_0x0029:
            r6 = 0
            X.A5N r4 = r1.A00(r6, r0, r13, r8)     // Catch:{ Exception -> 0x00f9 }
            X.118 r5 = r11.A02     // Catch:{ Exception -> 0x00f9 }
            r10 = r8
            r9 = r8
            X.9jz r4 = r4.A07(r5, r6, r7, r8, r9, r10)     // Catch:{ Exception -> 0x00f9 }
            goto L_0x003a
        L_0x0037:
            X.9JN r0 = X.AnonymousClass9JN.UNENCRYPTED     // Catch:{ Exception -> 0x00f9 }
            goto L_0x0029
        L_0x003a:
            java.io.FileInputStream r5 = X.C108945cZ.A18(r7)     // Catch:{ Exception -> 0x00f2 }
            org.json.JSONObject r7 = X.AnonymousClass1EY.A01(r5)     // Catch:{ all -> 0x00eb }
            if (r7 != 0) goto L_0x004e
            java.lang.String r0 = "backup_settings/restore/could not read JSON metadata from the backup file"
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ all -> 0x00eb }
            r5.close()     // Catch:{ Exception -> 0x00f2 }
            goto L_0x010d
        L_0x004e:
            java.lang.String r1 = "backupFrequency"
            boolean r0 = r7.has(r1)     // Catch:{ all -> 0x00eb }
            if (r0 == 0) goto L_0x0061
            int r1 = r7.getInt(r1)     // Catch:{ all -> 0x00eb }
            if (r1 < 0) goto L_0x0061
            X.1NP r0 = r11.A01     // Catch:{ all -> 0x00eb }
            r0.A0G(r1)     // Catch:{ all -> 0x00eb }
        L_0x0061:
            java.lang.String r1 = "backupNetworkSettings"
            boolean r0 = r7.has(r1)     // Catch:{ all -> 0x00eb }
            if (r0 == 0) goto L_0x007e
            int r6 = r7.getInt(r1)     // Catch:{ all -> 0x00eb }
            if (r6 < 0) goto L_0x007e
            X.1NP r0 = r11.A01     // Catch:{ all -> 0x00eb }
            android.content.SharedPreferences$Editor r3 = X.AnonymousClass8BT.A04(r0)     // Catch:{ all -> 0x00eb }
            java.lang.String r1 = "interface_gdrive_backup_network_setting"
            java.lang.String r0 = java.lang.String.valueOf(r6)     // Catch:{ all -> 0x00eb }
            X.C17880vN.A1E(r3, r1, r0)     // Catch:{ all -> 0x00eb }
        L_0x007e:
            java.lang.String r3 = "includeVideosInBackup"
            boolean r0 = r7.has(r3)     // Catch:{ all -> 0x00eb }
            if (r0 == 0) goto L_0x008f
            X.1NP r1 = r11.A01     // Catch:{ all -> 0x00eb }
            boolean r0 = r7.getBoolean(r3)     // Catch:{ all -> 0x00eb }
            r1.A0O(r0)     // Catch:{ all -> 0x00eb }
        L_0x008f:
            X.00H r0 = r11.A06     // Catch:{ all -> 0x00eb }
            java.util.Iterator r6 = X.C17890vO.A0h(r0)     // Catch:{ all -> 0x00eb }
        L_0x0095:
            boolean r0 = r6.hasNext()     // Catch:{ all -> 0x00eb }
            if (r0 == 0) goto L_0x00b4
            java.lang.Object r3 = r6.next()     // Catch:{ all -> 0x00eb }
            X.0z4 r3 = (X.C19830z4) r3     // Catch:{ all -> 0x00eb }
            java.lang.String r1 = "localSettings"
            boolean r0 = r7.has(r1)     // Catch:{ all -> 0x00eb }
            if (r0 == 0) goto L_0x0095
            org.json.JSONObject r0 = r7.getJSONObject(r1)     // Catch:{ all -> 0x00eb }
            X.C18070vi.A0b(r0)     // Catch:{ all -> 0x00eb }
            r3.A1z(r0)     // Catch:{ all -> 0x00eb }
            goto L_0x0095
        L_0x00b4:
            java.lang.String r1 = "night_mode_settings"
            boolean r0 = r7.has(r1)     // Catch:{ all -> 0x00eb }
            if (r0 == 0) goto L_0x00d5
            int r3 = r7.getInt(r1)     // Catch:{ all -> 0x00eb }
            X.11O r1 = r11.A03     // Catch:{ all -> 0x00eb }
            int r0 = r1.A00()     // Catch:{ all -> 0x00eb }
            if (r3 == r0) goto L_0x00d5
            android.content.SharedPreferences r0 = r1.A00     // Catch:{ all -> 0x00eb }
            android.content.SharedPreferences$Editor r1 = r0.edit()     // Catch:{ all -> 0x00eb }
            java.lang.String r0 = "night_mode"
            X.C17880vN.A1C(r1, r0, r3)     // Catch:{ all -> 0x00eb }
            r11.A00 = r2     // Catch:{ all -> 0x00eb }
        L_0x00d5:
            r5.close()     // Catch:{ Exception -> 0x00f2 }
            if (r12 == 0) goto L_0x00e6
            int r0 = r4.A00     // Catch:{ Exception -> 0x00f9 }
            int r0 = X.A3O.A00(r0)     // Catch:{ Exception -> 0x00f9 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ Exception -> 0x00f9 }
            r12.A01 = r0     // Catch:{ Exception -> 0x00f9 }
        L_0x00e6:
            int r0 = r4.A00     // Catch:{ Exception -> 0x00f9 }
            if (r0 != r2) goto L_0x010d
            goto L_0x010c
        L_0x00eb:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00ed }
        L_0x00ed:
            r0 = move-exception
            X.CDX.A00(r5, r1)     // Catch:{ Exception -> 0x00f2 }
            throw r0     // Catch:{ Exception -> 0x00f2 }
        L_0x00f2:
            r1 = move-exception
            java.lang.String r0 = "backup_settings/backup/exception while reading temp JSON file"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ Exception -> 0x00f9 }
            goto L_0x010d
        L_0x00f9:
            r1 = move-exception
            java.lang.String r0 = "backup_settings/restore/error"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x010f }
            if (r12 == 0) goto L_0x010d
            int r0 = X.A3O.A02(r1)     // Catch:{ all -> 0x010f }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x010f }
            r12.A01 = r0     // Catch:{ all -> 0x010f }
            goto L_0x010d
        L_0x010c:
            r8 = 1
        L_0x010d:
            monitor-exit(r11)
            return r8
        L_0x010f:
            r0 = move-exception
            monitor-exit(r11)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C170168oq.A0S(X.8sF, java.io.File):boolean");
    }

    public void A0H() {
        if (this.A00) {
            AnonymousClass013.A03(this.A03.A00());
            this.A00 = false;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:57:0x014d, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:?, code lost:
        X.CDX.A00(r9, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0151, code lost:
        throw r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0154, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:?, code lost:
        X.CDX.A00(r8, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0158, code lost:
        throw r3;
     */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0135  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0136  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.A26 A0T(X.C171828sL r21, X.AnonymousClass9JN r22) {
        /*
            r20 = this;
            r1 = r21
            r7 = r22
            X.C18070vi.A0h(r7, r1)
            java.lang.String r12 = "backup-settings"
            X.1Ez r2 = new X.1Ez
            r2.<init>((java.lang.String) r12)
            r0 = r20
            monitor-enter(r0)
            X.17y r4 = r0.A04     // Catch:{ all -> 0x0181 }
            java.lang.String r3 = "backup_settings.json"
            java.io.File r6 = r4.A00(r3)     // Catch:{ all -> 0x0181 }
            java.io.FileOutputStream r8 = X.C108945cZ.A19(r6)     // Catch:{ Exception -> 0x0159 }
            java.lang.String r3 = X.C19620yd.A0A     // Catch:{ all -> 0x0152 }
            java.io.OutputStreamWriter r9 = new java.io.OutputStreamWriter     // Catch:{ all -> 0x0152 }
            r9.<init>(r8, r3)     // Catch:{ all -> 0x0152 }
            java.util.HashMap r5 = X.C17880vN.A11()     // Catch:{ all -> 0x014b }
            X.1NP r3 = r0.A01     // Catch:{ all -> 0x014b }
            X.AQW.A00(r3, r5)     // Catch:{ all -> 0x014b }
            X.00H r3 = r0.A06     // Catch:{ all -> 0x014b }
            java.util.Iterator r11 = X.C17890vO.A0h(r3)     // Catch:{ all -> 0x014b }
        L_0x0033:
            boolean r3 = r11.hasNext()     // Catch:{ all -> 0x014b }
            if (r3 == 0) goto L_0x004e
            java.lang.Object r3 = r11.next()     // Catch:{ all -> 0x014b }
            X.0z4 r3 = (X.C19830z4) r3     // Catch:{ all -> 0x014b }
            java.util.LinkedHashMap r10 = X.AnonymousClass9QA.A00(r3)     // Catch:{ all -> 0x014b }
            java.lang.String r4 = "localSettings"
            X.AQX r3 = new X.AQX     // Catch:{ all -> 0x014b }
            r3.<init>(r10)     // Catch:{ all -> 0x014b }
            r5.put(r4, r3)     // Catch:{ all -> 0x014b }
            goto L_0x0033
        L_0x004e:
            X.11O r3 = r0.A03     // Catch:{ all -> 0x014b }
            int r3 = r3.A00()     // Catch:{ all -> 0x014b }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x014b }
            X.AQU r4 = new X.AQU     // Catch:{ all -> 0x014b }
            r4.<init>(r3)     // Catch:{ all -> 0x014b }
            java.lang.String r3 = "night_mode_settings"
            r5.put(r3, r4)     // Catch:{ all -> 0x014b }
            org.json.JSONObject r3 = X.AQX.A00(r5)     // Catch:{ all -> 0x014b }
            r5 = 2
            java.lang.String r3 = r3.toString(r5)     // Catch:{ all -> 0x014b }
            r9.write(r3)     // Catch:{ all -> 0x014b }
            r11 = 0
            r9.close()     // Catch:{ all -> 0x0152 }
            r8.close()     // Catch:{ Exception -> 0x0159 }
            java.lang.StringBuilder r4 = X.AnonymousClass000.A10()     // Catch:{ Exception -> 0x0120 }
            java.lang.String r3 = "backup_settings.json.crypt"
            r4.append(r3)     // Catch:{ Exception -> 0x0120 }
            int r3 = r7.version     // Catch:{ Exception -> 0x0120 }
            java.lang.String r4 = X.C17880vN.A0t(r4, r3)     // Catch:{ Exception -> 0x0120 }
            java.io.File r3 = r0.A0G(r7)     // Catch:{ Exception -> 0x0120 }
            java.io.File r10 = X.C17880vN.A0e(r3, r4)     // Catch:{ Exception -> 0x0120 }
            java.lang.StringBuilder r4 = X.AnonymousClass000.A10()     // Catch:{ Exception -> 0x011d }
            java.lang.String r3 = "backup_settings/backup/to "
            X.C17900vP.A0Y(r10, r3, r4)     // Catch:{ Exception -> 0x011d }
            X.00H r3 = r0.A05     // Catch:{ Exception -> 0x011d }
            java.lang.Object r3 = r3.get()     // Catch:{ Exception -> 0x011d }
            X.9mv r3 = (X.C191639mv) r3     // Catch:{ Exception -> 0x011d }
            r13 = 0
            X.A5N r4 = r3.A00(r11, r7, r10, r13)     // Catch:{ Exception -> 0x011d }
            X.0ve r9 = r0.A04     // Catch:{ Exception -> 0x011d }
            r8 = 8968(0x2308, float:1.2567E-41)
            X.0vf r3 = X.C18040vf.A02     // Catch:{ Exception -> 0x011d }
            boolean r3 = X.C18020vd.A05(r3, r9, r8)     // Catch:{ Exception -> 0x011d }
            if (r3 == 0) goto L_0x00eb
            X.118 r3 = r0.A02     // Catch:{ Exception -> 0x011d }
            android.content.Context r8 = r3.A00     // Catch:{ Exception -> 0x011d }
            boolean r3 = r4.A09(r8, r6)     // Catch:{ Exception -> 0x011d }
            if (r3 == 0) goto L_0x00cd
            java.lang.String r3 = "backup_settings/backup/skip backup because backup file has the same source file"
            com.whatsapp.util.Log.i((java.lang.String) r3)     // Catch:{ Exception -> 0x011d }
            r18 = 0
            X.A26 r9 = new X.A26     // Catch:{ Exception -> 0x011d }
            r15 = r11
            r13 = r9
            r14 = r11
            r16 = r12
            r17 = r5
            r13.<init>(r14, r15, r16, r17, r18)     // Catch:{ Exception -> 0x011d }
            goto L_0x016d
        L_0x00cd:
            boolean r3 = r4.A0A(r8, r6)     // Catch:{ Exception -> 0x011d }
            if (r3 != 0) goto L_0x010c
            java.lang.String r3 = "backup_settings/backup/prepare for backup failed"
            com.whatsapp.util.Log.w((java.lang.String) r3)     // Catch:{ Exception -> 0x011d }
            X.C64062u9.A0Q(r10)     // Catch:{ Exception -> 0x011d }
            r17 = 1
            r18 = 0
            X.A26 r9 = new X.A26     // Catch:{ Exception -> 0x011d }
            r15 = r11
            r13 = r9
            r14 = r11
            r16 = r12
            r13.<init>(r14, r15, r16, r17, r18)     // Catch:{ Exception -> 0x011d }
            goto L_0x016d
        L_0x00eb:
            X.118 r3 = r0.A02     // Catch:{ Exception -> 0x011d }
            android.content.Context r3 = r3.A00     // Catch:{ Exception -> 0x011d }
            boolean r3 = r4.A0A(r3, r11)     // Catch:{ Exception -> 0x011d }
            if (r3 != 0) goto L_0x010c
            java.lang.String r3 = "backup_settings/backup/prepare for backup failed"
            com.whatsapp.util.Log.w((java.lang.String) r3)     // Catch:{ Exception -> 0x011d }
            X.C64062u9.A0Q(r10)     // Catch:{ Exception -> 0x011d }
            r17 = 1
            r18 = 0
            X.A26 r9 = new X.A26     // Catch:{ Exception -> 0x011d }
            r15 = r11
            r13 = r9
            r14 = r11
            r16 = r12
            r13.<init>(r14, r15, r16, r17, r18)     // Catch:{ Exception -> 0x011d }
            goto L_0x016d
        L_0x010c:
            r4.A08(r11, r6)     // Catch:{ Exception -> 0x011d }
            java.io.File r3 = r0.A0G(r7)     // Catch:{ all -> 0x0181 }
            long r14 = r0.A0E(r3)     // Catch:{ all -> 0x0181 }
            X.A26 r9 = new X.A26     // Catch:{ all -> 0x0181 }
            r9.<init>(r10, r11, r12, r13, r14)     // Catch:{ all -> 0x0181 }
            goto L_0x016d
        L_0x011d:
            r4 = move-exception
            r11 = r10
            goto L_0x0121
        L_0x0120:
            r4 = move-exception
        L_0x0121:
            boolean r3 = r4 instanceof java.io.IOException     // Catch:{ all -> 0x0181 }
            if (r3 != 0) goto L_0x0136
            boolean r3 = r4 instanceof javax.crypto.NoSuchPaddingException     // Catch:{ all -> 0x0181 }
            if (r3 != 0) goto L_0x0136
            boolean r3 = r4 instanceof java.security.NoSuchAlgorithmException     // Catch:{ all -> 0x0181 }
            if (r3 != 0) goto L_0x0136
            boolean r3 = r4 instanceof java.security.InvalidAlgorithmParameterException     // Catch:{ all -> 0x0181 }
            if (r3 != 0) goto L_0x0136
            boolean r3 = r4 instanceof java.security.InvalidKeyException     // Catch:{ all -> 0x0181 }
            if (r3 != 0) goto L_0x0136
            throw r4     // Catch:{ all -> 0x0181 }
        L_0x0136:
            java.lang.String r3 = "backup_settings/backup failed"
            com.whatsapp.util.Log.e(r3, r4)     // Catch:{ all -> 0x0181 }
            if (r11 == 0) goto L_0x0140
            X.C64062u9.A0Q(r11)     // Catch:{ all -> 0x0181 }
        L_0x0140:
            r10 = 0
            r13 = 1
            r14 = 0
            X.A26 r9 = new X.A26     // Catch:{ all -> 0x0181 }
            r11 = r10
            r9.<init>(r10, r11, r12, r13, r14)     // Catch:{ all -> 0x0181 }
            goto L_0x016d
        L_0x014b:
            r4 = move-exception
            throw r4     // Catch:{ all -> 0x014d }
        L_0x014d:
            r3 = move-exception
            X.CDX.A00(r9, r4)     // Catch:{ all -> 0x0152 }
            throw r3     // Catch:{ all -> 0x0152 }
        L_0x0152:
            r4 = move-exception
            throw r4     // Catch:{ all -> 0x0154 }
        L_0x0154:
            r3 = move-exception
            X.CDX.A00(r8, r4)     // Catch:{ Exception -> 0x0159 }
            throw r3     // Catch:{ Exception -> 0x0159 }
        L_0x0159:
            r5 = move-exception
            java.lang.StringBuilder r4 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x0181 }
            java.lang.String r3 = "backup_settings/backup/exception while writing to temp file "
            X.C108995ce.A1J(r6, r3, r4, r5)     // Catch:{ all -> 0x0181 }
            r10 = 0
            r13 = 1
            r14 = 0
            X.A26 r9 = new X.A26     // Catch:{ all -> 0x0181 }
            r11 = r10
            r9.<init>(r10, r11, r12, r13, r14)     // Catch:{ all -> 0x0181 }
        L_0x016d:
            monitor-exit(r0)
            int r0 = r9.A01
            int r0 = X.A3O.A01(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.A03 = r0
            java.lang.Long r0 = X.AnonymousClass8BT.A0n(r2)
            r1.A0F = r0
            return r9
        L_0x0181:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C170168oq.A0T(X.8sL, X.9JN):X.A26");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C170168oq(AnonymousClass1NP r2, AnonymousClass118 r3, AnonymousClass11O r4, AnonymousClass1NX r5, C18030ve r6, AnonymousClass00H r7, AnonymousClass00H r8) {
        super(r5);
        C18070vi.A0w(r3, r6, r7, r2, r4);
        C18070vi.A0d(r8, 6);
        this.A02 = r3;
        this.A04 = r6;
        this.A05 = r7;
        this.A01 = r2;
        this.A03 = r4;
        this.A06 = r8;
    }

    public void A0K(C171768sF r2, long j) {
        r2.A0A = Long.valueOf(j);
    }

    public String A0M() {
        return "backup-settings";
    }

    public void A0O(C171878sQ r2, double d) {
        r2.A0F = AnonymousClass8BW.A0Y(d);
    }

    public void A0P(C171878sQ r2, double d) {
        r2.A0G = AnonymousClass8BW.A0Y(d);
    }

    public void A0Q(C171878sQ r2, double d) {
        r2.A0E = AnonymousClass8BW.A0Y(d);
    }
}
