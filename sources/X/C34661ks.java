package X;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: X.1ks  reason: invalid class name and case insensitive filesystem */
public class C34661ks {
    public final AnonymousClass00H A00;
    public final ThreadPoolExecutor A01;

    public void A00(Runnable runnable) {
        ThreadPoolExecutor threadPoolExecutor = this.A01;
        if (threadPoolExecutor != null) {
            C18070vi.A0d(C200810t.A00(runnable), 0);
            threadPoolExecutor.execute(runnable);
            return;
        }
        ((C25581Ot) this.A00.get()).A02(runnable);
    }

    public C34661ks(C18030ve r9, AnonymousClass00H r10) {
        ThreadPoolExecutor threadPoolExecutor;
        this.A00 = r10;
        if (C18020vd.A05(C18040vf.A02, r9, 2233)) {
            threadPoolExecutor = new ThreadPoolExecutor(0, 1, 300, TimeUnit.SECONDS, new LinkedBlockingQueue(), new AnonymousClass3DO());
        } else {
            threadPoolExecutor = null;
        }
        this.A01 = threadPoolExecutor;
    }
}
