package X;

import java.util.Arrays;

/* renamed from: X.Csa  reason: case insensitive filesystem */
public final class C26112Csa {
    public static final C24292Byp A02 = C24292Byp.AUTO;
    public int A00 = 0;
    public float[] A01 = new float[0];

    public static void A00(C26112Csa csa, int i) {
        int i2 = csa.A00 + i;
        float[] fArr = csa.A01;
        int length = fArr.length;
        if (i2 > length) {
            int i3 = length * 2;
            if (i3 < i2) {
                i3 += i2 - i3;
            }
            csa.A01 = Arrays.copyOf(fArr, i3);
        }
    }

    public static boolean A01(float f) {
        return AnonymousClass000.A1P(Float.compare(f, Float.NaN));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0051, code lost:
        r3.append("\n");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0058, code lost:
        r3.append("%\n");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x005b, code lost:
        r4 = r4 + 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00b1, code lost:
        r3.append(r11[r4 + 1]);
        r3.append("%\n");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00c7, code lost:
        r3.append(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00ca, code lost:
        r3.append(r11[r4 + 1]);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00e1, code lost:
        r3.append(r0);
        r3.append(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00e7, code lost:
        r3.append("\n");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0106, code lost:
        r4 = r4 + 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0040, code lost:
        r3.append(r0);
        r4 = r4 + 1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String toString() {
        /*
            r17 = this;
            java.lang.StringBuilder r3 = X.AnonymousClass000.A10()
            r4 = 0
        L_0x0005:
            r12 = r17
            int r0 = r12.A00
            if (r4 >= r0) goto L_0x010a
            r0 = 32
            java.lang.Integer[] r1 = X.AnonymousClass00R.A00(r0)
            float[] r11 = r12.A01
            r0 = r11[r4]
            int r0 = (int) r0
            r0 = r1[r0]
            int r16 = r0.intValue()
            java.lang.String r15 = "  position"
            java.lang.String r14 = "  maxHeight: "
            java.lang.String r13 = "  minHeight: "
            java.lang.String r10 = "  height: "
            java.lang.String r9 = "  maxWidth: "
            java.lang.String r8 = "  minWidth: "
            java.lang.String r7 = "  width: "
            java.lang.String r0 = "  flexBasis: "
            java.lang.String r6 = "  margin"
            java.lang.String r2 = ": "
            java.lang.String r1 = "%\n"
            java.lang.String r5 = "\n"
            switch(r16) {
                case 0: goto L_0x00c2;
                case 1: goto L_0x00bf;
                case 2: goto L_0x00bc;
                case 3: goto L_0x00c7;
                case 4: goto L_0x00aa;
                case 5: goto L_0x0037;
                case 6: goto L_0x00a6;
                case 7: goto L_0x00a2;
                case 8: goto L_0x0037;
                case 9: goto L_0x009e;
                case 10: goto L_0x009a;
                case 11: goto L_0x0096;
                case 12: goto L_0x0092;
                case 13: goto L_0x008e;
                case 14: goto L_0x008a;
                case 15: goto L_0x0037;
                case 16: goto L_0x0086;
                case 17: goto L_0x0082;
                case 18: goto L_0x007e;
                case 19: goto L_0x00ae;
                case 20: goto L_0x006e;
                case 21: goto L_0x005e;
                case 22: goto L_0x00c5;
                case 23: goto L_0x00d2;
                case 24: goto L_0x004a;
                case 25: goto L_0x0046;
                case 26: goto L_0x00eb;
                case 27: goto L_0x004e;
                case 28: goto L_0x0055;
                case 29: goto L_0x003b;
                case 30: goto L_0x0038;
                case 31: goto L_0x003e;
                default: goto L_0x0037;
            }
        L_0x0037:
            goto L_0x0005
        L_0x0038:
            java.lang.String r0 = "  hasBaselineFunction: true\n"
            goto L_0x0040
        L_0x003b:
            java.lang.String r0 = "  hasMeasureFunction: true\n"
            goto L_0x0040
        L_0x003e:
            java.lang.String r0 = "  enableTextRounding: true\n"
        L_0x0040:
            r3.append(r0)
            int r4 = r4 + 1
            goto L_0x0005
        L_0x0046:
            X.C26057CrT.A03(r6, r3, r11, r4)
            goto L_0x0058
        L_0x004a:
            X.C26057CrT.A03(r6, r3, r11, r4)
            goto L_0x0051
        L_0x004e:
            X.C26057CrT.A03(r15, r3, r11, r4)
        L_0x0051:
            r3.append(r5)
            goto L_0x005b
        L_0x0055:
            X.C26057CrT.A03(r15, r3, r11, r4)
        L_0x0058:
            r3.append(r1)
        L_0x005b:
            int r4 = r4 + 3
            goto L_0x0005
        L_0x005e:
            X.Bz9[] r2 = X.C24312Bz9.values()
            float[] r1 = r12.A01
            int r0 = r4 + 1
            r0 = r1[r0]
            int r0 = (int) r0
            r1 = r2[r0]
            java.lang.String r0 = "  positionType: "
            goto L_0x00e1
        L_0x006e:
            X.Byp[] r2 = X.C24292Byp.values()
            float[] r1 = r12.A01
            int r0 = r4 + 1
            r0 = r1[r0]
            int r0 = (int) r0
            r1 = r2[r0]
            java.lang.String r0 = "  alignSelf: "
            goto L_0x00e1
        L_0x007e:
            r3.append(r14)
            goto L_0x00ca
        L_0x0082:
            r3.append(r13)
            goto L_0x00b1
        L_0x0086:
            r3.append(r13)
            goto L_0x00ca
        L_0x008a:
            r3.append(r10)
            goto L_0x00b1
        L_0x008e:
            r3.append(r10)
            goto L_0x00ca
        L_0x0092:
            r3.append(r9)
            goto L_0x00b1
        L_0x0096:
            r3.append(r9)
            goto L_0x00ca
        L_0x009a:
            r3.append(r8)
            goto L_0x00b1
        L_0x009e:
            r3.append(r8)
            goto L_0x00ca
        L_0x00a2:
            r3.append(r7)
            goto L_0x00b1
        L_0x00a6:
            r3.append(r7)
            goto L_0x00ca
        L_0x00aa:
            r3.append(r0)
            goto L_0x00b1
        L_0x00ae:
            r3.append(r14)
        L_0x00b1:
            int r0 = r4 + 1
            r0 = r11[r0]
            r3.append(r0)
            r3.append(r1)
            goto L_0x0106
        L_0x00bc:
            java.lang.String r0 = "  flexShrink: "
            goto L_0x00c7
        L_0x00bf:
            java.lang.String r0 = "  flexGrow: "
            goto L_0x00c7
        L_0x00c2:
            java.lang.String r0 = "  flex: "
            goto L_0x00c7
        L_0x00c5:
            java.lang.String r0 = "  aspectRatio: "
        L_0x00c7:
            r3.append(r0)
        L_0x00ca:
            int r0 = r4 + 1
            r0 = r11[r0]
            r3.append(r0)
            goto L_0x00e7
        L_0x00d2:
            X.Bz7[] r2 = X.C24310Bz7.values()
            float[] r1 = r12.A01
            int r0 = r4 + 1
            r0 = r1[r0]
            int r0 = (int) r0
            r1 = r2[r0]
            java.lang.String r0 = "  display: "
        L_0x00e1:
            r3.append(r0)
            r3.append(r1)
        L_0x00e7:
            r3.append(r5)
            goto L_0x0106
        L_0x00eb:
            int r0 = r4 + 1
            r0 = r11[r0]
            int r0 = (int) r0
            java.lang.Integer r0 = X.C26057CrT.A01(r0)
            r3.append(r6)
            java.lang.String r0 = X.C26057CrT.A02(r0)
            r3.append(r0)
            r3.append(r2)
            java.lang.String r0 = "auto\n"
            r3.append(r0)
        L_0x0106:
            int r4 = r4 + 2
            goto L_0x0005
        L_0x010a:
            int r0 = r3.length()
            if (r0 <= 0) goto L_0x0122
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "{\n"
            r1.append(r0)
            java.lang.String r0 = r3.toString()
            java.lang.String r0 = X.BEA.A0n(r0, r1)
            return r0
        L_0x0122:
            java.lang.String r0 = ""
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26112Csa.toString():java.lang.String");
    }
}
