package X;

import java.util.concurrent.CountDownLatch;

public class DBS implements C72423Lx {
    public final /* synthetic */ C24767CJj A00;
    public final /* synthetic */ C24767CJj A01;
    public final /* synthetic */ CountDownLatch A02;

    public void C25(C26048CrF crF) {
    }

    public DBS(C24767CJj cJj, C24767CJj cJj2, CountDownLatch countDownLatch) {
        this.A01 = cJj;
        this.A02 = countDownLatch;
        this.A00 = cJj2;
    }

    public void Bnn() {
        this.A02.countDown();
    }

    public void Btk(C26048CrF crF) {
        Throwable th;
        try {
            C24767CJj cJj = this.A00;
            synchronized (crF) {
                th = crF.A03;
            }
            cJj.A00 = th;
            this.A02.countDown();
        } catch (Throwable th2) {
            this.A02.countDown();
            throw th2;
        }
    }

    public void Bz5(C26048CrF crF) {
        if (crF.A07()) {
            try {
                this.A01.A00 = crF.A03();
            } finally {
                this.A02.countDown();
            }
        }
    }
}
