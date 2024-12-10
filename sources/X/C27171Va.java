package X;

import java.util.HashMap;

/* renamed from: X.1Va  reason: invalid class name and case insensitive filesystem */
public final class C27171Va {
    public final AnonymousClass1M9 A00;
    public final C18030ve A01;
    public final AnonymousClass1VW A02;
    public final C24921Me A03;
    public final AnonymousClass1VZ A04;
    public final AnonymousClass118 A05;
    public final HashMap A06 = new HashMap();

    public C27171Va(AnonymousClass1VW r2, AnonymousClass1M9 r3, C24921Me r4, AnonymousClass1VZ r5, AnonymousClass118 r6, C18030ve r7) {
        C18070vi.A0d(r7, 1);
        C18070vi.A0d(r6, 2);
        C18070vi.A0d(r2, 3);
        C18070vi.A0d(r3, 4);
        C18070vi.A0d(r4, 5);
        this.A01 = r7;
        this.A05 = r6;
        this.A02 = r2;
        this.A00 = r3;
        this.A03 = r4;
        this.A04 = r5;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0026, code lost:
        if (X.C36301nf.A02(r11.A01, X.C18040vf.A01, 12302) == false) goto L_0x00a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00b7, code lost:
        if (X.C18020vd.A00(X.C18040vf.A02, r11.A01, 12875) == 1) goto L_0x0028;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001a, code lost:
        if (X.C22971Dz.A0U(r1) == false) goto L_0x00a3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.graphics.Bitmap A00(android.content.Context r12, X.AnonymousClass1E7 r13, float r14, int r15) {
        /*
            r11 = this;
            r6 = 0
            X.C18070vi.A0d(r12, r6)
            r5 = 0
            if (r13 == 0) goto L_0x00a3
            X.1BI r1 = r13.A0J
            if (r1 == 0) goto L_0x00a3
            boolean r0 = r13.A10
            r3 = 1
            if (r0 == 0) goto L_0x00ad
            boolean r0 = X.C22971Dz.A0Y(r1)
            if (r0 != 0) goto L_0x001c
            boolean r0 = X.C22971Dz.A0U(r1)
            if (r0 == 0) goto L_0x00a3
        L_0x001c:
            X.0ve r2 = r11.A01
            r1 = 12302(0x300e, float:1.7239E-41)
            X.0vf r0 = X.C18040vf.A01
            boolean r0 = X.C36301nf.A02(r2, r0, r1)
            if (r0 == 0) goto L_0x00a3
        L_0x0028:
            java.lang.String r4 = r11.A01(r13)
            if (r4 == 0) goto L_0x00a3
            boolean r0 = r13.A10
            if (r0 == 0) goto L_0x00aa
            X.1BI r0 = r13.A0J
            X.1VX r8 = X.AnonymousClass1VW.A01(r0)
        L_0x0038:
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r5 = android.graphics.Bitmap.createBitmap(r15, r15, r0)
            X.C18070vi.A0X(r5)
            android.graphics.Canvas r3 = new android.graphics.Canvas
            r3.<init>(r5)
            android.graphics.Paint r2 = new android.graphics.Paint
            r2.<init>()
            r0 = 1
            r2.setAntiAlias(r0)
            X.118 r0 = r11.A05
            android.content.Context r1 = r0.A00
            int r0 = r8.backgroundColorRes
            int r0 = X.C19740yt.A00(r1, r0)
            r2.setColor(r0)
            android.graphics.Paint$Style r0 = android.graphics.Paint.Style.FILL
            r2.setStyle(r0)
            r10 = 0
            r9 = 1073741824(0x40000000, float:2.0)
            int r0 = (r14 > r10 ? 1 : (r14 == r10 ? 0 : -1))
            float r7 = (float) r15
            if (r0 != 0) goto L_0x00a4
            android.graphics.RectF r0 = new android.graphics.RectF
            r0.<init>(r10, r10, r7, r7)
            r3.drawRect(r0, r2)
        L_0x0071:
            android.graphics.Typeface r0 = X.C43421zm.A03()
            r2.setTypeface(r0)
            r0 = 1055286886(0x3ee66666, float:0.45)
            float r0 = r0 * r7
            r2.setTextSize(r0)
            int r0 = r8.colorResId
            int r0 = X.C19740yt.A00(r1, r0)
            r2.setColor(r0)
            android.graphics.Paint$Align r0 = android.graphics.Paint.Align.CENTER
            r2.setTextAlign(r0)
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            int r0 = r4.length()
            r2.getTextBounds(r4, r6, r0, r1)
            float r7 = r7 / r9
            float r0 = r1.exactCenterY()
            float r0 = r7 - r0
            r3.drawText(r4, r7, r0, r2)
        L_0x00a3:
            return r5
        L_0x00a4:
            float r0 = r7 / r9
            r3.drawCircle(r0, r0, r0, r2)
            goto L_0x0071
        L_0x00aa:
            X.1VX r8 = X.AnonymousClass1VX.EMPTY
            goto L_0x0038
        L_0x00ad:
            X.0ve r2 = r11.A01
            r1 = 12875(0x324b, float:1.8042E-41)
            X.0vf r0 = X.C18040vf.A02
            int r0 = X.C18020vd.A00(r0, r2, r1)
            if (r0 != r3) goto L_0x00a3
            goto L_0x0028
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C27171Va.A00(android.content.Context, X.1E7, float, int):android.graphics.Bitmap");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:101:0x0177, code lost:
        if (r2 != null) goto L_0x0014;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x007f, code lost:
        if (X.AnonymousClass1VZ.A09.matcher(r8).matches() != false) goto L_0x0081;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x008b, code lost:
        if (X.AnonymousClass1VZ.A01(r8, X.AnonymousClass1VZ.A02) == false) goto L_0x008d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0095, code lost:
        if (r1 != false) goto L_0x0097;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00bc, code lost:
        if (r7.isEmpty() == false) goto L_0x00be;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00ca, code lost:
        if (r1 != false) goto L_0x00cc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00df, code lost:
        if (r2 != false) goto L_0x00e1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001a, code lost:
        if (X.AnonymousClass1YF.A0Y(r2, r7, false) != false) goto L_0x001c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x0138, code lost:
        if (r1.matcher(r7).matches() == false) goto L_0x013a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x0149  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0150  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0159  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String A01(X.AnonymousClass1E7 r15) {
        /*
            r14 = this;
            r6 = 0
            java.lang.String r2 = r15.A0K()
            java.lang.String r1 = r15.A0T
            java.lang.String r7 = r15.A0S
            r4 = 0
            if (r2 == 0) goto L_0x0176
            if (r1 == 0) goto L_0x0176
            boolean r0 = X.AnonymousClass1YF.A0Y(r2, r1, r6)
            if (r0 == 0) goto L_0x0176
        L_0x0014:
            if (r7 == 0) goto L_0x017b
            boolean r0 = X.AnonymousClass1YF.A0Y(r2, r7, r6)
            if (r0 == 0) goto L_0x017b
        L_0x001c:
            X.1Me r0 = r14.A03
            java.lang.String r9 = r0.A0R(r15)
            X.2m9 r5 = new X.2m9
            r5.<init>(r1, r7, r9)
            java.util.HashMap r3 = r14.A06
            boolean r0 = r3.containsKey(r5)
            if (r0 != 0) goto L_0x0160
            X.1VZ r2 = r14.A04
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x0173
            java.lang.String r1 = r1.trim()
            X.0vb r0 = r2.A00
            java.util.Locale r0 = r0.A0N()
            java.lang.String r8 = r1.toUpperCase(r0)
        L_0x0045:
            boolean r0 = android.text.TextUtils.isEmpty(r7)
            if (r0 != 0) goto L_0x0170
            java.lang.String r1 = r7.trim()
            X.0vb r0 = r2.A00
            java.util.Locale r0 = r0.A0N()
            java.lang.String r7 = r1.toUpperCase(r0)
        L_0x0059:
            boolean r0 = android.text.TextUtils.isEmpty(r9)
            if (r0 != 0) goto L_0x016d
            java.lang.String r1 = r9.trim()
            X.0vb r0 = r2.A00
            java.util.Locale r0 = r0.A0N()
            java.lang.String r11 = r1.toUpperCase(r0)
        L_0x006d:
            boolean r0 = android.text.TextUtils.isEmpty(r8)
            r13 = 1
            if (r0 != 0) goto L_0x0081
            java.util.regex.Pattern r0 = X.AnonymousClass1VZ.A09
            java.util.regex.Matcher r0 = r0.matcher(r8)
            boolean r0 = r0.matches()
            r9 = 1
            if (r0 == 0) goto L_0x0082
        L_0x0081:
            r9 = 0
        L_0x0082:
            if (r8 == 0) goto L_0x008d
            java.util.List r0 = X.AnonymousClass1VZ.A02
            boolean r0 = X.AnonymousClass1VZ.A01(r8, r0)
            r1 = 1
            if (r0 != 0) goto L_0x008e
        L_0x008d:
            r1 = 0
        L_0x008e:
            boolean r0 = android.text.TextUtils.isEmpty(r7)
            if (r0 != 0) goto L_0x0097
            r2 = 1
            if (r1 == 0) goto L_0x0098
        L_0x0097:
            r2 = 0
        L_0x0098:
            boolean r0 = android.text.TextUtils.isEmpty(r8)
            if (r0 != 0) goto L_0x00ad
            java.util.regex.Pattern r0 = X.AnonymousClass1VZ.A09
            java.util.regex.Matcher r0 = r0.matcher(r8)
            boolean r0 = r0.matches()
            if (r0 == 0) goto L_0x00ad
            if (r2 != 0) goto L_0x00ad
            r9 = 1
        L_0x00ad:
            if (r8 == 0) goto L_0x00be
            boolean r0 = r8.isEmpty()
            if (r0 == 0) goto L_0x00be
            if (r7 == 0) goto L_0x00be
            boolean r0 = r7.isEmpty()
            r1 = 1
            if (r0 != 0) goto L_0x00bf
        L_0x00be:
            r1 = 0
        L_0x00bf:
            if (r9 != 0) goto L_0x00cc
            if (r2 != 0) goto L_0x00cc
            boolean r0 = android.text.TextUtils.isEmpty(r11)
            if (r0 != 0) goto L_0x00cc
            r12 = 1
            if (r1 == 0) goto L_0x00cd
        L_0x00cc:
            r12 = 0
        L_0x00cd:
            r0 = 3
            boolean[] r1 = new boolean[r0]
            r1[r6] = r9
            r1[r13] = r2
            r0 = 2
            r1[r0] = r12
            boolean r0 = r1[r6]
            boolean r2 = r1[r13]
            r9 = 2
            if (r0 == 0) goto L_0x00e1
            r1 = 1
            if (r2 == 0) goto L_0x00e2
        L_0x00e1:
            r1 = 0
        L_0x00e2:
            r10 = 0
            if (r0 == 0) goto L_0x016b
            boolean r0 = android.text.TextUtils.isEmpty(r8)
            if (r0 != 0) goto L_0x016b
            java.lang.String r8 = X.AnonymousClass1VZ.A00(r8, r1)
        L_0x00ef:
            if (r2 == 0) goto L_0x0169
            boolean r0 = android.text.TextUtils.isEmpty(r7)
            if (r0 != 0) goto L_0x0169
            java.lang.String r7 = X.AnonymousClass1VZ.A00(r7, r6)
        L_0x00fb:
            if (r12 == 0) goto L_0x0108
            boolean r0 = android.text.TextUtils.isEmpty(r11)
            if (r0 != 0) goto L_0x0108
            java.lang.String r8 = X.AnonymousClass1VZ.A00(r11, r1)
            r7 = r4
        L_0x0108:
            boolean r0 = android.text.TextUtils.isEmpty(r8)
            if (r0 != 0) goto L_0x0167
            boolean r0 = android.text.TextUtils.isEmpty(r7)
            if (r0 != 0) goto L_0x0167
            java.util.List r0 = X.AnonymousClass1VZ.A01
            java.util.Iterator r2 = r0.iterator()
        L_0x011a:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x013a
            java.lang.Object r1 = r2.next()
            java.util.regex.Pattern r1 = (java.util.regex.Pattern) r1
            java.util.regex.Matcher r0 = r1.matcher(r8)
            boolean r0 = r0.matches()
            if (r0 == 0) goto L_0x011a
            java.util.regex.Matcher r0 = r1.matcher(r7)
            boolean r0 = r0.matches()
            if (r0 != 0) goto L_0x0167
        L_0x013a:
            java.lang.String[] r2 = new java.lang.String[r9]
            r2[r6] = r8
            r2[r13] = r10
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r0 = r2[r6]
            if (r0 == 0) goto L_0x014c
            r1.append(r0)
        L_0x014c:
            r0 = r2[r13]
            if (r0 == 0) goto L_0x0153
            r1.append(r0)
        L_0x0153:
            int r0 = r1.length()
            if (r0 <= 0) goto L_0x015d
            java.lang.String r4 = r1.toString()
        L_0x015d:
            r3.put(r5, r4)
        L_0x0160:
            java.lang.Object r0 = r3.get(r5)
            java.lang.String r0 = (java.lang.String) r0
            return r0
        L_0x0167:
            r10 = r7
            goto L_0x013a
        L_0x0169:
            r7 = r4
            goto L_0x00fb
        L_0x016b:
            r8 = r4
            goto L_0x00ef
        L_0x016d:
            r11 = 0
            goto L_0x006d
        L_0x0170:
            r7 = 0
            goto L_0x0059
        L_0x0173:
            r8 = 0
            goto L_0x0045
        L_0x0176:
            r1 = r4
            if (r2 == 0) goto L_0x017b
            goto L_0x0014
        L_0x017b:
            r7 = r4
            goto L_0x001c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C27171Va.A01(X.1E7):java.lang.String");
    }
}
