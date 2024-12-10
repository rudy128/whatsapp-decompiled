package X;

/* renamed from: X.C6k  reason: case insensitive filesystem */
public abstract class C24492C6k {
    public void A00(C25543Chg chg, C25543Chg chg2) {
        if (this instanceof C23566Blu) {
            chg.next = chg2;
        } else {
            ((C23567Blv) this).A02.lazySet(chg, chg2);
        }
    }

    public void A01(C25543Chg chg, Thread thread) {
        if (this instanceof C23566Blu) {
            chg.thread = thread;
        } else {
            ((C23567Blv) this).A03.lazySet(chg, thread);
        }
    }

    public boolean A02(C25948CpG cpG, C25948CpG cpG2, C23570Bly bly) {
        if (!(this instanceof C23566Blu)) {
            return C30561e9.A00(bly, cpG, cpG2, ((C23567Blv) this).A00);
        }
        synchronized (bly) {
            boolean z = C23570Bly.A02;
            if (bly.listeners != cpG) {
                return false;
            }
            bly.listeners = cpG2;
            return true;
        }
    }

    public boolean A03(C25543Chg chg, C25543Chg chg2, C23570Bly bly) {
        if (!(this instanceof C23566Blu)) {
            return C30561e9.A00(bly, chg, chg2, ((C23567Blv) this).A04);
        }
        synchronized (bly) {
            boolean z = C23570Bly.A02;
            if (bly.waiters != chg) {
                return false;
            }
            bly.waiters = chg2;
            return true;
        }
    }

    public boolean A04(C23570Bly bly, Object obj) {
        if (!(this instanceof C23566Blu)) {
            return C30561e9.A00(bly, (Object) null, obj, ((C23567Blv) this).A01);
        }
        synchronized (bly) {
            boolean z = C23570Bly.A02;
            if (bly.value != null) {
                return false;
            }
            bly.value = obj;
            return true;
        }
    }
}
