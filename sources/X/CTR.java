package X;

import android.content.Context;
import android.view.VelocityTracker;

public class CTR {
    public float A00;
    public int A01 = -1;
    public int A02 = -1;
    public int A03 = -1;
    public VelocityTracker A04;
    public final Context A05;
    public final E0E A06;
    public final int[] A07;

    public CTR(Context context, E0E e0e) {
        int[] A1W = C108945cZ.A1W();
        // fill-array-data instruction
        A1W[0] = 2147483647;
        A1W[1] = 0;
        this.A07 = A1W;
        this.A05 = context;
        this.A06 = e0e;
    }
}
