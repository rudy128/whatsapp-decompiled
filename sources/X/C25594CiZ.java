package X;

import android.os.Handler;
import android.os.SystemClock;
import android.view.Choreographer;
import java.util.LinkedList;

/* renamed from: X.CiZ  reason: case insensitive filesystem */
public final class C25594CiZ {
    public boolean A00;
    public boolean A01;
    public final Choreographer.FrameCallback A02;
    public final Runnable A03;
    public final LinkedList A04;
    public final C18100vl A05;

    public C25594CiZ(boolean z) {
        this.A05 = AnonymousClass1DF.A01(C27894DnV.A00);
        this.A04 = AnonymousClass8BR.A14();
        C26560D4a d4a = new C26560D4a(this, 2);
        this.A02 = d4a;
        if (C26176Ctu.A03()) {
            Choreographer.getInstance().postFrameCallback(d4a);
        } else {
            ((Handler) this.A05.getValue()).postAtTime(new C27080DTf((Object) this, 36), SystemClock.uptimeMillis());
        }
        this.A03 = new C27080DTf((Object) this, 37);
    }

    public C25594CiZ() {
        this(false);
    }
}
