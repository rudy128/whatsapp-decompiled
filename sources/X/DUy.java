package X;

import java.util.Iterator;

public final class DUy implements Iterator {
    public int A00;
    public final int A01;
    public final /* synthetic */ DSS A02;

    public DUy() {
    }

    public DUy(DSS dss) {
        this.A02 = dss;
        this.A00 = 0;
        this.A01 = dss.A03();
    }

    public final boolean hasNext() {
        return AnonymousClass000.A1U(this.A00, this.A01);
    }

    public final /* synthetic */ Object next() {
        byte b;
        int i = this.A00;
        if (i < this.A01) {
            this.A00 = i + 1;
            C23362Bfo bfo = (C23362Bfo) this.A02;
            if (bfo instanceof C23361Bfn) {
                C23361Bfn bfn = (C23361Bfn) bfo;
                b = bfn.zza[bfn.zzc + i];
            } else {
                b = bfo.zza[i];
            }
            return Byte.valueOf(b);
        }
        throw BE6.A14();
    }

    public final void remove() {
        throw C17880vN.A0y();
    }
}
