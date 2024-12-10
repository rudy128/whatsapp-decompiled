package X;

import android.util.Pair;
import java.util.Iterator;

/* renamed from: X.BSb  reason: case insensitive filesystem */
public class C22849BSb extends C25268CcD {
    public final /* synthetic */ C26269CwE A00;

    public C22849BSb(C26269CwE cwE) {
        this.A00 = cwE;
    }

    public void A09(float f) {
        try {
            if (C26212Cuq.A04()) {
                C26212Cuq.A03("MultiplexProducer#onProgressUpdate");
            }
            C26269CwE cwE = this.A00;
            synchronized (cwE) {
                try {
                    if (cwE.A03 == this) {
                        cwE.A00 = f;
                        Iterator it = cwE.A06.iterator();
                        while (it.hasNext()) {
                            Pair pair = (Pair) it.next();
                            synchronized (pair) {
                                try {
                                    ((C25268CcD) pair.first).A05(f);
                                } catch (Throwable th) {
                                    th = th;
                                    throw th;
                                }
                            }
                        }
                    }
                } catch (Throwable th2) {
                    while (true) {
                        th = th2;
                    }
                    throw th;
                }
            }
        } finally {
            C26212Cuq.A00();
        }
    }
}
