package X;

/* renamed from: X.0A8  reason: invalid class name */
public final class AnonymousClass0A8 extends C02170Cz {
    public float A00 = 1.0f;
    public float A01 = 1.0f;
    public String A02 = "";
    public long A03 = AnonymousClass0QG.A01;
    public AnonymousClass0HD A04;
    public C18090vk A05 = C09000g0.A00;
    public boolean A06 = true;
    public final C17330uU A07 = AnonymousClass0Q9.A02((Object) null);
    public final C17330uU A08 = AnonymousClass0Q9.A01(new AnonymousClass0QG(AnonymousClass0QG.A02));
    public final AnonymousClass0J0 A09 = new AnonymousClass0J0();
    public final AnonymousClass0AA A0A;
    public final C22821Di A0B = new C09950hY(this);

    public AnonymousClass0A8(AnonymousClass0AA r4) {
        this.A0A = r4;
        r4.A06(new C09940hX(this));
    }

    public static final void A00(AnonymousClass0A8 r1) {
        r1.A06 = true;
        r1.A05.invoke();
    }

    public void A05(C17770vC r3) {
        A07((AnonymousClass0HD) null, r3, 1.0f);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x005a, code lost:
        if (r10 != r0) goto L_0x008b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0089, code lost:
        if (r3 != android.graphics.Bitmap.Config.HARDWARE) goto L_0x00fe;
     */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x005e  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00fc  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A07(X.AnonymousClass0HD r14, X.C17770vC r15, float r16) {
        /*
            r13 = this;
            X.0AA r2 = r13.A0A
            boolean r0 = r2.A0D
            if (r0 == 0) goto L_0x0109
            long r5 = r2.A07
            long r3 = X.C05100Qk.A05
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 == 0) goto L_0x0109
            X.0uU r0 = r13.A07
            java.lang.Object r1 = r0.getValue()
            X.0HD r1 = (X.AnonymousClass0HD) r1
            java.util.List r0 = X.AnonymousClass0GD.A00
            boolean r0 = r1 instanceof X.AnonymousClass09Z
            if (r0 == 0) goto L_0x0105
            X.09Z r1 = (X.AnonymousClass09Z) r1
            int r1 = r1.A00
            r0 = 5
            if (r1 == r0) goto L_0x0026
            r0 = 3
            if (r1 != r0) goto L_0x0109
        L_0x0026:
            boolean r0 = r14 instanceof X.AnonymousClass09Z
            if (r0 == 0) goto L_0x0101
            r0 = r14
            X.09Z r0 = (X.AnonymousClass09Z) r0
            int r1 = r0.A00
            r0 = 5
            if (r1 == r0) goto L_0x0035
            r0 = 3
            if (r1 != r0) goto L_0x0109
        L_0x0035:
            r10 = 1
        L_0x0036:
            boolean r0 = r13.A06
            r7 = r15
            if (r0 != 0) goto L_0x008b
            long r0 = r13.A03
            long r5 = r15.BZL()
            long r3 = X.AnonymousClass0QG.A02
            int r3 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r3 != 0) goto L_0x008b
            X.0J0 r6 = r13.A09
            X.0tX r0 = r6.A00
            if (r0 == 0) goto L_0x00fe
            X.0WQ r0 = (X.AnonymousClass0WQ) r0
            android.graphics.Bitmap r0 = r0.A00
            android.graphics.Bitmap$Config r3 = r0.getConfig()
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ALPHA_8
            if (r3 != r0) goto L_0x0075
            r0 = 1
        L_0x005a:
            if (r10 != r0) goto L_0x008b
        L_0x005c:
            if (r14 != 0) goto L_0x006c
            X.0uU r1 = r13.A07
            java.lang.Object r0 = r1.getValue()
            if (r0 == 0) goto L_0x0072
            java.lang.Object r14 = r1.getValue()
            X.0HD r14 = (X.AnonymousClass0HD) r14
        L_0x006c:
            r0 = r16
            r6.A00(r14, r15, r0)
            return
        L_0x0072:
            X.0HD r14 = r13.A04
            goto L_0x006c
        L_0x0075:
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.RGB_565
            if (r3 == r0) goto L_0x008b
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_4444
            if (r3 == r0) goto L_0x00fe
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 26
            if (r1 < r0) goto L_0x00fe
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.RGBA_F16
            if (r3 == r0) goto L_0x008b
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.HARDWARE
            if (r3 != r0) goto L_0x00fe
        L_0x008b:
            r0 = 1
            if (r10 != r0) goto L_0x00fc
            long r0 = r2.A07
            r3 = 5
            X.09Z r2 = new X.09Z
            r2.<init>(r0, r3)
        L_0x0096:
            r13.A04 = r2
            long r0 = r15.BZL()
            float r2 = X.AnonymousClass0QG.A02(r0)
            X.0uU r3 = r13.A08
            java.lang.Object r0 = r3.getValue()
            X.0QG r0 = (X.AnonymousClass0QG) r0
            long r0 = r0.A00
            float r0 = X.AnonymousClass0QG.A02(r0)
            float r2 = r2 / r0
            r13.A00 = r2
            long r0 = r15.BZL()
            float r2 = X.AnonymousClass0QG.A00(r0)
            java.lang.Object r0 = r3.getValue()
            X.0QG r0 = (X.AnonymousClass0QG) r0
            long r0 = r0.A00
            float r0 = X.AnonymousClass0QG.A00(r0)
            float r2 = r2 / r0
            r13.A01 = r2
            X.0J0 r6 = r13.A09
            long r4 = r15.BZL()
            float r0 = X.AnonymousClass0QG.A02(r4)
            double r0 = (double) r0
            double r0 = java.lang.Math.ceil(r0)
            float r2 = (float) r0
            int r3 = (int) r2
            float r0 = X.AnonymousClass0QG.A00(r4)
            double r0 = (double) r0
            double r0 = java.lang.Math.ceil(r0)
            float r2 = (float) r0
            int r0 = (int) r2
            long r11 = X.C25293Ccv.A00(r3, r0)
            X.By4 r8 = r15.getLayoutDirection()
            X.1Di r9 = r13.A0B
            r6.A01(r7, r8, r9, r10, r11)
            r0 = 0
            r13.A06 = r0
            long r0 = r15.BZL()
            r13.A03 = r0
            goto L_0x005c
        L_0x00fc:
            r2 = 0
            goto L_0x0096
        L_0x00fe:
            r0 = 0
            goto L_0x005a
        L_0x0101:
            if (r14 != 0) goto L_0x0109
            goto L_0x0035
        L_0x0105:
            if (r1 != 0) goto L_0x0109
            goto L_0x0026
        L_0x0109:
            r10 = 0
            goto L_0x0036
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0A8.A07(X.0HD, X.0vC, float):void");
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Params: ");
        A10.append("\tname: ");
        A10.append(this.A02);
        A10.append("\n");
        A10.append("\tviewportWidth: ");
        C17330uU r2 = this.A08;
        A10.append(AnonymousClass0QG.A02(((AnonymousClass0QG) r2.getValue()).A00));
        A10.append("\n");
        A10.append("\tviewportHeight: ");
        A10.append(AnonymousClass0QG.A00(((AnonymousClass0QG) r2.getValue()).A00));
        String A0y = AnonymousClass000.A0y("\n", A10);
        C18070vi.A0X(A0y);
        return A0y;
    }

    public final void A08(C18090vk r1) {
        this.A05 = r1;
    }
}
