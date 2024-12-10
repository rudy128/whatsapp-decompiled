package X;

import android.util.LruCache;

/* renamed from: X.BGv  reason: case insensitive filesystem */
public class C22635BGv extends LruCache {
    public final int A00;
    public final Object A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22635BGv(Object obj, int i, int i2) {
        super(i);
        this.A00 = i2;
        this.A01 = obj;
    }

    public /* bridge */ /* synthetic */ void entryRemoved(boolean z, Object obj, Object obj2, Object obj3) {
        switch (this.A00) {
            case 1:
                C26381Cyh cyh = (C26381Cyh) obj2;
                Object[] A1a = AnonymousClass3MW.A1a();
                boolean A1b = BE8.A1b(A1a, cyh.A0k);
                C25905CoJ.A02("entryRemoved, playerId=%d", A1a);
                int size = size();
                Object[] A1b2 = AnonymousClass3MW.A1b();
                AnonymousClass8BR.A1L(A1b2, A1b ? 1 : 0, z);
                C17880vN.A1T(A1b2, size, 1);
                C25905CoJ.A00(cyh, "HeroService", "removed from pool, evicted = %s, remaining size = %d", A1b2);
                synchronized (cyh) {
                    BE6.A1E(cyh, "Release player", A1b);
                    if (cyh.A14) {
                        BE6.A1E(cyh, "Player already released", A1b);
                    } else {
                        C26381Cyh.A08(cyh.A0l.obtainMessage(8), cyh);
                        cyh.A0o.C2w(z);
                    }
                }
                return;
            case 2:
                synchronized (C25395Cew.class) {
                    C25395Cew.A00.offer(obj2);
                }
                return;
            case 3:
            case 4:
                CPm cPm = (CPm) obj2;
                C25593CiY ciY = (C25593CiY) this.A01;
                if (z) {
                    C26204Cub cub = ciY.A02.A00;
                    cub.A08(new BGI(cPm, cub), cPm.A01);
                    return;
                }
                return;
            default:
                super.entryRemoved(z, obj, obj2, obj3);
                return;
        }
    }

    public /* bridge */ /* synthetic */ int sizeOf(Object obj, Object obj2) {
        if (this.A00 != 0) {
            return super.sizeOf(obj, obj2);
        }
        return ((byte[]) obj2).length;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22635BGv(Ch0 ch0) {
        super(32);
        this.A00 = 2;
        this.A01 = ch0;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22635BGv(C25593CiY ciY) {
        super(1);
        this.A00 = 4;
        this.A01 = ciY;
    }
}
