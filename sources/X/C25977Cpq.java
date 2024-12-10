package X;

import java.util.Arrays;

/* renamed from: X.Cpq  reason: case insensitive filesystem */
public final class C25977Cpq {
    public static final C24297Byu A02 = C24297Byu.STRETCH;
    public static final C24284Byh A03 = C24284Byh.STRETCH;
    public static final C24329BzQ A04 = C24329BzQ.ROW;
    public static final C24342Bzd A05 = C24342Bzd.FLEX_START;
    public static final C24320BzH A06 = C24320BzH.NO_WRAP;
    public int A00 = 0;
    public float[] A01 = new float[0];

    public static void A00(C25977Cpq cpq, int i) {
        int i2 = cpq.A00 + i;
        float[] fArr = cpq.A01;
        int length = fArr.length;
        if (i2 > length) {
            int i3 = length * 2;
            if (i3 < i2) {
                i3 += i2 - i3;
            }
            cpq.A01 = Arrays.copyOf(fArr, i3);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00d4, code lost:
        r3.append(r0);
        r3.append(r1);
        r3.append("\n");
        r5 = r5 + 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x010d, code lost:
        r3.append("\n");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0110, code lost:
        r5 = r5 + 3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String toString() {
        /*
            r7 = this;
            java.lang.StringBuilder r3 = X.AnonymousClass000.A10()
            r5 = 0
        L_0x0005:
            int r0 = r7.A00
            if (r5 >= r0) goto L_0x0135
            r0 = 11
            java.lang.Integer[] r2 = X.AnonymousClass00R.A00(r0)
            float[] r1 = r7.A01
            r0 = r1[r5]
            int r0 = (int) r0
            r0 = r2[r0]
            int r2 = r0.intValue()
            java.lang.String r0 = "  padding"
            java.lang.String r6 = ": "
            java.lang.String r4 = "\n"
            switch(r2) {
                case 0: goto L_0x0034;
                case 1: goto L_0x004d;
                case 2: goto L_0x006b;
                case 3: goto L_0x0095;
                case 4: goto L_0x00a5;
                case 5: goto L_0x00b5;
                case 6: goto L_0x00c5;
                case 7: goto L_0x00e1;
                case 8: goto L_0x00e5;
                case 9: goto L_0x00ee;
                case 10: goto L_0x0024;
                default: goto L_0x0023;
            }
        L_0x0023:
            goto L_0x0005
        L_0x0024:
            int r0 = r5 + 1
            r1 = r1[r0]
            java.lang.String r0 = " pointScalingFactor: "
            r3.append(r0)
            r3.append(r1)
            r3.append(r4)
            goto L_0x0005
        L_0x0034:
            int r0 = r5 + 1
            r0 = r1[r0]
            int r2 = (int) r0
            if (r2 == 0) goto L_0x004a
            r0 = 1
            if (r2 == r0) goto L_0x0047
            r0 = 2
            if (r2 != r0) goto L_0x0114
            X.BzG r1 = X.C24319BzG.RTL
        L_0x0043:
            java.lang.String r0 = "  direction: "
            goto L_0x00d4
        L_0x0047:
            X.BzG r1 = X.C24319BzG.LTR
            goto L_0x0043
        L_0x004a:
            X.BzG r1 = X.C24319BzG.INHERIT
            goto L_0x0043
        L_0x004d:
            int r0 = r5 + 1
            r0 = r1[r0]
            int r2 = (int) r0
            if (r2 == 0) goto L_0x0068
            r0 = 1
            if (r2 == r0) goto L_0x0065
            r0 = 2
            if (r2 == r0) goto L_0x0062
            r0 = 3
            if (r2 != r0) goto L_0x011f
            X.BzQ r1 = X.C24329BzQ.COLUMN_REVERSE
        L_0x005f:
            java.lang.String r0 = "  flexDirection: "
            goto L_0x00d4
        L_0x0062:
            X.BzQ r1 = X.C24329BzQ.COLUMN
            goto L_0x005f
        L_0x0065:
            X.BzQ r1 = X.C24329BzQ.ROW_REVERSE
            goto L_0x005f
        L_0x0068:
            X.BzQ r1 = X.C24329BzQ.ROW
            goto L_0x005f
        L_0x006b:
            int r0 = r5 + 1
            r0 = r1[r0]
            int r2 = (int) r0
            if (r2 == 0) goto L_0x0092
            r0 = 1
            if (r2 == r0) goto L_0x008f
            r0 = 2
            if (r2 == r0) goto L_0x008c
            r0 = 3
            if (r2 == r0) goto L_0x0089
            r0 = 4
            if (r2 == r0) goto L_0x0086
            r0 = 5
            if (r2 != r0) goto L_0x012a
            X.Bzd r1 = X.C24342Bzd.SPACE_EVENLY
        L_0x0083:
            java.lang.String r0 = "  justifyContent: "
            goto L_0x00d4
        L_0x0086:
            X.Bzd r1 = X.C24342Bzd.SPACE_AROUND
            goto L_0x0083
        L_0x0089:
            X.Bzd r1 = X.C24342Bzd.SPACE_BETWEEN
            goto L_0x0083
        L_0x008c:
            X.Bzd r1 = X.C24342Bzd.FLEX_END
            goto L_0x0083
        L_0x008f:
            X.Bzd r1 = X.C24342Bzd.CENTER
            goto L_0x0083
        L_0x0092:
            X.Bzd r1 = X.C24342Bzd.FLEX_START
            goto L_0x0083
        L_0x0095:
            X.Byu[] r2 = X.C24297Byu.values()
            float[] r1 = r7.A01
            int r0 = r5 + 1
            r0 = r1[r0]
            int r0 = (int) r0
            r1 = r2[r0]
            java.lang.String r0 = "  alignContent: "
            goto L_0x00d4
        L_0x00a5:
            X.Byh[] r2 = X.C24284Byh.values()
            float[] r1 = r7.A01
            int r0 = r5 + 1
            r0 = r1[r0]
            int r0 = (int) r0
            r1 = r2[r0]
            java.lang.String r0 = "  alignItems: "
            goto L_0x00d4
        L_0x00b5:
            X.BzH[] r2 = X.C24320BzH.values()
            float[] r1 = r7.A01
            int r0 = r5 + 1
            r0 = r1[r0]
            int r0 = (int) r0
            r1 = r2[r0]
            java.lang.String r0 = "  flexWrap: "
            goto L_0x00d4
        L_0x00c5:
            X.Bz8[] r2 = X.C24311Bz8.values()
            float[] r1 = r7.A01
            int r0 = r5 + 1
            r0 = r1[r0]
            int r0 = (int) r0
            r1 = r2[r0]
            java.lang.String r0 = "  overflow: "
        L_0x00d4:
            r3.append(r0)
            r3.append(r1)
            r3.append(r4)
            int r5 = r5 + 2
            goto L_0x0005
        L_0x00e1:
            X.C26057CrT.A03(r0, r3, r1, r5)
            goto L_0x010d
        L_0x00e5:
            X.C26057CrT.A03(r0, r3, r1, r5)
            java.lang.String r0 = "%\n"
            r3.append(r0)
            goto L_0x0110
        L_0x00ee:
            int r0 = r5 + 1
            r0 = r1[r0]
            int r0 = (int) r0
            java.lang.Integer r2 = X.C26057CrT.A01(r0)
            int r0 = r5 + 2
            r1 = r1[r0]
            java.lang.String r0 = "  border"
            r3.append(r0)
            java.lang.String r0 = X.C26057CrT.A02(r2)
            r3.append(r0)
            r3.append(r6)
            r3.append(r1)
        L_0x010d:
            r3.append(r4)
        L_0x0110:
            int r5 = r5 + 3
            goto L_0x0005
        L_0x0114:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Unknown enum value: "
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A13(r0, r1, r2)
            throw r0
        L_0x011f:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Unknown enum value: "
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A13(r0, r1, r2)
            throw r0
        L_0x012a:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Unknown enum value: "
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A13(r0, r1, r2)
            throw r0
        L_0x0135:
            int r0 = r3.length()
            if (r0 <= 0) goto L_0x014d
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "{\n"
            r1.append(r0)
            java.lang.String r0 = r3.toString()
            java.lang.String r0 = X.BEA.A0n(r0, r1)
            return r0
        L_0x014d:
            java.lang.String r0 = ""
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C25977Cpq.toString():java.lang.String");
    }
}
