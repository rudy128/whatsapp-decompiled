package com.whatsapp.backup.encryptedbackup;

import X.AnonymousClass190;
import X.AnonymousClass1KB;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import android.content.Intent;

public final class VerifyPasswordFragment extends Hilt_VerifyPasswordFragment {
    public AnonymousClass190 A00;
    public AnonymousClass1KB A01;

    public static final void A00(VerifyPasswordFragment verifyPasswordFragment, int i) {
        EncBackupViewModel A26;
        int i2;
        if (i == -1 || i == 4) {
            verifyPasswordFragment.A26().A0Y(6);
            AnonymousClass3MY.A1M(verifyPasswordFragment.A26().A0A, true);
            int A0T = verifyPasswordFragment.A26().A0T();
            if (A0T != 4) {
                if (A0T != 5) {
                    if (A0T != 7) {
                        i2 = 9;
                        if (A0T == 9) {
                            A26 = verifyPasswordFragment.A26();
                        } else {
                            return;
                        }
                    } else {
                        A26 = verifyPasswordFragment.A26();
                        i2 = 8;
                    }
                    AnonymousClass3MX.A1J(A26.A09, i2);
                }
                verifyPasswordFragment.A26().A0a(300);
                return;
            }
            verifyPasswordFragment.A26().A0a(302);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00c6  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0027  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A21(android.os.Bundle r13, android.view.View r14) {
        /*
            r12 = this;
            r0 = 0
            X.C18070vi.A0d(r14, r0)
            super.A21(r13, r14)
            com.whatsapp.backup.encryptedbackup.EncBackupViewModel r0 = r12.A26()
            int r1 = r0.A0T()
            r0 = 8
            if (r1 == r0) goto L_0x00ae
            r0 = 10
            if (r1 != r0) goto L_0x0022
            com.whatsapp.backup.encryptedbackup.EncBackupViewModel r0 = r12.A26()
            r1 = 9
        L_0x001d:
            X.1DT r0 = r0.A09
            X.AnonymousClass3MX.A1J(r0, r1)
        L_0x0022:
            int r1 = r12.A00
            r0 = 4
            if (r1 == r0) goto L_0x0087
            r0 = 5
            if (r1 == r0) goto L_0x0075
            r0 = 7
            if (r1 == r0) goto L_0x0099
            r0 = 9
            if (r1 == r0) goto L_0x0099
        L_0x0031:
            r1 = 1
            X.4me r8 = new X.4me
            r8.<init>(r12, r1)
            X.0ve r9 = r12.A0A
            if (r9 == 0) goto L_0x00c6
            X.1KB r6 = r12.A01
            if (r6 == 0) goto L_0x00c3
            X.190 r5 = r12.A00
            if (r5 == 0) goto L_0x00c0
            X.11C r7 = r12.A08
            if (r7 == 0) goto L_0x00c9
            X.1FL r4 = r12.A1D()
            r10 = 2131889763(0x7f120e63, float:1.9414199E38)
            r11 = 2131889762(0x7f120e62, float:1.9414197E38)
            X.3xb r3 = new X.3xb
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11)
            r2 = 13
            X.AkK r0 = new X.AkK
            r0.<init>(r12, r3, r2)
            r12.A29(r0)
            com.whatsapp.backup.encryptedbackup.EncBackupViewModel r0 = r12.A26()
            X.1NT r0 = r0.A0F
            X.1NO r0 = r0.A02
            X.2m3 r0 = r0.A00()
            if (r0 == 0) goto L_0x00b5
            r12.A2B(r1)
            r12.A28()
            return
        L_0x0075:
            android.widget.TextView r1 = r12.A03
            if (r1 == 0) goto L_0x007f
            r0 = 2131889880(0x7f120ed8, float:1.9414436E38)
            X.AnonymousClass8BS.A16(r1, r12, r0)
        L_0x007f:
            android.widget.TextView r1 = r12.A02
            if (r1 == 0) goto L_0x0031
            r0 = 2131889878(0x7f120ed6, float:1.9414432E38)
            goto L_0x00aa
        L_0x0087:
            android.widget.TextView r1 = r12.A03
            if (r1 == 0) goto L_0x0091
            r0 = 2131889880(0x7f120ed8, float:1.9414436E38)
            X.AnonymousClass8BS.A16(r1, r12, r0)
        L_0x0091:
            android.widget.TextView r1 = r12.A02
            if (r1 == 0) goto L_0x0031
            r0 = 2131889879(0x7f120ed7, float:1.9414434E38)
            goto L_0x00aa
        L_0x0099:
            android.widget.TextView r1 = r12.A03
            if (r1 == 0) goto L_0x00a3
            r0 = 2131889870(0x7f120ece, float:1.9414416E38)
            X.AnonymousClass8BS.A16(r1, r12, r0)
        L_0x00a3:
            android.widget.TextView r1 = r12.A02
            if (r1 == 0) goto L_0x0031
            r0 = 2131889869(0x7f120ecd, float:1.9414414E38)
        L_0x00aa:
            X.AnonymousClass8BS.A16(r1, r12, r0)
            goto L_0x0031
        L_0x00ae:
            com.whatsapp.backup.encryptedbackup.EncBackupViewModel r0 = r12.A26()
            r1 = 7
            goto L_0x001d
        L_0x00b5:
            com.whatsapp.backup.encryptedbackup.EncBackupViewModel r0 = r12.A26()
            r1 = 7
            X.1DT r0 = r0.A04
            X.AnonymousClass3MX.A1J(r0, r1)
            return
        L_0x00c0:
            java.lang.String r0 = "crashLogs"
            goto L_0x00cb
        L_0x00c3:
            java.lang.String r0 = "globalUI"
            goto L_0x00cb
        L_0x00c6:
            java.lang.String r0 = "abProps"
            goto L_0x00cb
        L_0x00c9:
            java.lang.String r0 = "systemServices"
        L_0x00cb:
            X.C18070vi.A11(r0)
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.backup.encryptedbackup.VerifyPasswordFragment.A21(android.os.Bundle, android.view.View):void");
    }

    public void A1w(int i, int i2, Intent intent) {
        super.A1w(i, i2, intent);
        if (i == 12345) {
            A00(this, i2);
        }
    }
}
