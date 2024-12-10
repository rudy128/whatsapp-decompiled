package X;

public abstract class C6S {
    public boolean A00(C25565Ci3 ci3, C25565Ci3 ci32, DMr dMr) {
        if (!(this instanceof BJJ)) {
            return C30561e9.A00(dMr, ci3, ci32, ((BJK) this).A00);
        }
        synchronized (dMr) {
            if (dMr.listeners != ci3) {
                return false;
            }
            dMr.listeners = ci32;
            return true;
        }
    }

    public boolean A01(C25531ChT chT, C25531ChT chT2, DMr dMr) {
        if (!(this instanceof BJJ)) {
            return C30561e9.A00(dMr, chT, chT2, ((BJK) this).A04);
        }
        synchronized (dMr) {
            if (dMr.waiters != chT) {
                return false;
            }
            dMr.waiters = chT2;
            return true;
        }
    }

    public boolean A02(DMr dMr, Object obj) {
        if (!(this instanceof BJJ)) {
            return C30561e9.A00(dMr, (Object) null, obj, ((BJK) this).A01);
        }
        synchronized (dMr) {
            if (dMr.value != null) {
                return false;
            }
            dMr.value = obj;
            return true;
        }
    }
}
