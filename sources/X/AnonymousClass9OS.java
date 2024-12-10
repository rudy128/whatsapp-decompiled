package X;

/* renamed from: X.9OS  reason: invalid class name */
public abstract class AnonymousClass9OS {
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002b, code lost:
        throw new X.AnonymousClass9HX(X.AnonymousClass001.A1H("Can't parse unknown typeface: ", r7, X.AnonymousClass000.A10()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0032, code lost:
        if (r7.equals("italic") != false) goto L_0x009b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0046, code lost:
        if (r7.equals("normal") != false) goto L_0x0074;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0074, code lost:
        r4 = java.lang.Math.min(r3 + r1, 1000);
        r0 = X.C29271bw.A01;
        X.C28111Yx.A01(r4, 1, "weight", 1000);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0086, code lost:
        if (r6 != null) goto L_0x008a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0088, code lost:
        r6 = android.graphics.Typeface.DEFAULT;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x008a, code lost:
        r0 = X.C29271bw.A01.A04(r5, r6, r4, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x009b, code lost:
        r3 = java.lang.Math.min(r3 + r1, 1000);
        r0 = X.C29271bw.A01;
        X.C28111Yx.A01(r3, 1, "weight", 1000);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00ac, code lost:
        if (r6 != null) goto L_0x00b0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00ae, code lost:
        r6 = android.graphics.Typeface.DEFAULT;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00b0, code lost:
        r0 = X.C29271bw.A01.A04(r5, r6, r3, true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00b6, code lost:
        X.C18070vi.A0b(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00b9, code lost:
        return r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final android.graphics.Typeface A00(android.content.Context r5, android.graphics.Typeface r6, java.lang.String r7, java.lang.String r8) {
        /*
            r2 = 400(0x190, float:5.6E-43)
            if (r6 == 0) goto L_0x000e
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 28
            if (r1 < r0) goto L_0x00ba
            int r2 = r6.getWeight()
        L_0x000e:
            r3 = 400(0x190, float:5.6E-43)
            int r1 = r2 - r3
            if (r2 > r3) goto L_0x0015
            r1 = 0
        L_0x0015:
            int r0 = r7.hashCode()
            switch(r0) {
                case -1178781136: goto L_0x002c;
                case -1078030475: goto L_0x0035;
                case -1039745817: goto L_0x0040;
                case 3029637: goto L_0x0049;
                case 99152071: goto L_0x0054;
                case 102970646: goto L_0x005f;
                case 1223860979: goto L_0x006a;
                case 1734741290: goto L_0x0091;
                default: goto L_0x001c;
            }
        L_0x001c:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Can't parse unknown typeface: "
            java.lang.String r1 = X.AnonymousClass001.A1H(r0, r7, r1)
            X.9HX r0 = new X.9HX
            r0.<init>(r1)
            throw r0
        L_0x002c:
            java.lang.String r0 = "italic"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x001c
            goto L_0x009b
        L_0x0035:
            java.lang.String r0 = "medium"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x001c
            r3 = 500(0x1f4, float:7.0E-43)
            goto L_0x0074
        L_0x0040:
            java.lang.String r0 = "normal"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x001c
            goto L_0x0074
        L_0x0049:
            java.lang.String r0 = "bold"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x001c
            r3 = 700(0x2bc, float:9.81E-43)
            goto L_0x0074
        L_0x0054:
            java.lang.String r0 = "heavy"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x001c
            r3 = 800(0x320, float:1.121E-42)
            goto L_0x0074
        L_0x005f:
            java.lang.String r0 = "light"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x001c
            r3 = 300(0x12c, float:4.2E-43)
            goto L_0x0074
        L_0x006a:
            java.lang.String r0 = "semibold"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x001c
            r3 = 600(0x258, float:8.41E-43)
        L_0x0074:
            int r3 = r3 + r1
            r0 = 1000(0x3e8, float:1.401E-42)
            int r4 = java.lang.Math.min(r3, r0)
            r3 = 0
            X.1bx r0 = X.C29271bw.A01
            r2 = 1000(0x3e8, float:1.401E-42)
            java.lang.String r1 = "weight"
            r0 = 1
            X.C28111Yx.A01(r4, r0, r1, r2)
            if (r6 != 0) goto L_0x008a
            android.graphics.Typeface r6 = android.graphics.Typeface.DEFAULT
        L_0x008a:
            X.1bx r0 = X.C29271bw.A01
            android.graphics.Typeface r0 = r0.A04(r5, r6, r4, r3)
            goto L_0x00b6
        L_0x0091:
            java.lang.String r0 = "bold_italic"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x001c
            r3 = 700(0x2bc, float:9.81E-43)
        L_0x009b:
            int r3 = r3 + r1
            r0 = 1000(0x3e8, float:1.401E-42)
            int r3 = java.lang.Math.min(r3, r0)
            r2 = 1
            X.1bx r0 = X.C29271bw.A01
            r1 = 1000(0x3e8, float:1.401E-42)
            java.lang.String r0 = "weight"
            X.C28111Yx.A01(r3, r2, r0, r1)
            if (r6 != 0) goto L_0x00b0
            android.graphics.Typeface r6 = android.graphics.Typeface.DEFAULT
        L_0x00b0:
            X.1bx r0 = X.C29271bw.A01
            android.graphics.Typeface r0 = r0.A04(r5, r6, r3, r2)
        L_0x00b6:
            X.C18070vi.A0b(r0)
            return r0
        L_0x00ba:
            r1 = 0
            if (r8 == 0) goto L_0x000e
            java.lang.String r0 = "sans-serif"
            boolean r0 = X.AnonymousClass1YF.A0Y(r8, r0, r1)
            if (r0 == 0) goto L_0x000e
            int r0 = r8.hashCode()
            switch(r0) {
                case -264127297: goto L_0x00e6;
                case 951357813: goto L_0x00da;
                case 960509580: goto L_0x00ce;
                default: goto L_0x00cc;
            }
        L_0x00cc:
            goto L_0x000e
        L_0x00ce:
            java.lang.String r0 = "sans-serif-light"
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x000e
            r2 = 300(0x12c, float:4.2E-43)
            goto L_0x000e
        L_0x00da:
            java.lang.String r0 = "sans-serif-black"
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x000e
            r2 = 900(0x384, float:1.261E-42)
            goto L_0x000e
        L_0x00e6:
            java.lang.String r0 = "sans-serif-medium"
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x000e
            r2 = 500(0x1f4, float:7.0E-43)
            goto L_0x000e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass9OS.A00(android.content.Context, android.graphics.Typeface, java.lang.String, java.lang.String):android.graphics.Typeface");
    }
}
