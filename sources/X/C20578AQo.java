package X;

import android.content.Context;
import java.io.File;
import java.util.concurrent.TimeUnit;

/* renamed from: X.AQo  reason: case insensitive filesystem */
public final class C20578AQo implements C72113Kr {
    public final AnonymousClass118 A00;
    public final C19830z4 A01;
    public final AnonymousClass18K A02;
    public final AnonymousClass11S A03;
    public final AnonymousClass11P A04;
    public final C18000vb A05;
    public final C18030ve A06;
    public final AnonymousClass1CM A07;
    public final C33721jH A08;

    private final void A00(int i) {
        String str;
        String str2;
        Context context = this.A00.A00;
        C18030ve r6 = this.A06;
        AnonymousClass11P r2 = this.A04;
        AnonymousClass11S r0 = this.A03;
        C19830z4 r1 = this.A01;
        if (!r0.A0N()) {
            long A012 = AnonymousClass11P.A01(r2);
            if (i == 2) {
                str = "backup_token_foa_file_timestamp";
            } else {
                str = "backup_token_file_timestamp";
            }
            long A0W = r1.A0W(str);
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("BackupTokenUtils/shouldUpdateBackupToken/current time is ");
            A10.append(A012);
            C17900vP.A0m(", token last update time is ", A10, A0W);
            File filesDir = context.getFilesDir();
            if (i == 2) {
                str2 = "foa_backup_token";
            } else {
                str2 = "backup_token";
            }
            if (!C17880vN.A0e(filesDir, str2).exists() || A012 - A0W > TimeUnit.DAYS.toMillis(AnonymousClass8BR.A05(r6, 11046))) {
                C17900vP.A0j("RegistrationDailyCron/shouldUpdateBackupToken/backupTokenType:", AnonymousClass000.A10(), i);
                this.A08.A01(i, 4);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0055, code lost:
        if (X.C24211Jh.A00(r7, "com.facebook.wakizashi") != -1) goto L_0x0057;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0093, code lost:
        if (r1 == false) goto L_0x0095;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void Bqf() {
        /*
            r11 = this;
            X.1CM r0 = r11.A07
            boolean r0 = r0.A04()
            if (r0 == 0) goto L_0x0010
            r0 = 1
            r11.A00(r0)
            r0 = 2
            r11.A00(r0)
        L_0x0010:
            X.0vb r1 = r11.A05
            X.11O r3 = r1.A08
            java.lang.String r2 = r3.A01()
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L_0x0037
            java.util.Locale r1 = r1.A05
            java.lang.String[] r0 = X.AnonymousClass1X0.A04
            java.lang.String r0 = r1.toLanguageTag()
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0037
            android.content.SharedPreferences r0 = r3.A00
            android.content.SharedPreferences$Editor r1 = r0.edit()
            java.lang.String r0 = "forced_language"
            X.C17880vN.A1B(r1, r0)
        L_0x0037:
            X.8qg r5 = new X.8qg
            r5.<init>()
            X.118 r0 = r11.A00
            android.content.Context r7 = r0.A00
            java.lang.String r0 = "com.facebook.katana"
            long r1 = X.C24211Jh.A00(r7, r0)
            r3 = -1
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 != 0) goto L_0x0057
            java.lang.String r0 = "com.facebook.wakizashi"
            long r1 = X.C24211Jh.A00(r7, r0)
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            r10 = 0
            if (r0 == 0) goto L_0x0058
        L_0x0057:
            r10 = 1
        L_0x0058:
            java.lang.String r0 = "com.instagram.android"
            long r1 = X.C24211Jh.A00(r7, r0)
            r8 = -1
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            boolean r6 = X.AnonymousClass000.A1O(r0)
            java.lang.String r0 = "com.facebook.orca"
            long r1 = X.C24211Jh.A00(r7, r0)
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            boolean r4 = X.AnonymousClass000.A1O(r0)
            java.lang.String r0 = "com.facebook.lite"
            long r1 = X.C24211Jh.A00(r7, r0)
            int r0 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            boolean r3 = X.AnonymousClass000.A1O(r0)
            java.lang.String r0 = "com.facebook.services"
            long r1 = X.C24211Jh.A00(r7, r0)
            int r0 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            boolean r1 = X.AnonymousClass000.A1O(r0)
            if (r10 == 0) goto L_0x00c5
            if (r6 == 0) goto L_0x0095
            if (r4 == 0) goto L_0x0095
            if (r3 == 0) goto L_0x0095
            r0 = 4
            if (r1 != 0) goto L_0x0096
        L_0x0095:
            r0 = 2
        L_0x0096:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r5.A00 = r0
            X.18K r3 = r11.A02
            r3.CC7(r5)
            X.0z4 r0 = r11.A01
            android.content.SharedPreferences r1 = X.C17890vO.A0B(r0)
            java.lang.String r0 = "reg_passkey_created_hashed_account_list"
            java.lang.String r2 = X.C17880vN.A0r(r1, r0)
            if (r2 == 0) goto L_0x00d6
            int r0 = r2.length()
            if (r0 == 0) goto L_0x00d6
            X.8qi r1 = new X.8qi
            r1.<init>()
            java.lang.String r0 = "RegistrationDailyCron/logPasskeyCreatedGoogleAccountHashedList/Found"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r1.A00 = r2
            r3.CC7(r1)
            return
        L_0x00c5:
            if (r6 == 0) goto L_0x00c9
            r0 = 3
            goto L_0x0096
        L_0x00c9:
            if (r4 == 0) goto L_0x00cd
            r0 = 5
            goto L_0x0096
        L_0x00cd:
            if (r3 == 0) goto L_0x00d1
            r0 = 6
            goto L_0x0096
        L_0x00d1:
            r0 = 1
            if (r1 == 0) goto L_0x0096
            r0 = 7
            goto L_0x0096
        L_0x00d6:
            java.lang.String r0 = "RegistrationDailyCron/logPasskeyCreatedGoogleAccountHashedList/Not Found"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20578AQo.Bqf():void");
    }

    public C20578AQo(AnonymousClass11S r2, AnonymousClass11P r3, AnonymousClass118 r4, C19830z4 r5, C18000vb r6, C18030ve r7, AnonymousClass18K r8, AnonymousClass1CM r9, C33721jH r10) {
        C18070vi.A0w(r3, r2, r7, r4, r6);
        C18070vi.A0l(r5, r9);
        C18070vi.A0d(r8, 9);
        this.A04 = r3;
        this.A03 = r2;
        this.A06 = r7;
        this.A00 = r4;
        this.A05 = r6;
        this.A01 = r5;
        this.A07 = r9;
        this.A08 = r10;
        this.A02 = r8;
    }
}
