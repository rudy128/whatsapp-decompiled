package X;

import java.util.Arrays;

/* renamed from: X.0IG  reason: invalid class name */
public final class AnonymousClass0IG {
    public int A00;
    public long[] A01 = new long[2];

    public final void A00(int i, long j) {
        long[] jArr = this.A01;
        int length = jArr.length;
        if (i >= length) {
            jArr = Arrays.copyOf(jArr, Math.max(i + 1, length * 2));
            C18070vi.A0X(jArr);
            this.A01 = jArr;
        }
        jArr[i] = j;
        if (i >= this.A00) {
            this.A00 = i + 1;
        }
    }
}
