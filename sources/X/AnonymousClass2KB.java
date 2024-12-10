package X;

import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: X.2KB  reason: invalid class name */
public abstract class AnonymousClass2KB extends C26461Sf {
    public final C18030ve A00;

    /* renamed from: A0A */
    public synchronized C115295ti A04(C115295ti r15, AnonymousClass206 r16) {
        Float f;
        long j;
        C139666zF r0;
        if (this instanceof AnonymousClass2KI) {
            AnonymousClass2KI r2 = (AnonymousClass2KI) this;
            ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) r2.A00.get();
            int maximumPoolSize = threadPoolExecutor.getMaximumPoolSize();
            C18030ve r8 = r2.A02;
            C18040vf r7 = C18040vf.A02;
            if (C18020vd.A05(r7, r8, 10500)) {
                f = r2.A03.A00.BNL(1);
            } else {
                f = null;
            }
            C61832qM r12 = C61832qM.A00;
            int A02 = C24191Jf.A02(r2.A01, r2.A04);
            int A002 = AnonymousClass1SL.A00(r2.A00.A04());
            if (r15 == null || (r0 = r15.A0e) == null) {
                j = 0;
            } else {
                j = r0.A07;
            }
            boolean A003 = r12.A00(A02, A002);
            int i = 1;
            if (A003 && j > 0 && j <= 1048576 && ((f == null || f.floatValue() > 350.0f) && (i = C18020vd.A00(r7, r8, 12506)) < 1)) {
                i = 1;
            }
            if (i != maximumPoolSize) {
                threadPoolExecutor.setMaximumPoolSize(i);
            }
            if (threadPoolExecutor.getMaximumPoolSize() > 1) {
                threadPoolExecutor.setKeepAliveTime(1, TimeUnit.SECONDS);
            }
            if (r15 != null) {
                AnonymousClass70W r1 = r15.A0k;
                r1.A04 = threadPoolExecutor.getActiveCount();
                r1.A05 = threadPoolExecutor.getMaximumPoolSize();
            }
        } else {
            ThreadPoolExecutor threadPoolExecutor2 = (ThreadPoolExecutor) this.A00.get();
            int corePoolSize = threadPoolExecutor2.getCorePoolSize();
            int max = Math.max(1, Math.min(10, C18020vd.A00(C18040vf.A02, this.A00, 49)));
            if (corePoolSize != max) {
                if (max > corePoolSize) {
                    threadPoolExecutor2.setMaximumPoolSize(max);
                    threadPoolExecutor2.setCorePoolSize(max);
                } else {
                    threadPoolExecutor2.setCorePoolSize(max);
                    threadPoolExecutor2.setMaximumPoolSize(max);
                }
            }
        }
        return (C115295ti) super.A04(r16, r15);
    }

    public AnonymousClass2KB(C18030ve r1, AnonymousClass00H r2) {
        super(r2);
        this.A00 = r1;
    }
}
