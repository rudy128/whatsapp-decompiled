package X;

import com.whatsapp.settings.SettingsTabActivity;
import com.whatsapp.settings.SettingsUserProxyViewModel;

/* renamed from: X.4ro  reason: invalid class name and case insensitive filesystem */
public class C98844ro implements Runnable {
    public final int A00;
    public final Object A01;

    public static void A01(SettingsUserProxyViewModel settingsUserProxyViewModel, AnonymousClass00H r4, String str) {
        String A012 = ((C88214Yt) settingsUserProxyViewModel.A0F.get()).A01();
        if (A012 != null && A012.split(":")[0].equalsIgnoreCase(str)) {
            ((C92244gz) r4.get()).A04.A04(6);
        }
    }

    public C98844ro(SettingsTabActivity settingsTabActivity, int i) {
        this.A00 = i;
        switch (i) {
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
                this.A01 = settingsTabActivity;
                return;
            default:
                this.A01 = settingsTabActivity;
                return;
        }
    }

    public static void A00(AnonymousClass1KB r1, Object obj, int i) {
        r1.A0J(new C98844ro(obj, i));
    }

    public static void A02(AnonymousClass10I r1, Object obj, int i) {
        r1.CGF(new C98844ro(obj, i));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v15, resolved type: com.whatsapp.settings.SettingsPrivacy} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v59, resolved type: com.whatsapp.settings.notificationsandsounds.AdvancedNotificationSettingsFragment} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v86, resolved type: com.whatsapp.settings.SettingsPrivacy} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v87, resolved type: com.whatsapp.settings.SettingsPrivacy} */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x03a8, code lost:
        r0 = "chatSettingsStore";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:177:0x041c, code lost:
        r3 = new X.C98844ro(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:181:0x042d, code lost:
        X.C18070vi.A11(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:182:0x0431, code lost:
        throw null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:221:0x05ac, code lost:
        r2.A04.A0E(X.C27621Wu.A00);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:222:0x05b3, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:232:0x05f9, code lost:
        r1.A0E(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:233:0x05fc, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:236:0x0612, code lost:
        if (r1 == null) goto L_0x0620;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:237:0x0614, code lost:
        r3 = r4.A00;
        r2 = new X.C85284Mu(r1, 2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:238:0x061c, code lost:
        r3.A0E(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:239:0x061f, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:240:0x0620, code lost:
        r0 = r4.A01.A09();
        r3 = r4.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:241:0x0628, code lost:
        if (r0 != false) goto L_0x0632;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:242:0x062a, code lost:
        r2 = new X.C85284Mu((X.C85274Mt) null, 3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:243:0x0632, code lost:
        r3.A0E(new X.C85284Mu((X.C85274Mt) null, 1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:245:?, code lost:
        r4 = r4.A03.A01();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:246:0x0642, code lost:
        if (r4 != null) goto L_0x064e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:249:?, code lost:
        r3.A0E(new X.C85284Mu((X.C85274Mt) null, 4));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0116, code lost:
        r1.A01(r2, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:251:0x0652, code lost:
        if (r5.A05(r4) != false) goto L_0x065f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:252:0x0654, code lost:
        r2 = new X.C85284Mu((X.C85274Mt) null, 5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:253:0x065b, code lost:
        r3.A0E(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:254:0x065f, code lost:
        r2 = r5.A02();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:255:0x0663, code lost:
        if (r2 != null) goto L_0x066d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:256:0x0665, code lost:
        r2 = new X.C85284Mu((X.C85274Mt) null, 5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:257:0x066d, code lost:
        r3.A0E(new X.C85284Mu(r2, 2));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:259:?, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0119, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:260:0x067a, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:261:0x067b, code lost:
        if (r4 != null) goto L_0x067d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:263:?, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:264:0x0681, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:266:?, code lost:
        X.AnonymousClass0DT.A00(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x011a, code lost:
        r0 = "contextualHelpHandler";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:271:?, code lost:
        r3.A0E(new X.C85284Mu((X.C85274Mt) null, 4));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:274:0x0694, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:275:0x0695, code lost:
        android.net.TrafficStats.clearThreadStatsTag();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:276:0x0698, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0134, code lost:
        r3.A0L(r2, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:316:0x07f7, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:317:0x07f8, code lost:
        r2.A01.A00(0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:318:0x07fd, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0137, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0138, code lost:
        r0 = "syncManager";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:373:0x093a, code lost:
        r3 = new X.C98844ro((java.lang.Object) r2, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:399:0x0a22, code lost:
        r4.A0J(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:400:0x0a25, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x01f8, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:?, code lost:
        X.AnonymousClass0DT.A00(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x01fd, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x01fe, code lost:
        com.whatsapp.util.Log.e((java.lang.Throwable) r0);
        r2.A02.A03();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x0207, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0208, code lost:
        com.whatsapp.util.Log.i("msgstore/unsendreadreceipts/IllegalStateException ", r1);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:316:0x07f7 A[ExcHandler: SQLiteFullException (r1v86 'e' android.database.sqlite.SQLiteFullException A[CUSTOM_DECLARE]), Splitter:B:48:0x0199] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r18 = this;
            r1 = r18
            int r0 = r1.A00
            switch(r0) {
                case 0: goto L_0x07e9;
                case 1: goto L_0x07e1;
                case 2: goto L_0x07d2;
                case 3: goto L_0x07c5;
                case 4: goto L_0x09c5;
                case 5: goto L_0x07bd;
                case 6: goto L_0x07b4;
                case 7: goto L_0x079f;
                case 8: goto L_0x0941;
                case 9: goto L_0x0797;
                case 10: goto L_0x090e;
                case 11: goto L_0x0797;
                case 12: goto L_0x078b;
                case 13: goto L_0x078b;
                case 14: goto L_0x077f;
                case 15: goto L_0x011e;
                case 16: goto L_0x0108;
                case 17: goto L_0x00f1;
                case 18: goto L_0x00e2;
                case 19: goto L_0x00d3;
                case 20: goto L_0x0423;
                case 21: goto L_0x076b;
                case 22: goto L_0x040e;
                case 23: goto L_0x0405;
                case 24: goto L_0x0759;
                case 25: goto L_0x06d2;
                case 26: goto L_0x06c7;
                case 27: goto L_0x06b6;
                case 28: goto L_0x06a1;
                case 29: goto L_0x0007;
                case 30: goto L_0x0007;
                case 31: goto L_0x03ac;
                case 32: goto L_0x0699;
                case 33: goto L_0x0608;
                case 34: goto L_0x05fd;
                case 35: goto L_0x05e8;
                case 36: goto L_0x038a;
                case 37: goto L_0x05e0;
                case 38: goto L_0x00c0;
                case 39: goto L_0x009f;
                case 40: goto L_0x05d2;
                case 41: goto L_0x0184;
                case 42: goto L_0x0173;
                case 43: goto L_0x05c5;
                case 44: goto L_0x05b4;
                case 45: goto L_0x0595;
                case 46: goto L_0x0572;
                case 47: goto L_0x049b;
                case 48: goto L_0x048b;
                case 49: goto L_0x013c;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r0 = r1.A01
            com.whatsapp.settings.SettingsUserProxyActivity r0 = (com.whatsapp.settings.SettingsUserProxyActivity) r0
            com.whatsapp.settings.SettingsUserProxyViewModel r5 = r0.A0A
            r0 = 1
            r5.A03 = r0
            X.00H r0 = r5.A0E
            java.lang.Object r2 = r0.get()
            X.4gz r2 = (X.C92244gz) r2
            X.1KB r1 = r2.A01
            r0 = 43
            A00(r1, r2, r0)
            r1 = 0
            r5.A02 = r1
            X.00H r4 = r5.A0F
            X.4Yt r0 = X.AnonymousClass3MW.A0l(r4)
            r0.A04(r1)
            X.1DT r0 = r5.A05
            r0.A0E(r1)
            X.00H r0 = r5.A0H
            java.lang.Object r0 = r0.get()
            X.1fM r0 = (X.C31311fM) r0
            X.00H r7 = r0.A00
            X.4Yt r0 = X.AnonymousClass3MW.A0l(r7)
            r0.A04(r1)
            X.4Yt r0 = X.AnonymousClass3MW.A0l(r7)
            r3 = 0
            r0.A03(r3)
            X.4Yt r0 = X.AnonymousClass3MW.A0l(r7)
            r0.A02(r3)
            X.4Yt r0 = X.AnonymousClass3MW.A0l(r7)
            r2 = 587(0x24b, float:8.23E-43)
            X.0vc r0 = r0.A01
            java.lang.String r6 = "user_proxy_setting_pref"
            android.content.SharedPreferences r0 = r0.A05(r6)
            android.content.SharedPreferences$Editor r1 = r0.edit()
            java.lang.String r0 = "proxy_media_port"
            X.C17880vN.A1C(r1, r0, r2)
            X.4Yt r0 = X.AnonymousClass3MW.A0l(r7)
            r2 = 1
            X.0vc r0 = r0.A01
            android.content.SharedPreferences r0 = r0.A05(r6)
            android.content.SharedPreferences$Editor r1 = r0.edit()
            java.lang.String r0 = "proxy_use_tls"
            X.C17880vN.A1F(r1, r0, r2)
            X.4Yt r0 = X.AnonymousClass3MW.A0l(r7)
            r0.A05(r3)
            X.00H r0 = r5.A0G
            java.lang.Object r0 = r0.get()
            X.4Pq r0 = (X.C85974Pq) r0
            r0.A00(r3)
            r5.A0U()
            r5.A01 = r3
            r5.A0W(r3, r3)
            java.lang.Object r0 = r4.get()
            com.whatsapp.settings.SettingsUserProxyViewModel.A04(r5, r4, r0)
            r5.A04 = r3
        L_0x009e:
            return
        L_0x009f:
            java.lang.Object r1 = r1.A01
            com.whatsapp.settings.notificationsandsounds.NotificationsAndSoundsFragment r1 = (com.whatsapp.settings.notificationsandsounds.NotificationsAndSoundsFragment) r1
            r3 = 0
            X.00H r0 = r1.A0A
            if (r0 == 0) goto L_0x00bc
            java.lang.Object r2 = r0.get()
            X.1pz r2 = (X.C37701pz) r2
            X.1BI r1 = r1.A05
            X.C17960vV.A07(r1)
            X.C18070vi.A0X(r1)
            X.1i2 r0 = X.C32961i2.CONTACT_INFO
            r2.A01(r1, r0, r3)
            return
        L_0x00bc:
            java.lang.String r0 = "userMuteActions"
            goto L_0x042d
        L_0x00c0:
            java.lang.Object r0 = r1.A01
            com.whatsapp.settings.notificationsandsounds.NotificationsAndSoundsFragment r0 = (com.whatsapp.settings.notificationsandsounds.NotificationsAndSoundsFragment) r0
            X.1Nb r3 = r0.A08
            if (r3 == 0) goto L_0x03a8
            X.1BI r2 = r0.A05
            X.C17960vV.A07(r2)
            r0 = 0
            r3.A0j(r2, r0)
            return
        L_0x00d3:
            java.lang.Object r2 = r1.A01
            com.whatsapp.settings.SettingsPrivacyAdvancedActivity r2 = (com.whatsapp.settings.SettingsPrivacyAdvancedActivity) r2
            X.00H r0 = r2.A08
            if (r0 == 0) goto L_0x011a
            X.1o3 r1 = X.AnonymousClass3MW.A0a(r0)
            java.lang.String r0 = "disable-link-previews"
            goto L_0x0116
        L_0x00e2:
            java.lang.Object r2 = r1.A01
            com.whatsapp.settings.SettingsPrivacyAdvancedActivity r2 = (com.whatsapp.settings.SettingsPrivacyAdvancedActivity) r2
            X.00H r0 = r2.A08
            if (r0 == 0) goto L_0x011a
            X.1o3 r1 = X.AnonymousClass3MW.A0a(r0)
            java.lang.String r0 = "call-relaying"
            goto L_0x0116
        L_0x00f1:
            java.lang.Object r0 = r1.A01
            com.whatsapp.settings.SettingsPrivacyAdvancedActivity r0 = (com.whatsapp.settings.SettingsPrivacyAdvancedActivity) r0
            X.1To r3 = r0.A04
            if (r3 == 0) goto L_0x0138
            boolean r0 = r0.A0B
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            r0 = 0
            X.9qc r2 = new X.9qc
            r2.<init>(r1, r0)
            java.lang.Integer r0 = X.AnonymousClass00R.A0Y
            goto L_0x0134
        L_0x0108:
            java.lang.Object r2 = r1.A01
            com.whatsapp.settings.SettingsPrivacyAdvancedActivity r2 = (com.whatsapp.settings.SettingsPrivacyAdvancedActivity) r2
            X.00H r0 = r2.A08
            if (r0 == 0) goto L_0x011a
            X.1o3 r1 = X.AnonymousClass3MW.A0a(r0)
            java.lang.String r0 = "unknown-message-blocking"
        L_0x0116:
            r1.A01(r2, r0)
            return
        L_0x011a:
            java.lang.String r0 = "contextualHelpHandler"
            goto L_0x042d
        L_0x011e:
            java.lang.Object r0 = r1.A01
            com.whatsapp.settings.SettingsPrivacyAdvancedActivity r0 = (com.whatsapp.settings.SettingsPrivacyAdvancedActivity) r0
            X.1To r3 = r0.A04
            if (r3 == 0) goto L_0x0138
            boolean r0 = r0.A0A
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            r0 = 0
            X.9qc r2 = new X.9qc
            r2.<init>(r1, r0)
            java.lang.Integer r0 = X.AnonymousClass00R.A0N
        L_0x0134:
            r3.A0L(r2, r0)
            return
        L_0x0138:
            java.lang.String r0 = "syncManager"
            goto L_0x042d
        L_0x013c:
            java.lang.Object r8 = r1.A01
            X.7AE r8 = (X.AnonymousClass7AE) r8
            r9 = 0
            X.1Le r2 = r8.A02
            X.11P r0 = r2.A01
            long r6 = X.AnonymousClass11P.A01(r0)
            r0 = 86400000(0x5265c00, double:4.2687272E-316)
            long r6 = r6 - r0
            X.1La r3 = r2.A04
            java.lang.String r0 = "earliest_status_time"
            r1 = 0
            long r4 = r3.A01(r0, r1)
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x009e
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 <= 0) goto L_0x07f1
            long r4 = r4 - r6
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x07f1
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x009e
            X.1KB r3 = r8.A00
            java.lang.Runnable r2 = r8.A03
            r0 = 1000(0x3e8, double:4.94E-321)
            long r4 = r4 + r0
            r3.A0K(r2, r4)
            return
        L_0x0173:
            java.lang.Object r1 = r1.A01
            X.4gz r1 = (X.C92244gz) r1
            boolean r0 = r1.A00
            if (r0 != 0) goto L_0x009e
            X.1Hc r0 = r1.A02
            r0.registerObserver(r1)
            r0 = 1
            r1.A00 = r0
            return
        L_0x0184:
            java.lang.Object r11 = r1.A01
            X.4gq r11 = (X.C92154gq) r11
            X.1N8 r2 = r11.A01
            r10 = 0
            X.1Ez r5 = new X.1Ez
            r5.<init>((boolean) r10)
            java.lang.String r0 = "msgstore/unsendreadreceipts"
            r5.A05(r0)
            java.util.ArrayList r3 = X.AnonymousClass000.A13()
            X.1Cd r0 = r2.A03     // Catch:{ IllegalStateException -> 0x0207, SQLiteDatabaseCorruptException -> 0x01fd, SQLiteFullException -> 0x07f7 }
            X.1at r12 = r0.get()     // Catch:{ IllegalStateException -> 0x0207, SQLiteDatabaseCorruptException -> 0x01fd, SQLiteFullException -> 0x07f7 }
            r0 = r12
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x01f3 }
            X.1Ev r6 = r0.A02     // Catch:{ all -> 0x01f3 }
            java.lang.String r4 = X.C28821ax.A00     // Catch:{ all -> 0x01f3 }
            java.lang.String r1 = "UNSENT_MESSAGE_READ_RECEIPTS_SQL"
            r0 = 0
            android.database.Cursor r9 = r6.A0A(r4, r1, r0)     // Catch:{ all -> 0x01f3 }
        L_0x01ad:
            boolean r0 = r9.moveToNext()     // Catch:{ all -> 0x01e7 }
            if (r0 == 0) goto L_0x01e0
            X.1LW r0 = r2.A00     // Catch:{ all -> 0x01e7 }
            X.1BI r1 = r0.A0C(r9)     // Catch:{ all -> 0x01e7 }
            if (r1 != 0) goto L_0x01c1
            java.lang.String r0 = "msgstore/unsendreadreceipts/jid is null!"
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ all -> 0x01e7 }
            goto L_0x01ad
        L_0x01c1:
            X.1N5 r0 = r2.A05     // Catch:{ all -> 0x01e7 }
            boolean r0 = r0.A04(r1)     // Catch:{ all -> 0x01e7 }
            if (r0 == 0) goto L_0x01ad
            X.00H r0 = r2.A06     // Catch:{ all -> 0x01e7 }
            X.206 r8 = X.C72463Mc.A0h(r9, r1, r0)     // Catch:{ all -> 0x01e7 }
            if (r8 == 0) goto L_0x01ad
            long r0 = r8.A0I     // Catch:{ all -> 0x01e7 }
            r6 = 1415214000000(0x1498153e780, double:6.992086189136E-312)
            int r4 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r4 <= 0) goto L_0x01ad
            r3.add(r8)     // Catch:{ all -> 0x01e7 }
            goto L_0x01ad
        L_0x01e0:
            r9.close()     // Catch:{ all -> 0x01f3 }
            r12.close()     // Catch:{ IllegalStateException -> 0x0207, SQLiteDatabaseCorruptException -> 0x01fd, SQLiteFullException -> 0x07f7 }
            goto L_0x020d
        L_0x01e7:
            r1 = move-exception
            if (r9 == 0) goto L_0x01f2
            r9.close()     // Catch:{ all -> 0x01ee }
            goto L_0x01f2
        L_0x01ee:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x01f3 }
        L_0x01f2:
            throw r1     // Catch:{ all -> 0x01f3 }
        L_0x01f3:
            r1 = move-exception
            r12.close()     // Catch:{ all -> 0x01f8 }
            goto L_0x01fc
        L_0x01f8:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ IllegalStateException -> 0x0207, SQLiteDatabaseCorruptException -> 0x01fd, SQLiteFullException -> 0x07f7 }
        L_0x01fc:
            throw r1     // Catch:{ IllegalStateException -> 0x0207, SQLiteDatabaseCorruptException -> 0x01fd, SQLiteFullException -> 0x07f7 }
        L_0x01fd:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)
            X.1Cn r0 = r2.A02
            r0.A03()
            goto L_0x020d
        L_0x0207:
            r1 = move-exception
            java.lang.String r0 = "msgstore/unsendreadreceipts/IllegalStateException "
            com.whatsapp.util.Log.i(r0, r1)
        L_0x020d:
            java.lang.StringBuilder r4 = X.AnonymousClass000.A10()
            java.lang.String r0 = "msgstore/unsendreadreceipts "
            X.C17890vO.A14(r0, r4, r3)
            java.lang.String r6 = " | time spent:"
            r4.append(r6)
            long r0 = r5.A02()
            X.C17890vO.A16(r4, r0)
            X.1Ez r5 = new X.1Ez
            r5.<init>((boolean) r10)
            java.lang.String r0 = "msgstore/unsentstatusreadreceipts"
            r5.A05(r0)
            java.util.ArrayList r4 = X.AnonymousClass000.A13()
            r0 = 1
            java.lang.String[] r8 = new java.lang.String[r0]
            X.1LW r0 = r2.A00
            X.1cg r9 = X.C29671cg.A00
            X.AnonymousClass1LW.A03(r0, r9, r8, r10)
            java.lang.String r7 = X.C50752Vq.A00
            java.lang.String r1 = "UNSENT_STATUS_READ_RECEIPTS_SQL"
            X.1Cd r0 = r2.A03     // Catch:{ IllegalStateException -> 0x02a1, SQLiteDatabaseCorruptException -> 0x0297, SQLiteFullException -> 0x07f7 }
            X.1at r15 = r0.get()     // Catch:{ IllegalStateException -> 0x02a1, SQLiteDatabaseCorruptException -> 0x0297, SQLiteFullException -> 0x07f7 }
            r0 = r15
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x028d }
            X.1Ev r0 = r0.A02     // Catch:{ all -> 0x028d }
            android.database.Cursor r8 = r0.A0A(r7, r1, r8)     // Catch:{ all -> 0x028d }
        L_0x024d:
            boolean r0 = r8.moveToNext()     // Catch:{ all -> 0x0281 }
            if (r0 == 0) goto L_0x027a
            X.00H r0 = r2.A06     // Catch:{ all -> 0x0281 }
            X.206 r7 = X.C72463Mc.A0h(r8, r9, r0)     // Catch:{ all -> 0x0281 }
            if (r7 == 0) goto L_0x024d
            long r0 = r7.A0I     // Catch:{ all -> 0x0281 }
            r13 = 1415214000000(0x1498153e780, double:6.992086189136E-312)
            int r12 = (r0 > r13 ? 1 : (r0 == r13 ? 0 : -1))
            if (r12 <= 0) goto L_0x024d
            boolean r0 = r7 instanceof X.C436420i     // Catch:{ all -> 0x0281 }
            if (r0 != 0) goto L_0x024d
            X.1N5 r1 = r2.A05     // Catch:{ all -> 0x0281 }
            X.1BI r0 = r7.A0H()     // Catch:{ all -> 0x0281 }
            boolean r0 = r1.A04(r0)     // Catch:{ all -> 0x0281 }
            if (r0 == 0) goto L_0x024d
            r4.add(r7)     // Catch:{ all -> 0x0281 }
            goto L_0x024d
        L_0x027a:
            r8.close()     // Catch:{ all -> 0x028d }
            r15.close()     // Catch:{ IllegalStateException -> 0x02a1, SQLiteDatabaseCorruptException -> 0x0297, SQLiteFullException -> 0x07f7 }
            goto L_0x02a7
        L_0x0281:
            r1 = move-exception
            if (r8 == 0) goto L_0x028c
            r8.close()     // Catch:{ all -> 0x0288 }
            goto L_0x028c
        L_0x0288:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x028d }
        L_0x028c:
            throw r1     // Catch:{ all -> 0x028d }
        L_0x028d:
            r1 = move-exception
            r15.close()     // Catch:{ all -> 0x0292 }
            goto L_0x0296
        L_0x0292:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ IllegalStateException -> 0x02a1, SQLiteDatabaseCorruptException -> 0x0297, SQLiteFullException -> 0x07f7 }
        L_0x0296:
            throw r1     // Catch:{ IllegalStateException -> 0x02a1, SQLiteDatabaseCorruptException -> 0x0297, SQLiteFullException -> 0x07f7 }
        L_0x0297:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)
            X.1Cn r0 = r2.A02
            r0.A03()
            goto L_0x02a7
        L_0x02a1:
            r1 = move-exception
            java.lang.String r0 = "msgstore/unsentstatusreadreceipts/IllegalStateException "
            com.whatsapp.util.Log.i(r0, r1)
        L_0x02a7:
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()
            java.lang.String r0 = "msgstore/unsentstatusreadreceipts "
            X.C17890vO.A14(r0, r2, r4)
            r2.append(r6)
            long r0 = r5.A02()
            X.C17890vO.A16(r2, r0)
            r3.addAll(r4)
            X.1N9 r0 = r11.A02
            r0.A0G(r3)
            X.2cO r9 = r11.A00
            java.util.HashSet r14 = X.C17880vN.A12()
            X.1Cd r15 = r9.A01
            X.1at r17 = r15.get()
            r0 = r17
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x087f }
            X.1Ev r3 = r0.A02     // Catch:{ all -> 0x087f }
            java.lang.String r2 = "SELECT * FROM played_self_receipt ORDER BY message_row_id DESC  LIMIT 4096"
            java.lang.String r1 = "GET_PLAYED_SELF_RECEIPT_SQL"
            r0 = 0
            android.database.Cursor r8 = r3.A0A(r2, r1, r0)     // Catch:{ all -> 0x087f }
            java.lang.String r1 = "message_row_id"
            int r7 = r8.getColumnIndexOrThrow(r1)     // Catch:{ all -> 0x0873 }
            java.lang.String r1 = "to_jid_row_id"
            int r6 = r8.getColumnIndexOrThrow(r1)     // Catch:{ all -> 0x0873 }
            java.lang.String r1 = "participant_jid_row_id"
            int r5 = r8.getColumnIndexOrThrow(r1)     // Catch:{ all -> 0x0873 }
            java.lang.String r1 = "message_id"
            int r4 = r8.getColumnIndexOrThrow(r1)     // Catch:{ all -> 0x0873 }
        L_0x02f5:
            boolean r1 = r8.moveToNext()     // Catch:{ all -> 0x0873 }
            if (r1 == 0) goto L_0x0337
            X.1DL r13 = r9.A00     // Catch:{ all -> 0x0873 }
            java.lang.Class<X.1BI> r12 = X.AnonymousClass1BI.class
            long r1 = r8.getLong(r6)     // Catch:{ all -> 0x0873 }
            com.whatsapp.jid.Jid r3 = r13.A0E(r12, r1)     // Catch:{ all -> 0x0873 }
            X.1BI r3 = (X.AnonymousClass1BI) r3     // Catch:{ all -> 0x0873 }
            boolean r1 = r8.isNull(r5)     // Catch:{ all -> 0x0873 }
            if (r1 != 0) goto L_0x0319
            long r0 = r8.getLong(r5)     // Catch:{ all -> 0x0873 }
            com.whatsapp.jid.Jid r0 = r13.A0E(r12, r0)     // Catch:{ all -> 0x0873 }
            X.1BI r0 = (X.AnonymousClass1BI) r0     // Catch:{ all -> 0x0873 }
        L_0x0319:
            long r1 = r8.getLong(r7)     // Catch:{ all -> 0x0873 }
            java.lang.String r16 = r8.getString(r4)     // Catch:{ all -> 0x0873 }
            if (r3 == 0) goto L_0x0335
            r13 = 1
            java.lang.Long[] r12 = new java.lang.Long[r13]     // Catch:{ all -> 0x0873 }
            X.AnonymousClass3MX.A1S(r12, r10, r1)     // Catch:{ all -> 0x0873 }
            java.lang.String[] r2 = new java.lang.String[r13]     // Catch:{ all -> 0x0873 }
            r2[r10] = r16     // Catch:{ all -> 0x0873 }
            X.2jU r1 = new X.2jU     // Catch:{ all -> 0x0873 }
            r1.<init>(r3, r0, r12, r2)     // Catch:{ all -> 0x0873 }
            r14.add(r1)     // Catch:{ all -> 0x0873 }
        L_0x0335:
            r0 = 0
            goto L_0x02f5
        L_0x0337:
            r8.close()     // Catch:{ all -> 0x087f }
            r17.close()
            java.util.HashSet r5 = X.C62842s5.A01(r14)
            X.1Mn r4 = r11.A03
            java.util.HashSet r0 = X.C62842s5.A01(r5)
            java.util.Iterator r3 = r0.iterator()
        L_0x034b:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0362
            java.lang.Object r2 = r3.next()
            X.2jU r2 = (X.C57692jU) r2
            X.1Mm r1 = r4.A00
            com.whatsapp.jobqueue.job.SendPlayedReceiptJobV2 r0 = new com.whatsapp.jobqueue.job.SendPlayedReceiptJobV2
            r0.<init>(r2, r10)
            r1.A01(r0)
            goto L_0x034b
        L_0x0362:
            boolean r0 = r5.isEmpty()
            if (r0 != 0) goto L_0x009e
            java.util.HashSet r4 = X.C17880vN.A12()
            java.util.Iterator r3 = r5.iterator()
        L_0x0370:
            boolean r0 = r3.hasNext()
            r6 = 0
            if (r0 == 0) goto L_0x07fe
            java.lang.Object r0 = r3.next()
            X.2jU r0 = (X.C57692jU) r0
            java.lang.Long[] r2 = r0.A02
            int r1 = r2.length
        L_0x0380:
            if (r6 >= r1) goto L_0x0370
            r0 = r2[r6]
            r4.add(r0)
            int r6 = r6 + 1
            goto L_0x0380
        L_0x038a:
            java.lang.Object r2 = r1.A01
            com.whatsapp.settings.notificationsandsounds.AdvancedNotificationSettingsFragment r2 = (com.whatsapp.settings.notificationsandsounds.AdvancedNotificationSettingsFragment) r2
            X.1BI r1 = r2.A02
            if (r1 == 0) goto L_0x009e
            X.1Nb r0 = r2.A04
            if (r0 == 0) goto L_0x03a8
            X.1yM r0 = r0.A0a(r1)
            r2.A03 = r0
            X.1KB r4 = r2.A00
            if (r4 == 0) goto L_0x03a4
            r0 = 37
            goto L_0x093a
        L_0x03a4:
            java.lang.String r0 = "globalUI"
            goto L_0x042d
        L_0x03a8:
            java.lang.String r0 = "chatSettingsStore"
            goto L_0x042d
        L_0x03ac:
            java.lang.Object r6 = r1.A01
            com.whatsapp.settings.SettingsUserProxyViewModel r6 = (com.whatsapp.settings.SettingsUserProxyViewModel) r6
            boolean r0 = r6.A0Y()
            if (r0 == 0) goto L_0x009e
            java.lang.String r0 = r6.A02
            boolean r0 = X.AnonymousClass4ZA.A01(r0)
            if (r0 == 0) goto L_0x009e
            X.00H r5 = r6.A0E
            java.lang.Object r1 = r5.get()
            X.4gz r1 = (X.C92244gz) r1
            r0 = 1
            X.1TJ r1 = r1.A04
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.A04(r0)
            X.4Yf r1 = r6.A0T()
            X.00H r0 = r6.A0D
            java.lang.Object r8 = r0.get()
            X.4Wc r8 = (X.C87574Wc) r8
            java.lang.String r4 = r1.A03
            int r2 = r1.A01
            java.lang.String r9 = "mmg.whatsapp.net"
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "https://"
            r1.append(r0)
            r1.append(r4)
            r0 = 58
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = "/mms/HEALTHCHECK"
            java.lang.String r0 = X.AnonymousClass000.A0y(r0, r1)
            java.net.URL r1 = new java.net.URL
            r1.<init>(r0)
            r0 = 6
            r7 = 0
            goto L_0x0889
        L_0x0405:
            java.lang.Object r1 = r1.A01
            com.whatsapp.settings.SettingsTabActivity r1 = (com.whatsapp.settings.SettingsTabActivity) r1
            X.1KB r4 = r1.A05
            r0 = 24
            goto L_0x041c
        L_0x040e:
            java.lang.Object r1 = r1.A01
            com.whatsapp.settings.SettingsTabActivity r1 = (com.whatsapp.settings.SettingsTabActivity) r1
            boolean r0 = com.whatsapp.settings.SettingsTabActivity.A0u(r1)
            if (r0 == 0) goto L_0x009e
            X.1KB r4 = r1.A05
            r0 = 25
        L_0x041c:
            X.4ro r3 = new X.4ro
            r3.<init>((com.whatsapp.settings.SettingsTabActivity) r1, (int) r0)
            goto L_0x0a22
        L_0x0423:
            java.lang.Object r2 = r1.A01
            com.whatsapp.settings.SettingsPrivacyAdvancedActivity r2 = (com.whatsapp.settings.SettingsPrivacyAdvancedActivity) r2
            androidx.appcompat.widget.SwitchCompat r1 = r2.A00
            if (r1 != 0) goto L_0x0432
            java.lang.String r0 = "brigadingSwitch"
        L_0x042d:
            X.C18070vi.A11(r0)
            r0 = 0
            throw r0
        L_0x0432:
            boolean r0 = com.whatsapp.settings.SettingsPrivacyAdvancedActivity.A0Q(r2)
            r1.setChecked(r0)
            boolean r0 = com.whatsapp.settings.SettingsPrivacyAdvancedActivity.A0Q(r2)
            if (r0 != 0) goto L_0x0460
            X.0z4 r0 = r2.A0A
            java.lang.String r1 = r0.A0c()
            com.whatsapp.infra.graphql.generated.usermetadata.enums.GraphQLXWA2BrigadingState r0 = com.whatsapp.infra.graphql.generated.usermetadata.enums.GraphQLXWA2BrigadingState.ENFORCED
            java.lang.String r0 = r0.toString()
            boolean r0 = X.C18070vi.A18(r1, r0)
            if (r0 == 0) goto L_0x0460
            X.00H r0 = r2.A07
            if (r0 == 0) goto L_0x0488
            java.lang.Object r1 = r0.get()
            X.1tE r1 = (X.C39531tE) r1
            com.whatsapp.infra.graphql.generated.usermetadata.enums.GraphQLXWA2BrigadingState r0 = com.whatsapp.infra.graphql.generated.usermetadata.enums.GraphQLXWA2BrigadingState.NOT_DETECTED
            r1.A00(r0)
        L_0x0460:
            boolean r0 = com.whatsapp.settings.SettingsPrivacyAdvancedActivity.A0Q(r2)
            if (r0 == 0) goto L_0x009e
            X.0z4 r0 = r2.A0A
            java.lang.String r1 = r0.A0c()
            com.whatsapp.infra.graphql.generated.usermetadata.enums.GraphQLXWA2BrigadingState r0 = com.whatsapp.infra.graphql.generated.usermetadata.enums.GraphQLXWA2BrigadingState.DETECTED
            java.lang.String r0 = r0.toString()
            boolean r0 = X.C18070vi.A18(r1, r0)
            if (r0 == 0) goto L_0x009e
            X.00H r0 = r2.A07
            if (r0 == 0) goto L_0x0488
            java.lang.Object r1 = r0.get()
            X.1tE r1 = (X.C39531tE) r1
            com.whatsapp.infra.graphql.generated.usermetadata.enums.GraphQLXWA2BrigadingState r0 = com.whatsapp.infra.graphql.generated.usermetadata.enums.GraphQLXWA2BrigadingState.NOT_DETECTED
            r1.A00(r0)
            return
        L_0x0488:
            java.lang.String r0 = "brigadingStateObservers"
            goto L_0x042d
        L_0x048b:
            java.lang.Object r0 = r1.A01
            com.whatsapp.spamreport.ReportSpamDialogFragment r0 = (com.whatsapp.spamreport.ReportSpamDialogFragment) r0
            X.1KB r2 = r0.A2H()
            r1 = 2131888854(0x7f120ad6, float:1.9412355E38)
            r0 = 1
            r2.A08(r1, r0)
            return
        L_0x049b:
            java.lang.Object r10 = r1.A01
            com.whatsapp.shops.ShopsProductPreviewFragment r10 = (com.whatsapp.shops.ShopsProductPreviewFragment) r10
            androidx.constraintlayout.widget.ConstraintLayout r0 = r10.A00
            int r2 = r0.getWidth()
            androidx.constraintlayout.widget.ConstraintLayout r0 = r10.A00
            int r1 = r0.getHeight()
            android.content.Context r3 = r10.A14()
            r0 = 1090519040(0x41000000, float:8.0)
            int r0 = X.C62762rw.A01(r3, r0)
            java.util.LinkedList r9 = new java.util.LinkedList
            r9.<init>()
            int r0 = r0 * 2
            int r2 = r2 - r0
            r8 = 3
            int r2 = r2 / r8
            r7 = 2
            int r1 = r1 - r0
            int r6 = java.lang.Math.min(r2, r1)
            r5 = 0
            r2 = 0
        L_0x04c7:
            android.view.View r1 = new android.view.View
            r1.<init>(r3)
            r0 = 2131232904(0x7f080888, float:1.808193E38)
            r1.setBackgroundResource(r0)
            int r0 = android.view.View.generateViewId()
            r1.setId(r0)
            androidx.constraintlayout.widget.ConstraintLayout r0 = r10.A00
            r0.addView(r1)
            r9.add(r1)
            int r2 = r2 + 1
            if (r2 >= r8) goto L_0x04e6
            goto L_0x04c7
        L_0x04e6:
            java.lang.Object r0 = r9.get(r5)
            android.view.View r0 = (android.view.View) r0
            int r4 = r0.getId()
            X.Cw9 r3 = new X.Cw9
            r3.<init>()
            X.CZ8 r0 = X.C26264Cw9.A03(r3, r4)
            X.CpY r0 = r0.A02
            r0.A0c = r6
            X.CZ8 r0 = X.C26264Cw9.A03(r3, r4)
            X.CpY r0 = r0.A02
            r0.A0a = r6
            r1 = 2131433874(0x7f0b1992, float:1.8489546E38)
            r11 = 2131433874(0x7f0b1992, float:1.8489546E38)
            r3.A09(r4, r8, r1, r8)
            r0 = 4
            r3.A09(r4, r0, r1, r0)
            r2 = 7
            r1 = 6
            if (r5 != 0) goto L_0x053f
            r3.A09(r4, r1, r11, r1)
            r0 = 1
            java.lang.Object r0 = r9.get(r0)
            android.view.View r0 = (android.view.View) r0
            int r0 = r0.getId()
            r3.A09(r4, r2, r0, r1)
            r1 = 1
            X.CZ8 r0 = X.C26264Cw9.A03(r3, r4)
            X.CpY r0 = r0.A02
            r0.A0U = r1
        L_0x0530:
            androidx.constraintlayout.widget.ConstraintLayout r0 = r10.A00
            r3.A0A(r0)
            int r5 = r5 + 1
            if (r5 < r8) goto L_0x04e6
            com.facebook.shimmer.ShimmerFrameLayout r0 = r10.A01
            r0.A03()
            return
        L_0x053f:
            if (r5 != r7) goto L_0x0553
            r0 = 1
            java.lang.Object r0 = r9.get(r0)
            android.view.View r0 = (android.view.View) r0
            int r0 = r0.getId()
            r3.A09(r4, r1, r0, r2)
            r3.A09(r4, r2, r11, r2)
            goto L_0x0530
        L_0x0553:
            int r0 = r5 + -1
            java.lang.Object r0 = r9.get(r0)
            android.view.View r0 = (android.view.View) r0
            int r0 = r0.getId()
            r3.A09(r4, r1, r0, r2)
            int r0 = r5 + 1
            java.lang.Object r0 = r9.get(r0)
            android.view.View r0 = (android.view.View) r0
            int r0 = r0.getId()
            r3.A09(r4, r2, r0, r1)
            goto L_0x0530
        L_0x0572:
            java.lang.Object r2 = r1.A01
            X.3Tl r2 = (X.C73283Tl) r2
            r0 = 0
            X.C18070vi.A0d(r2, r0)
            X.1M9 r1 = r2.A02
            X.1EC r0 = r2.A03
            X.1E7 r0 = r1.A0E(r0)
            if (r0 == 0) goto L_0x05ac
            X.1DT r1 = r2.A00
            java.lang.String r0 = r0.A0K()
            r1.A0E(r0)
            X.10I r1 = r2.A05
            r0 = 45
            A02(r1, r2, r0)
            return
        L_0x0595:
            java.lang.Object r2 = r1.A01
            X.3Tl r2 = (X.C73283Tl) r2
            X.1M9 r1 = r2.A02
            X.1EC r0 = r2.A03
            X.1E7 r0 = r1.A0E(r0)
            if (r0 == 0) goto L_0x05ac
            X.1DT r1 = r2.A01
            boolean r0 = r0.A12
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            goto L_0x05f9
        L_0x05ac:
            X.1wy r1 = r2.A04
            X.1Wu r0 = X.C27621Wu.A00
            r1.A0E(r0)
            return
        L_0x05b4:
            java.lang.Object r3 = r1.A01
            com.whatsapp.shareinvitelink.ShareGroupInviteLinkActivity r3 = (com.whatsapp.shareinvitelink.ShareGroupInviteLinkActivity) r3
            X.1L9 r2 = r3.A01
            X.1EC r1 = r3.A05
            r0 = 5
            android.content.Intent r0 = X.AnonymousClass1LU.A0o(r3, r1, r0)
            r2.A08(r3, r0)
            return
        L_0x05c5:
            java.lang.Object r2 = r1.A01
            X.4gz r2 = (X.C92244gz) r2
            r1 = 0
            X.1Hc r0 = r2.A02
            r0.unregisterObserver(r2)
            r2.A00 = r1
            return
        L_0x05d2:
            java.lang.Object r1 = r1.A01
            com.whatsapp.settings.notificationsandsounds.NotificationsAndSoundsViewModel r1 = (com.whatsapp.settings.notificationsandsounds.NotificationsAndSoundsViewModel) r1
            r0 = 0
            X.C18070vi.A0d(r1, r0)
            X.1BI r0 = r1.A00
            com.whatsapp.settings.notificationsandsounds.NotificationsAndSoundsViewModel.A00(r0, r1)
            return
        L_0x05e0:
            java.lang.Object r0 = r1.A01
            com.whatsapp.settings.notificationsandsounds.AdvancedNotificationSettingsFragment r0 = (com.whatsapp.settings.notificationsandsounds.AdvancedNotificationSettingsFragment) r0
            com.whatsapp.settings.notificationsandsounds.AdvancedNotificationSettingsFragment.A00(r0)
            return
        L_0x05e8:
            java.lang.Object r2 = r1.A01
            X.4aW r2 = (X.AnonymousClass4aW) r2
            X.1DT r1 = r2.A02
            r0 = 1
            X.AnonymousClass3MX.A1K(r1, r0)
            X.AnonymousClass4aW.A0A(r2)
            java.lang.Integer r0 = X.C17880vN.A0i()
        L_0x05f9:
            r1.A0E(r0)
            return
        L_0x05fd:
            java.lang.Object r4 = r1.A01
            X.4Xj r4 = (X.C87864Xj) r4
            X.2sv r5 = r4.A02
            X.4Mt r1 = r5.A02()
            goto L_0x0612
        L_0x0608:
            java.lang.Object r4 = r1.A01
            X.4Xj r4 = (X.C87864Xj) r4
            X.2sv r5 = r4.A02
            X.4Mt r1 = r5.A01()
        L_0x0612:
            if (r1 == 0) goto L_0x0620
            X.1DT r3 = r4.A00
            r0 = 2
            X.4Mu r2 = new X.4Mu
            r2.<init>(r1, r0)
        L_0x061c:
            r3.A0E(r2)
            return
        L_0x0620:
            X.11E r0 = r4.A01
            boolean r0 = r0.A09()
            X.1DT r3 = r4.A00
            if (r0 != 0) goto L_0x0632
            r1 = 3
            r0 = 0
            X.4Mu r2 = new X.4Mu
            r2.<init>(r0, r1)
            goto L_0x061c
        L_0x0632:
            r1 = 1
            r2 = 0
            X.4Mu r0 = new X.4Mu
            r0.<init>(r2, r1)
            r3.A0E(r0)
            X.4XR r0 = r4.A03     // Catch:{ IOException -> 0x0686 }
            X.8BJ r4 = r0.A01()     // Catch:{ IOException -> 0x0686 }
            if (r4 != 0) goto L_0x064e
            r1 = 4
            X.4Mu r0 = new X.4Mu     // Catch:{ all -> 0x067a }
            r0.<init>(r2, r1)     // Catch:{ all -> 0x067a }
            r3.A0E(r0)     // Catch:{ all -> 0x067a }
            goto L_0x0690
        L_0x064e:
            boolean r0 = r5.A05(r4)     // Catch:{ all -> 0x067a }
            if (r0 != 0) goto L_0x065f
            r1 = 5
            r0 = 0
            X.4Mu r2 = new X.4Mu     // Catch:{ all -> 0x067a }
            r2.<init>(r0, r1)     // Catch:{ all -> 0x067a }
        L_0x065b:
            r3.A0E(r2)     // Catch:{ all -> 0x067a }
            goto L_0x0676
        L_0x065f:
            X.4Mt r2 = r5.A02()     // Catch:{ all -> 0x067a }
            if (r2 != 0) goto L_0x066d
            r1 = 5
            r0 = 0
            X.4Mu r2 = new X.4Mu     // Catch:{ all -> 0x067a }
            r2.<init>(r0, r1)     // Catch:{ all -> 0x067a }
            goto L_0x065b
        L_0x066d:
            r1 = 2
            X.4Mu r0 = new X.4Mu     // Catch:{ all -> 0x067a }
            r0.<init>(r2, r1)     // Catch:{ all -> 0x067a }
            r3.A0E(r0)     // Catch:{ all -> 0x067a }
        L_0x0676:
            r4.close()     // Catch:{ IOException -> 0x0686 }
            goto L_0x0690
        L_0x067a:
            r1 = move-exception
            if (r4 == 0) goto L_0x0685
            r4.close()     // Catch:{ all -> 0x0681 }
            goto L_0x0685
        L_0x0681:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ IOException -> 0x0686 }
        L_0x0685:
            throw r1     // Catch:{ IOException -> 0x0686 }
        L_0x0686:
            r2 = 4
            r1 = 0
            X.4Mu r0 = new X.4Mu     // Catch:{ all -> 0x0694 }
            r0.<init>(r1, r2)     // Catch:{ all -> 0x0694 }
            r3.A0E(r0)     // Catch:{ all -> 0x0694 }
        L_0x0690:
            android.net.TrafficStats.clearThreadStatsTag()
            return
        L_0x0694:
            r0 = move-exception
            android.net.TrafficStats.clearThreadStatsTag()
            throw r0
        L_0x0699:
            java.lang.Object r0 = r1.A01
            X.1Nh r0 = (X.C25201Nh) r0
            r0.A0M()
            return
        L_0x06a1:
            java.lang.Object r0 = r1.A01
            X.3hN r0 = (X.C75383hN) r0
            com.whatsapp.settings.SettingsTabActivity r1 = r0.A00
            X.00H r0 = r1.A0k
            r0.get()
            X.1bI r1 = r1.A0e
            r0 = 0
            X.C18070vi.A0d(r1, r0)
            r1.A04(r0)
            return
        L_0x06b6:
            java.lang.Object r0 = r1.A01
            com.whatsapp.settings.SettingsTabActivity r0 = (com.whatsapp.settings.SettingsTabActivity) r0
            X.00H r0 = r0.A0u
            java.lang.Object r1 = r0.get()
            X.6uV r1 = (X.C136846uV) r1
            r0 = 0
            r1.A03(r0)
            return
        L_0x06c7:
            java.lang.Object r0 = r1.A01
            com.whatsapp.settings.SettingsTabActivity r0 = (com.whatsapp.settings.SettingsTabActivity) r0
            androidx.recyclerview.widget.RecyclerView r1 = r0.A05
            r0 = 0
            r1.A0f(r0)
            return
        L_0x06d2:
            java.lang.Object r4 = r1.A01
            com.whatsapp.settings.SettingsTabActivity r4 = (com.whatsapp.settings.SettingsTabActivity) r4
            r0 = 2131435287(0x7f0b1f17, float:1.8492412E38)
            android.view.ViewStub r1 = X.AnonymousClass3MX.A0H(r4, r0)
            r0 = 2131624145(0x7f0e00d1, float:1.8875461E38)
            android.view.View r6 = X.AnonymousClass3MY.A0G(r1, r0)
            android.view.ViewGroup$MarginLayoutParams r2 = X.AnonymousClass3MW.A0B(r6)
            android.content.res.Resources r1 = r4.getResources()
            r0 = 2131168629(0x7f070d75, float:1.7951565E38)
            int r1 = r1.getDimensionPixelSize(r0)
            int r0 = X.AnonymousClass3MZ.A01(r4, r0)
            r3 = 0
            r2.setMargins(r1, r3, r0, r3)
            r6.setLayoutParams(r2)
            r0 = 2131428058(0x7f0b02da, float:1.847775E38)
            android.view.View r7 = r6.findViewById(r0)
            com.whatsapp.wds.components.banners.WDSBanner r7 = (com.whatsapp.wds.components.banners.WDSBanner) r7
            r4.A0g = r7
            r1 = 2131893406(0x7f121c9e, float:1.9421588E38)
            X.4XT r5 = new X.4XT
            r5.<init>()
            X.4A8 r0 = X.AnonymousClass4A8.A00
            r5.A02 = r0
            r0 = 1
            r5.A05 = r0
            java.lang.String r2 = r4.getString(r1)
            r0 = 12
            X.Ajp r1 = new X.Ajp
            r1.<init>(r0)
            java.lang.String r0 = "learn-more"
            android.text.SpannableStringBuilder r0 = X.A3H.A02(r4, r1, r2, r0)
            X.AnonymousClass4XT.A00(r7, r5, r0)
            com.whatsapp.wds.components.banners.WDSBanner r2 = r4.A0g
            r1 = 35
            X.4sN r0 = new X.4sN
            r0.<init>(r4, r1)
            r2.setOnDismissListener((X.C18090vk) r0)
            r0 = 12
            X.C89974dK.A00(r6, r4, r0)
            com.whatsapp.wds.components.banners.WDSBanner r0 = r4.A0g
            if (r0 == 0) goto L_0x074d
            X.10I r2 = r4.A05
            r1 = 23
            X.4ro r0 = new X.4ro
            r0.<init>((com.whatsapp.settings.SettingsTabActivity) r4, (int) r1)
            r2.CGN(r0)
        L_0x074d:
            X.00H r0 = r4.A0w
            java.lang.Object r0 = r0.get()
            X.1pI r0 = (X.C37301pI) r0
            r0.A00(r3)
            return
        L_0x0759:
            java.lang.Object r0 = r1.A01
            com.whatsapp.settings.SettingsTabActivity r0 = (com.whatsapp.settings.SettingsTabActivity) r0
            com.whatsapp.wds.components.banners.WDSBanner r1 = r0.A0g
            boolean r0 = com.whatsapp.settings.SettingsTabActivity.A0u(r0)
            int r0 = X.C72453Mb.A07(r0)
            r1.setVisibility(r0)
            return
        L_0x076b:
            java.lang.Object r2 = r1.A01
            X.1FY r2 = (X.AnonymousClass1FY) r2
            java.lang.String r0 = "https://www.whatsapp.com/security"
            android.net.Uri r0 = android.net.Uri.parse(r0)
            android.content.Intent r1 = X.AnonymousClass3MY.A07(r0)
            X.1L9 r0 = r2.A01
            r0.A08(r2, r1)
            return
        L_0x077f:
            java.lang.Object r0 = r1.A01
            X.4gp r0 = (X.C92144gp) r0
            java.lang.Object r0 = r0.A01
            com.whatsapp.settings.SettingsPrivacy r0 = (com.whatsapp.settings.SettingsPrivacy) r0
            r0.A4b()
            return
        L_0x078b:
            java.lang.Object r0 = r1.A01
            X.4oO r0 = (X.C96774oO) r0
            java.lang.Object r0 = r0.A01
            com.whatsapp.settings.SettingsPrivacy r0 = (com.whatsapp.settings.SettingsPrivacy) r0
            com.whatsapp.settings.SettingsPrivacy.A0q(r0)
            return
        L_0x0797:
            java.lang.Object r0 = r1.A01
            com.whatsapp.settings.SettingsPrivacy r0 = (com.whatsapp.settings.SettingsPrivacy) r0
            com.whatsapp.settings.SettingsPrivacy.A0d(r0)
            return
        L_0x079f:
            java.lang.Object r1 = r1.A01
            X.1FU r1 = (X.AnonymousClass1FU) r1
            r0 = 0
            X.C18070vi.A0d(r1, r0)
            X.9zE r2 = new X.9zE
            r2.<init>(r1)
            r1 = 0
            r0 = 2131893544(0x7f121d28, float:1.9421868E38)
            X.C198979zE.A00(r2, r1, r0)
            return
        L_0x07b4:
            java.lang.Object r1 = r1.A01
            com.whatsapp.settings.SettingsNetworkUsage r1 = (com.whatsapp.settings.SettingsNetworkUsage) r1
            r0 = 0
            com.whatsapp.settings.SettingsNetworkUsage.A0Q(r1, r0)
            return
        L_0x07bd:
            java.lang.Object r0 = r1.A01
            com.whatsapp.settings.SettingsDataUsageViewModel r0 = (com.whatsapp.settings.SettingsDataUsageViewModel) r0
            r0.A0T()
            return
        L_0x07c5:
            java.lang.Object r0 = r1.A01
            X.6pm r0 = (X.C133956pm) r0
            X.1To r0 = r0.A04
            r0.A0G()
            r0.A0I()
            return
        L_0x07d2:
            java.lang.Object r1 = r1.A01
            com.whatsapp.settings.SettingsContactsActivity r1 = (com.whatsapp.settings.SettingsContactsActivity) r1
            r0 = 0
            X.C18070vi.A0d(r1, r0)
            com.whatsapp.settings.SettingsContactsActivity.A0c(r1, r0)
            com.whatsapp.settings.SettingsContactsActivity.A0Q(r1)
            return
        L_0x07e1:
            java.lang.Object r0 = r1.A01
            com.whatsapp.settings.SettingsContactsActivity r0 = (com.whatsapp.settings.SettingsContactsActivity) r0
            com.whatsapp.settings.SettingsContactsActivity.A03(r0)
            return
        L_0x07e9:
            java.lang.Object r1 = r1.A01
            com.whatsapp.settings.SettingsContactsActivity r1 = (com.whatsapp.settings.SettingsContactsActivity) r1
            r0 = 0
            r1.A0b = r0
            return
        L_0x07f1:
            X.1TG r0 = r8.A01
            r0.A06(r9)
            return
        L_0x07f7:
            r1 = move-exception
            X.1CL r0 = r2.A01
            r0.A00(r10)
            throw r1
        L_0x07fe:
            int r0 = r4.size()
            java.lang.String[] r5 = new java.lang.String[r0]
            java.util.Iterator r4 = r4.iterator()
        L_0x0808:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x081c
            long r2 = X.C17890vO.A07(r4)
            int r1 = r6 + 1
            java.lang.String r0 = java.lang.Long.toString(r2)
            r5[r6] = r0
            r6 = r1
            goto L_0x0808
        L_0x081c:
            r1 = 975(0x3cf, float:1.366E-42)
            X.23b r0 = new X.23b
            r0.<init>(r5, r1)
            X.1au r7 = r15.A05()
            X.1xA r6 = r7.BD0()     // Catch:{ all -> 0x086e }
            java.util.Iterator r5 = r0.iterator()     // Catch:{ all -> 0x0864 }
        L_0x082f:
            boolean r0 = r5.hasNext()     // Catch:{ all -> 0x0864 }
            if (r0 == 0) goto L_0x085a
            java.lang.Object r4 = r5.next()     // Catch:{ all -> 0x0864 }
            java.lang.String[] r4 = (java.lang.String[]) r4     // Catch:{ all -> 0x0864 }
            r0 = r7
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x0864 }
            X.1Ev r3 = r0.A02     // Catch:{ all -> 0x0864 }
            java.lang.String r2 = "played_self_receipt"
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x0864 }
            java.lang.String r0 = "message_row_id IN "
            r1.append(r0)     // Catch:{ all -> 0x0864 }
            int r0 = r4.length     // Catch:{ all -> 0x0864 }
            java.lang.String r0 = X.AnonymousClass1H2.A00(r0)     // Catch:{ all -> 0x0864 }
            java.lang.String r1 = X.AnonymousClass000.A0y(r0, r1)     // Catch:{ all -> 0x0864 }
            java.lang.String r0 = "clearPlayedSelfReceiptTable"
            r3.A04(r2, r1, r0, r4)     // Catch:{ all -> 0x0864 }
            goto L_0x082f
        L_0x085a:
            r6.A00()     // Catch:{ all -> 0x0864 }
            r6.close()     // Catch:{ all -> 0x086e }
            r7.close()
            return
        L_0x0864:
            r1 = move-exception
            r6.close()     // Catch:{ all -> 0x0869 }
            goto L_0x086d
        L_0x0869:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x086e }
        L_0x086d:
            throw r1     // Catch:{ all -> 0x086e }
        L_0x086e:
            r1 = move-exception
            r7.close()     // Catch:{ all -> 0x0884 }
            throw r1
        L_0x0873:
            r1 = move-exception
            if (r8 == 0) goto L_0x087e
            r8.close()     // Catch:{ all -> 0x087a }
            goto L_0x087e
        L_0x087a:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x087f }
        L_0x087e:
            throw r1     // Catch:{ all -> 0x087f }
        L_0x087f:
            r1 = move-exception
            r17.close()     // Catch:{ all -> 0x0884 }
            throw r1
        L_0x0884:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)
            throw r1
        L_0x0889:
            android.net.TrafficStats.setThreadStatsTag(r0)     // Catch:{ all -> 0x08f3 }
            javax.net.ssl.HttpsURLConnection r3 = X.AnonymousClass1D9.A03(r1)     // Catch:{ all -> 0x08f3 }
            X.C18070vi.A0X(r3)     // Catch:{ all -> 0x08f3 }
            X.18j r1 = r8.A00     // Catch:{ all -> 0x08f3 }
            X.9A9 r0 = r1.A02()     // Catch:{ all -> 0x08f3 }
            r3.setSSLSocketFactory(r0)     // Catch:{ all -> 0x08f3 }
            r1.A02()     // Catch:{ all -> 0x08f3 }
            java.lang.String r0 = "POST"
            r3.setRequestMethod(r0)     // Catch:{ all -> 0x08f3 }
            r0 = 15000(0x3a98, float:2.102E-41)
            r3.setConnectTimeout(r0)     // Catch:{ all -> 0x08f3 }
            r0 = 30000(0x7530, float:4.2039E-41)
            r3.setReadTimeout(r0)     // Catch:{ all -> 0x08f3 }
            r2 = 1
            r3.setDoOutput(r2)     // Catch:{ all -> 0x08f3 }
            java.lang.String r0 = "Host"
            r3.setRequestProperty(r0, r9)     // Catch:{ all -> 0x08f3 }
            javax.net.ssl.HostnameVerifier r1 = javax.net.ssl.HttpsURLConnection.getDefaultHostnameVerifier()     // Catch:{ all -> 0x08f3 }
            X.AlR r0 = new X.AlR     // Catch:{ all -> 0x08f3 }
            r0.<init>(r9, r1)     // Catch:{ all -> 0x08f3 }
            r3.setHostnameVerifier(r0)     // Catch:{ all -> 0x08f3 }
            r3.connect()     // Catch:{ all -> 0x08f3 }
            int r1 = r3.getResponseCode()     // Catch:{ all -> 0x08f3 }
            r3.getHeaderFields()     // Catch:{ all -> 0x08f3 }
            r0 = 200(0xc8, float:2.8E-43)
            if (r1 != r0) goto L_0x08db
            r0 = 200(0xc8, double:9.9E-322)
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x08f3 }
            X.C87574Wc.A00(r8, r0, r2)     // Catch:{ all -> 0x08f3 }
            return
        L_0x08db:
            java.lang.Long r0 = X.C17880vN.A0n(r1)     // Catch:{ all -> 0x08f3 }
            X.C87574Wc.A00(r8, r0, r7)     // Catch:{ all -> 0x08f3 }
            java.lang.String r2 = java.lang.String.valueOf(r1)     // Catch:{ all -> 0x08f3 }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x08f3 }
            java.lang.String r0 = "SettingsUserProxyViewModel/MediaHealthCheck on error: "
            X.C17900vP.A0e(r0, r2, r1)     // Catch:{ all -> 0x08f3 }
            A01(r6, r5, r4)     // Catch:{ all -> 0x08f3 }
            return
        L_0x08f3:
            r3 = move-exception
            r2 = 0
            X.C87574Wc.A00(r8, r2, r7)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "MediaHealthChecker/check exception occurred: "
            X.C17900vP.A0X(r3, r0, r1)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "SettingsUserProxyViewModel/MediaHealthCheck on error: "
            X.C17900vP.A0e(r0, r2, r1)
            A01(r6, r5, r4)
            return
        L_0x090e:
            java.lang.Object r2 = r1.A01
            com.whatsapp.settings.SettingsPrivacy r2 = (com.whatsapp.settings.SettingsPrivacy) r2
            r0 = 1
            r2.A17 = r0
            java.util.Set r1 = r2.A15
            X.00H r0 = r2.A0m
            X.1pj r0 = X.AnonymousClass3MW.A0V(r0)
            java.util.Set r0 = r0.A0B()
            r1.addAll(r0)
            X.00H r0 = r2.A0q
            java.lang.Object r0 = r0.get()
            X.6na r0 = (X.C132786na) r0
            java.util.List r0 = r0.A00()
            r1.addAll(r0)
            r0 = 0
            r2.A17 = r0
            X.1KB r4 = r2.A05
            r0 = 9
        L_0x093a:
            X.4ro r3 = new X.4ro
            r3.<init>((java.lang.Object) r2, (int) r0)
            goto L_0x0a22
        L_0x0941:
            java.lang.Object r5 = r1.A01
            com.whatsapp.settings.SettingsPrivacy r5 = (com.whatsapp.settings.SettingsPrivacy) r5
            X.1Le r0 = r5.A0Y
            int r1 = r0.A05()
            if (r1 == 0) goto L_0x09b6
            r8 = 0
            r7 = 1
            if (r1 == r7) goto L_0x09a0
            r0 = 2
            if (r1 != r0) goto L_0x09be
            X.1Le r0 = r5.A0Y
            java.util.ArrayList r0 = r0.A0B()
            int r6 = r0.size()
            if (r6 == 0) goto L_0x09b6
            X.0vb r4 = r5.A00
            r3 = 2131755402(0x7f10018a, float:1.9141682E38)
        L_0x0965:
            long r1 = (long) r6
            java.lang.Object[] r0 = new java.lang.Object[r7]
            X.C17880vN.A1T(r0, r6, r8)
            java.lang.String r2 = r4.A0K(r0, r3, r1)
        L_0x096f:
            X.1mM r1 = r5.A0j
            java.lang.Integer r0 = X.AnonymousClass00R.A0J
            boolean r0 = r1.A06(r0)
            if (r0 == 0) goto L_0x0995
            X.00H r0 = r5.A0y
            java.lang.Object r0 = r0.get()
            X.1dS r0 = (X.C30141dS) r0
            boolean r0 = r0.A00()
            if (r0 == 0) goto L_0x0995
            java.lang.StringBuilder r1 = X.AnonymousClass000.A11(r2)
            r0 = 2131895634(0x7f122552, float:1.9426107E38)
            X.C17880vN.A1A(r5, r1, r0)
            java.lang.String r2 = r1.toString()
        L_0x0995:
            X.1KB r4 = r5.A05
            r0 = 11
            X.7RS r3 = new X.7RS
            r3.<init>(r0, r2, r5)
            goto L_0x0a22
        L_0x09a0:
            X.1Le r0 = r5.A0Y
            java.util.ArrayList r0 = r0.A0A()
            int r6 = r0.size()
            if (r6 != 0) goto L_0x09b0
            r0 = 2131892916(0x7f121ab4, float:1.9420594E38)
            goto L_0x09b9
        L_0x09b0:
            X.0vb r4 = r5.A00
            r3 = 2131755403(0x7f10018b, float:1.9141684E38)
            goto L_0x0965
        L_0x09b6:
            r0 = 2131894757(0x7f1221e5, float:1.9424328E38)
        L_0x09b9:
            java.lang.String r2 = r5.getString(r0)
            goto L_0x096f
        L_0x09be:
            java.lang.String r0 = "unknown status distribution mode"
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0n(r0)
            throw r0
        L_0x09c5:
            java.lang.Object r5 = r1.A01
            com.whatsapp.settings.SettingsDataUsageActivity r5 = (com.whatsapp.settings.SettingsDataUsageActivity) r5
            X.181 r0 = r5.A0E
            com.whatsapp.Statistics$Data r10 = r0.A01()
            r7 = 2131895829(0x7f122615, float:1.9426502E38)
            r4 = 1
            java.lang.Object[] r6 = new java.lang.Object[r4]
            X.0vb r8 = r5.A00
            long r2 = r10.A0E
            long r0 = r10.A0G
            long r2 = r2 + r0
            long r0 = r10.A0M
            long r2 = r2 + r0
            long r0 = r10.A0D
            long r2 = r2 + r0
            long r0 = r10.A0J
            long r2 = r2 + r0
            java.lang.String r0 = X.C88584aA.A04(r8, r2)
            java.lang.String r0 = r8.A0F(r0)
            r8 = 0
            java.lang.String r6 = X.C17880vN.A0q(r5, r0, r6, r8, r7)
            r7 = 2131895828(0x7f122614, float:1.94265E38)
            java.lang.Object[] r4 = new java.lang.Object[r4]
            X.0vb r9 = r5.A00
            long r2 = r10.A01
            long r0 = r10.A03
            long r2 = r2 + r0
            long r0 = r10.A0B
            long r2 = r2 + r0
            long r0 = r10.A00
            long r2 = r2 + r0
            long r0 = r10.A08
            long r2 = r2 + r0
            java.lang.String r0 = X.C88584aA.A04(r9, r2)
            java.lang.String r0 = r9.A0F(r0)
            java.lang.String r1 = X.C17880vN.A0q(r5, r0, r4, r8, r7)
            X.0vb r0 = r5.A00
            java.lang.String r1 = X.AnonymousClass1EG.A04(r0, r6, r1)
            X.1KB r4 = r5.A05
            r0 = 10
            X.7RS r3 = new X.7RS
            r3.<init>(r0, r1, r5)
        L_0x0a22:
            r4.A0J(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C98844ro.run():void");
    }

    public C98844ro(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }
}
