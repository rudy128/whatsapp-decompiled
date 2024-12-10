package X;

import java.util.concurrent.CountDownLatch;

/* renamed from: X.DGq  reason: case insensitive filesystem */
public class C26859DGq implements C28563E7p {
    public final CountDownLatch A00 = BE7.A0u();
    public volatile C25627Cj7 A01;

    public void cancel() {
        C25242Cbd cbd;
        C25627Cj7 cj7 = this.A01;
        if (cj7 != null) {
            cj7.A0S = true;
            EAT eat = cj7.A09;
            if (eat != null) {
                eat.cancel();
            }
            C26015CqW cqW = cj7.A06;
            if (cqW != null) {
                cqW.A0G = true;
            }
            if (!cj7.A0C && (cbd = cj7.A05) != null) {
                cbd.A00();
            }
            this.A01 = null;
        }
    }

    public void CS0() {
        this.A00.await();
    }

    public C26859DGq(C25627Cj7 cj7) {
        this.A01 = cj7;
    }
}
