package X;

import java.util.Arrays;
import java.util.List;

/* renamed from: X.1ta  reason: invalid class name and case insensitive filesystem */
public final class C39751ta {
    public static final C39751ta A00 = new Object();
    public static final List A01;
    public static final List A02;

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0022, code lost:
        if (r7 != 0) goto L_0x0024;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001a, code lost:
        if (r7 > 499) goto L_0x001c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A00(int r7, int r8) {
        /*
            r6 = this;
            r5 = 0
            if (r7 == r8) goto L_0x0024
            r0 = 1000(0x3e8, float:1.401E-42)
            if (r8 > r0) goto L_0x0024
            java.util.List r4 = A02
            java.lang.Integer r3 = java.lang.Integer.valueOf(r7)
            boolean r0 = r4.contains(r3)
            if (r0 != 0) goto L_0x0024
            r0 = 400(0x190, float:5.6E-43)
            if (r7 < r0) goto L_0x001c
            r1 = 499(0x1f3, float:6.99E-43)
            r0 = 1
            if (r7 <= r1) goto L_0x001d
        L_0x001c:
            r0 = 0
        L_0x001d:
            r2 = 1
            if (r0 != 0) goto L_0x0056
            if (r8 != r2) goto L_0x0025
            if (r7 == 0) goto L_0x0031
        L_0x0024:
            return r5
        L_0x0025:
            r0 = 100
            if (r8 != r0) goto L_0x002c
            if (r7 == r2) goto L_0x0031
            return r5
        L_0x002c:
            r0 = 145(0x91, float:2.03E-43)
            if (r7 != r0) goto L_0x0031
            return r2
        L_0x0031:
            boolean r0 = r4.contains(r3)
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0044
            java.lang.Integer r0 = java.lang.Integer.valueOf(r8)
            boolean r0 = r4.contains(r0)
            if (r0 == 0) goto L_0x0044
            return r2
        L_0x0044:
            r1 = 160(0xa0, float:2.24E-43)
            r0 = 162(0xa2, float:2.27E-43)
            if (r7 != r0) goto L_0x004d
            if (r8 != r1) goto L_0x0052
            return r2
        L_0x004d:
            if (r7 != r1) goto L_0x0052
            if (r8 != r0) goto L_0x0052
            return r2
        L_0x0052:
            if (r7 >= r8) goto L_0x0024
            r5 = 1
            return r5
        L_0x0056:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C39751ta.A00(int, int):boolean");
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.1ta, java.lang.Object] */
    static {
        List asList = Arrays.asList(new Integer[]{5, 165, 999});
        C18070vi.A0X(asList);
        A02 = asList;
        List asList2 = Arrays.asList(new Integer[]{5, 165});
        C18070vi.A0X(asList2);
        A01 = asList2;
    }
}
