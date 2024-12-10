package X;

import android.view.Surface;

public class CPZ {
    public final int A00;
    public final long A01;
    public final Surface A02;

    public CPZ(Surface surface, int i, long j) {
        this.A02 = surface;
        this.A01 = j;
        this.A00 = i;
    }
}
