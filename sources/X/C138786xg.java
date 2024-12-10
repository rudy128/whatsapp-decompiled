package X;

/* renamed from: X.6xg  reason: invalid class name and case insensitive filesystem */
public final class C138786xg {
    public static final C138786xg A00 = new Object();

    /* JADX WARNING: Code restructure failed: missing block: B:45:0x012e, code lost:
        if (X.C18020vd.A05(r1, r5, 9711) != false) goto L_0x0040;
     */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0118  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0161  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C126436cj A00(android.content.Context r17, android.graphics.Bitmap r18, X.C24641Lc r19, java.lang.Integer r20, java.lang.Integer r21, java.lang.Integer r22, java.lang.Integer r23, java.lang.Integer r24, boolean r25) {
        /*
            r16 = this;
            r4 = 0
            r3 = 1
            r0 = 4
            r2 = 2
            r5 = r19
            X.C18070vi.A0d(r5, r0)
            r8 = r20
            if (r20 == 0) goto L_0x0143
            r7 = r21
            if (r21 == 0) goto L_0x0143
            int r6 = r8.intValue()
            if (r6 == 0) goto L_0x0143
            int r0 = r7.intValue()
            if (r0 == 0) goto L_0x0143
            r1 = 1058013184(0x3f100000, float:0.5625)
            if (r6 >= r0) goto L_0x0136
            float r0 = (float) r6
            float r0 = r0 / r1
            int r0 = (int) r0
            X.1D6 r0 = X.AnonymousClass1D6.A00(r8, r0)
        L_0x0028:
            int r1 = X.AnonymousClass3MZ.A04(r0)
            int r0 = X.C108955ca.A09(r0)
            android.graphics.Bitmap r8 = X.C108945cZ.A0H(r1, r0)
            android.graphics.Canvas r7 = X.C108955ca.A0E(r8)
            if (r25 == 0) goto L_0x0118
            if (r24 != 0) goto L_0x0132
            if (r22 == 0) goto L_0x0114
            if (r23 == 0) goto L_0x0114
        L_0x0040:
            java.lang.Integer r0 = X.AnonymousClass00R.A01
        L_0x0042:
            int r1 = r0.intValue()
            r11 = r18
            if (r1 == r4) goto L_0x0161
            r0 = 3
            r5 = r17
            if (r1 == r0) goto L_0x0151
            if (r1 == r3) goto L_0x008e
            X.1D6 r6 = X.AnonymousClass6XX.A00(r5, r11)
            android.graphics.drawable.GradientDrawable$Orientation r5 = android.graphics.drawable.GradientDrawable.Orientation.TOP_BOTTOM
            int[] r1 = new int[r2]
            int r0 = X.AnonymousClass3MZ.A04(r6)
            r1[r4] = r0
            int r0 = X.C108955ca.A09(r6)
            r1[r3] = r0
            android.graphics.drawable.GradientDrawable r2 = new android.graphics.drawable.GradientDrawable
            r2.<init>(r5, r1)
            r2.setDither(r3)
            int r1 = r8.getWidth()
            int r0 = r8.getHeight()
            r2.setBounds(r4, r4, r1, r0)
            r2.draw(r7)
            int r1 = X.AnonymousClass3MZ.A04(r6)
            int r0 = X.C108955ca.A09(r6)
            X.6ez r6 = new X.6ez
            r6.<init>(r1, r0)
        L_0x0088:
            X.6GI r0 = new X.6GI
            r0.<init>(r8, r6)
            return r0
        L_0x008e:
            if (r22 == 0) goto L_0x00c2
            if (r23 == 0) goto L_0x00c2
            int r1 = r22.intValue()
            int r0 = r23.intValue()
            X.6ez r6 = new X.6ez
            r6.<init>(r1, r0)
        L_0x009f:
            android.graphics.drawable.GradientDrawable$Orientation r5 = android.graphics.drawable.GradientDrawable.Orientation.TOP_BOTTOM
            int[] r1 = new int[r2]
            int r0 = r6.A01
            r1[r4] = r0
            int r0 = r6.A00
            r1[r3] = r0
            android.graphics.drawable.GradientDrawable r2 = new android.graphics.drawable.GradientDrawable
            r2.<init>(r5, r1)
            r2.setDither(r3)
            int r1 = r8.getWidth()
            int r0 = r8.getHeight()
            r2.setBounds(r4, r4, r1, r0)
            r2.draw(r7)
            goto L_0x0088
        L_0x00c2:
            r0 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            int r12 = r11.getWidth()
            int r10 = r11.getHeight()
            if (r12 == 0) goto L_0x010e
            if (r10 == 0) goto L_0x010e
            X.CYk r15 = new X.CYk
            r15.<init>(r11)
            double r5 = (double) r10
            r13 = 4596373779694328218(0x3fc999999999999a, double:0.2)
            double r0 = r5 * r13
            int r9 = (int) r0
            r15.A01(r4, r4, r12, r9)
            X.CiR r9 = r15.A00()
            X.CYk r13 = new X.CYk
            r13.<init>(r11)
            r0 = 4605380978949069210(0x3fe999999999999a, double:0.8)
            double r5 = r5 * r0
            int r0 = (int) r5
            r13.A01(r4, r0, r12, r10)
            X.CiR r6 = r13.A00()
            r5 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            X.Cmn r0 = r9.A01
            if (r0 == 0) goto L_0x0100
            int r5 = r0.A05
        L_0x0100:
            r1 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            X.Cmn r0 = r6.A01
            if (r0 == 0) goto L_0x0108
            int r1 = r0.A05
        L_0x0108:
            X.6ez r6 = new X.6ez
            r6.<init>(r5, r1)
            goto L_0x009f
        L_0x010e:
            X.6ez r6 = new X.6ez
            r6.<init>(r0, r0)
            goto L_0x009f
        L_0x0114:
            java.lang.Integer r0 = X.AnonymousClass00R.A0C
            goto L_0x0042
        L_0x0118:
            X.0ve r5 = r5.A01
            r0 = 10147(0x27a3, float:1.4219E-41)
            X.0vf r1 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r1, r5, r0)
            if (r0 == 0) goto L_0x0128
            java.lang.Integer r0 = X.AnonymousClass00R.A0N
            goto L_0x0042
        L_0x0128:
            r0 = 9711(0x25ef, float:1.3608E-41)
            boolean r0 = X.C18020vd.A05(r1, r5, r0)
            if (r0 == 0) goto L_0x0132
            goto L_0x0040
        L_0x0132:
            java.lang.Integer r0 = X.AnonymousClass00R.A00
            goto L_0x0042
        L_0x0136:
            float r0 = (float) r0
            float r0 = r0 * r1
            int r0 = (int) r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            X.1D6 r0 = X.AnonymousClass1D6.A01(r0, r7)
            goto L_0x0028
        L_0x0143:
            r0 = 720(0x2d0, float:1.009E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r0 = 1280(0x500, float:1.794E-42)
            X.1D6 r0 = X.AnonymousClass1D6.A00(r1, r0)
            goto L_0x0028
        L_0x0151:
            r0 = 2131103221(0x7f060df5, float:1.7818902E38)
            int r0 = X.C19740yt.A00(r5, r0)
            r7.drawColor(r0)
            X.6GH r0 = new X.6GH
            r0.<init>(r8)
            return r0
        L_0x0161:
            if (r24 == 0) goto L_0x0170
            int r1 = r24.intValue()
        L_0x0167:
            r7.drawColor(r1)
            X.6GJ r0 = new X.6GJ
            r0.<init>(r1, r8)
            return r0
        L_0x0170:
            X.CYk r0 = new X.CYk
            r0.<init>(r11)
            X.CiR r0 = r0.A00()
            r1 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            X.Cmn r0 = r0.A01
            if (r0 == 0) goto L_0x0167
            int r1 = r0.A05
            goto L_0x0167
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C138786xg.A00(android.content.Context, android.graphics.Bitmap, X.1Lc, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer, boolean):X.6cj");
    }
}
