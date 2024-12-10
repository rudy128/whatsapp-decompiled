package X;

/* renamed from: X.Ca7  reason: case insensitive filesystem */
public final class C25156Ca7 {
    public long A00 = -1;
    public final E95 A01;

    public long A01() {
        long j = this.A00;
        if (j != -1) {
            return j;
        }
        this.A00 = 0;
        E95 e95 = this.A01;
        int frameCount = e95.getFrameCount();
        for (int i = 0; i < frameCount; i++) {
            this.A00 += (long) e95.BS1(i);
        }
        return this.A00;
    }

    public C25156Ca7(E95 e95) {
        this.A01 = e95;
    }

    public int A00(long j) {
        int i;
        long A012 = A01();
        if (A012 == 0) {
            i = 0;
            long j2 = 0;
            do {
                j2 += (long) this.A01.BS1(i);
                i++;
            } while (0 >= j2);
        } else {
            E95 e95 = this.A01;
            if (e95.getLoopCount() != 0 && j / A012 >= ((long) e95.getLoopCount())) {
                return -1;
            }
            long j3 = j % A012;
            i = 0;
            long j4 = 0;
            do {
                j4 += (long) e95.BS1(i);
                i++;
            } while (j3 >= j4);
        }
        return i - 1;
    }

    public long A02(long j) {
        long A012 = A01();
        long j2 = 0;
        if (A012 != 0) {
            E95 e95 = this.A01;
            if (e95.getLoopCount() == 0 || j / A012 < ((long) e95.getLoopCount())) {
                long j3 = j % A012;
                int frameCount = e95.getFrameCount();
                for (int i = 0; i < frameCount && j2 <= j3; i++) {
                    j2 += (long) e95.BS1(i);
                }
                return j + (j2 - j3);
            }
        }
        return -1;
    }
}
