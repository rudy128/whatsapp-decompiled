package X;

import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: X.68H  reason: invalid class name */
public class AnonymousClass68H extends C26461Sf {
    public final AnonymousClass1PW A00;
    public final AnonymousClass1M9 A01;
    public final C24791Lr A02;
    public final AnonymousClass11C A03;
    public final AnonymousClass118 A04;
    public final C18000vb A05;
    public final C34481kY A06;

    public AnonymousClass68H(AnonymousClass1PW r3, AnonymousClass1M9 r4, C24791Lr r5, AnonymousClass11C r6, AnonymousClass118 r7, C18000vb r8, C34481kY r9, ThreadPoolExecutor threadPoolExecutor) {
        super(new C18150vq(threadPoolExecutor, (C18140vp) null));
        this.A04 = r7;
        this.A00 = r3;
        this.A06 = r9;
        this.A01 = r4;
        this.A03 = r6;
        this.A05 = r8;
        this.A02 = r5;
    }

    public static C49302Py A01(AnonymousClass10I r9) {
        C49302Py r0 = new C49302Py((AnonymousClass10J) r9, new PriorityBlockingQueue(), new AnonymousClass10O(0, "VCardLoader"), TimeUnit.SECONDS, 1, 1, 5, false);
        r0.allowCoreThreadTimeOut(true);
        return r0;
    }

    public /* bridge */ /* synthetic */ Runnable A09(Object obj, Object obj2) {
        return new C115265tf((AnonymousClass206) obj, this);
    }

    public void A0A() {
        A06(new C145917Nc(this, 28));
        synchronized (this) {
            ((ThreadPoolExecutor) this.A00.get()).shutdown();
        }
    }
}
