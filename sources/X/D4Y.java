package X;

import android.view.Choreographer;

public final class D4Y implements Choreographer.FrameCallback {
    public final BHV A00;

    public void doFrame(long j) {
        BHV bhv = this.A00;
        BHV.A03(bhv, j);
        bhv.invalidate();
        Choreographer.getInstance().postFrameCallback(this);
    }

    public D4Y(BHV bhv) {
        this.A00 = bhv;
    }
}
