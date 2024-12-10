package X;

public abstract class BMq extends C24470C5k {
    public static final C25780Clr A03 = C25780Clr.A02;
    public static final C25780Clr A04;
    public final C25780Clr A00;
    public final C25780Clr A01;
    public final C25773Clk A02;

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0056, code lost:
        if (r1 <= 0) goto L_0x0058;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A01(android.content.Context r11, android.view.WindowMetrics r12) {
        /*
            r10 = this;
            r1 = 0
            X.C18070vi.A0d(r11, r1)
            int r2 = android.os.Build.VERSION.SDK_INT
            r0 = 30
            if (r2 > r0) goto L_0x000b
            return r1
        L_0x000b:
            android.graphics.Rect r1 = X.C24509C7d.A00(r12)
            r0 = 33
            if (r2 > r0) goto L_0x0071
            float r2 = X.C72463Mc.A00(r11)
        L_0x0017:
            r0 = 1
            X.C18070vi.A0d(r1, r0)
            int r8 = r1.width()
            int r7 = r1.height()
            r9 = 0
            if (r8 == 0) goto L_0x0062
            if (r7 == 0) goto L_0x0062
            r1 = 1142292480(0x44160000, float:600.0)
            float r1 = r1 * r2
            r0 = 1056964608(0x3f000000, float:0.5)
            float r1 = r1 + r0
            int r1 = (int) r1
            boolean r6 = X.C108975cc.A1C(r8, r1)
            boolean r5 = X.C108975cc.A1C(r7, r1)
            int r0 = java.lang.Math.min(r8, r7)
            boolean r4 = X.C108975cc.A1C(r0, r1)
            r3 = 1065353216(0x3f800000, float:1.0)
            if (r7 < r8) goto L_0x0063
            X.Clr r2 = r10.A01
            X.Clr r0 = X.C25780Clr.A02
            boolean r0 = X.C18070vi.A18(r2, r0)
            if (r0 != 0) goto L_0x0058
            float r1 = (float) r7
            float r1 = r1 * r3
            float r0 = (float) r8
        L_0x0050:
            float r1 = r1 / r0
            float r0 = r2.A00
            int r1 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            r0 = 0
            if (r1 > 0) goto L_0x0059
        L_0x0058:
            r0 = 1
        L_0x0059:
            if (r6 == 0) goto L_0x0062
            if (r5 == 0) goto L_0x0062
            if (r4 == 0) goto L_0x0062
            if (r0 == 0) goto L_0x0062
            r9 = 1
        L_0x0062:
            return r9
        L_0x0063:
            X.Clr r2 = r10.A00
            X.Clr r0 = X.C25780Clr.A02
            boolean r0 = X.C18070vi.A18(r2, r0)
            if (r0 != 0) goto L_0x0058
            float r1 = (float) r8
            float r1 = r1 * r3
            float r0 = (float) r7
            goto L_0x0050
        L_0x0071:
            float r2 = X.C24510C7e.A00(r11, r12)
            goto L_0x0017
        */
        throw new UnsupportedOperationException("Method not decompiled: X.BMq.A01(android.content.Context, android.view.WindowMetrics):boolean");
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if ((obj instanceof BMq) && super.equals(obj)) {
                BMq bMq = (BMq) obj;
                if (!C18070vi.A18(this.A01, bMq.A01) || !C18070vi.A18(this.A00, bMq.A00) || !C18070vi.A18(this.A02, bMq.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public static void A00(BMq bMq, StringBuilder sb) {
        sb.append(", defaultSplitAttributes=");
        sb.append(bMq.A02);
        sb.append(", minWidthDp=");
        sb.append(600);
        sb.append(", minHeightDp=");
        sb.append(600);
        sb.append(", minSmallestWidthDp=");
        sb.append(600);
        sb.append(", maxAspectRatioInPortrait=");
        sb.append(bMq.A01);
        sb.append(", maxAspectRatioInLandscape=");
        sb.append(bMq.A00);
    }

    static {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("ratio:");
        A10.append(1.4f);
        A04 = new C25780Clr(A10.toString(), 1.4f);
    }

    public BMq(C25780Clr clr, C25780Clr clr2, C25773Clk clk) {
        this.A01 = clr;
        this.A00 = clr2;
        this.A02 = clk;
    }

    public int hashCode() {
        return AnonymousClass000.A0O(this.A02, AnonymousClass000.A0N(this.A00, AnonymousClass000.A0N(this.A01, 18469800)));
    }
}
