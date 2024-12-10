package X;

import com.facebook.common.time.AwakeTimeSinceBootClock;
import com.facebook.commonavatarliveediting.PrefetchQueue;
import com.facebook.quicklog.QuickPerformanceLogger;
import java.lang.ref.WeakReference;

/* renamed from: X.D8a  reason: case insensitive filesystem */
public final class C26651D8a implements C28490E3u {
    public static C26651D8a A08;
    public String A00;
    public WeakReference A01;
    public C31761g5 A02;
    public boolean A03;
    public final E7V A04;
    public final PrefetchQueue A05;
    public final QuickPerformanceLogger A06;
    public final AnonymousClass2UV A07;

    public void Bm1(C33 c33) {
        C31761g5 r2;
        boolean z;
        C22821Di r0;
        E4O e4o;
        if (c33 instanceof BOC) {
            BOC boc = (BOC) c33;
            if (C18070vi.A18(boc.A01, this.A00)) {
                if (boc.A00 == AnonymousClass00R.A00) {
                    C26294Cx6.A04("PrefetchProvider", "avatar generated successfully");
                    if (this.A03) {
                        C26294Cx6.A04("PrefetchProvider", "saving avatar");
                        WeakReference weakReference = this.A01;
                        if (!(weakReference == null || (e4o = (E4O) weakReference.get()) == null)) {
                            EAU eau = ((DBR) e4o).A00;
                            if (eau == null) {
                                C18070vi.A11("aleBridge");
                                throw null;
                            }
                            eau.CGh();
                        }
                    }
                    r2 = this.A02;
                    if (r2 != null) {
                        z = AnonymousClass000.A0i();
                        r0 = C28132Drq.A00;
                    }
                    this.A02 = null;
                    this.A00 = null;
                }
                C26294Cx6.A04("PrefetchProvider", "error in avatar generation");
                r2 = this.A02;
                if (r2 != null) {
                    z = false;
                    r0 = C28133Drr.A00;
                }
                this.A02 = null;
                this.A00 = null;
                r2.CG1(r0, z);
                this.A02 = null;
                this.A00 = null;
            }
        }
    }

    public C26651D8a(QuickPerformanceLogger quickPerformanceLogger, AnonymousClass2UV r5) {
        PrefetchQueue prefetchQueue;
        this.A07 = r5;
        this.A06 = quickPerformanceLogger;
        CEY.A00 = quickPerformanceLogger;
        AwakeTimeSinceBootClock awakeTimeSinceBootClock = AwakeTimeSinceBootClock.INSTANCE;
        C18070vi.A0X(awakeTimeSinceBootClock);
        this.A04 = awakeTimeSinceBootClock;
        synchronized (PrefetchQueue.A08) {
            prefetchQueue = PrefetchQueue.A07;
            if (prefetchQueue == null) {
                prefetchQueue = new PrefetchQueue(awakeTimeSinceBootClock);
                PrefetchQueue.A07 = prefetchQueue;
            }
        }
        this.A05 = prefetchQueue;
    }
}
