package X;

import android.graphics.Rect;
import android.hardware.Camera;
import java.util.List;

/* renamed from: X.Cpe  reason: case insensitive filesystem */
public abstract class C25971Cpe {
    public static final CKJ A00 = A02(11);
    public static final CKJ A01 = A02(48);
    public static final CKJ A02 = A02(55);
    public static final CKJ A03 = A02(66);
    public static final CKJ A04 = A02(49);
    public static final CKJ A05 = A02(50);
    public static final CKJ A06 = A02(51);
    public static final CKJ A07 = A02(12);
    public static final CKJ A08 = A02(47);
    public static final CKJ A09 = A02(13);
    public static final CKJ A0A = A02(46);
    public static final CKJ A0B = A02(10);
    public static final CKJ A0C = A02(37);
    public static final CKJ A0D = A02(9);
    public static final CKJ A0E = A02(30);
    public static final CKJ A0F = A02(32);
    public static final CKJ A0G = A02(31);
    public static final CKJ A0H = A02(42);
    public static final CKJ A0I = A02(27);
    public static final CKJ A0J = A02(63);
    public static final CKJ A0K = A02(64);
    public static final CKJ A0L = A02(22);
    public static final CKJ A0M = A02(6);
    public static final CKJ A0N = A02(45);
    public static final CKJ A0O = A02(53);
    public static final CKJ A0P = A02(0);
    public static final CKJ A0Q = A02(56);
    public static final CKJ A0R = A02(1);
    public static final CKJ A0S = A02(44);
    public static final CKJ A0T = A02(7);
    public static final CKJ A0U = A02(5);
    public static final CKJ A0V = A02(57);
    public static final CKJ A0W = A02(2);
    public static final CKJ A0X = A02(4);
    public static final CKJ A0Y = A02(60);
    public static final CKJ A0Z = A02(3);
    public static final CKJ A0a = A02(14);
    public static final CKJ A0b = A02(15);
    public static final CKJ A0c = A02(36);
    public static final CKJ A0d = A02(54);
    public static final CKJ A0e = A02(65);
    public static final CKJ A0f = A02(38);
    public static final CKJ A0g = A02(21);
    public static final CKJ A0h = A02(16);
    public static final CKJ A0i = A02(17);
    public static final CKJ A0j = A02(41);
    public static final CKJ A0k = A02(34);
    public static final CKJ A0l = A02(52);
    public static final CKJ A0m = A02(18);
    public static final CKJ A0n = A02(39);
    public static final CKJ A0o = A02(19);
    public static final CKJ A0p = A02(40);
    public static final CKJ A0q = A02(33);
    public static final CKJ A0r = A02(8);
    public static final CKJ A0s = A02(23);
    public static final CKJ A0t = A02(26);
    public static final CKJ A0u = A02(43);
    public static final CKJ A0v = A02(62);
    public static final CKJ A0w = A02(20);
    public static final CKJ A0x = A02(59);
    public static final CKJ A0y = A02(35);
    public static final CKJ A0z = A02(24);
    public static final CKJ A10 = A02(58);
    public static final CKJ A11 = A02(25);

    public static CKJ A02(int i) {
        return new CKJ(i);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002b, code lost:
        if (X.BEA.A09(A0s, r2) == 17) goto L_0x0042;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0040, code lost:
        if (r2.A0X.intValue() == 0) goto L_0x0042;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:227:0x01fb, code lost:
        if (r6.A0G.intValue() != 0) goto L_0x020e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:231:0x020b, code lost:
        if (X.BEA.A09(A0s, r6) == 17) goto L_0x020d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:232:0x020d, code lost:
        r5 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0046, code lost:
        return java.lang.Boolean.valueOf(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0047, code lost:
        r4 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x007e, code lost:
        return java.lang.Integer.valueOf(r1);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object A04(X.CKJ r9) {
        /*
            r8 = this;
            boolean r1 = r8 instanceof X.C22907BUs
            if (r1 == 0) goto L_0x010f
            r2 = r8
            X.BUs r2 = (X.C22907BUs) r2
            int r6 = r9.A00
            java.lang.Float r5 = X.BE7.A0W()
            r4 = 1
            r3 = 0
            switch(r6) {
                case 0: goto L_0x001d;
                case 1: goto L_0x0020;
                case 2: goto L_0x0023;
                case 3: goto L_0x002e;
                case 4: goto L_0x0031;
                case 5: goto L_0x0034;
                case 6: goto L_0x0037;
                case 7: goto L_0x003a;
                case 8: goto L_0x0049;
                case 9: goto L_0x004c;
                case 10: goto L_0x004f;
                case 11: goto L_0x0052;
                case 12: goto L_0x0055;
                case 13: goto L_0x0058;
                case 14: goto L_0x005b;
                case 15: goto L_0x005e;
                case 16: goto L_0x0061;
                case 17: goto L_0x006f;
                case 18: goto L_0x0072;
                case 19: goto L_0x0075;
                case 20: goto L_0x0078;
                case 21: goto L_0x007f;
                case 22: goto L_0x0082;
                case 23: goto L_0x0085;
                case 24: goto L_0x0088;
                case 25: goto L_0x008b;
                case 26: goto L_0x008e;
                case 27: goto L_0x0091;
                case 28: goto L_0x010e;
                case 29: goto L_0x010e;
                case 30: goto L_0x0094;
                case 31: goto L_0x0097;
                case 32: goto L_0x009a;
                case 33: goto L_0x009d;
                case 34: goto L_0x00a0;
                case 35: goto L_0x00a3;
                case 36: goto L_0x00a6;
                case 37: goto L_0x00a9;
                case 38: goto L_0x00ac;
                case 39: goto L_0x00af;
                case 40: goto L_0x00be;
                case 41: goto L_0x00c6;
                case 42: goto L_0x00ce;
                case 43: goto L_0x00d1;
                case 44: goto L_0x00d4;
                case 45: goto L_0x00d7;
                case 46: goto L_0x00da;
                case 47: goto L_0x00dd;
                case 48: goto L_0x00e0;
                case 49: goto L_0x00e3;
                case 50: goto L_0x00e6;
                case 51: goto L_0x00e9;
                case 52: goto L_0x00ec;
                case 53: goto L_0x00ee;
                case 54: goto L_0x00f1;
                case 55: goto L_0x00f4;
                case 56: goto L_0x00f7;
                case 57: goto L_0x0012;
                case 58: goto L_0x00fa;
                case 59: goto L_0x0012;
                case 60: goto L_0x00fd;
                case 61: goto L_0x0012;
                case 62: goto L_0x0100;
                case 63: goto L_0x0103;
                case 64: goto L_0x0106;
                case 65: goto L_0x0109;
                case 66: goto L_0x010c;
                default: goto L_0x0012;
            }
        L_0x0012:
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()
            java.lang.String r1 = "Invalid Settings key: "
            java.lang.RuntimeException r1 = X.BEA.A0h(r1, r2, r6)
            throw r1
        L_0x001d:
            java.lang.Boolean r5 = r2.A0A
            return r5
        L_0x0020:
            java.lang.Boolean r5 = r2.A0L
            return r5
        L_0x0023:
            X.CKJ r1 = A0s
            int r2 = X.BEA.A09(r1, r2)
            r1 = 17
            if (r2 != r1) goto L_0x0047
            goto L_0x0042
        L_0x002e:
            java.lang.Boolean r5 = r2.A0K
            return r5
        L_0x0031:
            java.lang.Boolean r5 = r2.A0H
            return r5
        L_0x0034:
            java.lang.Boolean r5 = r2.A0E
            return r5
        L_0x0037:
            java.lang.Boolean r5 = r2.A07
            return r5
        L_0x003a:
            java.lang.Integer r1 = r2.A0X
            int r1 = r1.intValue()
            if (r1 != 0) goto L_0x0047
        L_0x0042:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r4)
            return r5
        L_0x0047:
            r4 = 0
            goto L_0x0042
        L_0x0049:
            java.lang.Boolean r5 = r2.A0J
            return r5
        L_0x004c:
            java.lang.Integer r5 = r2.A0Y
            return r5
        L_0x004f:
            java.lang.Integer r5 = r2.A0X
            return r5
        L_0x0052:
            java.lang.Integer r5 = r2.A0S
            return r5
        L_0x0055:
            java.lang.Integer r5 = r2.A0U
            return r5
        L_0x0058:
            java.lang.Integer r5 = r2.A0W
            return r5
        L_0x005b:
            java.lang.Integer r5 = r2.A0a
            return r5
        L_0x005e:
            java.lang.Integer r5 = r2.A0b
            return r5
        L_0x0061:
            X.Csv r1 = r2.A03
            if (r1 != 0) goto L_0x006a
            java.lang.Integer r5 = java.lang.Integer.valueOf(r3)
            return r5
        L_0x006a:
            int r1 = X.C26132Csv.A00(r1)
            goto L_0x007a
        L_0x006f:
            java.lang.Integer r5 = r2.A0e
            return r5
        L_0x0072:
            r1 = 35
            goto L_0x007a
        L_0x0075:
            java.lang.Integer r5 = r2.A0f
            return r5
        L_0x0078:
            r1 = 30
        L_0x007a:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r1)
            return r5
        L_0x007f:
            java.lang.Integer r5 = r2.A0d
            return r5
        L_0x0082:
            java.lang.Integer r5 = r2.A0Z
            return r5
        L_0x0085:
            java.lang.Integer r5 = r2.A0g
            return r5
        L_0x0088:
            java.lang.Integer r5 = r2.A0h
            return r5
        L_0x008b:
            java.lang.Integer r5 = r2.A0i
            return r5
        L_0x008e:
            java.lang.Float r5 = r2.A0R
            return r5
        L_0x0091:
            java.lang.Long r5 = r2.A0k
            return r5
        L_0x0094:
            java.lang.Double r5 = r2.A0M
            return r5
        L_0x0097:
            java.lang.Double r5 = r2.A0O
            return r5
        L_0x009a:
            java.lang.Double r5 = r2.A0N
            return r5
        L_0x009d:
            X.Csv r5 = r2.A04
            return r5
        L_0x00a0:
            X.Csv r5 = r2.A03
            return r5
        L_0x00a3:
            X.Csv r5 = r2.A05
            return r5
        L_0x00a6:
            X.Csv r5 = r2.A02
            return r5
        L_0x00a9:
            java.util.List r5 = r2.A0o
            return r5
        L_0x00ac:
            java.util.List r5 = r2.A0p
            return r5
        L_0x00af:
            int[] r5 = X.C108945cZ.A1W()
            int[] r2 = r2.A0s
            r1 = r2[r3]
            r5[r3] = r1
            r1 = r2[r4]
            r5[r4] = r1
            return r5
        L_0x00be:
            android.graphics.Rect r1 = r2.A01
            android.graphics.Rect r5 = new android.graphics.Rect
            r5.<init>(r1)
            return r5
        L_0x00c6:
            android.graphics.Rect r1 = r2.A00
            android.graphics.Rect r5 = new android.graphics.Rect
            r5.<init>(r1)
            return r5
        L_0x00ce:
            java.lang.String r5 = r2.A0m
            return r5
        L_0x00d1:
            java.lang.String r5 = ""
            return r5
        L_0x00d4:
            java.lang.Boolean r5 = r2.A0D
            return r5
        L_0x00d7:
            java.lang.Boolean r5 = r2.A08
            return r5
        L_0x00da:
            java.lang.Long r5 = r2.A0j
            return r5
        L_0x00dd:
            java.lang.Integer r5 = r2.A0V
            return r5
        L_0x00e0:
            java.lang.Float r5 = r2.A0P
            return r5
        L_0x00e3:
            float[] r5 = r2.A0q
            return r5
        L_0x00e6:
            java.lang.Integer r5 = r2.A0T
            return r5
        L_0x00e9:
            int[] r5 = r2.A0r
            return r5
        L_0x00ec:
            r5 = 0
            return r5
        L_0x00ee:
            java.lang.Boolean r5 = r2.A09
            return r5
        L_0x00f1:
            java.lang.Float r5 = r2.A0Q
            return r5
        L_0x00f4:
            java.util.HashMap r5 = r2.A0n
            return r5
        L_0x00f7:
            java.lang.Boolean r5 = r2.A0B
            return r5
        L_0x00fa:
            X.Csv r5 = r2.A06
            return r5
        L_0x00fd:
            java.lang.Boolean r5 = r2.A0I
            return r5
        L_0x0100:
            java.lang.Long r5 = r2.A0l
            return r5
        L_0x0103:
            java.lang.Boolean r5 = r2.A0F
            return r5
        L_0x0106:
            java.lang.Boolean r5 = r2.A0G
            return r5
        L_0x0109:
            java.lang.Integer r5 = r2.A0c
            return r5
        L_0x010c:
            java.lang.Boolean r5 = r2.A0C
        L_0x010e:
            return r5
        L_0x010f:
            r6 = r8
            X.BUr r6 = (X.C22906BUr) r6
            int r3 = r9.A00
            r1 = 45
            if (r3 == r1) goto L_0x022a
            r1 = 52
            if (r3 == r1) goto L_0x0228
            r5 = 0
            r4 = 1
            switch(r3) {
                case 2: goto L_0x0201;
                case 3: goto L_0x01fe;
                case 4: goto L_0x0213;
                case 5: goto L_0x0213;
                case 6: goto L_0x0213;
                case 7: goto L_0x01e9;
                case 8: goto L_0x01e6;
                case 9: goto L_0x01e3;
                case 10: goto L_0x01e0;
                case 11: goto L_0x01dd;
                case 12: goto L_0x01da;
                case 13: goto L_0x01d7;
                case 14: goto L_0x01d4;
                case 15: goto L_0x01d1;
                case 16: goto L_0x0216;
                case 17: goto L_0x01ce;
                case 18: goto L_0x01cb;
                case 19: goto L_0x01c8;
                case 20: goto L_0x018e;
                case 21: goto L_0x018b;
                case 22: goto L_0x0188;
                case 23: goto L_0x0185;
                case 24: goto L_0x0182;
                case 25: goto L_0x017f;
                default: goto L_0x0121;
            }
        L_0x0121:
            switch(r3) {
                case 27: goto L_0x017c;
                case 28: goto L_0x0179;
                case 29: goto L_0x0176;
                case 30: goto L_0x0173;
                case 31: goto L_0x0170;
                case 32: goto L_0x016d;
                case 33: goto L_0x016a;
                case 34: goto L_0x0167;
                case 35: goto L_0x0164;
                case 36: goto L_0x0161;
                case 37: goto L_0x015e;
                case 38: goto L_0x015b;
                case 39: goto L_0x014c;
                case 40: goto L_0x0144;
                case 41: goto L_0x013c;
                case 42: goto L_0x0139;
                case 43: goto L_0x0136;
                default: goto L_0x0124;
            }
        L_0x0124:
            r0 = 57
            if (r0 == r3) goto L_0x0133
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()
            java.lang.String r1 = "Invalid Settings key: "
            java.lang.RuntimeException r1 = X.BEA.A0h(r1, r2, r3)
            throw r1
        L_0x0133:
            java.lang.Boolean r3 = r6.A07
            return r3
        L_0x0136:
            java.lang.String r3 = r6.A0c
            return r3
        L_0x0139:
            java.lang.String r3 = r6.A0T
            return r3
        L_0x013c:
            android.graphics.Rect r1 = r6.A00
            android.graphics.Rect r3 = new android.graphics.Rect
            r3.<init>(r1)
            return r3
        L_0x0144:
            android.graphics.Rect r1 = r6.A01
            android.graphics.Rect r3 = new android.graphics.Rect
            r3.<init>(r1)
            return r3
        L_0x014c:
            int[] r3 = X.C108945cZ.A1W()
            int[] r2 = r6.A0d
            r1 = r2[r5]
            r3[r5] = r1
            r1 = r2[r4]
            r3[r4] = r1
            return r3
        L_0x015b:
            java.util.List r3 = r6.A0V
            return r3
        L_0x015e:
            java.util.List r3 = r6.A0U
            return r3
        L_0x0161:
            X.Csv r3 = r6.A02
            return r3
        L_0x0164:
            X.Csv r3 = r6.A05
            return r3
        L_0x0167:
            X.Csv r3 = r6.A03
            return r3
        L_0x016a:
            X.Csv r3 = r6.A04
            return r3
        L_0x016d:
            java.lang.Double r3 = r6.A0B
            return r3
        L_0x0170:
            java.lang.Double r3 = r6.A0C
            return r3
        L_0x0173:
            java.lang.Double r3 = r6.A0A
            return r3
        L_0x0176:
            java.lang.Float r3 = r6.A0a
            return r3
        L_0x0179:
            java.lang.Float r3 = r6.A0b
            return r3
        L_0x017c:
            java.lang.Long r3 = r6.A0S
            return r3
        L_0x017f:
            java.lang.Integer r3 = r6.A0R
            return r3
        L_0x0182:
            java.lang.Integer r3 = r6.A0Q
            return r3
        L_0x0185:
            java.lang.Integer r3 = r6.A0P
            return r3
        L_0x0188:
            java.lang.Integer r3 = r6.A0I
            return r3
        L_0x018b:
            java.lang.Integer r3 = r6.A0L
            return r3
        L_0x018e:
            X.BUo r2 = r6.A0Z
            X.CKI r1 = X.C25632CjI.A0y
            java.util.List r3 = X.BE6.A11(r1, r2)
            java.lang.Integer r1 = r6.A0O
            X.C28111Yx.A02(r1)
            int r7 = r1.intValue()
            int[] r2 = r6.A0d
            android.graphics.Rect r1 = X.C26170Ctm.A00
            r6 = 0
            r5 = r2[r5]
            r4 = r2[r4]
            java.util.Iterator r3 = r3.iterator()
        L_0x01ac:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L_0x01c0
            int r2 = X.C72453Mb.A0H(r3)
            int r1 = r2 * 1000
            if (r1 < r5) goto L_0x01ac
            if (r1 > r4) goto L_0x01ac
            if (r1 <= r6) goto L_0x01ac
            r6 = r2
            goto L_0x01ac
        L_0x01c0:
            if (r6 == 0) goto L_0x01c3
            r7 = r6
        L_0x01c3:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r7)
            return r3
        L_0x01c8:
            java.lang.Integer r3 = r6.A0O
            return r3
        L_0x01cb:
            java.lang.Integer r3 = r6.A0N
            return r3
        L_0x01ce:
            java.lang.Integer r3 = r6.A0M
            return r3
        L_0x01d1:
            java.lang.Integer r3 = r6.A0K
            return r3
        L_0x01d4:
            java.lang.Integer r3 = r6.A0J
            return r3
        L_0x01d7:
            java.lang.Integer r3 = r6.A0F
            return r3
        L_0x01da:
            java.lang.Integer r3 = r6.A0E
            return r3
        L_0x01dd:
            java.lang.Integer r3 = r6.A0D
            return r3
        L_0x01e0:
            java.lang.Integer r3 = r6.A0G
            return r3
        L_0x01e3:
            java.lang.Integer r3 = r6.A0H
            return r3
        L_0x01e6:
            java.lang.Boolean r3 = r6.A09
            return r3
        L_0x01e9:
            java.lang.Integer r1 = r6.A0G
            X.C28111Yx.A02(r1)
            int r2 = r1.intValue()
            r1 = -1
            if (r2 == r1) goto L_0x020d
            java.lang.Integer r1 = r6.A0G
            int r1 = r1.intValue()
            if (r1 != 0) goto L_0x020e
            goto L_0x020d
        L_0x01fe:
            java.lang.Boolean r3 = r6.A08
            return r3
        L_0x0201:
            android.graphics.Rect r1 = X.C26170Ctm.A00
            X.CKJ r1 = A0s
            int r2 = X.BEA.A09(r1, r6)
            r1 = 17
            if (r2 != r1) goto L_0x020e
        L_0x020d:
            r5 = 1
        L_0x020e:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r5)
            return r3
        L_0x0213:
            java.lang.Boolean r3 = java.lang.Boolean.FALSE
            return r3
        L_0x0216:
            X.Csv r1 = r6.A03
            if (r1 != 0) goto L_0x021f
            java.lang.Integer r3 = java.lang.Integer.valueOf(r5)
            return r3
        L_0x021f:
            int r1 = X.C26132Csv.A00(r1)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r1)
            return r3
        L_0x0228:
            r3 = 0
            return r3
        L_0x022a:
            java.lang.Boolean r3 = r6.A06
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C25971Cpe.A04(X.CKJ):java.lang.Object");
    }

    public static String A03(List list) {
        if (list.isEmpty()) {
            return "()";
        }
        StringBuilder A0r2 = BE9.A0r();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Camera.Area area = (Camera.Area) list.get(i);
            A0r2.append('[');
            Rect rect = area.rect;
            C28111Yx.A02(rect);
            A0r2.append(rect.flattenToString());
            A0r2.append(' ');
            A0r2.append(area.weight);
            A0r2.append("] ");
        }
        return AnonymousClass001.A1J(A0r2);
    }
}
