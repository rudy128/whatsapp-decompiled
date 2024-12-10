package X;

import android.util.Log;
import com.facebook.android.exoplayer2.util.Util;

public final class D92 implements E8X {
    public final int A00;
    public final int A01;
    public final C26207Cui A02;

    public int BRp() {
        return this.A00;
    }

    public int BYT() {
        return this.A01;
    }

    public int CDS() {
        int i = this.A00;
        if (i == -1) {
            return this.A02.A05();
        }
        return i;
    }

    public D92(D48 d48, C22768BOh bOh) {
        C26207Cui cui = bOh.A00;
        this.A02 = cui;
        cui.A0I(12);
        int A05 = cui.A05();
        if ("audio/raw".equals(d48.A0S)) {
            int A022 = Util.A02(d48.A0B, d48.A05);
            if (A05 == 0 || A05 % A022 != 0) {
                StringBuilder A10 = AnonymousClass000.A10();
                A10.append("Audio sample size mismatch. stsd sample size: ");
                A10.append(A022);
                Log.w("AtomParsers", AnonymousClass001.A1I(", stsz sample size: ", A10, A05));
                A05 = A022;
            }
            this.A00 = A05;
            this.A01 = cui.A05();
        }
        if (A05 == 0) {
            A05 = -1;
        }
        this.A00 = A05;
        this.A01 = cui.A05();
    }
}
