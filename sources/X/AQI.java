package X;

public final class AQI implements C22439B7v {
    public final AnonymousClass1PM A00;
    public final AnonymousClass1QO A01;
    public final C30921ej A02;
    public final AnonymousClass1R2 A03;
    public final AnonymousClass00H A04;
    public final C18030ve A05;
    public final AnonymousClass1QS A06;

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x004d, code lost:
        if (r0 != false) goto L_0x004f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00c5, code lost:
        if (r3 < 2) goto L_0x00c7;
     */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00a7  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0114  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0145  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0160  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0175  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean A00(X.C20279AEn r12, X.AnonymousClass206 r13, java.util.List r14) {
        /*
            r11 = this;
            r0 = 3
            java.util.ArrayList r9 = X.C17880vN.A0z(r0)
            X.1R2 r0 = r11.A03
            java.util.HashSet r6 = r0.A0g(r12, r13)
            com.whatsapp.jid.UserJid r1 = X.AnonymousClass8BT.A0K(r13)
            r7 = 0
            if (r1 == 0) goto L_0x0178
            boolean r0 = X.C108965cb.A1Z(r6, r7)
            r5 = -1
            r4 = 1
            if (r0 == 0) goto L_0x005c
            X.1QO r0 = r11.A01
            X.0ve r3 = r0.A02
            r2 = 7102(0x1bbe, float:9.952E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r3, r2)
            if (r0 == 0) goto L_0x005c
            X.1QS r0 = r11.A06
            X.1KH r3 = X.AnonymousClass8BR.A0R(r0)
            monitor-enter(r3)
            r0 = 0
            X.8pI r2 = r3.A06(r1, r0)     // Catch:{ all -> 0x0059 }
            monitor-exit(r3)
            r3 = 1
            java.lang.String r0 = "cards"
            r9.add(r0)
            java.lang.Integer r10 = X.AnonymousClass00R.A0C
            r8 = 2131888286(0x7f12089e, float:1.9411203E38)
            if (r2 == 0) goto L_0x004f
            java.lang.String r2 = r2.A04
            if (r2 == 0) goto L_0x004f
            java.lang.String r0 = "active"
            boolean r0 = android.text.TextUtils.equals(r2, r0)
            r2 = 1
            if (r0 == 0) goto L_0x0050
        L_0x004f:
            r2 = 0
        L_0x0050:
            X.A1r r0 = new X.A1r
            r0.<init>(r10, r8, r5, r2)
            r14.add(r0)
            goto L_0x005d
        L_0x0059:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        L_0x005c:
            r3 = 0
        L_0x005d:
            r0 = 6
            boolean r0 = X.C108965cb.A1Z(r6, r0)
            if (r0 == 0) goto L_0x00a4
            X.1QO r0 = r11.A01
            X.0ve r8 = r0.A02
            r0 = 7101(0x1bbd, float:9.95E-42)
            X.0vf r2 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r2, r8, r0)
            if (r0 == 0) goto L_0x00a4
            int r3 = r3 + 1
            java.lang.String r0 = "pix_dynamic_code"
            r9.add(r0)
            r8 = 2131888297(0x7f1208a9, float:1.9411225E38)
            boolean r0 = r12.A08()
            if (r0 == 0) goto L_0x0094
            X.1PM r0 = r11.A00
            boolean r0 = r0.A04(r1)
            if (r0 != 0) goto L_0x0171
            X.0ve r1 = r11.A05
            r0 = 10566(0x2946, float:1.4806E-41)
            boolean r0 = X.C18020vd.A05(r2, r1, r0)
            if (r0 == 0) goto L_0x0171
        L_0x0094:
            r8 = 2131889051(0x7f120b9b, float:1.9412755E38)
            java.lang.Integer r2 = X.AnonymousClass00R.A06
        L_0x0099:
            r1 = 2131231835(0x7f08045b, float:1.8079762E38)
            X.A1r r0 = new X.A1r
            r0.<init>(r2, r8, r1, r7)
            r14.add(r0)
        L_0x00a4:
            r10 = 2
            if (r3 >= r10) goto L_0x00e6
            r0 = 5
            boolean r0 = X.C108965cb.A1Z(r6, r0)
            if (r0 == 0) goto L_0x00c7
            int r3 = r3 + 1
            java.lang.String r0 = "payment_link"
            r9.add(r0)
            java.lang.Integer r8 = X.AnonymousClass00R.A05
            r2 = 2131888295(0x7f1208a7, float:1.9411221E38)
            r1 = 2131231636(0x7f080394, float:1.8079359E38)
            X.A1r r0 = new X.A1r
            r0.<init>(r8, r2, r1, r7)
            r14.add(r0)
            if (r3 >= r10) goto L_0x00e6
        L_0x00c7:
            r0 = 8
            boolean r0 = X.C108965cb.A1Z(r6, r0)
            if (r0 == 0) goto L_0x00e6
            int r3 = r3 + 1
            java.lang.String r0 = "boleto"
            r9.add(r0)
            java.lang.Integer r8 = X.AnonymousClass00R.A07
            r2 = 2131888292(0x7f1208a4, float:1.9411215E38)
            r1 = 2131231835(0x7f08045b, float:1.8079762E38)
            X.A1r r0 = new X.A1r
            r0.<init>(r8, r2, r1, r7)
            r14.add(r0)
        L_0x00e6:
            java.lang.String r8 = r12.A0J
            if (r8 == 0) goto L_0x0132
            int r0 = r8.length()
            if (r0 == 0) goto L_0x0132
            int r0 = r9.size()
            if (r0 < r10) goto L_0x0132
            int r1 = r9.size()
            int r0 = r14.size()
            if (r1 != r0) goto L_0x0132
            X.1ej r0 = r11.A02
            X.1ei r0 = r0.A00()
            if (r0 == 0) goto L_0x0132
            X.0ve r2 = r0.A00
            r1 = 12476(0x30bc, float:1.7483E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 != r4) goto L_0x0132
            java.util.Iterator r2 = r9.iterator()
            r1 = 0
        L_0x0119:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0132
            java.lang.Object r0 = r2.next()
            boolean r0 = X.C18070vi.A18(r0, r8)
            if (r0 == 0) goto L_0x016e
            if (r1 <= 0) goto L_0x0132
            java.lang.Object r0 = r14.remove(r1)
            r14.add(r7, r0)
        L_0x0132:
            int r0 = r6.size()
            if (r0 <= r3) goto L_0x0152
            if (r3 <= 0) goto L_0x0152
            X.1QO r0 = r11.A01
            boolean r0 = X.AnonymousClass8BU.A1R(r0)
            r2 = 2131888281(0x7f120899, float:1.9411193E38)
            if (r0 == 0) goto L_0x0148
            r2 = 2131888302(0x7f1208ae, float:1.9411235E38)
        L_0x0148:
            java.lang.Integer r1 = X.AnonymousClass00R.A0N
            X.A1r r0 = new X.A1r
            r0.<init>(r1, r2, r5, r7)
            r14.add(r0)
        L_0x0152:
            int r0 = r6.size()
            if (r0 != 0) goto L_0x0175
            X.1QO r0 = r11.A01
            boolean r0 = X.AnonymousClass8BU.A1R(r0)
            if (r0 == 0) goto L_0x0175
            java.lang.Integer r2 = X.AnonymousClass00R.A15
            r1 = 2131888303(0x7f1208af, float:1.9411238E38)
            X.A1r r0 = new X.A1r
            r0.<init>(r2, r1, r5, r7)
            r14.add(r0)
            return r4
        L_0x016e:
            int r1 = r1 + 1
            goto L_0x0119
        L_0x0171:
            java.lang.Integer r2 = X.AnonymousClass00R.A0Y
            goto L_0x0099
        L_0x0175:
            if (r3 <= 0) goto L_0x0178
            r7 = 1
        L_0x0178:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AQI.A00(X.AEn, X.206, java.util.List):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004a, code lost:
        if (703 == r3) goto L_0x004c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00a5, code lost:
        if (r3 != false) goto L_0x0071;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0101, code lost:
        if (A00(r11, r12, r1) != false) goto L_0x0071;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x010d, code lost:
        if (r0.length() != 0) goto L_0x0071;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0117, code lost:
        if (r0.length() != 0) goto L_0x0071;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x011f, code lost:
        if (r3.A0Q(r11.A0Q) == false) goto L_0x0071;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x012b, code lost:
        if (r0.length() != 0) goto L_0x0132;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0132, code lost:
        if (r9 != false) goto L_0x0071;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C194309rW BOZ(X.C20279AEn r11, X.AnonymousClass206 r12) {
        /*
            r10 = this;
            r6 = 0
            boolean r2 = X.C18070vi.A17(r12, r11)
            java.util.ArrayList r1 = X.AnonymousClass000.A13()
            X.1Dw r0 = com.whatsapp.jid.UserJid.Companion
            X.205 r0 = r12.A0v
            X.1BI r4 = r0.A00
            com.whatsapp.jid.UserJid r3 = X.C22941Dw.A01(r4)
            if (r3 == 0) goto L_0x0071
            X.1PM r0 = r10.A00
            boolean r9 = r0.A04(r3)
            if (r9 == 0) goto L_0x00a8
            if (r4 == 0) goto L_0x0031
            X.00H r0 = r10.A04
            java.lang.Object r5 = r0.get()
            X.9ke r5 = (X.C190269ke) r5
            r3 = 7751(0x1e47, float:1.0861E-41)
            java.lang.String r0 = r4.user
            boolean r0 = r5.A00(r3, r0)
            if (r0 != 0) goto L_0x0039
        L_0x0031:
            X.1R2 r0 = r10.A03
            boolean r0 = r0.A0q(r11)
            if (r0 == 0) goto L_0x00a8
        L_0x0039:
            int r3 = r11.A00
            r0 = 106(0x6a, float:1.49E-43)
            if (r0 == r3) goto L_0x004c
            r0 = 405(0x195, float:5.68E-43)
            if (r0 == r3) goto L_0x004c
            r0 = 604(0x25c, float:8.46E-43)
            if (r0 == r3) goto L_0x004c
            r0 = 703(0x2bf, float:9.85E-43)
            r5 = 0
            if (r0 != r3) goto L_0x004d
        L_0x004c:
            r5 = 1
        L_0x004d:
            java.lang.String r3 = "captured"
            java.lang.String r0 = r11.A07
            boolean r3 = r3.equals(r0)
            java.lang.String r0 = r11.A08
            r7 = -1
            if (r0 == 0) goto L_0x007c
            int r0 = r0.length()
            if (r0 == 0) goto L_0x007c
            if (r3 != 0) goto L_0x0064
            if (r5 == 0) goto L_0x007c
        L_0x0064:
            java.lang.Integer r3 = X.AnonymousClass00R.A03
            r0 = 2131897884(0x7f122e1c, float:1.943067E38)
        L_0x0069:
            X.A1r r5 = new X.A1r
            r5.<init>(r3, r0, r7, r6)
        L_0x006e:
            r1.add(r5)
        L_0x0071:
            X.2tK r3 = X.C63572tK.A0E
            X.C18070vi.A0Z(r3)
            X.9rW r0 = new X.9rW
            r0.<init>(r3, r1, r2)
            return r0
        L_0x007c:
            X.1R2 r0 = r10.A03
            java.util.HashSet r8 = r0.A0g(r11, r12)
            boolean r0 = X.C108965cb.A1Z(r8, r6)
            if (r0 == 0) goto L_0x00a3
            java.lang.Integer r5 = X.AnonymousClass00R.A04
            r3 = 2131888286(0x7f12089e, float:1.9411203E38)
            X.A1r r0 = new X.A1r
            r0.<init>(r5, r3, r7, r6)
            r1.add(r0)
            r3 = 1
        L_0x0096:
            r0 = 6
            boolean r0 = X.C108965cb.A1Z(r8, r0)
            if (r0 == 0) goto L_0x00a5
            java.lang.Integer r3 = X.AnonymousClass00R.A0Y
            r0 = 2131888297(0x7f1208a9, float:1.9411225E38)
            goto L_0x0069
        L_0x00a3:
            r3 = 0
            goto L_0x0096
        L_0x00a5:
            if (r3 == 0) goto L_0x00a8
            goto L_0x0071
        L_0x00a8:
            java.lang.String r3 = "pending_buyer_confirmation"
            java.lang.String r0 = r11.A07
            boolean r0 = r3.equals(r0)
            X.1QO r3 = r10.A01
            if (r0 == 0) goto L_0x00cf
            boolean r0 = X.AnonymousClass8BU.A1R(r3)
            if (r0 == 0) goto L_0x0132
            if (r9 == 0) goto L_0x0123
            int r4 = X.C20089A6r.A00(r11)
            r0 = 3
            if (r4 != r0) goto L_0x0123
        L_0x00c3:
            java.lang.Integer r4 = X.AnonymousClass00R.A03
            r3 = 2131897884(0x7f122e1c, float:1.943067E38)
            r0 = -1
            X.A1r r5 = new X.A1r
            r5.<init>(r4, r3, r0, r6)
            goto L_0x006e
        L_0x00cf:
            com.whatsapp.jid.UserJid r4 = (com.whatsapp.jid.UserJid) r4
            boolean r0 = r3.A0J(r4, r11)
            if (r0 == 0) goto L_0x0105
            java.lang.String r4 = "captured"
            java.lang.String r0 = r11.A07
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L_0x00c3
            X.AEU r5 = r11.A0D
            java.lang.String r0 = r5.A01
            int r4 = X.C20089A6r.A01(r0)
            r0 = 3
            if (r4 == r0) goto L_0x00c3
            java.lang.String r0 = r5.A01
            int r4 = X.C20089A6r.A01(r0)
            r0 = 4
            if (r4 == r0) goto L_0x00c3
            java.util.List r0 = r11.A0Q
            boolean r0 = r3.A0Q(r0)
            if (r0 == 0) goto L_0x0105
            boolean r0 = r10.A00(r11, r12, r1)
            if (r0 == 0) goto L_0x0105
            goto L_0x0071
        L_0x0105:
            java.lang.String r0 = r11.A08
            if (r0 == 0) goto L_0x010f
            int r0 = r0.length()
            if (r0 != 0) goto L_0x0071
        L_0x010f:
            java.lang.String r0 = r11.A06
            if (r0 == 0) goto L_0x0119
            int r0 = r0.length()
            if (r0 != 0) goto L_0x0071
        L_0x0119:
            java.util.List r0 = r11.A0Q
            boolean r0 = r3.A0Q(r0)
            if (r0 != 0) goto L_0x012d
            goto L_0x0071
        L_0x0123:
            java.lang.String r0 = r11.A08
            if (r0 == 0) goto L_0x012d
            int r0 = r0.length()
            if (r0 != 0) goto L_0x0132
        L_0x012d:
            r10.A00(r11, r12, r1)
            goto L_0x0071
        L_0x0132:
            if (r9 == 0) goto L_0x0105
            goto L_0x0071
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AQI.BOZ(X.AEn, X.206):X.9rW");
    }

    public AQI(AnonymousClass1PM r1, C18030ve r2, AnonymousClass1QO r3, C30921ej r4, AnonymousClass1QS r5, AnonymousClass1R2 r6, AnonymousClass00H r7) {
        C18070vi.A0w(r2, r6, r5, r1, r3);
        C18070vi.A0l(r4, r7);
        this.A05 = r2;
        this.A03 = r6;
        this.A06 = r5;
        this.A00 = r1;
        this.A01 = r3;
        this.A02 = r4;
        this.A04 = r7;
    }
}
