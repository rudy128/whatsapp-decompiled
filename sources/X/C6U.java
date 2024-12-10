package X;

public abstract class C6U {
    public boolean A00(C25566Ci4 ci4, C25566Ci4 ci42, DMs dMs) {
        if (!(this instanceof C22729BMr)) {
            return C30561e9.A00(dMs, ci4, ci42, ((C22730BMs) this).A00);
        }
        synchronized (dMs) {
            if (dMs.listeners != ci4) {
                return false;
            }
            dMs.listeners = ci42;
            return true;
        }
    }

    public boolean A01(C25532ChU chU, C25532ChU chU2, DMs dMs) {
        if (!(this instanceof C22729BMr)) {
            return C30561e9.A00(dMs, chU, chU2, ((C22730BMs) this).A04);
        }
        synchronized (dMs) {
            if (dMs.waiters != chU) {
                return false;
            }
            dMs.waiters = chU2;
            return true;
        }
    }

    public boolean A02(DMs dMs, Object obj, Object obj2) {
        if (!(this instanceof C22729BMr)) {
            return C30561e9.A00(dMs, obj, obj2, ((C22730BMs) this).A01);
        }
        synchronized (dMs) {
            if (dMs.value != obj) {
                return false;
            }
            dMs.value = obj2;
            return true;
        }
    }
}
