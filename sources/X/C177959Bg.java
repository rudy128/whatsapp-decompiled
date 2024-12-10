package X;

import android.accounts.Account;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import com.whatsapp.backup.google.RestoreFromBackupActivity;
import com.whatsapp.dialogs.PromptDialogFragment;
import com.whatsapp.util.Log;
import java.lang.ref.WeakReference;
import java.util.Locale;
import java.util.Set;
import java.util.Timer;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.9Bg  reason: invalid class name and case insensitive filesystem */
public class C177959Bg extends A34 {
    public final AnonymousClass1KB A00;
    public final C36801oU A01;
    public final C188789hz A02;
    public final AnonymousClass118 A03;
    public final C19830z4 A04;
    public final C27431Wb A05;
    public final AnonymousClass1Ez A06 = new AnonymousClass1Ez("gdrive-activity/one-time-setup");
    public final WeakReference A07;
    public final Set A08;
    public final Timer A09 = new Timer("perform-one-time-setup");
    public final AtomicBoolean A0A;
    public final AtomicBoolean A0B;
    public final Account[] A0C;
    public final AnonymousClass1L7 A0D;

    public static void A00(C188789hz r1, boolean z) {
        ((AnonymousClass1NP) r1.A0H.get()).A07().edit().putBoolean("gdrive_restore_overwrite_local_files", z).apply();
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(15:90|91|(5:93|(5:96|(1:98)(1:104)|99|(1:199)|94)|200|101|(6:103|105|121|(1:123)(1:124)|125|126))|106|(4:109|(2:111|204)(1:203)|201|107)|202|112|(4:115|(2:117|208)(1:207)|205|113)|206|118|(1:120)|121|(0)(0)|125|126) */
    /* JADX WARNING: Code restructure failed: missing block: B:100:0x022b, code lost:
        if (r2.remove(r0) == false) goto L_0x022d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x0231, code lost:
        if (r2.isEmpty() != false) goto L_0x0233;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x0233, code lost:
        com.whatsapp.util.Log.i("GoogleBackupUtils/isRemoteTheLatest local and remote are the same");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x0239, code lost:
        r0 = r1.A03;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x023c, code lost:
        r4 = 5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x023e, code lost:
        r17 = r17.iterator();
        r4 = 0;
        r2 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x024a, code lost:
        if (r17.hasNext() != false) goto L_0x024c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x024c, code lost:
        r0 = X.AnonymousClass8BR.A0I(r17).A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x0254, code lost:
        if (r0 > r2) goto L_0x0256;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x0256, code lost:
        r2 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x0258, code lost:
        r1 = r11.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x0260, code lost:
        if (r1.hasNext() != false) goto L_0x0262;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x0262, code lost:
        r16 = X.AnonymousClass8BS.A0T(r1).lastModified();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x026c, code lost:
        if (r16 > r4) goto L_0x026e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x026e, code lost:
        r4 = r16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x0271, code lost:
        r1 = X.AnonymousClass000.A10();
        r1.append("GoogleBackupUtils/isRemoteTheLatest remote: ");
        r1.append(r2);
        X.C17900vP.A0m(" local: ", r1, r4);
        r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1));
        r4 = 7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x0285, code lost:
        if (r0 > 0) goto L_0x0287;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x0287, code lost:
        r4 = 6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x0288, code lost:
        r1 = X.AnonymousClass000.A10();
        r1.append("restore>BackupApiBackupSelector/decideLocalVsRemotePreference/backup state: ");
        r0 = java.lang.Integer.valueOf(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x0295, code lost:
        if (r0 != null) goto L_0x0299;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x0297, code lost:
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x0299, code lost:
        r0 = r0.toString();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x029d, code lost:
        X.C17890vO.A1A(r1, r0);
        r3 = 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x02a3, code lost:
        switch(r4) {
            case 2: goto L_0x02ab;
            case 3: goto L_0x02b7;
            case 4: goto L_0x02d5;
            case 5: goto L_0x02d0;
            case 6: goto L_0x02b0;
            default: goto L_0x02a6;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x02a6, code lost:
        A00(r7, false);
        r0 = 7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x02ab, code lost:
        A00(r7, true);
        r0 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x02b0, code lost:
        A00(r7, true);
        r0 = 6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x02b4, code lost:
        r13.A00 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x02b7, code lost:
        A00(r7, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x02ca, code lost:
        if (X.C20134A8u.A0A(r13, r7.A0A.A0m(), r11, r7.A0K.get()) != false) goto L_0x02cc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x02cc, code lost:
        r3 = 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x02cd, code lost:
        r13.A00 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x02d0, code lost:
        A00(r7, false);
        r0 = 5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x02d5, code lost:
        r13.A00 = 4;
        A00(r7, true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x02da, code lost:
        r4 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x02dc, code lost:
        r13.A00 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x02de, code lost:
        r4 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x02e3, code lost:
        if (r11.size() <= 0) goto L_0x031f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x02e5, code lost:
        r0 = (java.io.File) r11.get(0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x02eb, code lost:
        if (r0 == null) goto L_0x031f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x02f7, code lost:
        if (X.AnonymousClass9QI.A00(r0.getName()) != X.AnonymousClass9JN.CRYPT15) goto L_0x031f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x02f9, code lost:
        r6 = new X.C195999uI((X.C19986A1x) null, true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x02ff, code lost:
        r15.A02();
        r2 = new X.C58582kv();
        r7.A0G.CGF(new X.C21437Ak4(r7, r8, r14, r2, 3, r4));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x031f, code lost:
        r6 = new X.C195999uI((X.C19986A1x) null, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:?, code lost:
        r1 = r2.A02;
        r1.lockInterruptibly();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:?, code lost:
        r0 = r2.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x032c, code lost:
        if (r0 != null) goto L_0x0334;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x032e, code lost:
        r2.A01.await();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:?, code lost:
        r1.unlock();
        r5 = X.AnonymousClass000.A1Y(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x033c, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x033d, code lost:
        r1.unlock();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x0340, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x0341, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:?, code lost:
        com.whatsapp.util.Log.e((java.lang.Throwable) r0);
        r5 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:182:0x03b7, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:183:0x03b8, code lost:
        com.whatsapp.util.Log.e("restore>BackupApiBackupSelector/decide", r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x017a, code lost:
        if (r8 != null) goto L_0x0195;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x017c, code lost:
        r4 = r7.A0B;
        r4.set(X.C20134A8u.A0A(r36, r35.A0m(), r36.A0K(), r4.get()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0195, code lost:
        r7 = r8.A02;
        X.C17960vV.A00();
        r15 = new X.AnonymousClass1Ez("restore>BackupApiBackupSelector/decide");
        r10 = r8.A01;
        r6 = r10.A02();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:?, code lost:
        r14 = X.C20127A8m.A04(r7.A06, r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x01ad, code lost:
        if (r14 == null) goto L_0x03bd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:?, code lost:
        r13 = r7.A0B;
        r11 = r13.A0K();
        r17 = X.C20127A8m.A03(r14);
        r4 = r7.A08;
        r3 = r7.A02;
        X.C18070vi.A0k(r4, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x01c4, code lost:
        if (r11.isEmpty() == false) goto L_0x01cf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x01ca, code lost:
        if (r17.isEmpty() == false) goto L_0x01cf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x01cc, code lost:
        r4 = 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x01d3, code lost:
        if (r11.isEmpty() == false) goto L_0x01d8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x01d5, code lost:
        r4 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x01dc, code lost:
        if (r17.isEmpty() == false) goto L_0x01e1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x01de, code lost:
        r4 = 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x01e9, code lost:
        if (r17.size() != r11.size()) goto L_0x023e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x01eb, code lost:
        r2 = X.AnonymousClass000.A13();
        r16 = r11.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x01f7, code lost:
        if (r16.hasNext() == false) goto L_0x0209;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x01f9, code lost:
        r5 = X.AnonymousClass8BS.A0T(r16);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:?, code lost:
        r2.add(X.C41361wE.A05(r3, r4, r5, r5.length()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x0211, code lost:
        if (r17.size() == r2.size()) goto L_0x0213;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x0213, code lost:
        r3 = r17.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x021b, code lost:
        if (r3.hasNext() != false) goto L_0x021d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x021d, code lost:
        r1 = X.AnonymousClass8BR.A0I(r3);
        r0 = r1.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x0223, code lost:
        if (r0 != null) goto L_0x0225;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x0225, code lost:
        r0 = r0.A03;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:90:0x0209 */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x0297 A[Catch:{ 8ge | 8gg | 8gn | 8go -> 0x0159, all -> 0x03c2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x0299 A[Catch:{ 8ge | 8gg | 8gn | 8go -> 0x0159, all -> 0x03c2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x02a6 A[Catch:{ 8ge | 8gg | 8gn | 8go -> 0x0159, all -> 0x03c2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x02ab A[Catch:{ 8ge | 8gg | 8gn | 8go -> 0x0159, all -> 0x03c2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x02b0 A[Catch:{ 8ge | 8gg | 8gn | 8go -> 0x0159, all -> 0x03c2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x02b7 A[Catch:{ 8ge | 8gg | 8gn | 8go -> 0x0159, all -> 0x03c2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x02d0 A[Catch:{ 8ge | 8gg | 8gn | 8go -> 0x0159, all -> 0x03c2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x02d5 A[Catch:{ 8ge | 8gg | 8gn | 8go -> 0x0159, all -> 0x03c2 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object A0G(java.lang.Object[] r38) {
        /*
            r37 = this;
            r7 = r37
            java.lang.ref.WeakReference r0 = r7.A07
            java.lang.Object r0 = r0.get()
            if (r0 != 0) goto L_0x000c
            r12 = 0
            return r12
        L_0x000c:
            X.C17960vV.A00()
            X.1Wb r0 = r7.A05
            r36 = r0
            X.0z4 r0 = r7.A04
            r35 = r0
            X.00H r0 = X.C20134A8u.A00
            X.118 r0 = r7.A03
            android.content.Context r0 = r0.A00
            int r1 = X.C41371wF.A00(r0)
            r0 = 0
            if (r1 != 0) goto L_0x0025
            r0 = 1
        L_0x0025:
            r12 = 0
            if (r0 != 0) goto L_0x002e
            java.lang.String r0 = "restore>AccountWithLatestGoogleDriveBackupFetcher/one-time-setup/google-play-services-not-available"
        L_0x002a:
            com.whatsapp.util.Log.i((java.lang.String) r0)
            return r12
        L_0x002e:
            java.lang.String r19 = r35.A0m()
            boolean r0 = android.text.TextUtils.isEmpty(r19)
            if (r0 == 0) goto L_0x003b
            java.lang.String r0 = "restore>AccountWithLatestGoogleDriveBackupFetcher/one-time-setup/jid-user is null"
            goto L_0x002a
        L_0x003b:
            X.1oU r1 = r7.A01
            java.util.concurrent.atomic.AtomicBoolean r9 = r1.A0X
            r0 = 1
            r9.set(r0)
            r1.A08()
            r1.A07()
            r1.A0A()
            android.accounts.Account[] r6 = r7.A0C     // Catch:{ all -> 0x03c2 }
            int r5 = r6.length     // Catch:{ all -> 0x03c2 }
            r4 = 0
            r8 = r12
        L_0x0051:
            if (r4 >= r5) goto L_0x017a
            r11 = r6[r4]     // Catch:{ all -> 0x03c2 }
            java.util.concurrent.atomic.AtomicBoolean r0 = r7.A0A     // Catch:{ all -> 0x03c2 }
            boolean r0 = r0.get()     // Catch:{ all -> 0x03c2 }
            if (r0 == 0) goto L_0x0064
            java.lang.String r0 = "restore>AccountWithLatestGoogleDriveBackupFetcher/one-time-setup/canceled"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x03c2 }
            goto L_0x03bd
        L_0x0064:
            java.util.Set r3 = r7.A08     // Catch:{ all -> 0x03c2 }
            boolean r0 = r3.contains(r11)     // Catch:{ all -> 0x03c2 }
            if (r0 == 0) goto L_0x0080
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x03c2 }
            java.lang.String r0 = "one-time-setup/skipping-account-with-no-backup/"
            r1.append(r0)     // Catch:{ all -> 0x03c2 }
            java.lang.String r0 = r11.name     // Catch:{ all -> 0x03c2 }
            java.lang.String r0 = X.C41361wE.A08(r0)     // Catch:{ all -> 0x03c2 }
            X.C17890vO.A1A(r1, r0)     // Catch:{ all -> 0x03c2 }
            goto L_0x0176
        L_0x0080:
            java.lang.String r10 = r11.name     // Catch:{ all -> 0x03c2 }
            X.C41361wE.A08(r10)     // Catch:{ all -> 0x03c2 }
            X.9hz r2 = r7.A02     // Catch:{ 8ge -> 0x013b }
            android.util.Pair r0 = X.A7X.A0J     // Catch:{ 8ge -> 0x013b }
            X.118 r0 = r2.A09     // Catch:{ 8ge -> 0x013b }
            android.content.Context r0 = r0.A00     // Catch:{ 8ge -> 0x013b }
            r21 = r0
            X.0ve r0 = r2.A0C     // Catch:{ 8ge -> 0x013b }
            r28 = r0
            X.11W r0 = r2.A0F     // Catch:{ 8ge -> 0x013b }
            r31 = r0
            X.181 r0 = r2.A01     // Catch:{ 8ge -> 0x013b }
            r22 = r0
            X.1L7 r0 = r2.A08     // Catch:{ 8ge -> 0x013b }
            r27 = r0
            X.1NT r0 = r2.A04     // Catch:{ 8ge -> 0x013b }
            r18 = r0
            X.9uB r0 = r2.A0D     // Catch:{ 8ge -> 0x013b }
            r17 = r0
            X.A0f r0 = r2.A05     // Catch:{ 8ge -> 0x013b }
            r16 = r0
            X.1NL r15 = r2.A0E     // Catch:{ 8ge -> 0x013b }
            X.1NW r14 = r2.A02     // Catch:{ 8ge -> 0x013b }
            X.11E r13 = r2.A07     // Catch:{ 8ge -> 0x013b }
            X.10I r1 = r2.A0G     // Catch:{ 8ge -> 0x013b }
            java.lang.String r34 = "restore"
            X.A7X r0 = new X.A7X     // Catch:{ 8ge -> 0x013b }
            r20 = r0
            r23 = r14
            r24 = r18
            r25 = r16
            r26 = r13
            r29 = r17
            r30 = r15
            r32 = r1
            r33 = r10
            r20.<init>(r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34)     // Catch:{ 8ge -> 0x013b }
            X.1oW r14 = r2.A06     // Catch:{ all -> 0x0139 }
            r15 = 5
            r1 = 1
            X.C18070vi.A0d(r14, r1)     // Catch:{ all -> 0x0139 }
            X.8gC r13 = new X.8gC     // Catch:{ all -> 0x0139 }
            r13.<init>(r0)     // Catch:{ all -> 0x0139 }
            java.lang.String r1 = "gdrive-backup-util/fetch-token"
            java.lang.Object r1 = X.A84.A01(r13, r14, r1, r15)     // Catch:{ all -> 0x0139 }
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch:{ all -> 0x0139 }
            if (r1 == 0) goto L_0x0133
            boolean r1 = r1.booleanValue()     // Catch:{ all -> 0x0139 }
            if (r1 == 0) goto L_0x0133
            java.lang.String r13 = "restore>BackupApiBackupSelector/create-internal-data"
            r1 = r19
            X.A2x r14 = X.C20127A8m.A01(r14, r0, r1, r13)     // Catch:{ all -> 0x0139 }
            if (r14 == 0) goto L_0x014c
            org.json.JSONObject r15 = r14.A0A     // Catch:{ all -> 0x0139 }
            r0 = -1
            if (r15 == 0) goto L_0x012d
            java.lang.String r13 = "chatdbSize"
            long r17 = r15.optLong(r13, r0)     // Catch:{ all -> 0x0139 }
            r15 = 0
            int r0 = (r17 > r15 ? 1 : (r17 == r15 ? 0 : -1))
            if (r0 <= 0) goto L_0x012d
            X.A0e r1 = r2.A03     // Catch:{ all -> 0x0139 }
            org.json.JSONObject r0 = r14.A04()     // Catch:{ all -> 0x0139 }
            boolean r0 = r1.A02(r0)     // Catch:{ all -> 0x0139 }
            if (r0 == 0) goto L_0x014c
            X.8g6 r13 = new X.8g6     // Catch:{ all -> 0x0139 }
            r13.<init>(r14, r2)     // Catch:{ all -> 0x0139 }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ 8gn -> 0x015f, 8go -> 0x015d, 8gg -> 0x015b, 8ge -> 0x0159 }
            java.lang.String r0 = "restore>AccountWithLatestGoogleDriveBackupFetcher/one-time-setup "
            X.AnonymousClass8BV.A1L(r0, r10, r1)     // Catch:{ 8gn -> 0x015f, 8go -> 0x015d, 8gg -> 0x015b, 8ge -> 0x0159 }
            java.lang.String r0 = " has google backup created on "
            r1.append(r0)     // Catch:{ 8gn -> 0x015f, 8go -> 0x015d, 8gg -> 0x015b, 8ge -> 0x0159 }
            long r2 = r13.A04     // Catch:{ 8gn -> 0x015f, 8go -> 0x015d, 8gg -> 0x015b, 8ge -> 0x0159 }
            X.C17890vO.A16(r1, r2)     // Catch:{ 8gn -> 0x015f, 8go -> 0x015d, 8gg -> 0x015b, 8ge -> 0x0159 }
            if (r8 == 0) goto L_0x0175
            long r0 = r8.A04     // Catch:{ 8gn -> 0x015f, 8go -> 0x015d, 8gg -> 0x015b, 8ge -> 0x0159 }
            goto L_0x0171
        L_0x012d:
            java.lang.String r0 = "restore>BackupApiBackupSelector/backup is not valid, its chat db size is 0"
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ all -> 0x0139 }
            goto L_0x014c
        L_0x0133:
            X.8go r0 = new X.8go     // Catch:{ all -> 0x0139 }
            r0.<init>(r12)     // Catch:{ all -> 0x0139 }
            throw r0     // Catch:{ all -> 0x0139 }
        L_0x0139:
            r0 = move-exception
            throw r0     // Catch:{ 8ge -> 0x013b }
        L_0x013b:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ 8gn -> 0x015f, 8go -> 0x015d, 8gg -> 0x015b, 8ge -> 0x0159 }
            java.lang.String r0 = "restore>AccountWithLatestGoogleDriveBackupFetcher/one-time-setup/google drive api disabled on google side for "
            X.AnonymousClass8BV.A1L(r0, r10, r1)     // Catch:{ 8gn -> 0x015f, 8go -> 0x015d, 8gg -> 0x015b, 8ge -> 0x0159 }
            java.lang.String r0 = r1.toString()     // Catch:{ 8gn -> 0x015f, 8go -> 0x015d, 8gg -> 0x015b, 8ge -> 0x0159 }
            com.whatsapp.util.Log.i(r0, r2)     // Catch:{ 8gn -> 0x015f, 8go -> 0x015d, 8gg -> 0x015b, 8ge -> 0x0159 }
        L_0x014c:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ 8gn -> 0x015f, 8go -> 0x015d, 8gg -> 0x015b, 8ge -> 0x0159 }
            java.lang.String r0 = "restore>AccountWithLatestGoogleDriveBackupFetcher/one-time-setup/account-with-no-backup/"
            X.AnonymousClass8BY.A1H(r0, r10, r1)     // Catch:{ 8gn -> 0x015f, 8go -> 0x015d, 8gg -> 0x015b, 8ge -> 0x0159 }
            r3.add(r11)     // Catch:{ 8gn -> 0x015f, 8go -> 0x015d, 8gg -> 0x015b, 8ge -> 0x0159 }
            goto L_0x0176
        L_0x0159:
            r2 = move-exception
            goto L_0x0160
        L_0x015b:
            r2 = move-exception
            goto L_0x0160
        L_0x015d:
            r2 = move-exception
            goto L_0x0160
        L_0x015f:
            r2 = move-exception
        L_0x0160:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x03c2 }
            java.lang.String r0 = "restore>AccountWithLatestGoogleDriveBackupFetcher/one-time-setup failed to access account: "
            X.AnonymousClass8BV.A1L(r0, r10, r1)     // Catch:{ all -> 0x03c2 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x03c2 }
            com.whatsapp.util.Log.i(r0, r2)     // Catch:{ all -> 0x03c2 }
            goto L_0x0176
        L_0x0171:
            int r10 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r10 <= 0) goto L_0x0176
        L_0x0175:
            r8 = r13
        L_0x0176:
            int r4 = r4 + 1
            goto L_0x0051
        L_0x017a:
            if (r8 != 0) goto L_0x0195
            java.util.concurrent.atomic.AtomicBoolean r4 = r7.A0B     // Catch:{ all -> 0x03c2 }
            java.util.ArrayList r3 = r36.A0K()     // Catch:{ all -> 0x03c2 }
            boolean r2 = r4.get()     // Catch:{ all -> 0x03c2 }
            java.lang.String r1 = r35.A0m()     // Catch:{ all -> 0x03c2 }
            r0 = r36
            boolean r0 = X.C20134A8u.A0A(r0, r1, r3, r2)     // Catch:{ all -> 0x03c2 }
            r4.set(r0)     // Catch:{ all -> 0x03c2 }
            goto L_0x03bd
        L_0x0195:
            X.9hz r7 = r8.A02     // Catch:{ all -> 0x03c2 }
            X.C17960vV.A00()     // Catch:{ all -> 0x03c2 }
            java.lang.String r1 = "restore>BackupApiBackupSelector/decide"
            X.1Ez r15 = new X.1Ez     // Catch:{ all -> 0x03c2 }
            r15.<init>((java.lang.String) r1)     // Catch:{ all -> 0x03c2 }
            X.A2x r10 = r8.A01     // Catch:{ all -> 0x03c2 }
            X.9uI r6 = r10.A02()     // Catch:{ all -> 0x03c2 }
            X.1oW r0 = r7.A06     // Catch:{ 9LZ -> 0x03b7 }
            java.util.Map r14 = X.C20127A8m.A04(r0, r10)     // Catch:{ 9LZ -> 0x03b7 }
            if (r14 == 0) goto L_0x03bd
            X.1Wb r13 = r7.A0B     // Catch:{ all -> 0x03c2 }
            java.util.ArrayList r11 = r13.A0K()     // Catch:{ all -> 0x03c2 }
            java.util.ArrayList r17 = X.C20127A8m.A03(r14)     // Catch:{ all -> 0x03c2 }
            X.1L7 r4 = r7.A08     // Catch:{ all -> 0x03c2 }
            X.1NW r3 = r7.A02     // Catch:{ all -> 0x03c2 }
            X.C18070vi.A0k(r4, r3)     // Catch:{ all -> 0x03c2 }
            boolean r0 = r11.isEmpty()     // Catch:{ all -> 0x03c2 }
            if (r0 == 0) goto L_0x01cf
            boolean r0 = r17.isEmpty()     // Catch:{ all -> 0x03c2 }
            if (r0 == 0) goto L_0x01cf
            r4 = 4
            goto L_0x0288
        L_0x01cf:
            boolean r0 = r11.isEmpty()     // Catch:{ all -> 0x03c2 }
            if (r0 == 0) goto L_0x01d8
            r4 = 2
            goto L_0x0288
        L_0x01d8:
            boolean r0 = r17.isEmpty()     // Catch:{ all -> 0x03c2 }
            if (r0 == 0) goto L_0x01e1
            r4 = 3
            goto L_0x0288
        L_0x01e1:
            int r1 = r17.size()     // Catch:{ all -> 0x03c2 }
            int r0 = r11.size()     // Catch:{ all -> 0x03c2 }
            if (r1 != r0) goto L_0x023e
            java.util.ArrayList r2 = X.AnonymousClass000.A13()     // Catch:{ all -> 0x03c2 }
            java.util.Iterator r16 = r11.iterator()     // Catch:{ all -> 0x03c2 }
        L_0x01f3:
            boolean r0 = r16.hasNext()     // Catch:{ all -> 0x03c2 }
            if (r0 == 0) goto L_0x0209
            java.io.File r5 = X.AnonymousClass8BS.A0T(r16)     // Catch:{ all -> 0x03c2 }
            long r0 = r5.length()     // Catch:{ 8gm -> 0x0209 }
            java.lang.String r0 = X.C41361wE.A05(r3, r4, r5, r0)     // Catch:{ 8gm -> 0x0209 }
            r2.add(r0)     // Catch:{ 8gm -> 0x0209 }
            goto L_0x01f3
        L_0x0209:
            int r1 = r17.size()     // Catch:{ all -> 0x03c2 }
            int r0 = r2.size()     // Catch:{ all -> 0x03c2 }
            if (r1 != r0) goto L_0x023e
            java.util.Iterator r3 = r17.iterator()     // Catch:{ all -> 0x03c2 }
        L_0x0217:
            boolean r0 = r3.hasNext()     // Catch:{ all -> 0x03c2 }
            if (r0 == 0) goto L_0x022d
            X.A2d r1 = X.AnonymousClass8BR.A0I(r3)     // Catch:{ all -> 0x03c2 }
            X.A55 r0 = r1.A02     // Catch:{ all -> 0x03c2 }
            if (r0 == 0) goto L_0x0239
            java.lang.String r0 = r0.A03     // Catch:{ all -> 0x03c2 }
        L_0x0227:
            boolean r0 = r2.remove(r0)     // Catch:{ all -> 0x03c2 }
            if (r0 != 0) goto L_0x0217
        L_0x022d:
            boolean r0 = r2.isEmpty()     // Catch:{ all -> 0x03c2 }
            if (r0 == 0) goto L_0x023e
            java.lang.String r0 = "GoogleBackupUtils/isRemoteTheLatest local and remote are the same"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x03c2 }
            goto L_0x023c
        L_0x0239:
            java.lang.String r0 = r1.A03     // Catch:{ all -> 0x03c2 }
            goto L_0x0227
        L_0x023c:
            r4 = 5
            goto L_0x0288
        L_0x023e:
            java.util.Iterator r17 = r17.iterator()     // Catch:{ all -> 0x03c2 }
            r4 = 0
            r2 = 0
        L_0x0246:
            boolean r0 = r17.hasNext()     // Catch:{ all -> 0x03c2 }
            if (r0 == 0) goto L_0x0258
            X.A2d r0 = X.AnonymousClass8BR.A0I(r17)     // Catch:{ all -> 0x03c2 }
            long r0 = r0.A01     // Catch:{ all -> 0x03c2 }
            int r16 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r16 <= 0) goto L_0x0246
            r2 = r0
            goto L_0x0246
        L_0x0258:
            java.util.Iterator r1 = r11.iterator()     // Catch:{ all -> 0x03c2 }
        L_0x025c:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x03c2 }
            if (r0 == 0) goto L_0x0271
            java.io.File r0 = X.AnonymousClass8BS.A0T(r1)     // Catch:{ all -> 0x03c2 }
            long r16 = r0.lastModified()     // Catch:{ all -> 0x03c2 }
            int r0 = (r16 > r4 ? 1 : (r16 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x025c
            r4 = r16
            goto L_0x025c
        L_0x0271:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x03c2 }
            java.lang.String r0 = "GoogleBackupUtils/isRemoteTheLatest remote: "
            r1.append(r0)     // Catch:{ all -> 0x03c2 }
            r1.append(r2)     // Catch:{ all -> 0x03c2 }
            java.lang.String r0 = " local: "
            X.C17900vP.A0m(r0, r1, r4)     // Catch:{ all -> 0x03c2 }
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            r4 = 7
            if (r0 <= 0) goto L_0x0288
            r4 = 6
        L_0x0288:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x03c2 }
            java.lang.String r0 = "restore>BackupApiBackupSelector/decideLocalVsRemotePreference/backup state: "
            r1.append(r0)     // Catch:{ all -> 0x03c2 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x03c2 }
            if (r0 != 0) goto L_0x0299
            r0 = 0
            goto L_0x029d
        L_0x0299:
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x03c2 }
        L_0x029d:
            X.C17890vO.A1A(r1, r0)     // Catch:{ all -> 0x03c2 }
            r3 = 4
            r0 = 1
            r2 = 0
            switch(r4) {
                case 2: goto L_0x02ab;
                case 3: goto L_0x02b7;
                case 4: goto L_0x02d5;
                case 5: goto L_0x02d0;
                case 6: goto L_0x02b0;
                default: goto L_0x02a6;
            }     // Catch:{ all -> 0x03c2 }
        L_0x02a6:
            A00(r7, r2)     // Catch:{ all -> 0x03c2 }
            r0 = 7
            goto L_0x02dc
        L_0x02ab:
            A00(r7, r0)     // Catch:{ all -> 0x03c2 }
            r0 = 2
            goto L_0x02b4
        L_0x02b0:
            A00(r7, r0)     // Catch:{ all -> 0x03c2 }
            r0 = 6
        L_0x02b4:
            r13.A00 = r0     // Catch:{ all -> 0x03c2 }
            goto L_0x02da
        L_0x02b7:
            A00(r7, r2)     // Catch:{ all -> 0x03c2 }
            java.util.concurrent.atomic.AtomicBoolean r0 = r7.A0K     // Catch:{ all -> 0x03c2 }
            boolean r1 = r0.get()     // Catch:{ all -> 0x03c2 }
            X.0z4 r0 = r7.A0A     // Catch:{ all -> 0x03c2 }
            java.lang.String r0 = r0.A0m()     // Catch:{ all -> 0x03c2 }
            boolean r0 = X.C20134A8u.A0A(r13, r0, r11, r1)     // Catch:{ all -> 0x03c2 }
            if (r0 == 0) goto L_0x02cd
            r3 = 3
        L_0x02cd:
            r13.A00 = r3     // Catch:{ all -> 0x03c2 }
            goto L_0x02de
        L_0x02d0:
            A00(r7, r2)     // Catch:{ all -> 0x03c2 }
            r0 = 5
            goto L_0x02dc
        L_0x02d5:
            r13.A00 = r3     // Catch:{ all -> 0x03c2 }
            A00(r7, r0)     // Catch:{ all -> 0x03c2 }
        L_0x02da:
            r4 = 1
            goto L_0x02ff
        L_0x02dc:
            r13.A00 = r0     // Catch:{ all -> 0x03c2 }
        L_0x02de:
            r4 = 0
            int r0 = r11.size()     // Catch:{ all -> 0x03c2 }
            if (r0 <= 0) goto L_0x031f
            java.lang.Object r0 = r11.get(r2)     // Catch:{ all -> 0x03c2 }
            java.io.File r0 = (java.io.File) r0     // Catch:{ all -> 0x03c2 }
            if (r0 == 0) goto L_0x031f
            java.lang.String r0 = r0.getName()     // Catch:{ all -> 0x03c2 }
            X.9JN r1 = X.AnonymousClass9QI.A00(r0)     // Catch:{ all -> 0x03c2 }
            X.9JN r0 = X.AnonymousClass9JN.CRYPT15     // Catch:{ all -> 0x03c2 }
            if (r1 != r0) goto L_0x031f
            r0 = 1
            X.9uI r6 = new X.9uI     // Catch:{ all -> 0x03c2 }
            r6.<init>(r12, r0)     // Catch:{ all -> 0x03c2 }
        L_0x02ff:
            r15.A02()     // Catch:{ all -> 0x03c2 }
            X.2kv r2 = new X.2kv     // Catch:{ all -> 0x03c2 }
            r2.<init>()     // Catch:{ all -> 0x03c2 }
            X.10I r1 = r7.A0G     // Catch:{ all -> 0x03c2 }
            r20 = 3
            X.Ak4 r0 = new X.Ak4     // Catch:{ all -> 0x03c2 }
            r15 = r0
            r16 = r7
            r17 = r8
            r18 = r14
            r19 = r2
            r21 = r4
            r15.<init>(r16, r17, r18, r19, r20, r21)     // Catch:{ all -> 0x03c2 }
            r1.CGF(r0)     // Catch:{ all -> 0x03c2 }
            goto L_0x0325
        L_0x031f:
            X.9uI r6 = new X.9uI     // Catch:{ all -> 0x03c2 }
            r6.<init>(r12, r2)     // Catch:{ all -> 0x03c2 }
            goto L_0x02ff
        L_0x0325:
            java.util.concurrent.locks.ReentrantLock r1 = r2.A02     // Catch:{ InterruptedException -> 0x0341 }
            r1.lockInterruptibly()     // Catch:{ InterruptedException -> 0x0341 }
        L_0x032a:
            java.lang.Object r0 = r2.A00     // Catch:{ all -> 0x033c }
            if (r0 != 0) goto L_0x0334
            java.util.concurrent.locks.Condition r0 = r2.A01     // Catch:{ all -> 0x033c }
            r0.await()     // Catch:{ all -> 0x033c }
            goto L_0x032a
        L_0x0334:
            r1.unlock()     // Catch:{ InterruptedException -> 0x0341 }
            boolean r5 = X.AnonymousClass000.A1Y(r0)     // Catch:{ InterruptedException -> 0x0341 }
            goto L_0x0346
        L_0x033c:
            r0 = move-exception
            r1.unlock()     // Catch:{ InterruptedException -> 0x0341 }
            throw r0     // Catch:{ InterruptedException -> 0x0341 }
        L_0x0341:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)     // Catch:{ all -> 0x03c2 }
            r5 = 0
        L_0x0346:
            long r2 = r10.A04     // Catch:{ all -> 0x03c2 }
            if (r4 != 0) goto L_0x036e
            java.util.Iterator r11 = r11.iterator()     // Catch:{ all -> 0x03c2 }
            r12 = 0
        L_0x0350:
            boolean r0 = r11.hasNext()     // Catch:{ all -> 0x03c2 }
            if (r0 == 0) goto L_0x0360
            java.io.File r0 = X.AnonymousClass8BS.A0T(r11)     // Catch:{ all -> 0x03c2 }
            long r0 = r0.length()     // Catch:{ all -> 0x03c2 }
            long r12 = r12 + r0
            goto L_0x0350
        L_0x0360:
            org.json.JSONObject r11 = r10.A0A     // Catch:{ all -> 0x03c2 }
            r0 = -1
            if (r11 == 0) goto L_0x036c
            java.lang.String r10 = "chatdbSize"
            long r0 = r11.optLong(r10, r0)     // Catch:{ all -> 0x03c2 }
        L_0x036c:
            long r12 = r12 - r0
            long r2 = r2 + r12
        L_0x036e:
            X.0z4 r10 = r7.A0A     // Catch:{ all -> 0x03c2 }
            java.util.HashMap r1 = r6.A00()     // Catch:{ all -> 0x03c2 }
            X.AQX r0 = new X.AQX     // Catch:{ all -> 0x03c2 }
            r0.<init>(r1)     // Catch:{ all -> 0x03c2 }
            java.lang.String r7 = X.AnonymousClass9Q9.A00(r0)     // Catch:{ all -> 0x03c2 }
            android.content.SharedPreferences$Editor r1 = X.C19830z4.A00(r10)     // Catch:{ all -> 0x03c2 }
            java.lang.String r0 = "gdrive_last_restore_file_encryption_metadata"
            X.C17880vN.A1E(r1, r0, r7)     // Catch:{ all -> 0x03c2 }
            java.lang.StringBuilder r7 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x03c2 }
            java.lang.String r0 = "restore>BackupApiBackupSelector/overwrite local files: "
            r7.append(r0)     // Catch:{ all -> 0x03c2 }
            r7.append(r4)     // Catch:{ all -> 0x03c2 }
            java.lang.String r0 = ", isEncrypted: "
            r7.append(r0)     // Catch:{ all -> 0x03c2 }
            java.util.HashMap r1 = r6.A00()     // Catch:{ all -> 0x03c2 }
            X.AQX r0 = new X.AQX     // Catch:{ all -> 0x03c2 }
            r0.<init>(r1)     // Catch:{ all -> 0x03c2 }
            java.lang.String r0 = X.AnonymousClass9Q9.A00(r0)     // Catch:{ all -> 0x03c2 }
            X.C17890vO.A1A(r7, r0)     // Catch:{ all -> 0x03c2 }
            monitor-enter(r8)     // Catch:{ all -> 0x03c2 }
            r8.A00 = r14     // Catch:{ all -> 0x03b4 }
            r8.A00 = r2     // Catch:{ all -> 0x03b4 }
            r8.A03 = r4     // Catch:{ all -> 0x03b4 }
            r8.A02 = r5     // Catch:{ all -> 0x03b4 }
            r8.A01 = r6     // Catch:{ all -> 0x03b4 }
            monitor-exit(r8)     // Catch:{ all -> 0x03c2 }
            goto L_0x03bc
        L_0x03b4:
            r0 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x03c2 }
            throw r0     // Catch:{ all -> 0x03c2 }
        L_0x03b7:
            r0 = move-exception
            com.whatsapp.util.Log.e(r1, r0)     // Catch:{ all -> 0x03c2 }
            goto L_0x03bd
        L_0x03bc:
            r12 = r8
        L_0x03bd:
            r0 = 0
            r9.set(r0)
            return r12
        L_0x03c2:
            r1 = move-exception
            r0 = 0
            r9.set(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C177959Bg.A0G(java.lang.Object[]):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ void A0H(Object obj) {
        A1C a1c = (A1C) obj;
        RestoreFromBackupActivity restoreFromBackupActivity = (RestoreFromBackupActivity) this.A07.get();
        if (restoreFromBackupActivity != null) {
            C17960vV.A02();
            Fragment A0Q = restoreFromBackupActivity.getSupportFragmentManager().A0Q("one-time-setup-taking-too-long");
            if (A0Q != null) {
                ((DialogFragment) A0Q).A29();
            }
            if (RestoreFromBackupActivity.A19(restoreFromBackupActivity)) {
                C17900vP.A0Y(a1c, "restore>RestoreFromBackupActivity/one-time-setup background task finished but parent activity has already exited, therefore, stopping the task. Data: ", AnonymousClass000.A10());
            } else {
                restoreFromBackupActivity.A0A = a1c;
                if (a1c != null) {
                    restoreFromBackupActivity.A4j((C192039nf) null, 22);
                    RestoreFromBackupActivity.A13(restoreFromBackupActivity, false);
                } else {
                    StringBuilder A10 = AnonymousClass000.A10();
                    A10.append("restore>RestoreFromBackupActivity/one-time-setup/num-of-local-backup-files/");
                    C17900vP.A0o(A10, restoreFromBackupActivity.A0L.A0E());
                    if (restoreFromBackupActivity.A0L.A0E() <= 0 || !restoreFromBackupActivity.A15.get()) {
                        C19830z4 r1 = restoreFromBackupActivity.A0A;
                        AnonymousClass00H r0 = C20134A8u.A00;
                        boolean z = C17890vO.A0B(r1).getBoolean("new_jid", false);
                        C17900vP.A0n("gdrive-util/is-new-jid/", AnonymousClass000.A10(), z);
                        if (z) {
                            RestoreFromBackupActivity.A0u(restoreFromBackupActivity);
                            restoreFromBackupActivity.setResult(1);
                        } else {
                            Log.i("restore>RestoreFromBackupActivity/one-time-setup user is an existing user but has no google drive backups found and no local backups exist either, warn the user.");
                            restoreFromBackupActivity.A0L.A00 = 4;
                            AnonymousClass4VU r12 = new AnonymousClass4VU(14);
                            AnonymousClass8BS.A12(restoreFromBackupActivity, r12, 2131890737);
                            r12.A05(false);
                            AnonymousClass8BS.A11(restoreFromBackupActivity, r12, 2131890684);
                            PromptDialogFragment A0I = AnonymousClass8BW.A0I(restoreFromBackupActivity, r12, 2131899432);
                            if (!RestoreFromBackupActivity.A19(restoreFromBackupActivity)) {
                                AnonymousClass8BV.A18(AnonymousClass3Ma.A0H(restoreFromBackupActivity), A0I, (String) null);
                            }
                        }
                    } else {
                        Log.i("restore>RestoreFromBackupActivity/one-time-setup no google drive backups found but local backup exists.");
                        restoreFromBackupActivity.A0L.A00 = 3;
                        restoreFromBackupActivity.A4j((C192039nf) null, 23);
                        restoreFromBackupActivity.A4k(false);
                    }
                }
            }
        }
        Locale locale = Locale.ENGLISH;
        Object[] A1a = AnonymousClass3MW.A1a();
        AnonymousClass1Ez r4 = this.A06;
        A1a[0] = Double.valueOf(((double) r4.A01()) / 1000.0d);
        String.format(locale, "Load time: %.2f seconds", A1a);
        r4.A02();
        this.A09.cancel();
    }

    public C177959Bg(AnonymousClass1KB r3, C36801oU r4, RestoreFromBackupActivity restoreFromBackupActivity, C188789hz r6, AnonymousClass1L7 r7, AnonymousClass118 r8, C19830z4 r9, C27431Wb r10, Set set, AtomicBoolean atomicBoolean, AtomicBoolean atomicBoolean2, Account[] accountArr) {
        this.A00 = r3;
        this.A0C = accountArr;
        this.A03 = r8;
        this.A0D = r7;
        this.A08 = set;
        this.A0B = atomicBoolean;
        this.A07 = AnonymousClass3MW.A0z(restoreFromBackupActivity);
        this.A05 = r10;
        this.A04 = r9;
        this.A02 = r6;
        this.A0A = atomicBoolean2;
        this.A01 = r4;
    }
}
