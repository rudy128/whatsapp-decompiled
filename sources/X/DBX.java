package X;

import android.view.Choreographer;
import android.view.Window;

public class DBX implements E7X {
    public long A00 = -1;
    public long A01 = -1;
    public boolean A02 = false;
    public final Choreographer A03;
    public final CJk A04;
    public final Choreographer.FrameCallback A05;

    public void BIb() {
        this.A02 = false;
        this.A03.removeFrameCallback(this.A05);
    }

    public void BJv(Window window) {
        if (!this.A02) {
            this.A00 = -1;
        }
        this.A02 = true;
        this.A03.postFrameCallback(this.A05);
    }

    public DBX(Choreographer choreographer, CJk cJk) {
        this.A03 = choreographer;
        this.A04 = cJk;
        this.A05 = new D4Z(choreographer, this);
    }
}
