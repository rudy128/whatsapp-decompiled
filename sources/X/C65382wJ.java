package X;

import android.location.LocationListener;
import java.lang.ref.WeakReference;

/* renamed from: X.2wJ  reason: invalid class name and case insensitive filesystem */
public class C65382wJ implements E2E {
    public final float A00;
    public final int A01;
    public final long A02;
    public final long A03;
    public final WeakReference A04;

    public C65382wJ(LocationListener locationListener, float f, int i, long j, long j2) {
        this.A04 = new WeakReference(locationListener);
        this.A03 = j;
        this.A02 = j2;
        this.A00 = f;
        this.A01 = i;
    }
}
