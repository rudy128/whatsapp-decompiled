package X;

/* renamed from: X.1oO  reason: invalid class name and case insensitive filesystem */
public class C36741oO {
    public final AnonymousClass1KB A00;
    public final C19830z4 A01;
    public final C28521aN A02;
    public final AnonymousClass10I A03;
    public final AnonymousClass18O A04;
    public final AnonymousClass1RK A05;
    public final AnonymousClass1KW A06;
    public final C18030ve A07;
    public final AnonymousClass00H A08;

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00b9, code lost:
        if (r7 > 1) goto L_0x00bb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00f7, code lost:
        if (r7 > 1) goto L_0x00f9;
     */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00af  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00f2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C73203Rj A00(android.content.Context r17, X.C72313Ll r18, int r19, int r20, int r21, boolean r22) {
        /*
            r16 = this;
            r8 = r17
            android.view.LayoutInflater r2 = android.view.LayoutInflater.from(r8)
            r1 = 2131625090(0x7f0e0482, float:1.8877378E38)
            r0 = 0
            android.view.View r6 = r2.inflate(r1, r0)
            r0 = 2131429891(0x7f0b0a03, float:1.8481468E38)
            android.view.View r3 = X.AnonymousClass1HF.A06(r6, r0)
            r0 = 2131429905(0x7f0b0a11, float:1.8481496E38)
            android.view.View r2 = X.AnonymousClass1HF.A06(r6, r0)
            r0 = 2131429889(0x7f0b0a01, float:1.8481463E38)
            android.view.View r10 = X.AnonymousClass1HF.A06(r6, r0)
            android.widget.CheckBox r10 = (android.widget.CheckBox) r10
            r0 = 2131429890(0x7f0b0a02, float:1.8481465E38)
            android.view.View r4 = X.AnonymousClass1HF.A06(r6, r0)
            android.widget.TextView r4 = (android.widget.TextView) r4
            r13 = r16
            X.0z4 r0 = r13.A01
            X.00H r0 = r0.A00
            java.lang.Object r5 = r0.get()
            android.content.SharedPreferences r5 = (android.content.SharedPreferences) r5
            java.lang.String r1 = "pref_media_delete_per_conversation"
            r0 = 0
            boolean r15 = r5.getBoolean(r1, r0)
            r0 = 2131429904(0x7f0b0a10, float:1.8481494E38)
            android.view.View r11 = X.AnonymousClass1HF.A06(r6, r0)
            android.widget.CheckBox r11 = (android.widget.CheckBox) r11
            r1 = 1
            r14 = r21
            if (r21 == 0) goto L_0x0054
            r0 = 1
            r1 = 0
            if (r14 == r0) goto L_0x0054
            r1 = r15
        L_0x0054:
            r10.setChecked(r1)
            r5 = -1
            r1 = 2131889280(0x7f120c80, float:1.941322E38)
            r7 = r19
            if (r7 == r5) goto L_0x0068
            r0 = 1
            r1 = 2131889320(0x7f120ca8, float:1.94133E38)
            if (r7 != r0) goto L_0x0068
            r1 = 2131889321(0x7f120ca9, float:1.9413302E38)
        L_0x0068:
            java.lang.String r0 = r8.getString(r1)
            r4.setText(r0)
            r0 = 8
            if (r22 == 0) goto L_0x0074
            r0 = 0
        L_0x0074:
            r2.setVisibility(r0)
            r1 = 18
            X.78L r0 = new X.78L
            r0.<init>(r10, r1)
            r3.setOnClickListener(r0)
            r1 = 19
            X.78L r0 = new X.78L
            r0.<init>(r11, r1)
            r2.setOnClickListener(r0)
            r4 = 0
            r1 = 1
            r9 = r20
            if (r20 == 0) goto L_0x0115
            if (r9 == r1) goto L_0x0109
            r0 = 2
            if (r9 == r0) goto L_0x00fd
            r0 = 2131888328(0x7f1208c8, float:1.9411288E38)
            if (r7 != r5) goto L_0x009e
            r0 = 2131888316(0x7f1208bc, float:1.9411264E38)
        L_0x009e:
            java.lang.String r0 = r8.getString(r0)
        L_0x00a2:
            X.3Rj r1 = X.AnonymousClass4a6.A00(r8)
            r1.A0k(r0)
            r1.A0c(r6)
            r2 = 1
            if (r20 == 0) goto L_0x00f2
            if (r9 == r2) goto L_0x00e6
            r0 = 2
            if (r9 == r0) goto L_0x00da
            if (r7 == r5) goto L_0x00bb
            r0 = 2131888326(0x7f1208c6, float:1.9411284E38)
            if (r7 <= r2) goto L_0x00be
        L_0x00bb:
            r0 = 2131888325(0x7f1208c5, float:1.9411282E38)
        L_0x00be:
            java.lang.String r0 = r8.getString(r0)
            X.2uM r9 = new X.2uM
            r12 = r18
            r9.<init>(r10, r11, r12, r13, r14, r15)
            r1.A0L(r9, r0)
            r3 = 2131898766(0x7f12318e, float:1.943246E38)
            r2 = 32
            X.4ar r0 = new X.4ar
            r0.<init>(r12, r2)
            r1.A0X(r0, r3)
            return r1
        L_0x00da:
            if (r7 == r2) goto L_0x00dd
            r2 = 0
        L_0x00dd:
            java.lang.String r0 = "Use DELETE_GROUP_CHAT only for single group deletion"
            X.C17960vV.A0F(r2, r0)
            r0 = 2131889304(0x7f120c98, float:1.9413268E38)
            goto L_0x00be
        L_0x00e6:
            if (r7 == r2) goto L_0x00e9
            r2 = 0
        L_0x00e9:
            java.lang.String r0 = "Use DELETE_BROADCAST_LIST only for single broadcast deletion"
            X.C17960vV.A0F(r2, r0)
            r0 = 2131889288(0x7f120c88, float:1.9413235E38)
            goto L_0x00be
        L_0x00f2:
            if (r7 == r5) goto L_0x00f9
            r0 = 2131889339(0x7f120cbb, float:1.9413339E38)
            if (r7 <= r2) goto L_0x00be
        L_0x00f9:
            r0 = 2131889322(0x7f120caa, float:1.9413304E38)
            goto L_0x00be
        L_0x00fd:
            if (r7 != r1) goto L_0x0100
            r4 = 1
        L_0x0100:
            java.lang.String r0 = "Use DELETE_SINGLE_GROUP_CHAT only for single broadcast deletion"
            X.C17960vV.A0H(r4, r0)
            r0 = 2131889307(0x7f120c9b, float:1.9413274E38)
            goto L_0x009e
        L_0x0109:
            if (r7 != r1) goto L_0x010c
            r4 = 1
        L_0x010c:
            java.lang.String r0 = "Use DELETE_SINGLE_BROADCAST_LIST only for single broadcast deletion"
            X.C17960vV.A0H(r4, r0)
            r0 = 2131889289(0x7f120c89, float:1.9413237E38)
            goto L_0x009e
        L_0x0115:
            if (r7 != r5) goto L_0x011b
            r0 = 2131889278(0x7f120c7e, float:1.9413215E38)
            goto L_0x009e
        L_0x011b:
            android.content.res.Resources r3 = r8.getResources()
            r2 = 2131755082(0x7f10004a, float:1.9141033E38)
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r7)
            r1[r4] = r0
            java.lang.String r0 = r3.getQuantityString(r2, r7, r1)
            goto L_0x00a2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C36741oO.A00(android.content.Context, X.3Ll, int, int, int, boolean):X.3Rj");
    }

    public void A01(AnonymousClass1BI r5, C72323Lm r6) {
        C49222Pq r2 = new C49222Pq(this.A02, r5, r6);
        this.A03.CGD(r2, new Void[0]);
        this.A00.A0K(new AnonymousClass7RD(r2, r6, 35), 500);
    }

    public C36741oO(AnonymousClass1KB r1, AnonymousClass18O r2, C19830z4 r3, C28521aN r4, AnonymousClass1RK r5, AnonymousClass1KW r6, C18030ve r7, AnonymousClass10I r8, AnonymousClass00H r9) {
        this.A07 = r7;
        this.A00 = r1;
        this.A03 = r8;
        this.A06 = r6;
        this.A04 = r2;
        this.A08 = r9;
        this.A02 = r4;
        this.A01 = r3;
        this.A05 = r5;
    }
}
