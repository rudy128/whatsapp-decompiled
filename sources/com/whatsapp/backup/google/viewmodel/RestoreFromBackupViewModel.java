package com.whatsapp.backup.google.viewmodel;

import X.AnonymousClass00H;
import X.AnonymousClass10I;
import X.AnonymousClass19D;
import X.AnonymousClass1DT;
import X.AnonymousClass1J2;
import X.AnonymousClass1NO;
import X.AnonymousClass3MW;
import X.C108965cb;
import X.C17890vO;
import X.C179389Ht;
import X.C18070vi;
import X.C183839Zu;
import X.C218617r;
import X.C27431Wb;
import com.whatsapp.backup.encryptedbackup.PasskeyBackupEnabler;

public final class RestoreFromBackupViewModel extends AnonymousClass1J2 {
    public int A00 = 21;
    public final AnonymousClass1DT A01 = AnonymousClass3MW.A0L();
    public final AnonymousClass1DT A02 = AnonymousClass3MW.A0M((Object) null);
    public final AnonymousClass1DT A03 = AnonymousClass3MW.A0M(C17890vO.A0L());
    public final AnonymousClass1DT A04 = AnonymousClass3MW.A0M(C179389Ht.NOT_TRIGGERED);
    public final C218617r A05;
    public final AnonymousClass1NO A06;
    public final C183839Zu A07;
    public final C27431Wb A08;
    public final AnonymousClass10I A09;
    public final AnonymousClass00H A0A;
    public final PasskeyBackupEnabler A0B;
    public final AnonymousClass19D A0C;

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A00(android.app.Activity r9, X.C19986A1x r10, com.whatsapp.backup.google.viewmodel.RestoreFromBackupViewModel r11, X.C179389Ht r12, X.C30391dr r13) {
        /*
            r6 = r11
            r7 = r10
            r8 = r12
            boolean r0 = r13 instanceof X.C21691AoK
            if (r0 == 0) goto L_0x0097
            r5 = r13
            X.AoK r5 = (X.C21691AoK) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0097
            int r2 = r2 - r1
            r5.label = r2
        L_0x0015:
            java.lang.Object r1 = r5.result
            X.1g4 r4 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r5.label
            r3 = 1
            if (r0 == 0) goto L_0x006a
            if (r0 != r3) goto L_0x009e
            java.lang.Object r8 = r5.L$2
            java.lang.Object r7 = r5.L$1
            java.lang.Object r6 = r5.L$0
            com.whatsapp.backup.google.viewmodel.RestoreFromBackupViewModel r6 = (com.whatsapp.backup.google.viewmodel.RestoreFromBackupViewModel) r6
            X.C30691eM.A01(r1)
        L_0x002b:
            X.9MT r1 = (X.AnonymousClass9MT) r1
            boolean r0 = r1 instanceof X.C175348yZ
            if (r0 == 0) goto L_0x0049
            X.8yZ r1 = (X.C175348yZ) r1
            java.lang.Object r5 = r1.A00
            java.lang.String r0 = "RestoreFromBackupViewModel/handlePasskeyInputSuccess"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.10I r0 = r6.A09
            r9 = 35
            X.Aix r4 = new X.Aix
            r4.<init>(r5, r6, r7, r8, r9)
            r0.CGN(r4)
        L_0x0046:
            X.1Wu r0 = X.C27621Wu.A00
            return r0
        L_0x0049:
            boolean r0 = r1 instanceof X.C175338yY
            if (r0 == 0) goto L_0x0046
            X.8yY r1 = (X.C175338yY) r1
            java.lang.Object r2 = r1.A00
            X.9IE r0 = X.AnonymousClass9IE.USER_CANCELED
            if (r2 != r0) goto L_0x005b
            java.lang.String r0 = "RestoreFromBackupViewModel/launchPasskeyInput/user cancelled"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            goto L_0x0046
        L_0x005b:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "RestoreFromBackupViewModel/launchPasskeyInput/error: "
            X.C17900vP.A0X(r2, r0, r1)
            X.1DT r0 = r6.A02
            r0.A0E(r2)
            goto L_0x0046
        L_0x006a:
            X.C30691eM.A01(r1)
            X.19D r2 = r11.A0C
            r1 = 9372(0x249c, float:1.3133E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 != 0) goto L_0x0084
            java.lang.String r0 = "RestoreFromBackupViewModel/launchPasskeyInput/backup is encrypted with a passkey, not supported yet"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            X.1DT r0 = r11.A04
            r0.A0E(r12)
            goto L_0x0046
        L_0x0084:
            com.whatsapp.backup.encryptedbackup.PasskeyBackupEnabler r1 = r11.A0B
            X.9pb r0 = r10.A01
            r5.L$0 = r11
            r5.L$1 = r10
            r5.L$2 = r12
            r5.label = r3
            java.lang.Object r1 = r1.A01(r9, r0, r5)
            if (r1 != r4) goto L_0x002b
            return r4
        L_0x0097:
            X.AoK r5 = new X.AoK
            r5.<init>(r11, r13)
            goto L_0x0015
        L_0x009e:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.backup.google.viewmodel.RestoreFromBackupViewModel.A00(android.app.Activity, X.A1x, com.whatsapp.backup.google.viewmodel.RestoreFromBackupViewModel, X.9Ht, X.1dr):java.lang.Object");
    }

    public RestoreFromBackupViewModel(C218617r r2, AnonymousClass1NO r3, PasskeyBackupEnabler passkeyBackupEnabler, C183839Zu r5, C27431Wb r6, AnonymousClass19D r7, AnonymousClass10I r8, AnonymousClass00H r9) {
        C18070vi.A0w(r8, r2, r5, r7, r6);
        C108965cb.A1P(r3, 7, r9);
        this.A09 = r8;
        this.A05 = r2;
        this.A07 = r5;
        this.A0C = r7;
        this.A08 = r6;
        this.A0B = passkeyBackupEnabler;
        this.A06 = r3;
        this.A0A = r9;
    }
}
