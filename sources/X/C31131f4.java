package X;

import android.os.PowerManager;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: X.1f4  reason: invalid class name and case insensitive filesystem */
public class C31131f4 implements AnonymousClass1WR, C31121f3 {
    public C145777Mo A00;
    public C441822l A01;
    public C441822l A02;
    public boolean A03;

    public synchronized C145777Mo A00() {
        return this.A00;
    }

    public C441822l A01() {
        C441822l r0;
        synchronized (this) {
            r0 = this.A02;
        }
        if (r0 != null) {
            return r0;
        }
        C145777Mo A002 = A00();
        if (A002 != null) {
            return A002.A0K;
        }
        C441822l A022 = A02();
        if (A022 == null) {
            return null;
        }
        return A022;
    }

    public synchronized C441822l A02() {
        return this.A01;
    }

    public synchronized void A07() {
        this.A01 = null;
    }

    public synchronized void A08(C145777Mo r2) {
        A09(r2, false);
    }

    public synchronized void A09(C145777Mo r2, boolean z) {
        this.A03 = z;
        this.A00 = r2;
        if (r2 != null && r2.A0o) {
            this.A01 = r2.A0K;
        }
    }

    public synchronized void A0A(boolean z) {
        this.A03 = z;
    }

    public synchronized boolean A0C() {
        return this.A03;
    }

    public /* synthetic */ void BmY(AnonymousClass206 r1, int i) {
    }

    public /* synthetic */ void BsP(AnonymousClass206 r1) {
    }

    public /* synthetic */ void Bwj(AnonymousClass1BI r1) {
    }

    public /* synthetic */ void ByG(AnonymousClass206 r1) {
    }

    public /* synthetic */ void ByH(AnonymousClass206 r1, int i) {
    }

    public /* synthetic */ void ByK(AnonymousClass206 r1, int i) {
    }

    public /* synthetic */ void ByN(AnonymousClass206 r1) {
    }

    public /* synthetic */ void ByQ(AnonymousClass206 r1, AnonymousClass206 r2) {
    }

    public /* synthetic */ void ByR(AnonymousClass206 r1) {
    }

    public /* synthetic */ void ByY(Collection collection, int i) {
        AnonymousClass2TK.A00(this, collection, i);
    }

    public /* synthetic */ void Byb(AnonymousClass1BI r1) {
    }

    public /* synthetic */ void Byc(AnonymousClass1BI r1, Collection collection, boolean z) {
    }

    public /* synthetic */ void Byd(Collection collection) {
    }

    public /* synthetic */ void Bz8(C29681ch r1) {
    }

    public /* synthetic */ void Bz9(AnonymousClass206 r1) {
    }

    public /* synthetic */ void BzA(C29681ch r1, boolean z) {
    }

    public /* synthetic */ void BzC(C29681ch r1) {
    }

    public /* synthetic */ void C0d(AnonymousClass206 r1, AnonymousClass206 r2) {
    }

    public /* synthetic */ void C0h(AnonymousClass206 r1, AnonymousClass206 r2) {
    }

    public void A03() {
        C145777Mo r2 = this.A00;
        if (r2 != null) {
            boolean z = true;
            r2.A0N = true;
            PowerManager.WakeLock wakeLock = r2.A0a;
            if (wakeLock == null || !wakeLock.isHeld()) {
                z = false;
            }
            r2.A0V = z;
            C145777Mo.A05(r2);
        }
    }

    public void A04() {
        C145777Mo r1 = this.A00;
        if (r1 != null) {
            r1.A0F(false);
        }
    }

    public void A05() {
        C145777Mo r1 = this.A00;
        if (r1 != null) {
            r1.A0N = false;
            if (r1.A0V) {
                C145777Mo.A04(r1);
            }
        }
    }

    public void A06() {
        C145777Mo r0 = this.A00;
        if (r0 != null) {
            r0.A0A();
        }
    }

    public boolean A0B() {
        C145777Mo r0 = this.A00;
        if (r0 == null || !r0.A0I()) {
            return false;
        }
        return true;
    }

    public boolean A0D(AnonymousClass206 r3) {
        C145777Mo r0 = this.A00;
        if (r0 == null || !r3.A0v.equals(r0.A0K.A0v)) {
            return false;
        }
        return true;
    }

    public void Bva(boolean z) {
        if (!z) {
            A04();
        }
    }

    public void ByZ(AnonymousClass1BI r4) {
        C441822l r0;
        AnonymousClass1BI r02;
        C145777Mo r2 = this.A00;
        if (r2 != null && (r0 = r2.A0K) != null && (r02 = r0.A0v.A00) != null && r02.equals(r4)) {
            r2.A0H(true, true);
        }
    }

    public void Bya(Collection collection, Map map) {
        if (this.A00 != null) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                if (((AnonymousClass206) it.next()).A0v.equals(this.A00.A0K.A0v)) {
                    this.A00.A0H(false, true);
                    return;
                }
            }
        }
    }

    public C31131f4(C31091f0 r3, C18030ve r4, C31111f2 r5) {
        Set set;
        if (C18020vd.A05(C18040vf.A02, r4, 1617)) {
            set = r3.A03;
        } else {
            set = r5.A01;
        }
        set.add(this);
    }
}
