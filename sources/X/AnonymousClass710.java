package X;

import android.content.Context;

/* renamed from: X.710  reason: invalid class name */
public abstract class AnonymousClass710 {
    public static final Integer[][] A00;
    public static final Integer[][] A01;

    static {
        Integer[][] numArr = new Integer[3][];
        Integer[] numArr2 = new Integer[4];
        int A1b = C72453Mb.A1b(numArr2, 2131888919);
        numArr2[1] = 2131888920;
        numArr2[2] = 2131888917;
        C17880vN.A1T(numArr2, 2131888918, 3);
        numArr[A1b] = numArr2;
        Integer[] numArr3 = new Integer[4];
        C17880vN.A1T(numArr3, 2131888915, A1b);
        C17880vN.A1T(numArr3, 2131888916, 1);
        C17880vN.A1T(numArr3, 2131888913, 2);
        C17880vN.A1T(numArr3, 2131888914, 3);
        numArr[1] = numArr3;
        Integer[] numArr4 = new Integer[4];
        C17880vN.A1T(numArr4, 2131888922, A1b);
        C17880vN.A1T(numArr4, 2131888923, 1);
        C17880vN.A1T(numArr4, 2131888921, 2);
        numArr4[3] = null;
        numArr[2] = numArr4;
        A01 = numArr;
        Integer[][] numArr5 = new Integer[3][];
        Integer[] numArr6 = new Integer[4];
        C17880vN.A1T(numArr6, 2131888952, A1b);
        C17880vN.A1T(numArr6, 2131888953, 1);
        C17880vN.A1T(numArr6, 2131888950, 2);
        C17880vN.A1T(numArr6, 2131888951, 3);
        numArr5[A1b] = numArr6;
        Integer[] numArr7 = new Integer[4];
        C17880vN.A1T(numArr7, 2131888948, A1b);
        C17880vN.A1T(numArr7, 2131888949, 1);
        C17880vN.A1T(numArr7, 2131888946, 2);
        C17880vN.A1T(numArr7, 2131888947, 3);
        numArr5[1] = numArr7;
        Integer[] numArr8 = new Integer[4];
        C17880vN.A1T(numArr8, 2131888955, A1b);
        C17880vN.A1T(numArr8, 2131888956, 1);
        C17880vN.A1T(numArr8, 2131888954, 2);
        numArr8[3] = null;
        numArr5[2] = numArr8;
        A00 = numArr5;
    }

    public static final String A00(Context context, int i, int i2) {
        String A0k;
        C18070vi.A0d(context, 0);
        if (i2 == 0) {
            A0k = context.getString(2131897143);
        } else {
            A0k = C72473Md.A0k(context.getResources(), i2, 2131755464);
        }
        C18070vi.A0b(A0k);
        return AnonymousClass001.A1H(C72473Md.A0k(context.getResources(), i, 2131755465), A0k, AnonymousClass000.A10());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002d, code lost:
        if (r0 == 3) goto L_0x002f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x004e A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x007d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.String A01(android.content.Context r11, X.AnonymousClass11P r12, X.C18000vb r13, java.lang.Long r14, java.lang.String r15, boolean r16, boolean r17) {
        /*
            r6 = 0
            boolean r5 = X.C18070vi.A17(r12, r11)
            r4 = 2
            if (r16 == 0) goto L_0x0078
            r10 = 1
        L_0x0009:
            r9 = 0
            if (r14 == 0) goto L_0x0075
            long r2 = r14.longValue()
            long r0 = java.lang.System.currentTimeMillis()
            r8 = 7
            java.lang.Integer r7 = java.lang.Integer.valueOf(r8)
            int r0 = X.A87.A00(r7, r0, r2)
            if (r0 != 0) goto L_0x0068
            java.lang.Integer r2 = X.AnonymousClass00R.A00
        L_0x0021:
            int r0 = r2.intValue()
        L_0x0025:
            r1 = 3
            if (r0 == r6) goto L_0x0066
            if (r0 == r5) goto L_0x0064
            if (r0 == r4) goto L_0x002f
            r3 = 3
            if (r0 != r1) goto L_0x0030
        L_0x002f:
            r3 = 2
        L_0x0030:
            if (r2 == 0) goto L_0x0061
            int r0 = r2.intValue()
            if (r0 == r4) goto L_0x0056
            if (r0 != r1) goto L_0x0061
            X.11Y r2 = X.AnonymousClass11X.A00
            long r0 = r14.longValue()
            java.lang.String r2 = r2.A0B(r13, r0)
        L_0x0044:
            if (r17 == 0) goto L_0x004f
            java.lang.Integer[][] r0 = A00
            r0 = r0[r10]
            r0 = r0[r3]
        L_0x004c:
            if (r0 != 0) goto L_0x007d
            return r9
        L_0x004f:
            java.lang.Integer[][] r0 = A01
            r0 = r0[r10]
            r0 = r0[r3]
            goto L_0x004c
        L_0x0056:
            X.11Y r2 = X.AnonymousClass11X.A00
            long r0 = r14.longValue()
            java.lang.String r2 = r2.A08(r13, r0)
            goto L_0x0044
        L_0x0061:
            java.lang.String r2 = ""
            goto L_0x0044
        L_0x0064:
            r3 = 1
            goto L_0x0030
        L_0x0066:
            r3 = 0
            goto L_0x0030
        L_0x0068:
            if (r0 != r5) goto L_0x006d
            java.lang.Integer r2 = X.AnonymousClass00R.A01
            goto L_0x0021
        L_0x006d:
            if (r0 >= r8) goto L_0x0072
            java.lang.Integer r2 = X.AnonymousClass00R.A0C
            goto L_0x0021
        L_0x0072:
            java.lang.Integer r2 = X.AnonymousClass00R.A0N
            goto L_0x0021
        L_0x0075:
            r2 = r9
            r0 = -1
            goto L_0x0025
        L_0x0078:
            r10 = 2
            if (r15 == 0) goto L_0x0009
            r10 = 0
            goto L_0x0009
        L_0x007d:
            if (r15 != 0) goto L_0x0080
            r15 = r2
        L_0x0080:
            int r1 = r0.intValue()
            java.lang.Object[] r0 = new java.lang.Object[r4]
            r0[r6] = r15
            java.lang.String r0 = X.AnonymousClass3Ma.A10(r11, r2, r0, r5, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass710.A01(android.content.Context, X.11P, X.0vb, java.lang.Long, java.lang.String, boolean, boolean):java.lang.String");
    }
}
