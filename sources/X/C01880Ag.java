package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.0Ag  reason: invalid class name and case insensitive filesystem */
public abstract class C01880Ag extends AnonymousClass0AM implements C17500ul {
    public long A00 = C79.A00();
    public C16820tH A01;
    public Map A02;
    public final C01850Ad A03;
    public final C05980Wm A04 = new C05980Wm(this);
    public final Map A05 = new LinkedHashMap();

    public boolean BfO() {
        return true;
    }

    public abstract int Bj9(int i);

    public abstract int BjC(int i);

    public abstract int Bjv(int i);

    public abstract int Bjy(int i);

    /* access modifiers changed from: private */
    public final void A01(C16820tH r3) {
        long j;
        Map map;
        if (r3 != null) {
            j = C25293Ccv.A00(r3.getWidth(), r3.getHeight());
        } else {
            j = 0;
        }
        A0Y(j);
        if (!C18070vi.A18(this.A01, r3) && r3 != null && (((map = this.A02) != null && !map.isEmpty()) || (!r3.BMp().isEmpty()))) {
            Map BMp = r3.BMp();
            if (!C18070vi.A18(BMp, this.A02)) {
                A0q().A0G.A05();
                Map map2 = this.A02;
                if (map2 == null) {
                    map2 = new LinkedHashMap();
                    this.A02 = map2;
                }
                map2.clear();
                map2.putAll(BMp);
            }
        }
        this.A01 = r3;
    }

    public final void A0Z(C22821Di r4, float f, long j) {
        if (this.A00 != j) {
            this.A00 = j;
            C01850Ad r1 = this.A03;
            AnonymousClass0AL r0 = r1.A0t().A0Q.A04;
            if (r0 != null) {
                r0.A0d();
            }
            AnonymousClass0AM.A00(r1);
        }
        if (!A0j()) {
            A0t();
        }
    }

    public C16820tH A0c() {
        C16820tH r0 = this.A01;
        if (r0 != null) {
            return r0;
        }
        throw AnonymousClass000.A0n("LookaheadDelegate has not been measured yet when measureResult is requested.");
    }

    public AnonymousClass0AM A0e() {
        C01850Ad A0w = this.A03.A0w();
        if (A0w != null) {
            return A0w.A0v();
        }
        return null;
    }

    public void A0f() {
        A0Z((C22821Di) null, 0.0f, this.A00);
    }

    public boolean A0k() {
        return AnonymousClass000.A1W(this.A01);
    }

    public final int A0l(C04280Mo r2) {
        Number number = (Number) this.A05.get(r2);
        if (number != null) {
            return number.intValue();
        }
        return Integer.MIN_VALUE;
    }

    public AnonymousClass0XV A0p() {
        return this.A03.A0t();
    }

    public AnonymousClass0AL A0q() {
        AnonymousClass0AL r0 = this.A03.A0t().A0Q.A04;
        C18070vi.A0b(r0);
        return r0;
    }

    public final void A0u(long j) {
        long j2 = this.A02;
        long A002 = C7A.A00(AnonymousClass001.A0M(j, j2), AnonymousClass001.A0L(j, j2));
        if (this.A00 != A002) {
            this.A00 = A002;
            C01850Ad r1 = this.A03;
            AnonymousClass0AL r0 = r1.A0t().A0Q.A04;
            if (r0 != null) {
                r0.A0d();
            }
            AnonymousClass0AM.A00(r1);
        }
    }

    public float BQU() {
        return this.A03.BQU();
    }

    public float BRu() {
        return this.A03.BRu();
    }

    public Object BWC() {
        return this.A03.BWC();
    }

    public C24246By4 getLayoutDirection() {
        return this.A03.getLayoutDirection();
    }

    public C01880Ag(C01850Ad r3) {
        this.A03 = r3;
    }

    public long A0b() {
        return this.A00;
    }

    public final long A0m(C01880Ag r8) {
        long A002 = C79.A00();
        C01880Ag r6 = this;
        while (!C18070vi.A18(r6, r8)) {
            long j = r6.A00;
            A002 = C7A.A00(AnonymousClass001.A0M(A002, j), AnonymousClass001.A0L(A002, j));
            C01850Ad A0x = r6.A03.A0x();
            C18070vi.A0b(A0x);
            r6 = A0x.A0v();
            C18070vi.A0b(r6);
        }
        return A002;
    }

    public C05980Wm A0n() {
        return this.A04;
    }

    public final C05980Wm A0o() {
        return this.A04;
    }

    public final C01850Ad A0r() {
        return this.A03;
    }

    public final Map A0s() {
        return this.A05;
    }

    public void A0t() {
        A0c().CBj();
    }
}
