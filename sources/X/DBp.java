package X;

import android.util.SparseArray;

public final class DBp implements E96 {
    public final int A00;

    public /* synthetic */ void C6z() {
    }

    public /* synthetic */ void CCP(int i, int i2) {
    }

    public void CCQ(C28657ECr eCr, C28603E9u e9u, C129546hy r16, int i) {
        int i2 = this.A00;
        int i3 = 1;
        while (true) {
            C28657ECr eCr2 = eCr;
            int frameCount = (i + i3) % eCr.getFrameCount();
            if (C26265CwA.A00.BfN(2)) {
                C26265CwA.A01(DBp.class, Integer.valueOf(frameCount), Integer.valueOf(i), "Preparing frame %d, last drawn: %d");
            }
            int A0L = AnonymousClass000.A0L(eCr) + frameCount;
            C129546hy r9 = r16;
            SparseArray sparseArray = r9.A01;
            synchronized (sparseArray) {
                if (sparseArray.get(A0L) != null) {
                    C26265CwA.A02(C129546hy.class, Integer.valueOf(frameCount), "Already scheduled decode job for frame %d");
                } else {
                    C28603E9u e9u2 = e9u;
                    if (e9u.BFj(frameCount)) {
                        C26265CwA.A02(C129546hy.class, Integer.valueOf(frameCount), "Frame %d is cached already.");
                    } else {
                        C146707Qh r6 = new C146707Qh(eCr2, e9u2, r9, A0L, frameCount, 0);
                        sparseArray.put(A0L, r6);
                        r9.A04.execute(r6);
                    }
                }
            }
            if (i3 != i2) {
                i3++;
            } else {
                return;
            }
        }
    }

    public DBp(int i) {
        this.A00 = i;
    }

    public /* synthetic */ DRN BNP(int i, int i2, int i3) {
        return null;
    }

    public DBp() {
        this(3);
    }
}
