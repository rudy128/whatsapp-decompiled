package X;

import android.content.Context;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.locks.ReentrantLock;

public final class D7F implements EAn {
    public static final ReentrantLock A06 = new ReentrantLock();
    public static volatile D7F A07;
    public E8S A00;
    public final Context A01;
    public final D7G A02;
    public final CMR A03;
    public final CopyOnWriteArrayList A04 = new CopyOnWriteArrayList();
    public final C18100vl A05;

    public D7F(Context context, E8S e8s) {
        this.A01 = context;
        this.A00 = e8s;
        D7G d7g = new D7G(this);
        this.A02 = d7g;
        E8S e8s2 = this.A00;
        if (e8s2 != null) {
            e8s2.CIm(d7g);
        }
        this.A03 = new CMR();
        this.A05 = AnonymousClass1DF.A01(new C27469Dfy(this));
    }
}
