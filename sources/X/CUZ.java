package X;

import android.content.Context;
import android.graphics.Matrix;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;

public class CUZ {
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public float A04;
    public float A05;
    public float A06 = 1.0f;
    public float A07;
    public float A08 = 1.0f;
    public float A09;
    public float A0A;
    public float A0B;
    public float A0C;
    public int A0D;
    public int A0E;
    public int A0F;
    public long A0G;
    public long A0H;
    public long A0I;
    public Matrix A0J;
    public VelocityTracker A0K;
    public C28414E0f A0L;
    public boolean A0M;
    public boolean A0N;
    public boolean A0O;
    public boolean A0P;
    public boolean A0Q;
    public final int A0R;
    public final long A0S;
    public final C27087DTm A0T = new C22790BPd(this);
    public final C27087DTm A0U = new C22789BPc(this);
    public final float[] A0V = C108945cZ.A1V();

    public CUZ(Context context, C28414E0f e0f) {
        this.A0L = e0f;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.A0R = viewConfiguration.getScaledTouchSlop();
        this.A0S = (long) ViewConfiguration.getLongPressTimeout();
        this.A0E = ViewConfiguration.getDoubleTapTimeout();
        this.A0D = viewConfiguration.getScaledDoubleTapSlop();
        this.A07 = (float) viewConfiguration.getScaledMinimumFlingVelocity();
        this.A0P = context.getPackageManager().hasSystemFeature("android.hardware.touchscreen.multitouch.distinct");
    }
}
