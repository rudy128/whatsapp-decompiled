package X;

public final class BOW extends C26662D8l {
    public static final int A00 = Float.floatToIntBits(Float.NaN);

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000b, code lost:
        if (r2 == 805306368) goto L_0x000d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void CDB(java.nio.ByteBuffer r9) {
        /*
            r8 = this;
            X.Cm9 r0 = r8.A00
            int r2 = r0.A02
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            if (r2 == r0) goto L_0x000d
            r1 = 805306368(0x30000000, float:4.656613E-10)
            r0 = 0
            if (r2 != r1) goto L_0x000e
        L_0x000d:
            r0 = 1
        L_0x000e:
            X.C26056CrS.A03(r0)
            r0 = 805306368(0x30000000, float:4.656613E-10)
            boolean r1 = X.AnonymousClass000.A1T(r2, r0)
            int r7 = r9.position()
            int r6 = r9.limit()
            int r0 = r6 - r7
            if (r1 != 0) goto L_0x0027
            int r0 = r0 / 3
            int r0 = r0 * 4
        L_0x0027:
            java.nio.ByteBuffer r5 = r8.A02(r0)
            if (r1 == 0) goto L_0x0071
        L_0x002d:
            if (r7 >= r6) goto L_0x00ac
            byte r0 = r9.get(r7)
            r1 = r0 & 255(0xff, float:3.57E-43)
            int r0 = r7 + 1
            byte r0 = r9.get(r0)
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r0 = r0 << 8
            r1 = r1 | r0
            int r0 = r7 + 2
            byte r0 = r9.get(r0)
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r0 = r0 << 16
            r1 = r1 | r0
            int r0 = r7 + 3
            byte r0 = r9.get(r0)
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r0 = r0 << 24
            r1 = r1 | r0
            r2 = 4467570830353629184(0x3e00000000200000, double:4.656612875245797E-10)
            double r0 = (double) r1
            double r0 = r0 * r2
            float r2 = (float) r0
            int r1 = java.lang.Float.floatToIntBits(r2)
            int r0 = A00
            if (r1 != r0) goto L_0x006b
            r0 = 0
            int r1 = java.lang.Float.floatToIntBits(r0)
        L_0x006b:
            r5.putInt(r1)
            int r7 = r7 + 4
            goto L_0x002d
        L_0x0071:
            if (r7 >= r6) goto L_0x00ac
            byte r0 = r9.get(r7)
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r1 = r0 << 8
            int r0 = r7 + 1
            byte r0 = r9.get(r0)
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r0 = r0 << 16
            r1 = r1 | r0
            int r0 = r7 + 2
            byte r0 = r9.get(r0)
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r0 = r0 << 24
            r1 = r1 | r0
            r3 = 4467570830353629184(0x3e00000000200000, double:4.656612875245797E-10)
            double r1 = (double) r1
            double r1 = r1 * r3
            float r0 = (float) r1
            int r1 = java.lang.Float.floatToIntBits(r0)
            int r0 = A00
            if (r1 != r0) goto L_0x00a6
            r0 = 0
            int r1 = java.lang.Float.floatToIntBits(r0)
        L_0x00a6:
            r5.putInt(r1)
            int r7 = r7 + 3
            goto L_0x0071
        L_0x00ac:
            X.BE7.A1P(r9)
            r5.flip()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.BOW.CDB(java.nio.ByteBuffer):void");
    }
}
