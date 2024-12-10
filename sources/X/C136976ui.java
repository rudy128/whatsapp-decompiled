package X;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.6ui  reason: invalid class name and case insensitive filesystem */
public abstract class C136976ui {
    public final int A00;
    public final C1607289r A01;
    public final Comparator A02 = new C147027Rn(16);
    public volatile List A03;

    public void A08() {
        if (this.A03 == null) {
            synchronized (this) {
                if (this.A03 == null) {
                    this.A03 = Collections.synchronizedList(this.A01.Bd5());
                }
            }
        }
    }

    public C136976ui(C1607289r r3, int i) {
        this.A01 = r3;
        this.A00 = i;
    }

    public int A03() {
        int A08;
        A08();
        synchronized (this) {
            A08 = C108955ca.A08(this.A03, this.A00);
        }
        return A08;
    }

    public Object A04(int i) {
        Object BSD;
        A08();
        synchronized (this) {
            BSD = ((AnonymousClass8AP) this.A03.get(i)).BSD();
        }
        return BSD;
    }

    public ArrayList A05() {
        ArrayList A06;
        A08();
        synchronized (this) {
            A06 = A06(C108955ca.A08(this.A03, this.A00));
        }
        return A06;
    }

    public ArrayList A06(int i) {
        A08();
        ArrayList A13 = AnonymousClass000.A13();
        synchronized (this) {
            for (int i2 = 0; i2 < C108955ca.A08(this.A03, i); i2++) {
                A13.add(((AnonymousClass8AP) this.A03.get(i2)).BSD());
            }
        }
        return A13;
    }

    public HashMap A07() {
        HashMap A11;
        A08();
        synchronized (this) {
            A11 = C17880vN.A11();
            for (AnonymousClass8AP r0 : this.A03) {
                A11.put(r0.BSD(), Float.valueOf(r0.Bbo()));
            }
        }
        return A11;
    }

    public void A09(Object obj) {
        A08();
        synchronized (this) {
            int size = this.A03.size();
            while (true) {
                size--;
                if (size < 0) {
                    this.A01.CBh(this.A03);
                } else if (((AnonymousClass8AP) this.A03.get(size)).BFJ(obj)) {
                    A0B(size);
                }
            }
        }
    }

    public boolean A0A(Object obj) {
        boolean z;
        A08();
        synchronized (this) {
            z = false;
            for (AnonymousClass8AP r3 : this.A03) {
                float Bbo = r3.Bbo();
                if (!r3.BFJ(obj)) {
                    r3.CLT(((float) Math.round((Bbo * 0.9f) * 100.0f)) / 100.0f);
                } else {
                    r3.CLT(((float) Math.round((Bbo + 1.0f) * 100.0f)) / 100.0f);
                    z = true;
                }
            }
            if (!z) {
                A0C(this.A01.BHM(obj, 1.0f));
            }
            Collections.sort(this.A03, this.A02);
            C17960vV.A07(this.A03);
            int size = this.A03.size();
            while (true) {
                size--;
                if (size >= this.A00) {
                    A0B(size);
                } else {
                    this.A01.CBh(this.A03);
                }
            }
        }
        return z;
    }

    public void A0B(int i) {
        A08();
        synchronized (this) {
            this.A03.remove(i);
        }
    }

    public void A0C(AnonymousClass8AP r2) {
        A08();
        synchronized (this) {
            this.A03.add(r2);
        }
    }
}
