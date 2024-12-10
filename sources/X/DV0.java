package X;

import java.util.Iterator;

public class DV0 implements Iterator {
    public int A00;
    public final int A01;
    public final /* synthetic */ DSQ A02;

    public DV0(DSQ dsq) {
        this.A02 = dsq;
        this.A00 = 0;
        this.A01 = dsq.A02();
    }

    public boolean hasNext() {
        return AnonymousClass000.A1U(this.A00, this.A01);
    }

    public /* bridge */ /* synthetic */ Object next() {
        byte b;
        int i = this.A00;
        if (i < this.A01) {
            this.A00 = i + 1;
            C23581BmB bmB = (C23581BmB) this.A02;
            if (bmB instanceof C23580BmA) {
                C23580BmA bmA = (C23580BmA) bmB;
                b = bmA.bytes[bmA.bytesOffset + i];
            } else {
                b = bmB.bytes[i];
            }
            return Byte.valueOf(b);
        }
        throw BE6.A14();
    }

    public final void remove() {
        throw C17880vN.A0y();
    }

    public DV0() {
    }
}
