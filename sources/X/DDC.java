package X;

import android.util.Pair;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;

public class DDC implements E4W {
    public int A00 = 0;
    public final E4W A01;
    public final ConcurrentLinkedQueue A02 = new ConcurrentLinkedQueue();
    public final Executor A03;

    public void CCn(C25268CcD ccD, ECs eCs) {
        boolean z;
        C28605E9w e9w = ((DDI) eCs).A05;
        e9w.C1r(eCs, "ThrottlingProducer");
        synchronized (this) {
            int i = this.A00;
            z = true;
            if (i >= 5) {
                this.A02.add(Pair.create(ccD, eCs));
            } else {
                this.A00 = i + 1;
                z = false;
            }
        }
        if (!z) {
            e9w.C1q(eCs, "ThrottlingProducer", (Map) null);
            this.A01.CCn(new BSX(ccD, this), eCs);
        }
    }

    public DDC(E4W e4w, Executor executor) {
        C26208Cuj.A01(executor);
        this.A03 = executor;
        C26208Cuj.A01(e4w);
        this.A01 = e4w;
    }
}
