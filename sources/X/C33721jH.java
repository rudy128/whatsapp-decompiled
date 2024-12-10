package X;

import android.accounts.AccountManager;
import android.app.KeyguardManager;
import android.content.Context;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.util.Log;

/* renamed from: X.1jH  reason: invalid class name and case insensitive filesystem */
public class C33721jH {
    public final AnonymousClass190 A00;
    public final AnonymousClass11P A01;
    public final AnonymousClass118 A02;
    public final C19830z4 A03;
    public final AnonymousClass10I A04;
    public final AnonymousClass00H A05;
    public final AnonymousClass11C A06;
    public final C18030ve A07;
    public final AnonymousClass18K A08;
    public final AnonymousClass00H A09;
    public final AnonymousClass00H A0A;

    public static void A00(C33721jH r6, Boolean bool, Exception exc, int i) {
        int i2;
        KeyguardManager A062 = r6.A06.A06();
        if (A062 != null && AnonymousClass112.A06()) {
            if (C18020vd.A05(C18040vf.A02, r6.A07, 5681)) {
                AnonymousClass2G2 r2 = new AnonymousClass2G2();
                r2.A00 = Integer.valueOf(i);
                Context context = r6.A02.A00;
                Boolean bool2 = C17970vW.A03;
                AccountManager accountManager = AccountManager.get(context);
                int i3 = -1;
                if (accountManager != null) {
                    try {
                        i3 = accountManager.getAccountsByType("com.google").length;
                    } catch (Exception unused) {
                    }
                }
                r2.A02 = Long.valueOf((long) i3);
                r2.A03 = Long.valueOf((long) C41371wF.A00(context));
                if (exc != null) {
                    r2.A04 = Log.getStackTraceInfo(exc);
                }
                if (!A062.isDeviceSecure() || bool == null) {
                    i2 = 2;
                } else {
                    i2 = 4;
                    if (bool.booleanValue()) {
                        i2 = 3;
                    }
                }
                r2.A01 = Integer.valueOf(i2);
                r6.A08.CC7(r2);
            }
        }
    }

    public void A01(int i, int i2) {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("BackupTokenProtocolHelper/sendBackupTokenRequest/backupTokenType:");
        int i3 = i;
        sb.append(i3);
        Log.i(sb.toString());
        String A0n = this.A03.A0n();
        if (AnonymousClass1EG.A0H(A0n)) {
            return;
        }
        if (i3 != 2 || ((A14) this.A09.get()).A02()) {
            byte[] A0H = C17970vW.A0H();
            AnonymousClass00H r1 = this.A0A;
            String A0B = ((AnonymousClass1OZ) r1.get()).A0B();
            AnonymousClass1OZ r15 = (AnonymousClass1OZ) r1.get();
            C29621ca r7 = new C29621ca("token", A0H, (AnonymousClass1MD[]) null);
            if (i3 == 2) {
                str = "foa";
            } else {
                str = "blockstore";
            }
            C29621ca r6 = new C29621ca(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, str, (AnonymousClass1MD[]) null);
            r15.A0J(new AnonymousClass37A(this, A0n, A0H, i3, i2), new C29621ca("iq", new AnonymousClass1MD[]{new AnonymousClass1MD("to", "s.whatsapp.net"), new AnonymousClass1MD("xmlns", "w:auth:backup:token"), new AnonymousClass1MD((String) PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "set"), new AnonymousClass1MD((String) PublicKeyCredentialControllerUtility.JSON_KEY_ID, A0B)}, new C29621ca[]{r7, r6}), A0B, 226, 32000);
            return;
        }
        Log.i("BackupTokenProtocolHelper/sendBackupTokenRequest/foa backup token is not eligible");
    }

    public C33721jH(AnonymousClass190 r1, AnonymousClass11C r2, AnonymousClass11P r3, AnonymousClass118 r4, C19830z4 r5, C18030ve r6, AnonymousClass18K r7, AnonymousClass10I r8, AnonymousClass00H r9, AnonymousClass00H r10, AnonymousClass00H r11) {
        this.A01 = r3;
        this.A07 = r6;
        this.A02 = r4;
        this.A04 = r8;
        this.A08 = r7;
        this.A0A = r9;
        this.A06 = r2;
        this.A03 = r5;
        this.A00 = r1;
        this.A05 = r10;
        this.A09 = r11;
    }
}
