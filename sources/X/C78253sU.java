package X;

/* renamed from: X.3sU  reason: invalid class name and case insensitive filesystem */
public final class C78253sU extends AnonymousClass3uP {
    public C40751vD A00;
    public boolean A01;

    public int getBubbleAlpha() {
        return 191;
    }

    public int getUserNameInGroupLayoutOption() {
        return 1;
    }

    public void A1M() {
        if (!this.A01) {
            this.A01 = true;
            C27691Xc A0O = AnonymousClass3MY.A0O(this);
            AnonymousClass10E r3 = A0O.A10;
            AnonymousClass1K1 A0n = AnonymousClass3uQ.A0n(r3, A0O, this);
            AnonymousClass10G r1 = r3.A00;
            AnonymousClass3uQ.A16(r1, this);
            AnonymousClass3uQ.A0w(A0n, r3, r1, this);
            AnonymousClass3uQ.A12(r3, r1, this);
            AnonymousClass3uQ.A0y(A0n, r3, this, BE8.A0d(r3));
            AnonymousClass3uQ.A13(r3, r1, this, r3.ABq);
            AnonymousClass3uQ.A0x(A0n, r3, r1, this, r3.AIy);
            C19890zB r0 = C19890zB.A00;
            AnonymousClass3uQ.A0v(r0, r3, r1, A0O, this);
            AnonymousClass3uQ.A11(r3, r1, this);
            AnonymousClass3uQ.A15(r3, this);
            AnonymousClass3uQ.A0s(r0, A0n, r3, r1, this);
            AnonymousClass3uQ.A0u(r0, r3, r1, A0O, this);
            AnonymousClass3uQ.A0t(r0, A0n, r3, A0O, this);
            AnonymousClass3uQ.A10(r3, r1, this);
            AnonymousClass3uQ.A0z(r3, r1, A0O, this, AnonymousClass3uQ.A0o(r3));
            this.A00 = (C40751vD) r3.AB7.get();
        }
    }

    public boolean A2X() {
        if (this.A0E.A0R(getFMessage().A0v.A00)) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00f1, code lost:
        r5 = 2131888629;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0152, code lost:
        if (X.C18020vd.A05(X.C18040vf.A02, r6.A0F, 5563) == false) goto L_0x0154;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0175, code lost:
        if (r1 != 10003) goto L_0x0177;
     */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0078  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0081  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x009e  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0112  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0117  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x011c  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0121  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0126  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x012b  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0130  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C78253sU(android.content.Context r7, X.C108875cR r8, X.AnonymousClass206 r9) {
        /*
            r6 = this;
            r6.<init>(r7, r8, r9)
            r6.A1M()
            r0 = 2131432683(0x7f0b14eb, float:1.848713E38)
            android.view.View r4 = r6.findViewById(r0)
            com.whatsapp.TextEmojiLabel r4 = (com.whatsapp.TextEmojiLabel) r4
            X.0ve r0 = r6.A0F
            boolean r0 = X.C72483Me.A1A(r4, r0)
            r4.setLongClickable(r0)
            X.11S r0 = r6.A0U
            boolean r3 = r0.A0N()
            X.205 r0 = r9.A0v
            boolean r2 = r0.A02
            boolean r0 = X.AnonymousClass25A.A0l(r9)
            if (r0 != 0) goto L_0x0041
            boolean r0 = r9 instanceof X.C438721g
            if (r0 == 0) goto L_0x0135
            r0 = r9
            X.21g r0 = (X.C438721g) r0
            X.AEb r0 = r0.A00
            if (r0 == 0) goto L_0x0135
            X.AE2 r0 = r0.A01
            if (r0 == 0) goto L_0x0135
            java.lang.String r1 = r0.A01
            java.lang.String r0 = "galaxy_message"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0135
        L_0x0041:
            r5 = 1
        L_0x0042:
            r1 = 0
            r0 = 0
            if (r2 == 0) goto L_0x0048
            r0 = 2097152(0x200000, float:2.938736E-39)
        L_0x0048:
            if (r3 == 0) goto L_0x004c
            r1 = 1048576(0x100000, float:1.469368E-39)
        L_0x004c:
            r0 = r0 | r5
            r0 = r0 | r1
            switch(r0) {
                case 0: goto L_0x0078;
                case 1: goto L_0x0078;
                case 2: goto L_0x0112;
                case 3: goto L_0x0117;
                case 4: goto L_0x011c;
                case 5: goto L_0x0121;
                case 6: goto L_0x0126;
                case 7: goto L_0x012b;
                case 8: goto L_0x0130;
                default: goto L_0x0051;
            }
        L_0x0051:
            switch(r0) {
                case 1048576: goto L_0x00f9;
                case 1048577: goto L_0x00f1;
                case 1048578: goto L_0x00f5;
                case 1048579: goto L_0x00f9;
                case 1048580: goto L_0x00f9;
                case 1048581: goto L_0x00fe;
                case 1048582: goto L_0x0103;
                case 1048583: goto L_0x0108;
                case 1048584: goto L_0x010d;
                default: goto L_0x0054;
            }
        L_0x0054:
            switch(r0) {
                case 2097152: goto L_0x00d1;
                case 2097153: goto L_0x00d1;
                case 2097154: goto L_0x00d5;
                case 2097155: goto L_0x00d9;
                case 2097156: goto L_0x00dd;
                case 2097157: goto L_0x00e1;
                case 2097158: goto L_0x00e5;
                case 2097159: goto L_0x00e9;
                case 2097160: goto L_0x00ed;
                default: goto L_0x0057;
            }
        L_0x0057:
            switch(r0) {
                case 3145728: goto L_0x00bd;
                case 3145729: goto L_0x00f1;
                case 3145730: goto L_0x00b9;
                case 3145731: goto L_0x00bd;
                case 3145732: goto L_0x00bd;
                case 3145733: goto L_0x00c1;
                case 3145734: goto L_0x00c5;
                case 3145735: goto L_0x00c9;
                case 3145736: goto L_0x00cd;
                default: goto L_0x005a;
            }
        L_0x005a:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "ConversationRowFuture/unhandled future message type: fromMe: "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = "; isCompanion: "
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = "; type: "
            java.lang.String r1 = X.AnonymousClass001.A1I(r0, r1, r5)
            r0 = 0
            X.C17960vV.A0F(r0, r1)
        L_0x0078:
            r5 = 2131890594(0x7f1211a2, float:1.9415884E38)
        L_0x007b:
            android.content.Context r2 = r6.getContext()
            if (r3 == 0) goto L_0x009e
            java.lang.String r0 = r2.getString(r5)
        L_0x0085:
            android.text.Spanned r0 = android.text.Html.fromHtml(r0)
            android.text.SpannableString r2 = android.text.SpannableString.valueOf(r0)
            r6.A28(r2)
            X.11C r1 = r6.A0C
            X.1t2 r0 = new X.1t2
            r0.<init>(r4, r1)
            r4.setAccessibilityHelper(r0)
            r4.setText(r2)
            return
        L_0x009e:
            X.1vD r1 = r6.A00
            X.00H r0 = r6.A1q
            java.lang.Object r0 = r0.get()
            X.1o3 r0 = (X.C36531o3) r0
            X.C18070vi.A0h(r1, r0)
            android.net.Uri r1 = r1.A03()
            X.C18070vi.A0X(r1)
            X.6kd r0 = X.C1404271j.A08
            java.lang.String r0 = r0.A00(r2, r1, r5)
            goto L_0x0085
        L_0x00b9:
            r5 = 2131888633(0x7f1209f9, float:1.9411907E38)
            goto L_0x007b
        L_0x00bd:
            r5 = 2131888631(0x7f1209f7, float:1.9411903E38)
            goto L_0x007b
        L_0x00c1:
            r5 = 2131890572(0x7f12118c, float:1.941584E38)
            goto L_0x007b
        L_0x00c5:
            r5 = 2131890584(0x7f121198, float:1.9415864E38)
            goto L_0x007b
        L_0x00c9:
            r5 = 2131890588(0x7f12119c, float:1.9415872E38)
            goto L_0x007b
        L_0x00cd:
            r5 = 2131890580(0x7f121194, float:1.9415856E38)
            goto L_0x007b
        L_0x00d1:
            r5 = 2131890593(0x7f1211a1, float:1.9415882E38)
            goto L_0x007b
        L_0x00d5:
            r5 = 2131890598(0x7f1211a6, float:1.9415892E38)
            goto L_0x007b
        L_0x00d9:
            r5 = 2131894574(0x7f12212e, float:1.9423957E38)
            goto L_0x007b
        L_0x00dd:
            r5 = 2131890577(0x7f121191, float:1.941585E38)
            goto L_0x007b
        L_0x00e1:
            r5 = 2131890573(0x7f12118d, float:1.9415842E38)
            goto L_0x007b
        L_0x00e5:
            r5 = 2131890585(0x7f121199, float:1.9415866E38)
            goto L_0x007b
        L_0x00e9:
            r5 = 2131890589(0x7f12119d, float:1.9415874E38)
            goto L_0x007b
        L_0x00ed:
            r5 = 2131890581(0x7f121195, float:1.9415858E38)
            goto L_0x007b
        L_0x00f1:
            r5 = 2131888629(0x7f1209f5, float:1.9411899E38)
            goto L_0x007b
        L_0x00f5:
            r5 = 2131888632(0x7f1209f8, float:1.9411905E38)
            goto L_0x007b
        L_0x00f9:
            r5 = 2131888630(0x7f1209f6, float:1.94119E38)
            goto L_0x007b
        L_0x00fe:
            r5 = 2131890571(0x7f12118b, float:1.9415838E38)
            goto L_0x007b
        L_0x0103:
            r5 = 2131890583(0x7f121197, float:1.9415862E38)
            goto L_0x007b
        L_0x0108:
            r5 = 2131890587(0x7f12119b, float:1.941587E38)
            goto L_0x007b
        L_0x010d:
            r5 = 2131890579(0x7f121193, float:1.9415854E38)
            goto L_0x007b
        L_0x0112:
            r5 = 2131890599(0x7f1211a7, float:1.9415894E38)
            goto L_0x007b
        L_0x0117:
            r5 = 2131894573(0x7f12212d, float:1.9423955E38)
            goto L_0x007b
        L_0x011c:
            r5 = 2131890578(0x7f121192, float:1.9415852E38)
            goto L_0x007b
        L_0x0121:
            r5 = 2131890574(0x7f12118e, float:1.9415844E38)
            goto L_0x007b
        L_0x0126:
            r5 = 2131890586(0x7f12119a, float:1.9415868E38)
            goto L_0x007b
        L_0x012b:
            r5 = 2131890590(0x7f12119e, float:1.9415876E38)
            goto L_0x007b
        L_0x0130:
            r5 = 2131890582(0x7f121196, float:1.941586E38)
            goto L_0x007b
        L_0x0135:
            boolean r0 = r9.A0w()
            if (r0 == 0) goto L_0x013e
            r5 = 2
            goto L_0x0042
        L_0x013e:
            boolean r0 = r9 instanceof X.AnonymousClass23U
            if (r0 != 0) goto L_0x0157
            int r1 = r9.A0u
            r0 = 92
            if (r1 != r0) goto L_0x0177
            X.0ve r5 = r6.A0F
            r1 = 5563(0x15bb, float:7.795E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r5, r1)
            if (r0 != 0) goto L_0x0177
        L_0x0154:
            r5 = 6
            goto L_0x0042
        L_0x0157:
            X.23U r9 = (X.AnonymousClass23U) r9
            int r1 = r9.A00
            r0 = 74
            if (r1 == r0) goto L_0x0187
            r0 = 79
            if (r1 == r0) goto L_0x0184
            r0 = 81
            if (r1 == r0) goto L_0x0181
            r0 = 83
            if (r1 == r0) goto L_0x0154
            r0 = 85
            if (r1 == r0) goto L_0x017e
            r0 = 10001(0x2711, float:1.4014E-41)
            if (r1 == r0) goto L_0x017a
            r0 = 10003(0x2713, float:1.4017E-41)
            if (r1 == r0) goto L_0x0041
        L_0x0177:
            r5 = 0
            goto L_0x0042
        L_0x017a:
            r5 = 8
            goto L_0x0042
        L_0x017e:
            r5 = 7
            goto L_0x0042
        L_0x0181:
            r5 = 5
            goto L_0x0042
        L_0x0184:
            r5 = 3
            goto L_0x0042
        L_0x0187:
            r5 = 4
            goto L_0x0042
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C78253sU.<init>(android.content.Context, X.5cR, X.206):void");
    }

    public int getCenteredLayoutId() {
        return 2131624951;
    }

    public int getIncomingLayoutId() {
        return 2131624951;
    }

    public int getOutgoingLayoutId() {
        return 2131624952;
    }
}
