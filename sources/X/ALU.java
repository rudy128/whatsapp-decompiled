package X;

import android.content.Context;
import android.util.Pair;
import android.view.View;

public final class ALU implements EAQ {
    public A4J A00;
    public final Context A01;
    public final C01920By A02;
    public final String A03;

    public void CA6() {
    }

    public void BIW() {
        A4J a4j = this.A00;
        if (a4j == null) {
            C18070vi.A11("bloksSurfaceController");
            throw null;
        }
        try {
            C22414B6w b6w = a4j.A01;
            if (b6w != null) {
                C189189if r0 = a4j.A00;
                if (r0 != null) {
                    r0.A00(b6w);
                }
                a4j.A01 = null;
            }
        } finally {
            C20132A8s a8s = a4j.A02;
            if (a8s != null) {
                a8s.A0E("BloksSurfaceController_onDestroyView");
            }
        }
    }

    public View BPL(Context context) {
        boolean z;
        A4J a4j = this.A00;
        if (a4j == null) {
            C18070vi.A11("bloksSurfaceController");
            throw null;
        }
        try {
            ALM alm = a4j.A03;
            BV8 bv8 = new BV8(context);
            alm.A00 = bv8;
            C25813CmQ cmQ = alm.A01;
            if (cmQ != null) {
                z = true;
                cmQ.A03(bv8);
            } else {
                z = false;
                if (alm.A09.compareAndSet(false, true)) {
                    C182419Uh r2 = alm.A05;
                    if (r2 == null) {
                        ALM.A00(alm, 0);
                    } else {
                        ALM.A00(alm, 1);
                        ALM.A01(alm, (C166518d1) r2, 2, 3);
                    }
                }
            }
            Pair create = Pair.create(alm.A00, Boolean.valueOf(z));
            C189189if r0 = a4j.A00;
            if (r0 != null) {
                r0.A00(alm);
                ALL all = new ALL(a4j, alm);
                a4j.A01 = all;
                C189189if r1 = a4j.A00;
                synchronized (r1) {
                    r1.A00 = all;
                }
            }
            Object obj = create.first;
            if (obj != null) {
                return (View) obj;
            }
            throw C17880vN.A0g();
        } catch (Throwable th) {
            C189189if r02 = a4j.A00;
            if (r02 != null) {
                ALM alm2 = a4j.A03;
                r02.A00(alm2);
                ALL all2 = new ALL(a4j, alm2);
                a4j.A01 = all2;
                C189189if r12 = a4j.A00;
                synchronized (r12) {
                    r12.A00 = all2;
                }
            }
            throw th;
        }
    }

    public void CDn() {
        A4J a4j = this.A00;
        if (a4j == null) {
            C18070vi.A11("bloksSurfaceController");
            throw null;
        } else if (a4j.A00 != null) {
            throw AnonymousClass8BY.A0b();
        }
    }

    public void destroy() {
        A4J a4j = this.A00;
        if (a4j == null) {
            C18070vi.A11("bloksSurfaceController");
            throw null;
        }
        C189189if r1 = a4j.A00;
        if (r1 != null) {
            synchronized (r1) {
                r1.A00 = null;
            }
        }
        a4j.A00 = null;
        ALM alm = a4j.A03;
        C25813CmQ cmQ = alm.A01;
        if (cmQ != null) {
            cmQ.A01();
        }
        alm.A01 = null;
        alm.A0A.set((Object) null);
        a4j.A0A.set((Object) null);
    }

    public void stop() {
        A4J a4j = this.A00;
        if (a4j == null) {
            C18070vi.A11("bloksSurfaceController");
            throw null;
        }
        C20132A8s a8s = a4j.A02;
        if (a8s != null) {
            a8s.A0E("BloksSurfaceController_onPause");
        }
    }

    public ALU(C01920By r2, String str) {
        this.A02 = r2;
        this.A03 = str;
        this.A01 = AnonymousClass3MY.A04(r2);
    }

    public String BNW() {
        return this.A03;
    }

    public C01920By BSP() {
        return this.A02;
    }

    public View Bbb(Context context) {
        return BPL(context);
    }

    public void Bo4() {
        BIW();
    }

    public Context getContext() {
        return this.A01;
    }
}
