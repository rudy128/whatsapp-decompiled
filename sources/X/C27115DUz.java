package X;

import java.util.Iterator;

/* renamed from: X.DUz  reason: case insensitive filesystem */
public final class C27115DUz implements Iterator {
    public int A00;
    public final int A01;
    public final /* synthetic */ DSO A02;

    public C27115DUz(DSO dso) {
        this.A02 = dso;
        this.A00 = 0;
        this.A01 = dso.A01();
    }

    public final boolean hasNext() {
        return AnonymousClass000.A1U(this.A00, this.A01);
    }

    public /* synthetic */ Object next() {
        byte b;
        int i = this.A00;
        if (i < this.A01) {
            this.A00 = i + 1;
            C23452BhH bhH = (C23452BhH) this.A02;
            if (bhH instanceof C23451BhG) {
                C23451BhG bhG = (C23451BhG) bhH;
                b = bhG.zzb[bhG.zzc + i];
            } else {
                b = bhH.zzb[i];
            }
            return Byte.valueOf(b);
        }
        throw BE6.A14();
    }

    public final void remove() {
        throw C17880vN.A0y();
    }

    public C27115DUz() {
    }
}
