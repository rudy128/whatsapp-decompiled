package X;

/* renamed from: X.Bgz  reason: case insensitive filesystem */
public final class C23434Bgz extends C23435Bh0 {
    public int A00;
    public final int A01;
    public final C23433Bgy A02;

    public final int nextIndex() {
        return this.A00;
    }

    public final int previousIndex() {
        return this.A00 - 1;
    }

    public final boolean hasNext() {
        return AnonymousClass000.A1U(this.A00, this.A01);
    }

    public final boolean hasPrevious() {
        return AnonymousClass000.A1R(this.A00);
    }

    public C23434Bgz(C23433Bgy bgy, int i) {
        int size = bgy.size();
        if (i <= size) {
            this.A01 = size;
            this.A00 = i;
            this.A02 = bgy;
            return;
        }
        throw BE6.A0l(C25875Cnj.A00(i, size, "index"));
    }

    public final Object next() {
        if (hasNext()) {
            int i = this.A00;
            this.A00 = i + 1;
            return this.A02.get(i);
        }
        throw BE6.A14();
    }

    public final Object previous() {
        if (hasPrevious()) {
            int i = this.A00 - 1;
            this.A00 = i;
            return this.A02.get(i);
        }
        throw BE6.A14();
    }
}
