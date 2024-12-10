package X;

import java.util.Arrays;

/* renamed from: X.1zZ  reason: invalid class name and case insensitive filesystem */
public abstract class C43291zZ {
    public static long A00(C43271zX r8, boolean z) {
        long j;
        long j2 = 0;
        while (true) {
            int A00 = r8.A00();
            if (A00 == 0) {
                j = C43331zd.A00[(int) j2];
                break;
            }
            int i = (int) j2;
            int binarySearch = Arrays.binarySearch(C43301za.A00, C43311zb.A00[i], C43321zc.A00[i], A00);
            if (binarySearch >= 0) {
                j2 = C43341ze.A00[binarySearch];
                if (j2 < 0) {
                    if (z) {
                        if (r8.A00() != 0 || j2 == -1) {
                            return -1;
                        }
                    } else if (j2 == -1) {
                        return -1;
                    }
                    j = -j2;
                }
            } else if (z) {
                return -1;
            } else {
                j = C43331zd.A00[i];
            }
        }
        if (j == 57171) {
            return 9169;
        }
        return j;
    }
}
