package X;

import android.os.SystemClock;
import android.util.LruCache;
import java.util.concurrent.atomic.AtomicLong;

public class CZ4 {
    public final LruCache A00;
    public final LruCache A01;
    public final C25018CTu A02;
    public final C27066DRp A03;
    public final AtomicLong A04 = new AtomicLong(SystemClock.elapsedRealtime());

    /* JADX WARNING: type inference failed for: r3v0, types: [java.lang.Object, X.EAg] */
    /* JADX WARNING: type inference failed for: r3v1, types: [java.lang.Object, X.EAg] */
    public void A01(long j, boolean z) {
        boolean z2;
        Object valueOf = Long.valueOf(j);
        C25905CoJ.A02("id [%d]: Release player", valueOf);
        if (z && j > 0 && A00(j) != null) {
            C26381Cyh A002 = A00(j);
            ? obj = new Object();
            DGM dgm = A002.A0o;
            dgm.C5I(dgm.A00.A0k);
            dgm.A01 = obj;
        }
        if (this.A03.enableBackgroundServicePlayerReuse) {
            LruCache lruCache = this.A01;
            Number number = (Number) lruCache.get(valueOf);
            if (number != null) {
                int intValue = number.intValue();
                if (intValue <= 1) {
                    this.A00.remove(valueOf);
                    lruCache.remove(valueOf);
                    z2 = true;
                    Object[] A1a = AnonymousClass8BR.A1a();
                    A1a[0] = "releasePlayer HeroServicePlayer[%d] released: %s";
                    A1a[1] = valueOf;
                    AnonymousClass8BR.A1L(A1a, 2, z2);
                    C25905CoJ.A02("HeroServicePlayerPool", A1a);
                }
                lruCache.put(valueOf, Integer.valueOf(intValue - 1));
                C26381Cyh A003 = A00(j);
                if (A003 != null) {
                    ? obj2 = new Object();
                    DGM dgm2 = A003.A0o;
                    dgm2.C5I(dgm2.A00.A0k);
                    dgm2.A01 = obj2;
                }
                z2 = false;
                Object[] A1a2 = AnonymousClass8BR.A1a();
                A1a2[0] = "releasePlayer HeroServicePlayer[%d] released: %s";
                A1a2[1] = valueOf;
                AnonymousClass8BR.A1L(A1a2, 2, z2);
                C25905CoJ.A02("HeroServicePlayerPool", A1a2);
            }
        }
        this.A00.remove(valueOf);
        z2 = true;
        Object[] A1a22 = AnonymousClass8BR.A1a();
        A1a22[0] = "releasePlayer HeroServicePlayer[%d] released: %s";
        A1a22[1] = valueOf;
        AnonymousClass8BR.A1L(A1a22, 2, z2);
        C25905CoJ.A02("HeroServicePlayerPool", A1a22);
    }

    public C26381Cyh A00(long j) {
        return (C26381Cyh) this.A00.get(Long.valueOf(j));
    }

    public CZ4(C25018CTu cTu, C27066DRp dRp) {
        this.A03 = dRp;
        this.A02 = cTu;
        int i = dRp.playerPoolSize;
        i = i <= 0 ? 1 : i;
        this.A01 = new LruCache(i);
        this.A00 = new C22635BGv(this, i, 1);
    }
}
