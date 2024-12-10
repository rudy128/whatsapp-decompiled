package androidx.work.impl;

import X.B4S;
import X.BA2;
import X.BA3;
import X.BA4;
import X.BD8;
import X.C20076A6c;
import X.C20360AHq;
import X.C20361AHr;
import X.C20362AHs;
import X.C20363AHt;
import X.C20364AHu;
import X.C20365AHv;
import X.C20366AHw;
import X.C22400B6d;
import X.C22401B6e;

public abstract class WorkDatabase extends C20076A6c {
    public C22400B6d A09() {
        C22400B6d b6d;
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this;
        if (workDatabase_Impl.A00 != null) {
            return workDatabase_Impl.A00;
        }
        synchronized (workDatabase_Impl) {
            if (workDatabase_Impl.A00 == null) {
                workDatabase_Impl.A00 = new C20360AHq(workDatabase_Impl);
            }
            b6d = workDatabase_Impl.A00;
        }
        return b6d;
    }

    public BA2 A0A() {
        BA2 ba2;
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this;
        if (workDatabase_Impl.A01 != null) {
            return workDatabase_Impl.A01;
        }
        synchronized (workDatabase_Impl) {
            if (workDatabase_Impl.A01 == null) {
                workDatabase_Impl.A01 = new C20361AHr(workDatabase_Impl);
            }
            ba2 = workDatabase_Impl.A01;
        }
        return ba2;
    }

    public BA3 A0B() {
        BA3 ba3;
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this;
        if (workDatabase_Impl.A02 != null) {
            return workDatabase_Impl.A02;
        }
        synchronized (workDatabase_Impl) {
            if (workDatabase_Impl.A02 == null) {
                workDatabase_Impl.A02 = new C20362AHs(workDatabase_Impl);
            }
            ba3 = workDatabase_Impl.A02;
        }
        return ba3;
    }

    public B4S A0C() {
        B4S b4s;
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this;
        if (workDatabase_Impl.A03 != null) {
            return workDatabase_Impl.A03;
        }
        synchronized (workDatabase_Impl) {
            if (workDatabase_Impl.A03 == null) {
                workDatabase_Impl.A03 = new C20363AHt(workDatabase_Impl);
            }
            b4s = workDatabase_Impl.A03;
        }
        return b4s;
    }

    public C22401B6e A0D() {
        C22401B6e b6e;
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this;
        if (workDatabase_Impl.A04 != null) {
            return workDatabase_Impl.A04;
        }
        synchronized (workDatabase_Impl) {
            if (workDatabase_Impl.A04 == null) {
                workDatabase_Impl.A04 = new C20364AHu(workDatabase_Impl);
            }
            b6e = workDatabase_Impl.A04;
        }
        return b6e;
    }

    public BD8 A0E() {
        BD8 bd8;
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this;
        if (workDatabase_Impl.A05 != null) {
            return workDatabase_Impl.A05;
        }
        synchronized (workDatabase_Impl) {
            if (workDatabase_Impl.A05 == null) {
                workDatabase_Impl.A05 = new C20365AHv(workDatabase_Impl);
            }
            bd8 = workDatabase_Impl.A05;
        }
        return bd8;
    }

    public BA4 A0F() {
        BA4 ba4;
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this;
        if (workDatabase_Impl.A06 != null) {
            return workDatabase_Impl.A06;
        }
        synchronized (workDatabase_Impl) {
            if (workDatabase_Impl.A06 == null) {
                workDatabase_Impl.A06 = new C20366AHw(workDatabase_Impl);
            }
            ba4 = workDatabase_Impl.A06;
        }
        return ba4;
    }
}
