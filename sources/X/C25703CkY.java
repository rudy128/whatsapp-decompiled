package X;

import java.lang.reflect.Field;
import java.util.Arrays;

/* renamed from: X.CkY  reason: case insensitive filesystem */
public final class C25703CkY {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public Class A06;
    public Object A07;
    public Object A08;
    public Object A09;
    public Field A0A;
    public int A0B;
    public int A0C = Integer.MAX_VALUE;
    public int A0D = Integer.MIN_VALUE;
    public int A0E = 0;
    public int A0F = 0;
    public int A0G = 0;
    public int A0H = 0;
    public final int A0I;
    public final int A0J;
    public final int A0K;
    public final int A0L;
    public final int A0M;
    public final int A0N;
    public final int A0O;
    public final int A0P;
    public final int A0Q;
    public final int[] A0R;
    public final Object[] A0S;
    public final C25059CVp A0T;

    public C25703CkY(Class cls, String str, Object[] objArr) {
        this.A06 = cls;
        C25059CVp cVp = new C25059CVp(str);
        this.A0T = cVp;
        this.A0S = objArr;
        this.A0I = cVp.A00();
        int A002 = cVp.A00();
        this.A0M = A002;
        int[] iArr = null;
        if (A002 != 0) {
            int A003 = cVp.A00();
            this.A0N = A003;
            int A004 = cVp.A00();
            this.A0J = cVp.A00();
            this.A0K = cVp.A00();
            this.A0P = cVp.A00();
            this.A0L = cVp.A00();
            this.A0O = cVp.A00();
            this.A0Q = cVp.A00();
            int A005 = cVp.A00();
            this.A0R = A005 != 0 ? new int[A005] : iArr;
            this.A00 = (A003 << 1) + A004;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x009b, code lost:
        if (r1 == (X.C02.A02.id + 51)) goto L_0x009d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00a1, code lost:
        if ((r12.A0I & 1) != 1) goto L_0x00af;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00a3, code lost:
        r2 = r12.A0S;
        r1 = r12.A00;
        r12.A00 = r1 + 1;
        r12.A08 = r2[r1];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0116, code lost:
        if ((r12.A02 & androidx.core.view.inputmethod.EditorInfoCompat.MEMORY_EFFICIENT_TEXT_LENGTH) != 0) goto L_0x00a3;
     */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x007d  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00b0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A01() {
        /*
            r19 = this;
            r12 = r19
            X.CVp r11 = r12.A0T
            int r1 = r11.A00
            java.lang.String r0 = r11.A01
            int r0 = r0.length()
            if (r1 >= r0) goto L_0x0146
            int r0 = r11.A00()
            r12.A01 = r0
            int r10 = r11.A00()
            r12.A02 = r10
            r9 = r10 & 255(0xff, float:3.57E-43)
            r12.A03 = r9
            int r8 = r12.A01
            int r7 = r12.A0C
            if (r8 >= r7) goto L_0x0027
            r12.A0C = r8
            r7 = r8
        L_0x0027:
            int r0 = r12.A0D
            if (r8 <= r0) goto L_0x002d
            r12.A0D = r8
        L_0x002d:
            X.C02 r6 = X.C02.A09
            int r5 = r6.id
            r4 = 1
            if (r9 != r5) goto L_0x011e
            int r0 = r12.A0E
            int r0 = r0 + 1
            r12.A0E = r0
        L_0x003a:
            int r0 = r12.A0H
            int r15 = r0 + 1
            r12.A0H = r15
            java.lang.Class r0 = X.C26297CxA.A03
            r0 = 40
            if (r8 < r0) goto L_0x0119
            long r2 = (long) r8
            long r0 = (long) r7
            long r2 = r2 - r0
            r0 = 1
            long r2 = r2 + r0
            r13 = 2
            long r0 = (long) r15
            long r17 = r0 * r13
            r15 = 3
            long r17 = r17 + r15
            long r0 = r0 + r15
            r13 = 9
            long r2 = r2 + r13
            long r0 = r0 * r15
            long r17 = r17 + r0
            int r0 = (r2 > r17 ? 1 : (r2 == r17 ? 0 : -1))
            if (r0 <= 0) goto L_0x0119
            int r0 = r12.A0G
            int r0 = r0 + 1
        L_0x0064:
            r12.A0G = r0
            r0 = r10 & 1024(0x400, float:1.435E-42)
            if (r0 == 0) goto L_0x0074
            int[] r2 = r12.A0R
            int r1 = r12.A0B
            int r0 = r1 + 1
            r12.A0B = r0
            r2[r1] = r8
        L_0x0074:
            r0 = 0
            r12.A07 = r0
            r12.A08 = r0
            r12.A09 = r0
            if (r9 <= r5) goto L_0x00b0
            int r0 = r11.A00()
            r12.A04 = r0
            int r1 = r12.A03
            X.C02 r0 = X.C02.A01
            int r0 = r0.id
            int r0 = r0 + 51
            if (r1 == r0) goto L_0x0139
            X.C02 r0 = X.C02.A03
            int r0 = r0.id
            int r0 = r0 + 51
            if (r1 == r0) goto L_0x0139
            X.C02 r0 = X.C02.A02
            int r0 = r0.id
            int r0 = r0 + 51
            if (r1 != r0) goto L_0x00af
        L_0x009d:
            int r0 = r12.A0I
            r0 = r0 & 1
            if (r0 != r4) goto L_0x00af
        L_0x00a3:
            java.lang.Object[] r2 = r12.A0S
            int r1 = r12.A00
            int r0 = r1 + 1
            r12.A00 = r0
            r0 = r2[r1]
            r12.A08 = r0
        L_0x00af:
            return r4
        L_0x00b0:
            java.lang.Class r3 = r12.A06
            java.lang.Object[] r2 = r12.A0S
            int r1 = r12.A00
            int r0 = r1 + 1
            r12.A00 = r0
            r0 = r2[r1]
            java.lang.String r0 = (java.lang.String) r0
            java.lang.reflect.Field r0 = A00(r3, r0)
            r12.A0A = r0
            int r0 = r12.A0I
            r0 = r0 & 1
            if (r0 != r4) goto L_0x00d8
            int r1 = r12.A03
            X.C02 r0 = X.C02.A03
            int r0 = r0.id
            if (r1 > r0) goto L_0x00d8
            int r0 = r11.A00()
            r12.A05 = r0
        L_0x00d8:
            int r1 = r12.A03
            X.C02 r0 = X.C02.A01
            int r0 = r0.id
            if (r1 == r0) goto L_0x0132
            X.C02 r0 = X.C02.A03
            int r0 = r0.id
            if (r1 == r0) goto L_0x0132
            X.C02 r0 = X.C02.A05
            int r0 = r0.id
            if (r1 == r0) goto L_0x0139
            X.C02 r0 = X.C02.A08
            int r0 = r0.id
            if (r1 == r0) goto L_0x0139
            X.C02 r0 = X.C02.A02
            int r0 = r0.id
            if (r1 == r0) goto L_0x009d
            X.C02 r0 = X.C02.A06
            int r0 = r0.id
            if (r1 == r0) goto L_0x009d
            X.C02 r0 = X.C02.A07
            int r0 = r0.id
            if (r1 == r0) goto L_0x009d
            int r0 = r6.id
            if (r1 != r0) goto L_0x00af
            int r1 = r12.A00
            int r0 = r1 + 1
            r12.A00 = r0
            r0 = r2[r1]
            r12.A09 = r0
            int r0 = r12.A02
            r0 = r0 & 2048(0x800, float:2.87E-42)
            if (r0 == 0) goto L_0x00af
            goto L_0x00a3
        L_0x0119:
            int r0 = r8 + 1
            int r0 = r0 - r7
            goto L_0x0064
        L_0x011e:
            X.C02 r0 = X.C02.A04
            int r0 = r0.id
            if (r9 < r0) goto L_0x003a
            X.C02 r0 = X.C02.A08
            int r0 = r0.id
            if (r9 > r0) goto L_0x003a
            int r0 = r12.A0F
            int r0 = r0 + 1
            r12.A0F = r0
            goto L_0x003a
        L_0x0132:
            java.lang.reflect.Field r0 = r12.A0A
            java.lang.Class r0 = r0.getType()
            goto L_0x0143
        L_0x0139:
            java.lang.Object[] r2 = r12.A0S
            int r1 = r12.A00
            int r0 = r1 + 1
            r12.A00 = r0
            r0 = r2[r1]
        L_0x0143:
            r12.A07 = r0
            return r4
        L_0x0146:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C25703CkY.A01():boolean");
    }

    public static Field A00(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            String name = cls.getName();
            String arrays = Arrays.toString(declaredFields);
            StringBuilder A0s = BEA.A0s(arrays, BE8.A0C(str) + 40 + BE8.A0C(name));
            BEA.A1S(A0s, str);
            A0s.append(name);
            throw BEA.A0g(" not found. Known fields are ", arrays, A0s);
        }
    }
}
