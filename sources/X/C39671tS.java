package X;

import android.content.Context;
import android.view.Choreographer;
import java.util.concurrent.TimeUnit;

/* renamed from: X.1tS  reason: invalid class name and case insensitive filesystem */
public class C39671tS {
    public static final long A07 = TimeUnit.MINUTES.toNanos(1);
    public double A00;
    public double A01;
    public long A02;
    public boolean A03 = false;
    public final double A04;
    public final C39691tU A05;
    public final C39661tR A06;

    public C39671tS(Context context, C214215x r6, C39661tR r7) {
        C17960vV.A07(r7);
        this.A06 = r7;
        this.A05 = new C39691tU(Choreographer.getInstance(), new C39681tT(this));
        this.A04 = (double) r6.A00(context);
        this.A01 = 0.0d;
        this.A00 = 0.0d;
        this.A02 = 0;
    }
}
