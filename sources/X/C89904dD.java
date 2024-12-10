package X;

import android.view.View;

/* renamed from: X.4dD  reason: invalid class name and case insensitive filesystem */
public class C89904dD implements View.OnClickListener {
    public final int A00;
    public final Object A01;

    public C89904dD(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public static void A00(View view, Object obj, int i) {
        view.setOnClickListener(new C89904dD(obj, i));
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x040b, code lost:
        r2.CMk(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x040e, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:291:0x0724, code lost:
        if (r4.getPlaybackState() != 3) goto L_0x0726;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:312:0x0774, code lost:
        r0 = "whatsAppLocale";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:313:0x0777, code lost:
        r0 = "waContactNames";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:314:0x077a, code lost:
        r0 = "contactManager";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:318:0x0786, code lost:
        r0 = "waWorkers";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:319:0x0789, code lost:
        r0 = "globalUI";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:320:0x078c, code lost:
        r0 = "abProps";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:335:0x07bf, code lost:
        X.C18070vi.A11(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:337:0x07c3, code lost:
        throw null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r57) {
        /*
            r56 = this;
            r1 = r56
            int r0 = r1.A00
            r4 = r57
            switch(r0) {
                case 0: goto L_0x0122;
                case 1: goto L_0x043f;
                case 2: goto L_0x0447;
                case 3: goto L_0x0151;
                case 4: goto L_0x049f;
                case 5: goto L_0x0183;
                case 6: goto L_0x0009;
                case 7: goto L_0x0009;
                case 8: goto L_0x0009;
                case 9: goto L_0x0009;
                case 10: goto L_0x044f;
                case 11: goto L_0x0471;
                case 12: goto L_0x01b3;
                case 13: goto L_0x049f;
                case 14: goto L_0x04a8;
                case 15: goto L_0x0032;
                case 16: goto L_0x02c4;
                case 17: goto L_0x04c8;
                case 18: goto L_0x0535;
                case 19: goto L_0x055a;
                case 20: goto L_0x0560;
                case 21: goto L_0x02e4;
                case 22: goto L_0x0569;
                case 23: goto L_0x05d1;
                case 24: goto L_0x05dd;
                case 25: goto L_0x042d;
                case 26: goto L_0x031e;
                case 27: goto L_0x05e5;
                case 28: goto L_0x033e;
                case 29: goto L_0x0358;
                case 30: goto L_0x0604;
                case 31: goto L_0x060c;
                case 32: goto L_0x0621;
                case 33: goto L_0x038a;
                case 34: goto L_0x0637;
                case 35: goto L_0x063f;
                case 36: goto L_0x06ac;
                case 37: goto L_0x0647;
                case 38: goto L_0x064f;
                case 39: goto L_0x03aa;
                case 40: goto L_0x069f;
                case 41: goto L_0x06ac;
                case 42: goto L_0x06bf;
                case 43: goto L_0x03e8;
                case 44: goto L_0x0015;
                case 45: goto L_0x06da;
                case 46: goto L_0x06f5;
                case 47: goto L_0x06fd;
                case 48: goto L_0x070e;
                case 49: goto L_0x0411;
                default: goto L_0x0009;
            }
        L_0x0009:
            java.lang.Object r1 = r1.A01
            X.1Di r1 = (X.C22821Di) r1
            r0 = 0
            X.C18070vi.A0d(r1, r0)
            r1.invoke(r4)
        L_0x0014:
            return
        L_0x0015:
            r2 = 0
            if (r57 == 0) goto L_0x001c
            android.content.Context r2 = r4.getContext()
        L_0x001c:
            boolean r0 = r2 instanceof X.AnonymousClass1FU
            if (r0 == 0) goto L_0x0014
            X.1FU r2 = (X.AnonymousClass1FU) r2
            if (r2 == 0) goto L_0x0014
            r1 = 0
            r0 = 1
            com.whatsapp.conversation.conversationrow.E2EEDescriptionBottomSheet.A04 = r0
            com.whatsapp.conversation.conversationrow.E2EEDescriptionBottomSheet r1 = com.whatsapp.conversation.conversationrow.E2EEDescriptionBottomSheet.A00(r1)
            java.lang.String r0 = "E2EEDescriptionBottomSheet"
            r2.CMk(r1, r0)
            return
        L_0x0032:
            java.lang.Object r0 = r1.A01
            com.whatsapp.conversation.comments.CommentActionsBottomSheet r0 = (com.whatsapp.conversation.comments.CommentActionsBottomSheet) r0
            X.0vl r1 = r0.A0f
            java.lang.Object r11 = r1.getValue()
            android.content.Context r11 = (android.content.Context) r11
            X.11P r1 = r0.A0D
            r26 = r1
            if (r1 == 0) goto L_0x078f
            X.0ve r1 = r0.A0M
            r25 = r1
            if (r1 == 0) goto L_0x078c
            X.1KB r1 = r0.A01
            r24 = r1
            if (r1 == 0) goto L_0x0789
            X.10I r1 = r0.A0U
            r23 = r1
            if (r1 == 0) goto L_0x0786
            X.18K r1 = r0.A0N
            r22 = r1
            if (r1 == 0) goto L_0x0783
            X.1KW r1 = r0.A0L
            r21 = r1
            if (r1 == 0) goto L_0x0780
            X.1iW r1 = r0.A07
            r20 = r1
            if (r1 == 0) goto L_0x077d
            X.1M9 r10 = r0.A08
            if (r10 == 0) goto L_0x077a
            X.1Me r9 = r0.A0A
            if (r9 == 0) goto L_0x0777
            X.0vb r1 = r0.A0F
            r19 = r1
            if (r1 == 0) goto L_0x0774
            X.1Ok r1 = r0.A0B
            r18 = r1
            if (r1 == 0) goto L_0x0771
            X.00H r1 = r0.A0c
            if (r1 == 0) goto L_0x076e
            X.1xo r48 = X.AnonymousClass3MX.A0i(r1)
            X.1MB r1 = r0.A0P
            r17 = r1
            if (r1 == 0) goto L_0x076b
            X.1Nl r1 = r0.A0O
            r16 = r1
            if (r1 == 0) goto L_0x0768
            X.1PM r15 = r0.A09
            if (r15 == 0) goto L_0x0765
            X.0z4 r14 = r0.A0E
            if (r14 == 0) goto L_0x0762
            X.0zA r13 = r0.A00
            if (r13 == 0) goto L_0x075f
            X.1MZ r8 = r0.A0H
            if (r8 == 0) goto L_0x075c
            X.00H r1 = r0.A0b
            if (r1 == 0) goto L_0x0759
            java.lang.Object r7 = r1.get()
            X.2r5 r7 = (X.C62242r5) r7
            X.4Wz r6 = r0.A0R
            if (r6 == 0) goto L_0x0756
            X.206 r1 = r0.A0T
            java.lang.String r2 = "message"
            if (r1 == 0) goto L_0x0752
            java.util.List r1 = X.C18070vi.A0M(r1)
            java.util.HashSet r5 = new java.util.HashSet
            r5.<init>(r1)
            X.206 r1 = r0.A0T
            if (r1 == 0) goto L_0x0752
            X.1BI r12 = r1.A0H()
            r4 = 0
            X.4ge r3 = new X.4ge
            r3.<init>(r0, r4)
            X.1CJ r2 = r0.A0G
            if (r2 == 0) goto L_0x074f
            X.00H r0 = r0.A0Y
            if (r0 == 0) goto L_0x074c
            java.lang.Object r1 = r0.get()
            X.0zA r1 = (X.C19880zA) r1
            r31 = 0
            r55 = 1
            X.4ga r0 = new X.4ga
            r0.<init>(r11, r4)
            java.lang.String r53 = X.C88224Yu.A01(r11, r10, r9, r12, r5)
            r40 = r14
            r41 = r19
            r42 = r2
            r43 = r8
            r44 = r21
            r45 = r25
            r46 = r22
            r47 = r16
            r49 = r17
            r50 = r7
            r51 = r6
            r52 = r23
            r54 = r5
            r27 = r11
            r28 = r13
            r29 = r1
            r30 = r0
            r32 = r3
            r33 = r24
            r34 = r20
            r35 = r10
            r36 = r15
            r37 = r9
            r38 = r18
            r39 = r26
            X.05w r0 = X.C88224Yu.A00(r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55)
            if (r0 == 0) goto L_0x0014
            r0.show()
            return
        L_0x0122:
            java.lang.Object r1 = r1.A01
            com.whatsapp.conversation.EditMessageActivity r1 = (com.whatsapp.conversation.EditMessageActivity) r1
            X.00H r0 = r1.A0L
            if (r0 == 0) goto L_0x07a4
            java.lang.Object r0 = r0.get()
            X.74J r0 = (X.AnonymousClass74J) r0
            boolean r0 = r0.A0U()
            if (r0 == 0) goto L_0x0014
            X.00H r0 = r1.A0L
            if (r0 == 0) goto L_0x07a4
            java.lang.Object r3 = r0.get()
            X.74J r3 = (X.AnonymousClass74J) r3
            r0 = 16
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            X.3U2 r0 = r1.A0A
            r1 = 0
            if (r0 != 0) goto L_0x0792
            java.lang.String r0 = "editMessageViewModel"
            X.C18070vi.A11(r0)
            throw r1
        L_0x0151:
            java.lang.Object r1 = r1.A01
            X.3ry r1 = (X.C78013ry) r1
            r0 = 1
            r1.A06(r0)
            X.1SG r4 = r1.A07
            X.1E7 r0 = r1.A01
            com.whatsapp.jid.Jid r1 = X.C72453Mb.A0m(r0)
            X.1BI r1 = (X.AnonymousClass1BI) r1
            X.1CJ r0 = r4.A01
            X.1ci r3 = r0.A0A(r1)
            if (r3 == 0) goto L_0x0014
            r0 = -1
            r3.A0E = r0
            X.00H r0 = r4.A03
            java.lang.Object r2 = r0.get()
            X.1gM r2 = (X.C31931gM) r2
            r0 = 2
            X.3Bx r1 = new X.3Bx
            r1.<init>(r4, r3, r0)
            r0 = 19
            r2.A01(r1, r0)
            return
        L_0x0183:
            java.lang.Object r6 = r1.A01
            X.3rq r6 = (X.C77933rq) r6
            X.1EC r0 = r6.A02
            if (r0 == 0) goto L_0x0014
            X.1L9 r5 = r6.A04
            X.5cS r0 = r6.A01
            X.1FY r4 = r0.CFa()
            X.1FY r0 = r0.CFa()
            X.1EC r3 = r6.A02
            android.content.Intent r2 = X.C17880vN.A0A()
            java.lang.String r1 = r0.getPackageName()
            java.lang.String r0 = "com.whatsapp.group.GroupPendingParticipantsActivity"
            r2.setClassName(r1, r0)
            java.lang.String r0 = "gid"
            X.AnonymousClass3MY.A12(r2, r3, r0)
            r5.A08(r4, r2)
            r0 = 0
            r6.A06(r0)
            return
        L_0x01b3:
            java.lang.Object r0 = r1.A01
            X.3ru r0 = (X.C77973ru) r0
            com.whatsapp.pininchat.banner.PinInChatBannerViewModel r5 = r0.A04
            X.1DT r3 = r5.A01
            X.206 r6 = X.AnonymousClass3MX.A0r(r3)
            if (r6 == 0) goto L_0x02be
            X.1wy r0 = r5.A04
            r0.A0F(r6)
            X.00H r0 = r5.A06
            java.lang.Object r1 = r0.get()
            X.4Wr r1 = (X.C87714Wr) r1
            java.util.LinkedHashMap r0 = r5.A07
            int r10 = r0.size()
            X.1vp r0 = r5.A03
            java.lang.Object r2 = r0.A06()
            X.4Tu r2 = (X.C86974Tu) r2
            int r7 = r2.A01
            r0 = 1
            if (r7 <= r0) goto L_0x02bb
            int r7 = r7 - r0
            int r0 = r2.A00
            int r7 = r7 - r0
        L_0x01e5:
            r9 = 0
            X.3zg r2 = new X.3zg
            r2.<init>()
            r4 = 1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)
            r2.A05 = r0
            X.205 r0 = r6.A0v
            X.1BI r8 = r0.A00
            if (r8 == 0) goto L_0x0236
            boolean r0 = X.C22971Dz.A0e(r8)
            if (r0 == 0) goto L_0x02b3
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r4)
            r2.A00 = r0
            X.1MZ r9 = r1.A00
            int r0 = r9.A01(r8)
            java.lang.Long r0 = X.C17880vN.A0n(r0)
            r2.A06 = r0
            X.1EC r8 = X.AnonymousClass3MW.A0i(r8)
            if (r8 == 0) goto L_0x0236
            X.1PU r0 = r1.A02
            int r0 = r0.A00(r8)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.A03 = r0
            boolean r0 = r9.A0J(r8)
            if (r0 == 0) goto L_0x0236
            boolean r0 = r9.A0K(r8)
            int r0 = X.C72453Mb.A04(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.A02 = r0
        L_0x0236:
            X.00H r0 = r1.A03
            java.lang.Object r0 = r0.get()
            X.2r5 r0 = (X.C62242r5) r0
            int r0 = r0.A01(r6)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.A04 = r0
            java.lang.Long r0 = X.C17880vN.A0n(r10)
            r2.A07 = r0
            java.lang.Long r0 = X.C17880vN.A0n(r7)
            r2.A08 = r0
            X.22C r0 = X.C63892tr.A03(r6)
            if (r0 == 0) goto L_0x02b1
            X.205 r0 = r0.A0v
            if (r0 == 0) goto L_0x02b1
            boolean r0 = r0.A02
            if (r0 != r4) goto L_0x02b1
        L_0x0262:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r4)
            r2.A01 = r0
            X.18K r1 = r1.A01
            X.0vt r0 = X.C87714Wr.A04
            r1.CC6(r2, r0)
        L_0x026f:
            X.1vp r6 = r5.A03
            java.lang.Object r0 = r6.A06()
            X.4Tu r0 = (X.C86974Tu) r0
            int r2 = r0.A01
            java.lang.Object r0 = r6.A06()
            X.4Tu r0 = (X.C86974Tu) r0
            int r1 = r0.A00
            r0 = 1
            if (r2 <= r0) goto L_0x0014
            int r1 = r1 + 1
            int r1 = r1 % r2
            X.4Tu r4 = new X.4Tu
            r4.<init>(r2, r1)
            java.util.LinkedHashMap r0 = r5.A07
            java.util.List r0 = X.C99834tX.A0L(r0)
            java.lang.Object r0 = X.C29431cG.A0f(r0, r1)
            X.1D6 r0 = (X.AnonymousClass1D6) r0
            if (r0 == 0) goto L_0x02af
            java.lang.Object r2 = r0.second
        L_0x029c:
            java.lang.Runnable r1 = r5.A00
            if (r1 == 0) goto L_0x07a7
            X.1KB r0 = r5.A02
            r0.A0I(r1)
            r0 = 0
            r5.A00 = r0
            r6.A0G(r4)
            X.C137196v4.A01(r3, r2)
            return
        L_0x02af:
            r2 = 0
            goto L_0x029c
        L_0x02b1:
            r4 = 0
            goto L_0x0262
        L_0x02b3:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r9)
            r2.A00 = r0
            goto L_0x0236
        L_0x02bb:
            r7 = 0
            goto L_0x01e5
        L_0x02be:
            java.lang.String r0 = "PinInChatBannerViewModel/onBannerClicked/no current message to scroll"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            goto L_0x026f
        L_0x02c4:
            java.lang.Object r4 = r1.A01
            com.whatsapp.conversation.comments.CommentActionsBottomSheet r4 = (com.whatsapp.conversation.comments.CommentActionsBottomSheet) r4
            X.206 r0 = r4.A0T
            if (r0 == 0) goto L_0x07ba
            X.205 r0 = r0.A0v
            X.1BI r3 = r0.A00
            if (r3 == 0) goto L_0x0014
            X.1RK r0 = r4.A0J
            if (r0 == 0) goto L_0x07b7
            X.Af0 r2 = r0.A04()
            r1 = 4
            X.4qs r0 = new X.4qs
            r0.<init>(r4, r3, r1)
            r2.A09(r0)
            return
        L_0x02e4:
            java.lang.Object r4 = r1.A01
            X.3uP r4 = (X.AnonymousClass3uP) r4
            java.lang.Runnable r0 = r4.A2a
            if (r0 == 0) goto L_0x02f0
            r0.run()
            return
        L_0x02f0:
            X.206 r3 = r4.getFMessage()
            android.content.Context r0 = r4.getContext()
            android.app.Activity r0 = X.C18050vg.A00(r0)
            if (r0 == 0) goto L_0x0014
            X.5cR r2 = r4.A0k
            if (r2 == 0) goto L_0x0014
            X.18O r1 = r4.A0W
            X.18R r0 = X.AnonymousClass18O.A0b
            boolean r0 = r1.A09(r0)
            if (r0 != 0) goto L_0x031a
            X.00H r0 = r4.A2P
            java.lang.Object r0 = r0.get()
            X.4R1 r0 = (X.AnonymousClass4R1) r0
            java.util.List r0 = r0.A00(r3)
            if (r0 == 0) goto L_0x0014
        L_0x031a:
            r2.CH6(r3)
            return
        L_0x031e:
            java.lang.Object r0 = r1.A01
            X.8nT r0 = (X.AnonymousClass8nT) r0
            X.8nw r3 = r0.getNativeFlowAction()
            X.21L r1 = r0.A08
            r0 = 0
            X.C18070vi.A0d(r1, r0)
            X.1KB r0 = r3.A00
            X.1FR r2 = r0.A00
            if (r2 == 0) goto L_0x0014
            X.A2A r0 = r3.A02
            com.whatsapp.bizintegrity.callpermission.CallPermissionRequestBottomSheet r1 = X.AnonymousClass9PW.A00(r0, r1)
            java.lang.String r0 = "CallPermissionRequestBottomSheet"
            r2.CMk(r1, r0)
            return
        L_0x033e:
            java.lang.Object r2 = r1.A01
            X.3tt r2 = (X.C78913tt) r2
            r0 = 30
            r2.A2p(r0)
            com.whatsapp.jid.UserJid r1 = X.C79103uS.A1D(r2)
            if (r1 == 0) goto L_0x0014
            X.1FY r2 = r2.A08
            r0 = 10
            com.whatsapp.biz.education.MetaVerifiedEducationBottomSheet r1 = X.AnonymousClass9PN.A00(r1, r0)
            r0 = 0
            goto L_0x040b
        L_0x0358:
            java.lang.Object r1 = r1.A01
            X.3sy r1 = (X.C78543sy) r1
            r3 = 0
            X.C18070vi.A0d(r1, r3)
            X.1E7 r0 = r1.A03
            com.whatsapp.jid.UserJid r6 = X.AnonymousClass3MZ.A0x(r0)
            if (r6 == 0) goto L_0x0014
            X.4OU r7 = r1.A0D
            X.4U7 r5 = X.C78543sy.A04(r1)
            r8 = 0
            r9 = 2
            X.10I r0 = r7.A03
            r10 = 5
            X.4rm r4 = new X.4rm
            r4.<init>(r5, r6, r7, r8, r9, r10)
            r0.CGF(r4)
            X.1FY r2 = r1.A08
            java.lang.Integer r1 = java.lang.Integer.valueOf(r9)
            r0 = 1
            android.content.Intent r0 = X.AnonymousClass1LU.A1D(r2, r6, r1, r0, r3)
            r2.startActivity(r0, r8)
            return
        L_0x038a:
            java.lang.Object r1 = r1.A01
            X.3sg r1 = (X.C78363sg) r1
            X.1FU r4 = X.C72473Md.A0O(r1)
            if (r4 == 0) goto L_0x0014
            X.206 r0 = r1.A0I
            com.whatsapp.jid.UserJid r3 = X.AnonymousClass3Ma.A0o(r0)
            X.C17960vV.A07(r3)
            X.4Q5 r2 = r1.A01
            X.1CJ r0 = r1.A0E
            int r1 = r0.A04(r3)
            r0 = 2
            r2.A00(r4, r3, r1, r0)
            return
        L_0x03aa:
            java.lang.Object r4 = r1.A01
            X.3tz r4 = (X.C78953tz) r4
            X.1E7 r0 = r4.A03
            X.1BI r0 = r0.A0J
            if (r0 == 0) goto L_0x0014
            r1 = 0
            r0 = 3
            X.C78953tz.A05(r4, r1, r0)
            X.1E7 r0 = r4.A03
            android.os.Bundle r3 = X.C72463Mc.A0J(r0)
            com.whatsapp.jid.Jid r0 = X.AnonymousClass3MW.A0g(r0)
            X.C17960vV.A07(r0)
            X.C18070vi.A0X(r0)
            java.lang.String r1 = r0.getRawString()
            java.lang.String r0 = "argSenderJid"
            r3.putString(r0, r1)
            com.whatsapp.fmx.FMXSafetyTipsBottomSheetFragment r2 = new com.whatsapp.fmx.FMXSafetyTipsBottomSheetFragment
            r2.<init>()
            r2.A1R(r3)
            X.1FY r0 = r4.A08
            X.1GP r1 = r0.getSupportFragmentManager()
            java.lang.String r0 = X.C17890vO.A0U(r2)
            r2.A2C(r1, r0)
            return
        L_0x03e8:
            java.lang.Object r0 = r1.A01
            X.3sT r0 = (X.C78243sT) r0
            X.0zA r3 = r0.A00
            if (r3 == 0) goto L_0x0014
            boolean r1 = r3.A07()
            r0 = 1
            if (r1 != r0) goto L_0x0014
            if (r57 == 0) goto L_0x040f
            android.content.Context r0 = r4.getContext()
        L_0x03fd:
            X.1FU r2 = X.AnonymousClass3MZ.A0P(r0)
            r3.A03()
            com.whatsapp.group.hosted.ui.GroupSecureMessageFragment r1 = new com.whatsapp.group.hosted.ui.GroupSecureMessageFragment
            r1.<init>()
            java.lang.String r0 = "HOSTED_GROUP_TAG"
        L_0x040b:
            r2.CMk(r1, r0)
            return
        L_0x040f:
            r0 = 0
            goto L_0x03fd
        L_0x0411:
            java.lang.Object r3 = r1.A01
            X.4XZ r3 = (X.AnonymousClass4XZ) r3
            X.3uJ r0 = r3.A0D
            X.5cR r2 = r0.A0k
            if (r2 == 0) goto L_0x0014
            boolean r0 = r2.Bcq()
            if (r0 == 0) goto L_0x0014
            android.view.View r1 = r3.A02
            X.21V r0 = r3.A07
            boolean r0 = r2.CPY(r0)
            r1.setSelected(r0)
            return
        L_0x042d:
            r1 = 0
            r0 = 0
            X.C18070vi.A0d(r1, r0)
            r1.getContext()
            r1.getContext()
            java.lang.String r0 = "getFMessage"
            java.lang.NullPointerException r0 = X.AnonymousClass000.A0s(r0)
            throw r0
        L_0x043f:
            java.lang.Object r0 = r1.A01
            X.1FU r0 = (X.AnonymousClass1FU) r0
            r0.onBackPressed()
            return
        L_0x0447:
            java.lang.Object r0 = r1.A01
            X.0vk r0 = (X.C18090vk) r0
            r0.invoke()
            return
        L_0x044f:
            java.lang.Object r3 = r1.A01
            X.3rw r3 = (X.C77993rw) r3
            X.1E7 r0 = r3.A03
            X.1BI r2 = r0.A0J
            if (r2 == 0) goto L_0x046c
            X.4Rq r0 = r3.A04
            X.1ch r2 = (X.C29681ch) r2
            r1 = 0
            X.C18070vi.A0d(r2, r1)
            X.00H r0 = r0.A01
            java.lang.Object r0 = r0.get()
            X.1i5 r0 = (X.C32991i5) r0
            r0.A08(r2, r1)
        L_0x046c:
            r0 = 1
            r3.A06(r0)
            return
        L_0x0471:
            java.lang.Object r0 = r1.A01
            X.3rw r0 = (X.C77993rw) r0
            r1 = 0
            r0.A06(r1)
            android.content.Context r4 = r4.getContext()
            X.C18070vi.A0b(r4)
            X.1E7 r0 = r0.A03
            X.1BI r3 = r0.A0J
            java.lang.String r0 = "null cannot be cast to non-null type com.whatsapp.jid.NewsletterJid"
            X.C18070vi.A0z(r3, r0)
            android.content.Intent r2 = X.AnonymousClass3MZ.A07(r4, r1)
            java.lang.String r1 = r4.getPackageName()
            java.lang.String r0 = "com.whatsapp.product.newsletterenforcements.alerts.NewsletterAlertsActivity"
            r2.setClassName(r1, r0)
            java.lang.String r0 = "jid"
            X.AnonymousClass3MY.A13(r2, r3, r0)
            r4.startActivity(r2)
            return
        L_0x049f:
            java.lang.Object r1 = r1.A01
            X.4rI r1 = (X.C98524rI) r1
            r0 = 1
            r1.A06(r0)
            return
        L_0x04a8:
            java.lang.Object r4 = r1.A01
            X.3rv r4 = (X.C77983rv) r4
            X.9tI r2 = r4.A01
            if (r2 == 0) goto L_0x04b6
            X.A6O r1 = r4.A06
            r0 = 3
            r1.A04(r2, r0)
        L_0x04b6:
            X.5YR r3 = r4.A02
            if (r3 == 0) goto L_0x04c3
            X.1o6 r2 = r4.A0A
            X.9Ik r1 = X.C179549Ik.DISMISS_ACTION
            r0 = 11389(0x2c7d, float:1.596E-41)
            r2.A00(r1, r3, r0)
        L_0x04c3:
            r0 = 1
            r4.A06(r0)
            return
        L_0x04c8:
            java.lang.Object r2 = r1.A01
            com.whatsapp.conversation.comments.CommentActionsBottomSheet r2 = (com.whatsapp.conversation.comments.CommentActionsBottomSheet) r2
            X.206 r0 = r2.A0T
            if (r0 == 0) goto L_0x07ba
            java.util.List r14 = X.C18070vi.A0M(r0)
            X.0vl r0 = r2.A0f
            java.lang.Object r3 = r0.getValue()
            android.content.Context r3 = (android.content.Context) r3
            X.1KB r4 = r2.A01
            if (r4 == 0) goto L_0x0789
            X.1gc r11 = r2.A0Q
            if (r11 == 0) goto L_0x0531
            X.11S r5 = r2.A06
            if (r5 == 0) goto L_0x052d
            X.1M9 r6 = r2.A08
            if (r6 == 0) goto L_0x077a
            X.0vb r9 = r2.A0F
            if (r9 == 0) goto L_0x0774
            X.11C r8 = r2.A0C
            if (r8 == 0) goto L_0x0529
            X.1Me r7 = r2.A0A
            if (r7 == 0) goto L_0x0777
            X.0vc r12 = r2.A0S
            if (r12 == 0) goto L_0x0525
            X.00H r0 = r2.A0Z
            if (r0 == 0) goto L_0x0521
            java.lang.Object r13 = r0.get()
            X.1y1 r13 = (X.C42341y1) r13
            X.00H r0 = r2.A0W
            if (r0 == 0) goto L_0x07bd
            r0.get()
            X.0ve r10 = r2.A0M
            if (r10 == 0) goto L_0x078c
            X.C63752td.A03(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            X.10I r1 = r2.A0U
            if (r1 == 0) goto L_0x0786
            r0 = 34
            X.C98774rh.A01(r1, r2, r0)
            r2.A28()
            return
        L_0x0521:
            java.lang.String r0 = "interactiveMessageCustomizerFactory"
            goto L_0x07bf
        L_0x0525:
            java.lang.String r0 = "sharedPreferencesFactory"
            goto L_0x07bf
        L_0x0529:
            java.lang.String r0 = "systemServices"
            goto L_0x07bf
        L_0x052d:
            java.lang.String r0 = "meManager"
            goto L_0x07bf
        L_0x0531:
            java.lang.String r0 = "mentions"
            goto L_0x07bf
        L_0x0535:
            java.lang.Object r4 = r1.A01
            X.4Xb r4 = (X.C87804Xb) r4
            X.4MP r1 = r4.A0A
            int r9 = r4.A03
            X.3u7 r0 = r1.A01
            X.4Xe r2 = r0.getConversationRowAlbumUtils()
            android.content.Context r3 = r1.A00
            java.util.List r6 = r0.getAlbumMessages()
            java.util.List r7 = r0.getRevokedAlbumMessages()
            X.206 r5 = r0.getFMessage()
            X.C18070vi.A0X(r5)
            java.util.ArrayList r8 = r0.A0C
            r2.A02(r3, r4, r5, r6, r7, r8, r9)
            return
        L_0x055a:
            java.lang.Object r0 = r1.A01
            X.AnonymousClass3MW.A1V(r0)
            return
        L_0x0560:
            java.lang.Object r1 = r1.A01
            X.3uP r1 = (X.AnonymousClass3uP) r1
            r0 = 0
            X.AnonymousClass3uP.A0X(r0, r1)
            return
        L_0x0569:
            java.lang.Object r2 = r1.A01
            X.3uP r2 = (X.AnonymousClass3uP) r2
            X.00H r0 = r2.A2V
            java.lang.Object r1 = r0.get()
            X.4Nc r1 = (X.C85364Nc) r1
            X.206 r6 = r2.getFMessage()
            android.content.Context r0 = r2.getContext()
            boolean r5 = X.C18070vi.A16(r6, r0)
            X.2bG r4 = r1.A01
            android.app.Activity r3 = X.AnonymousClass1L9.A00(r0)
            boolean r0 = r3 instanceof X.AnonymousClass1FU
            if (r0 == 0) goto L_0x05a3
            X.1FU r3 = (X.AnonymousClass1FU) r3
            if (r3 == 0) goto L_0x05a3
            com.whatsapp.usercontrol.view.UserControlMessageLevelFragment r2 = new com.whatsapp.usercontrol.view.UserControlMessageLevelFragment
            r2.<init>()
            android.os.Bundle r1 = X.C17880vN.A0D()
            X.205 r0 = r6.A0v
            X.AnonymousClass4aU.A0A(r1, r0)
            r2.A1R(r1)
            r3.CMl(r2)
        L_0x05a3:
            X.1ml r4 = r4.A00
            X.63p r3 = new X.63p
            r3.<init>()
            r0 = 12
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3.A01 = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)
            r3.A02 = r0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r5)
            r3.A00 = r0
            java.lang.String r0 = X.C20120A8f.A04(r6)
            r3.A06 = r0
            X.10I r2 = r4.A04
            r1 = 48
            X.AkH r0 = new X.AkH
            r0.<init>(r4, r3, r1)
            r2.CGF(r0)
            return
        L_0x05d1:
            java.lang.Object r1 = r1.A01
            X.3uP r1 = (X.AnonymousClass3uP) r1
            X.206 r0 = r1.getFMessage()
            r1.A2O(r0)
            return
        L_0x05dd:
            java.lang.Object r0 = r1.A01
            X.3uP r0 = (X.AnonymousClass3uP) r0
            r0.A20()
            return
        L_0x05e5:
            java.lang.Object r3 = r1.A01
            X.3so r3 = (X.C78443so) r3
            X.00H r0 = r3.A0F
            java.lang.Object r2 = r0.get()
            X.6mK r2 = (X.C132176mK) r2
            java.lang.Integer r1 = X.C17880vN.A0h()
            r0 = 2
            r2.A00(r1, r0, r0)
            r1 = 48
            X.48m r0 = new X.48m
            r0.<init>(r3, r1)
            r0.onClick(r4)
            return
        L_0x0604:
            java.lang.Object r0 = r1.A01
            X.3u1 r0 = (X.C78973u1) r0
            r0.A2i()
            return
        L_0x060c:
            java.lang.Object r0 = r1.A01
            X.3sX r0 = (X.C78283sX) r0
            X.1GP r2 = r0.A02
            X.206 r0 = r0.A0I
            X.205 r0 = r0.A0v
            X.1BI r1 = r0.A00
            r0 = 0
            X.C18070vi.A0d(r2, r0)
            r0 = 3
            X.C72483Me.A0l(r1, r2, r0)
            return
        L_0x0621:
            java.lang.Object r1 = r1.A01
            X.3uP r1 = (X.AnonymousClass3uP) r1
            X.00H r0 = r1.A1q
            X.1o3 r2 = X.AnonymousClass3MW.A0a(r0)
            android.app.Activity r1 = X.AnonymousClass3Ma.A05(r1)
            X.1FL r1 = (X.AnonymousClass1FL) r1
            java.lang.String r0 = "about-disappearing-messages"
            r2.A01(r1, r0)
            return
        L_0x0637:
            java.lang.Object r0 = r1.A01
            X.8nV r0 = (X.AnonymousClass8nV) r0
            X.AnonymousClass8nV.setClickListeners$lambda$0(r0, r4)
            return
        L_0x063f:
            java.lang.Object r0 = r1.A01
            X.8nV r0 = (X.AnonymousClass8nV) r0
            X.AnonymousClass8nV.setClickListeners$lambda$1(r0, r4)
            return
        L_0x0647:
            java.lang.Object r0 = r1.A01
            X.3tz r0 = (X.C78953tz) r0
            r0.A2r()
            return
        L_0x064f:
            java.lang.Object r2 = r1.A01
            X.3tz r2 = (X.C78953tz) r2
            r3 = 0
            r0 = 1
            X.C78953tz.A05(r2, r3, r0)
            X.0ve r0 = r2.A0F
            boolean r0 = X.AnonymousClass3MX.A1W(r0)
            if (r0 == 0) goto L_0x068d
            X.0z4 r0 = r2.A0v
            boolean r0 = r0.A2K()
            if (r0 == 0) goto L_0x068d
            X.00H r0 = r2.A0I
            X.10T r4 = X.C17880vN.A0V(r0)
            X.1E7 r0 = r2.A03
            X.1BI r3 = r0.A0J
            java.lang.String r0 = "null cannot be cast to non-null type com.whatsapp.jid.UserJid"
            X.C18070vi.A0z(r3, r0)
            X.11S r1 = r2.A0U
            X.1E7 r0 = r2.A03
            boolean r2 = X.AnonymousClass3Ma.A1V(r1, r0)
            r0 = 0
            X.C18070vi.A0d(r3, r0)
            r1 = 1
            X.35W r0 = new X.35W
            r0.<init>((int) r1, (java.lang.Object) r3, (boolean) r2)
            r4.notifyAllObservers(r0)
            return
        L_0x068d:
            X.1E7 r1 = r2.A03
            X.11S r0 = r2.A0U
            boolean r0 = X.AnonymousClass3Ma.A1V(r0, r1)
            com.whatsapp.dialogs.CreateOrAddToContactsDialog r1 = com.whatsapp.dialogs.CreateOrAddToContactsDialog.A00(r1, r0)
            X.1FY r0 = r2.A08
            X.AnonymousClass3MY.A1H(r1, r0, r3)
            return
        L_0x069f:
            java.lang.Object r2 = r1.A01
            X.3tz r2 = (X.C78953tz) r2
            r1 = 0
            r0 = 5
            X.C78953tz.A05(r2, r1, r0)
            r2.A2r()
            return
        L_0x06ac:
            java.lang.Object r4 = r1.A01
            X.3tz r4 = (X.C78953tz) r4
            r0 = 0
            r3 = 0
            X.C78953tz.A05(r4, r0, r3)
            X.4VE r2 = r4.A0E
            X.1FY r1 = r4.A08
            X.1E7 r0 = r4.A03
            r2.A00(r1, r0, r3)
            return
        L_0x06bf:
            java.lang.Object r2 = r1.A01
            X.3u3 r2 = (X.AnonymousClass3u3) r2
            r2.A20()
            X.21d r0 = r2.getFMessage()
            if (r0 == 0) goto L_0x06d6
            X.2rc r0 = r0.A02
            if (r0 == 0) goto L_0x06d6
            boolean r1 = r0.A0V
            r0 = 1
            if (r1 != r0) goto L_0x06d6
            return
        L_0x06d6:
            r2.A2o()
            return
        L_0x06da:
            java.lang.Object r0 = r1.A01
            android.content.Context r0 = (android.content.Context) r0
            X.3Rj r1 = X.AnonymousClass4a6.A00(r0)
            r0 = 2131891779(0x7f121643, float:1.9418288E38)
            r1.A0D(r0)
            r0 = 2131891780(0x7f121644, float:1.941829E38)
            r1.A0E(r0)
            X.C73203Rj.A06(r1)
            r1.A0C()
            return
        L_0x06f5:
            java.lang.Object r0 = r1.A01
            X.3sm r0 = (X.C78423sm) r0
            r0.A2i()
            return
        L_0x06fd:
            java.lang.Object r3 = r1.A01
            X.3uG r3 = (X.C79043uG) r3
            X.206 r2 = r3.A0I
            X.21V r2 = (X.AnonymousClass21V) r2
            X.22Q r2 = (X.AnonymousClass22Q) r2
            com.whatsapp.conversation.conversationrow.ConversationRowImage$RowImageView r1 = r3.A05
            r0 = 0
            r3.A2A(r1, r2, r0)
            return
        L_0x070e:
            java.lang.Object r5 = r1.A01
            X.3uH r5 = (X.C79053uH) r5
            android.view.animation.Interpolator r0 = X.C79053uH.A0d
            com.whatsapp.conversation.conversationrow.PushToVideoInlineVideoPlayer r4 = r5.A0Q
            X.49n r0 = r4.A09
            X.4a0 r0 = r0.A00
            boolean r0 = r0.A07
            if (r0 == 0) goto L_0x0726
            int r1 = r4.getPlaybackState()
            r0 = 3
            r3 = 1
            if (r1 == r0) goto L_0x0727
        L_0x0726:
            r3 = 0
        L_0x0727:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "conversation/row/ptv/onPlayPauseClickListener/isPlaying="
            X.C17900vP.A0n(r0, r1, r3)
            X.10I r2 = r5.A1X
            X.00H r0 = r5.A04
            java.lang.Object r1 = r0.get()
            if (r3 == 0) goto L_0x0746
            r1.getClass()
            r0 = 22
        L_0x073f:
            X.C98784ri.A00(r2, r1, r0)
            r4.A03()
            return
        L_0x0746:
            r1.getClass()
            r0 = 23
            goto L_0x073f
        L_0x074c:
            java.lang.String r0 = "hostedGroupUtilsOptional"
            goto L_0x07bf
        L_0x074f:
            java.lang.String r0 = "chatsCache"
            goto L_0x07bf
        L_0x0752:
            X.C18070vi.A11(r2)
            goto L_0x07c2
        L_0x0756:
            java.lang.String r0 = "messageRevokeWamEventLogger"
            goto L_0x07bf
        L_0x0759:
            java.lang.String r0 = "messageMediaTypeHelper"
            goto L_0x07bf
        L_0x075c:
            java.lang.String r0 = "groupParticipantsManager"
            goto L_0x07bf
        L_0x075f:
            java.lang.String r0 = "bonsaiUtilOptional"
            goto L_0x07bf
        L_0x0762:
            java.lang.String r0 = "waSharedPreferences"
            goto L_0x07bf
        L_0x0765:
            java.lang.String r0 = "verifiedNameManager"
            goto L_0x07bf
        L_0x0768:
            java.lang.String r0 = "wamThreadIdManager"
            goto L_0x07bf
        L_0x076b:
            java.lang.String r0 = "supportGatingUtils"
            goto L_0x07bf
        L_0x076e:
            java.lang.String r0 = "suspensionManager"
            goto L_0x07bf
        L_0x0771:
            java.lang.String r0 = "businessCoexUtils"
            goto L_0x07bf
        L_0x0774:
            java.lang.String r0 = "whatsAppLocale"
            goto L_0x07bf
        L_0x0777:
            java.lang.String r0 = "waContactNames"
            goto L_0x07bf
        L_0x077a:
            java.lang.String r0 = "contactManager"
            goto L_0x07bf
        L_0x077d:
            java.lang.String r0 = "userActions"
            goto L_0x07bf
        L_0x0780:
            java.lang.String r0 = "emojiLoader"
            goto L_0x07bf
        L_0x0783:
            java.lang.String r0 = "wamRuntime"
            goto L_0x07bf
        L_0x0786:
            java.lang.String r0 = "waWorkers"
            goto L_0x07bf
        L_0x0789:
            java.lang.String r0 = "globalUI"
            goto L_0x07bf
        L_0x078c:
            java.lang.String r0 = "abProps"
            goto L_0x07bf
        L_0x078f:
            java.lang.String r0 = "time"
            goto L_0x07bf
        L_0x0792:
            X.206 r0 = r0.A0B
            if (r0 == 0) goto L_0x079c
            X.205 r0 = r0.A0v
            if (r0 == 0) goto L_0x079c
            X.1BI r1 = r0.A00
        L_0x079c:
            java.lang.Integer r0 = X.A3P.A00(r1)
            r3.A0O(r2, r0)
            return
        L_0x07a4:
            java.lang.String r0 = "expressionsTrayController"
            goto L_0x07bf
        L_0x07a7:
            r0 = 7
            X.3C5 r3 = new X.3C5
            r3.<init>(r5, r4, r2, r0)
            X.1KB r2 = r5.A02
            r0 = 500(0x1f4, double:2.47E-321)
            r2.A0K(r3, r0)
            r5.A00 = r3
            return
        L_0x07b7:
            java.lang.String r0 = "companionDeviceManager"
            goto L_0x07bf
        L_0x07ba:
            java.lang.String r0 = "message"
            goto L_0x07bf
        L_0x07bd:
            java.lang.String r0 = "bonsaiUtilImpl"
        L_0x07bf:
            X.C18070vi.A11(r0)
        L_0x07c2:
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C89904dD.onClick(android.view.View):void");
    }
}
