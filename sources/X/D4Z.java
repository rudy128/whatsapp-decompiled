package X;

import android.view.Choreographer;

public class D4Z implements Choreographer.FrameCallback {
    public final /* synthetic */ Choreographer A00;
    public final /* synthetic */ DBX A01;

    public D4Z(Choreographer choreographer, DBX dbx) {
        this.A01 = dbx;
        this.A00 = choreographer;
    }

    public void doFrame(long j) {
        Choreographer choreographer;
        DBX dbx = this.A01;
        if (!dbx.A02) {
            dbx.A03.removeFrameCallback(this);
            return;
        }
        if (dbx.A00 == -1) {
            dbx.A00 = j;
            dbx.A01 = j;
            choreographer = dbx.A03;
        } else {
            dbx.A01 = j;
            DBU dbu = dbx.A04.A00;
            double d = dbu.A04;
            long max = Math.max(Math.round(((double) (j - dbx.A01)) / d), 1);
            long min = Math.min(max - 1, 100);
            double d2 = (double) min;
            dbu.A01 += d2;
            if (min > 4) {
                dbu.A00 += d2 / 4.0d;
            }
            dbu.A02 = (long) (((double) dbu.A02) + (d * ((double) max)));
            choreographer = this.A00;
        }
        choreographer.postFrameCallback(this);
    }
}
