package X;

/* renamed from: X.7Pw  reason: invalid class name and case insensitive filesystem */
public class C146597Pw implements Runnable {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final String A03;
    public final String A04;

    public C146597Pw(Object obj, Object obj2, String str, String str2, int i) {
        this.A00 = i;
        this.A01 = obj;
        this.A03 = str;
        this.A04 = str2;
        this.A02 = obj2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:146:0x0414, code lost:
        X.C20098A7b.A02(X.C181519Qu.A00(X.AnonymousClass9IF.A04, r4, r5, r2), r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x041d, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x0478, code lost:
        if (r3 == null) goto L_0x047a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:214:0x06e8, code lost:
        X.C18070vi.A11(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:215:0x06ec, code lost:
        throw null;
     */
    /* JADX WARNING: Removed duplicated region for block: B:209:0x06da  */
    /* JADX WARNING: Removed duplicated region for block: B:228:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x011a  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0176  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r26 = this;
            r2 = r26
            int r0 = r2.A00
            switch(r0) {
                case 0: goto L_0x004e;
                case 1: goto L_0x02a6;
                case 2: goto L_0x02c2;
                case 3: goto L_0x02eb;
                case 4: goto L_0x0087;
                case 5: goto L_0x030c;
                case 6: goto L_0x0384;
                case 7: goto L_0x03cc;
                case 8: goto L_0x0132;
                case 9: goto L_0x041e;
                case 10: goto L_0x051e;
                case 11: goto L_0x0537;
                case 12: goto L_0x06aa;
                case 13: goto L_0x019a;
                case 14: goto L_0x06bc;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r3 = r2.A01
            X.71O r3 = (X.AnonymousClass71O) r3
            java.lang.String r10 = r2.A03
            java.lang.String r11 = r2.A04
            java.lang.Object r2 = r2.A02
            X.89S r2 = (X.AnonymousClass89S) r2
            X.707 r1 = r3.A09
            X.118 r0 = r3.A05
            android.content.Context r0 = r0.A00
            java.lang.String r12 = r1.A02(r0)
            X.6aW r0 = r3.A00
            X.10F r0 = r0.A00
            X.10E r0 = r0.A00
            X.0ve r7 = X.AnonymousClass10E.A8r(r0)
            X.181 r5 = X.C108965cb.A0H(r0)
            X.0z4 r6 = X.AnonymousClass3Ma.A0c(r0)
            X.00H r9 = X.C108945cZ.A14(r0)
            X.1fq r8 = X.C108955ca.A0X(r0)
            X.67b r4 = new X.67b
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12)
            X.11E r0 = r3.A04
            boolean r0 = r0.A09()
            if (r0 == 0) goto L_0x029e
            r1 = 4
            X.7Hz r0 = new X.7Hz
            r0.<init>(r2, r3, r1)
            r4.CBv(r0)
        L_0x004d:
            return
        L_0x004e:
            java.lang.Object r3 = r2.A01
            X.1mm r3 = (X.C35771mm) r3
            java.lang.Object r1 = r2.A02
            java.util.List r1 = (java.util.List) r1
            java.lang.String r4 = r2.A03
            java.lang.String r5 = r2.A04
            r0 = 1
            X.C18070vi.A0d(r1, r0)
            X.00H r0 = r3.A0A
            java.lang.Object r0 = r0.get()
            X.1mn r0 = (X.C35781mn) r0
            android.content.SharedPreferences r0 = X.C35781mn.A00(r0)
            X.C17900vP.A0J(r0)
            java.util.Iterator r1 = r1.iterator()
        L_0x0071:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x004d
            java.lang.Object r0 = r1.next()
            X.9NH r0 = (X.AnonymousClass9NH) r0
            int r6 = r0.A01
            int r7 = r0.A00
            X.9NC r2 = r0.A02
            X.C35771mm.A01(r2, r3, r4, r5, r6, r7)
            goto L_0x0071
        L_0x0087:
            java.lang.Object r6 = r2.A01
            com.whatsapp.documentpicker.DocumentPreviewActivity r6 = (com.whatsapp.documentpicker.DocumentPreviewActivity) r6
            java.lang.Object r8 = r2.A02
            java.io.File r8 = (java.io.File) r8
            java.lang.String r9 = r2.A03
            java.lang.String r3 = r2.A04
            android.view.View r1 = r6.A01
            r0 = 2131436817(0x7f0b2511, float:1.8495515E38)
            android.view.View r5 = X.C72453Mb.A0S(r1, r0)
            r0 = 2131430108(0x7f0b0adc, float:1.8481908E38)
            android.widget.ImageView r2 = X.AnonymousClass3MW.A0G(r5, r0)
            r1 = 1
            r0 = 0
            android.graphics.drawable.Drawable r0 = X.C137486vX.A01(r6, r9, r0, r1)
            r2.setImageDrawable(r0)
            r0 = 2131430106(0x7f0b0ada, float:1.8481904E38)
            android.widget.TextView r2 = X.AnonymousClass3MW.A0J(r5, r0)
            r0 = 150(0x96, float:2.1E-43)
            java.lang.String r1 = X.AnonymousClass1EG.A0F(r3, r0)
            r2.setText(r1)
            java.lang.String r0 = X.C25291Nq.A03(r9)
            java.lang.String r10 = X.C108955ca.A0y(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r10)
            if (r0 == 0) goto L_0x00d8
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x00d8
            java.lang.String r0 = X.C64062u9.A09(r1)
            java.lang.String r10 = X.C108955ca.A0y(r0)
        L_0x00d8:
            r3 = 0
            if (r8 == 0) goto L_0x010a
            r0 = 2131430116(0x7f0b0ae4, float:1.8481924E38)
            android.widget.TextView r4 = X.AnonymousClass3MW.A0J(r5, r0)
            X.0vb r2 = r6.A00
            long r0 = r8.length()
            java.lang.String r0 = X.C88584aA.A02(r2, r0)
            r4.setText(r0)
            X.0ve r2 = r6.A0E
            r1 = 11405(0x2c8d, float:1.5982E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 != 0) goto L_0x010a
            if (r9 == 0) goto L_0x010a
            X.747 r0 = X.C62272r8.A04     // Catch:{ 6SP -> 0x0104 }
            int r0 = r0.A07(r8, r9)     // Catch:{ 6SP -> 0x0104 }
            goto L_0x010b
        L_0x0104:
            r1 = move-exception
            java.lang.String r0 = "DocumentPreviewActivity/getPageCount/could not get page count"
            com.whatsapp.util.Log.e(r0, r1)
        L_0x010a:
            r0 = 0
        L_0x010b:
            com.whatsapp.documentpicker.DocumentPreviewActivity.A0Q(r5, r6, r9, r10, r0)
            X.1Fv r0 = r6.getLifecycle()
            X.1Fw r0 = (X.C23391Fw) r0
            X.1Fx r1 = r0.A02
            X.1Fx r0 = X.C23401Fx.DESTROYED
            if (r1 == r0) goto L_0x004d
            X.0ve r2 = r6.A0E
            r1 = 11405(0x2c8d, float:1.5982E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x004d
            X.10I r0 = r6.A05
            X.6Lt r4 = new X.6Lt
            r7 = r6
            r4.<init>(r5, r6, r7, r8, r9, r10)
            X.AnonymousClass3MW.A1T(r4, r0, r3)
            return
        L_0x0132:
            java.lang.Object r4 = r2.A01
            com.whatsapp.notification.MessageOtpNotificationBroadcastReceiver r4 = (com.whatsapp.notification.MessageOtpNotificationBroadcastReceiver) r4
            java.lang.Object r5 = r2.A02
            java.lang.String r0 = r2.A03
            java.lang.String r3 = r2.A04
            r10 = 0
            r8 = 1
            r6 = 2
            X.1BI r2 = X.AnonymousClass3MX.A0l(r0)
            X.1W6 r1 = r4.A03
            if (r1 == 0) goto L_0x06e3
            X.205 r0 = new X.205
            r0.<init>(r2, r3, r10)
            X.206 r3 = X.C108945cZ.A0s(r0, r1)
            X.70P r0 = r4.A02
            if (r0 == 0) goto L_0x06e0
            X.2qD r1 = X.AnonymousClass70P.A00(r3)
            if (r1 == 0) goto L_0x004d
            X.70P r0 = r4.A02
            if (r0 == 0) goto L_0x06e0
            boolean r0 = r0.A08(r1)
            if (r0 == 0) goto L_0x0184
            X.1KB r2 = r4.A00
            if (r2 == 0) goto L_0x06dd
            r0 = 15
            X.3Bz r1 = new X.3Bz
            r1.<init>(r4, r3, r0)
        L_0x016f:
            r2.A0J(r1)
        L_0x0172:
            X.1hl r4 = r4.A01
            if (r4 == 0) goto L_0x06da
            if (r3 == 0) goto L_0x0182
            com.whatsapp.jid.UserJid r5 = r3.A0I()
        L_0x017c:
            r7 = 3
            r9 = r8
            r4.A00(r5, r6, r7, r8, r9, r10)
            return
        L_0x0182:
            r5 = 0
            goto L_0x017c
        L_0x0184:
            X.70P r0 = r4.A02
            if (r0 == 0) goto L_0x06e0
            boolean r0 = r0.A07(r1)
            if (r0 == 0) goto L_0x0172
            X.1KB r2 = r4.A00
            if (r2 == 0) goto L_0x06dd
            r0 = 23
            X.Ak2 r1 = new X.Ak2
            r1.<init>(r4, r3, r5, r0)
            goto L_0x016f
        L_0x019a:
            java.lang.String r3 = r2.A03
            java.lang.Object r5 = r2.A01
            com.whatsapp.settings.notificationsandsounds.NotificationsAndSoundsViewModel r5 = (com.whatsapp.settings.notificationsandsounds.NotificationsAndSoundsViewModel) r5
            java.lang.Object r4 = r2.A02
            X.1BI r4 = (X.AnonymousClass1BI) r4
            java.lang.String r1 = r2.A04
            int r2 = r3.hashCode()
            switch(r2) {
                case -2060223072: goto L_0x01dd;
                case -1739588439: goto L_0x01cf;
                case -1308709468: goto L_0x01c1;
                case 1504858731: goto L_0x01b3;
                default: goto L_0x01ad;
            }
        L_0x01ad:
            X.2fs r5 = r5.A06
            switch(r2) {
                case -2060223072: goto L_0x0245;
                case -1739588439: goto L_0x023a;
                case -1308912053: goto L_0x0201;
                case -1308709468: goto L_0x01f6;
                case 1504858731: goto L_0x01eb;
                case 2086121120: goto L_0x0250;
                default: goto L_0x01b2;
            }
        L_0x01b2:
            return
        L_0x01b3:
            java.lang.String r0 = "jid_call_vibration"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x01ad
            X.1Nb r0 = r5.A05
            r0.A0l(r4, r1)
            goto L_0x01ad
        L_0x01c1:
            java.lang.String r0 = "jid_message_tone"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x01ad
            X.1Nb r0 = r5.A05
            r0.A0m(r4, r1)
            goto L_0x01ad
        L_0x01cf:
            java.lang.String r0 = "jid_call_ringtone"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x01ad
            X.1Nb r0 = r5.A05
            r0.A0k(r4, r1)
            goto L_0x01ad
        L_0x01dd:
            java.lang.String r0 = "jid_message_vibration"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x01ad
            X.1Nb r0 = r5.A05
            r0.A0n(r4, r1)
            goto L_0x01ad
        L_0x01eb:
            java.lang.String r0 = "jid_call_vibration"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x004d
            r1 = 12
            goto L_0x0267
        L_0x01f6:
            java.lang.String r0 = "jid_message_tone"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x004d
            r1 = 9
            goto L_0x0267
        L_0x0201:
            java.lang.String r0 = "jid_message_mute"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x004d
            X.4Dc r0 = X.C83034Dc.A03
            int r0 = r0.id
            java.lang.String r0 = java.lang.String.valueOf(r0)
            boolean r0 = X.C18070vi.A18(r1, r0)
            if (r0 == 0) goto L_0x0219
            r1 = 2
            goto L_0x0267
        L_0x0219:
            X.4Dc r0 = X.C83034Dc.A04
            int r0 = r0.id
            java.lang.String r0 = java.lang.String.valueOf(r0)
            boolean r0 = X.C18070vi.A18(r1, r0)
            if (r0 == 0) goto L_0x0229
            r1 = 3
            goto L_0x0267
        L_0x0229:
            X.4Dc r0 = X.C83034Dc.A02
            int r0 = r0.id
            java.lang.String r0 = java.lang.String.valueOf(r0)
            boolean r0 = X.C18070vi.A18(r1, r0)
            r1 = 4
            if (r0 == 0) goto L_0x0267
            r1 = 1
            goto L_0x0267
        L_0x023a:
            java.lang.String r0 = "jid_call_ringtone"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x004d
            r1 = 11
            goto L_0x0267
        L_0x0245:
            java.lang.String r0 = "jid_message_vibration"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x004d
            r1 = 10
            goto L_0x0267
        L_0x0250:
            java.lang.String r0 = "jid_call_mute"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x004d
            X.4Dc r0 = X.C83034Dc.A03
            int r0 = r0.id
            java.lang.String r0 = java.lang.String.valueOf(r0)
            boolean r0 = X.C18070vi.A18(r1, r0)
            if (r0 == 0) goto L_0x027c
            r1 = 6
        L_0x0267:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r1)
            r3 = 93
            if (r4 == 0) goto L_0x004d
            X.10s r2 = r5.A03
            r1 = 43
            X.3Cu r0 = new X.3Cu
            r0.<init>(r4, r3, r1, r5)
            r2.execute(r0)
            return
        L_0x027c:
            X.4Dc r0 = X.C83034Dc.A04
            int r0 = r0.id
            java.lang.String r0 = java.lang.String.valueOf(r0)
            boolean r0 = X.C18070vi.A18(r1, r0)
            if (r0 == 0) goto L_0x028c
            r1 = 7
            goto L_0x0267
        L_0x028c:
            X.4Dc r0 = X.C83034Dc.A02
            int r0 = r0.id
            java.lang.String r0 = java.lang.String.valueOf(r0)
            boolean r0 = X.C18070vi.A18(r1, r0)
            r1 = 8
            if (r0 == 0) goto L_0x0267
            r1 = 5
            goto L_0x0267
        L_0x029e:
            java.lang.Integer r0 = X.C17880vN.A0h()
            r2.Btp(r0)
            return
        L_0x02a6:
            java.lang.Object r5 = r2.A01
            X.Af0 r5 = (X.C21132Af0) r5
            java.lang.String r4 = r2.A03
            java.lang.String r3 = r2.A04
            java.lang.Object r1 = r2.A02
            X.7Fe r1 = (X.C143887Fe) r1
            X.9KN r2 = X.AnonymousClass9KN.SUCCESS
            r0 = 0
            X.9yh r1 = X.C198659yh.A00(r1, r0, r4, r3)
            X.9dA r0 = new X.9dA
            r0.<init>(r1, r2, r4)
            r5.A0B(r0)
            return
        L_0x02c2:
            java.lang.Object r3 = r2.A01
            X.67x r3 = (X.C1193867x) r3
            java.lang.String r11 = r2.A03
            java.lang.String r1 = r2.A04
            java.lang.Object r0 = r2.A02
            com.whatsapp.jid.UserJid r0 = (com.whatsapp.jid.UserJid) r0
            X.1KB r4 = r3.A01
            X.10I r10 = r3.A0B
            X.0vb r6 = r3.A06
            X.7If r9 = new X.7If
            r9.<init>(r3, r0, r1)
            X.0ve r7 = r3.A08
            X.1gU r1 = r3.A0A
            X.181 r0 = r3.A03
            X.7Fe r5 = new X.7Fe
            r5.<init>(r0, r7, r1, r11)
            X.18K r8 = r3.A09
            r12 = 0
            X.AnonymousClass4WC.A00(r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return
        L_0x02eb:
            java.lang.Object r6 = r2.A01
            X.3uP r6 = (X.AnonymousClass3uP) r6
            java.lang.Object r5 = r2.A02
            android.content.Context r5 = (android.content.Context) r5
            java.lang.String r0 = r2.A03
            java.lang.String r4 = r2.A04
            r3 = 2131886746(0x7f12029a, float:1.940808E38)
            java.lang.Object[] r1 = X.AnonymousClass3MW.A1b()
            r2 = 0
            r1[r2] = r0
            r0 = 1
            java.lang.String r1 = X.C17880vN.A0q(r5, r4, r1, r0, r3)
            X.1KB r0 = r6.A0S
            r0.A0L(r1, r2)
            return
        L_0x030c:
            java.lang.Object r3 = r2.A01
            com.whatsapp.inappsupport.ui.SupportAiViewModel r3 = (com.whatsapp.inappsupport.ui.SupportAiViewModel) r3
            java.lang.String r11 = r2.A03
            java.lang.Object r5 = r2.A02
            X.770 r5 = (X.AnonymousClass770) r5
            java.lang.String r4 = r2.A04
            r2 = 0
            r23 = 1
            X.00H r0 = r3.A0D
            java.lang.Object r6 = r0.get()
            X.6jg r6 = (X.C130586jg) r6
            java.lang.String r0 = android.os.Environment.getExternalStorageState()
            X.C18070vi.A0X(r0)
            r6.A01 = r0
            X.1NM r1 = r6.A04
            X.1Gn r0 = r6.A03
            boolean r0 = r1.A03(r0)
            if (r0 == 0) goto L_0x033e
            X.00H r0 = r6.A06
            long r0 = X.C108975cc.A07(r0)
            r6.A00 = r0
        L_0x033e:
            X.00H r0 = r6.A06
            java.lang.Object r0 = r0.get()
            X.11Z r0 = (X.AnonymousClass11Z) r0
            long r21 = r0.A02()
            X.1mQ r7 = r6.A05
            android.content.Context r8 = r6.A02
            long r0 = r6.A00
            java.lang.String r14 = r6.A01
            X.00H r6 = r6.A07
            java.lang.Object r6 = r6.get()
            X.1mP r6 = (X.C35541mP) r6
            android.util.Pair r9 = r6.A00()
            java.util.ArrayList r17 = X.AnonymousClass6WX.A00(r5)
            X.1yz r5 = X.AnonymousClass1EC.A01
            X.1EC r10 = r5.A02(r4)
            r12 = 0
            r15 = r12
            r16 = r12
            r18 = r12
            r25 = r23
            r13 = r12
            r19 = r0
            r24 = r23
            java.lang.String r4 = r7.A04(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r21, r23, r24, r25)
            X.C18070vi.A0X(r4)
            X.6nD r1 = r3.A09
            java.lang.String r0 = "#chatbot"
            r1.A00(r3, r0, r4, r2)
            return
        L_0x0384:
            java.lang.Object r3 = r2.A01
            X.1FL r3 = (X.AnonymousClass1FL) r3
            java.lang.String r4 = r2.A03
            java.lang.Object r1 = r2.A02
            java.util.List r1 = (java.util.List) r1
            java.lang.String r5 = r2.A04
            r0 = 3
            X.C18070vi.A0d(r5, r0)
            X.1GP r6 = r3.getSupportFragmentManager()
            java.util.ArrayList r3 = X.AnonymousClass000.A13()
            java.util.Iterator r2 = r1.iterator()
        L_0x03a0:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x03b2
            java.lang.Object r1 = r2.next()
            boolean r0 = r1 instanceof X.C821743o
            if (r0 == 0) goto L_0x03a0
            r3.add(r1)
            goto L_0x03a0
        L_0x03b2:
            java.util.ArrayList r2 = X.C29351c6.A0D(r3)
            java.util.Iterator r1 = r3.iterator()
        L_0x03ba:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0414
            java.lang.Object r0 = r1.next()
            X.43o r0 = (X.C821743o) r0
            com.whatsapp.jid.UserJid r0 = r0.A00
            r2.add(r0)
            goto L_0x03ba
        L_0x03cc:
            java.lang.Object r3 = r2.A01
            X.1FL r3 = (X.AnonymousClass1FL) r3
            java.lang.String r4 = r2.A03
            java.lang.Object r1 = r2.A02
            java.util.List r1 = (java.util.List) r1
            java.lang.String r5 = r2.A04
            r0 = 3
            X.C18070vi.A0d(r5, r0)
            X.1GP r6 = r3.getSupportFragmentManager()
            java.util.ArrayList r3 = X.AnonymousClass000.A13()
            java.util.Iterator r2 = r1.iterator()
        L_0x03e8:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x03fa
            java.lang.Object r1 = r2.next()
            boolean r0 = r1 instanceof X.C821743o
            if (r0 == 0) goto L_0x03e8
            r3.add(r1)
            goto L_0x03e8
        L_0x03fa:
            java.util.ArrayList r2 = X.C29351c6.A0D(r3)
            java.util.Iterator r1 = r3.iterator()
        L_0x0402:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0414
            java.lang.Object r0 = r1.next()
            X.43o r0 = (X.C821743o) r0
            com.whatsapp.jid.UserJid r0 = r0.A00
            r2.add(r0)
            goto L_0x0402
        L_0x0414:
            X.9IF r0 = X.AnonymousClass9IF.INVITE
            com.whatsapp.newsletter.multiadmin.AdminInviteErrorDialog r0 = X.C181519Qu.A00(r0, r4, r5, r2)
            X.C20098A7b.A02(r0, r6)
            return
        L_0x041e:
            java.lang.Object r7 = r2.A01
            com.whatsapp.otp.OtpIdentityHashRequestedReceiver r7 = (com.whatsapp.otp.OtpIdentityHashRequestedReceiver) r7
            java.lang.Object r5 = r2.A02
            android.content.Context r5 = (android.content.Context) r5
            java.lang.String r4 = r2.A03
            java.lang.String r6 = r2.A04
            X.1U5 r2 = r7.A00
            if (r2 == 0) goto L_0x051a
            X.1P3 r0 = r2.A06
            X.1PJ r0 = r0.A01
            X.2cG r0 = r0.A03()
            java.security.MessageDigest r1 = X.C108945cZ.A1I()     // Catch:{ NoSuchAlgorithmException -> 0x0451 }
            X.2kO r0 = r0.A01     // Catch:{ NoSuchAlgorithmException -> 0x0451 }
            X.1jP r0 = r0.A00     // Catch:{ NoSuchAlgorithmException -> 0x0451 }
            byte[] r0 = r0.A00()     // Catch:{ NoSuchAlgorithmException -> 0x0451 }
            byte[] r1 = r1.digest(r0)     // Catch:{ NoSuchAlgorithmException -> 0x0451 }
            r0 = 8
            byte[] r0 = X.A8G.A04(r1, r0)     // Catch:{ NoSuchAlgorithmException -> 0x0451 }
            java.lang.String r3 = X.C108955ca.A14(r0)     // Catch:{ NoSuchAlgorithmException -> 0x0451 }
            goto L_0x045e
        L_0x0451:
            r1 = move-exception
            java.lang.String r0 = "DeviceADVInfoManager/getMyIdentityHash no such algorithm exception"
            com.whatsapp.util.Log.e(r0, r1)
            X.1U2 r1 = r2.A08
            r0 = 1
            r1.A04(r0)
            r3 = 0
        L_0x045e:
            X.00H r0 = r7.A03
            if (r0 == 0) goto L_0x06e6
            java.lang.Object r2 = r0.get()
            X.6iL r2 = (X.C129776iL) r2
            X.11S r1 = r2.A00
            r1.A0I()
            X.1E3 r0 = r1.A02
            boolean r0 = r1.A0P(r0)
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x047a
            r9 = 0
            if (r3 != 0) goto L_0x04bf
        L_0x047a:
            r9 = 1
            X.0z4 r8 = r2.A01
            android.content.SharedPreferences r0 = X.C17890vO.A0B(r8)
            java.lang.String r7 = "d_identity_key"
            java.lang.String r3 = X.C17880vN.A0r(r0, r7)
            if (r3 != 0) goto L_0x04a3
            r0 = 10
            byte[] r1 = new byte[r0]
            java.util.Random r0 = new java.util.Random
            r0.<init>()
            r0.nextBytes(r1)
            java.lang.String r3 = X.C108955ca.A14(r1)
            X.C18070vi.A0X(r3)
            android.content.SharedPreferences$Editor r0 = X.C19830z4.A00(r8)
            X.C17880vN.A1E(r0, r7, r3)
        L_0x04a3:
            java.security.MessageDigest r1 = X.C108945cZ.A1I()
            byte[] r0 = X.C108975cc.A1O(r3)
            r1.update(r0)
            byte[] r1 = r1.digest()
            r0 = 8
            byte[] r0 = X.A8G.A04(r1, r0)
            java.lang.String r3 = X.C108955ca.A14(r0)
            X.C18070vi.A0X(r3)
        L_0x04bf:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "client_"
            java.lang.String r3 = X.AnonymousClass001.A1H(r0, r3, r1)
            X.00H r0 = r2.A02
            r0.get()
            r0 = 2
            android.content.Intent r1 = X.AnonymousClass3MZ.A07(r3, r0)
            r1.setPackage(r4)
            java.lang.String r0 = "com.whatsapp.otp.ID_HASH_REQUESTED"
            r1.setAction(r0)
            java.lang.String r0 = "id_hash"
            r1.putExtra(r0, r3)
            java.lang.String r0 = "request_id"
            r1.putExtra(r0, r6)
            X.AnonymousClass6X3.A00(r5, r1)
            r5.sendBroadcast(r1)
            X.00H r0 = r2.A04
            java.lang.Object r0 = r0.get()
            X.2iG r0 = (X.C56932iG) r0
            java.util.ArrayList r1 = r0.A00(r4)
            java.lang.String r0 = ","
            java.lang.String r3 = X.C108995ce.A0X(r0, r1)
            X.00H r0 = r2.A03
            java.lang.Object r2 = r0.get()
            X.72y r2 = (X.C1407672y) r2
            X.62h r1 = new X.62h
            r1.<init>()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r9)
            r1.A00 = r0
            r1.A01 = r4
            r1.A02 = r3
            X.18K r0 = r2.A03
            r0.CC7(r1)
            return
        L_0x051a:
            java.lang.String r0 = "deviceADVInfoHandler"
            goto L_0x06e8
        L_0x051e:
            java.lang.Object r1 = r2.A01
            X.6zG r1 = (X.C139676zG) r1
            java.lang.Object r0 = r2.A02
            X.6iO r0 = (X.C129806iO) r0
            java.lang.String r4 = r2.A03
            java.lang.String r3 = r2.A04
            X.1pf r2 = r1.A0C
            com.whatsapp.jid.UserJid r1 = r0.A02
            X.2pq r0 = new X.2pq
            r0.<init>(r1, r4, r3)
            r2.A01(r0)
            return
        L_0x0537:
            java.lang.Object r0 = r2.A01
            X.6py r0 = (X.C134076py) r0
            java.lang.String r10 = r2.A03
            java.lang.String r9 = r2.A04
            java.lang.Object r1 = r2.A02
            X.89K r1 = (X.AnonymousClass89K) r1
            X.118 r2 = r0.A01
            android.content.Context r3 = r2.A00
            X.2qI r2 = X.C182119Td.A00
            java.lang.String r11 = r2.A01(r3, r10)
            java.lang.String r2 = "AccountDefenceDataManager/resendDeviceConfirmationNotice"
            com.whatsapp.util.Log.i((java.lang.String) r2)
            X.0z4 r6 = r0.A02
            X.00H r4 = r6.A00
            android.content.SharedPreferences r3 = X.C17880vN.A0B(r4)
            java.lang.String r2 = "com.whatsapp.registration.RegisterPhone.mistyped_state"
            r12 = 0
            java.lang.String r22 = r3.getString(r2, r12)
            X.11C r2 = r0.A00
            android.telephony.TelephonyManager r3 = r2.A0K()
            if (r3 == 0) goto L_0x0594
            java.lang.String r2 = r3.getNetworkOperator()
        L_0x056d:
            X.A6P r19 = X.A6P.A00(r2)
            if (r3 == 0) goto L_0x0592
            java.lang.String r2 = r3.getSimOperator()
        L_0x0577:
            X.A6P r20 = X.A6P.A00(r2)
            android.content.SharedPreferences r5 = X.C17880vN.A0B(r4)
            r2 = 0
            java.lang.String r3 = "reg_attempts_device_confirmation"
            int r2 = r5.getInt(r3, r2)
            int r2 = r2 + 1
            X.C17900vP.A0M(r6, r3, r2)
            X.9zb r6 = new X.9zb
            r6.<init>(r2, r12)
            r3 = -1
            goto L_0x0596
        L_0x0592:
            r2 = r12
            goto L_0x0577
        L_0x0594:
            r2 = r12
            goto L_0x056d
        L_0x0596:
            X.A98 r2 = r0.A03     // Catch:{ Exception -> 0x069c }
            android.content.SharedPreferences r7 = X.C17880vN.A0B(r4)     // Catch:{ Exception -> 0x069c }
            java.lang.String r5 = "registration_failure_reason"
            java.lang.String r4 = ""
            java.lang.String r5 = r7.getString(r5, r4)     // Catch:{ Exception -> 0x069c }
            r4 = 0
            X.C18070vi.A0d(r9, r4)     // Catch:{ Exception -> 0x069c }
            r8 = 1
            X.C18070vi.A0f(r10, r8, r5)     // Catch:{ Exception -> 0x069c }
            boolean r7 = r2.A0T()     // Catch:{ Exception -> 0x069c }
            if (r7 != 0) goto L_0x05b5
            r14 = 15
            goto L_0x05f8
        L_0x05b5:
            r2.A0S(r8)     // Catch:{ Exception -> 0x069c }
            byte[] r15 = r2.A0V(r9, r10)     // Catch:{ Exception -> 0x069c }
            java.lang.String r4 = "sendAccountDefenceDeviceConfirmation"
            byte[] r16 = r2.A0U(r4)     // Catch:{ Exception -> 0x069c }
            r18 = r6
            r21 = r5
            r17 = r2
            java.util.LinkedHashMap r14 = X.A98.A02(r17, r18, r19, r20, r21, r22)     // Catch:{ Exception -> 0x069c }
            X.00H r4 = r2.A0D     // Catch:{ Exception -> 0x069c }
            java.lang.Object r8 = r4.get()     // Catch:{ Exception -> 0x069c }
            X.A7d r8 = (X.C20100A7d) r8     // Catch:{ Exception -> 0x069c }
            java.lang.String r4 = "send_device_confirm_entrypoint"
            java.lang.String r12 = r2.A0P(r9, r4)     // Catch:{ Exception -> 0x069c }
            java.util.List r13 = X.A98.A04(r2)     // Catch:{ Exception -> 0x069c }
            X.2bP r7 = r2.A09     // Catch:{ Exception -> 0x069c }
            r17 = 0
            X.9CJ r6 = new X.9CJ     // Catch:{ Exception -> 0x069c }
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)     // Catch:{ Exception -> 0x069c }
            java.lang.Object r11 = X.C19951A0i.A00(r6)     // Catch:{ Exception -> 0x069c }
            X.6tW r11 = (X.C136256tW) r11     // Catch:{ Exception -> 0x069c }
            if (r11 != 0) goto L_0x0603
            java.lang.String r0 = "AccountDefenceDataManager/resendDeviceConfirmationNotice/result is null"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ Exception -> 0x069c }
            r1.onError(r3)     // Catch:{ Exception -> 0x069c }
            return
        L_0x05f8:
            r17 = r4
            X.6tW r11 = new X.6tW     // Catch:{ Exception -> 0x069c }
            r13 = r12
            r15 = r3
            r16 = r4
            r11.<init>(r12, r13, r14, r15, r16, r17)     // Catch:{ Exception -> 0x069c }
        L_0x0603:
            int r5 = r11.A00     // Catch:{ Exception -> 0x069c }
            r2 = 15
            if (r5 != r2) goto L_0x0612
            java.lang.String r0 = "AccountDefenceDataManager/resendDeviceConfirmationNotice/wamsys initialization fails"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ Exception -> 0x069c }
            r1.onError(r2)     // Catch:{ Exception -> 0x069c }
            return
        L_0x0612:
            java.lang.StringBuilder r4 = X.AnonymousClass000.A10()     // Catch:{ Exception -> 0x069c }
            java.lang.String r2 = "AccountDefenceDataManager/resendDeviceConfirmationNotice/success status: "
            X.C17900vP.A0j(r2, r4, r5)     // Catch:{ Exception -> 0x069c }
            r4 = 11
            X.9o9 r2 = r0.A05     // Catch:{ Exception -> 0x069c }
            if (r5 != r4) goto L_0x0681
            java.lang.String r0 = "AccountDefenceLocalDataRepository/saveRetryLimitReachedForResendingNotice/"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ Exception -> 0x069c }
            X.0vc r7 = r2.A00     // Catch:{ Exception -> 0x069c }
            java.lang.String r6 = "AccountDefenceLocalDataRepository_prefs"
            android.content.SharedPreferences r0 = r7.A05(r6)     // Catch:{ Exception -> 0x069c }
            android.content.SharedPreferences$Editor r4 = r0.edit()     // Catch:{ Exception -> 0x069c }
            java.lang.String r2 = "com.whatsapp.registration.accountdefence.AccountDefenceLocalDataRepository.is_retry_limit_reached_resending_notice"
            r0 = 1
            r4.putBoolean(r2, r0)     // Catch:{ Exception -> 0x069c }
            r4.apply()     // Catch:{ Exception -> 0x069c }
        L_0x063b:
            java.lang.String r0 = r11.A03     // Catch:{ Exception -> 0x069c }
            r4 = -1
            long r8 = X.A9B.A02(r0, r4)     // Catch:{ Exception -> 0x069c }
            r4 = 1000(0x3e8, double:4.94E-321)
            long r8 = r8 * r4
            r4 = 0
            int r0 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x066e
            long r4 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x069c }
            long r4 = r4 + r8
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()     // Catch:{ Exception -> 0x069c }
            java.lang.String r0 = "AccountDefenceLocalDataRepository/saveRetryTimeForResendingNotice/"
            X.C17900vP.A0m(r0, r2, r4)     // Catch:{ Exception -> 0x069c }
            android.content.SharedPreferences r0 = r7.A05(r6)     // Catch:{ Exception -> 0x069c }
            android.content.SharedPreferences$Editor r2 = r0.edit()     // Catch:{ Exception -> 0x069c }
            java.lang.String r0 = "com.whatsapp.registration.accountdefence.AccountDefenceLocalDataRepository.retry_time_reached_resending_notice"
            r2.putLong(r0, r4)     // Catch:{ Exception -> 0x069c }
        L_0x0667:
            r2.apply()     // Catch:{ Exception -> 0x069c }
            r1.BpK(r11)     // Catch:{ Exception -> 0x069c }
            goto L_0x069b
        L_0x066e:
            java.lang.String r0 = "AccountDefenceLocalDataRepository/clearRetryTimeForResendingNotice"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ Exception -> 0x069c }
            android.content.SharedPreferences r0 = r7.A05(r6)     // Catch:{ Exception -> 0x069c }
            android.content.SharedPreferences$Editor r2 = r0.edit()     // Catch:{ Exception -> 0x069c }
            java.lang.String r0 = "com.whatsapp.registration.accountdefence.AccountDefenceLocalDataRepository.retry_time_reached_resending_notice"
            r2.remove(r0)     // Catch:{ Exception -> 0x069c }
            goto L_0x0667
        L_0x0681:
            java.lang.String r0 = "AccountDefenceLocalDataRepository/clearRetryLimitReachedForResendingNotice"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ Exception -> 0x069c }
            X.0vc r7 = r2.A00     // Catch:{ Exception -> 0x069c }
            java.lang.String r6 = "AccountDefenceLocalDataRepository_prefs"
            android.content.SharedPreferences r0 = r7.A05(r6)     // Catch:{ Exception -> 0x069c }
            android.content.SharedPreferences$Editor r2 = r0.edit()     // Catch:{ Exception -> 0x069c }
            java.lang.String r0 = "com.whatsapp.registration.accountdefence.AccountDefenceLocalDataRepository.is_retry_limit_reached_resending_notice"
            r2.remove(r0)     // Catch:{ Exception -> 0x069c }
            r2.apply()     // Catch:{ Exception -> 0x069c }
            goto L_0x063b
        L_0x069b:
            return
        L_0x069c:
            r4 = move-exception
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()
            java.lang.String r0 = "AccountDefenceDataManager/resendDeviceConfirmationNotice/error "
            X.C17900vP.A0X(r4, r0, r2)
            r1.onError(r3)
            return
        L_0x06aa:
            java.lang.Object r4 = r2.A01
            X.99S r4 = (X.AnonymousClass99S) r4
            java.lang.String r3 = r2.A03
            java.lang.String r1 = r2.A04
            java.lang.Object r0 = r2.A02
            X.9yx r0 = (X.C198819yx) r0
            java.lang.String r0 = r0.A0c
            r4.A4k(r3, r1, r0)
            return
        L_0x06bc:
            java.lang.Object r0 = r2.A01
            X.373 r0 = (X.AnonymousClass373) r0
            java.lang.Object r3 = r2.A02
            android.util.Pair r3 = (android.util.Pair) r3
            X.1eg r0 = r0.A00
            X.00H r0 = r0.A02
            java.lang.Object r2 = r0.get()
            X.1eh r2 = (X.C30901eh) r2
            int r1 = X.C108965cb.A01(r3)
            java.lang.Object r0 = r3.second
            java.lang.String r0 = (java.lang.String) r0
            r2.A04(r0, r1)
            return
        L_0x06da:
            java.lang.String r0 = "conversationSeenManager"
            goto L_0x06e8
        L_0x06dd:
            java.lang.String r0 = "globalUI"
            goto L_0x06e8
        L_0x06e0:
            java.lang.String r0 = "otpMessageService"
            goto L_0x06e8
        L_0x06e3:
            java.lang.String r0 = "fMessageDatabase"
            goto L_0x06e8
        L_0x06e6:
            java.lang.String r0 = "otpIdentityHashService"
        L_0x06e8:
            X.C18070vi.A11(r0)
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C146597Pw.run():void");
    }
}
