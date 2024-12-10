package X;

/* renamed from: X.7Pq  reason: invalid class name */
public class AnonymousClass7Pq implements Runnable {
    public final int A00;
    public final Object A01;
    public final String A02;
    public final String A03;

    public AnonymousClass7Pq(Object obj, String str, String str2, int i) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = str;
        this.A03 = str2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003c, code lost:
        r2.BZQ(r1, 2000, true).A03();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x034f, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:?, code lost:
        X.CDX.A00(r8, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x0353, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:174:0x043b, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:184:0x045e, code lost:
        r1 = r4.A04;
        r1.A0w.setText(r2);
        r1.A0L.setText(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:185:0x046a, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:195:0x04a6, code lost:
        r0 = "conversationSeenManager";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:197:0x04ac, code lost:
        r0 = "fMessageDatabase";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0054, code lost:
        r0 = r4.equals(r0);
        r1 = 2131898537;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:204:0x04db, code lost:
        X.C18070vi.A11(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:206:0x04df, code lost:
        throw null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:218:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0068, code lost:
        r0 = r4.equals(r0);
        r1 = 2131898536;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x006f, code lost:
        if (r0 != false) goto L_0x003c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0102, code lost:
        if (r0 == null) goto L_0x04a6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0104, code lost:
        r0.A00(r3.A0I(), 2, 3, true, true, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0110, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r14 = this;
            int r0 = r14.A00
            switch(r0) {
                case 0: goto L_0x0497;
                case 1: goto L_0x026c;
                case 2: goto L_0x0483;
                case 3: goto L_0x0477;
                case 4: goto L_0x046b;
                case 5: goto L_0x0211;
                case 6: goto L_0x01da;
                case 7: goto L_0x01b7;
                case 8: goto L_0x0176;
                case 9: goto L_0x0456;
                case 10: goto L_0x0444;
                case 11: goto L_0x03fa;
                case 12: goto L_0x015f;
                case 13: goto L_0x0111;
                case 14: goto L_0x00d6;
                case 15: goto L_0x009d;
                case 16: goto L_0x0387;
                case 17: goto L_0x04cd;
                case 18: goto L_0x0072;
                case 19: goto L_0x02ba;
                case 20: goto L_0x029f;
                case 21: goto L_0x028a;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.String r1 = r14.A02
            java.lang.Object r0 = r14.A01
            X.721 r0 = (X.AnonymousClass721) r0
            java.lang.String r4 = r14.A03
            r3 = 1
            if (r1 == 0) goto L_0x0045
            X.00H r0 = r0.A0B
            java.lang.Object r0 = r0.get()
            X.178 r0 = (X.AnonymousClass178) r0
            java.lang.ref.WeakReference r0 = r0.A00(r1)
            if (r0 == 0) goto L_0x0045
            java.lang.Object r2 = r0.get()
            X.1Fl r2 = (X.C23291Fl) r2
            if (r2 == 0) goto L_0x0045
            X.1Fx r1 = r2.BPx()
            X.1Fx r0 = X.C23401Fx.STARTED
            boolean r0 = r1.A00(r0)
            if (r0 == 0) goto L_0x0045
            int r0 = r4.hashCode()
            switch(r0) {
                case -172475824: goto L_0x0046;
                case -56483: goto L_0x0049;
                case 329595890: goto L_0x004c;
                case 949197458: goto L_0x004f;
                case 975802643: goto L_0x0052;
                case 1231505537: goto L_0x005c;
                case 1709381253: goto L_0x0066;
                default: goto L_0x0039;
            }
        L_0x0039:
            r1 = 2131891799(0x7f121657, float:1.9418328E38)
        L_0x003c:
            r0 = 2000(0x7d0, float:2.803E-42)
            X.4eK r0 = r2.BZQ(r1, r0, r3)
            r0.A03()
        L_0x0045:
            return
        L_0x0046:
            java.lang.String r0 = "wa_status_privacy"
            goto L_0x0054
        L_0x0049:
            java.lang.String r0 = "wa_crosspost_error_unlinked"
            goto L_0x0068
        L_0x004c:
            java.lang.String r0 = "wa_auto_crosspost_notice"
            goto L_0x0068
        L_0x004f:
            java.lang.String r0 = "wa_crosspost_existing_status"
            goto L_0x0068
        L_0x0052:
            java.lang.String r0 = "wa_crosspost_status_privacy_settings"
        L_0x0054:
            boolean r0 = r4.equals(r0)
            r1 = 2131898537(0x7f1230a9, float:1.9431995E38)
            goto L_0x006f
        L_0x005c:
            java.lang.String r0 = "app_settings"
            boolean r0 = r4.equals(r0)
            r1 = 2131898535(0x7f1230a7, float:1.943199E38)
            goto L_0x006f
        L_0x0066:
            java.lang.String r0 = "wa_crosspost_new_status"
        L_0x0068:
            boolean r0 = r4.equals(r0)
            r1 = 2131898536(0x7f1230a8, float:1.9431993E38)
        L_0x006f:
            if (r0 != 0) goto L_0x003c
            goto L_0x0039
        L_0x0072:
            java.lang.Object r8 = r14.A01
            com.whatsapp.registration.RegisterName r8 = (com.whatsapp.registration.RegisterName) r8
            java.lang.String r7 = r14.A02
            java.lang.String r6 = r14.A03
            r5 = 1
            X.C18070vi.A0d(r7, r5)
            r4 = 2
            X.8dJ r1 = r8.A0u
            r3 = 0
            if (r1 == 0) goto L_0x0045
            r0 = 2131434655(0x7f0b1c9f, float:1.849113E38)
            android.view.View r2 = r1.findViewById(r0)
            android.widget.TextView r2 = (android.widget.TextView) r2
            if (r2 == 0) goto L_0x0045
            r1 = 2131891802(0x7f12165a, float:1.9418334E38)
            r0 = 3
            java.lang.Object[] r0 = X.C108945cZ.A1a(r3, r7, r0, r5)
            r0[r4] = r6
            X.AnonymousClass3MY.A0y(r8, r2, r0, r1)
            return
        L_0x009d:
            java.lang.Object r4 = r14.A01
            com.whatsapp.notification.OtpZeroTapMarkAsReadNotificationHandlerReceiver r4 = (com.whatsapp.notification.OtpZeroTapMarkAsReadNotificationHandlerReceiver) r4
            java.lang.String r0 = r14.A02
            java.lang.String r3 = r14.A03
            X.1BI r2 = X.AnonymousClass3MX.A0l(r0)
            r0 = 0
            X.205 r1 = new X.205
            r1.<init>(r2, r3, r0)
            X.00H r0 = r4.A02
            if (r0 == 0) goto L_0x04ac
            X.206 r3 = X.AnonymousClass1W2.A01(r1, r0)
            if (r3 == 0) goto L_0x0045
            boolean r0 = r3 instanceof X.C439521o
            if (r0 == 0) goto L_0x00d3
            X.00H r0 = r4.A03
            if (r0 == 0) goto L_0x04a3
            java.lang.Object r0 = r0.get()
            X.70P r0 = (X.AnonymousClass70P) r0
            com.whatsapp.jid.UserJid r2 = r3.A0I()
            if (r2 == 0) goto L_0x00d3
            X.1Mc r1 = r0.A01
            r0 = 1
            r1.A08(r2, r0)
        L_0x00d3:
            X.1hl r0 = r4.A00
            goto L_0x0102
        L_0x00d6:
            java.lang.Object r4 = r14.A01
            com.whatsapp.notification.OtpOneTapNotificationHandlerActivity r4 = (com.whatsapp.notification.OtpOneTapNotificationHandlerActivity) r4
            java.lang.String r0 = r14.A02
            java.lang.String r3 = r14.A03
            X.1BI r2 = X.AnonymousClass3MX.A0l(r0)
            r0 = 0
            X.205 r1 = new X.205
            r1.<init>(r2, r3, r0)
            X.00H r0 = r4.A03
            if (r0 == 0) goto L_0x04ac
            X.206 r3 = X.AnonymousClass1W2.A01(r1, r0)
            if (r3 == 0) goto L_0x0045
            X.1KB r2 = r4.A00
            if (r2 == 0) goto L_0x04a9
            r1 = 20
            X.3Bz r0 = new X.3Bz
            r0.<init>(r4, r3, r1)
            r2.A0J(r0)
            X.1hl r0 = r4.A01
        L_0x0102:
            if (r0 == 0) goto L_0x04a6
            com.whatsapp.jid.UserJid r1 = r3.A0I()
            r3 = 3
            r6 = 0
            r4 = 1
            r2 = 2
            r5 = r4
            r0.A00(r1, r2, r3, r4, r5, r6)
            return
        L_0x0111:
            java.lang.Object r2 = r14.A01
            X.6nc r2 = (X.C132806nc) r2
            java.lang.String r6 = r14.A02
            java.lang.String r5 = r14.A03
            X.00H r0 = r2.A01
            java.lang.Object r0 = r0.get()
            X.6eY r0 = (X.C127556eY) r0
            java.lang.String r1 = X.C17970vW.A04(r6)
            if (r1 == 0) goto L_0x04af
            X.0vl r0 = r0.A01
            java.lang.Object r0 = r0.getValue()
            X.A5O r0 = (X.A5O) r0
            android.graphics.Bitmap r4 = r0.A01(r1)
            if (r4 == 0) goto L_0x04af
            java.util.Map r0 = r2.A03
            java.lang.Object r0 = r0.get(r5)
            java.lang.ref.Reference r0 = (java.lang.ref.Reference) r0
            if (r0 == 0) goto L_0x0045
            android.view.View r3 = X.C108945cZ.A0O(r0)
            if (r3 == 0) goto L_0x0045
            r0 = -1641051461(0xffffffff9e2f8abb, float:-9.293112E-21)
            java.lang.Object r0 = r3.getTag(r0)
            boolean r0 = X.C18070vi.A18(r0, r5)
            if (r0 == 0) goto L_0x0045
            X.11A r2 = r2.A00
            r1 = 15
            X.AkP r0 = new X.AkP
            r0.<init>(r3, r4, r1)
            r2.A00(r0)
            return
        L_0x015f:
            java.lang.Object r3 = r14.A01
            com.whatsapp.mediacomposer.VideoComposerFragment r3 = (com.whatsapp.mediacomposer.VideoComposerFragment) r3
            java.lang.String r2 = r14.A02
            java.lang.String r1 = r14.A03
            android.widget.TextView r0 = r3.A0I
            if (r0 == 0) goto L_0x016e
            r0.setText(r2)
        L_0x016e:
            android.widget.TextView r0 = r3.A0J
            if (r0 == 0) goto L_0x0045
            r0.setText(r1)
            return
        L_0x0176:
            java.lang.Object r5 = r14.A01
            X.70Q r5 = (X.AnonymousClass70Q) r5
            java.lang.String r1 = r14.A02
            java.lang.String r4 = r14.A03
            r0 = 1
            X.C18070vi.A0d(r1, r0)
            android.app.Activity r0 = r5.A06
            boolean r0 = r0.isFinishing()
            if (r0 != 0) goto L_0x0045
            android.widget.EditText r0 = r5.A01
            java.lang.String r3 = "countryCodeField"
            if (r0 == 0) goto L_0x04c9
            android.text.Editable r0 = r0.getText()
            if (r0 == 0) goto L_0x019c
            int r0 = r0.length()
            if (r0 != 0) goto L_0x0045
        L_0x019c:
            java.lang.String r2 = X.C108975cc.A0e(r1)
            if (r4 == 0) goto L_0x01b3
            java.lang.StringBuilder r1 = X.AnonymousClass000.A11(r2)
            java.lang.String r0 = " +"
            java.lang.String r1 = X.AnonymousClass001.A1H(r0, r4, r1)
            android.widget.EditText r0 = r5.A01
            if (r0 == 0) goto L_0x04c9
            r0.setText(r1)
        L_0x01b3:
            r5.A07(r2)
            return
        L_0x01b7:
            java.lang.Object r0 = r14.A01
            X.4mN r0 = (X.C95524mN) r0
            java.lang.String r4 = r14.A02
            java.lang.String r3 = r14.A03
            java.lang.Object r2 = r0.A01
            com.whatsapp.companiondevice.LinkedDevicesSharedViewModel r2 = (com.whatsapp.companiondevice.LinkedDevicesSharedViewModel) r2
            boolean r0 = r2.A02
            if (r0 == 0) goto L_0x0045
            r1 = 0
            r2.A02 = r1
            X.1DT r0 = r2.A05
            X.AnonymousClass3MY.A1L(r0, r1)
            X.1wy r1 = r2.A0J
            X.0yx r0 = new X.0yx
            r0.<init>(r4, r3)
            r1.A0F(r0)
            return
        L_0x01da:
            java.lang.Object r0 = r14.A01
            X.4WT r0 = (X.AnonymousClass4WT) r0
            java.lang.String r6 = r14.A02
            java.lang.String r5 = r14.A03
            com.whatsapp.companiondevice.LinkedDevicesEnterCodeActivity r4 = r0.A00
            boolean r0 = r4.Bed()
            if (r0 != 0) goto L_0x0045
            X.C17960vV.A02()
            X.C17960vV.A02()
            java.lang.Runnable r1 = r4.A0H
            if (r1 == 0) goto L_0x01f9
            android.view.View r0 = r4.A00
            r0.removeCallbacks(r1)
        L_0x01f9:
            android.view.View r3 = r4.A00
            X.C17960vV.A02()
            java.lang.Runnable r2 = r4.A0H
            if (r2 != 0) goto L_0x020a
            r0 = 5
            X.7Pq r2 = new X.7Pq
            r2.<init>(r4, r6, r5, r0)
            r4.A0H = r2
        L_0x020a:
            r0 = 120000(0x1d4c0, double:5.9288E-319)
            r3.postDelayed(r2, r0)
            return
        L_0x0211:
            java.lang.Object r4 = r14.A01
            com.whatsapp.companiondevice.LinkedDevicesEnterCodeActivity r4 = (com.whatsapp.companiondevice.LinkedDevicesEnterCodeActivity) r4
            java.lang.String r5 = r14.A02
            java.lang.String r3 = r14.A03
            java.lang.String r0 = "LinkedDevicesEnterCodeActivity/timeout"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.BCS r2 = com.whatsapp.companiondevice.LinkedDevicesEnterCodeActivity.A03(r4)
            if (r2 == 0) goto L_0x022e
            X.00H r0 = r4.A0E
            r0.get()
            r1 = -3
            r0 = 2
            r2.BiF(r0, r1)
        L_0x022e:
            X.4Q4 r0 = r4.A07
            X.C17960vV.A02()
            X.2jI r0 = r0.A01
            if (r0 == 0) goto L_0x023e
            X.2sp r0 = r0.A00()
            r0.A02()
        L_0x023e:
            X.10I r2 = r4.A05
            r1 = 28
            X.4rg r0 = new X.4rg
            r0.<init>((java.lang.Object) r4, (int) r1)
            r2.CGF(r0)
            com.whatsapp.companiondevice.LinkedDevicesEnterCodeActivity.A0d(r4, r5)
            X.00H r0 = r4.A0G
            r0.get()
            r2 = 0
            X.00H r0 = r4.A0C
            java.lang.Object r1 = r0.get()
            X.9sz r1 = (X.C195219sz) r1
            r0 = 7
            r1.A01(r0, r5, r3)
            boolean r0 = r4.Bed()
            if (r0 != 0) goto L_0x0045
            com.whatsapp.companiondevice.LinkedDevicesEnterCodeActivity.A0Q(r4)
            com.whatsapp.companiondevice.LinkedDevicesEnterCodeActivity.A0c(r4, r2)
            return
        L_0x026c:
            java.lang.Object r0 = r14.A01
            X.DGH r0 = (X.DGH) r0
            java.util.concurrent.CopyOnWriteArraySet r0 = r0.A00
            java.util.Iterator r3 = r0.iterator()
        L_0x0276:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0045
            java.lang.Object r2 = r3.next()
            X.EAh r2 = (X.C28613EAh) r2
            java.lang.String r1 = r14.A03
            java.lang.String r0 = r14.A02
            r2.C9y(r1, r0)
            goto L_0x0276
        L_0x028a:
            java.lang.Object r0 = r14.A01
            X.373 r0 = (X.AnonymousClass373) r0
            X.1eg r0 = r0.A00
            X.00H r0 = r0.A02
            java.lang.Object r2 = r0.get()
            X.1eh r2 = (X.C30901eh) r2
            r1 = -1
            java.lang.String r0 = "Delivery failure."
            r2.A04(r0, r1)
            return
        L_0x029f:
            java.lang.Object r0 = r14.A01
            X.1SB r0 = (X.AnonymousClass1SB) r0
            java.lang.String r4 = r14.A02
            java.lang.String r3 = r14.A03
            X.00H r0 = r0.A0H
            X.10T r2 = X.C17880vN.A0V(r0)
            X.C18070vi.A0h(r4, r3)
            r1 = 5
            X.7KS r0 = new X.7KS
            r0.<init>(r4, r3, r1)
            r2.notifyAllObservers(r0)
            return
        L_0x02ba:
            java.lang.Object r5 = r14.A01
            X.1SB r5 = (X.AnonymousClass1SB) r5
            java.lang.String r4 = r14.A02
            java.lang.String r3 = r14.A03
            X.00H r0 = r5.A0M     // Catch:{ Exception -> 0x0375 }
            java.lang.Object r10 = r0.get()     // Catch:{ Exception -> 0x0375 }
            X.6pr r10 = (X.C134006pr) r10     // Catch:{ Exception -> 0x0375 }
            X.C18070vi.A0h(r4, r3)     // Catch:{ Exception -> 0x0375 }
            X.6tj r0 = r10.A00     // Catch:{ Exception -> 0x0375 }
            X.725 r7 = r0.A00(r4, r3)     // Catch:{ Exception -> 0x0375 }
            byte[] r1 = r0.A02(r7)     // Catch:{ Exception -> 0x0375 }
            X.00H r0 = r10.A04     // Catch:{ Exception -> 0x0375 }
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x0375 }
            X.6ol r0 = (X.C133446ol) r0     // Catch:{ Exception -> 0x0375 }
            r0.A00(r7, r1)     // Catch:{ Exception -> 0x0375 }
            boolean r0 = r7.A0P     // Catch:{ Exception -> 0x0375 }
            if (r0 != 0) goto L_0x0354
            X.72s r1 = r10.A01     // Catch:{ Exception -> 0x0375 }
            java.util.List r0 = r7.A07     // Catch:{ Exception -> 0x0375 }
            r1.A02(r4, r3, r0)     // Catch:{ Exception -> 0x0375 }
            java.util.List r0 = r7.A07     // Catch:{ Exception -> 0x0375 }
            java.util.Iterator r13 = r0.iterator()     // Catch:{ Exception -> 0x0375 }
        L_0x02f3:
            boolean r0 = r13.hasNext()     // Catch:{ Exception -> 0x0375 }
            if (r0 == 0) goto L_0x0354
            X.77d r2 = X.C108945cZ.A0x(r13)     // Catch:{ Exception -> 0x0375 }
            java.lang.String r12 = r2.A0F     // Catch:{ Exception -> 0x0375 }
            X.73B r0 = r2.A04     // Catch:{ Exception -> 0x0375 }
            if (r0 == 0) goto L_0x0306
            X.737[] r1 = r0.A0H     // Catch:{ Exception -> 0x0375 }
            goto L_0x0307
        L_0x0306:
            r1 = 0
        L_0x0307:
            if (r12 == 0) goto L_0x02f3
            if (r1 == 0) goto L_0x02f3
            X.00H r0 = r10.A03     // Catch:{ Exception -> 0x0375 }
            java.lang.Object r11 = r0.get()     // Catch:{ Exception -> 0x0375 }
            X.2bD r11 = (X.C52622bD) r11     // Catch:{ Exception -> 0x0375 }
            java.lang.String r8 = X.C137426vR.A00(r1)     // Catch:{ Exception -> 0x0375 }
            java.lang.String r6 = r2.A0C     // Catch:{ Exception -> 0x0375 }
            java.lang.String r2 = "authority"
            java.lang.String r1 = "emojis"
            android.content.ContentValues r9 = X.C17880vN.A08()     // Catch:{ Exception -> 0x0375 }
            java.lang.String r0 = "plaintext_hash"
            r9.put(r0, r12)     // Catch:{ Exception -> 0x0375 }
            r9.put(r2, r4)     // Catch:{ Exception -> 0x0375 }
            java.lang.String r0 = "sticker_pack_id"
            r9.put(r0, r3)     // Catch:{ Exception -> 0x0375 }
            r9.put(r1, r8)     // Catch:{ Exception -> 0x0375 }
            java.lang.String r0 = "hash_of_image_part"
            r9.put(r0, r6)     // Catch:{ Exception -> 0x0375 }
            X.00H r0 = r11.A00     // Catch:{ Exception -> 0x0375 }
            X.1au r8 = X.C108985cd.A0S(r0)     // Catch:{ Exception -> 0x0375 }
            r0 = r8
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x034d }
            X.1Ev r6 = r0.A02     // Catch:{ all -> 0x034d }
            java.lang.String r2 = "third_party_sticker_emoji_mapping"
            java.lang.String r1 = "addMapping/INSERT_MAPPING"
            r0 = 5
            r6.A09(r2, r1, r9, r0)     // Catch:{ all -> 0x034d }
            r8.close()     // Catch:{ Exception -> 0x0375 }
            goto L_0x02f3
        L_0x034d:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x034f }
        L_0x034f:
            r0 = move-exception
            X.CDX.A00(r8, r1)     // Catch:{ Exception -> 0x0375 }
            throw r0     // Catch:{ Exception -> 0x0375 }
        L_0x0354:
            X.00H r0 = r10.A05     // Catch:{ Exception -> 0x0375 }
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x0375 }
            X.702 r0 = (X.AnonymousClass702) r0     // Catch:{ Exception -> 0x0375 }
            r0.A03(r7, r4, r3)     // Catch:{ Exception -> 0x0375 }
            X.0ve r2 = r5.A08     // Catch:{ Exception -> 0x0375 }
            X.18K r1 = r5.A09     // Catch:{ Exception -> 0x0375 }
            r0 = 0
            X.C137436vS.A01(r2, r1, r7, r0)     // Catch:{ Exception -> 0x0375 }
            X.00H r0 = r5.A0O     // Catch:{ Exception -> 0x0375 }
            java.lang.Object r1 = r0.get()     // Catch:{ Exception -> 0x0375 }
            X.6qY r1 = (X.C134416qY) r1     // Catch:{ Exception -> 0x0375 }
            java.lang.String r0 = r7.A0H     // Catch:{ Exception -> 0x0375 }
            r1.A02(r0)     // Catch:{ Exception -> 0x0375 }
            goto L_0x037a
        L_0x0375:
            java.lang.String r0 = "StickerRepository/InstallThirdPartyStickerPackAsyncTask failed to install third party pack"
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x037a:
            X.1KB r2 = r5.A03
            r1 = 20
            X.7Pq r0 = new X.7Pq
            r0.<init>(r5, r4, r3, r1)
            r2.A0J(r0)
            return
        L_0x0387:
            java.lang.Object r6 = r14.A01
            X.1ic r6 = (X.C33311ic) r6
            java.lang.String r1 = r14.A02
            java.lang.String r0 = r14.A03
            X.0yx r9 = new X.0yx
            r9.<init>(r1, r0)
            monitor-enter(r6)
            java.lang.Object r1 = r9.A00     // Catch:{ all -> 0x03f7 }
            r0 = r1
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0     // Catch:{ all -> 0x03f7 }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x03f7 }
            if (r0 == 0) goto L_0x03a8
            X.1QE r1 = r6.A02     // Catch:{ all -> 0x03f7 }
            java.lang.String r0 = "addUnreadPaymentMethodUpdate empty credentialId"
            r1.A05(r0)     // Catch:{ all -> 0x03f7 }
            goto L_0x03f2
        L_0x03a8:
            X.1La r7 = r6.A00     // Catch:{ all -> 0x03f7 }
            java.lang.String r5 = "unread_payment_method_credential_ids"
            java.lang.String r0 = r7.A02(r5)     // Catch:{ all -> 0x03f7 }
            if (r0 != 0) goto L_0x03b4
            java.lang.String r0 = ""
        L_0x03b4:
            java.lang.String r8 = ";"
            java.lang.String[] r0 = android.text.TextUtils.split(r0, r8)     // Catch:{ all -> 0x03f7 }
            java.util.List r0 = java.util.Arrays.asList(r0)     // Catch:{ all -> 0x03f7 }
            java.util.HashSet r4 = new java.util.HashSet     // Catch:{ all -> 0x03f7 }
            r4.<init>(r0)     // Catch:{ all -> 0x03f7 }
            java.lang.String r3 = ":"
            java.lang.String[] r2 = X.C17880vN.A1Z()     // Catch:{ all -> 0x03f7 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ all -> 0x03f7 }
            r0 = 0
            r2[r0] = r1     // Catch:{ all -> 0x03f7 }
            java.lang.Object r1 = r9.A01     // Catch:{ all -> 0x03f7 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ all -> 0x03f7 }
            r0 = 1
            r2[r0] = r1     // Catch:{ all -> 0x03f7 }
            java.lang.String r0 = android.text.TextUtils.join(r3, r2)     // Catch:{ all -> 0x03f7 }
            r4.add(r0)     // Catch:{ all -> 0x03f7 }
            java.lang.String r3 = android.text.TextUtils.join(r8, r4)     // Catch:{ all -> 0x03f7 }
            X.1QE r2 = r6.A02     // Catch:{ all -> 0x03f7 }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x03f7 }
            java.lang.String r0 = "addUnreadPaymentMethodUpdate/unreadCredential:"
            java.lang.String r0 = X.AnonymousClass001.A1H(r0, r3, r1)     // Catch:{ all -> 0x03f7 }
            r2.A06(r0)     // Catch:{ all -> 0x03f7 }
            r7.A06(r5, r3)     // Catch:{ all -> 0x03f7 }
        L_0x03f2:
            monitor-exit(r6)
            X.C33311ic.A00(r6)
            return
        L_0x03f7:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        L_0x03fa:
            java.lang.Object r1 = r14.A01
            com.whatsapp.location.StopLiveLocationDialogFragment r1 = (com.whatsapp.location.StopLiveLocationDialogFragment) r1
            java.lang.String r5 = r14.A02
            java.lang.String r0 = r14.A03
            X.1Uv r4 = r1.A00
            X.1BI r3 = X.AnonymousClass3MX.A0l(r0)
            X.C17960vV.A07(r3)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "LocationSharingManager/cancelShareLocation; msgId="
            r1.append(r0)
            r1.append(r5)
            java.lang.String r0 = "; jid="
            X.C17900vP.A0Y(r3, r0, r1)
            java.lang.Object r2 = r4.A0U
            monitor-enter(r2)
            java.util.Map r0 = X.C27131Uv.A06(r4)     // Catch:{ all -> 0x0441 }
            java.lang.Object r0 = r0.get(r3)     // Catch:{ all -> 0x0441 }
            X.2er r0 = (X.C54882er) r0     // Catch:{ all -> 0x0441 }
            if (r0 != 0) goto L_0x043c
            r1 = 1
            X.205 r0 = new X.205     // Catch:{ all -> 0x0441 }
            r0.<init>(r3, r5, r1)     // Catch:{ all -> 0x0441 }
            X.219 r0 = X.C27131Uv.A03(r4, r0)     // Catch:{ all -> 0x0441 }
            if (r0 == 0) goto L_0x043a
            X.C27131Uv.A0E(r4, r0)     // Catch:{ all -> 0x0441 }
        L_0x043a:
            monitor-exit(r2)     // Catch:{ all -> 0x0441 }
            return
        L_0x043c:
            monitor-exit(r2)     // Catch:{ all -> 0x0441 }
            r4.A0V(r3)
            return
        L_0x0441:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0441 }
            throw r0
        L_0x0444:
            java.lang.Object r4 = r14.A01
            X.2Bu r4 = (X.C45822Bu) r4
            java.lang.String r3 = r14.A02
            java.lang.String r2 = r14.A03
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "conversations-gdrive-observer/set-message "
            X.C17900vP.A0f(r0, r3, r1)
            goto L_0x045e
        L_0x0456:
            java.lang.Object r4 = r14.A01
            X.2Bu r4 = (X.C45822Bu) r4
            java.lang.String r3 = r14.A02
            java.lang.String r2 = r14.A03
        L_0x045e:
            com.whatsapp.conversationslist.ConversationsFragment r1 = r4.A04
            com.whatsapp.WaTextView r0 = r1.A0w
            r0.setText(r2)
            android.widget.TextView r0 = r1.A0L
            r0.setText(r3)
            return
        L_0x046b:
            java.lang.Object r2 = r14.A01
            com.whatsapp.backup.google.SettingsGoogleDrive r2 = (com.whatsapp.backup.google.SettingsGoogleDrive) r2
            java.lang.String r1 = r14.A02
            java.lang.String r0 = r14.A03
            com.whatsapp.backup.google.SettingsGoogleDrive.A0u(r2, r1, r0)
            return
        L_0x0477:
            java.lang.Object r2 = r14.A01
            X.8gR r2 = (X.C167498gR) r2
            java.lang.String r1 = r14.A02
            java.lang.String r0 = r14.A03
            X.C167498gR.A0r(r2, r1, r0)
            return
        L_0x0483:
            java.lang.Object r0 = r14.A01
            X.1mu r0 = (X.C35851mu) r0
            java.lang.String r2 = r14.A02
            java.lang.String r1 = r14.A03
            X.00H r0 = r0.A0E
            java.lang.Object r0 = r0.get()
            X.2n7 r0 = (X.C59932n7) r0
            r0.A02(r2, r1)
            return
        L_0x0497:
            java.lang.Object r2 = r14.A01
            X.86M r2 = (X.AnonymousClass86M) r2
            java.lang.String r1 = r14.A02
            java.lang.String r0 = r14.A03
            r2.BxD(r1, r0)
            return
        L_0x04a3:
            java.lang.String r0 = "otpMessageService"
            goto L_0x04db
        L_0x04a6:
            java.lang.String r0 = "conversationSeenManager"
            goto L_0x04db
        L_0x04a9:
            java.lang.String r0 = "globalUI"
            goto L_0x04db
        L_0x04ac:
            java.lang.String r0 = "fMessageDatabase"
            goto L_0x04db
        L_0x04af:
            X.00H r0 = r2.A02
            java.lang.Object r4 = r0.get()
            X.6iJ r4 = (X.C129756iJ) r4
            X.7KA r3 = new X.7KA
            r3.<init>(r2, r5)
            X.10I r2 = r4.A01
            r1 = 42
            X.AkY r0 = new X.AkY
            r0.<init>(r4, r3, r6, r1)
            r2.CGF(r0)
            return
        L_0x04c9:
            X.C18070vi.A11(r3)
            goto L_0x04de
        L_0x04cd:
            java.lang.Object r1 = r14.A01
            com.whatsapp.payments.ui.MessageWithLinkWebViewActivity r1 = (com.whatsapp.payments.ui.MessageWithLinkWebViewActivity) r1
            java.lang.String r4 = r14.A02
            java.lang.String r0 = r14.A03
            com.whatsapp.payments.ui.viewmodel.MessageWithLinkViewModel r3 = r1.A04
            if (r3 != 0) goto L_0x04e0
            java.lang.String r0 = "messageWithLinkViewModel"
        L_0x04db:
            X.C18070vi.A11(r0)
        L_0x04de:
            r0 = 0
            throw r0
        L_0x04e0:
            com.whatsapp.jid.UserJid r2 = X.C22941Dw.A02(r0)
            r0 = 0
            X.205 r1 = new X.205
            r1.<init>(r2, r4, r0)
            X.00H r0 = r3.A01
            X.206 r0 = X.AnonymousClass1W2.A01(r1, r0)
            r3.A00 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7Pq.run():void");
    }
}
