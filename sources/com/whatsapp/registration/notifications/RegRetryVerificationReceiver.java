package com.whatsapp.registration.notifications;

import X.AnonymousClass00H;
import X.AnonymousClass118;
import X.AnonymousClass11P;
import X.AnonymousClass19D;
import X.AnonymousClass1CM;
import X.C17880vN;
import X.C27301Vn;
import android.content.BroadcastReceiver;

public final class RegRetryVerificationReceiver extends BroadcastReceiver {
    public AnonymousClass11P A00;
    public AnonymousClass118 A01;
    public C27301Vn A02;
    public AnonymousClass19D A03;
    public AnonymousClass1CM A04;
    public AnonymousClass00H A05;
    public AnonymousClass00H A06;
    public final Object A07;
    public volatile boolean A08;

    /* JADX WARNING: Removed duplicated region for block: B:45:0x00e7  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0137  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onReceive(android.content.Context r12, android.content.Intent r13) {
        /*
            r11 = this;
            boolean r0 = r11.A08
            r5 = r12
            if (r0 != 0) goto L_0x005c
            java.lang.Object r1 = r11.A07
            monitor-enter(r1)
            boolean r0 = r11.A08     // Catch:{ all -> 0x0059 }
            if (r0 != 0) goto L_0x0057
            X.10G r0 = X.AnonymousClass10E.A10(r12)     // Catch:{ all -> 0x0059 }
            X.10E r2 = r0.AJU     // Catch:{ all -> 0x0059 }
            X.00S r0 = r2.A02     // Catch:{ all -> 0x0059 }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x0059 }
            X.19D r0 = (X.AnonymousClass19D) r0     // Catch:{ all -> 0x0059 }
            r11.A03 = r0     // Catch:{ all -> 0x0059 }
            X.00S r0 = r2.A4U     // Catch:{ all -> 0x0059 }
            X.00H r0 = X.C000200d.A00(r0)     // Catch:{ all -> 0x0059 }
            r11.A05 = r0     // Catch:{ all -> 0x0059 }
            X.00S r0 = r2.A9V     // Catch:{ all -> 0x0059 }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x0059 }
            X.1CM r0 = (X.AnonymousClass1CM) r0     // Catch:{ all -> 0x0059 }
            r11.A04 = r0     // Catch:{ all -> 0x0059 }
            X.00S r0 = r2.AAv     // Catch:{ all -> 0x0059 }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x0059 }
            X.11P r0 = (X.AnonymousClass11P) r0     // Catch:{ all -> 0x0059 }
            r11.A00 = r0     // Catch:{ all -> 0x0059 }
            X.00S r0 = r2.ABY     // Catch:{ all -> 0x0059 }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x0059 }
            X.118 r0 = (X.AnonymousClass118) r0     // Catch:{ all -> 0x0059 }
            r11.A01 = r0     // Catch:{ all -> 0x0059 }
            X.00S r0 = r2.ABd     // Catch:{ all -> 0x0059 }
            X.00H r0 = X.C000200d.A00(r0)     // Catch:{ all -> 0x0059 }
            r11.A06 = r0     // Catch:{ all -> 0x0059 }
            X.00S r0 = r2.A9A     // Catch:{ all -> 0x0059 }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x0059 }
            X.1Vn r0 = (X.C27301Vn) r0     // Catch:{ all -> 0x0059 }
            r11.A02 = r0     // Catch:{ all -> 0x0059 }
            r0 = 1
            r11.A08 = r0     // Catch:{ all -> 0x0059 }
        L_0x0057:
            monitor-exit(r1)     // Catch:{ all -> 0x0059 }
            goto L_0x005c
        L_0x0059:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0059 }
            throw r0
        L_0x005c:
            r4 = 0
            boolean r3 = X.C18070vi.A17(r12, r13)
            java.lang.String r0 = "RegRetryVerificationReceiver/timeout"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.1CM r0 = r11.A04
            if (r0 == 0) goto L_0x0149
            boolean r0 = r0.A04()
            java.lang.String r2 = "reg_retry_notification_step"
            if (r0 != 0) goto L_0x0125
            X.1CM r0 = r11.A04
            if (r0 == 0) goto L_0x0149
            int r1 = r0.A00(r4)
            r0 = 10
            if (r1 == r0) goto L_0x0125
            X.1Vn r0 = r11.A02
            if (r0 == 0) goto L_0x0142
            X.1Vo r0 = (X.AnonymousClass1Vo) r0
            X.1Vp r0 = r0.A00
            boolean r0 = r0.A01()
            if (r0 == 0) goto L_0x0125
            X.118 r0 = r11.A01
            if (r0 == 0) goto L_0x013e
            android.content.Context r1 = r0.A00
            r0 = 2131899103(0x7f1232df, float:1.9433143E38)
            java.lang.String r9 = X.C18070vi.A0F(r1, r0)
            X.118 r0 = r11.A01
            if (r0 == 0) goto L_0x013e
            android.content.Context r1 = r0.A00
            r0 = 2131897752(0x7f122d98, float:1.9430402E38)
            java.lang.String r8 = X.C17890vO.A0R(r1, r9, r3, r4, r0)
            X.C18070vi.A0X(r8)
            X.118 r0 = r11.A01
            if (r0 == 0) goto L_0x013e
            android.content.Context r1 = r0.A00
            r0 = 2131897753(0x7f122d99, float:1.9430404E38)
            java.lang.String r10 = X.C18070vi.A0F(r1, r0)
            X.19D r4 = r11.A03
            if (r4 == 0) goto L_0x013b
            r1 = 9821(0x265d, float:1.3762E-41)
            X.0vf r0 = X.C18040vf.A02
            int r1 = X.C18020vd.A00(r0, r4, r1)
            r0 = 2
            if (r1 == r0) goto L_0x010e
            r0 = 3
            if (r1 != r0) goto L_0x00e3
            X.118 r0 = r11.A01
            if (r0 == 0) goto L_0x013e
            android.content.Context r1 = r0.A00
            r0 = 2131897755(0x7f122d9b, float:1.9430408E38)
            java.lang.String r8 = X.C18070vi.A0F(r1, r0)
            X.118 r0 = r11.A01
            if (r0 == 0) goto L_0x013e
            android.content.Context r1 = r0.A00
            r0 = 2131893019(0x7f121b1b, float:1.9420803E38)
        L_0x00de:
            java.lang.String r9 = X.C18070vi.A0F(r1, r0)
            r10 = r8
        L_0x00e3:
            X.00H r0 = r11.A06
            if (r0 == 0) goto L_0x0137
            r0.get()
            android.content.Intent r6 = X.AnonymousClass1LU.A0A(r12)
            java.lang.String r0 = "extra_reg_retry_verification_notification_clicked"
            r6.putExtra(r0, r3)
            X.11P r0 = r11.A00
            if (r0 == 0) goto L_0x014c
            X.1Vn r7 = r11.A02
            if (r7 == 0) goto L_0x0142
            X.A9B.A0M(r5, r6, r7, r8, r9, r10)
            X.00H r0 = r11.A05
            if (r0 == 0) goto L_0x0146
            java.lang.Object r1 = r0.get()
            X.A8V r1 = (X.A8V) r1
            java.lang.String r0 = "reg_retry_verification_notification_shown"
        L_0x010a:
            r1.A0E(r0, r2)
            return
        L_0x010e:
            X.118 r0 = r11.A01
            if (r0 == 0) goto L_0x013e
            android.content.Context r1 = r0.A00
            r0 = 2131897754(0x7f122d9a, float:1.9430406E38)
            java.lang.String r8 = X.C18070vi.A0F(r1, r0)
            X.118 r0 = r11.A01
            if (r0 == 0) goto L_0x013e
            android.content.Context r1 = r0.A00
            r0 = 2131897756(0x7f122d9c, float:1.943041E38)
            goto L_0x00de
        L_0x0125:
            java.lang.String r0 = "app-init/async/registrationretry/verified"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.00H r0 = r11.A05
            if (r0 == 0) goto L_0x0146
            java.lang.Object r1 = r0.get()
            X.A8V r1 = (X.A8V) r1
            java.lang.String r0 = "reg_retry_verification_timer_expired_reg_verified"
            goto L_0x010a
        L_0x0137:
            java.lang.String r0 = "waIntentsLazy"
            goto L_0x014f
        L_0x013b:
            java.lang.String r0 = "abPreChatdProps"
            goto L_0x014f
        L_0x013e:
            java.lang.String r0 = "waContext"
            goto L_0x014f
        L_0x0142:
            java.lang.String r0 = "waNotificationManager"
            goto L_0x014f
        L_0x0146:
            java.lang.String r0 = "funnelLoggerLazy"
            goto L_0x014f
        L_0x0149:
            java.lang.String r0 = "registrationStateManager"
            goto L_0x014f
        L_0x014c:
            java.lang.String r0 = "time"
        L_0x014f:
            X.C18070vi.A11(r0)
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.registration.notifications.RegRetryVerificationReceiver.onReceive(android.content.Context, android.content.Intent):void");
    }

    public RegRetryVerificationReceiver(int i) {
        this.A08 = false;
        this.A07 = C17880vN.A0p();
    }

    public RegRetryVerificationReceiver() {
        this(0);
    }
}
