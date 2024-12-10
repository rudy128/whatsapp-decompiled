package X;

/* renamed from: X.4fm  reason: invalid class name and case insensitive filesystem */
public class C91494fm implements C22851Dl {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C91494fm(Object obj, Object obj2, int i) {
        this.A00 = i;
        this.A01 = obj2;
        this.A02 = obj;
    }

    /* JADX WARNING: type inference failed for: r11v0, types: [X.3PO, android.widget.FrameLayout, android.view.View, android.view.ViewGroup] */
    /* JADX WARNING: type inference failed for: r4v20, types: [X.3wY, X.3wX, X.3PN, android.view.View] */
    /* JADX WARNING: type inference failed for: r1v67, types: [X.3wW, X.3wY, X.3PN, android.view.View] */
    /* JADX WARNING: Code restructure failed: missing block: B:250:0x05d0, code lost:
        X.AnonymousClass4Yv.A01(r1, 106);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:251:0x05d5, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:350:0x0837, code lost:
        r5.dismiss();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:351:0x083a, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:383:0x08fd, code lost:
        X.C18070vi.A11(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:384:0x0901, code lost:
        throw null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0180, code lost:
        ((X.AnonymousClass1DS) r1.A02).A0D(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0187, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x01df, code lost:
        if (r3.A05 == false) goto L_0x01e1;
     */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x03be  */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x0407  */
    /* JADX WARNING: Removed duplicated region for block: B:200:0x0506 A[Catch:{ JSONException -> 0x052f }] */
    /* JADX WARNING: Removed duplicated region for block: B:207:0x0526 A[Catch:{ JSONException -> 0x052f }] */
    /* JADX WARNING: Removed duplicated region for block: B:208:0x052d A[Catch:{ JSONException -> 0x052f }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void Bo9(java.lang.Object r21) {
        /*
            r20 = this;
            r5 = r21
            r1 = r20
            int r0 = r1.A00
            switch(r0) {
                case 0: goto L_0x065d;
                case 1: goto L_0x088c;
                case 2: goto L_0x0880;
                case 3: goto L_0x0874;
                case 4: goto L_0x0868;
                case 5: goto L_0x060e;
                case 6: goto L_0x0855;
                case 7: goto L_0x05d6;
                case 8: goto L_0x0847;
                case 9: goto L_0x0818;
                case 10: goto L_0x080a;
                case 11: goto L_0x07fe;
                case 12: goto L_0x058c;
                case 13: goto L_0x02c4;
                case 14: goto L_0x01c6;
                case 15: goto L_0x0188;
                case 16: goto L_0x015e;
                case 17: goto L_0x0017;
                case 18: goto L_0x07e1;
                case 19: goto L_0x078f;
                case 20: goto L_0x012c;
                case 21: goto L_0x010c;
                case 22: goto L_0x00ec;
                case 23: goto L_0x0775;
                case 24: goto L_0x00ba;
                case 25: goto L_0x008e;
                case 26: goto L_0x06b5;
                case 27: goto L_0x075c;
                case 28: goto L_0x069f;
                case 29: goto L_0x070c;
                case 30: goto L_0x006c;
                default: goto L_0x0009;
            }
        L_0x0009:
            java.lang.Object r0 = r1.A01
            X.6lg r0 = (X.C131796lg) r0
            java.lang.Object r1 = r1.A02
            com.whatsapp.jid.UserJid r1 = (com.whatsapp.jid.UserJid) r1
            com.whatsapp.voipcalling.VoipActivityV2 r0 = r0.A00
            com.whatsapp.voipcalling.VoipActivityV2.A1E(r1, r0)
        L_0x0016:
            return
        L_0x0017:
            X.25L r5 = (X.AnonymousClass25L) r5
            if (r5 == 0) goto L_0x0180
            java.lang.Object r3 = r1.A01
            X.4aY r3 = (X.AnonymousClass4aY) r3
            com.whatsapp.mentions.MentionableEntry r0 = r3.A3Z
            if (r0 == 0) goto L_0x0180
            java.lang.String r4 = r5.A04()
            if (r4 == 0) goto L_0x0063
            r0 = 1
            r3.A72 = r0
            X.4R4 r2 = X.AnonymousClass3MZ.A0a(r3)
            java.lang.Integer r0 = X.C17880vN.A0i()
            r2.A00 = r0
            r2 = 2
            int r0 = r5.A01()
            r2 = r2 & r0
            if (r2 == 0) goto L_0x0051
            boolean r0 = r5 instanceof X.AnonymousClass2Dr
            if (r0 == 0) goto L_0x0051
            r0 = r5
            X.2Dr r0 = (X.AnonymousClass2Dr) r0
            java.util.List r0 = r0.A08
            java.util.List r2 = X.C29431cG.A0t(r0)
        L_0x004b:
            com.whatsapp.mentions.MentionableEntry r0 = r3.A3Z
            r0.setMentionableText(r4, r2)
            goto L_0x0053
        L_0x0051:
            r2 = 0
            goto L_0x004b
        L_0x0053:
            com.whatsapp.mentions.MentionableEntry r2 = r3.A3Z     // Catch:{ IndexOutOfBoundsException -> 0x005d }
            int r0 = r2.length()     // Catch:{ IndexOutOfBoundsException -> 0x005d }
            r2.setSelection(r0)     // Catch:{ IndexOutOfBoundsException -> 0x005d }
            goto L_0x0063
        L_0x005d:
            r2 = move-exception
            java.lang.String r0 = "unable to set cursor to the end for draft messages"
            com.whatsapp.util.Log.e(r0, r2)
        L_0x0063:
            X.3VQ r2 = r3.A2b
            X.206 r0 = r5.A01
            r2.A0b(r0)
            goto L_0x0180
        L_0x006c:
            java.lang.Object r4 = r1.A01
            X.1DS r4 = (X.AnonymousClass1DS) r4
            java.lang.Object r3 = r1.A02
            boolean[] r3 = (boolean[]) r3
            java.lang.Object r2 = r4.A06()
            r1 = 0
            boolean r0 = r3[r1]
            if (r0 != 0) goto L_0x0088
            if (r2 != 0) goto L_0x0082
            if (r21 != 0) goto L_0x0088
            return
        L_0x0082:
            boolean r0 = r2.equals(r5)
            if (r0 != 0) goto L_0x0016
        L_0x0088:
            r3[r1] = r1
            r4.A0E(r5)
            return
        L_0x008e:
            java.lang.Object r2 = r1.A02
            android.content.Context r2 = (android.content.Context) r2
            X.1A3 r5 = (X.AnonymousClass1A3) r5
            java.lang.Object r0 = r5.A00
            if (r0 == 0) goto L_0x0016
            java.lang.Object r0 = r5.A00()
            com.whatsapp.jid.Jid r0 = (com.whatsapp.jid.Jid) r0
            boolean r0 = X.C22971Dz.A0d(r0)
            if (r0 == 0) goto L_0x0016
            java.lang.Object r0 = r5.A00()
            com.whatsapp.jid.Jid r0 = (com.whatsapp.jid.Jid) r0
            com.whatsapp.jid.UserJid r1 = X.C22941Dw.A00(r0)
            if (r1 == 0) goto L_0x0016
            r0 = 14
            android.content.Intent r0 = X.C72463Mc.A0F(r2, r1, r0)
            r2.startActivity(r0)
            return
        L_0x00ba:
            java.lang.Object r4 = r1.A01
            com.whatsapp.mediaview.MediaViewFragment r4 = (com.whatsapp.mediaview.MediaViewFragment) r4
            java.lang.Object r1 = r1.A02
            com.whatsapp.reactions.ReactionsTrayViewModel r1 = (com.whatsapp.reactions.ReactionsTrayViewModel) r1
            X.4Ry r5 = (X.C86514Ry) r5
            boolean r0 = r5.A02
            if (r0 == 0) goto L_0x0016
            X.206 r3 = r1.A0M
            if (r3 == 0) goto L_0x0898
            boolean r0 = r3.A0w()
            if (r0 != 0) goto L_0x0016
            java.lang.String r0 = r5.A01
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r2 = r0 ^ 1
            X.1iW r1 = r4.A0I
            java.lang.String r0 = r5.A00
            boolean r0 = r1.A0r(r3, r0, r2)
            if (r0 != 0) goto L_0x0016
            X.1FL r1 = r4.A1B()
            if (r1 == 0) goto L_0x0016
            goto L_0x05d0
        L_0x00ec:
            java.lang.Object r0 = r1.A01
            com.whatsapp.group.GroupChatInfoActivity r0 = (com.whatsapp.group.GroupChatInfoActivity) r0
            java.lang.Object r3 = r1.A02
            com.whatsapp.jid.UserJid r3 = (com.whatsapp.jid.UserJid) r3
            X.4XS r2 = r0.A0Y
            if (r2 == 0) goto L_0x0016
            X.C17960vV.A07(r3)
            r1 = 0
            r0 = 0
            X.C18070vi.A0d(r3, r0)
            X.0vl r0 = r2.A04
            java.lang.Object r0 = r0.getValue()
            X.4VH r0 = (X.AnonymousClass4VH) r0
            r0.A01(r3, r1)
            return
        L_0x010c:
            java.lang.Object r0 = r1.A01
            com.whatsapp.group.GroupChatInfoActivity r0 = (com.whatsapp.group.GroupChatInfoActivity) r0
            java.lang.Object r3 = r1.A02
            com.whatsapp.jid.UserJid r3 = (com.whatsapp.jid.UserJid) r3
            X.4XS r2 = r0.A0Y
            if (r2 == 0) goto L_0x0016
            X.C17960vV.A07(r3)
            r1 = 0
            r0 = 0
            X.C18070vi.A0d(r3, r0)
            X.0vl r0 = r2.A04
            java.lang.Object r0 = r0.getValue()
            X.4VH r0 = (X.AnonymousClass4VH) r0
            r0.A00(r3, r1)
            return
        L_0x012c:
            java.lang.Object r2 = r1.A01
            com.whatsapp.group.GroupChatInfoActivity r2 = (com.whatsapp.group.GroupChatInfoActivity) r2
            java.lang.Object r1 = r1.A02
            com.whatsapp.jid.GroupJid r1 = (com.whatsapp.jid.GroupJid) r1
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            boolean r0 = r0.equals(r5)
            if (r0 == 0) goto L_0x0016
            X.1KB r0 = r2.A05
            r0.A04()
            X.1Me r0 = r2.A0d
            java.lang.String r1 = r0.A0Y(r1)
            if (r1 != 0) goto L_0x0156
            r0 = 2131890189(0x7f12100d, float:1.9415063E38)
            java.lang.String r1 = r2.getString(r0)
        L_0x0150:
            X.11t r0 = r2.A0a
            r0.BhK(r2, r1)
            return
        L_0x0156:
            r0 = 2131890188(0x7f12100c, float:1.941506E38)
            java.lang.String r1 = X.C72473Md.A0j(r2, r1, r0)
            goto L_0x0150
        L_0x015e:
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            if (r5 == 0) goto L_0x0016
            boolean r0 = r5.booleanValue()
            if (r0 == 0) goto L_0x0180
            java.lang.Object r2 = r1.A01
            X.4aY r2 = (X.AnonymousClass4aY) r2
            com.whatsapp.KeyboardPopupLayout r5 = r2.A1M
            r0 = 37
            X.4rj r4 = new X.4rj
            r4.<init>((java.lang.Object) r1, (int) r0)
            float r2 = X.AnonymousClass4aY.A00(r2)
            r0 = 1137180672(0x43c80000, float:400.0)
            float r2 = r2 * r0
            long r2 = (long) r2
            r5.postDelayed(r4, r2)
        L_0x0180:
            java.lang.Object r0 = r1.A02
            X.1DS r0 = (X.AnonymousClass1DS) r0
            r0.A0D(r1)
            return
        L_0x0188:
            java.lang.Object r3 = r1.A01
            X.4aY r3 = (X.AnonymousClass4aY) r3
            java.lang.Object r1 = r1.A02
            com.whatsapp.jid.GroupJid r1 = (com.whatsapp.jid.GroupJid) r1
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            boolean r0 = r0.equals(r5)
            if (r0 == 0) goto L_0x0016
            X.1KB r0 = r3.A1L
            r0.A04()
            X.5cQ r0 = r3.A2Q
            X.1Me r0 = r0.getWAContactNames()
            java.lang.String r2 = r0.A0Y(r1)
            X.1FY r1 = X.AnonymousClass3MW.A0Q(r3)
            if (r2 != 0) goto L_0x01be
            r0 = 2131890189(0x7f12100d, float:1.9415063E38)
            java.lang.String r2 = r1.getString(r0)
        L_0x01b4:
            X.11t r1 = r3.A1r
            X.1FY r0 = X.AnonymousClass3MW.A0Q(r3)
            r1.BhK(r0, r2)
            return
        L_0x01be:
            r0 = 2131890188(0x7f12100c, float:1.941506E38)
            java.lang.String r2 = X.C72473Md.A0j(r1, r2, r0)
            goto L_0x01b4
        L_0x01c6:
            java.lang.Object r6 = r1.A01
            X.4aY r6 = (X.AnonymousClass4aY) r6
            java.lang.Object r3 = r1.A02
            X.4Ox r3 = (X.C85834Ox) r3
            X.4NI r5 = (X.AnonymousClass4NI) r5
            boolean r0 = r5.A02
            if (r0 == 0) goto L_0x089d
            X.4TX r4 = X.C88444Zs.A02(r6)
            boolean r0 = r3.A04
            if (r0 == 0) goto L_0x01e1
            boolean r1 = r3.A05
            r0 = 1
            if (r1 != 0) goto L_0x01e2
        L_0x01e1:
            r0 = 0
        L_0x01e2:
            java.lang.String r2 = "preview_load_success"
            if (r0 == 0) goto L_0x01f0
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "icebreaker_"
            java.lang.String r2 = X.AnonymousClass001.A1H(r0, r2, r1)
        L_0x01f0:
            r4.A00(r2)
            X.4VG r7 = r5.A00
            r6.A2t = r7
            X.C17960vV.A07(r7)
            X.4aI r2 = X.C88444Zs.A01(r6)
            com.whatsapp.jid.UserJid r1 = X.AnonymousClass3MW.A0j(r6)
            X.4UF r0 = r7.A00
            java.lang.String r0 = r0.A00
            r2.A06(r1, r0)
            X.4aI r5 = X.C88444Zs.A01(r6)
            X.1BI r0 = r6.A3R
            com.whatsapp.jid.UserJid r1 = X.C22941Dw.A01(r0)
            r0 = 0
            r2 = 3
            r4 = 1
            X.C88654aI.A03(r5, r1, r0, r2, r4)
            boolean r0 = r3.A05
            if (r0 == 0) goto L_0x025e
            java.lang.String r1 = r7.A09
            if (r1 == 0) goto L_0x029d
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x029d
            boolean r0 = X.AnonymousClass4aY.A28(r6)
            if (r0 == 0) goto L_0x0282
            X.AnonymousClass4aY.A0x(r6)
            X.4Rp r1 = r6.A2a
            X.4Xd r0 = r6.A2p
            X.Abv r8 = r1.A01(r0, r7, r4)
            X.4dO r9 = new X.4dO
            r9.<init>(r6, r8, r4)
            X.0ve r2 = r6.A3F
            r1 = 11384(0x2c78, float:1.5952E-41)
            X.0vf r0 = X.C18040vf.A02
            int r0 = X.C18020vd.A00(r0, r2, r1)
            long r0 = (long) r0
            X.11P r2 = r6.A2h
            long r4 = X.AnonymousClass11P.A01(r2)
            long r2 = r6.A07
            long r4 = r4 - r2
            long r0 = r0 - r4
            X.10I r2 = r6.A4c
            r10 = 19
            X.3Cr r5 = new X.3Cr
            r5.<init>((java.lang.Object) r6, (java.lang.Object) r7, (java.lang.Object) r8, (java.lang.Object) r9, (int) r10)
            r2.CGv(r5, r0)
        L_0x025e:
            boolean r0 = X.AnonymousClass4aY.A28(r6)
            if (r0 == 0) goto L_0x0016
            java.lang.String r0 = r7.A09
            if (r0 == 0) goto L_0x026e
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x0016
        L_0x026e:
            X.4aI r3 = X.C88444Zs.A01(r6)
            X.1BI r0 = r6.A3R
            com.whatsapp.jid.UserJid r2 = X.C22941Dw.A01(r0)
            X.4Xd r0 = r6.A2p
            java.lang.String r1 = r0.A09
            r0 = 51
            X.C88654aI.A02(r3, r2, r1, r0)
            return
        L_0x0282:
            X.4VR r0 = r6.A2q
            r0.A01(r7, r3, r1)
            X.AnonymousClass4aY.A0k(r6)
            X.4aI r1 = X.C88444Zs.A01(r6)
            X.1BI r0 = r6.A3R
            com.whatsapp.jid.UserJid r0 = X.C22941Dw.A01(r0)
            if (r0 == 0) goto L_0x025e
            X.4YT r0 = X.C88654aI.A00(r1, r0)
            r0.A02 = r4
            goto L_0x025e
        L_0x029d:
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 == 0) goto L_0x025e
            X.AnonymousClass4aY.A0k(r6)
            X.4TX r1 = X.C88444Zs.A02(r6)
            java.lang.String r0 = "no_welcome_message"
            r1.A02(r0, r2)
            X.4VR r0 = r6.A2q
            X.4XK r2 = r0.A0R
            X.3zN r1 = new X.3zN
            r1.<init>()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)
            r1.A03 = r0
            X.18K r0 = r2.A00
            r0.CC7(r1)
            goto L_0x025e
        L_0x02c4:
            java.lang.Object r2 = r1.A01
            X.4aY r2 = (X.AnonymousClass4aY) r2
            java.lang.Object r7 = r1.A02
            X.1E7 r7 = (X.AnonymousClass1E7) r7
            X.4SA r5 = (X.AnonymousClass4SA) r5
            boolean r0 = r5.A04
            r3 = 1
            if (r0 == 0) goto L_0x0325
            int r1 = r5.A00
            if (r1 == r3) goto L_0x0565
            r0 = 2
            if (r1 == r0) goto L_0x0565
            r0 = 5
            if (r1 == r0) goto L_0x0565
            r0 = 3
            if (r1 != r0) goto L_0x034e
            X.4ZY r8 = r2.A2R
            X.3wW r0 = r8.A04
            if (r0 != 0) goto L_0x02f7
            X.01E r0 = r8.A0C
            X.3wW r1 = new X.3wW
            r1.<init>(r0)
            r1.A00()
            r8.A04 = r1
            android.widget.ListView r0 = r8.A0B
            r0.addFooterView(r1)
        L_0x02f7:
            X.3wW r7 = r8.A04
            X.1BI r6 = r8.A0U
            X.4LT r1 = r8.A0M
            r1.getClass()
            r0 = 48
            X.4rj r4 = new X.4rj
            r4.<init>((java.lang.Object) r1, (int) r0)
            android.view.View r1 = r7.A00
            r0 = 33
            X.C825048f.A00(r1, r7, r0)
            android.view.View r1 = r7.A01
            r0 = 20
            X.AnonymousClass48j.A00(r1, r6, r4, r7, r0)
            android.widget.TextView r1 = r7.A03
            r0 = 2131888844(0x7f120acc, float:1.9412335E38)
            r1.setText(r0)
            X.3wW r0 = r8.A04
            android.view.ViewGroup r1 = r0.A02
            r0 = 0
        L_0x0322:
            r1.setVisibility(r0)
        L_0x0325:
            X.4ZY r6 = r2.A2R
            boolean r0 = r5.A03
            r6.A09 = r0
            boolean r4 = r5.A02
            boolean r0 = r6.A08
            if (r4 == r0) goto L_0x0016
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "conversation/spam/"
            X.C17900vP.A0n(r0, r1, r4)
            r6.A08 = r4
            if (r4 != 0) goto L_0x0016
            X.1Mc r1 = r2.A49
            X.1E7 r0 = r2.A35
            X.1BI r0 = r0.A0J
            X.C17960vV.A07(r0)
            r1.A08(r0, r3)
            X.C73103Oz.A00(r2)
            return
        L_0x034e:
            r0 = 4
            if (r1 != r0) goto L_0x03a9
            X.4ZY r8 = r2.A2R
            X.3wX r0 = r8.A05
            if (r0 != 0) goto L_0x036f
            X.01E r0 = r8.A0C
            X.3wX r4 = new X.3wX
            r4.<init>(r0)
            r4.A00()
            r8.A05 = r4
            X.1QY r1 = r8.A0P
            X.4Qq r0 = r8.A0c
            r4.setup(r1, r0)
            android.widget.ListView r0 = r8.A0B
            r0.addFooterView(r4)
        L_0x036f:
            X.3wX r7 = r8.A05
            X.01E r6 = r8.A0C
            X.1BI r4 = r8.A0U
            java.util.ArrayList r11 = r8.A07
            android.view.ViewGroup r0 = r7.A02
            r10 = 0
            r0.setVisibility(r10)
            android.view.View r1 = r7.A00
            r0 = 47
            X.C825248h.A00(r1, r7, r4, r0)
            android.view.View r1 = r7.A01
            r0 = 21
            X.AnonymousClass48j.A00(r1, r6, r4, r7, r0)
            android.widget.TextView r9 = r7.A03
            X.0vb r8 = r7.A00
            r4 = 2131755190(0x7f1000b6, float:1.9141252E38)
            int r0 = r11.size()
            long r6 = (long) r0
            java.lang.Object[] r1 = new java.lang.Object[r3]
            int r0 = r11.size()
            X.C17880vN.A1T(r1, r0, r10)
            java.lang.String r0 = r8.A0K(r1, r4, r6)
            r9.setText(r0)
            goto L_0x0325
        L_0x03a9:
            r0 = 6
            if (r1 != r0) goto L_0x053b
            X.4ZY r8 = r2.A2R
            java.lang.Boolean r1 = r2.A8J
            boolean r6 = r5.A02
            if (r6 == 0) goto L_0x0465
            boolean r0 = r5.A03
            X.AnonymousClass4ZY.A01(r8, r7, r0)
        L_0x03b9:
            r10 = 0
        L_0x03ba:
            X.3PO r9 = r8.A01
            if (r9 == 0) goto L_0x0403
            X.1BI r12 = r8.A0U
            X.11S r0 = r8.A0G
            boolean r14 = r0.A0N()
            android.view.View r1 = r9.A00
            r13 = 0
            r4 = 8
            int r0 = X.C72453Mb.A0J(r10)
            r1.setVisibility(r0)
            if (r10 == 0) goto L_0x0403
            X.1pj r0 = r9.A04
            com.whatsapp.jid.UserJid r11 = X.C22941Dw.A00(r12)
            boolean r10 = r0.A0P(r11)
            r1 = 2131887168(0x7f120440, float:1.9408935E38)
            if (r10 == 0) goto L_0x03e6
            r1 = 2131897273(0x7f122bb9, float:1.942943E38)
        L_0x03e6:
            android.widget.TextView r0 = r9.A03
            r0.setText(r1)
            if (r10 != 0) goto L_0x03fa
            X.1CJ r0 = r9.A05
            java.lang.String r0 = r0.A0F(r12)
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x03fa
            r13 = 1
        L_0x03fa:
            if (r14 == 0) goto L_0x0445
            if (r13 == 0) goto L_0x043d
            android.view.View r0 = r9.A00
        L_0x0400:
            r0.setVisibility(r4)
        L_0x0403:
            X.5bf r0 = r8.A06
            if (r0 == 0) goto L_0x0414
            X.4PI r1 = X.AnonymousClass4ZY.A00(r5, r8, r7)
            X.5bf r0 = r8.A06
            if (r1 != 0) goto L_0x042e
            if (r0 == 0) goto L_0x0414
            r0.Bd0()
        L_0x0414:
            if (r6 == 0) goto L_0x0325
            boolean r0 = r8.A08
            if (r0 != 0) goto L_0x0325
            X.1Mc r14 = r8.A0X
            X.1BI r13 = r7.A0J
            boolean r12 = r5.A03
            r0 = 0
            X.C18070vi.A0d(r13, r0)
            X.1Mb r15 = r14.A00
            X.11P r0 = r14.A01
            long r6 = X.AnonymousClass11P.A01(r0)
            goto L_0x0500
        L_0x042e:
            r0.CFG(r1)
            X.4PF r0 = r8.A03
            if (r0 == 0) goto L_0x0414
            android.view.View r1 = r0.A02
            r0 = 8
            r1.setVisibility(r0)
            goto L_0x0414
        L_0x043d:
            android.widget.TextView r0 = r9.A02
            r0.setVisibility(r4)
            android.view.View r0 = r9.A01
            goto L_0x0400
        L_0x0445:
            if (r13 == 0) goto L_0x0457
            android.widget.TextView r0 = r9.A03
            r0.setVisibility(r4)
            android.widget.TextView r1 = r9.A02
            r0 = 2131898687(0x7f12313f, float:1.9432299E38)
            r1.setText(r0)
            android.view.View r0 = r9.A01
            goto L_0x0400
        L_0x0457:
            boolean r0 = X.C22971Dz.A0S(r11)
            if (r0 == 0) goto L_0x0403
            android.view.View r0 = r9.A01
            r0.setVisibility(r4)
            android.widget.TextView r0 = r9.A02
            goto L_0x0400
        L_0x0465:
            boolean r0 = r7.A0O()
            if (r0 != 0) goto L_0x03b9
            X.1BI r0 = r7.A0J
            boolean r0 = X.C22971Dz.A0V(r0)
            if (r0 != 0) goto L_0x03b9
            if (r1 == 0) goto L_0x047b
            boolean r0 = r1.booleanValue()
            if (r0 != 0) goto L_0x03b9
        L_0x047b:
            r10 = 1
            X.11S r0 = r8.A0G
            boolean r0 = X.AnonymousClass3Ma.A1V(r0, r7)
            if (r0 != 0) goto L_0x03ba
            X.1BI r0 = r8.A0U
            boolean r0 = r0 instanceof X.AnonymousClass1E2
            if (r0 != 0) goto L_0x03ba
            X.3PO r0 = r8.A01
            if (r0 != 0) goto L_0x03ba
            X.01E r13 = r8.A0C
            X.3PO r11 = new X.3PO
            r11.<init>(r13)
            boolean r0 = r11.A08
            if (r0 != 0) goto L_0x04a9
            r11.A08 = r3
            java.lang.Object r0 = r11.generatedComponent()
            X.10E r0 = X.AnonymousClass3MW.A0O(r0)
            X.1LU r0 = X.AnonymousClass3MY.A0Z(r0)
            r11.A06 = r0
        L_0x04a9:
            r0 = 2131624714(0x7f0e030a, float:1.8876616E38)
            android.view.View.inflate(r13, r0, r11)
            r0 = 2131429510(0x7f0b0886, float:1.8480695E38)
            android.view.View r0 = r11.findViewById(r0)
            r11.A00 = r0
            r0 = 2131430073(0x7f0b0ab9, float:1.8481837E38)
            android.view.View r0 = r11.findViewById(r0)
            r11.A01 = r0
            r0 = 2131427578(0x7f0b00fa, float:1.8476776E38)
            android.widget.TextView r0 = X.C17880vN.A0E(r11, r0)
            r11.A02 = r0
            r0 = 2131428204(0x7f0b036c, float:1.8478046E38)
            android.widget.TextView r0 = X.C17880vN.A0E(r11, r0)
            r11.A03 = r0
            r8.A01 = r11
            X.0ve r12 = r8.A0Q
            X.1CJ r14 = r8.A0N
            X.1FR r15 = r8.A0F
            X.4LT r1 = r8.A0M
            r1.getClass()
            r0 = 40
            X.4rn r4 = new X.4rn
            r4.<init>((java.lang.Object) r1, (int) r0)
            X.1pj r1 = r8.A0H
            X.1oh r0 = r8.A0I
            r18 = r0
            r19 = r7
            r16 = r4
            r17 = r1
            r11.setup(r12, r13, r14, r15, r16, r17, r18, r19)
            android.view.ViewGroup r4 = r8.A0A
            X.3PO r1 = r8.A01
            r0 = 0
            r4.addView(r1, r0)
            goto L_0x03ba
        L_0x0500:
            org.json.JSONObject r4 = X.C24891Mb.A00(r15, r13)     // Catch:{ JSONException -> 0x052f }
            if (r4 != 0) goto L_0x050a
            org.json.JSONObject r4 = X.C17880vN.A15()     // Catch:{ JSONException -> 0x052f }
        L_0x050a:
            java.lang.String r1 = "tb_last_shown_ts"
            boolean r0 = r4.has(r1)     // Catch:{ JSONException -> 0x052f }
            if (r0 == 0) goto L_0x0526
            java.lang.String r8 = "tb_last_action_ts"
            boolean r0 = r4.has(r8)     // Catch:{ JSONException -> 0x052f }
            if (r0 == 0) goto L_0x052d
            long r10 = r4.getLong(r1)     // Catch:{ JSONException -> 0x052f }
            long r8 = r4.getLong(r8)     // Catch:{ JSONException -> 0x052f }
            int r0 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r0 >= 0) goto L_0x052d
        L_0x0526:
            r4.put(r1, r6)     // Catch:{ JSONException -> 0x052f }
            X.C24891Mb.A01(r15, r13, r4)     // Catch:{ JSONException -> 0x052f }
            goto L_0x0531
        L_0x052d:
            r0 = 0
            goto L_0x0532
        L_0x052f:
            r0 = 0
            goto L_0x0532
        L_0x0531:
            r0 = 1
        L_0x0532:
            if (r12 == 0) goto L_0x0325
            if (r0 == 0) goto L_0x0325
            X.C24901Mc.A02(r13, r14, r3)
            goto L_0x0325
        L_0x053b:
            if (r1 != 0) goto L_0x0325
            X.4ZY r4 = r2.A2R
            X.3PO r0 = r4.A01
            r1 = 8
            if (r0 == 0) goto L_0x054a
            android.view.View r0 = r0.A00
            r0.setVisibility(r1)
        L_0x054a:
            X.5bf r0 = r4.A06
            if (r0 == 0) goto L_0x0551
            r0.Bd0()
        L_0x0551:
            X.3wX r0 = r4.A05
            if (r0 == 0) goto L_0x055a
            android.view.ViewGroup r0 = r0.A02
            r0.setVisibility(r1)
        L_0x055a:
            X.3wW r0 = r4.A04
            if (r0 == 0) goto L_0x0325
            android.view.ViewGroup r0 = r0.A02
            r0.setVisibility(r1)
            goto L_0x0325
        L_0x0565:
            X.4ZY r4 = r2.A2R
            boolean r0 = r5.A03
            X.AnonymousClass4ZY.A01(r4, r7, r0)
            X.5bf r0 = r4.A06
            if (r0 == 0) goto L_0x0325
            X.4PI r1 = X.AnonymousClass4ZY.A00(r5, r4, r7)
            X.5bf r0 = r4.A06
            if (r1 != 0) goto L_0x057f
            if (r0 == 0) goto L_0x0325
            r0.Bd0()
            goto L_0x0325
        L_0x057f:
            r0.CFG(r1)
            X.4PF r0 = r4.A03
            if (r0 == 0) goto L_0x0325
            android.view.View r1 = r0.A02
            r0 = 8
            goto L_0x0322
        L_0x058c:
            java.lang.Object r6 = r1.A01
            X.4kt r6 = (X.C94604kt) r6
            java.lang.Object r8 = r1.A02
            com.whatsapp.reactions.ReactionsTrayViewModel r8 = (com.whatsapp.reactions.ReactionsTrayViewModel) r8
            X.4Ry r5 = (X.C86514Ry) r5
            boolean r0 = r5.A02
            if (r0 == 0) goto L_0x0016
            X.206 r7 = r8.A0M
            if (r7 == 0) goto L_0x08f3
            boolean r0 = r7.A0w()
            if (r0 == 0) goto L_0x05b7
            X.206 r1 = r8.A0M
            if (r1 == 0) goto L_0x08ed
            X.11P r0 = r8.A0A
            long r3 = X.AnonymousClass3MZ.A05(r0, r1)
            r1 = 2592000000(0x9a7ec800, double:1.280618154E-314)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x08ed
        L_0x05b7:
            r6.CPY(r7)
            java.lang.String r0 = r5.A01
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r2 = r0 ^ 1
            X.1iW r1 = r6.A06
            java.lang.String r0 = r5.A00
            boolean r0 = r1.A0r(r7, r0, r2)
            if (r0 != 0) goto L_0x0016
            X.1FY r1 = X.C94604kt.A00(r6)
        L_0x05d0:
            r0 = 106(0x6a, float:1.49E-43)
            X.AnonymousClass4Yv.A01(r1, r0)
            return
        L_0x05d6:
            java.lang.Object r3 = r1.A01
            X.3QY r3 = (X.AnonymousClass3QY) r3
            java.lang.Object r2 = r1.A02
            android.content.Context r2 = (android.content.Context) r2
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            boolean r0 = r0.equals(r5)
            if (r0 == 0) goto L_0x0016
            X.1KB r0 = r3.A01
            r0.A04()
            X.1Me r1 = r3.A03
            X.1EC r0 = r3.A05
            java.lang.String r1 = r1.A0Y(r0)
            if (r1 != 0) goto L_0x0606
            r0 = 2131890189(0x7f12100d, float:1.9415063E38)
            java.lang.String r1 = r2.getString(r0)
        L_0x05fc:
            X.00H r0 = r3.A06
            X.1gf r0 = X.AnonymousClass3MX.A0b(r0)
            r0.BhK(r2, r1)
            return
        L_0x0606:
            r0 = 2131890188(0x7f12100c, float:1.941506E38)
            java.lang.String r1 = X.C72473Md.A0j(r2, r1, r0)
            goto L_0x05fc
        L_0x060e:
            java.lang.Object r3 = r1.A01
            com.whatsapp.community.CommunityHomeActivity r3 = (com.whatsapp.community.CommunityHomeActivity) r3
            java.lang.Object r1 = r1.A02
            X.4SG r1 = (X.AnonymousClass4SG) r1
            X.4EK r5 = (X.AnonymousClass4EK) r5
            r3.CEx()
            boolean r0 = r5 instanceof X.C77103pN
            if (r0 == 0) goto L_0x0627
            X.3pN r5 = (X.C77103pN) r5
            X.1EC r0 = r3.A0j
            r1.A01(r5, r0)
            return
        L_0x0627:
            boolean r0 = r5 instanceof X.C77123pP
            if (r0 == 0) goto L_0x0635
            r1 = 2131893532(0x7f121d1c, float:1.9421843E38)
            r0 = 2131895077(0x7f122325, float:1.9424977E38)
            r3.CNB(r1, r0)
            return
        L_0x0635:
            boolean r0 = r5 instanceof X.C77083pL
            if (r0 == 0) goto L_0x0653
            X.3pL r5 = (X.C77083pL) r5
            X.1KB r2 = r3.A05
            boolean r0 = X.AnonymousClass11E.A02(r3)
            r1 = 2131892439(0x7f1218d7, float:1.9419626E38)
            if (r0 == 0) goto L_0x0649
            r1 = 2131892440(0x7f1218d8, float:1.9419628E38)
        L_0x0649:
            r0 = 0
            r2.A08(r1, r0)
            X.0vk r0 = r5.A00
            r0.invoke()
            return
        L_0x0653:
            boolean r0 = r5 instanceof X.C77093pM
            if (r0 == 0) goto L_0x0016
            X.3pM r5 = (X.C77093pM) r5
            r1.A00(r5)
            return
        L_0x065d:
            java.lang.Object r4 = r1.A01
            com.whatsapp.calling.dialogs.EndCallConfirmationDialogFragment r4 = (com.whatsapp.calling.dialogs.EndCallConfirmationDialogFragment) r4
            java.lang.Object r3 = r1.A02
            android.content.Context r3 = (android.content.Context) r3
            boolean r0 = r4.A1b()
            if (r0 == 0) goto L_0x0016
            X.1F9 r0 = r4.A01
            X.1Fv r0 = r0.getLifecycle()
            X.1Fw r0 = (X.C23391Fw) r0
            X.1Fx r1 = r0.A02
            X.1Fx r0 = X.C23401Fx.RESUMED
            boolean r0 = r1.A00(r0)
            if (r0 == 0) goto L_0x0016
            X.00H r0 = r4.A00
            if (r0 == 0) goto L_0x08f8
            android.content.Intent r2 = X.AnonymousClass3MZ.A06(r0)
            java.lang.String r1 = r3.getPackageName()
            java.lang.String r0 = "com.whatsapp.voipcalling.VoipActivityV2"
            r2.setClassName(r1, r0)
            java.lang.String r0 = X.AnonymousClass6Z8.A03
            r2.setAction(r0)
            r0 = 268435456(0x10000000, float:2.5243549E-29)
            r2.setFlags(r0)
            r4.A1k(r2)
            r4.A29()
            return
        L_0x069f:
            java.lang.Object r4 = r1.A01
            X.1FP r4 = (X.AnonymousClass1FP) r4
            java.lang.Object r3 = r1.A02
            android.content.DialogInterface r5 = (android.content.DialogInterface) r5
            X.10I r2 = r4.A05
            r1 = 36
            X.AkP r0 = new X.AkP
            r0.<init>(r4, r3, r1)
            r2.CGN(r0)
            goto L_0x0837
        L_0x06b5:
            java.lang.Object r3 = r1.A01
            com.whatsapp.newsletter.NewsletterInfoActivity r3 = (com.whatsapp.newsletter.NewsletterInfoActivity) r3
            java.lang.Object r0 = r1.A02
            X.4Yb r0 = (X.C88034Yb) r0
            android.content.DialogInterface r5 = (android.content.DialogInterface) r5
            java.lang.Integer r0 = r0.A02
            int r1 = r0.intValue()
            r2 = 1
            r0 = 3
            if (r1 == r0) goto L_0x0707
            r0 = 2
            if (r1 == r0) goto L_0x0702
            if (r1 == r2) goto L_0x06f5
            r0 = 0
            if (r1 == r0) goto L_0x06e9
            r0 = 6
            if (r1 != r0) goto L_0x0837
            X.3VG r1 = r3.A0j
            if (r1 != 0) goto L_0x06dc
            java.lang.String r0 = "newsletterInsightsViewModel"
            goto L_0x08fd
        L_0x06dc:
            X.0vl r0 = r3.A1M
            java.lang.Object r0 = r0.getValue()
            java.util.Set r0 = (java.util.Set) r0
            r1.A0V(r0, r2)
            goto L_0x0837
        L_0x06e9:
            androidx.appcompat.widget.SwitchCompat r0 = r3.A0A
            if (r0 == 0) goto L_0x0837
            r0.setSelected(r2)
            com.whatsapp.newsletter.NewsletterInfoActivity.A17(r3)
            goto L_0x0837
        L_0x06f5:
            r1 = 0
            androidx.appcompat.widget.SwitchCompat r0 = r3.A0A
            if (r0 == 0) goto L_0x0837
            r0.setSelected(r1)
            com.whatsapp.newsletter.NewsletterInfoActivity.A1C(r3)
            goto L_0x0837
        L_0x0702:
            com.whatsapp.newsletter.NewsletterInfoActivity.A15(r3)
            goto L_0x0837
        L_0x0707:
            com.whatsapp.newsletter.NewsletterInfoActivity.A1B(r3)
            goto L_0x0837
        L_0x070c:
            java.lang.Object r3 = r1.A01
            com.whatsapp.profile.ProfileInfoActivity r3 = (com.whatsapp.profile.ProfileInfoActivity) r3
            java.lang.Object r6 = r1.A02
            java.lang.String r5 = (java.lang.String) r5
            boolean r4 = r5.isEmpty()
            com.whatsapp.profile.ProfileSettingsRowIconText r1 = r3.A0O
            if (r4 == 0) goto L_0x0758
            r0 = 2131894808(0x7f122218, float:1.9424431E38)
            java.lang.String r0 = r3.getString(r0)
            r1.setSubText(r0)
        L_0x0726:
            X.0ve r1 = r3.A0E
            r0 = 4747(0x128b, float:6.652E-42)
            X.0vf r2 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r2, r1, r0)
            if (r0 != 0) goto L_0x073e
            if (r4 == 0) goto L_0x074e
            X.0ve r1 = r3.A0E
            r0 = 4745(0x1289, float:6.649E-42)
            boolean r0 = X.C18020vd.A05(r2, r1, r0)
            if (r0 == 0) goto L_0x074e
        L_0x073e:
            com.whatsapp.profile.ProfileSettingsRowIconText r1 = r3.A0O
            r0 = 20
            X.C90024dP.A00(r1, r3, r6, r0)
            com.whatsapp.profile.ProfileSettingsRowIconText r1 = r3.A0O
            r0 = 2131231874(0x7f080482, float:1.8079841E38)
        L_0x074a:
            r1.setSecondaryIcon(r0)
            return
        L_0x074e:
            com.whatsapp.profile.ProfileSettingsRowIconText r1 = r3.A0O
            r0 = 0
            r1.setOnClickListener(r0)
            com.whatsapp.profile.ProfileSettingsRowIconText r1 = r3.A0O
            r0 = 0
            goto L_0x074a
        L_0x0758:
            r1.setSubText(r5)
            goto L_0x0726
        L_0x075c:
            java.lang.Object r3 = r1.A01
            com.whatsapp.newsletter.insights.NewsletterInsightsActivity r3 = (com.whatsapp.newsletter.insights.NewsletterInsightsActivity) r3
            java.lang.Object r0 = r1.A02
            X.4Yb r0 = (X.C88034Yb) r0
            android.content.DialogInterface r5 = (android.content.DialogInterface) r5
            java.lang.Integer r0 = r0.A02
            int r2 = r0.intValue()
            r1 = 1
            r0 = 6
            if (r2 != r0) goto L_0x0837
            com.whatsapp.newsletter.insights.NewsletterInsightsActivity.A03(r3, r1)
            goto L_0x0837
        L_0x0775:
            java.lang.Object r3 = r1.A01
            com.whatsapp.group.GroupProfileEmojiEditor r3 = (com.whatsapp.group.GroupProfileEmojiEditor) r3
            java.lang.Object r2 = r1.A02
            X.1z6 r2 = (X.C43011z6) r2
            java.lang.Number r5 = (java.lang.Number) r5
            X.1VU r1 = r3.A07
            int r0 = r5.intValue()
            android.graphics.drawable.Drawable r1 = r1.A02(r2, r0)
            android.widget.ImageView r0 = r3.A04
            r0.setBackground(r1)
            return
        L_0x078f:
            java.lang.Object r2 = r1.A01
            com.whatsapp.mediacomposer.ui.caption.CaptionFragment r2 = (com.whatsapp.mediacomposer.ui.caption.CaptionFragment) r2
            java.lang.Object r3 = r1.A02
            com.whatsapp.gallery.selectedmedia.SelectedMediaCaptionFragment r3 = (com.whatsapp.gallery.selectedmedia.SelectedMediaCaptionFragment) r3
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r1 = r5.intValue()
            r10 = 0
            r2.A2B(r5)
            X.00H r0 = r3.A06
            if (r0 == 0) goto L_0x08fb
            java.lang.Object r4 = r0.get()
            X.4Ql r4 = (X.AnonymousClass4Ql) r4
            r0 = 3
            boolean r9 = X.AnonymousClass000.A1T(r1, r0)
            X.1GP r5 = r2.A1E()
            com.whatsapp.mediacomposer.ui.caption.CaptionView r0 = r2.A26()
            int r0 = r0.getCaptionTop()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r0)
            X.0vl r0 = r3.A0A
            java.lang.Object r0 = r0.getValue()
            com.whatsapp.mediacomposer.viewmodel.MediaJidViewModel r0 = (com.whatsapp.mediacomposer.viewmodel.MediaJidViewModel) r0
            X.6kY r0 = r0.A0T()
            java.util.List r8 = r0.A06
            android.content.Context r1 = r2.A1n()
            if (r1 == 0) goto L_0x07df
            r0 = 2131897904(0x7f122e30, float:1.943071E38)
            java.lang.String r7 = r1.getString(r0)
        L_0x07db:
            r4.A00(r5, r6, r7, r8, r9, r10)
            return
        L_0x07df:
            r7 = 0
            goto L_0x07db
        L_0x07e1:
            java.lang.Object r4 = r1.A01
            com.whatsapp.dialogs.DeleteOrArchiveChatDialog r4 = (com.whatsapp.dialogs.DeleteOrArchiveChatDialog) r4
            java.lang.Object r3 = r1.A02
            r4.A28()
            X.1FL r0 = r4.A1D()
            r0.finish()
            X.10I r2 = r4.A04
            r1 = 34
            X.3Ch r0 = new X.3Ch
            r0.<init>(r3, r4, r1)
            r2.CGF(r0)
            return
        L_0x07fe:
            java.lang.Object r2 = r1.A01
            X.3sq r2 = (X.C78463sq) r2
            java.lang.Object r0 = r1.A02
            X.2Dk r0 = (X.C46162Dk) r0
            X.C78463sq.A04(r2, r0)
            return
        L_0x080a:
            java.lang.Object r2 = r1.A01
            X.3u1 r2 = (X.C78973u1) r2
            java.lang.Object r0 = r1.A02
            X.01E r0 = (X.AnonymousClass01E) r0
            X.4EP r5 = (X.AnonymousClass4EP) r5
            r2.A2j(r0, r5)
            return
        L_0x0818:
            java.lang.Object r3 = r1.A01
            X.3rb r3 = (X.C77853rb) r3
            java.lang.Object r0 = r1.A02
            X.4Yb r0 = (X.C88034Yb) r0
            android.content.DialogInterface r5 = (android.content.DialogInterface) r5
            java.lang.Integer r0 = r0.A02
            int r2 = r0.intValue()
            r0 = 2
            if (r2 == r0) goto L_0x0843
            r1 = 0
            if (r2 == r1) goto L_0x083f
            r0 = 1
            if (r2 == r0) goto L_0x083b
            r0 = 3
            if (r2 != r0) goto L_0x0837
            X.C77853rb.A07(r3)
        L_0x0837:
            r5.dismiss()
            return
        L_0x083b:
            X.C77853rb.A0B(r3, r1)
            goto L_0x0837
        L_0x083f:
            X.C77853rb.A09(r3, r1)
            goto L_0x0837
        L_0x0843:
            X.C77853rb.A06(r3)
            goto L_0x0837
        L_0x0847:
            java.lang.Object r2 = r1.A01
            com.whatsapp.conversation.ConversationEntryActionButton r2 = (com.whatsapp.conversation.ConversationEntryActionButton) r2
            java.lang.Object r0 = r1.A02
            X.4Yl[] r0 = (X.C88134Yl[]) r0
            X.4Yl r5 = (X.C88134Yl) r5
            r2.A03(r5, r0)
            return
        L_0x0855:
            java.lang.Object r3 = r1.A01
            com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManagementActivity r3 = (com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManagementActivity) r3
            java.lang.Object r0 = r1.A02
            X.3pi r0 = (X.C77243pi) r0
            r2 = 1
            com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManagementViewModel r1 = X.AnonymousClass3Ma.A0Q(r3)
            X.4Cp r0 = r0.A02
            r1.A0T(r0, r2)
            return
        L_0x0868:
            java.lang.Object r2 = r1.A01
            android.os.Bundle r2 = (android.os.Bundle) r2
            java.lang.Object r0 = r1.A02
            com.whatsapp.chatlock.dialogs.ClearLockedChatsDialogFragment r0 = (com.whatsapp.chatlock.dialogs.ClearLockedChatsDialogFragment) r0
            com.whatsapp.chatlock.dialogs.ClearLockedChatsDialogFragment.A01(r2, r0)
            return
        L_0x0874:
            java.lang.Object r2 = r1.A01
            android.os.Bundle r2 = (android.os.Bundle) r2
            java.lang.Object r0 = r1.A02
            com.whatsapp.chatlock.dialogs.ClearLockedChatsDialogFragment r0 = (com.whatsapp.chatlock.dialogs.ClearLockedChatsDialogFragment) r0
            com.whatsapp.chatlock.dialogs.ClearLockedChatsDialogFragment.A00(r2, r0)
            return
        L_0x0880:
            java.lang.Object r2 = r1.A01
            android.os.Bundle r2 = (android.os.Bundle) r2
            java.lang.Object r0 = r1.A02
            com.whatsapp.chatlock.dialogs.ChatsAreLockedDialogFragment r0 = (com.whatsapp.chatlock.dialogs.ChatsAreLockedDialogFragment) r0
            com.whatsapp.chatlock.dialogs.ChatsAreLockedDialogFragment.A01(r2, r0)
            return
        L_0x088c:
            java.lang.Object r2 = r1.A01
            android.os.Bundle r2 = (android.os.Bundle) r2
            java.lang.Object r0 = r1.A02
            com.whatsapp.chatlock.dialogs.ChatsAreLockedDialogFragment r0 = (com.whatsapp.chatlock.dialogs.ChatsAreLockedDialogFragment) r0
            com.whatsapp.chatlock.dialogs.ChatsAreLockedDialogFragment.A00(r2, r0)
            return
        L_0x0898:
            java.lang.IllegalStateException r0 = X.C17880vN.A0g()
            throw r0
        L_0x089d:
            X.AnonymousClass4aY.A0i(r6)
            X.4aI r5 = X.C88444Zs.A01(r6)
            com.whatsapp.jid.UserJid r4 = X.AnonymousClass3MW.A0j(r6)
            r2 = 0
            r1 = 12
            r0 = 1
            X.C88654aI.A03(r5, r4, r2, r1, r0)
            boolean r0 = r3.A05
            if (r0 == 0) goto L_0x08c7
            X.4VR r0 = r6.A2q
            X.4XK r2 = r0.A0R
            X.3zN r1 = new X.3zN
            r1.<init>()
            java.lang.Integer r0 = X.AnonymousClass3MY.A0f()
            r1.A03 = r0
            X.18K r0 = r2.A00
            r0.CC7(r1)
        L_0x08c7:
            X.1bI r0 = r6.A4S
            X.C72463Mc.A1G(r0)
            X.4TX r5 = X.C88444Zs.A02(r6)
            java.lang.String r4 = "preview_load_fail"
            boolean r0 = r3.A04
            r3 = 1029386189(0x3d5b2fcd, float:0.053512383)
            r2 = 3
            if (r0 == 0) goto L_0x08e4
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "icebreaker_"
            java.lang.String r4 = X.AnonymousClass001.A1H(r0, r4, r1)
        L_0x08e4:
            r5.A02(r4, r2)
            X.19Y r0 = r5.A00
            r0.markerPoint(r3, r4)
            return
        L_0x08ed:
            X.1vp r0 = r8.A0G
            X.C72463Mc.A1B(r0)
            return
        L_0x08f3:
            java.lang.IllegalStateException r0 = X.C17880vN.A0g()
            throw r0
        L_0x08f8:
            java.lang.String r0 = "waIntents"
            goto L_0x08fd
        L_0x08fb:
            java.lang.String r0 = "viewOnceUIHelper"
        L_0x08fd:
            X.C18070vi.A11(r0)
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C91494fm.Bo9(java.lang.Object):void");
    }
}
