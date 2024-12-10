package X;

/* renamed from: X.4rn  reason: invalid class name and case insensitive filesystem */
public class C98834rn implements Runnable {
    public final int A00;
    public final Object A01;

    public C98834rn(C116655yP r1, int i) {
        this.A00 = i;
        if (18 - i != 0) {
            this.A01 = r1;
        } else {
            this.A01 = r1;
        }
    }

    public static void A00(AnonymousClass10I r1, Object obj, int i) {
        r1.CGN(new C98834rn(obj, i));
    }

    public static void A01(AnonymousClass10I r1, Object obj, int i) {
        r1.CGF(new C98834rn(obj, i));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:188:0x052a, code lost:
        r0.apply();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:189:0x052d, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:269:0x06e7, code lost:
        throw null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:280:0x0749, code lost:
        r3.postDelayed(r2, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:281:0x074c, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x01c1, code lost:
        com.whatsapp.util.Log.w(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x01c4, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x01e5, code lost:
        r2.A0J(new X.C98834rn((java.lang.Object) r3, r1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x01ed, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r21 = this;
            r1 = r21
            int r0 = r1.A00
            switch(r0) {
                case 0: goto L_0x06b4;
                case 1: goto L_0x068f;
                case 2: goto L_0x0669;
                case 3: goto L_0x0617;
                case 4: goto L_0x0589;
                case 5: goto L_0x057b;
                case 6: goto L_0x0571;
                case 7: goto L_0x02a3;
                case 8: goto L_0x0279;
                case 9: goto L_0x024c;
                case 10: goto L_0x0555;
                case 11: goto L_0x04fa;
                case 12: goto L_0x0208;
                case 13: goto L_0x046a;
                case 14: goto L_0x045e;
                case 15: goto L_0x0451;
                case 16: goto L_0x0445;
                case 17: goto L_0x0439;
                case 18: goto L_0x042f;
                case 19: goto L_0x0421;
                case 20: goto L_0x01ee;
                case 21: goto L_0x0411;
                case 22: goto L_0x03e9;
                case 23: goto L_0x03ca;
                case 24: goto L_0x03c0;
                case 25: goto L_0x03a8;
                case 26: goto L_0x01a0;
                case 27: goto L_0x0177;
                case 28: goto L_0x0088;
                case 29: goto L_0x038b;
                case 30: goto L_0x0359;
                case 31: goto L_0x070c;
                case 32: goto L_0x0007;
                case 33: goto L_0x0346;
                case 34: goto L_0x0007;
                case 35: goto L_0x033e;
                case 36: goto L_0x006e;
                case 37: goto L_0x0336;
                case 38: goto L_0x030a;
                case 39: goto L_0x0302;
                case 40: goto L_0x02f8;
                case 41: goto L_0x02ee;
                case 42: goto L_0x02e3;
                case 43: goto L_0x0052;
                case 44: goto L_0x02d9;
                case 45: goto L_0x02d1;
                case 46: goto L_0x02c9;
                case 47: goto L_0x02c1;
                case 48: goto L_0x0010;
                case 49: goto L_0x0011;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r0 = r1.A01
            X.4aY r0 = (X.AnonymousClass4aY) r0
            X.3Ub r0 = r0.A2X
            r0.A0U()
        L_0x0010:
            return
        L_0x0011:
            java.lang.Object r1 = r1.A01
            X.4aY r1 = (X.AnonymousClass4aY) r1
            X.AnonymousClass3MZ.A1S(r1)
            com.whatsapp.emoji.search.EmojiSearchKeyboardContainer r0 = r1.A39
            if (r0 == 0) goto L_0x0027
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x0027
            com.whatsapp.emoji.search.EmojiSearchKeyboardContainer r0 = r1.A39
            r0.A03()
        L_0x0027:
            com.whatsapp.expressionstray.ExpressionsTrayView r2 = r1.A3D
            if (r2 == 0) goto L_0x0010
            r0 = 11
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            r0 = 26
            java.lang.Integer r5 = java.lang.Integer.valueOf(r0)
            X.1BI r0 = r1.A3R
            java.lang.Integer r6 = X.A3P.A00(r0)
            r7 = 1
            r4 = 0
            r2.A0G(r3, r4, r5, r6, r7)
            X.AnonymousClass4aY.A19(r1)
            com.whatsapp.KeyboardPopupLayout r3 = r1.A1M
            r0 = 11
            X.4rj r2 = new X.4rj
            r2.<init>((X.AnonymousClass4aY) r1, (int) r0)
            r0 = 300(0x12c, double:1.48E-321)
            goto L_0x0749
        L_0x0052:
            java.lang.Object r3 = r1.A01
            X.4aY r3 = (X.AnonymousClass4aY) r3
            X.1Mc r2 = r3.A49
            X.1BI r1 = r3.A3R
            X.1EC r1 = (X.AnonymousClass1EC) r1
            X.5cQ r0 = r3.A2Q
            X.126 r0 = r0.getGroupChatManager()
            boolean r0 = X.C72463Mc.A1S(r0, r1, r2)
            if (r0 == 0) goto L_0x0010
            X.1KB r2 = r3.A1L
            r1 = 29
            goto L_0x01e5
        L_0x006e:
            java.lang.Object r2 = r1.A01
            X.4aY r2 = (X.AnonymousClass4aY) r2
            com.whatsapp.KeyboardPopupLayout r0 = r2.A1M
            boolean r0 = r0.A09
            if (r0 != 0) goto L_0x0010
            com.whatsapp.expressionstray.ExpressionsTrayView r0 = r2.A3D
            if (r0 == 0) goto L_0x06c0
            int r1 = r0.getVisibility()
            r0 = 8
            if (r1 != r0) goto L_0x06c0
            X.AnonymousClass4aY.A18(r2)
            return
        L_0x0088:
            java.lang.Object r0 = r1.A01
            X.4aY r0 = (X.AnonymousClass4aY) r0
            X.4ZY r2 = r0.A2R
            X.4PF r0 = r2.A03
            if (r0 != 0) goto L_0x0010
            X.1Nb r0 = r2.A0V
            X.1BI r3 = r2.A0U
            X.1yM r0 = r0.A0Z(r3)
            if (r0 != 0) goto L_0x00a0
            java.lang.String r0 = "setupNotificationActivityBanner cachedSettings is null"
            goto L_0x01c1
        L_0x00a0:
            X.202 r1 = r0.A09
            X.202 r0 = X.AnonymousClass202.SHOWING_RELEVANT
            if (r1 != r0) goto L_0x0010
            X.1bI r0 = r2.A0b
            android.view.View r11 = X.C72463Mc.A0N(r0)
            X.4JJ r0 = r2.A0E
            X.1EC r16 = X.AnonymousClass3MW.A0i(r3)
            X.1K2 r0 = r0.A00
            X.10E r1 = r0.A01
            X.0ve r14 = X.AnonymousClass10E.A8r(r1)
            X.10G r0 = r1.A00
            X.1np r19 = X.AnonymousClass3MY.A0e(r0)
            X.1L9 r12 = X.AnonymousClass3MZ.A0N(r1)
            X.1LU r15 = X.AnonymousClass3MY.A0Z(r1)
            X.10I r20 = X.AnonymousClass10E.AL1(r1)
            X.11C r13 = X.AnonymousClass3Ma.A0a(r1)
            X.00S r0 = r0.A55
            java.lang.Object r0 = r0.get()
            X.1pz r0 = (X.C37701pz) r0
            X.1Nb r18 = X.AnonymousClass3MZ.A11(r1)
            X.4PF r10 = new X.4PF
            r17 = r0
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            r2.A03 = r10
            X.01E r9 = r2.A0C
            r3 = 0
            X.C18070vi.A0d(r9, r3)
            android.view.View r5 = r10.A02
            r0 = 2131433201(0x7f0b16f1, float:1.848818E38)
            com.whatsapp.TextEmojiLabel r8 = X.AnonymousClass3MX.A0W(r5, r0)
            if (r8 == 0) goto L_0x0010
            X.1np r7 = r10.A07
            android.content.Context r6 = r8.getContext()
            android.content.Context r2 = r8.getContext()
            r1 = 2131893085(0x7f121b5d, float:1.9420937E38)
            java.lang.Object[] r0 = X.AnonymousClass3MW.A1a()
            java.lang.String r4 = "notification-settings"
            java.lang.String r2 = X.C17880vN.A0q(r2, r4, r0, r3, r1)
            r1 = 41
            X.4ra r0 = new X.4ra
            r0.<init>(r10, r9, r1)
            android.text.SpannableStringBuilder r1 = X.AnonymousClass3MY.A0A(r6, r7, r0, r2, r4)
            X.0ve r0 = r8.getAbProps()
            X.AnonymousClass3Ma.A1L(r0, r8)
            X.C72473Md.A1C(r8)
            r8.setText(r1)
            r5.setVisibility(r3)
            r0 = 2131433199(0x7f0b16ef, float:1.8488177E38)
            com.whatsapp.wds.components.button.WDSButton r1 = X.AnonymousClass3MW.A0r(r5, r0)
            r10.A00 = r1
            if (r1 == 0) goto L_0x0147
            r0 = 49
            X.C89914dE.A00(r1, r10, r0)
            r0 = 2131887446(0x7f120556, float:1.94095E38)
            r1.setText(r0)
            r0 = 2131232147(0x7f080593, float:1.8080395E38)
            r1.setIcon((int) r0)
            r1.setVisibility(r3)
        L_0x0147:
            r0 = 2131433200(0x7f0b16f0, float:1.8488179E38)
            com.whatsapp.wds.components.button.WDSButton r1 = X.AnonymousClass3MW.A0r(r5, r0)
            r10.A01 = r1
            if (r1 == 0) goto L_0x0164
            r0 = 2131899286(0x7f123396, float:1.9433514E38)
            r1.setText(r0)
            r0 = 2131231797(0x7f080435, float:1.8079685E38)
            r1.setIcon((int) r0)
            X.C89924dF.A00(r1, r10, r3)
            r1.setVisibility(r3)
        L_0x0164:
            com.whatsapp.wds.components.button.WDSButton r1 = r10.A01
            if (r1 == 0) goto L_0x016d
            X.1Xz r0 = X.C27881Xz.FILLED
            r1.setVariant(r0)
        L_0x016d:
            com.whatsapp.wds.components.button.WDSButton r1 = r10.A00
            if (r1 == 0) goto L_0x0010
            X.1Xz r0 = X.C27881Xz.OUTLINE
            r1.setVariant(r0)
            return
        L_0x0177:
            java.lang.Object r4 = r1.A01
            X.4aY r4 = (X.AnonymousClass4aY) r4
            X.1R3 r2 = r4.A31
            X.1BI r1 = r4.A3R
            r0 = 1
            X.206 r0 = r2.A06(r1, r0)
            if (r0 == 0) goto L_0x0010
            X.205 r1 = r0.A0v
            X.206 r0 = r4.A40
            X.205 r0 = r0.A0v
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0010
            boolean r0 = r4.A77
            if (r0 == 0) goto L_0x0010
            X.1iW r3 = r4.A1V
            X.1BI r2 = r4.A3R
            r1 = 1
            r0 = 0
            r3.A0X(r2, r1, r0)
            return
        L_0x01a0:
            java.lang.Object r3 = r1.A01
            X.4aY r3 = (X.AnonymousClass4aY) r3
            X.4ZY r5 = r3.A2R
            X.1E7 r0 = r3.A35
            X.1EC r4 = X.AnonymousClass3Ma.A0n(r0)
            r2 = 0
            if (r4 == 0) goto L_0x0010
            X.1Nb r1 = r5.A0V
            X.1BI r0 = r5.A0U
            X.1yM r0 = r1.A0Z(r0)
            if (r0 == 0) goto L_0x01c5
            boolean r0 = r0.A0A()
            if (r0 == 0) goto L_0x01c5
            java.lang.String r0 = "setupNotificationActivityBanner/skip banner when muted"
        L_0x01c1:
            com.whatsapp.util.Log.w((java.lang.String) r0)
            return
        L_0x01c5:
            X.2k0 r1 = r5.A0W
            X.126 r0 = r5.A0S
            X.1MZ r0 = r0.A0O
            boolean r0 = r0.A0O(r4)
            boolean r0 = r1.A00(r4, r0, r2)
            if (r0 == 0) goto L_0x0010
            X.0ve r2 = r5.A0Q
            r1 = 11087(0x2b4f, float:1.5536E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x0010
            X.1KB r2 = r3.A1L
            r1 = 28
        L_0x01e5:
            X.4rn r0 = new X.4rn
            r0.<init>((java.lang.Object) r3, (int) r1)
            r2.A0J(r0)
            return
        L_0x01ee:
            java.lang.Object r1 = r1.A01
            X.4qI r1 = (X.C97934qI) r1
            X.1Cd r0 = r1.A00
            r0.A06()
            boolean r0 = r0.A08
            if (r0 == 0) goto L_0x0010
            X.00H r0 = r1.A01
            java.lang.Object r1 = X.C18070vi.A0E(r0)
            X.2rh r1 = (X.C62622rh) r1
            r0 = 1
            r1.A04(r0)
            return
        L_0x0208:
            java.lang.Object r5 = r1.A01
            X.7Mo r5 = (X.C145777Mo) r5
            X.6uN r0 = r5.A0j
            X.11C r0 = r0.A02
            android.media.AudioManager r0 = r0.A0D()
            if (r0 == 0) goto L_0x022a
            r2 = 3
            int r0 = r0.getStreamVolume(r2)
            if (r0 != 0) goto L_0x022a
            X.1wy r1 = r5.A0k
            r0 = 0
            r1.A0E(r0)
            android.app.Activity r0 = r5.A09
            if (r0 == 0) goto L_0x022a
            r0.setVolumeControlStream(r2)
        L_0x022a:
            X.11C r0 = r5.A0d
            android.media.AudioManager r4 = r0.A0D()
            if (r4 == 0) goto L_0x0010
            android.media.AudioManager$OnAudioFocusChangeListener r3 = r5.A0D
            if (r3 != 0) goto L_0x023f
            X.1f4 r0 = r5.A0c
            X.75O r3 = new X.75O
            r3.<init>(r0)
            r5.A0D = r3
        L_0x023f:
            X.22l r0 = r5.A0K
            int r2 = r0.A09
            r1 = 1
            r0 = 3
            if (r2 != r1) goto L_0x0248
            r1 = 3
        L_0x0248:
            r4.requestAudioFocus(r3, r0, r1)
            return
        L_0x024c:
            java.lang.Object r4 = r1.A01
            X.7Mo r4 = (X.C145777Mo) r4
            X.C145777Mo.A04(r4)
            android.hardware.SensorManager r0 = r4.A0C
            if (r0 != 0) goto L_0x0010
            X.11C r0 = r4.A0d
            android.hardware.SensorManager r1 = r0.A0A()
            r4.A0C = r1
            if (r1 == 0) goto L_0x0010
            r0 = 8
            android.hardware.Sensor r3 = r1.getDefaultSensor(r0)
            r4.A0A = r3
            if (r3 == 0) goto L_0x0010
            X.CyH r2 = new X.CyH
            r2.<init>(r4, r4)
            r4.A0B = r2
            android.hardware.SensorManager r1 = r4.A0C
            r0 = 2
            r1.registerListener(r2, r3, r0)
            return
        L_0x0279:
            java.lang.Object r3 = r1.A01
            com.whatsapp.conversation.conversationrow.link.LinkLongPressBottomSheet r3 = (com.whatsapp.conversation.conversationrow.link.LinkLongPressBottomSheet) r3
            r4 = 0
            X.1W6 r2 = r3.A06
            if (r2 == 0) goto L_0x06c7
            X.0vl r0 = r3.A09
            java.lang.Object r1 = r0.getValue()
            X.205 r1 = (X.AnonymousClass205) r1
            X.1W2 r0 = r2.A01
            X.206 r0 = r0.A05(r1)
            if (r0 == 0) goto L_0x0010
            X.A5M r3 = r3.A02
            if (r3 == 0) goto L_0x06c4
            java.util.List r2 = X.C18070vi.A0M(r0)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r4)
            r0 = 6
            r3.A05(r1, r2, r0)
            return
        L_0x02a3:
            java.lang.Object r0 = r1.A01
            X.8Ce r0 = (X.C161198Ce) r0
            java.lang.Object r1 = r0.A01
            X.4Zw r1 = (X.C88484Zw) r1
            X.C88484Zw.A01(r1)
            X.4Q7 r0 = r1.A02
            com.whatsapp.conversation.conversationrow.InteractiveMessageView r0 = r0.A00
            com.whatsapp.conversation.conversationrow.InteractiveMessageView.A02(r0)
            X.4LK r0 = r1.A01
            if (r0 == 0) goto L_0x0010
            android.view.View r1 = r0.A00
            r0 = 8
            r1.setVisibility(r0)
            return
        L_0x02c1:
            java.lang.Object r0 = r1.A01
            X.4aY r0 = (X.AnonymousClass4aY) r0
            X.C72463Mc.A1C(r0)
            return
        L_0x02c9:
            java.lang.Object r0 = r1.A01
            X.4aY r0 = (X.AnonymousClass4aY) r0
            X.AnonymousClass4aY.A0z(r0)
            return
        L_0x02d1:
            java.lang.Object r0 = r1.A01
            X.4aY r0 = (X.AnonymousClass4aY) r0
            X.AnonymousClass4aY.A0t(r0)
            return
        L_0x02d9:
            java.lang.Object r0 = r1.A01
            X.4aY r0 = (X.AnonymousClass4aY) r0
            android.widget.ImageButton r0 = r0.A0X
            r0.performClick()
            return
        L_0x02e3:
            java.lang.Object r2 = r1.A01
            X.4aY r2 = (X.AnonymousClass4aY) r2
            r1 = 0
            X.4PL r0 = r2.A29
            r2.A2o(r0, r1, r1)
            return
        L_0x02ee:
            java.lang.Object r0 = r1.A01
            X.4LT r0 = (X.AnonymousClass4LT) r0
            X.4aY r0 = r0.A00
            X.AnonymousClass4aY.A1E(r0)
            return
        L_0x02f8:
            java.lang.Object r0 = r1.A01
            X.4LT r0 = (X.AnonymousClass4LT) r0
            X.4aY r0 = r0.A00
            r0.A2L()
            return
        L_0x0302:
            java.lang.Object r0 = r1.A01
            X.4kS r0 = (X.C94334kS) r0
            r0.C2D()
            return
        L_0x030a:
            java.lang.Object r1 = r1.A01
            X.4aY r1 = (X.AnonymousClass4aY) r1
            X.5cQ r0 = r1.A2Q
            if (r0 == 0) goto L_0x0326
            X.1Bd r0 = r0.getStartupTracker()
            if (r0 == 0) goto L_0x0321
            X.5cQ r0 = r1.A2Q
            X.1Bd r0 = r0.getStartupTracker()
            r0.A03()
        L_0x0321:
            X.5cQ r0 = r1.A2Q
            r0.CFa()
        L_0x0326:
            X.4PK r0 = X.AnonymousClass3Ma.A0Z(r1)
            X.00H r0 = r0.A00
            java.lang.Object r0 = r0.get()
            X.739 r0 = (X.AnonymousClass739) r0
            r0.A02()
            return
        L_0x0336:
            java.lang.Object r0 = r1.A01
            X.1cr r0 = (X.C29781cr) r0
            r0.A01()
            return
        L_0x033e:
            java.lang.Object r0 = r1.A01
            X.4aY r0 = (X.AnonymousClass4aY) r0
            r0.A2N()
            return
        L_0x0346:
            java.lang.Object r0 = r1.A01
            X.4aY r0 = (X.AnonymousClass4aY) r0
            X.0z4 r0 = r0.A2j
            r2 = 0
            android.content.SharedPreferences$Editor r1 = X.C19830z4.A00(r0)
            java.lang.String r0 = "newsletter_message_received"
            android.content.SharedPreferences$Editor r0 = r1.putBoolean(r0, r2)
            goto L_0x052a
        L_0x0359:
            java.lang.Object r4 = r1.A01
            X.4aY r4 = (X.AnonymousClass4aY) r4
            X.1iW r3 = r4.A1V
            X.1BI r2 = r4.A3R
            r1 = 1
            r0 = 0
            r3.A0X(r2, r1, r0)
            X.1Ln r1 = r4.A36
            X.1BI r0 = r4.A3R
            com.whatsapp.jid.PhoneUserJid r0 = (com.whatsapp.jid.PhoneUserJid) r0
            X.1E1 r2 = r1.A0A(r0)
            X.1LU r1 = r4.A3Q
            X.1FY r0 = X.AnonymousClass3MW.A0Q(r4)
            android.content.Intent r2 = X.AnonymousClass3MY.A06(r0, r1, r2)
            X.2Qs r0 = X.C49502Qs.GENERAL
            java.lang.String r1 = r0.origin
            java.lang.String r0 = "chat_origin"
            r2.putExtra(r0, r1)
            X.1FY r0 = X.AnonymousClass3MW.A0Q(r4)
            r0.startActivity(r2)
            return
        L_0x038b:
            java.lang.Object r0 = r1.A01
            X.4aY r0 = (X.AnonymousClass4aY) r0
            X.5cQ r3 = r0.A2Q
            X.1BI r2 = r0.A3R
            java.lang.String r0 = "groupJid"
            android.os.Bundle r1 = X.C72463Mc.A0J(r2)
            X.AnonymousClass3MY.A15(r1, r2, r0)
            com.whatsapp.safetycheck.ui.SafetyCheckBottomSheet r0 = new com.whatsapp.safetycheck.ui.SafetyCheckBottomSheet
            r0.<init>()
            r0.A1R(r1)
            r3.CMl(r0)
            return
        L_0x03a8:
            java.lang.Object r2 = r1.A01
            X.4aY r2 = (X.AnonymousClass4aY) r2
            X.4X5 r0 = X.AnonymousClass3Ma.A0Y(r2)
            X.00H r0 = r0.A0J
            java.lang.Object r1 = r0.get()
            X.9lv r1 = (X.C191039lv) r1
            X.1BI r0 = r2.A3R
            X.1ch r0 = (X.C29681ch) r0
            r1.A00(r0)
            return
        L_0x03c0:
            java.lang.Object r0 = r1.A01
            X.4aY r0 = (X.AnonymousClass4aY) r0
            X.3TA r0 = r0.A2d
            r0.A0T()
            return
        L_0x03ca:
            java.lang.Object r2 = r1.A01
            X.4aY r2 = (X.AnonymousClass4aY) r2
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "conversation/stop/release "
            r1.append(r0)
            int r0 = android.database.sqlite.SQLiteDatabase.releaseMemory()
            r1.append(r0)
            java.lang.String r0 = " jid="
            r1.append(r0)
            X.1BI r0 = r2.A3R
            X.C17900vP.A0b(r0, r1)
            return
        L_0x03e9:
            java.lang.Object r2 = r1.A01
            X.4aY r2 = (X.AnonymousClass4aY) r2
            X.00H r0 = r2.A6A
            java.lang.Object r1 = r0.get()
            X.4LX r1 = (X.AnonymousClass4LX) r1
            X.5cQ r5 = r2.A2Q
            android.view.ViewGroup r3 = r2.A0R
            androidx.appcompat.widget.Toolbar r4 = r2.A0f
            int r7 = r2.A05
            r0 = 0
            X.C18070vi.A0d(r5, r0)
            X.00H r0 = r1.A00
            java.lang.Object r2 = r0.get()
            X.4Qi r2 = (X.C86134Qi) r2
            java.lang.Integer r6 = X.AnonymousClass00R.A01
            r8 = 3000(0xbb8, double:1.482E-320)
            r2.A00(r3, r4, r5, r6, r7, r8)
            return
        L_0x0411:
            java.lang.Object r0 = r1.A01
            X.4qI r0 = (X.C97934qI) r0
            X.00H r0 = r0.A01
            java.lang.Object r0 = r0.get()
            X.2rh r0 = (X.C62622rh) r0
            r0.A01()
            return
        L_0x0421:
            java.lang.Object r0 = r1.A01
            X.5yP r0 = (X.C116655yP) r0
            X.1KB r2 = r0.A02
            r1 = 0
            r0 = 2131886670(0x7f12024e, float:1.9407925E38)
            r2.A07(r1, r0)
            return
        L_0x042f:
            java.lang.Object r0 = r1.A01
            X.5yP r0 = (X.C116655yP) r0
            X.1KB r0 = r0.A02
            r0.A04()
            return
        L_0x0439:
            java.lang.Object r0 = r1.A01
            X.4S9 r0 = (X.AnonymousClass4S9) r0
            X.1Lg r1 = r0.A02
            X.1WR r0 = r0.A01
            r1.unregisterObserver(r0)
            return
        L_0x0445:
            java.lang.Object r0 = r1.A01
            X.3vF r0 = (X.C79333vF) r0
            X.1QB r1 = r0.A0A
            X.1jz r0 = r0.A0F
            r1.A0N(r0)
            return
        L_0x0451:
            java.lang.Object r1 = r1.A01
            com.whatsapp.conversation.conversationrow.message.MessageDetailsActivity r1 = (com.whatsapp.conversation.conversationrow.message.MessageDetailsActivity) r1
            android.widget.BaseAdapter r0 = r1.A01
            r0.notifyDataSetChanged()
            com.whatsapp.conversation.conversationrow.message.MessageDetailsActivity.A03(r1)
            return
        L_0x045e:
            java.lang.Object r2 = r1.A01
            com.whatsapp.conversation.conversationrow.message.MessageDetailsActivity r2 = (com.whatsapp.conversation.conversationrow.message.MessageDetailsActivity) r2
            X.18O r1 = r2.A06
            X.206 r0 = r2.A0Q
            com.whatsapp.conversation.conversationrow.googlesearch.GoogleSearchDialogFragment.A00(r2, r1, r0)
            return
        L_0x046a:
            java.lang.Object r7 = r1.A01
            com.whatsapp.conversation.conversationrow.message.MessageDetailsActivity r7 = (com.whatsapp.conversation.conversationrow.message.MessageDetailsActivity) r7
            java.lang.Boolean r10 = X.AnonymousClass000.A0i()
            X.0zA r1 = r7.A03
            boolean r0 = r1.A07()
            r3 = 0
            if (r0 == 0) goto L_0x0485
            r1.A03()
            java.lang.String r0 = "isEligible"
            java.lang.NullPointerException r0 = X.AnonymousClass000.A0s(r0)
            throw r0
        L_0x0485:
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r3)
            X.206 r0 = r7.A0Q
            X.205 r0 = r0.A0v
            X.1BI r9 = r0.A00
            java.util.List r6 = java.util.Collections.singletonList(r0)
            X.206 r0 = r7.A0Q
            int r0 = r0.A0u
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.util.Set r0 = java.util.Collections.singleton(r0)
            java.util.ArrayList r5 = X.C17880vN.A10(r0)
            X.206 r2 = r7.A0Q
            int r1 = r2.A0u
            r0 = 3
            if (r1 != r0) goto L_0x04f7
            X.21V r2 = (X.AnonymousClass21V) r2
            int r0 = r2.A0D
            long r0 = X.C17890vO.A03(r0)
        L_0x04b2:
            java.lang.Long r4 = java.lang.Long.valueOf(r0)
            X.206 r1 = r7.A0Q
            int r0 = r1.A0u
            if (r0 != 0) goto L_0x04c7
            java.lang.String r0 = r1.A0P()
            X.C17960vV.A07(r0)
            int r3 = r0.length()
        L_0x04c7:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.String r0 = "com.whatsapp.contact.picker.ContactPicker"
            android.content.Intent r2 = X.C72473Md.A0B(r7, r0)
            java.lang.String r1 = "source_surface"
            r0 = 4
            r2.putExtra(r1, r0)
            X.C72483Me.A0h(r2, r9, r5, r10)
            if (r4 == 0) goto L_0x04e1
            java.lang.String r0 = "forward_video_duration"
            r2.putExtra(r0, r4)
        L_0x04e1:
            if (r3 == 0) goto L_0x04e8
            java.lang.String r0 = "forward_text_length"
            r2.putExtra(r0, r3)
        L_0x04e8:
            if (r6 == 0) goto L_0x04ed
            X.AnonymousClass4aU.A08(r2, r6)
        L_0x04ed:
            java.lang.String r0 = "show_ad_creation"
            r2.putExtra(r0, r8)
            r0 = 2
            r7.startActivityForResult(r2, r0)
            return
        L_0x04f7:
            r0 = 0
            goto L_0x04b2
        L_0x04fa:
            java.lang.Object r2 = r1.A01
            X.7Mo r2 = (X.C145777Mo) r2
            X.22l r0 = r2.A0K
            X.205 r0 = r0.A0v
            X.1BI r1 = r0.A00
            boolean r0 = X.C22971Dz.A0N(r1)
            r7 = 1
            if (r0 == 0) goto L_0x052e
            X.1L1 r6 = r2.A0f
            X.0z4 r5 = r6.A01
            r6.A00(r5)
            android.content.SharedPreferences r4 = r6.A00
            java.lang.String r3 = "ptt_fast_playback_broadcast"
        L_0x0517:
            long r1 = X.C17890vO.A05(r4, r3)
            long r1 = r1 + r7
            r6.A00(r5)
            android.content.SharedPreferences$Editor r0 = r4.edit()
            X.C18070vi.A0X(r0)
            android.content.SharedPreferences$Editor r0 = r0.putLong(r3, r1)
        L_0x052a:
            r0.apply()
            return
        L_0x052e:
            boolean r0 = X.C22971Dz.A0e(r1)
            if (r0 == 0) goto L_0x0540
            X.1L1 r6 = r2.A0f
            X.0z4 r5 = r6.A01
            r6.A00(r5)
            android.content.SharedPreferences r4 = r6.A00
            java.lang.String r3 = "ptt_fast_playback_group"
            goto L_0x0517
        L_0x0540:
            boolean r0 = X.C22971Dz.A0S(r1)
            X.1L1 r6 = r2.A0f
            X.0z4 r5 = r6.A01
            r6.A00(r5)
            android.content.SharedPreferences r4 = r6.A00
            if (r0 == 0) goto L_0x0552
            java.lang.String r3 = "ptt_fast_playback_interop"
            goto L_0x0517
        L_0x0552:
            java.lang.String r3 = "ptt_fast_playback_individual"
            goto L_0x0517
        L_0x0555:
            java.lang.Object r3 = r1.A01
            X.7Mo r3 = (X.C145777Mo) r3
            int r0 = X.C145777Mo.A15
            android.hardware.SensorManager r2 = r3.A0C
            if (r2 == 0) goto L_0x056d
            android.hardware.SensorEventListener r1 = r3.A0B
            if (r1 == 0) goto L_0x056d
            android.hardware.Sensor r0 = r3.A0A
            if (r0 == 0) goto L_0x056d
            r2.unregisterListener(r1, r0)
            r0 = 0
            r3.A0C = r0
        L_0x056d:
            X.C145777Mo.A05(r3)
            return
        L_0x0571:
            java.lang.Object r0 = r1.A01
            X.4Zw r0 = (X.C88484Zw) r0
            android.os.CountDownTimer r0 = r0.A00
            r0.start()
            return
        L_0x057b:
            java.lang.Object r0 = r1.A01
            X.2jR r0 = (X.C57662jR) r0
            X.1KB r2 = r0.A00
            r1 = 2131891165(0x7f1213dd, float:1.9417042E38)
            r0 = 1
            r2.A06(r1, r0)
            return
        L_0x0589:
            java.lang.Object r4 = r1.A01
            X.3Ts r4 = (X.AnonymousClass3Ts) r4
            r2 = 0
            X.C18070vi.A0d(r4, r2)
            X.1M9 r7 = r4.A02
            X.1EC r6 = r4.A06
            X.1E7 r1 = r7.A0H(r6)
            X.1BI r0 = r4.A05
            if (r0 == 0) goto L_0x05d3
            X.1E7 r0 = r7.A0H(r0)
            X.2lf r0 = r0.A0H
            boolean r13 = X.AnonymousClass000.A1W(r0)
        L_0x05a7:
            com.whatsapp.jid.UserJid r5 = r1.A0K
            java.lang.String r0 = r1.A0X
            r9 = 0
            if (r0 == 0) goto L_0x05d1
            long r0 = java.lang.Long.parseLong(r0)
            java.lang.Long r11 = java.lang.Long.valueOf(r0)
        L_0x05b6:
            X.11S r0 = r4.A01
            boolean r0 = r0.A0O(r5)
            java.lang.String r3 = "null cannot be cast to non-null type androidx.lifecycle.MutableLiveData<com.whatsapp.conversation.conversationrow.components.contextcard.GroupNonCreatorContextCardSubtitleViewModel.SubtitleUiState>"
            if (r0 == 0) goto L_0x05d5
            X.1DS r0 = r4.A00
            X.C18070vi.A0z(r0, r3)
            r14 = 1
            r12 = r9
            X.4V1 r8 = new X.4V1
            r10 = r9
            r8.<init>(r9, r10, r11, r12, r13, r14)
            r0.A0E(r8)
            return
        L_0x05d1:
            r11 = r9
            goto L_0x05b6
        L_0x05d3:
            r13 = 1
            goto L_0x05a7
        L_0x05d5:
            r8 = 0
            if (r5 == 0) goto L_0x05e6
            X.1E7 r5 = r7.A0H(r5)
            X.1Me r1 = r4.A03
            int r0 = r1.A0A(r6)
            java.lang.String r9 = r1.A0U(r5, r0, r2)
        L_0x05e6:
            X.1MW r0 = r4.A04
            X.2tp r0 = r0.A0B(r6)
            int r6 = r0.A06()
            X.10f r0 = r0.A08()
            X.C18070vi.A0X(r0)
            java.util.ArrayList r5 = X.AnonymousClass000.A13()
            java.util.Iterator r1 = r0.iterator()
        L_0x05ff:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x06e8
            java.lang.Object r0 = r1.next()
            X.2sr r0 = (X.C63312sr) r0
            com.whatsapp.jid.UserJid r0 = r0.A04
            X.1E7 r0 = r7.A0E(r0)
            if (r0 == 0) goto L_0x05ff
            r5.add(r0)
            goto L_0x05ff
        L_0x0617:
            java.lang.Object r4 = r1.A01
            X.3UI r4 = (X.AnonymousClass3UI) r4
            r0 = 0
            X.C18070vi.A0d(r4, r0)
            X.1M9 r0 = r4.A01
            X.1EC r3 = r4.A03
            X.1E7 r1 = r0.A0H(r3)
            X.1yX r0 = r1.A0M
            if (r0 == 0) goto L_0x0648
            java.lang.String r2 = r0.A03
            if (r2 == 0) goto L_0x0648
            int r0 = r2.length()
            if (r0 == 0) goto L_0x0648
            java.lang.Integer r1 = X.AnonymousClass00R.A00
            r0 = 1
            X.4U9 r3 = new X.4U9
            r3.<init>(r2, r1, r0)
        L_0x063d:
            X.1DS r1 = r4.A00
            java.lang.String r0 = "null cannot be cast to non-null type androidx.lifecycle.MutableLiveData<com.whatsapp.conversation.conversationrow.components.contextcard.GroupDescriptionConversationRowViewModel.UiState>"
            X.C18070vi.A0z(r1, r0)
            r1.A0E(r3)
            return
        L_0x0648:
            X.1MZ r0 = r4.A02
            boolean r0 = r0.A0J(r3)
            if (r0 == 0) goto L_0x065e
            java.lang.Integer r2 = X.AnonymousClass00R.A01
            boolean r0 = r1.A13
            r1 = r0 ^ 1
            java.lang.String r0 = ""
            X.4U9 r3 = new X.4U9
            r3.<init>(r0, r2, r1)
            goto L_0x063d
        L_0x065e:
            java.lang.Integer r2 = X.AnonymousClass00R.A0C
            java.lang.String r1 = ""
            r0 = 1
            X.4U9 r3 = new X.4U9
            r3.<init>(r1, r2, r0)
            goto L_0x063d
        L_0x0669:
            java.lang.Object r2 = r1.A01
            com.whatsapp.conversation.conversationrow.components.contextcard.GroupDescriptionAddUpsellViewModel r2 = (com.whatsapp.conversation.conversationrow.components.contextcard.GroupDescriptionAddUpsellViewModel) r2
            X.1M9 r1 = r2.A02
            X.1EC r0 = r2.A03
            X.1E7 r1 = r1.A0H(r0)
            X.1DS r2 = r2.A00
            java.lang.String r0 = "null cannot be cast to non-null type androidx.lifecycle.MutableLiveData<com.whatsapp.conversation.conversationrow.components.contextcard.GroupDescriptionAddUpsellViewModel.DialogUiState>"
            X.C18070vi.A0z(r2, r0)
            X.1yX r0 = r1.A0M
            if (r0 == 0) goto L_0x0684
            java.lang.String r1 = r0.A03
            if (r1 != 0) goto L_0x0686
        L_0x0684:
            java.lang.String r1 = ""
        L_0x0686:
            X.CZs r0 = new X.CZs
            r0.<init>(r1)
            r2.A0E(r0)
            return
        L_0x068f:
            java.lang.Object r3 = r1.A01
            X.3UH r3 = (X.AnonymousClass3UH) r3
            r0 = 0
            X.C18070vi.A0d(r3, r0)
            X.1M9 r0 = r3.A01
            X.1EC r1 = r3.A03
            r0.A0H(r1)
            X.1MW r0 = r3.A02
            int r2 = r0.A09(r1)
            X.1DS r1 = r3.A00
            java.lang.String r0 = "null cannot be cast to non-null type androidx.lifecycle.MutableLiveData<com.whatsapp.conversation.conversationrow.components.contextcard.GroupCreatorContextCardSubtitleViewModel.SubtitleUiState>"
            X.C18070vi.A0z(r1, r0)
            X.4Sj r0 = new X.4Sj
            r0.<init>(r2)
            r1.A0E(r0)
            return
        L_0x06b4:
            java.lang.Object r1 = r1.A01
            X.3Ut r1 = (X.AnonymousClass3Ut) r1
            r0 = 0
            X.C18070vi.A0d(r1, r0)
            X.AnonymousClass3Ut.A00(r1)
            return
        L_0x06c0:
            X.AnonymousClass4aY.A1A(r2)
            return
        L_0x06c4:
            java.lang.String r0 = "bizIntegrityLogger"
            goto L_0x06c9
        L_0x06c7:
            java.lang.String r0 = "fMessageDatabase"
        L_0x06c9:
            X.C18070vi.A11(r0)
            goto L_0x06e6
        L_0x06cd:
            java.util.Iterator r1 = r5.iterator()
        L_0x06d1:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x06f2
            X.1E7 r0 = X.C17880vN.A0O(r1)
            X.2lf r0 = r0.A0H
            if (r0 == 0) goto L_0x06d1
            int r8 = r8 + 1
            if (r8 >= 0) goto L_0x06d1
            X.AnonymousClass1ZU.A0A()
        L_0x06e6:
            r0 = 0
            throw r0
        L_0x06e8:
            boolean r0 = r5 instanceof java.util.Collection
            if (r0 == 0) goto L_0x06cd
            boolean r0 = r5.isEmpty()
            if (r0 == 0) goto L_0x06cd
        L_0x06f2:
            X.1DS r0 = r4.A00
            X.C18070vi.A0z(r0, r3)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r6)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r8)
            X.4V1 r3 = new X.4V1
            r6 = r11
            r7 = r9
            r8 = r13
            r9 = r2
            r3.<init>(r4, r5, r6, r7, r8, r9)
            r0.A0E(r3)
            return
        L_0x070c:
            java.lang.Object r5 = r1.A01
            X.4aY r5 = (X.AnonymousClass4aY) r5
            com.google.android.material.bottomsheet.BottomSheetBehavior r1 = r5.A0i
            r0 = 5
            r1.A0W(r0)
            com.whatsapp.emoji.search.EmojiSearchKeyboardContainer r4 = r5.A39
            X.1FY r3 = X.AnonymousClass3MW.A0P(r5)
            X.67r r2 = r5.A37
            r0 = 0
            X.4n2 r1 = new X.4n2
            r1.<init>(r5, r0)
            X.4my r0 = new X.4my
            r0.<init>(r5)
            r4.A04(r3, r2, r0, r1)
            com.whatsapp.emoji.search.EmojiSearchKeyboardContainer r0 = r5.A39
            com.whatsapp.InterceptingEditText r2 = r0.A04
            if (r2 == 0) goto L_0x0738
            r1 = 0
            r0 = 64
            r2.performAccessibilityAction(r0, r1)
        L_0x0738:
            com.whatsapp.KeyboardPopupLayout r3 = r5.A1M
            r0 = 35
            X.4rn r2 = new X.4rn
            r2.<init>((java.lang.Object) r5, (int) r0)
            r1 = 1120403456(0x42c80000, float:100.0)
            float r0 = X.AnonymousClass4aY.A00(r5)
            float r0 = r0 * r1
            long r0 = (long) r0
        L_0x0749:
            r3.postDelayed(r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C98834rn.run():void");
    }

    public C98834rn(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }
}
