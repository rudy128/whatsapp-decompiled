package X;

import android.content.Intent;

/* renamed from: X.2rD  reason: invalid class name and case insensitive filesystem */
public final class C62322rD {
    public final AnonymousClass1M9 A00;
    public final AnonymousClass11C A01;
    public final AnonymousClass118 A02;
    public final C27301Vn A03;
    public final C18030ve A04;
    public final AnonymousClass00H A05;
    public final AnonymousClass00H A06;
    public final AnonymousClass00H A07;
    public final AnonymousClass00H A08;

    public final boolean A02(AnonymousClass206 r5) {
        C18070vi.A0d(r5, 0);
        AnonymousClass00H r1 = this.A08;
        if (((AnonymousClass70P) r1.get()).A06(r5)) {
            AnonymousClass70P r12 = (AnonymousClass70P) r1.get();
            C61762qD A002 = AnonymousClass70P.A00(r5);
            if (A002 == null || !r12.A09(A002)) {
                return true;
            }
            return !C18020vd.A05(C18040vf.A02, this.A04, 4980);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v0, resolved type: java.lang.Integer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v1, resolved type: java.lang.Integer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v0, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v0, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v0, resolved type: java.lang.Long} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v2, resolved type: java.lang.Integer} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A01(android.content.Context r22, X.C1409673t r23, X.AnonymousClass1E7 r24, X.AnonymousClass206 r25) {
        /*
            r21 = this;
            r4 = r22
            r13 = r25
            X.C18070vi.A0h(r4, r13)
            r8 = r21
            X.00H r10 = r8.A08
            r10.get()
            X.2qD r1 = X.AnonymousClass70P.A00(r13)
            if (r1 == 0) goto L_0x0067
            java.lang.Object r0 = r10.get()
            X.70P r0 = (X.AnonymousClass70P) r0
            boolean r0 = r0.A08(r1)
            r3 = r23
            r6 = r24
            if (r0 == 0) goto L_0x0068
            android.content.Intent r2 = X.C17880vN.A0A()
            java.lang.String r1 = r4.getPackageName()
            java.lang.String r0 = "com.whatsapp.notification.MessageOtpNotificationBroadcastReceiver"
            A00(r2, r6, r13, r1, r0)
            r0 = 36
            android.app.PendingIntent r2 = X.C17880vN.A06(r4, r2, r0)
            r1 = 2131231835(0x7f08045b, float:1.8079762E38)
            r0 = 2131893022(0x7f121b1e, float:1.9420809E38)
            java.lang.String r0 = r4.getString(r0)
            r3.A08(r1, r0, r2)
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 29
            r5 = 0
            if (r1 < r0) goto L_0x004d
            r3.A0U = r5
        L_0x004d:
            X.00H r0 = r8.A07
            java.lang.Object r12 = r0.get()
            X.72y r12 = (X.C1407672y) r12
            java.lang.Integer r14 = java.lang.Integer.valueOf(r5)
            r15 = 0
            r19 = 1
        L_0x005c:
            r17 = r15
            r18 = r15
            r16 = r15
            r20 = r5
            X.C1407672y.A02(r12, r13, r14, r15, r16, r17, r18, r19, r20)
        L_0x0067:
            return
        L_0x0068:
            java.lang.Object r0 = r10.get()
            X.70P r0 = (X.AnonymousClass70P) r0
            boolean r0 = r0.A07(r1)
            if (r0 == 0) goto L_0x00f2
            int r7 = android.os.Build.VERSION.SDK_INT
            r0 = 31
            r19 = 1
            r5 = 0
            r1 = 0
            if (r7 < r0) goto L_0x007f
            r1 = 1
        L_0x007f:
            java.lang.Object r0 = r10.get()
            X.70P r0 = (X.AnonymousClass70P) r0
            android.content.Intent r2 = r0.A01(r4, r13)
            r11 = 134217728(0x8000000, float:3.85186E-34)
            r9 = 45
            if (r1 == 0) goto L_0x00e0
            X.0ve r12 = r8.A04
            r1 = 4117(0x1015, float:5.769E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r12, r1)
            if (r0 != 0) goto L_0x00d2
            if (r2 == 0) goto L_0x00d2
        L_0x009d:
            android.app.PendingIntent r2 = X.C1408573i.A00(r4, r9, r2, r11)
        L_0x00a1:
            X.C18070vi.A0b(r2)
            r10.get()
            X.2qD r0 = X.AnonymousClass70P.A00(r13)
            if (r0 == 0) goto L_0x00d0
            java.lang.String r0 = r0.A01
            android.net.Uri r1 = android.net.Uri.parse(r0)
            java.lang.String r0 = "cta_display_name"
            java.lang.String r0 = r1.getQueryParameter(r0)
        L_0x00b9:
            r3.A08(r5, r0, r2)
            r0 = 29
            if (r7 < r0) goto L_0x00c2
            r3.A0U = r5
        L_0x00c2:
            X.00H r0 = r8.A07
            java.lang.Object r12 = r0.get()
            X.72y r12 = (X.C1407672y) r12
            java.lang.Integer r14 = java.lang.Integer.valueOf(r19)
            r15 = 0
            goto L_0x005c
        L_0x00d0:
            r0 = 0
            goto L_0x00b9
        L_0x00d2:
            android.content.Intent r2 = X.C17880vN.A0A()
            java.lang.String r1 = r4.getPackageName()
            java.lang.String r0 = "com.whatsapp.notification.OtpOneTapNotificationHandlerActivity"
            A00(r2, r6, r13, r1, r0)
            goto L_0x009d
        L_0x00e0:
            android.content.Intent r2 = X.C17880vN.A0A()
            java.lang.String r1 = r4.getPackageName()
            java.lang.String r0 = "com.whatsapp.notification.MessageOtpNotificationBroadcastReceiver"
            A00(r2, r6, r13, r1, r0)
            android.app.PendingIntent r2 = X.C1408573i.A01(r4, r9, r2, r11)
            goto L_0x00a1
        L_0x00f2:
            java.lang.Object r0 = r10.get()
            X.70P r0 = (X.AnonymousClass70P) r0
            boolean r0 = r0.A09(r1)
            if (r0 == 0) goto L_0x0067
            android.content.Intent r2 = X.C17880vN.A0A()
            java.lang.String r1 = r4.getPackageName()
            java.lang.String r0 = "com.whatsapp.notification.OtpZeroTapMarkAsReadNotificationHandlerReceiver"
            A00(r2, r6, r13, r1, r0)
            r1 = 134217728(0x8000000, float:3.85186E-34)
            r0 = 66
            android.app.PendingIntent r1 = X.C1408573i.A01(r4, r0, r2, r1)
            r0 = 2131891879(0x7f1216a7, float:1.941849E38)
            java.lang.String r0 = r4.getString(r0)
            r2 = 0
            r3.A08(r2, r0, r1)
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 29
            if (r1 < r0) goto L_0x0067
            r3.A0U = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C62322rD.A01(android.content.Context, X.73t, X.1E7, X.206):void");
    }

    public C62322rD(AnonymousClass1M9 r2, AnonymousClass11C r3, AnonymousClass118 r4, C27301Vn r5, C18030ve r6, AnonymousClass00H r7, AnonymousClass00H r8, AnonymousClass00H r9, AnonymousClass00H r10) {
        C18070vi.A0w(r6, r4, r2, r3, r7);
        C18070vi.A0q(r8, r5, r9);
        C18070vi.A0d(r10, 9);
        this.A04 = r6;
        this.A02 = r4;
        this.A00 = r2;
        this.A01 = r3;
        this.A07 = r7;
        this.A08 = r8;
        this.A03 = r5;
        this.A05 = r9;
        this.A06 = r10;
    }

    public static void A00(Intent intent, AnonymousClass1E7 r3, AnonymousClass206 r4, String str, String str2) {
        intent.setClassName(str, str2);
        intent.putExtra("extra_remote_jid", C22971Dz.A06(r3.A0J));
        intent.putExtra("extra_message_key_id", r4.A0v.A01);
    }
}
