package X;

/* renamed from: X.4mU  reason: invalid class name and case insensitive filesystem */
public class C95594mU implements C107305Ze {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final boolean A03;

    public C95594mU(Object obj, Object obj2, int i, boolean z) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
        this.A03 = z;
    }

    /* JADX WARNING: type inference failed for: r6v33, types: [X.2jx, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r7v31, types: [X.A7D, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x02ba, code lost:
        if (X.C72473Md.A08(r4) == 2) goto L_0x02bc;
     */
    /* JADX WARNING: Removed duplicated region for block: B:164:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:165:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x01f4  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0219  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void Bkp() {
        /*
            r34 = this;
            r1 = r34
            int r0 = r1.A00
            if (r0 == 0) goto L_0x0380
            java.lang.Object r4 = r1.A01
            X.4aY r4 = (X.AnonymousClass4aY) r4
            boolean r9 = r1.A03
            java.lang.Object r5 = r1.A02
            X.4PL r5 = (X.AnonymousClass4PL) r5
            com.whatsapp.mentions.MentionableEntry r0 = r4.A3Z
            if (r0 == 0) goto L_0x037d
            java.lang.String r1 = r0.getStringText()
            boolean r0 = r4.A6i
            java.lang.String r3 = X.C26302CxJ.A0G(r1, r0)
        L_0x001e:
            r2 = r3
            boolean r0 = X.AnonymousClass4aY.A27(r4)
            r10 = 0
            r1 = 0
            if (r0 == 0) goto L_0x002b
            X.AnonymousClass4aY.A1f(r4, r10, r1, r1, r1)
        L_0x002a:
            return
        L_0x002b:
            X.00H r0 = r4.A4s
            X.1pj r6 = X.AnonymousClass3MW.A0V(r0)
            X.1E7 r0 = r4.A35
            com.whatsapp.jid.UserJid r0 = X.AnonymousClass3MZ.A0x(r0)
            boolean r0 = r6.A0P(r0)
            if (r0 == 0) goto L_0x0047
            X.1FY r1 = X.AnonymousClass3MW.A0P(r4)
            r0 = 106(0x6a, float:1.49E-43)
        L_0x0043:
            X.AnonymousClass4Yv.A01(r1, r0)
            return
        L_0x0047:
            X.74M r8 = r4.A4h
            r7 = 8
            r0 = 1
            if (r8 == 0) goto L_0x00bd
            X.72K r6 = r8.A0J
            if (r6 == 0) goto L_0x007e
            boolean r1 = r4.A6g
            r8.A0Z(r0, r1)
            X.02B r0 = r4.A0e
            if (r0 == 0) goto L_0x0060
            android.view.View r0 = r4.A0D
            r0.setVisibility(r7)
        L_0x0060:
            boolean r0 = r5.A0f
            if (r0 == 0) goto L_0x002a
            java.lang.String r0 = r5.A0Q
            boolean r0 = X.AnonymousClass026.A00(r0, r3)
            if (r0 != 0) goto L_0x0071
            X.4Xm r0 = r4.A3H
            r0.A00()
        L_0x0071:
            X.4Xm r2 = r4.A3H
            r0 = 1
            X.4fO r1 = new X.4fO
            r1.<init>(r0)
            r0 = 4
            r2.A01(r1, r0)
            return
        L_0x007e:
            boolean r6 = r8.A0a()
            if (r6 == 0) goto L_0x00bd
            X.74M r6 = r4.A4h
            java.io.File r6 = r6.A0K
            if (r6 == 0) goto L_0x00bd
            X.0ve r6 = r4.A3F
            if (r6 == 0) goto L_0x0096
            X.0vf r2 = X.C18040vf.A01
            r1 = 12409(0x3079, float:1.7389E-41)
            boolean r1 = X.C18020vd.A05(r2, r6, r1)
        L_0x0096:
            X.74M r8 = r4.A4h
            boolean r7 = r4.A6g
            if (r1 == 0) goto L_0x00a6
            r1 = 0
            X.7OC r0 = new X.7OC
            r0.<init>(r4, r1)
            r8.A0S(r0, r7)
            goto L_0x0060
        L_0x00a6:
            java.io.File r1 = r8.A0K
            if (r1 == 0) goto L_0x00b7
            java.lang.String r6 = r1.getName()
            java.io.File r1 = r8.A0K
            long r1 = r1.length()
            r8.A0R(r1, r6, r7)
        L_0x00b7:
            X.74M r1 = r4.A4h
            r1.A0X(r0)
            goto L_0x0060
        L_0x00bd:
            boolean r6 = X.AnonymousClass4aY.A1z(r4)
            if (r6 != 0) goto L_0x00dc
            X.5cQ r6 = r4.A2Q
            X.11C r8 = r6.getSystemServices()
            X.0vc r6 = r4.A3x
            boolean r6 = X.C26302CxJ.A0V(r8, r6, r3)
            if (r6 != 0) goto L_0x00dc
            X.1KB r2 = X.AnonymousClass3MX.A0U(r4)
            r1 = 2131887925(0x7f120735, float:1.941047E38)
            r2.A08(r1, r0)
            return
        L_0x00dc:
            r8 = 65536(0x10000, float:9.18355E-41)
            if (r9 == 0) goto L_0x0124
            java.lang.String r2 = X.AnonymousClass1EG.A0E(r3, r8)
        L_0x00e4:
            X.3TA r6 = r4.A2d
            r6.A0b(r10)
            android.view.ViewGroup r6 = r4.A0V
            r6.setVisibility(r7)
            android.view.ViewGroup r6 = r4.A0S
            r6.setVisibility(r7)
            boolean r6 = X.AnonymousClass4ZT.A01(r4)
            if (r6 != 0) goto L_0x00ff
            r6 = 2131231611(0x7f08037b, float:1.8079308E38)
            r4.A2g(r6)
        L_0x00ff:
            android.view.ViewGroup r6 = r4.A0T
            if (r6 == 0) goto L_0x0106
            r6.setVisibility(r7)
        L_0x0106:
            if (r2 == 0) goto L_0x0239
            int r6 = r2.length()
            if (r6 <= 0) goto L_0x0239
            X.1E7 r8 = r4.A35
            if (r8 == 0) goto L_0x0138
            X.AEW r7 = r4.A1t
            if (r7 == 0) goto L_0x0138
            boolean r6 = r4.A6b
            if (r6 != 0) goto L_0x0138
            boolean r6 = r4.A6x
            if (r6 == 0) goto L_0x0138
            X.AnonymousClass4aY.A0X(r7, r4)
            r4.A6b = r0
            return
        L_0x0124:
            if (r3 == 0) goto L_0x00e4
            int r6 = r3.length()
            int r6 = r3.codePointCount(r1, r6)
            if (r6 <= r8) goto L_0x00e4
            X.1FY r1 = X.AnonymousClass3MW.A0P(r4)
            r0 = 17
            goto L_0x0043
        L_0x0138:
            java.util.HashMap r7 = X.AnonymousClass4aY.A8L
            com.whatsapp.jid.Jid r6 = X.AnonymousClass3MW.A0g(r8)
            boolean r6 = r7.containsKey(r6)
            if (r6 == 0) goto L_0x0215
            X.AnonymousClass4aY.A0m(r4)
            X.3TA r6 = r4.A2d
            X.7Fe r9 = r6.A00
            boolean r6 = r9 instanceof X.C75373hL
            if (r6 == 0) goto L_0x020a
            X.4Rp r8 = r4.A2a
            X.3hL r9 = (X.C75373hL) r9
            X.4Xd r7 = r4.A2p
            boolean r6 = r4.A6Y
            X.Abv r20 = r8.A00(r9, r7, r6)
            X.3TA r6 = r4.A2d
            r6.A0a(r10)
            X.AnonymousClass4aY.A1h(r4, r0)
        L_0x0163:
            X.3VQ r6 = r4.A2b
            X.206 r6 = r6.A0G
            boolean r6 = r6 instanceof X.AnonymousClass22Q
            if (r6 == 0) goto L_0x01d5
            X.A8Q r6 = X.C72463Mc.A0Z(r4)
            boolean r6 = r6.A04
            if (r6 == 0) goto L_0x01d5
            X.3VQ r6 = r4.A2b
            X.206 r9 = r6.A0G
            X.22Q r9 = (X.AnonymousClass22Q) r9
            X.A8Q r8 = X.C72463Mc.A0Z(r4)
            X.A7D r7 = new X.A7D
            r7.<init>()
            X.A8Q r6 = X.C72463Mc.A0Z(r4)
            java.lang.String r6 = r6.A03
            r7.A0B = r6
            X.A8Q r6 = X.C72463Mc.A0Z(r4)
            java.util.concurrent.atomic.AtomicInteger r6 = r6.A0D
            int r6 = r6.get()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r7.A05 = r6
            X.A8Q r6 = X.C72463Mc.A0Z(r4)
            java.lang.String r6 = r6.A01
            r7.A0E = r6
            X.A8Q r6 = X.C72463Mc.A0Z(r4)
            java.lang.String r6 = r6.A02
            r7.A0F = r6
            X.A8Q r6 = X.C72463Mc.A0Z(r4)
            java.util.concurrent.atomic.AtomicInteger r6 = r6.A0E
            int r6 = r6.getAndIncrement()
            java.lang.Long r6 = X.C17880vN.A0n(r6)
            r7.A09 = r6
            r6 = 36
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r7.A06 = r6
            r6 = 48
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r7.A04 = r6
            java.lang.String r6 = r9.A06
            r7.A0H = r6
            com.whatsapp.jid.UserJid r6 = r9.A01
            r7.A00 = r6
            r8.A09(r7)
        L_0x01d5:
            X.2jx r6 = new X.2jx
            r6.<init>()
            X.3V2 r8 = r4.A1g
            if (r8 == 0) goto L_0x0246
            boolean r7 = r8.A0V()
            if (r7 == 0) goto L_0x0246
            X.5cC r7 = r8.A0T()
            if (r7 == 0) goto L_0x0246
            X.4Se r7 = r7.C55(r8, r6)
            java.lang.Integer r8 = r7.A00
            java.lang.Integer r7 = X.AnonymousClass00R.A01
            if (r8 != r7) goto L_0x0219
            X.5cQ r5 = r4.A2Q
            X.1FY r3 = r5.getActivityNullable()
            X.1BI r2 = r4.A3R
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            android.content.Intent r1 = X.AnonymousClass1LU.A0f(r3, r2, r0)
            r0 = 476(0x1dc, float:6.67E-43)
            r5.startActivityForResult(r1, r0)
            return
        L_0x020a:
            X.4VR r6 = r4.A2q
            boolean r6 = r6.A02()
            if (r6 == 0) goto L_0x0215
            X.AnonymousClass4aY.A1h(r4, r0)
        L_0x0215:
            r20 = r10
            goto L_0x0163
        L_0x0219:
            java.lang.Integer r7 = X.AnonymousClass00R.A00
            if (r8 != r7) goto L_0x0246
            X.2hA r0 = X.AnonymousClass3MZ.A0k(r4)
            X.00H r0 = r0.A0A
            java.lang.Object r3 = r0.get()
            X.73Z r3 = (X.AnonymousClass73Z) r3
            r2 = 2
            X.4iO r0 = new X.4iO
            r0.<init>(r4, r2)
            r3.A00 = r0
            r2 = 817(0x331, float:1.145E-42)
            X.1BI r0 = r4.A3R
            r3.A07(r0, r2, r1)
            return
        L_0x0239:
            boolean r0 = X.AnonymousClass4aY.A1z(r4)
            if (r0 == 0) goto L_0x0244
            boolean r0 = X.AnonymousClass4aY.A2F(r4, r2)
            goto L_0x0283
        L_0x0244:
            r0 = 0
            goto L_0x0283
        L_0x0246:
            X.24e r7 = r4.A0s
            if (r7 == 0) goto L_0x0260
            boolean r7 = r7.A0I
            if (r7 == 0) goto L_0x0260
            X.2hA r7 = X.AnonymousClass3MZ.A0k(r4)
            X.00H r7 = r7.A0M
            java.lang.Object r7 = r7.get()
            X.72E r7 = (X.AnonymousClass72E) r7
            X.Aby r7 = r7.A02()
            r6.A00 = r7
        L_0x0260:
            java.lang.Integer r9 = r4.A6K
            if (r9 == 0) goto L_0x026f
            java.lang.String r8 = r4.A6Q
            if (r8 == 0) goto L_0x026f
            X.Abz r7 = new X.Abz
            r7.<init>(r8, r9)
            r6.A01 = r7
        L_0x026f:
            X.3TA r7 = r4.A2d
            X.7Fe r9 = r7.A00
            boolean r7 = X.AnonymousClass4aY.A1z(r4)
            if (r7 == 0) goto L_0x02fd
            boolean r0 = X.AnonymousClass4aY.A2F(r4, r2)
        L_0x027d:
            X.AnonymousClass4aY.A0d(r4)
            X.AnonymousClass4aY.A0i(r4)
        L_0x0283:
            X.5cQ r6 = r4.A2Q
            X.11C r6 = r6.getSystemServices()
            android.view.inputmethod.InputMethodManager r6 = r6.A0N()
            X.C17960vV.A07(r6)
            boolean r6 = r6.isFullscreenMode()
            r9 = 4
            if (r6 != 0) goto L_0x02bc
            com.whatsapp.mentions.MentionableEntry r6 = r4.A3Z
            int r7 = r6.getHeight()
            com.whatsapp.conversation.ConversationListView r6 = r4.A2B
            int r6 = X.AnonymousClass3MW.A02(r6, r7)
            int r7 = r6 * 4
            X.5cQ r6 = r4.A2Q
            android.view.Window r6 = r6.getWindow()
            android.view.View r6 = r6.getDecorView()
            int r6 = r6.getHeight()
            if (r7 >= r6) goto L_0x02c2
            int r7 = X.C72473Md.A08(r4)
            r6 = 2
            if (r7 != r6) goto L_0x02c2
        L_0x02bc:
            r4.A2P()
            X.AnonymousClass4aY.A1w(r4)
        L_0x02c2:
            boolean r6 = X.AnonymousClass4aY.A26(r4)
            if (r6 == 0) goto L_0x02d4
            com.google.android.material.bottomsheet.BottomSheetBehavior r8 = r4.A0i
            if (r8 == 0) goto L_0x02d4
            int r7 = r8.A0J
            r6 = 3
            if (r7 != r6) goto L_0x02d4
            r8.A0W(r9)
        L_0x02d4:
            if (r2 == 0) goto L_0x02f9
            int r2 = r2.length()
            if (r2 <= 0) goto L_0x02f9
            X.5cQ r2 = r4.A2Q
            android.content.Intent r6 = r2.getIntent()
            java.lang.String r2 = "fb_share_wa_redirect"
            boolean r2 = r6.getBooleanExtra(r2, r1)
            if (r2 == 0) goto L_0x02f9
            X.1FY r2 = X.AnonymousClass3MW.A0P(r4)
            r2.finishAffinity()
            X.5cQ r6 = r4.A2Q
            r2 = 17432577(0x10a0001, float:2.53466E-38)
            r6.overridePendingTransition(r1, r2)
        L_0x02f9:
            if (r0 == 0) goto L_0x002a
            goto L_0x0060
        L_0x02fd:
            boolean r7 = r9 instanceof X.C75363hK
            if (r7 == 0) goto L_0x0329
            X.3hK r9 = (X.C75363hK) r9
            X.77H r8 = r9.A00
            if (r8 == 0) goto L_0x0326
            X.1iW r9 = X.AnonymousClass3MX.A0X(r4)
            X.1BI r6 = r4.A3R
            java.util.List r15 = java.util.Collections.singletonList(r6)
            java.lang.String r11 = r8.A00
            java.lang.String r12 = r8.A02
            java.lang.String r7 = r8.A01
            byte[] r16 = r8.A01()
            X.3VQ r6 = r4.A2b
            X.206 r10 = r6.A0G
            r13 = r7
            r14 = r2
            r9.A0f(r10, r11, r12, r13, r14, r15, r16)
            goto L_0x027d
        L_0x0326:
            r0 = 0
            goto L_0x027d
        L_0x0329:
            X.1iW r16 = X.AnonymousClass3MX.A0X(r4)
            X.1BI r7 = r4.A3R
            java.util.List r28 = java.util.Collections.singletonList(r7)
            X.3TA r7 = r4.A2d
            X.3M1 r15 = r7.A0o
            X.36w r14 = r7.A05
            X.36w r13 = r7.A04
            X.3VQ r7 = r4.A2b
            X.206 r12 = r7.A0G
            com.whatsapp.mentions.MentionableEntry r7 = r4.A3Z
            java.util.List r29 = r7.getMentions()
            boolean r11 = r4.A6g
            boolean r8 = r4.A6i
            X.2q8 r18 = r6.A00()
            int r7 = r4.A01
            r6 = 29
            if (r7 != r6) goto L_0x035b
            boolean r6 = r4.A6m
            if (r6 == 0) goto L_0x037a
            r4.A6m = r1
            r7 = 29
        L_0x035b:
            r26 = r10
            r19 = r10
            r27 = r2
            r30 = r7
            r31 = r11
            r32 = r8
            r33 = r1
            r22 = r14
            r23 = r13
            r24 = r10
            r25 = r15
            r21 = r12
            r17 = r9
            r16.A0J(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33)
            goto L_0x027d
        L_0x037a:
            r7 = 35
            goto L_0x035b
        L_0x037d:
            r3 = 0
            goto L_0x001e
        L_0x0380:
            java.lang.Object r0 = r1.A01
            X.4i4 r0 = (X.C92884i4) r0
            java.lang.Object r6 = r1.A02
            com.whatsapp.jid.Jid r6 = (com.whatsapp.jid.Jid) r6
            boolean r5 = r1.A03
            X.4i3 r4 = r0.A00
            r0 = 6
            X.C92874i3.A03(r4, r0)
            X.9uX r1 = r4.A0Z
            X.AEW r0 = r4.A0G
            java.lang.String r2 = r1.A00(r0)
            java.lang.String r0 = "UNBLOCKED"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x03b8
            X.9kg r0 = r4.A12
            r0.A00()
            X.1L9 r3 = r4.A0S
            com.whatsapp.chatinfo.ContactInfoActivity r2 = r4.A0l
            r1 = 9
            if (r5 == 0) goto L_0x03af
            r1 = 13
        L_0x03af:
            r0 = 0
            android.content.Intent r0 = X.AnonymousClass1LU.A0z(r2, r6, r0, r1)
            r3.A08(r2, r0)
            return
        L_0x03b8:
            X.A0o r1 = r4.A0e
            com.whatsapp.chatinfo.ContactInfoActivity r0 = r4.A0l
            r1.A02(r0, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C95594mU.Bkp():void");
    }
}
