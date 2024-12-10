package X;

import java.util.List;

public final class DS9 implements Comparable {
    public int A00;
    public int A01;
    public int A02;
    public BP0 A03 = new BP0();
    public List A04 = AnonymousClass000.A13();
    public boolean A05;
    public boolean A06;
    public final int A07 = System.identityHashCode(this);
    public final E9e A08;

    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.A01 - ((DS9) obj).A01;
    }

    public DS9(E9e e9e) {
        this.A08 = e9e;
    }
}
