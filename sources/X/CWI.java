package X;

import com.facebook.common.time.RealtimeSinceBootClock;
import com.instagram.common.bloks.payload.BloksComponentQueryResources;

public final class CWI {
    public final E7V A00;
    public final E9K A01;
    public final DNY A02;

    public CWI(E9K e9k, DNY dny) {
        RealtimeSinceBootClock realtimeSinceBootClock = RealtimeSinceBootClock.A00;
        C18070vi.A0X(realtimeSinceBootClock);
        this.A02 = dny;
        this.A01 = e9k;
        this.A00 = realtimeSinceBootClock;
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [java.lang.Object, X.9NR] */
    public final void A00(C25187Cad cad, C24285Byi byi, BloksComponentQueryResources bloksComponentQueryResources, String str, long j) {
        long now = this.A00.now();
        DNY dny = this.A02;
        C24157BwP bwP = new C24157BwP(str, 1);
        C23727BoY boY = new C23727BoY(cad, byi, bloksComponentQueryResources, now);
        synchronized (dny.A03) {
            C20000A2o a2o = dny.A02;
            long currentTimeMillis = System.currentTimeMillis();
            ? obj = new Object();
            obj.A02 = boY;
            obj.A01 = 1000 * j;
            obj.A00 = currentTimeMillis;
            obj.A03 = false;
            a2o.A03(bwP, obj, "ASYNC_COMPONENT");
            DNY.A00(dny, a2o);
        }
    }
}
