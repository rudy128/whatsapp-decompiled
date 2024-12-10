package X;

/* renamed from: X.71M  reason: invalid class name */
public final class AnonymousClass71M {
    public AnonymousClass00H A00;
    public final C18030ve A01;
    public final AnonymousClass00H A02;
    public final AnonymousClass00H A03;
    public final AnonymousClass00H A04;
    public final AnonymousClass11C A05;
    public final AnonymousClass1KW A06;
    public final C32011gU A07;
    public final C18010vc A08;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v1, resolved type: com.whatsapp.TextData} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v3, resolved type: com.whatsapp.TextData} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v4, resolved type: com.whatsapp.TextData} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.C109485dW A00(android.content.Context r11, android.graphics.drawable.Drawable r12, X.AnonymousClass210 r13, X.AnonymousClass71M r14, boolean r15) {
        /*
            r4 = r12
            X.1gU r0 = r14.A07
            java.lang.String r12 = X.AnonymousClass74F.A05(r0, r13)
            if (r12 == 0) goto L_0x0073
            int r0 = r12.length()
            r1 = 700(0x2bc, float:9.81E-43)
            if (r0 <= r1) goto L_0x0016
            r0 = 0
            java.lang.String r12 = X.C108955ca.A0q(r0, r1, r12)
        L_0x0016:
            com.whatsapp.TextData r7 = r13.A02
            if (r7 != 0) goto L_0x0024
            java.lang.String r0 = "Text status missing text data"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            com.whatsapp.TextData r7 = new com.whatsapp.TextData
            r7.<init>()
        L_0x0024:
            r0 = 0
            r5 = r11
            X.C18070vi.A0d(r11, r0)
            int r0 = r7.fontStyle
            android.graphics.Typeface r6 = X.AnonymousClass74F.A04(r11, r0)
            if (r6 != 0) goto L_0x0033
            android.graphics.Typeface r6 = android.graphics.Typeface.SANS_SERIF
        L_0x0033:
            if (r15 == 0) goto L_0x0060
            X.1KW r9 = r14.A06
            X.11C r8 = r14.A05
            X.0vc r10 = r14.A08
            java.lang.Integer r1 = X.AnonymousClass00R.A00
            boolean r0 = r4 instanceof X.C109485dW
            if (r0 == 0) goto L_0x0058
            X.5dW r4 = (X.C109485dW) r4
            java.lang.Integer r0 = r4.A07
            if (r0 != r1) goto L_0x0058
            java.lang.CharSequence r0 = r4.A06
            boolean r0 = X.C42171xk.A00(r0, r12)
            if (r0 == 0) goto L_0x0058
            com.whatsapp.TextData r0 = r4.A05
            boolean r0 = X.C42171xk.A00(r0, r7)
            if (r0 == 0) goto L_0x0058
            return r4
        L_0x0058:
            java.lang.Integer r11 = X.AnonymousClass00R.A01
            X.6IZ r4 = new X.6IZ
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12)
            return r4
        L_0x0060:
            X.1KW r2 = r14.A06
            X.11C r1 = r14.A05
            X.0vc r0 = r14.A08
            r8 = r11
            r9 = r6
            r10 = r4
            r11 = r7
            r13 = r2
            r14 = r0
            r15 = r12
            r12 = r1
            X.6Ia r4 = X.C124196Xk.A00(r8, r9, r10, r11, r12, r13, r14, r15)
            return r4
        L_0x0073:
            java.lang.String r0 = "Text status missing content"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            r4 = 0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass71M.A00(android.content.Context, android.graphics.drawable.Drawable, X.210, X.71M, boolean):X.5dW");
    }

    public AnonymousClass71M(AnonymousClass11C r2, AnonymousClass1KW r3, C18030ve r4, C32011gU r5, C18010vc r6, AnonymousClass00H r7, AnonymousClass00H r8, AnonymousClass00H r9, AnonymousClass00H r10) {
        C18070vi.A0w(r4, r7, r8, r5, r3);
        C18070vi.A0q(r2, r6, r9);
        C18070vi.A0d(r10, 9);
        this.A01 = r4;
        this.A02 = r7;
        this.A04 = r8;
        this.A07 = r5;
        this.A06 = r3;
        this.A05 = r2;
        this.A08 = r6;
        this.A00 = r9;
        this.A03 = r10;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001b, code lost:
        if (X.C18020vd.A05(X.C18040vf.A02, r5.A01, 12340) == false) goto L_0x001d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean A01(X.AnonymousClass210 r4, X.AnonymousClass71M r5) {
        /*
            byte[] r0 = r4.A1A()
            boolean r0 = X.AnonymousClass000.A1W(r0)
            r3 = 0
            if (r0 == 0) goto L_0x002a
            X.205 r0 = r4.A0v
            boolean r0 = r0.A02
            if (r0 == 0) goto L_0x001d
            X.0ve r2 = r5.A01
            r1 = 12340(0x3034, float:1.7292E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 != 0) goto L_0x0029
        L_0x001d:
            X.0ve r2 = r5.A01
            r1 = 11428(0x2ca4, float:1.6014E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x002a
        L_0x0029:
            r3 = 1
        L_0x002a:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass71M.A01(X.210, X.71M):boolean");
    }
}
