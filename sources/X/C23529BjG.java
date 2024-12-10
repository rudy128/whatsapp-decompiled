package X;

/* renamed from: X.BjG  reason: case insensitive filesystem */
public final class C23529BjG extends C23530BjH {
    public int A00;
    public final int A01;
    public final BjB A02;

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

    public C23529BjG(BjB bjB, int i) {
        int size = bjB.size();
        if (i <= size) {
            this.A01 = size;
            this.A00 = i;
            this.A02 = bjB;
            return;
        }
        throw BE6.A0l(C25877Cnm.A00(i, size, "index"));
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
